package lab14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ControlPanel extends JPanel {
	private JButton redButton;
	private JButton blueButton;
	private JButton clearButton;
	private Canvas canvasRef;
	
	public void setCanvas(Canvas canvasRef) {
		this.canvasRef = canvasRef;
	}
	
	public ControlPanel() {
		redButton = new JButton("red");
		redButton.addActionListener( new redAction() );
		
		blueButton = new JButton("blue");
		blueButton.addActionListener( new blueAction() );
		
		clearButton = new JButton("clear"); 
		clearButton.addActionListener( new clearAction() );
		
		add( redButton );
		add( blueButton );
		add( clearButton );
	}
	
	class redAction implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("red button");
			canvasRef.addRed();
		}
	}
	
	class blueAction implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("blue button");
			canvasRef.addBlue();
		}
	}
	
	class clearAction implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("clear button");
			canvasRef.clear();
		}
	}

}
