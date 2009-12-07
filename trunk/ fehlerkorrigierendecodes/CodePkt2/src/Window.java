import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.peer.PanelPeer;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Window extends JFrame implements ActionListener{

	private final static String TITEL = "Fehlerkorrigierende Codes";
	//private JTextArea jtaOutput;
	//private DefaultButton dbExecute;

	
	public Window() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setResizable(false);
		setLocationByPlatform(true);
		setTitle(TITEL);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		createSurface();
		setSize(600, 600);
		
		// Inner class to terminate program.
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});//end WindowListener
	}
	
	private ScrollPane textArea(int x, int y) {
		JTextArea jtaOutput = new JTextArea();
		jtaOutput.setLineWrap(true);
		jtaOutput.setWrapStyleWord(true);
		jtaOutput.add(new Scrollbar());
		ScrollPane sc = new ScrollPane();
		sc.setSize(x, y);
		sc.add(jtaOutput);
		return sc;
	}
	
	private DefaultButton button(String name) {
		DefaultButton dbButton = new DefaultButton(name, getRootPane());
		dbButton.addActionListener(this);
		
		return dbButton;
	}
	
	private Panel panel() {
		Panel panel = new Panel();
		panel.setLayout(new GridLayout(3,2));
			panel.add(button("calc"));
		
		return panel;
	}
	
	private JRadioButton radioButton(String name, boolean selected, char keyEvent) {
	    JRadioButton defaultButton = new JRadioButton(name);
	    defaultButton.setMnemonic(keyEvent);
	    defaultButton.setActionCommand(name);
	    defaultButton.setSelected(selected);
	  
	    //Register a listener for the radio buttons.
	    defaultButton.addActionListener(this);
	    
		return defaultButton;


	}
	
	private void createSurface(){		
		add(textArea(110,85));
		add(panel());
		
		JRadioButton aButton = radioButton("option1",true, 'a');
		JRadioButton bButton = radioButton("option2",false, 'b');
		JRadioButton cButton = radioButton("option3",false, 'c');
		
	    //Group the radio buttons.
	    ButtonGroup group = new ButtonGroup();
	    group.add(aButton);
	    group.add(bButton);
	    group.add(cButton);
	    
		//Display radio buttons
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(aButton);
		getContentPane().add(bButton);
		getContentPane().add(cButton);
		setSize(250,100);
		setTitle("Swing Radio Buttons");
		setVisible(true);


	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand().equals("calc")){
			int number, gf;
			try{
				System.out.println("fehlt noch");
				//jtaOutput.setText(Blockcodes.methodenname);
			}catch(IllegalArgumentException e){
				//jtaOutput.setText("ERROR: " + e.getMessage());
			}catch(Exception e){
				//jtaOutput.setText("WRONG INPUT");
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		Window w = new Window();
	}

}
