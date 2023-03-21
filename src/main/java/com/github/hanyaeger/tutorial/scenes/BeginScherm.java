package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.KermitRunner;
import com.github.hanyaeger.tutorial.StartKnop;
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
        addEntity(new StartKnop(kermitrunner, new Coordinate2D(getWidth() * 0.8, getHeight() / 2)));

        var beginSchermTekst = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() / 3),
                "Kermit Runner"
        );
        beginSchermTekst.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        beginSchermTekst.setFill(Color.DARKBLUE);
        beginSchermTekst.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));
        addEntity(beginSchermTekst);
    }
}
