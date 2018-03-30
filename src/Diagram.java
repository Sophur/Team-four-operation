import java.awt.Color;  
import java.awt.Graphics;  
import java.awt.Graphics2D;  
import java.util.Random;  
  
import javax.swing.JFrame;  
  
public class Diagram extends JFrame{  
  
    //��������ͳ��ͼ  
    private Random ran;  
    public Diagram(){  
        super();  
        ran = new Random();  
        setTitle("�ɼ���״ͼ");  
        setBounds(100, 100, 400, 271);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  
    @Override  
    public void paint(Graphics g){  
        int Width = getWidth();  
        int Height = getHeight();  
        int leftMargin = 20;//����ͼ��߽�  
        int topMargin = 50;//����ͼ�ϱ߽�  
        Graphics2D g2 = (Graphics2D) g;  
        int ruler = Height-topMargin-5;  
        int rulerStep = ruler/10;//����ǰ�ĸ߶�����Ϊ10����λ  
        g2.setColor(Color.WHITE);//���ư�ɫ����  
        g2.fillRect(0, 0, Width, Height);//���ƾ���ͼ  
        g2.setColor(Color.black);  
       /* for(int i=0;i<=10;i++){//���ƺ�ɫ���ߺͰٷֱ�  
            g2.drawString((100-10*i)+"��", 5, topMargin+rulerStep*i);//д�°ٷֱ�  
            g2.drawLine(5, topMargin+rulerStep*i, Width, topMargin+rulerStep*i);//���ƺ�ɫ����  
        }  */
        g2.setColor(Color.blue); 
        int grade[]= {60,40,100};
        for(int i=0;i<grade.length;i++){//��������ͼ  
            //int value = ran.nextInt(Height-topMargin-10)+10;//����������εİٷֱ�  
        	int value=(grade[i]/10)*rulerStep;  //���εĸ�
        	int value1=grade[i];
            int step = (i+1)*40;//����ÿ������ͼ��ˮƽ���Ϊ40  
             //����Բ�Ǿ���
            /*
             * drawRoundRect(int x,int y,int width, int height, int arcWidth, int arcHeight)��
             * ������Χ������Բ�Ǿ��Ρ����в���x��yָ���������Ͻǵ�λ�ã�����width��heigth�Ǿ��εĿ�͸ߣ�
             * arcWidth��arcHeight�ֱ���Բ�ǻ��ĺ���ֱ����Բ�ǻ�������ֱ����
             * fillRoundRect(int x,int y,int width,int height,int arcWidth,int archeight)��
             *����Ԥ������ɫ����Բ�Ǿ��Ρ�������������ͬǰһ��������
             * */
            //g2.drawRoundRect(leftMargin+step*2, Height-value, 40, value, 40, 10); 
            
            g2.fillRect(leftMargin+step*2, Height-value, 40, value*3);  
            //����ı��  
            g2.drawString("��"+(i+1)+"��"+grade[i]+"��", leftMargin+step*2, Height-value-5);  
        }  
    }  
    /*public static void main(String[] args) {  
        Diagram demo = new Diagram();  
        demo.setVisible(true);  
    }  */
}  

