package com.github.hanyaeger.beroepsproduct.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.beroepsproduct.KermitRunner;
import com.github.hanyaeger.beroepsproduct.entities.Kermit;
import com.github.hanyaeger.beroepsproduct.maps.LevelEenMap;
import javafx.scene.input.KeyCode;

import java.util.Set;

public class LevelScherm extends DynamicScene implements TileMapContainer, KeyListener {
    private KermitRunner kermitrunner;
    private TileMap levelMap;
    public Kermit kermit;

    public LevelScherm(KermitRunner kermitrunner, TileMap levelMap) {
        this.kermitrunner = kermitrunner;
        this.levelMap = levelMap;
    }

    @Override
    public void setupScene() {

    }

    @Override
    public void setupEntities() {
        kermit = new Kermit(new Coordinate2D(12, 12), new Size(24, 24), kermitrunner);
        addEntity(kermit);
    }

    @Override
    public void setupTileMaps() {
        addTileMap(levelMap);
    }


    @Override
    public void onPressedKeysChange(Set<KeyCode> set) {
        if (set.size() == 1) {
            if (set.contains(KeyCode.W)) {
                kermit.beweegKermit(Direction.UP);
            } else if (set.contains(KeyCode.S)) {
                kermit.beweegKermit(Direction.DOWN);
            } else if (set.contains(KeyCode.D)) {
                kermit.beweegKermit(Direction.RIGHT);
            } else if (set.contains(KeyCode.A)) {
                kermit.beweegKermit(Direction.LEFT);
            } else if (set.contains(KeyCode.SPACE)) {
                kermit.stopKermit();
            }
        }
    }
}
