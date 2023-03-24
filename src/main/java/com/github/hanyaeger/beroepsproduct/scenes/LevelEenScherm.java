package com.github.hanyaeger.beroepsproduct.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.beroepsproduct.entities.Kermit;
import com.github.hanyaeger.beroepsproduct.maps.LevelEenMap;
import javafx.scene.input.KeyCode;

import java.util.Set;

public class LevelEenScherm extends DynamicScene implements TileMapContainer, KeyListener {
    @Override
    public void setupScene() {

    }
    public Kermit kermit = new Kermit(new Coordinate2D(0, 0), new Size(32, 32));
    @Override
    public void setupEntities() {
        addEntity(kermit);
    }

    @Override
    public void setupTileMaps() {
        var levelEenMap = new LevelEenMap(new Coordinate2D(0, 0), new Size(getWidth(), getHeight()));
        addTileMap(levelEenMap);
    }


    @Override
    public void onPressedKeysChange(Set<KeyCode> set) {
        if (set.size() == 1) {
            if (set.contains(KeyCode.W)) {
                kermit.setMotion(1, Direction.UP);
            } else if (set.contains(KeyCode.S)) {
                kermit.setMotion(1, Direction.DOWN);
            } else if (set.contains(KeyCode.D)) {
                kermit.setMotion(1, Direction.RIGHT);
            } else if (set.contains(KeyCode.A)) {
                kermit.setMotion(1, Direction.LEFT);
            }
        }
    }

}
