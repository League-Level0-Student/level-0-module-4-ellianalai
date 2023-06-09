package _99_extra.pong;

import processing.core.PApplet;

public class Pong extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 0;
    int y = 0;
    int xSpeed = 5;
    int ySpeed = 5;
    boolean intersects(int ballX, int ballY, int paddleX, int paddleY,
			int paddleLength) {
			    if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
			        return true;
			    else
			        return false;
			}
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	
    }

    @Override
    public void draw() {
    	background(0,0,0);
    	fill(0,0,255);
    	ellipse(x,y, 20, 20);
    	
    	stroke(0,255,0);
    	x+=xSpeed;
    	y+=ySpeed;
    	if(x > WIDTH){
    	    xSpeed = -xSpeed;
    	}
    	if(x < 0){
    	    xSpeed = -xSpeed;
    	}
    	if(y > HEIGHT){
    	    ySpeed = -ySpeed;
    	}
    	if(y < 0){
    	    ySpeed = -ySpeed;
    	}
    	fill(255,255,255);
    	rect(mouseX,530,90,20);
    	
    	if ( intersects(x,y,mouseX +45,530,90)) {
    		ySpeed=-ySpeed;
    	}
    	
    	
    }

    static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    }
}