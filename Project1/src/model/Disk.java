package model;

import model.entity.Track;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Disk <T extends Track>{
    private String name;
    private String[] artists;
    private String[] genres;
    private double length;
    private double size;
    private boolean explicit;

    private T[] musicalAssembly;

    public Disk(String name) {
        this.name = name;
    }

    public T[] getMusicalAssembly() {
        return musicalAssembly;
    }

    private void setMusicalAssembly(T[] musicalAssembly) {
        this.musicalAssembly = musicalAssembly;
    }

        public double getLength() {
        return length;
    }

    public void burnDisk(T[] musicalAssembly){
        setMusicalAssembly(musicalAssembly);
        artists = listOfArtists(musicalAssembly);
        genres = listOfGenres(musicalAssembly);
        length = calcTotalLength(musicalAssembly);
        size = calcTotalSize(musicalAssembly);
        explicit = isExplicit(musicalAssembly);
    }

    private String[] listOfArtists(T[] musicalAssembly){
        List<String> artists = new ArrayList<>();

        for (T aMusicalAssembly : musicalAssembly) {
            List<String> temp = new ArrayList<>();

            if (aMusicalAssembly.getPrimaryArtist() != null) {
                temp.addAll(Arrays.asList(aMusicalAssembly.getPrimaryArtist()));
            }
            if (aMusicalAssembly.getFeaturedArtist() != null) {
                temp.addAll(Arrays.asList(aMusicalAssembly.getFeaturedArtist()));
            }

            if (!artists.containsAll(temp)) {
                artists.addAll(temp);
            } else {
                for (String aTemp : temp) {
                    if (!artists.contains(aTemp)) {
                        artists.add(aTemp);
                    }
                }
            }
        }
        return artists.toArray(new String[0]);
    }

    private String[] listOfGenres(T[] musicalAssembly){
        List<String> genrel = new ArrayList<>();

        for (T aMusicalAssembly : musicalAssembly) {
            List<String> temp = Arrays.asList(aMusicalAssembly.getGenre());

            if (!genrel.containsAll(temp)) {
                genrel.addAll(temp);
            } else {
                for (String aTemp : temp) {
                    if (!genrel.contains(aTemp)) {
                        genrel.add(aTemp);
                    }
                }
            }
        }
        return genrel.toArray(new String[0]);
    }

    private double calcTotalLength(T[] musicalAssembly){
        double sum = 0;
        for (T ma: musicalAssembly) {
            sum += ma.getLength();
        }
        return sum;
    }

    private double calcTotalSize(T[] musicalAssembly){
        double sum = 0;
        for (T ma: musicalAssembly) {
            sum += ma.getSize();
        }
        return sum;
    }

    private boolean isExplicit(T[] musicalAssembly){
        boolean result = false;
        for (T aMusicalAssembly : musicalAssembly) {
            result |= aMusicalAssembly.isExplicit();
        }
        return result;
    }

    public T[] sort(T[] musicalAssembly, Comparator<T> comparator){
        T[] temp = Arrays.copyOf(musicalAssembly, musicalAssembly.length);
        Arrays.sort(temp, comparator);
        return temp;
    }

    public T[] findTracksByLength(T[] musicalAssembly, double min, double max){
        T[] result = Arrays.copyOf(musicalAssembly, musicalAssembly.length);
        int counter = 0;

        for (T track : musicalAssembly) {
            double length = track.getLength();
            if((length >= min) && (length <= max)){
                result[counter++] = track;
            }
        }

        return Arrays.copyOf(result, counter);
    }

    private String prepareSrting(){
        StringBuilder stringBuilder = new StringBuilder();
        if(explicit){
            stringBuilder.append(",\n\texplicit");
        }
        stringBuilder.append("\n\n\tTracks: ");
        for (int i = 0; i < musicalAssembly.length; i++) {
            stringBuilder.append("\n\t").append(musicalAssembly[i]);
            if(i != musicalAssembly.length -1){
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Disk{" +
                "\n\tname = '" + name + '\'' +
                ",\n\tartists = " + Arrays.toString(artists) +
                ",\n\tgenres = " + Arrays.toString(genres) +
                ",\n\tlength = " + length + "m" +
                ",\n\tsize = " + size +  "MB" +
                prepareSrting() +
                "\n}\n" ;
    }
}
