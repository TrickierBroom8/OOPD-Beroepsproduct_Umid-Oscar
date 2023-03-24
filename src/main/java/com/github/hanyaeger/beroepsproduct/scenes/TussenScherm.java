package com.github.hanyaeger.beroepsproduct.scenes;

import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.beroepsproduct.KermitRunner;
import javafx.scene.paint.Color;

public class TussenScherm extends StaticScene {

    private KermitRunner kermitrunner;

    public TussenScherm(KermitRunner kermitrunner) {
        this.kermitrunner = kermitrunner;
    }

    @Override
    public void setupScene() {
        setBackgroundColor(Color.AQUA);
    }

    @Override
    public void setupEntities() {

    }
}
