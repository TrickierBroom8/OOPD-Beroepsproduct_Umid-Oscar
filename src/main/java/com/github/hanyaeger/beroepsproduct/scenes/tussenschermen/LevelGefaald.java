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

public class LevelGefaald extends TussenScherm {
    private TextEntity GefaaldTekst;

    private KermitRunner kermitrunner;
    public LevelGefaald(KermitRunner kermitrunner) {
        super("backgrounds/GefaaldScherm.png");
        this.kermitrunner = kermitrunner;
    }

    @Override
    public void setupEntities() {
        GefaaldTekst = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() * 0.1),
                "Helaas je hebt het doolhof niet gehaald."
        );

        GefaaldTekst.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        GefaaldTekst.setFill(Color.WHITE);
        GefaaldTekst.setStrokeColor(Color.BLACK);
        GefaaldTekst.setFont(Font.font("Roboto", FontWeight.BOLD, 40));
        addEntity(GefaaldTekst);

        addEntity(new VolgendeKnop(kermitrunner, new Coordinate2D(getWidth() / 2, getHeight() * 0.8), "Probeer het nog eens"));
    }
}
