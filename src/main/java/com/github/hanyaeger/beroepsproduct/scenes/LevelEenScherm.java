package com.github.hanyaeger.beroepsproduct.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.beroepsproduct.maps.LevelEenMap;

public class LevelEenScherm extends DynamicScene implements TileMapContainer {
    @Override
    public void setupScene() {

    }

    @Override
    public void setupEntities() {

    }

    @Override
    public void setupTileMaps() {
        var levelEenMap = new LevelEenMap(new Coordinate2D(0, 0), new Size(getWidth(), getHeight()));
        addTileMap(levelEenMap);
    }


}
