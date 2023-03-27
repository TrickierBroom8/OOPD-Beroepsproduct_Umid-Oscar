package com.github.hanyaeger.beroepsproduct.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.beroepsproduct.KermitRunner;

public class Kermit extends DynamicSpriteEntity implements Collided, SceneBorderTouchingWatcher {

    private KermitRunner kermitrunner;
    Direction kermitRichting;
    double snelheid = 0.35;

    double afstand = 1;

    int x, y;

    public Kermit(Coordinate2D location, Size size, KermitRunner kermitrunner) {
        super("entities/Kermit.gif", location, size);
        this.kermitrunner = kermitrunner;
    }

    public void beweegKermit(Direction richting) {
        this.kermitRichting = richting;
        this.setMotion(this.snelheid, richting);
    }

    @Override
    public void onCollision(Collider collider) {
        if (collider.getClass() == HegEntity.class) {
            this.collisionAfstand();
            this.stopKermit();
        } else if (collider.getClass() == DeurEntity.class) {
            kermitrunner.zetVolgendeScene();
        } else if(collider.getClass() == MushroomEntity.class) {
            this.collisionAfstand();
            this.stopKermit();
            // Leven er af
        }
    }

    public void notifyBoundaryTouching(final SceneBorder border) {
        this.collisionAfstand();
        this.stopKermit();
    }

    public void stopKermit() {
        this.setMotion(0, 0);
    }

    public void collisionAfstand() {
        x = (int) getAnchorLocation().getX();
        y = (int) getAnchorLocation().getY();

        switch (kermitRichting) {
            case UP -> y += afstand;
            case DOWN -> y -= afstand;
            case LEFT -> x += afstand;
            case RIGHT -> x -= afstand;
        }
        this.setAnchorLocation(new Coordinate2D(x, y));
    }
}
