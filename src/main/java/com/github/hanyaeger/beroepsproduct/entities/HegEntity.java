package com.github.hanyaeger.beroepsproduct.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class HegEntity extends SpriteEntity implements Collider {

    public HegEntity(final Coordinate2D location, final Size size) {
        super("entities/grass_long.png", location, size);
    }
}
