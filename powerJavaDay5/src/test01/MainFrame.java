package test01;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class MainFrame extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;

	private JButton startBtn=new JButton("시작");
	private JButton recordBtn=new JButton("기록");
	private JButton pauseBtn=new JButton("일시정지");
	private JButton stopBtn=new JButton("리셋");
	
	private JTextArea recordTxt=new JTextArea();
	private JScrollPane scrollPane = new JScrollPane(recordTxt);


	private Panel pan=new Panel();
	
	MyJLabel mylb = new MyJLabel();
	
	String record="";

	public MainFrame(){
		this.setTitle("스레드 테스트");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp=this.getContentPane();
		cp.setLayout(new BorderLayout(10, 10));
	
		
		this.add(mylb, BorderLayout.NORTH);
		this.add(scrollPane, BorderLayout.CENTER);
		
		pan.setLayout(new GridLayout(1, 4));
		pan.add(startBtn);
		pan.add(recordBtn);
		pan.add(pauseBtn);
		pan.add(stopBtn);
		this.add(pan, BorderLayout.SOUTH);
		
		startBtn.addActionListener(this);
		recordBtn.addActionListener(this);
		pauseBtn.addActionListener(this);
		stopBtn.addActionListener(this);
		this.setSize(400, 300);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		Object obj=event.getSource();
		
		if(obj==startBtn){
			Thread thread=new Thread(mylb);
			mylb.setIsRun(true);			
			thread.start();
		}
		if(obj==recordBtn){
			record+=MyJLabel.getTime2String()+"\n";
			recordTxt.setText(record);
		}
		if(obj==pauseBtn){
			mylb.setIsRun(false);			
		}
		if(obj==stopBtn){
			mylb.setIsRun(false);
			MyJLabel.setTime(0);
		}
	}
	
}
