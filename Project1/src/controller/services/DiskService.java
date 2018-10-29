package controller.services;

import model.Disk;
import model.data.DataSource;
import model.entity.Track;

import java.util.Comparator;

public class DiskService{
    private Disk<Track> model;

    public DiskService() {
        model = new Disk<>(DataSource.getName());
        model.burnDisk(DataSource.getTracks());
    }

    public String showDiskInfo(){
        return model.toString();
    }

    public double getLength(){
        return model.getLength();
    }

    public Track[] sortByGenre(){
        return model.sort(model.getMusicalAssembly(), new Comparator<Track>(){
            @Override
            public int compare(Track o1, Track o2) {
                return o1.getGenre().compareTo(o2.getGenre());
            }
        });
    }

    public Track[] findTrackByLength(double min, double max){
        return model.findTracksByLength(model.getMusicalAssembly(), min, max);
    }
}
