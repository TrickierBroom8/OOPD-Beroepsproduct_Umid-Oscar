package com.github.hanyaeger.beroepsproduct.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class KlokEntity extends SpriteEntity implements Collider {
    public KlokEntity (final Coordinate2D location, final Size size){
        super("entities/klok.gif", location, size);
    }
}
