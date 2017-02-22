package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float sumOfAreas = 0f;

        for (Rectangle rectangle : rectangles) {
            sumOfAreas += rectangle.area();
        }

        return sumOfAreas/rectangles.length;
    }
}
