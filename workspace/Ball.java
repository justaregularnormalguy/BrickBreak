//  Class author:  Obiefuna Moneme
//  Date created:  12/10/24
//  General description: intializes the variables for ball and sets its parameters
import java.awt.*;

public class Ball {
	//your code here!
	private int size;
	private int x;
	private int y;
	private int xVelocity;
	private int yVelocity;
	//don't forget you need instance variables:
	
	public Ball (int x, int y, int size){
	this.size = size;
	this.x = x;
	this.y = y;
	xVelocity = 1;
	yVelocity = 1;
	}
	// Pre-condition: none
	//  Post-condition: sets integer x to x
	public void setX(int x) {
		this.x = x;
	}
	// Pre-condition: none
	//  Post-condition: sets integer y to y
	public void setY(int y) {
		this.y = y;
	}
	// Pre-condition: none
	//  Post-condition: serts the color of the ball to white
	public void draw(Graphics g){
		g.setColor(Color.white);
		}
	// Pre-condition: none
	//  Post-condition: sets the x position
	public int getXpos (){
		return x;
	}
	// Pre-condition: none
	//  Post-condition: sets the y position
	public int getYpos(){
		return y;
	}
	// Pre-condition: none
	//  Post-condition: sets the direction int the x velocity
	public void setXVelocity(int xVelocity){
		this.xVelocity = xVelocity;
	}
	// Pre-condition: none
	//  Post-condition:sets the velocity in the y direction
	public void setYVelocity(int yVelocity){
		this.yVelocity = yVelocity;
	}
	
	// Pre-condition: x and y variables and their respective velocity variables are properly initialized
	//  Post-condition: sets the move method with the coordinate and velocity variables
	public void move (){;
		x = x + xVelocity;
		y = y + yVelocity;
	}
	// Pre-condition: none
	//  Post-condition: sets the sized of the ball
	public int getSize(){
		return size;
	}
	// Pre-condition: none
	//  Post-condition: reverses the direction of the ball in the x axis when it hits the bricks 
	public void reverseX(){
		xVelocity -= xVelocity;
	}

	// Pre-condition: none
	//  Post-condition: reverses the direction of the bal in the y axis when it hits bricks 
	public void reverseY(){
		yVelocity -= yVelocity;
	}
	//constructor(s):
	
	//methods:

}
