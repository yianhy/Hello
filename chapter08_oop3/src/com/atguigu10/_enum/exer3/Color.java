package com.atguigu10._enum.exer3;

/**
 * @author yian
 * @date 2023/3/16 18:28
 */
public enum Color {
    RED(255,0,0,"红色"),GREEN(0,255,0,"绿色"),BLUE(0,0,255,"蓝色");
    private final int red;
    private final int green;
    private final int blue;
    private final String description;

    private Color(int red, int green, int blue, String description) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Color{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                ", description='" + description + '\'' +
                '}';
    }
}
