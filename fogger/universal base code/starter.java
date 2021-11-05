import pkg.*;
import java.util.ArrayList;
import java.util.Random;

public class starter implements InputControl, InputKeyControl {

	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		Car[] ac = new Car[30];
		for(int n=0;n<ac.length;n++){
			Color col = new Color(Canvas.rand(255),Canvas.rand(255),Canvas.rand(255));
			ac[n] = new Car(1,1,"AC/DC",col);
			ac[n].draw();
		}
		while(true){
			for(Car c: ac){
				c.drive(1,8);
			}
		}
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
