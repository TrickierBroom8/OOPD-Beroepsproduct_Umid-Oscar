package com.github.hanyaeger.beroepsproduct.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;

import java.util.Set;

public class PadEntityForTileMap extends SpriteEntity {

    public PadEntityForTileMap(final Coordinate2D location, final Size size, final PadType padType) {
        super(padType.sprite, location, size);
    }

    public enum PadType {

        PAD("entities/grass_simple.png");

        String sprite;

        PadType(String sprite) {
            this.sprite = sprite;
        }
    }
}

