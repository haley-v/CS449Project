import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sprint0GUI {
	
	static JFrame frame;
	static JPanel panel_1;
	static JPanel panel_2;
	static JCheckBox femCheckBox;
	static JCheckBox maleCheckBox;
	static JCheckBox otherCheckBox;
	static JLabel label1;
	static JSeparator horiz_line;
	
	public static void main(String[] args) {
		
		//establish window
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create a panel element to be put inside window
		panel_1 = new JPanel();
		panel_1.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel_1.setLayout(new GridLayout(0,1));
		frame.add(panel_1, BorderLayout.CENTER);  //add panel to frame
		
		
		//label
		label1 = new JLabel("Please select gender and favorite food:");
		panel_1.add(label1);
		
		//create check boxes
		femCheckBox = new JCheckBox("Female");
		maleCheckBox = new JCheckBox("Male");
		otherCheckBox = new JCheckBox("Other");
		panel_1.add(femCheckBox);
		panel_1.add(maleCheckBox);
		panel_1.add(otherCheckBox);
		
		//line
		horiz_line = new JSeparator();
		panel_1.add(horiz_line);
		
		
		//create radio buttons
		JRadioButton pizzaButton = new JRadioButton("pizza");
		JRadioButton hamburgerButton = new JRadioButton("hamburger");
		JRadioButton hotdogButton = new JRadioButton("hotdog");
				
		//group the buttons together, so only one radio button can be selected
		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);
		
		panel_1.add(pizzaButton);
		panel_1.add(hamburgerButton);
		panel_1.add(hotdogButton);
		
		frame.pack();
		frame.setVisible(true);

	}


}
