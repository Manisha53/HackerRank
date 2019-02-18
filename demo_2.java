import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class demo_2 extends Applet{
		public void init(){
			resize(300,300);
			setBackground(Color.BLUE);
		}

		public void paint(Graphics g){
		g.drawString("The applet size has be resized to 300,300",50,150); //location of the text in applet
	}
}
/*																		//no need to create a separate html file
<applet code="demo_2.class" width ="800" height = "800">  //size of applet
		
	</applet>
*/

