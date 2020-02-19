import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import java.awt.Color;
 
 
public class FenetreAvecBouton extends JFrame{
	private JTextField textField;
	private JTable table;
	
	
	
	
	public JPanel buildContentPane(){
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setLayout(new FlowLayout());
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		panel.add(chckbxNewCheckBox);
		
		table = new JTable();
		panel.add(table);
		
 
		JButton bouton = new JButton("Cliquez ici !");
		panel.add(bouton);
		
		getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
 
		return panel;
	}

	
	public FenetreAvecBouton() {
		super();
		buildContentPane();
		//panel.
		
	}
	
}

