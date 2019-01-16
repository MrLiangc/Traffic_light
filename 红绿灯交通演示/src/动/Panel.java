package 动;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;


public class Panel extends JPanel  implements Runnable{
	  static int u=0;   
	  static int d=0;   
	  static int l=1;   
	  static int r=0;   
	  static int Carmove1=0;  
	  static int Carmove2=46;
	  static int Carmove3=0;
	  static int Carmove5=30;
	  static int Carmove401=56;
	  static int Carmove402=41;
	  static int Personmove4=140;
	  static int flag1=0;  
	  static int flag2=0;
	  static int flag3=1;
	  static int flag4=0;
	  static int flag40=1;
	  static int lab_space=12000;
	  final int CAR1_SPEED=10;  
	  final int CAR2_SPEED=16;
	  final int CAR3_SPEED=16;
	  final int CAR4_SPEED=12;
	  final int CAR5_SPEED=21;
	  final int PERSON4_SPEED=5;
	  
	  
      ChangeCar3 car3=new ChangeCar3();  
      Thread t3=new Thread(car3);
      ChangeCar402 car5=new ChangeCar402();
   	  Thread t5=new Thread(car5);
   	  Ready a=new Ready();
 	  Thread at=new Thread(a);

		 final ImageIcon imageIcon = new ImageIcon("road.jpg"); 
		 Image img = imageIcon.getImage();  
		 final ImageIcon imageIcon1 = new ImageIcon("1.png");
		 Image img1 = imageIcon1.getImage(); 
		 final ImageIcon imageIcon2 = new ImageIcon("2.jpg");
		 Image img2 = imageIcon2.getImage(); 
		 final ImageIcon imageIcon3 = new ImageIcon("3.jpg");
		 Image img3 = imageIcon3.getImage(); 
		 final ImageIcon imageIcon4 = new ImageIcon("4.jpg");
		 Image img4 = imageIcon4.getImage(); 
		   final ImageIcon imageIcon5 = new ImageIcon("501.jpg");//增加的车 
		   Image img5 = imageIcon5.getImage();  
		 final ImageIcon imageIcon501 = new ImageIcon("501.png");
		 Image img501 = imageIcon501.getImage(); 
		 final ImageIcon imageIcon502 = new ImageIcon("502.jpg");
		 Image img502 = imageIcon502.getImage(); 
		 final ImageIcon imageIcona = new ImageIcon("a.jpg");
		 Image imga = imageIcona.getImage(); 
		 final ImageIcon imageIconb = new ImageIcon("b.jpg");
		 Image imgb = imageIconb.getImage(); 
		 final ImageIcon imageIconc = new ImageIcon("c.jpg");
		 Image imgc = imageIconc.getImage(); 
		 final ImageIcon imageIcond = new ImageIcon("d.jpg");
		 Image imgd = imageIcond.getImage(); 
		 final ImageIcon imageIcone = new ImageIcon("e.jpg");
		 Image imge = imageIcone.getImage(); 
		 final ImageIcon imageIconf = new ImageIcon("f.jpg");
		 Image imgf = imageIconf.getImage();  
		 
