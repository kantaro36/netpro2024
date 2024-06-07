//FacesAWTMain.java
//FacesAWTMain 目標 インナークラスのFaceObjクラスを作ってみよう。描画処理を移譲してください。
//3x3　の顔を描画してください。色などもぬってオリジナルな楽しい顔にしてください。

package guibasic;


import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FacesAWTMain {

	public static void main(String[] args){
		new FacesAWTMain();
	}

    FacesAWTMain(){
		FaceFrame f = new FaceFrame();
		f.setSize(800,800);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
			System.exit(0);}});
		f.setVisible(true);
	}

	// インナークラスを定義
	class FaceFrame extends Frame{

	private int w;
	private int h;
	private int xStart;
	private int yStart;
    private FaceObj fobj1;
	private FaceObj fobj2;
	
	FaceFrame(){
		fobj1= new FaceObj();
		fobj2 = new FaceObj();
    }

	public void paint(Graphics g) {
	// この中には、g.drawLine というのは入ってこない
	// Graphicsクラス(型のようなもの---今は--)のgという変数はメソッドに渡す
		w = 200;
		h = 200;
		xStart=50;
		yStart=50;

		FaceObj fobj= new FaceObj();
		//fobj.drawRim();
		
		drawRim(g);
		drawBrow(g, 30); 
		drawEye(g, 35);
		drawNose(g, 40);
		drawMouth(g, 100);	
	}
	
	public void drawRim(Graphics g) {  // wが横幅、hが縦幅
		g.drawLine(50, 50, 50+w, 50);
		g.drawLine(50, 50, 50, 50+h);
		g.drawLine(50, 50+h, 50+w, 50+h);
		g.drawLine(50+w, 50, 50+w, 50+h);	
	}

	public void drawBrow(Graphics g,int bx) { // xは目の幅 呼ばれる方(=定義する方)
		
	}

	public void drawNose(Graphics g, int nx) { // xは鼻の長さ
		
	}

	public void drawEye(Graphics g, int r) { // rは目の半径
		g.drawOval(xStart+45,yStart+65,r,r);
		
	}

	public void drawMouth(Graphics g, int mx) { // xは口の幅
		int xMiddle = 50 + w/2;
		int yMiddle = 50 + h - 30;
		g.drawLine(xMiddle - mx/2, yMiddle, xMiddle + mx/2, yMiddle);
	}
 }//FaceFrame end

	//Faceクラスを作ってみよう。
	private class FaceObj{
		FaceObj[] fobjs= new FaceObj[9];

for(int j=0;j<3;j++) {

    for (int i = 0; i < 3; i++) {
		fobjs[i+3*j]= new FaceObj();
        fobjs[i+3*j].setPosition(200*i+50,200*j+50);
        fobjs[i+3*j].setEmotionLevel(i,j);
        fobjs[i+3*j].drawFace(g);

		g.fillRoundRect(xStart+5,yStart+5,w-10,h-10,40,40);
		//g.setColor(Color.ORANGE);
		Color color= new Color(255,123,24,56);
		g.setColor(color);
	}
}
	}

}//Faces class end