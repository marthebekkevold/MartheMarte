package MyRobots;

import java.awt.Color;

import robocode.*;

public class MyRobot extends AdvancedRobot{

	boolean moving = true;
	
	public void run(){
		setBodyColor(Color.PINK);
		setBulletColor(Color.PINK);
		setGunColor(Color.BLACK);
		setRadarColor(Color.BLACK);
		setScanColor(Color.DARK_GRAY);
		
		setAdjustRadarForRobotTurn(true);
		setAdjustGunForRobotTurn(true);
	
		while(true){
			ahead(100);
			
		}
	}
	
	//Scanner robot
	public void onScannedEvent(ScannedRobotEvent e){
		
	}
	
	//Hva skal jeg gjøre om jeg treffer veggen
	public void onHitWallEvent(HitWallEvent e){
		if(moving){
			back(1000);
			turnGunLeft(100);
			turnLeft(100);
		}
		else{
			moving = true;
			back(1000);
			turnGunLeft(100);
			turnLeft(100);
		}
	}
	
	//Hva skal jeg gjøre om jeg bli truffet av kule?
	public void onHitByBulletEvent(HitByBulletEvent e){
		
	}
	
	//Hva skal jeg gjøre om jeg kolliderer med en annen robot?
	public void onHitRobot(HitRobotEvent e){
		
	}
	
	//Hva skal jeg gjøre anderledes om jeg døde i forrige spill?
	public void onDeath(DeathEvent e){
		
	}
	
}
