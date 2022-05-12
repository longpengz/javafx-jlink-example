package com.longpengz.jlink;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;

/**
 * javafx集成springboot
 */
public abstract class AbstractFxApplication extends Application {

    protected static Stage stage;

    @Override
    public void init(){
        SpringApplication.run(JavafxJlinkExampleApplication.class);
    }

    @Override
    public void start(Stage stage) {
        AbstractFxApplication.stage = stage;
        load(stage);
    }

    public abstract void load(Stage stage);
}
