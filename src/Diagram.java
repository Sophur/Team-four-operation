import java.awt.Color;  
import java.awt.Graphics;  
import java.awt.Graphics2D;  
import java.util.Random;  
  
import javax.swing.JFrame;  
  
public class Diagram extends JFrame{  
  
    //绘制柱形统计图  
    private Random ran;  
    public Diagram(){  
        super();  
        ran = new Random();  
        setTitle("成绩柱状图");  
        setBounds(100, 100, 400, 271);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  
    @Override  
    public void paint(Graphics g){  
        int Width = getWidth();  
        int Height = getHeight();  
        int leftMargin = 20;//柱形图左边界  
        int topMargin = 50;//柱形图上边界  
        Graphics2D g2 = (Graphics2D) g;  
        int ruler = Height-topMargin-5;  
        int rulerStep = ruler/10;//将当前的高度评分为10个单位  
        g2.setColor(Color.WHITE);//绘制白色背景  
        g2.fillRect(0, 0, Width, Height);//绘制矩形图  
        g2.setColor(Color.black);  
       /* for(int i=0;i<=10;i++){//绘制黑色横线和百分比  
            g2.drawString((100-10*i)+"分", 5, topMargin+rulerStep*i);//写下百分比  
            g2.drawLine(5, topMargin+rulerStep*i, Width, topMargin+rulerStep*i);//绘制黑色横线  
        }  */
        g2.setColor(Color.blue); 
        int grade[]= {60,40,100};
        for(int i=0;i<grade.length;i++){//绘制柱形图  
            //int value = ran.nextInt(Height-topMargin-10)+10;//随机产生柱形的百分比  
        	int value=(grade[i]/10)*rulerStep;  //矩形的高
        	int value1=grade[i];
            int step = (i+1)*40;//设置每隔柱形图的水平间隔为40  
             //绘制圆角矩形
            /*
             * drawRoundRect(int x,int y,int width, int height, int arcWidth, int arcHeight)：
             * 是用线围起来的圆角矩形。其中参数x和y指定矩形左上角的位置；参数width和heigth是矩形的宽和高；
             * arcWidth和arcHeight分别是圆角弧的横向直径和圆角弧的纵向直径。
             * fillRoundRect(int x,int y,int width,int height,int arcWidth,int archeight)：
             *是用预定的颜色填充的圆角矩形。各参数的意义同前一个方法。
             * */
            //g2.drawRoundRect(leftMargin+step*2, Height-value, 40, value, 40, 10); 
            
            g2.fillRect(leftMargin+step*2, Height-value, 40, value*3);  
            //纵轴的编号  
            g2.drawString("第"+(i+1)+"轮"+grade[i]+"分", leftMargin+step*2, Height-value-5);  
        }  
    }  
    /*public static void main(String[] args) {  
        Diagram demo = new Diagram();  
        demo.setVisible(true);  
    }  */
}  

