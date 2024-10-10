import java.awt.BorderLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class View {
	// View uses Swing framework to display UI to user
	private JFrame frame;

	public View(String title) {
		frame = new JFrame(title);
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 120);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public void setProduct(String[] product) {
		JLabel upcLabel = new JLabel("UPC : " + product[0]);
		JLabel productLabel = new JLabel("Product : " + product[1]);
		JLabel priceLabel = new JLabel("Price : " + product[2]);
	
		// Clear previous components
		frame.getContentPane().removeAll();
	
		GroupLayout layout = new GroupLayout(frame.getContentPane());
		frame.getContentPane().setLayout(layout);
	
		// Enable automatic gaps between components
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
	
		// Horizontal group: add all components horizontally
		layout.setHorizontalGroup(
			layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(productLabel)
				.addComponent(priceLabel)
				.addComponent(upcLabel))
		);
	
		// Vertical group: add all components vertically
		layout.setVerticalGroup(
			layout.createSequentialGroup()
			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			.addComponent(productLabel))
			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			.addComponent(priceLabel))
			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			.addComponent(upcLabel))
		);
	
		// Revalidate and repaint the frame
		frame.revalidate();
		frame.repaint();
	}
	

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
