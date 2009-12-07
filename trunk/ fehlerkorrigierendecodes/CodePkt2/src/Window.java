import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Window extends JFrame implements ActionListener{

	private final static String TITEL = "Fehlerkorrigierende Codes";
	private JTextArea jtaOutput;

	
	public Window() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setResizable(false);
		setLocationByPlatform(true);
		setTitle(TITEL);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		createSurface();
		setSize(600, 600);	
	}
	
	private void textArea(int x, int y) {
		jtaOutput = new JTextArea();
		jtaOutput.setLineWrap(true);
		jtaOutput.setWrapStyleWord(true);
		jtaOutput.add(new Scrollbar());
		ScrollPane sc = new ScrollPane();
		sc.setSize(x, y);
		sc.add(jtaOutput);
		add(sc);
	}
	
	private void createSurface(){
		textArea(100,90);
		//add(panel);
		//pack();
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand().equals("calc")){
			int number, gf;
			try{
				System.out.println("fehlt noch");
				//jtaOutput.setText(Blockcodes.methodenname);
			}catch(IllegalArgumentException e){
				jtaOutput.setText("ERROR: " + e.getMessage());
			}catch(Exception e){
				jtaOutput.setText("WRONG INPUT");
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		Window w = new Window();
	}

}
