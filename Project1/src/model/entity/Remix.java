package model.entity;

public class Remix extends Track{
    private String[] remixAuthor;

    public Remix(String title, String[] primaryArtist, String[] featuredArtist, String genre, double length, double size, boolean explicit, String[] remixAuthor) {
        super(title, primaryArtist, featuredArtist, genre, length, size, explicit);
        this.remixAuthor = remixAuthor;
    }

    @Override
    protected String prepareString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(super.getTitle()).append(" ");

        if(super.getFeaturedArtist() != null){
            stringBuilder.append("(feat. ");
            for (int i = 0; i < super.getFeaturedArtist().length; i++) {
                stringBuilder.append(super.getFeaturedArtist()[i]);
                if(i != super.getFeaturedArtist().length -1){
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append(")");
        }

        stringBuilder.append("[");
        for (int i = 0; i < remixAuthor.length; i++) {
            stringBuilder.append(remixAuthor[i]);
            if(i != remixAuthor.length -1){
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append(" Remix]");

        stringBuilder.append(" - ");

        if(super.getPrimaryArtist() != null){
            for (int i = 0; i < super.getPrimaryArtist().length; i++) {
                stringBuilder.append(super.getPrimaryArtist()[i]);
                if(i != super.getPrimaryArtist().length -1){
                    stringBuilder.append(", ");
                }
            }
        }

        if(super.getFeaturedArtist() != null){
            stringBuilder.append(", ");
            for (int i = 0; i < super.getFeaturedArtist().length; i++) {
                stringBuilder.append(super.getFeaturedArtist()[i]);
                if(i != super.getFeaturedArtist().length -1){
                    stringBuilder.append(", ");
                }
            }
        }

        stringBuilder.append(" [genre=").append(super.getGenre()).append(", length=").append(super.getLength()).append("m").append(", size=").append(super.getSize()).append("MB");
        if(super.isExplicit()){
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
