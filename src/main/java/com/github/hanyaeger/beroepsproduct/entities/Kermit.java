package com.github.hanyaeger.beroepsproduct.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Kermit extends DynamicSpriteEntity {

    public Kermit(Coordinate2D location, Size size) {
        super("entities/Kermit.gif", location, size);
    }
}
