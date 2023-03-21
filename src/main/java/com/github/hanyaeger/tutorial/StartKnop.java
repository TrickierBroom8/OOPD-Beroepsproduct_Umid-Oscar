package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class StartKnop extends TextEntity implements MouseButtonPressedListener {
    private KermitRunner kermitrunner;
    public StartKnop(KermitRunner kermitrunner, Coordinate2D initialLocation){
        super(initialLocation,"Start spel");
        setFill(Color.PURPLE);
        setFont(Font.font("Roboto", FontWeight.BOLD, 30));
        this.kermitrunner = kermitrunner;
    }

    @Override
    public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D){
        kermitrunner.setActiveScene(1);
    }
}
