package com.github.hanyaeger.beroepsproduct.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.beroepsproduct.KermitRunner;
import com.github.hanyaeger.beroepsproduct.VolgendeKnop;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class BeginScherm extends StaticScene {

    private KermitRunner kermitrunner;

    public BeginScherm(KermitRunner kermitrunner) {
        this.kermitrunner = kermitrunner;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/Beginscherm.mp3");
        setBackgroundImage("backgrounds/Beginscherm.jpg");
    }

    @Override
    public void setupEntities() {
        addEntity(new VolgendeKnop(kermitrunner, new Coordinate2D(getWidth() / 2, getHeight() * 0.8), "Ga naar het eerste level"));

        var titelText = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() / 3),
                "Kermit Runner"
        );

        titelText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        titelText.setFill(Color.WHITE);
        titelText.setStrokeColor(Color.BLACK);
        titelText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 120));
        addEntity(titelText);
    }
}
