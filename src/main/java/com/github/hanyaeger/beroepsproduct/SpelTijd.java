package com.github.hanyaeger.beroepsproduct;

import com.github.hanyaeger.api.Timer;
import com.github.hanyaeger.beroepsproduct.scenes.LevelScherm;

public class SpelTijd extends Timer {

    private LevelScherm scene;

    public SpelTijd(final LevelScherm scene) {
        super(1000);
        this.scene = scene;
    }

    @Override
    public void onAnimationUpdate(long timestamp) {
        scene.updateTimer();
    }
}
