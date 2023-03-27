package com.github.hanyaeger.beroepsproduct.scenes;

import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.beroepsproduct.KermitRunner;

public class Eindscherm extends StaticScene {
    public Eindscherm(KermitRunner kermitRunner) {
    }

    @Override
    public void setupScene() {
//        setBackgroundAudio("audio/Eindscherm.mp3");
        setBackgroundImage("backgrounds/Eindscherm.png");
    }

    @Override
    public void setupEntities() {

    }
}
