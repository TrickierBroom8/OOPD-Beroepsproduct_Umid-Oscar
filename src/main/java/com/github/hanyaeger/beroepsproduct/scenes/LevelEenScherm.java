package com.github.hanyaeger.beroepsproduct.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.beroepsproduct.maps.LevelEenMap;
import javafx.scene.input.KeyCode;

import java.util.Set;

public class LevelEenScherm extends DynamicScene implements TileMapContainer, KeyListener {
    @Override
    public void setupScene() {

    }

    @Override
    public void setupEntities() {
//        addEntity();
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
//                System.out.println("w geklikt");
            } else if (set.contains(KeyCode.S)) {
//                System.out.println("s geklikt");
            } else if (set.contains(KeyCode.D)) {
//                System.out.println("d geklikt");
            } else if (set.contains(KeyCode.A)) {
//                System.out.println("a geklikt");
            }
        }
    }

}
