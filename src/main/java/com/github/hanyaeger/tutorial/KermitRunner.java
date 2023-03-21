package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.tutorial.scenes.BeginScherm;
import com.github.hanyaeger.tutorial.scenes.LevelScherm;
import javafx.scene.input.MouseButton;

public class KermitRunner extends YaegerGame {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Kermit Runner");
        setSize(new Size(1440, 810));    }

    @Override
    public void setupScenes() {
        addScene(0, new BeginScherm(this));
        addScene(1, new LevelScherm());
    }
}
