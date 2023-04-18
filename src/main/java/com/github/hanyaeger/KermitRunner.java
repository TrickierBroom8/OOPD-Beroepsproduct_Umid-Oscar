package com.github.hanyaeger;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;

public class KermitRunner extends YaegerGame {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Kermit Runner");
        setSize(new Size(800, 600));
    }

    @Override
    public void setupScenes() {

    }
}


