package gui_josephus;

import java.awt.Color;
import java.awt.Font;
import java.util.LinkedList;

import javax.swing.JLabel;

public class Josephus extends LinkedList<String> implements Runnable {
	JLabel lb[];
	private int deadNum=2;
	
	public Josephus(JLabel label[]) {
		this.lb=label;
		for(int i=0; i<lb.length; i++){
			this.offer(lb[i].getText());
		}
	}
	
	public void setDeadNum(int deadNum) {
		this.deadNum = deadNum;
	}

	@Override
	public void run() {
		while(true){
			
			if(this.size()!=deadNum-1){
				for(int i=0; i<deadNum-1; i++){
					this.offer(this.get(0));
					this.poll();
				}
				int idx=Integer.parseInt(this.get(0))-1;
				lb[idx].setForeground(new Color(255,0,0));
				this.poll();
			}else{
				return;
			}
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
	}
}
