package phoenix;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Phoenix extends JApplet{
	JLayeredPane layeredPane;
	JPanel title;
	JPanel levelSelect;
	JPanel instructions;
	JPanel settings;

	public void init(){
		layeredPane = getLayeredPane();
	}
}
