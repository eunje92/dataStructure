package test02;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.JLabel;

public class MyJLabel extends JLabel implements Runnable{
	
	private static int id=0;
	private int r=0;
	private int g=0;
	private int b=0;
	private boolean isRun;
	
	public MyJLabel() {
		Random rd=new Random();
		r=rd.nextInt(255);
		g=rd.nextInt(255);
		b=rd.nextInt(255);
		this.setId(id+1);
		this.setText(""+ rd.nextInt(9));
		this.setForeground(new Color(r,g,b));
		this.setFont(new Font("Serif",Font.BOLD,60));
		this.setHorizontalAlignment(CENTER);
	}
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		MyJLabel.id = id;
	}
	
	public synchronized void setIsRun(boolean flag){
		isRun=flag;
	}

	@Override
	public void run() {
		
		while(true){
			//스레드 강제종료
			if(isRun==false){
				return;
			}
			
			Random rd=new Random();
			r=rd.nextInt(255);
			g=rd.nextInt(255);
			b=rd.nextInt(255);
			this.setForeground(new Color(r,g,b));
			this.setText(""+rd.nextInt(2));
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
