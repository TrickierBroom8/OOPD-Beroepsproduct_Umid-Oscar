package com.github.hanyaeger.beroepsproduct.maps;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.beroepsproduct.entities.DeurEntity;
import com.github.hanyaeger.beroepsproduct.entities.HegEntity;
import com.github.hanyaeger.beroepsproduct.entities.PadEntityForTileMap;


public class LevelTweeMap extends TileMap {

    public LevelTweeMap(final Coordinate2D location, final Size size ) {
        super(location, size);
    }

    @Override
    public void setupEntities() {
        addEntity(1, PadEntityForTileMap.class, PadEntityForTileMap.PadType.PAD);
        addEntity(2, HegEntity.class);
        addEntity(3, DeurEntity.class);
    }

    @Override
    public int[][] defineMap() {
        return new int[][]  {
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 1, 1, 1, 1, 2, 2, 2, 1, 1, 1, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 2},
                {2, 1 ,2, 2, 1, 2, 3, 2, 1, 2, 1, 1, 1, 2, 2, 1, 2, 1, 1, 1, 2, 1 ,2, 2, 1, 2 ,2, 2, 1, 2 ,1, 2},
                {2, 1, 1, 2, 1, 2, 1, 1, 1, 2, 1, 2, 1, 1, 3, 1, 2, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 2, 1, 2, 1, 2},
                {2, 2, 1, 2, 1, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 2},
                {2, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 2 ,2, 2, 1, 2 ,2, 2, 1, 2 ,2, 1, 2, 2 ,2, 1, 2},
                {2, 1, 1, 1, 1, 2, 2 ,1, 2, 1, 2, 1, 2, 1 ,1, 1, 2 ,1 ,2 ,1, 2 ,1 ,2, 1, 2 ,2 ,2 ,2, 1 ,1 ,1 ,2},
                {2, 2, 2, 2, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 2, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 2, 2, 2, 1, 2, 2, 2},
                {2, 2, 1, 1, 1, 2, 2, 2, 2, 1, 2, 2, 1, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 2, 2, 1, 1, 2, 2, 2},
                {2, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 ,2, 2, 1, 1, 1, 1, 1, 1 ,1, 2},
                {2, 2, 2, 2, 1, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 1, 2, 2, 2},
                {2, 1, 1, 1, 1, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 2},
                {2, 2, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 2, 2, 2, 1, 2, 2, 1, 1, 2, 2, 2},
                {2, 1, 1, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 2, 2, 1, 2, 1, 2},
                {2, 1, 2, 2, 1, 2 ,1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 2, 2, 1, 2, 2, 2, 1, 2, 2, 1 ,2, 2, 1, 2, 1, 2},
                {2, 1, 1, 1, 1, 2, 2, 2, 2, 1, 2, 2, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 2},
                {2, 1, 2, 2, 2, 2, 2, 1, 2, 1, 1, 1, 1, 2, 2, 1, 1, 2, 2, 2, 1, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2},
                {2, 1, 1, 2, 2, 2, 2, 1, 1, 1, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 2, 1, 1, 2 ,2, 1, 1, 1, 1, 1, 2},
                {2, 2, 2, 2, 2, 2 ,2 ,2, 2 ,2 ,2 ,2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},




        };
    }
}
