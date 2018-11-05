package model;

import model.entity.Record;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Journal {
    private List<Record> journal = new LinkedList<>();

    public void addRecord(Record record){
        journal.add(record);
    }

    private String prepareString(){
        StringBuilder sb = new StringBuilder();
        ListIterator<Record> it = journal.listIterator(0);
        while (it.hasNext()){
            sb.append("\n\t").append(it.next().toString());
        }

        sb.append("\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Journal: " +
                prepareString();
    }

    public int getNumberOfRecords(){
        return journal.size();
    }
}
