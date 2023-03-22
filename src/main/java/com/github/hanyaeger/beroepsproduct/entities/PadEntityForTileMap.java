package com.github.hanyaeger.beroepsproduct.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class PadEntityForTileMap extends SpriteEntity {

    public PadEntityForTileMap(final Coordinate2D location, final Size size, final PadType padType) {
        super(padType.sprite, location, size);
    }

    public enum PadType {
        HEG("entities/grass_long.png"),
        PAD("entities/grass_simple.png"),
        DEUR("entities/door_simple.png");

        String sprite;

        PadType(String sprite) {
            this.sprite = sprite;
        }
    }
}

