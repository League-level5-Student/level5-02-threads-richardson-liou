package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	static boolean winner = true;
	public static void main(String[] args) {
	Robot[] arr = {new Robot(100,700), new Robot(200,700), new Robot(300,700), new Robot(400,700), new Robot(500,700)};
	Thread rob1 = new Thread(()->{
		while(AdvancedRobotRace.winner) {
		Random r = new Random();
		arr[0].setSpeed(r.nextInt(3)+1);
		arr[0].move(r.nextInt(50));
		if(arr[0].getY()<250&&winner) {
			winner = false;
			arr[0].move(200);
		}
		}
	});
	Thread rob2= new Thread(()->{
		while(AdvancedRobotRace.winner) {
		Random r = new Random();
		arr[1].setSpeed(r.nextInt(3)+1);
		arr[1].move(r.nextInt(50));
		if(arr[1].getY()<250&&winner) {
			winner = false;
			arr[1].move(200);
		}
		}
	});
	Thread rob3 = new Thread(()->{
		while(AdvancedRobotRace.winner) {
		Random r = new Random();
		arr[2].setSpeed(r.nextInt(3)+1);
		arr[2].move(r.nextInt(50));
		if(arr[2].getY()<250&&winner) {
			winner = false;
			arr[2].move(200);
		}
		}
	});
	Thread rob4 = new Thread(()->{
		while(AdvancedRobotRace.winner) {
		Random r = new Random();
		arr[3].setSpeed(r.nextInt(3)+1);
		arr[3].move(r.nextInt(50));
		if(arr[3].getY()<250&&winner) {
			winner = false;
			arr[3].move(200);
		}
		}
	});
	Thread rob5 = new Thread(()->{
		while(AdvancedRobotRace.winner) {
		Random r = new Random();
		arr[4].setSpeed(r.nextInt(3)+1);
		arr[4].move(r.nextInt(50));
		if(arr[4].getY()<250&&winner) {
			winner = false;
			arr[4].move(200);
			
		}
		}
	});
	rob1.start();
	rob2.start();
	rob3.start();
	rob4.start();
	rob5.start();

}
}

