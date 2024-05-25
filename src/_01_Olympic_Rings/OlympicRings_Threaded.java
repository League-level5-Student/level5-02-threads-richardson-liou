package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot blue = new Robot(200, 450);
		Robot yellow = new Robot(450, 650);
		Robot black = new Robot(700, 450);
		Robot green= new Robot(950, 650);
		Robot red = new Robot(1200, 450);
		
		blue.setPenColor(Color.blue);
		yellow.setPenColor(Color.yellow);
		black.setPenColor(Color.black);
		green.setPenColor(Color.green);
		red.setPenColor(Color.red);
		blue.penDown();
		yellow.penDown();
		black.penDown();
		green.penDown();
		red.penDown();
		
		blue.setSpeed(100);
		
		Thread blueCirc = new Thread(()-> {
			for(int i = 0; i < 360; i++) {
				blue.move(2);
				blue.turn(1);
			}
		});
		
		blueCirc.run();
	}
	
}