	  public Panel() {   
		  this.setOpaque(false);  //设置组件的周围的颜色变透明，与外部组件融合
		  this.setLayout(null);   //设置布局管理器为默认值，用来自己布局和管理
	      this.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));  //设置边框的凹下去的效果
	      this.setBackground(Color.WHITE); 	//设置背景颜色      
	      
	      new Thread(this).start();  //将这些功能加入线程
	   
	  }
	 
	public class Ready implements Runnable{
		  public void run(){
		  
		    ChangeLab  lab=new ChangeLab();   //灯的进程
	     	ChangeCar1 car1=new ChangeCar1(); // 左车的进程
	     	ChangeCar2 car2=new ChangeCar2();// 右车的进程
	     	
	     	Thread t=new Thread(lab);
	     	Thread t1=new Thread(car1);
	     	Thread t2=new Thread(car2);
	     	t.start();
	     	t1.start();  
	     	t2.start();
	     	
	     	ChangePerson4 person1=new ChangePerson4();//行人的进程
	     	Thread t3=new Thread(person1);
	     	t3.start();
	     	
	     	ChangeCar401 car4=new ChangeCar401(); //下路车的进程
	     	Thread t4=new Thread(car4);
	        t4.start();
	        
	        ChangeCar5 car5=new ChangeCar5(); //增加路车的进程
	     	Thread t5=new Thread(car5);
	        t5.start();
	     	
		  
		  }
	  }
	
      public void DrawCar1(Graphics g){
          g.setColor(Color.BLACK); 
          g.drawImage(img1,Carmove1*CAR1_SPEED,443,60,43,null); //
	  }
	  
      public void DrawCar2(Graphics g){
         g.setColor(Color.BLACK); 
         g.drawImage(img2,Carmove2*CAR2_SPEED,313,60,43,null);
	  }
      public void DrawCar3(Graphics g){
          g.setColor(Color.BLACK); 
          g.drawImage(img3,320,Carmove3*CAR3_SPEED,45,36,null);
 	  }
      public void DrawCar401(Graphics g){
          g.setColor(Color.BLACK); 
          g.drawImage(img501,492,Carmove401*CAR4_SPEED,45,36,null);
 	  }
      
      public void DrawCar5(Graphics g){
          g.setColor(Color.BLACK); 
          g.drawImage(img501,450,Carmove5*CAR5_SPEED,45,36,null);
 	  }
      
      
      public void DrawCar402(Graphics g){
          g.setColor(Color.BLACK); 
          g.drawImage(img502,Carmove402*CAR4_SPEED,450,45,36,null);
 	  }
      public void Drawperson(Graphics g){
          g.setColor(Color.BLACK); 
          g.drawImage(img4,Personmove4*PERSON4_SPEED,210,50,36,null);
 	  }
      
      
      
	 public void paint(Graphics g) {   //界面布局
		  g.drawImage(imageIcon.getImage(), 0, 0,this);	
		  g.drawImage(imge, 35, 0,200,150,this);
		  g.drawImage(imgf, 555, 0,200,150,this);
		  for(int i=0;i<3;i++){
		  g.drawImage(imga, -20+i*90, 160,100,100,this);	
		  g.drawImage(imgb, -20+i*90, 550,100,100,this);	
		  }
		  for(int j=0;j<2;j++){
		  g.drawImage(imgc, 555+j*120, 150,100,100,this);
		  g.drawImage(imgd, 555+j*120, 550,100,100,this);
		  }

		  DrawCar1(g);
		  DrawCar2(g);
		  DrawCar5(g);
		  
		  if(flag1==1) DrawCar3(g);
		  Drawperson(g);
		  DrawCar401(g);
		  DrawCar5(g);
		  DrawLab(g);
		  if(flag2==1) DrawCar402(g);
		  
		  String s="当前红绿灯切换间隔为"+lab_space+"ms";
		  g.setColor(Color.RED);
		  g.drawString(s, 0, 20);
		  

		  //DrawCar2(g);
	  }
	 
	   public void run(){
	    	 while (true) {
	    		 
	             try {   
	            	  repaint();
	                 	if(lab_space<=1500) lab_space=1500;
						if(lab_space>=24000) lab_space=24000;
					Thread.sleep(50);
	                 //System.out.println("I am repaint run");
	             }
	             
	             catch (InterruptedException e) {     //捕获中断异常
	                  // TODO Auto-generated catch block   
	                   
	             }  
	      }
	   }
	 
	  public void DrawLab(Graphics g){    //灯的布局
		  paintArcUp(g, 330, 260);

	      paintArcDown(g, 470, 510);

	      paintArcLeft(g, 280, 450);

	      paintArcRight(g, 510, 330);   

	  }
	 
		 
		  
		  public void paintArcUp(Graphics g,int x,int y){
			  Color c;
			  if(u==1) c=Color.green; //上路灯的变化
			  else c=Color.red;
		
			  g.setColor(Color.GRAY);
			  g.fillRect(x-40, y, 110, 30);
			  g.setColor(c);
			  g.fillArc(x, y, 30, 30, 0, 360);
			  g.fillArc(x+40, y, 30, 30, 0, 360);
			  
			  if(c==Color.RED){
				  g.setColor(Color.GREEN);
				  g.fillArc(x-40, y, 30, 30, 0, 360);
			  }
			  else{
				  g.setColor(Color.RED);
				  g.fillArc(x-40, y, 30, 30, 0, 360);
			  }
		      
			
		      paintLeft(g, x+40, y);
		      paintRight(g, x-40, y);
		      paintDown(g, x, y);
		  }
		  
		  
		  
		  public void paintArcDown(Graphics g,int x,int y){
			  Color c;
			  if(d==1) c=Color.green;  //下路灯的变化
			  else c=Color.red;

			  g.setColor(Color.GRAY);  //设置前景颜色
			  g.fillRect(x-40, y, 110, 30); //填充矩阵颜色
			  
			  g.setColor(c);
			  g.fillArc(x, y, 30, 30, 0, 360);
			  g.fillArc(x-40, y, 30, 30, 0, 360);
			  
			  if(c==Color.RED){
				  g.setColor(Color.GREEN);
				  g.fillArc(x+40, y, 30, 30, 0, 360);
			  }
			  else{
				  g.setColor(Color.RED);
				  g.fillArc(x+40, y, 30, 30, 0, 360);
			  }
			  
			  
			  
		      paintLeft(g, x+40, y);
		      paintRight(g, x-40, y);
		      paintUp(g, x, y);
		     

		  }
        public void paintArcLeft(Graphics g,int x,int y){
      	  Color c;
      	  if(l==1) c=Color.green;
			  else c=Color.red;
   
		  
      	  g.setColor(Color.GRAY);
			  g.fillRect(x, y-40, 30, 110);
			  g.setColor(c);
			  g.fillArc(x, y, 30, 30, 0, 360);
			  g.fillArc(x, y-40, 30, 30, 0, 360);
			  if(c==Color.RED){
				  g.setColor(Color.GREEN);
				  g.fillArc(x, y+40, 30, 30, 0, 360);
			  }
			  else{
				  g.setColor(Color.RED);
				  g.fillArc(x, y+40, 30, 30, 0, 360);
			  }
			  
			  
		      paintUp(g, x, y-40);
		      paintDown(g, x, y+40);
		      paintLeft(g, x, y);
		  
        }
        public void paintArcRight(Graphics g,int x,int y){
      	  Color c;
      	  if(r==1)  
      		  c=Color.green;  
			  else c=Color.red;
  
      	      g.setColor(Color.GRAY);
			  g.fillRect(x, y-40, 30, 110);
			  g.setColor(c);
			  g.fillArc(x, y, 30, 30, 0, 360);
			  g.fillArc(x, y+40, 30, 30, 0, 360);
			  if(c==Color.RED){
				  g.setColor(Color.GREEN);
				  g.fillArc(x, y-40, 30, 30, 0, 360);
			  }
			  else{
				  g.setColor(Color.RED);
				  g.fillArc(x, y-40, 30, 30, 0, 360);
			  }
			  
			  
			  paintUp(g, x, y-40);
		      paintDown(g, x, y+40);
		      paintRight(g, x, y);
        }

 
		  public void paintUp(Graphics g,int x,int y){
			  g.setColor(Color.BLACK);
			  g.drawLine(x+15, y, x+15, y+30);
			  g.drawLine(x+15, y, x+8, y+15);
			  g.drawLine(x+15, y, x+22, y+15);
		  }
		  public void paintDown(Graphics g,int x,int y){
			  g.setColor(Color.BLACK);
			  g.drawLine(x+15, y, x+15, y+30);
			  g.drawLine(x+15, y+30, x+8, y+15);
			  g.drawLine(x+15, y+30, x+22, y+15);
		  }
		  public void paintLeft(Graphics g,int x,int y){
			  g.setColor(Color.BLACK);
			  g.drawLine(x+30, y+15, x, y+15);
			  g.drawLine(x+30, y+15, x+15, y+8);
			  g.drawLine(x+30, y+15, x+15, y+22);
		  }
		  public void paintRight(Graphics g,int x,int y){
			  g.setColor(Color.BLACK);
			  g.drawLine(x+30, y+15, x, y+15);
			  g.drawLine(x, y+15, x+15, y+8);
			  g.drawLine(x, y+15, x+15, y+22);
		  }
		  
		  
	

