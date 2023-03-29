package com.github.hanyaeger.beroepsproduct.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class PadEntity extends SpriteEntity {

    public PadEntity(final Coordinate2D location, final Size size) {
        super("entities/grass_simple.png", location, size);
    }
}

