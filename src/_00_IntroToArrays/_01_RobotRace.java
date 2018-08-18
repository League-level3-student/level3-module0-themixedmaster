package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
		Robot [] array = new Robot[5];
		//3. use a for loop to initialize the robots.
		for(int x = 4;x > -1;x--){
			array[x]= new Robot();
		}
			//4. make each robot start at the bottom of the screen, side by side, facing up
		array[0].setX(500);
		array[0].setY(450);
		array[1].setX(400);
		array[1].setY(450);
		array[2].setX(600);
		array[2].setY(450);
		array[3].setX(300);
		array[3].setY(450);
		array[4].setX(200);
		array[4].setY(450);
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		while(array[0].getY()>0 && array[1].getY()>0 && array[2].getY()>0 && array[3].getY()>0 && array[4].getY()>0){
			for(int x = 4;x > -1;x--){
				Random r = new Random();
				array[x].setSpeed(1000000);
				int t = r.nextInt(50)-1;
				array[x].move(t);
				array[x].turn(5);
			}
		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		
		//7. declare that robot the winner and throw it a party!
    	System.out.println("The blue robot wins!!!");
    	for(int x = 4;x > -1;x--){
    		if(array[x].getX()>1){
    			array[x].sparkle();
    		}
    	}
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
