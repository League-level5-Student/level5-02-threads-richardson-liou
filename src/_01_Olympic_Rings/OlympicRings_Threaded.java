package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot blue = new Robot(350, 450);
		Robot yellow = new Robot(475, 575);
		Robot black = new Robot(600, 450);
		Robot green= new Robot(725, 575);
		Robot red = new Robot(850, 450);
		
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
		
		Thread yellowCirc = new Thread(()-> {
			for(int i = 0; i<360; i++) {
				yellow.move(2);
				yellow.turn(1);
			}
		});
		
		Thread blackCirc = new Thread(() -> {
			for(int i = 0; i<360; i++) {
				black.move(2);
				black.turn(1);
			}
		});
		
		Thread greenCirc = new Thread(() -> {
			for(int i = 0; i< 360; i ++) {
				green.move(2);
				green.turn(1);
			}
		});
		
		Thread redCirc = new Thread(() -> {
			for(int i = 0; i< 360; i ++) {
				red.move(2);
				red.turn(1);
			}
		});
		
		blueCirc.start();
		yellowCirc.start();
		blackCirc.start();
		greenCirc.start();
		redCirc.start();
	}
	
}

