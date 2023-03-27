package com.github.hanyaeger.beroepsproduct;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.beroepsproduct.maps.LevelDrieMap;
import com.github.hanyaeger.beroepsproduct.maps.LevelEenMap;
import com.github.hanyaeger.beroepsproduct.maps.LevelTweeMap;
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

    @Override
    public void setupGame() {
        setGameTitle("Kermit Runner");
        setSize(size);
    }

    @Override
    public void setupScenes() {
        addScene(0, new BeginScherm(this));

        addScene(1, new LevelScherm(this, new LevelEenMap(new Coordinate2D(0, 0), size)));
        addScene(2 , new LevelEenVoltooid(this));

        addScene(3, new LevelScherm(this, new LevelTweeMap(new Coordinate2D(0, 0), size)));
        addScene(4, new LevelTweeVoltooid(this));

        addScene(5, new LevelScherm(this, new LevelDrieMap(new Coordinate2D(0, 0), size)));
        addScene(6, new Eindscherm(this));
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
        huidigeScene = volgendeScene;
        setActiveScene(volgendeScene);
    }
}
