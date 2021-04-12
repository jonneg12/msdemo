package org.example.game;

import javax.swing.*;
import java.awt.*;

public enum Smile {
    SMILE("smile"),
    SUNGLASSES("sunglasses"),
    SAD("sad");

    private static final int ICON_SIZE = 50;

    private static final String LOCATION_PATTERN =  "/media/john/BIGDATA/Study/CFT/demomvcobserver/src/main/resources/images/smile/%s.png";

    private String fileName;

    Smile(String fileName) {
        this.fileName = String.format(LOCATION_PATTERN, fileName.toLowerCase());
    }

    public ImageIcon getIcon() {
        ImageIcon icon = new ImageIcon(new ImageIcon(fileName).getImage().getScaledInstance(ICON_SIZE, ICON_SIZE, Image.SCALE_SMOOTH));
        return icon;
    }
}
