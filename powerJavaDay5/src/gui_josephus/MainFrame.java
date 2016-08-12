package gui_josephus;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Format;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame extends JFrame implements ActionListener{
	
	private JLabel numLb=new JLabel("숫자 입력 : ");
	private JTextField numTxt=new JTextField();
	private JButton startBtn=new JButton("시작");
	
	private Panel pan=new Panel();
	private Panel numPan=new Panel();
	
	private JLabel label[]=new JLabel[41];
	Josephus num;
	
	public MainFrame(){
		this.setTitle("Josephus알고리즘");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp=this.getContentPane();
		cp.setLayout(new BorderLayout(10, 10));
		
		pan.setLayout(new GridLayout(1, 3));
		pan.add(numLb);
		pan.add(numTxt);
		pan.add(startBtn);
		this.add(pan, BorderLayout.NORTH);
		
		numPan.setLayout(new GridLayout(1, 41));
		for(int i=0;i<41;i++){
			label[i]=new JLabel(""+(i+1));
			label[i].setFont(new Font("Serif",Font.BOLD,20));
		}
		setLabel();
		this.add(numPan, BorderLayout.CENTER);
		
		startBtn.addActionListener(this);
		this.setSize(1500, 200);
		this.setVisible(true);
	}
	
	public void setLabel(){
		numPan.setLayout(new GridLayout(1, 41));
		int r=200;
		double x=0;
		double y=0;
		
		for(double t=0; t<360; y+=8.8){
			double rad=Math.toRadians(t);
			
			x=r*Math.sin(rad)+300;
			y=r*Math.cos(rad)+300;
			
			for(int i=0;i<41;i++){
				label[i].setBounds((int)x, (int)y, 100, 100);
				numPan.add(label[i]);
			}
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		Object obj=event.getSource();
		
		if(obj==startBtn){
			Thread thread=new Thread();
			num=new Josephus(label);
			num.setDeadNum(Integer.parseInt(numTxt.getText()));
			thread=new Thread(num);
			thread.start();
		}
	}
}
