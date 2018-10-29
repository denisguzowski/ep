package model.data;

import model.entity.Cover;
import model.entity.Remix;
import model.entity.Track;

public class DataSource {
    public static Track[] getTracks(){
        return new Track[]{
                new Track("Reborn", new String[]{"KIDS SEE GHOSTS"}, null, "Hip hop", 5.25, 10, true),
                new Track("Cudi Montage", new String[]{"KIDS SEE GHOSTS"}, null, "Hip hop", 3.17, 6, true),
                new Track("Neon Gravestones", new String[]{"Twenty One Pilots"}, null, "Pop", 4.00, 6.4, false),
                new Track("(Sittin' On)The Dock Of The Bay", new String[]{"Otis Redding"}, null, "Soul", 2.44, 4, false),
                new Remix("Brimful Of Asha", new String[]{"Cornershop"}, null, "unknown", 3.45, 7, false,  new String[]{"Fatboy Slim", "Norman Cook"}),
                new Remix("Rotation 112th", new String[]{"Jay Rock"}, new String[]{"Rich The Kid"}, "Rap", 4.58, 8, true,  new String[]{"Jay Rock"}),
                new Cover("Bohemian Rhapsody", new String[]{"Queen"}, null, "Rock", 3.34, 6.3, false, new String[]{"Panic! At The Disco"}),
                new Cover("In Bloom", new String[]{"Nirvana"}, null, "Rock", 3.54, 6.2, false, new String[]{"Sturgill Simpson"})
        };
    }

    public static String getName(){
        return "My Song Collection";
    }
}
