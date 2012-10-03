package MyRobots;
//import java.awt.Color;
import robocode.*;

public class Lui extends Robot{

	
	public void run() {
	
		while(true) {
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}

	
	public void onScannedRobot(ScannedRobotEvent e) {
		if (e.getDistance() > 160) {
			turnRight(e.getBearing());
			ahead(e.getDistance() - 150);
			return;
		}

		turnRight(e.getBearing());

		if (e.getEnergy() > 16) {
			fire(3);
		} else if (e.getEnergy() > 10) {
			fire(2);
		} else if (e.getEnergy() > 4) {
			fire(1);
		} else if (e.getEnergy() > 2) {
			fire(.5);
		}else{
			fire(2);
		}

	// Gå bakover hvis man er for nær
		if (e.getDistance() < 120) {
			if (e.getBearing() > -90 && e.getBearing() <= 90) {
				back(60);
			} else {
				ahead(20);
			}
		}
		scan();
	}

}
