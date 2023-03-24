package com.github.hanyaeger.beroepsproduct.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;

public class Kermit extends DynamicSpriteEntity implements Collided, SceneBorderTouchingWatcher {

    public Kermit(Coordinate2D location, Size size) {
        super("entities/Kermit.gif", location, size);
    }

    public void notifyBoundaryTouching(final SceneBorder border) {
        this.stopKermit();
    }
    @Override
    public void onCollision(Collider collider) {
         this.stopKermit();

        // Zet stil, stop met bewegen.
    }

    public void stopKermit() {
        this.setMotion(0, 0);
    }
}
