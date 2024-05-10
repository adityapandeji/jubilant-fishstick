
import java.awt.*;
import java.awt.event.*;
public class keyy extends WindowAdapter implements KeyListener{
	Label l;
	TextArea t;
	Frame f;
	keyy()
	{   
		f=new Frame();
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		f.setTitle("KeyListener_Example");
		init();
		add_Component();
	}
	public void init()
	{
		
		l=new Label("Example 1");
		t=new TextArea();
		
	}
	
	public void add_Component() {
		
		
		l.setBounds(20, 50, 300, 20);
		f.add(l);
		
		t.setBounds(20, 80, 300, 300);
		f.add(t);
		
		f.addWindowListener(this); 
		t.addKeyListener(this);
	}
	
	public void windowClosing(WindowEvent e)
	
	{
		f.dispose();
	}
	
	public void keyPressed(KeyEvent k)
	{
		l.setText("Key is pressed");
	}
	
	public void keyReleased(KeyEvent k)
	{
		l.setText("Key is released");
	}
	
	public void keyTyped(KeyEvent k)
	{
		l.setText("Key is typed");
	}
	

	public static void main(String args[])
	{
		new keyy();
	}
	

}