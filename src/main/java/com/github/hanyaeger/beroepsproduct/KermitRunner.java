package com.github.hanyaeger.beroepsproduct;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.beroepsproduct.maps.LevelDrieMap;
import com.github.hanyaeger.beroepsproduct.maps.LevelEenMap;
import com.github.hanyaeger.beroepsproduct.maps.LevelTweeMap;
import com.github.hanyaeger.beroepsproduct.scenes.BeginScherm;
import com.github.hanyaeger.beroepsproduct.scenes.Eindscherm;
import com.github.hanyaeger.beroepsproduct.scenes.LevelGefaald;
import com.github.hanyaeger.beroepsproduct.scenes.LevelScherm;
import com.github.hanyaeger.beroepsproduct.scenes.tussenschermen.LevelEenVoltooid;
import com.github.hanyaeger.beroepsproduct.scenes.tussenschermen.LevelTweeVoltooid;

public class KermitRunner extends YaegerGame {
    public static void main(String[] args){
        launch(args);
    }
    private final Size size = new Size(1280, 720);
    public int huidigeScene = 0;

    public final int BEGIN_SCHERM = 0, LEVEL_EEN = 1, GEFAALD_EEN = 2, VOLTOOID_EEN = 3, LEVEL_TWEE = 4,
    GEFAALD_TWEE = 5, VOLTOOID_TWEE = 6, LEVEL_DRIE = 7, GEFAALD_DRIE = 8, EIND_SCHERM = 9;

    @Override
    public void setupGame() {
        setGameTitle("Kermit Runner");
        setSize(size);
    }

    @Override
    public void setupScenes() {
        addScene(BEGIN_SCHERM, new BeginScherm(this));

        addScene(LEVEL_EEN, new LevelScherm(this, new LevelEenMap(new Coordinate2D(0, 0), size), 60));
        addScene(GEFAALD_EEN , new LevelGefaald(this));
        addScene(VOLTOOID_EEN , new LevelEenVoltooid(this));

        addScene(LEVEL_TWEE, new LevelScherm(this, new LevelTweeMap(new Coordinate2D(0, 0), size), 50));
        addScene(GEFAALD_TWEE , new LevelGefaald(this));
        addScene(VOLTOOID_TWEE, new LevelTweeVoltooid(this));

        addScene(LEVEL_DRIE, new LevelScherm(this, new LevelDrieMap(new Coordinate2D(0, 0), size), 40));
        addScene(GEFAALD_DRIE , new LevelGefaald(this));
        addScene(EIND_SCHERM, new Eindscherm(this));
    }

    public int getHuidigeScene() {
        return huidigeScene;
    }

    public int volgendeScene() {
        switch (huidigeScene) {
            case BEGIN_SCHERM : return LEVEL_EEN;
            case LEVEL_EEN : return VOLTOOID_EEN;
            case GEFAALD_EEN : return LEVEL_EEN;
            case VOLTOOID_EEN : return LEVEL_TWEE;
            case GEFAALD_TWEE : return LEVEL_TWEE;
            case LEVEL_TWEE : return VOLTOOID_TWEE;
            case VOLTOOID_TWEE : return LEVEL_DRIE;
            case LEVEL_DRIE : return EIND_SCHERM;
            case GEFAALD_DRIE : return LEVEL_DRIE;
        }
        return 0;
    }

    public void zetVolgendeScene() {
        zetScene(volgendeScene());
    }

    public void zetScene(int id) {
        huidigeScene = id;
        setActiveScene(id);
    }
}
