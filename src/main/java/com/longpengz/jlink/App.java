package com.longpengz.jlink;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends AbstractFxApplication {


    @Override
    public void load(Stage stage) {
        Scene scene = new Scene(new StackPane(new Text("Hello World")));
        stage.setScene(scene);
        stage.setWidth(1000);
        stage.setHeight(800);
        stage.setTitle("springboot-javafx-jlink-example");
        stage.show();
    }

    public static void run(String[] args){
        launch(args);
    }

}
