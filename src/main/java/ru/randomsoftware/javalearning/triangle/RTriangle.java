package ru.randomsoftware.javalearning.triangle;

import java.util.Random;

/**
 * Created by stille on 12.03.16.
 */
public class RTriangle {

    private int apexX1, apexX2, apexX3;
    private int apexY1, apexY2, apexY3;

    public RTriangle() {
        final int bound = 10;
        Random rnd = new Random();
        this.apexX1 = rnd.nextInt(bound);
        this.apexX2 = rnd.nextInt(bound);
        this.apexX3 = rnd.nextInt(bound);
        this.apexY1 = rnd.nextInt(bound);
        this.apexY2 = rnd.nextInt(bound);
        this.apexY3 = rnd.nextInt(bound);
    }

    public RTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.apexX1 = x1;
        this.apexX2 = x2;
        this.apexX3 = x3;
        this.apexY1 = y1;
        this.apexY2 = y2;
        this.apexY3 = y3;
    }

    public int getApexX1() {
        return apexX1;
    }

    public int getApexX2() {
        return apexX2;
    }

    public int getApexX3() {
        return apexX3;
    }

    public int getApexY1() {
        return apexY1;
    }

    public int getApexY2() {
        return apexY2;
    }

    public int getApexY3() {
        return apexY3;
    }

}
