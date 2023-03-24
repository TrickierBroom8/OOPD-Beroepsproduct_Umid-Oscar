package com.github.hanyaeger.beroepsproduct;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.beroepsproduct.scenes.BeginScherm;
import com.github.hanyaeger.beroepsproduct.scenes.LevelEenScherm;
import com.github.hanyaeger.beroepsproduct.scenes.TussenScherm;
import com.github.hanyaeger.beroepsproduct.scenes.tussenschermen.LevelEenVoltooid;

public class KermitRunner extends YaegerGame {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Kermit Runner");
        setSize(new Size(1280, 720));
    }

    @Override
    public void setupScenes() {
        addScene(0, new BeginScherm(this));
        addScene(1, new LevelEenScherm(this));
        addScene(3 , new LevelEenVoltooid(this));
    }
}
