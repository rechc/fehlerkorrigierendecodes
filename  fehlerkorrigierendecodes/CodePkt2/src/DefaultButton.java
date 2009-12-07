import javax.swing.JButton;
import javax.swing.JRootPane;


public class DefaultButton extends JButton {
	private static final long serialVersionUID = 1L;
	
	public DefaultButton(String title, JRootPane rootpane) {
		super(title);
		rootpane.setDefaultButton(this);
	}
}
