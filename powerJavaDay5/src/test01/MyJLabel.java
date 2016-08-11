package test01;

import java.awt.Font;
import java.util.Calendar;

import javax.swing.JLabel;

public class MyJLabel extends JLabel implements Runnable{
	
	private static long time=0;
	private boolean isRun;
	
	public MyJLabel() {
		this.setText(getTime2String());
		this.setFont(new Font("Serif",Font.BOLD,50));
		this.setHorizontalAlignment(CENTER);
	}

	public static long getTime() {
		return time;
	}
	
	public static String getTime2String() {
		int milli=(int)(time * 0.1) % 100;
		int second=(int)(time * 0.01) % 60;
		int minute=(int)(time * 0.01)/60 % 60;
		int hour=(int)(time * 0.01)/3600 % 60;
		
		return String.format("%02d : %02d : %02d : %02d", hour, minute, second, milli);
	}

	public static void setTime(long time) {
		MyJLabel.time = time;
	}

	public synchronized void setIsRun(boolean flag){
		isRun=flag;
	}

	@Override
	public void run() {

		Calendar now=Calendar.getInstance();
		time=now.getTimeInMillis()/350000;
		
		while(true){
			//스레드 강제종료
			if(isRun==false){
				this.setText(getTime2String());
				return;
			}
			time++;
			this.setText(getTime2String());
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
