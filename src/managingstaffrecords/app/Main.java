package managingstaffrecords.app;

import javax.swing.JFrame;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Main frame = new Main();
		frame.setVisible(true);
 
	}
	
	public Main() {
	    setTitle("Managing Staff Records");
	    setSize(1200, 800);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    // add panels, buttons, menus here
	}

}
