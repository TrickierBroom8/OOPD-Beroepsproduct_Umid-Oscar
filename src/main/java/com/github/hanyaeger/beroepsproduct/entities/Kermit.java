package com.github.hanyaeger.beroepsproduct.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Kermit extends DynamicSpriteEntity implements Collided {

    public Kermit(Coordinate2D location, Size size) {
        super("entities/Kermit.gif", location, size);
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
