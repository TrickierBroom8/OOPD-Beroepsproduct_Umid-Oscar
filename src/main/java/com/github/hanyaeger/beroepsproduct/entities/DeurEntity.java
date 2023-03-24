package com.github.hanyaeger.beroepsproduct.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class DeurEntity extends SpriteEntity implements Collider {


    public DeurEntity(final Coordinate2D location, final Size size) {
        super("entities/door_simple.png", location, size);
    }

}
