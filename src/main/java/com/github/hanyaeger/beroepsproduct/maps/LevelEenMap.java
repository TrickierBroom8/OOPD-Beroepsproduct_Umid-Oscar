package com.github.hanyaeger.beroepsproduct.maps;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.beroepsproduct.entities.PadEntityForTileMap;

public class LevelEenMap extends TileMap {

    public LevelEenMap(final Coordinate2D location, final Size size ) {
        super(location, size);
    }

    @Override
    public void setupEntities() {
        addEntity(1, PadEntityForTileMap.class, PadEntityForTileMap.PadType.PAD);
        addEntity(2, PadEntityForTileMap.class, PadEntityForTileMap.PadType.HEG);
        addEntity(3, PadEntityForTileMap.class, PadEntityForTileMap.PadType.DEUR);

    }

    @Override
    public int[][] defineMap() {
        return new int[][]  {
                {1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 3, 2},
                {1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2},
                {2, 2 ,1, 2, 2, 2 ,1, 2, 2, 2 ,1, 2, 2, 2 ,1, 2, 2, 2 ,1, 2, 2, 2 ,1, 2, 2, 2 ,1, 2, 2, 2 ,1, 2},
                {1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2},
                {1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2},
                {1 ,1, 1, 1, 1 ,1, 1, 1, 1 ,1, 1, 1, 1 ,1, 1, 1, 1 ,1, 1, 1, 1 ,1, 1, 1, 1 ,1, 1, 1, 1 ,1, 1, 2},
                {2 ,2 ,2 ,2, 2 ,2 ,2 ,2, 2 ,2 ,2 ,2, 2 ,2 ,2 ,2, 2 ,2 ,2 ,2, 2 ,2 ,2 ,2, 2 ,2 ,2 ,2, 2 ,2 ,2 ,2},
                {1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2},
                {1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2},
                {2, 2 ,1, 2, 2, 2 ,1, 2, 2, 2 ,1, 2, 2, 2 ,1, 2, 2, 2 ,1, 2, 2, 2 ,1, 2, 2, 2 ,1, 2, 2, 2 ,1, 2},
                {1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2},
                {1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2},
                {1 ,1, 1, 1, 1 ,1, 1, 1, 1 ,1, 1, 1, 1 ,1, 1, 1, 1 ,1, 1, 1, 1 ,1, 1, 1, 1 ,1, 1, 1, 1 ,1, 1, 2},
                {2 ,2 ,2 ,2, 2 ,2 ,2 ,2, 2 ,2 ,2 ,2, 2 ,2 ,2 ,2, 2 ,2 ,2 ,2, 2 ,2 ,2 ,2, 2 ,2 ,2 ,2, 2 ,2 ,2 ,2}
        };
    }
}
