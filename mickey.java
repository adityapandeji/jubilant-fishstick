import java.awt.*;
import java.awt.event.*;

public class mickey extends WindowAdapter implements MouseListener{

	// declare variables
	Frame f;
	Label l;

	//Constructor
	mickey(){
		f = new Frame();
		f.setVisible(true);
		f.setLayout(null);
		f.setSize(600,600);
		f.setBackground(Color.CYAN);
		f.setTitle("Assignment Two");
		
		
		init();
		addComponent();
		f.addWindowListener(this);
		f.addMouseListener(this);
	}
	
	//init()
	public void init() {
		l = new Label();
		l.setBounds(100,100,200,50);
		
		l.addMouseListener(this);
	}
	
	public void addComponent() {
		f.add(l);
	}
	
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}
	
	public void mouseReleased(MouseEvent e) {
		f.setBackground(Color.green);
		l.setText("Mouse released");
	}
	
	public void mousePressed(MouseEvent e) {
		f.setBackground(Color.yellow);
		l.setText("Mouse pressed");
	}
	
	public void mouseEntered(MouseEvent e) {
		f.setBackground(Color.MAGENTA);
		l.setText("Mouse Entered");
	}
	public void mouseExited(MouseEvent e) {
		f.setBackground(Color.BLACK);
		l.setText("Mouse exited");
	}
	
	public void mouseClicked(MouseEvent e) {
		f.setBackground(Color.red);
		l.setText("Mouse clicked");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mickey();
	}

}