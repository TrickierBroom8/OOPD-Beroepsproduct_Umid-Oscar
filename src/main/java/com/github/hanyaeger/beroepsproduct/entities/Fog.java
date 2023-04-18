package com.github.hanyaeger.beroepsproduct.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Fog extends DynamicSpriteEntity {
    public Fog(Coordinate2D initialLocation) {
        super("entities/Fog.png", initialLocation);
    }
}
