package com.ui.core;

public enum EstadoUI {
    BOCETO("#CCCCCC"),
    REVISION("#FFCC00"),
    APROBADO("#00FF00");

    String hexColor;

    EstadoUI(String hexColor) {
        this.hexColor = hexColor;
    }
    public String getHexColor() {
        return hexColor;
    }
}