public class ChangeLab implements Runnable{


	public void run() {
		// TODO Auto-generated method stub
		 while (true) {
			    
                try {   
                	 if(u==1&&d==0&&l==0&&r==0){
                		 u=0;d=0;l=1;r=0;
                	 }
                	 else  if(u==0&&d==0&&l==1&&r==0){
                		 u=0;d=1;l=0;r=0;
                	 }
                	 else  if(u==0&&d==1&&l==0&&r==0){
                		 u=0;d=0;l=0;r=1;
                	 }
                	 else  if(u==0&&d==0&&l==0&&r==1){
                		 u=1;d=0;l=0;r=0;
                	 }
                     Thread.currentThread();
					Thread.sleep(lab_space);
				
                     //System.out.println("当前的红绿等切换速度为"+lab_space+"ms");
                }
                
                catch (InterruptedException e) {     
                     // TODO Auto-generated catch block   
                    
                }  
         }
	}
}

public class ChangeCar1 implements Runnable{

     public void run(){
    	 while (true) {
             
             try {   
            	 if((!(Carmove1>=14&&l==0))||(Carmove1>=21))  {Carmove1++;}
                  Thread.currentThread();
				Thread.sleep(200);
                  //System.out.println(Carmove1);
           
             }
             
             catch (InterruptedException e) {     
                  // TODO Auto-generated catch block   
                   
             }  
      }
     }
}

