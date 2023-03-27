package com.github.hanyaeger.beroepsproduct;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.beroepsproduct.maps.LevelEenMap;
import com.github.hanyaeger.beroepsproduct.scenes.BeginScherm;
import com.github.hanyaeger.beroepsproduct.scenes.LevelScherm;
import com.github.hanyaeger.beroepsproduct.scenes.tussenschermen.LevelEenVoltooid;

public class KermitRunner extends YaegerGame {
    public static void main(String[] args){
        launch(args);
    }
    private final Size size = new Size(1280, 720);

    @Override
    public void setupGame() {
        setGameTitle("Kermit Runner");
        setSize(size);
    }

    @Override
    public void setupScenes() {
        addScene(0, new BeginScherm(this));
        addScene(1, new LevelScherm(this, new LevelEenMap(new Coordinate2D(0, 0), size)));
        addScene(3 , new LevelEenVoltooid(this));
        addScene(4, new LevelScherm(this, new LevelTweeMap(new Coordinate2D(0, 0), size)));
    }
}
