package com.github.hanyaeger.beroepsproduct;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.beroepsproduct.maps.LevelDrieMap;
import com.github.hanyaeger.beroepsproduct.maps.LevelTweeMap;
import com.github.hanyaeger.beroepsproduct.maps.LevelEenMap;
import com.github.hanyaeger.beroepsproduct.scenes.BeginScherm;
import com.github.hanyaeger.beroepsproduct.scenes.Eindscherm;
import com.github.hanyaeger.beroepsproduct.scenes.LevelScherm;
import com.github.hanyaeger.beroepsproduct.scenes.tussenschermen.LevelEenVoltooid;
import com.github.hanyaeger.beroepsproduct.scenes.tussenschermen.LevelTweeVoltooid;

public class KermitRunner extends YaegerGame {
    public static void main(String[] args){
        launch(args);
    }
    private final Size size = new Size(1280, 720);
    public int huidigeScene = 0;

    public final int BEGIN_SCHERM = 0, LEVEL_EEN = 1, VOLTOOID_EEN = 2, LEVEL_TWEE = 3, VOLTOOID_TWEE = 4, LEVEL_DRIE = 5, EIND_SCHERM = 6;

    @Override
    public void setupGame() {
        setGameTitle("Kermit Runner");
        setSize(size);
    }

    @Override
    public void setupScenes() {
        addScene(BEGIN_SCHERM, new BeginScherm(this));

        addScene(LEVEL_EEN, new LevelScherm(this, new LevelEenMap(new Coordinate2D(0, 0), size), 60));
        addScene(VOLTOOID_EEN , new LevelEenVoltooid(this));

        addScene(LEVEL_TWEE, new LevelScherm(this, new LevelTweeMap(new Coordinate2D(0, 0), size), 50));
        addScene(VOLTOOID_TWEE, new LevelTweeVoltooid(this));

        addScene(LEVEL_DRIE, new LevelScherm(this, new LevelDrieMap(new Coordinate2D(0, 0), size), 40));
        addScene(EIND_SCHERM, new Eindscherm(this));
    }

    public int getHuidigeScene() {
        return huidigeScene;
    }

    public int volgendeScene() {
        if (huidigeScene >= 6) {
            return 0;
        } else {
            return huidigeScene + 1;
        }
    }

    public void zetVolgendeScene() {
        int volgendeScene = volgendeScene();
        zetScene(volgendeScene);
    }

    public int bepaalVorigTussenScherm() {
        if (huidigeScene == LEVEL_TWEE) {
            return VOLTOOID_EEN;
        } else if (huidigeScene == LEVEL_DRIE) {
            return VOLTOOID_TWEE;
        } else {
            return BEGIN_SCHERM;
        }
    }

    public void zetScene(int bepaalVorigTussenScherm) {
        huidigeScene = bepaalVorigTussenScherm;
        setActiveScene(bepaalVorigTussenScherm);
    }
}
