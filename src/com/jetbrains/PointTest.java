package com.jetbrains;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @org.junit.jupiter.api.Test
    void distanceFromOrigin() {
        var points = new Point(4, 3);
        assertEquals(5.0, points.distanceFromOrigin());
    }
    @org.junit.jupiter.api.Test
    void nullPointx() {
        var points = new Point();
        assertEquals(0, points.getX(0));
    }
    @org.junit.jupiter.api.Test
    void nullPointy() {
        var points = new Point();
        assertEquals(0, points.getY(0));
    }

    @org.junit.jupiter.api.Test
    void translate1() {
        Point p1 = new Point(7, 2);
        p1.translate(11, 6);
        assertEquals(18, p1.getX(18));
        assertEquals(8, p1.getY(8));
    }

    @org.junit.jupiter.api.Test
    void translate2() {
        Point p2 = new Point(4, 3);
        p2.translate(1, 7);
        assertEquals(5, p2.getX(5));
        assertEquals(10, p2.getY(10));
    }

    @org.junit.jupiter.api.Test
    void toString1() {
        Point p1 = new Point(7, 2);
        assertEquals("(7, 2)", p1.toString());
    }

    @org.junit.jupiter.api.Test
    void toString2() {
        Point p2 = new Point(4, 3);
        assertEquals("(4, 3)", p2.toString());
    }
}

