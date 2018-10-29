package view;

import model.entity.Track;

public class TrackView {

    public void printList(Track[] array){
        for (Track track : array) {
            System.out.println(track);
        }
        System.out.println();
    }

    public void printMessage(String s) {
        System.out.println(s);
    }

    public void printResult(String message, double result) {
        System.out.print(message + " = ");
        System.out.println(result + "\n");
    }

    public void printMenu() {
        System.out.println(Menu.MENU + Menu.DISK_INFO + Menu.TOTAL_LENGTH + Menu.SORT_TRACKS + Menu.SEARCH_TRACKS_BY_LENGTH + Menu.FINISH);
    }
}
