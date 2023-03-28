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

public class Eindscherm extends StaticScene {
    private KermitRunner kermitrunner;
    public Eindscherm(KermitRunner kermitrunner) {
        this.kermitrunner = kermitrunner;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/Eindscherm.mp3");
        setBackgroundImage("backgrounds/Eindscherm.png");
    }

    @Override
    public void setupEntities() {
        var felicitatieText = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() * 0.1),
                "Gefeliciteerd! Je hebt al je muppet-vrienden gered en daarmee het spel uitgespeeld!"
        );

        felicitatieText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        felicitatieText.setFill(Color.GREEN);
        felicitatieText.setStrokeColor(Color.ORANGE);
        felicitatieText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 30));
        addEntity(felicitatieText);

        addEntity(new VolgendeKnop(kermitrunner, new Coordinate2D(getWidth() / 2, getHeight() * 0.8), "Ga terug naar beginscherm"));
    }
}
