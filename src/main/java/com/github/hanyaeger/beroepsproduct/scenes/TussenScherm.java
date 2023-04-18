package com.github.hanyaeger.beroepsproduct.scenes;

import com.github.hanyaeger.api.scenes.StaticScene;

public abstract class TussenScherm extends StaticScene {

    private String achtergrond;
    private String audio;

    public TussenScherm(String achtergrond) {
        this.achtergrond = achtergrond;
    }

    public TussenScherm(String achtergrond, String audio) {
        this(achtergrond);
        this.audio = audio;
    }

    @Override
    public void setupScene() {
        if (achtergrond != null) {
            setBackgroundImage(achtergrond);
        }
        if (audio != null) {
            setBackgroundAudio(audio);
        }
    }

    @Override
    public abstract void setupEntities();


}
