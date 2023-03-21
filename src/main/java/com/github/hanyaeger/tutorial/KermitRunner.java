package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.tutorial.scenes.BeginScherm;
import com.github.hanyaeger.tutorial.scenes.LevelScherm;

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
        addScene(1, new LevelScherm());
    }
}
