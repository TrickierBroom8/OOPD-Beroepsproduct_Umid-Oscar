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
import com.github.hanyaeger.beroepsproduct.entities.Kermit;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.Set;

public class LevelScherm extends DynamicScene implements TimerContainer, TileMapContainer, KeyListener {
    private KermitRunner kermitrunner;
    private TextEntity displayTimer;
    private int timerStartTijd;
    private int timerTijd;
    private Timer spelKlok;
    private TileMap levelMap;
    public Kermit kermit;

    public LevelScherm(KermitRunner kermitrunner, TileMap levelMap, int timerStartTijd) {
        this.kermitrunner = kermitrunner;
        this.levelMap = levelMap;
        this.timerStartTijd = timerStartTijd;
        this.timerTijd = timerStartTijd;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/Levelscherm.mp3");
    }

    @Override
    public void setupEntities() {
        kermit = new Kermit(new Coordinate2D(44, 44), new Size(24, 24), kermitrunner, this);
        addEntity(kermit);

        displayTimer = new TextEntity(new Coordinate2D(90, 17.5), Integer.toString(timerTijd));
        displayTimer.setFont(Font.font("Roboto", FontWeight.BOLD, 30));
        displayTimer.setFill(Color.WHITE);
        displayTimer.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(displayTimer);
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

    public void update() {
        if (timerTijd <= 0) {
            timerTijd = timerStartTijd;
            kermitrunner.zetScene(kermitrunner.bepaalVorigTussenScherm());
        } else {
          displayTimer.setText(Integer.toString(timerTijd--));
        }
    }

    public void voegTimerTijdToe(int tijd) {
        timerTijd += tijd;
    }

    public void haalTimerTijdAf(int tijd) {
        timerTijd -= tijd;
    }
}
