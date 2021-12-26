package util;

public class WaitHelper {

	public void waitForSomeTime(int waitTime) {
		waitTime = waitTime*1000;
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
