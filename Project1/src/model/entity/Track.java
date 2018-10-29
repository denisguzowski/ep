package model.entity;

public class Track {
    private String title;
    private String[] primaryArtist;
    private String[] featuredArtist;
    private String genre;
    private double length;
    private double size;
    private boolean explicit;

    public Track(String title, String[] primaryArtist, String[] featuredArtist, String genre, double length, double size, boolean explicit) {
        this.title = title;
        this.primaryArtist = primaryArtist;
        this.featuredArtist = featuredArtist;
        this.genre = genre;
        this.length = length;
        this.size = size;
        this.explicit = explicit;
    }

    public String getTitle() {
        return title;
    }

    public String[] getPrimaryArtist() {
        return primaryArtist;
    }

    public String[] getFeaturedArtist() {
        return featuredArtist;
    }

    public String getGenre() {
        return genre;
    }

    public double getLength() {
        return length;
    }

    public double getSize() {
        return size;
    }

    public boolean isExplicit() {
        return explicit;
    }

    protected String prepareString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(title + " ");

        if(featuredArtist != null){
            stringBuilder.append("(feat. ");
            for (int i = 0; i < featuredArtist.length; i++) {
                stringBuilder.append(featuredArtist[i]);
                if(i != featuredArtist.length -1){
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append(") ");
        }

        stringBuilder.append("- ");

        if(primaryArtist != null){
            for (int i = 0; i < primaryArtist.length; i++) {
                stringBuilder.append(primaryArtist[i]);
                if(i != primaryArtist.length -1){
                    stringBuilder.append(", ");
                }
            }
        }

        if(featuredArtist != null){
            stringBuilder.append(", ");
            for (int i = 0; i < featuredArtist.length; i++) {
                stringBuilder.append(featuredArtist[i]);
                if(i != featuredArtist.length -1){
                    stringBuilder.append(", ");
                }
            }
        }

        stringBuilder.append(" [genre=").append(genre).append(", length=").append(length).append("m").append(", size=").append(size).append("MB");
        if(explicit){
            stringBuilder.append(", explicit");
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return prepareString();
    }
}
