package org.example.browser;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class HelloController {
    @FXML
    private VBox ssw;
    @FXML
    private TextField searce_input;

    WebView webView = new WebView();
    WebEngine engine = webView.getEngine();

    @FXML
    protected void onHelloButtonClick() {



        String  sss = searce_input.getText();

        engine.load(sss);
        ssw.getChildren().add(webView);

    }
    @FXML
    protected void ButtonClick() {



        String sss1 = "";

        engine.load(sss1);


    }
    @FXML
    protected void ButtonClickone() {



        String sss2 = searce_input.getText();
engine.load("");
        engine.load(sss2);


    }
}