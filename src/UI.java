
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;


public class UI implements  ActionListener{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //new Test();
        UI log1=new UI();
        log1.InitUI();
        

    }
    
    public void InitUI()
    {
    	final String a[] = {"573","71","59888","1386","61065","185","136","500544","103","7778","202","4360356","75285","749","1201","219","4383","10386","1349","18"};//,71,59888,1386,61065,185,136,500544,103,7778,202,4360356,75285,749,1201,219,4383,10386,1349,18}; 
    	final String a1[] = new String [20]; //声明并定义大小（即分配了指定大小的空间）
    	//final int sumGrade=(Integer) null;
    //1.1创建一个顶级容器，也就是空白窗口，并为此窗口设置属性（窗口名称，大小，显示位置，关闭设置）
    // 用JFrame创建一个名为frame的顶级容器
    JFrame frame=new JFrame();
    frame.setTitle("Four-arithmetic-operation");
    frame.setSize(300,600);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(3);

    
    GridLayout f1=new GridLayout(25,2);
    //FlowLayout f1=new FlowLayout(FlowLayout.LEFT);
    //frame窗口设置为f1的流式左对齐
    frame.setLayout(f1);
    

    JLabel name=new JLabel("题目：");
    frame.add(name);
    
    JLabel name2=new JLabel("答案：");
    frame.add(name2);
    
    
    //题目文本标签
    /*JLabel[] quest=new JLabel[20];
    for(int i=0;i<20;i++){ 
        quest[i]=new  JLabel(); 
        quest[i].setPreferredSize(new Dimension(80,30));
        frame.add(quest[i]); 
        
    }
    
    //答案文本框
    JTextField[] ans=new JTextField[20]; 
    for(int i=0;i<20;i++){ 
        ans[i]=new  JTextField(5); 
        frame.add(ans[i]); 
    }*/
    //1
    JLabel quest1=new JLabel("(47*13)+(96-40)-94=");
    quest1.setPreferredSize(new Dimension(80,30));
    frame.add(quest1);
    
    final JTextField ans1 =new JTextField();
    ans1.setPreferredSize(new Dimension(80,30));
    frame.add(ans1);
    //2
    JLabel quest2=new JLabel("(68+30)-(89-62)=");
    quest2.setPreferredSize(new Dimension(80,30));
    frame.add(quest2);
    
    final JTextField ans2 =new JTextField();
    ans2.setPreferredSize(new Dimension(80,30));
    frame.add(ans2);
    //3
    JLabel quest3=new JLabel("48+80*11*68=");
    quest3.setPreferredSize(new Dimension(80,30));
    frame.add(quest3);
    
    final JTextField ans3 =new JTextField();
    ans3.setPreferredSize(new Dimension(80,30));
    frame.add(ans3);
   //4
    JLabel quest4=new JLabel("50*27+63-27=");
    quest4.setPreferredSize(new Dimension(80,30));
    frame.add(quest4);
    
    final JTextField ans4 =new JTextField();
    ans4.setPreferredSize(new Dimension(80,30));
    frame.add(ans4);
    //5
    JLabel quest5=new JLabel("((17*79)+14)*45=");
    quest5.setPreferredSize(new Dimension(80,30));
    frame.add(quest5);
    
    final JTextField ans5 =new JTextField();
    ans5.setPreferredSize(new Dimension(80,30));
    frame.add(ans5);
    //6
    JLabel quest6=new JLabel("(19*13)-(86+70)+94=");
    quest6.setPreferredSize(new Dimension(80,30));
    frame.add(quest6);
    
    final JTextField ans6 =new JTextField();
    ans6.setPreferredSize(new Dimension(80,30));
    frame.add(ans6);
    //7
    JLabel quest7=new JLabel("75+85-24=");
    quest7.setPreferredSize(new Dimension(80,30));
    frame.add(quest7);
    
    final JTextField ans7 =new JTextField();
    ans7.setPreferredSize(new Dimension(80,30));
    frame.add(ans7);
    //8
    JLabel quest8=new JLabel("(43+36)*44*(87+57)=");
    quest1.setPreferredSize(new Dimension(80,30));
    frame.add(quest8);
    
    final JTextField ans8=new JTextField();
    ans8.setPreferredSize(new Dimension(80,30));
    frame.add(ans8);
    //9
    JLabel quest9=new JLabel("((28+83)-60)+52=");
    quest9.setPreferredSize(new Dimension(80,30));
    frame.add(quest9);
    
    final JTextField ans9 =new JTextField();
    ans9.setPreferredSize(new Dimension(50,30));
    frame.add(ans9);
    //10
    JLabel quest10=new JLabel("36+(98*79)=");
    quest10.setPreferredSize(new Dimension(80,30));
    frame.add(quest10);
    
    final JTextField ans10 =new JTextField();
    ans10.setPreferredSize(new Dimension(80,30));
    frame.add(ans10);
    //11
    JLabel quest11=new JLabel("(54+86)+62=");
    quest11.setPreferredSize(new Dimension(80,30));
    frame.add(quest11);
    
    final JTextField ans11=new JTextField();
    ans11.setPreferredSize(new Dimension(80,30));
    frame.add(ans11);
    //12
    JLabel quest12=new JLabel("(78*22)*(33*77)=");
    quest12.setPreferredSize(new Dimension(80,30));
    frame.add(quest12);
    
    final JTextField ans12 =new JTextField();
    ans12.setPreferredSize(new Dimension(80,30));
    frame.add(ans12);
    //13
    JLabel quest13=new JLabel("60*69*18+9*85=");
    quest13.setPreferredSize(new Dimension(80,30));
    frame.add(quest13);
    
    final JTextField ans13 =new JTextField();
    ans13.setPreferredSize(new Dimension(80,30));
    frame.add(ans13);
    
    //14
    JLabel quest14=new JLabel("(58*13)-5=");
    quest14.setPreferredSize(new Dimension(80,30));
    frame.add(quest14);
    
    final JTextField ans14 =new JTextField();
    ans14.setPreferredSize(new Dimension(80,30));
    frame.add(ans14);
    //15
    JLabel quest15=new JLabel("(13*88)+57=");
    quest15.setPreferredSize(new Dimension(80,30));
    frame.add(quest15);
    
    final JTextField ans15 =new JTextField();
    ans15.setPreferredSize(new Dimension(80,30));
    frame.add(ans15);
    //16
    JLabel quest16=new JLabel("35+2*92=");
    quest16.setPreferredSize(new Dimension(80,30));
    frame.add(quest16);
    
    final JTextField ans16 =new JTextField();
    ans16.setPreferredSize(new Dimension(80,30));
    frame.add(ans16);
    //17
    JLabel quest17=new JLabel("(43*100)+83=");
    quest17.setPreferredSize(new Dimension(80,30));
    frame.add(quest17);
    
    final JTextField ans17 =new JTextField();
    ans17.setPreferredSize(new Dimension(80,30));
    frame.add(ans17);
    //18
    JLabel quest18=new JLabel("((64*27)+3)*6=");
    quest18.setPreferredSize(new Dimension(80,30));
    frame.add(quest18);
    
    final JTextField ans18 =new JTextField();
    ans18.setPreferredSize(new Dimension(80,30));
    frame.add(ans18);
    //19
    JLabel quest19=new JLabel("71*(5+14)=");
    quest19.setPreferredSize(new Dimension(80,30));
    frame.add(quest19);
    
    final JTextField ans19 =new JTextField();
    ans19.setPreferredSize(new Dimension(80,30));
    frame.add(ans19);
    //20
    JLabel quest20=new JLabel("((92-16)+52)-83-27=");
    quest20.setPreferredSize(new Dimension(80,30));
    frame.add(quest20);
    
    final JTextField ans20 =new JTextField();
    ans20.setPreferredSize(new Dimension(80,30));
    frame.add(ans20);
    
    JButton queding=new JButton("确定");
    queding.setPreferredSize(new Dimension(80,30));
    frame.add(queding);
    
    JButton onemore=new JButton("再来一轮");
    onemore.setPreferredSize(new Dimension(120,30));
    frame.add(onemore);
    
    
    
    final JLabel grade=new JLabel("本轮分数为：");
    frame.add(grade);
    
    final JTextField grade1=new JTextField(5);
    frame.add(grade1);
    
    JButton bu3=new JButton("输出柱状图");
    bu3.setPreferredSize(new Dimension(120,30));
    frame.add(bu3);
    
    JButton bu4=new JButton("开始计时");
    bu4.setPreferredSize(new Dimension(120,30));
    frame.add(bu4);
   
    //设置窗口可见，此句一定要在窗口属性设置好了之后才能添加，不然无法正常显示
    frame.setVisible(true);
    //确定按钮的点击事件
    queding.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // 进行逻辑处理即可
            //System.out.println("触发了事件");
            a1[0]=ans1.getText();
            a1[1]=ans2.getText();
            a1[2]=ans3.getText();
            a1[3]=ans4.getText();
            a1[4]=ans5.getText();
            a1[5]=ans6.getText();
            a1[6]=ans7.getText();
            a1[7]=ans8.getText();
            a1[8]=ans9.getText();
            a1[9]=ans10.getText();
            a1[10]=ans11.getText();
            a1[11]=ans12.getText();
            a1[12]=ans13.getText();
            a1[13]=ans14.getText();
            a1[14]=ans15.getText();
            a1[15]=ans16.getText();
            a1[16]=ans17.getText();
            a1[17]=ans18.getText();
            a1[18]=ans19.getText();
            a1[19]=ans20.getText();
           /*for(int i=0;i<=20;i++){
            System.out.println(a1[i]);
           }*/
            //String sum=null;
            int sum=0;
            for(int i=0;i<20;i++){
            if(a[i].equals(a1[i])){
            	sum=sum+5;
            }else{
            	sum=sum+0;
            }
            }
            grade1.setText(String.valueOf(sum));
            //System.out.println(sum);
            
        }
    });//end of queding


    onemore.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // 进行逻辑处理即可
            System.out.println("触发了事件");
            //this.dispose();
            //System.exit(0);
           
            //InitUI frame=new InitUI();
            UI log2=new UI();
            log2.InitUI();
            
        }
    });
    
    bu4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // 进行逻辑处理即可
            System.out.println("触发了事件");
            //this.dispose();
            try {  
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());  
            } catch (Exception e1) {  
                e1.printStackTrace();  
            }  
       
            Timers frame = new Timers("计时器");  
            frame.pack();  
             frame.setVisible(true); 
            
            
        }
    });

    
    }

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

    
    

    
}
