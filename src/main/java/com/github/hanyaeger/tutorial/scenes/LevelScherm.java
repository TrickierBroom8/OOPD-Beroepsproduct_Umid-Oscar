package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.StaticScene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LevelScherm extends DynamicScene {
    @Override
    public void setupScene() {
//        setBackgroundAudio("audio/LevelScherm.mp3");
        setBackgroundImage("backgrounds/LevelScherm.jpg");
    }

    @Override
    public void setupEntities() {

    }
}
