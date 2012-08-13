import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 * @author Abhishek Chavan
 * 
 */
public class RobotTest {

	public static void main(String[] args) throws AWTException {
		Robot robot = new Robot();
		int count = 0;
		while (true) {
			count++;
			robot.keyPress(KeyEvent.VK_LEFT);
			robot.keyRelease(KeyEvent.VK_LEFT);
			robot.keyPress(KeyEvent.VK_RIGHT);
			robot.keyRelease(KeyEvent.VK_RIGHT);
			if (count > 50000) {
				break;
			}
		}
	}
}
