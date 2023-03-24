package com.github.hanyaeger.beroepsproduct.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.entities.Direction;

public class Kermit extends DynamicSpriteEntity implements Collided {

    Direction kermitRichting;
    int snelheid = 1;

    public Kermit(Coordinate2D location, Size size) {
        super("entities/Kermit.gif", location, size);
    }

    public void beweegKermit(Direction richting) {
        this.kermitRichting = richting;
        this.setMotion(this.snelheid, richting);
    }

    @Override
    public void onCollision(Collider collider) {
        int x = (int) getAnchorLocation().getX();
        int y = (int) getAnchorLocation().getY();

        switch (kermitRichting) {
            case UP:
                y += 1;
                break;
            case DOWN:
                y -= 1;
                break;
            case LEFT:
                x += 1;
                break;
            case RIGHT:
                x -= 1;
                break;
        }

        this.stopKermit();
        this.setAnchorLocation(new Coordinate2D(x, y));
        // Zet stil, stop met bewegen.
    }

    public void stopKermit() {
        this.setMotion(0, 0);
    }
}
