import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class window extends JFrame{
	int ON=0,i=0,j=0,k=0,count=0,num=1,R=0; 
	JButton button1,button2,button3,button4,button5;
	JTextField file1,file2,file3;
	JTextArea file;
	FlowLayout flow;
	String a,b,c;
	window(String name){
		file1=new JTextField(2);
		file2=new JTextField(2);
		file3=new JTextField(2);
		file1.setEditable(false);
		file2.setEditable(false);
		file3.setEditable(false);
		file=new JTextArea(10,8);
		file.setEditable(false);
		button1=new JButton("��ʼ");
		button2=new JButton("��ͣ");
		button3=new JButton("����");
		button4=new JButton("��¼");
		button1=new JButton("��ռ�¼");
		
		flow=new FlowLayout();
		flow.setAlignment(FlowLayout.LEFT);
		
		flow.setHgap(20);
		flow.setVgap(10);
		
		setTitle(name);
		setSize(210,400);
		
		setLayout(flow);
		add(file1);
		add(new JLabel(":"));
		add(file2);
		add(new JLabel(":"));
		add(file3);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(file);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		file1.setText("0");
		file2.setText("0");
		file3.setText("0");
		
		validate();
		button1.addActionListener(new ActionListener(){
			 public void  actionPerformed(ActionEvent e) {  
		          ON=1;  //       ��ʼ����ͣ���ƿ��� 
		     }  
			
		});//��ʼ����
		button2.addActionListener(new ActionListener() {  

		     public void actionPerformed(ActionEvent e){  
		          ON=0;  
		     }  
		}); //��ͣ��ť 
		
		button3.addActionListener(new ActionListener() {  

		     public void actionPerformed(ActionEvent e){  
		          R=1;  //      ������ƿ��� 
		     }  
		}); //     ���㰴ť 
		
		button4.addActionListener(new ActionListener() {  
		     public void actionPerformed(ActionEvent  e)  
		     {  
		          count  =1;  //       ��¼���ƿ��� 		     
		          a=String.valueOf( i );  
	              b=String.valueOf( j  );  
	              c=String.valueOf( k);  
	               }  
	}); //     ��¼��ť 	
		
		button5.addActionListener(new ActionListener() {  
            public void actionPerformed(Action e)  
            {  
                 file.setText("");  
                 num=1;  
            }
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}  
    }); //     �����¼��ť 
		
		while(true)  
        {  
             validate();  
             if ( ON==1) //       ��ʼ����ͣ�ж� 
             {  
                  file1.setText(String.valueOf( i ));  
                  file2.setText(String.valueOf( j  ));  
                  file3.setText(String.valueOf( k ));  
                  if ( k==99)  
                  {  
                	  k=-1;  
                      j++;  
                  } 
                  if( j==60)  
                  {  
                      k=0;  
                      j=0;  
                      i++;  
                  }  
                  if( i==24)  
                  {  
                      i=0;  
                      j=0;  
                      k=0;  
                  }  
                  try{  
                      Thread.sleep  (10);  
                     }catch(Exception  e){  
                  }  
                  k++;  
             }  
             if( count==1)//           ��¼�ж� 

             {  
                   file.append(String.valueOf( num));  
                   file.append(".  ");  
                   file.append(a);  
                   file.append(":");  
                   file.append(b);  
                   file.append(":");  
                   file.append(c);  
                   file.append("\n");  
                   num++;  
                   count  =0;  
             }  
             if( R==1)//        �����ж� 
             {  
                   i=j=k=0;  
                   file1.setText(String.valueOf( i ));  
                   file2.setText(String.valueOf( j  ));  
                   file3.setText(String.valueOf( k ));  
                    R=0;  
             }  
             
        }  

}               
	}
