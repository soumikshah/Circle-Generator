package lab14;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class MainApp extends JFrame {
	private Canvas canvas;
	private ControlPanel controlPanel;
	
	public MainApp() {
		canvas = new Canvas(5);
		controlPanel = new ControlPanel();
		
		controlPanel.setCanvas( canvas );
		
		add( canvas );
		add( controlPanel );
	}
	
	static public void main(String[] args) {
		MainApp app = new MainApp();
		app.setLayout( new GridLayout(2,1) );
		app.setSize(400, 400);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
