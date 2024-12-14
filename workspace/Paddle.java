import java.awt.*;

public class Paddle {

	//your code here!
	private int width;
	private int height;
	private int x;
	private int y;
	private int Velocity;


	public Paddle(int x, int y, int width, int height){
this.x = x;
this.y = y;
this.width = width;
this.height = height;
	}



	//don't forget you need instance variables:
	// Pre-condition: height must be properly initialized
	//  Post-condition: sets the height
	public int getHeight() {
		return height;
	}
	// Pre-condition: width must be properly initialized
	//  Post-condition: returns the width variable value
	public int getWidth() {
		return width;
	}
	// Pre-condition: none
	//  Post-condition: sets the y axis on the paddle
	public void setX(int x) {
		this.x = x;
	}
	// Pre-condition: none
	//  Post-condition: sets the x axis on the paddle
	public void setY(int y) {
		this.y = y;
	}
	// Pre-condition: x must be properly initialized
	//  Post-condition: returns the x variable value
	public int getX(){
		return x;
	}
	// Pre-condition: y must be properly initialized
	//  Post-condition: returns the y variable value
	public int getY(){
		return y;
	}
	// Pre-condition: none
	//  Post-condition: returns the velocity variable value
	public int getVelocity(){
		return Velocity;
	}
	
	// Pre-condition: velocity must be properly initialzied
	//  Post-condition: sets the velocity
	public void setVelocity(int velocity){
		this.Velocity = velocity;
	}

	// Pre-condition: none
	//  Post-condition:sets the color of the paddle
	public void draw(Graphics g){
	g.setColor(Color.red);
	g.fillRect(x, y, width, height);
	}
	// Pre-condition: x and velocity must be properly initialized
	//  Post-condition: sets move with x and velocity values
	public void move (){;
		x = x + Velocity;
	}
	// Pre-condition: none
	//  Post-condition: sets addedvelocity
	public void addVelocity(int addedVelocity){
		this.Velocity  += addedVelocity;
	}
	//constructor(s):
	
	//methods:
	
	
}
