package test02;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class MainFrame extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;

	
	private JButton threadBtn=new JButton("START");

	private Panel pan=new Panel();
	MyJLabel [] mylb = new MyJLabel[3];

	public MainFrame(){
		this.setTitle("¿Ë∆Ã");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp=this.getContentPane();
		cp.setLayout(new BorderLayout(10, 10));
		
		pan.setLayout(new GridLayout(1, 3));
		
		for(int i=0;i<mylb.length;i++){
			mylb[i]=new MyJLabel();
			pan.add(mylb[i]);
		}
		
		this.add(pan, BorderLayout.CENTER);
		this.add(threadBtn, BorderLayout.SOUTH);
		
		threadBtn.addActionListener(this);
		this.setSize(400, 300);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		Object obj=event.getSource();
		
		if(obj==threadBtn){
			if(threadBtn.getText().equals("START")){
				threadBtn.setText("STOP");
				
				Thread[] thread=new Thread[3];
				for(int i=0; i<mylb.length; i++){
					thread[i]=new Thread(mylb[i]);
					mylb[i].setIsRun(true);			
				}
				for(int i=0; i<mylb.length; i++){
					thread[i].start();
				}
			}else{
				threadBtn.setText("START");
				for(int i=0; i<mylb.length; i++){
					mylb[i].setIsRun(false);			
				}
				if(mylb[0].getText().equals(mylb[1].getText())){
					if(mylb[0].getText().equals(mylb[2].getText())){
						JOptionPane.showMessageDialog(null,"Ω¬∏Æ«œºÃΩ¿¥œ¥Ÿ.","Ω¬∫Œ∞·∞˙",JOptionPane.INFORMATION_MESSAGE);
					}else{
						JOptionPane.showMessageDialog(null,"∆–πË«œºÃΩ¿¥œ¥Ÿ.","Ω¬∫Œ∞·∞˙",JOptionPane.INFORMATION_MESSAGE);
					}
				}else{
					JOptionPane.showMessageDialog(null,"∆–πË«œºÃΩ¿¥œ¥Ÿ.","Ω¬∫Œ∞·∞˙",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
	}
	
}
