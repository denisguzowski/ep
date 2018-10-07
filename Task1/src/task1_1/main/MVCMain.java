package task1_1.main;

import task1_1.controller.Task1_1Controller;
import task1_1.model.Task1_1Model;
import task1_1.view.Task1_1View;

public class MVCMain {
    public static void main(String[] args){
        Task1_1View view = new Task1_1View();
        Task1_1Model model = new Task1_1Model();
        Task1_1Controller controller = new Task1_1Controller(model, view);

        controller.transformation();
    }
}
