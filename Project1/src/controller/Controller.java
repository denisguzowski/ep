package controller;

import controller.services.DiskService;
import model.entity.Track;
import view.ConstantMessages;
import view.InputUtility;
import view.TrackView;

public class Controller {
    private TrackView view = new TrackView();
    private InputUtility inputUtility = new InputUtility(view);
    private DiskService service = new DiskService();

    public void run(){
        while (true){
            view.printMenu();
            int valueItem = inputUtility.inputIntValue(0, 4);

            switch(valueItem){
                case 1:
                    view.printMessage(service.showDiskInfo());
                    break;
                case 2:
                    view.printResult(ConstantMessages.TOTAL_LENGTH, service.getLength());
                    break;
                case 3:
                    view.printMessage(ConstantMessages.SORTED_TRACKS);
                    view.printList(service.sortByGenre());
                    break;
                case 4:
                    branch4();
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }

    private void branch4(){
        view.printMessage(ConstantMessages.MIN_LENGTH);
        double min = inputUtility.inputDoubleValue(0, Double.MAX_VALUE);
        view.printMessage(ConstantMessages.MAX_LENGTH);
        double max = inputUtility.inputDoubleValue(min, Double.MAX_VALUE);
        view.printMessage(ConstantMessages.RESULT);
        hasEmptyArray(service.findTrackByLength(min, max));
    }

    private void hasEmptyArray(Track[] list) {
        if (list.length == 0) {
            view.printMessage(ConstantMessages.NO_TRACKS);
        } else {
            view.printList(list);
        }
    }
}
