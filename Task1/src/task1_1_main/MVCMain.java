package task1_1_main;

import task1_1_controller.Task1_1Controller;
import task1_1_model.Task1_1Model;
import task1_1_view.Task1_1View;

public class MVCMain {
    public static void main(String[] args){
        Task1_1View view = new Task1_1View();
        Task1_1Model model = new Task1_1Model();
        Task1_1Controller controller = new Task1_1Controller(model, view);

        controller.transformation();
    }
}
