package com.github.hanyaeger.beroepsproduct.scenes;

import com.github.hanyaeger.api.*;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.beroepsproduct.KermitRunner;
import com.github.hanyaeger.beroepsproduct.SpelTijd;
import com.github.hanyaeger.beroepsproduct.entities.Fog;
import com.github.hanyaeger.beroepsproduct.entities.Kermit;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.Set;

public class LevelScherm extends DynamicScene implements TimerContainer, TileMapContainer, KeyListener {
    private KermitRunner kermitrunner;
    private TextEntity displayTimer;
    private TextEntity displayHeart;
    private int timerStartTijd;
    private int timerTijd;
    private Timer spelKlok;
    private TileMap levelMap;
    public Kermit kermit;
    public Fog fog;

    public int x = 44, y = 44;

    public LevelScherm(KermitRunner kermitrunner, TileMap levelMap, int timerStartTijd) {
        this.kermitrunner = kermitrunner;
        this.levelMap = levelMap;
        this.timerStartTijd = timerStartTijd;
        this.timerTijd = timerStartTijd;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/Levelscherm.mp3");
        setBackgroundImage("backgrounds/Levelscherm.jpg");
    }

    @Override
    public void setupEntities() {
        fog = new Fog(new Coordinate2D(x, y));
        fog.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(fog);

        kermit = new Kermit(new Coordinate2D(x, y), new Size(24, 24), kermitrunner, this, fog);
        addEntity(kermit);

        displayTimer = new TextEntity(new Coordinate2D(90, 17.5), Integer.toString(timerTijd));
        displayTimer.setFont(Font.font("Roboto", FontWeight.BOLD, 30));
        displayTimer.setFill(Color.WHITE);
        displayTimer.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(displayTimer);

        displayHeart = new TextEntity(new Coordinate2D(getWidth() - 90, 17.5), Integer.toString(kermit.levens));
        displayHeart.setFont(Font.font("Roboto", FontWeight.BOLD, 30));
        displayHeart.setFill(Color.WHITE);
        displayHeart.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(displayHeart);
    }

    @Override
    public void setupTileMaps() {
        addTileMap(levelMap);
    }


    @Override
    public void onPressedKeysChange(Set<KeyCode> set) {
        if (set.size() == 1) {
            if (set.contains(KeyCode.W)) {
                kermit.beweegKermit(Direction.UP);
            } else if (set.contains(KeyCode.S)) {
                kermit.beweegKermit(Direction.DOWN);
            } else if (set.contains(KeyCode.D)) {
                kermit.beweegKermit(Direction.RIGHT);
            } else if (set.contains(KeyCode.A)) {
                kermit.beweegKermit(Direction.LEFT);
            } else if (set.contains(KeyCode.SPACE)) {
                kermit.stopKermit();
            }
        }
    }

    @Override
    public void setupTimers() {
        spelKlok = new SpelTijd(this);
        addTimer(spelKlok);
    }

    public void updateTimer() {
        if (timerTijd <= 0) {
            timerTijd = timerStartTijd;
            kermitrunner.zetScene(kermitrunner.bepaalGefaaldScherm());
        } else {
          displayTimer.setText(Integer.toString(timerTijd--));
        }
    }

    public void updateLevensDisplay() {
        displayHeart.setText(Integer.toString(kermit.levens));
        if (kermit.levens <= 0) {
            kermit.levens = 2;
            kermitrunner.zetScene(kermitrunner.bepaalGefaaldScherm());
        }
    }

    public void voegTimerTijdToe(int tijd) {
        timerTijd += tijd;
    }

    public void haalTimerTijdAf(int tijd) {
        timerTijd -= tijd;
    }
}
