package sample;

import example.HelloWorld;
import example.HelloWorldService;
import example.SayYourProfile;
import example.SayYourProfileResponse;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.xml.ws.WebServiceRef;

public class Controller {

    @FXML
    private Label outHello;
    @FXML
    private TextField inHello;
    @FXML
    private TextField inNama;
    @FXML
    private TextField inA;
    @FXML
    private TextField inB;
    @FXML
    private Label outNama;
    @FXML
    private Label outSUM;

    @FXML
    private void actionHello(ActionEvent actionEvent) {

        HelloWorldService  helloWorldService=new HelloWorldService();
        HelloWorld helloWorld=helloWorldService.getHelloWorldPort();

        String response=helloWorld.sayHelloWorldFrom(inHello.getText().trim());
        outHello.setText(response);
    }

    @FXML
    private void actionName(ActionEvent actionEvent) {
        HelloWorldService  helloWorldService=new HelloWorldService();
        HelloWorld helloWorld=helloWorldService.getHelloWorldPort();

        String response=helloWorld.sayYourProfile(inHello.getText().trim());
        outNama.setText(response);
    }

    @FXML
    private void actionSUM(ActionEvent actionEvent) {
        HelloWorldService  helloWorldService=new HelloWorldService();
        HelloWorld helloWorld=helloWorldService.getHelloWorldPort();

        String response=helloWorld.sum(inA.getText().trim(),inB.getText().trim());
        outSUM.setText(response);
    }
}
