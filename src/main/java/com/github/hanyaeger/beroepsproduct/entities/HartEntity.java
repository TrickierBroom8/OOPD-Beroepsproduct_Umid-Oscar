package com.github.hanyaeger.beroepsproduct.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class HartEntity extends SpriteEntity implements Collider {

    public HartEntity(final Coordinate2D location, final Size size){
        super("entities/Heart_simple.jpg", location, size);}
}
