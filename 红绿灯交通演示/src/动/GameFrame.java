package 动;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class GameFrame extends JFrame {
    JMenuBar menubar;
    JMenu menu1,menu2;
    JMenuItem item10,item11,item12,item13,item4,item5,item3,item21,item22,item23,item24;
   
    static int flag=1; 
    static int flag1=1;
public GameFrame(){
	final Panel p=new Panel();
	this.add(p);
    setBackground(Color.GRAY);
    setBounds(0, 0, 800, 800);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setLayout(null);
    setLocationRelativeTo(null); 
   
    
   menubar=new JMenuBar();
    menu1=new JMenu("演示");
    menu2=new JMenu("改变红绿灯");
    item10=new JMenuItem("开始演示");item10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,InputEvent.CTRL_MASK));
    item11=new JMenuItem("加入车辆");item11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,InputEvent.CTRL_MASK));
    item12=new JMenuItem("刷新");item12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,InputEvent.CTRL_MASK));
    item13=new JMenuItem("退出");item13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,InputEvent.CTRL_MASK));
    item3=new JMenuItem("随机变换红绿灯");item3.setAccelerator(KeyStroke.getKeyStroke("G"));
    item21=new JMenuItem("设置上车道绿灯");item21.setAccelerator(KeyStroke.getKeyStroke("W"));
    item22=new JMenuItem("设置左车道绿灯");item22.setAccelerator(KeyStroke.getKeyStroke("A"));
    item23=new JMenuItem("设置下车道绿灯");item23.setAccelerator(KeyStroke.getKeyStroke("S"));
    item24=new JMenuItem("设置右车道绿灯");item24.setAccelerator(KeyStroke.getKeyStroke("D"));
    item4=new JMenuItem("加快红绿灯变换速度");item4.setAccelerator(KeyStroke.getKeyStroke("K"));
    item5=new JMenuItem("减慢红绿灯变换速度");item5.setAccelerator(KeyStroke.getKeyStroke("L"));
    menu1.add(item10);
    menu1.add(item11);
    menu1.add(item12);
    menu1.add(item13);
    menu1.addSeparator();
    menu2.add(item21);
    menu2.add(item22);
    menu2.add(item23);
    menu2.add(item24);
    menu2.add(item3);
    menu2.add(item4);
    menu2.add(item5);
    menubar.add(menu1);
    menubar.add(menu2);
    setJMenuBar(menubar);
    validate();
    
    item10.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(flag1==1) p.at.start();
			flag1=0;
		}
    });
   
    item11.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			p.flag1=1;
            if(flag==1&&p.flag1==1) {p.t3.start(); flag=0;}
			if(p.Carmove3>=50) p.Carmove3=0;
		}
    	
    });
    item12.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(p.Carmove1>=80&&p.Carmove2<=0&&p.Personmove4<=0&&p.Carmove401<=38&&p.Carmove402>66){
     	    p.Carmove1=0;p.Carmove2=46;
			p.Personmove4=140;p.Carmove401=56;
			}
		}
    	
    });
    item13.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
			}
		
    	
    });
    item21.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		    p.u=1;p.d=0;p.l=0;p.r=0;
		}
    	
    });
    item22.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		    p.u=0;p.d=0;p.l=1;p.r=0;
		}
    	
    });
    item23.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		    p.u=0;p.d=1;p.l=0;p.r=0;
		}
    	
    });
    item24.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		    p.u=0;p.d=0;p.l=0;p.r=1;
		}
    	
    });
    item3.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if((p.u=(int)(Math.random()*10%2))==1){p.d=0;p.l=0;p.r=0;}
			else if((p.d=(int)(Math.random()*10%2))==1){p.l=0;p.r=0;}
			else if ((p.l=(int)(Math.random()*10%2))==1){p.r=0;}
			else {p.r=1;}
		}
    	
    });
    item4.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			if(p.lab_space>1500){
		   p.lab_space=(int)(p.lab_space*0.8);
			}
			else p.lab_space=1500;
		}
    	
    });
    
    item5.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			if(p.lab_space<24000){
			p.lab_space=(int) (p.lab_space*1.2);
			}
			else p.lab_space=24000;
		}
    	
    });
  
    

    

}
}
 

