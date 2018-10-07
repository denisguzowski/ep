package task1_3.main;

import task1_3.controller.Task1_3Controller;
import task1_3.model.Task1_3Model;
import task1_3.view.Task1_3View;

public class MVCMain {
    public static void main(String[] args){
        Task1_3View view = new Task1_3View();
        Task1_3Model model = new Task1_3Model();
        Task1_3Controller controller = new Task1_3Controller(model, view);

        controller.action();
    }
}
