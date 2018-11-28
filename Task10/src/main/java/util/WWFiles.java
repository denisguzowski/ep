package util;

import model.data.DataSource;
import model.entity.Book;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;

public class WWFiles {

    private static final Logger logger = LogManager.getLogger(WWFiles.class);

    private static File fileName = new File("src\\main\\resources\\data.ser");

    public static Book[] load(){
        try(ObjectInput oi = new ObjectInputStream(
                new FileInputStream(fileName))) {
            return (Book[])oi.readObject();
        } catch (FileNotFoundException e) {
            logger.info("File not found!");
            logger.info("Date were loaded from DataSource");
            return DataSource.getBooks();
        } catch (IOException | ClassNotFoundException e) {
            logger.error("Error i/o");
            return new Book[0];
        }
    }

    public static void save(Book[] books){
        try(ObjectOutput oo = new ObjectOutputStream(
                new FileOutputStream(fileName))) {
            oo.writeObject(books);
        } catch (FileNotFoundException e) {
            logger.info("File not found!");
        } catch (IOException e) {
            logger.error("Error write");
        }
    }
}
