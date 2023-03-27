package com.github.hanyaeger.beroepsproduct.scenes.tussenschermen;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.beroepsproduct.KermitRunner;
import com.github.hanyaeger.beroepsproduct.VolgendeKnop;
import com.github.hanyaeger.beroepsproduct.scenes.TussenScherm;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LevelTweeVoltooid extends TussenScherm {
    private KermitRunner kermitrunner;
    public LevelTweeVoltooid(KermitRunner kermitrunner) {
        super("backgrounds/Level_twee_voltooid.png");
        this.kermitrunner = kermitrunner;
    }

    public void setupEntities() {
        var felicitatieText = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() * 0.1),
                "Goedzo! Je hebt Fuzzie-Bear bevrijd van Constantine.\nKlik nu hieronder op de knop om naar het volgende doolhof te gaan en Miss Piggy te bevrijden."
        );

        felicitatieText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        felicitatieText.setFill(Color.GREEN);
        felicitatieText.setStrokeColor(Color.ORANGE);
        felicitatieText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 30));
        addEntity(felicitatieText);

        addEntity(new VolgendeKnop(kermitrunner, new Coordinate2D(getWidth() / 2, getHeight() * 0.8)));
    }
}
