package com.github.hanyaeger.beroepsproduct.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;

import java.util.Set;

public class PadEntityForTileMap extends SpriteEntity implements KeyListener {

    public PadEntityForTileMap(final Coordinate2D location, final Size size, final PadType padType) {
        super(padType.sprite, location, size);
    }

    public enum PadType {
        HEG("entities/grass_long.png"),
        PAD("entities/grass_simple.png"),
        DEUR("entities/door_simple.png"),
        PLANT("entities/plant_simple.png");

        String sprite;

        PadType(String sprite) {
            this.sprite = sprite;
        }
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> set) {
        if (set.size() == 1) {
            if (set.contains(KeyCode.W)) {
                // wissel tile naar boven
            } else if (set.contains(KeyCode.S)) {
                // wissel tile naar onder
            } else if (set.contains(KeyCode.D)) {
                // wissel tile naar rechts
            } else if (set.contains(KeyCode.A)) {
                // wissel tile naar links
            }
        }
    }
}

