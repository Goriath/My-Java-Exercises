package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
    @FXML
    private Button clickMeButton;

    public void initialize(){
        // Option 1
//        clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.out.println("You clicked me!");
//            }
//        });

        // Option 2 using lambda
        clickMeButton.setOnAction(actionEvent -> System.out.println("You clicked me!"));
    }

}
