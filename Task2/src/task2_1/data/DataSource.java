package task2_1.data;

import task2_1.model.entity.Book;

public class DataSource {
    private static Book[] data = {
            new Book("Post office", "Charles Bukowski", "pub7", 1971, 190, 500),
            new Book("Factotum", "Charles Bukowski", "pub2", 1975, 210, 400),
            new Book("Pro JavaFX 9", "Johan Voc", "pub3", 2010, 600, 600),
            new Book("Pro Git", "Scott Chacon", "pub4", 2010, 640, 580),
            new Book("C Programming", "K. N. King", "pub3", 2006, 800, 640),
            new Book("Bash", "Arnold Robbins", "pub5", 2007, 300, 100),
            new Book("Network flow analsis", "Michael Lucas", "pub6", 2011, 530, 530),
            new Book("Bobby Fischer Teaches Chess", "Bobby Fischer", "pub1", 1965, 400, 1000),
    };

    public static Book[] getBooks(){
        int N = 7;
        Book[] res = new Book[N];

        for (int i = 0; i < N; i++) {
            res[i] = data[generateRandomInt(0, (data.length - 1))];
        }

        return res;
    }

    private static int generateRandomInt(int min, int max){
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}
