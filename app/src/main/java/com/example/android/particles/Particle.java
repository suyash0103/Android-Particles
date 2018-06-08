package com.example.android.particles;

import java.util.Random;

/**
 * Created by Suyash on 08-06-2018.
 */

public class Particle {
    public int distFromOrigin = 0;
    private double direction;
    private double directionCosine;
    private double directionSine;
    public int color;
    public int x;
    public int y;
    private int initX;
    private int initY;

    public Particle(int x, int y) {
        init(x, y);
        this.direction = 2*Math.PI * new Random().nextInt(NO_OF_DIRECTION)/NO_OF_DIRECTION;
        this.directionCosine = Math.cos(direction);
        this.directionSine = Math.sin(direction);
        this.color = new Random().nextInt(3);
    }

    public void init(int x, int y) {
        distFromOrigin = 0;
        this.initX = this.x = x;
        this.initY = this.y = y;
    }

    public synchronized void move(){
        distFromOrigin +=2;
        x = (int) (initX+distFromOrigin*directionCosine);
        y = (int) (initY+distFromOrigin*directionSine);
    }
    private final static int NO_OF_DIRECTION = 400;

}
