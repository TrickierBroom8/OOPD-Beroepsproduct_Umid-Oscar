package com.github.hanyaeger.beroepsproduct.scenes;

import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.beroepsproduct.KermitRunner;

public class TussenScherm extends StaticScene {

    private KermitRunner kermitrunner;
    private String achtergrond;
    private String audio;

    public TussenScherm(KermitRunner kermitrunner) {
        this.kermitrunner = kermitrunner;
    }

    public TussenScherm(KermitRunner kermitrunner, String achtergrond) {
        this(kermitrunner);
        this.achtergrond = achtergrond;
    }

    public TussenScherm(KermitRunner kermitrunner, String url, String audio) {
        this(kermitrunner, url);
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
    public void setupEntities() {

    }
}
