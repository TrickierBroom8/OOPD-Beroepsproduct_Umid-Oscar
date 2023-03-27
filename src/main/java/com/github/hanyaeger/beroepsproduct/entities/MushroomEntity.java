package com.github.hanyaeger.beroepsproduct.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class MushroomEntity extends SpriteEntity implements Collider {
    public MushroomEntity(final Coordinate2D location, final Size size) {
        super("entities/mushroom_simple.png", location, size);
    }
}