public class ChangeCar2 implements Runnable{

    public void run(){
   	 while (true) {
            
            try {   
				if(!(Carmove2<=39&&r==0)||(Carmove2<34))   //车子的p操作
				{ Carmove2--;}
                 Thread.currentThread();
				Thread.sleep(200);  //车子的v操作
                 //System.out.println(Carmove2);
            }
            
            catch (InterruptedException e) {     
                 // TODO Auto-generated catch block   
                  
            }  
     }
    }
}

public class ChangeCar3 implements Runnable{

    public void run(){
   	 while (true) {
            
            try {   
            	 if((!(Carmove3>=10&&u==0))||(Carmove3>=13))  {Carmove3++;}
                 Thread.currentThread();   //获得当前线程的引用
				Thread.sleep(200);
                 //System.out.println(Carmove3);
            }
            
            catch (InterruptedException e) {     
                 // TODO Auto-generated catch block   
                  
            }  
     }
    }
}


//增加的车
public class ChangeCar5 implements Runnable{

    public void run(){
   	 while (true) {
            
            try {   
            	 if((Carmove5<=50&&d==0)||Carmove5<=44) {Carmove5--;}
                Thread.currentThread();
				Thread.sleep(200);
                 //System.out.println(Carmove3);
            }
            
            catch (InterruptedException e) {     
                 // TODO Auto-generated catch block   
                  
            }  
     }
    }
}

public class ChangeCar401 implements Runnable{

    public void run(){
   	 while (true) {
            
            try {   
            	 if(!(Carmove401<=50&&d==1)||Carmove401<=44) {Carmove401--;}
            	 if(Carmove401>38){flag2=0;}
            	 
            	 if(Carmove401==38) {flag2=1;Carmove401=-100;Carmove402=41;}
            	 if(flag2==1&&flag3==1){t5.start();flag3=0;}
                 Thread.currentThread();
				Thread.sleep(200);
                 //System.out.println(Carmove401);
            }
            
            catch (InterruptedException e) {     
                 // TODO Auto-generated catch block   
                  
            }  
     }
    }
}

public class ChangeCar402 implements Runnable{

    public void run(){
   	 while (true) {
            
            try {   
            	 if(Carmove401<=-100) Carmove402++;
                 Thread.currentThread();
				Thread.sleep(200);
                 //System.out.println(Carmove402);
            }
            
            catch (InterruptedException e) {     
                 // TODO Auto-generated catch block   
                  
            }  
     }
    }
}
public class ChangePerson4 implements Runnable{

    public void run(){
   	 while (true) {
            
            try {   
            	 if(!(Personmove4>=104&&u==1)) Personmove4--;
                 Thread.currentThread();
				Thread.sleep(200);
                 //System.out.println(Carmove3);
            }
            
            catch (InterruptedException e) {     
                 // TODO Auto-generated catch block   
                  
            }  
     }
    }
}


}

	
	

	
	
	



	