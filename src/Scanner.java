// This window emulates the scanning of an item. Every time the buttom is pressed
// it will send a notification of a UPC code

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

public class Scanner {
	// Scanner uses Swing framework to create a UPC code
	private JFrame frame;
	private JPanel scannerPanel;
	private JButton scanButton;
	private Model model;
	private View view;

	public Scanner(Model model, View view) {
		this.model = model;
		this.view = view;

		frame = new JFrame("Scanner");
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(100, 100);
		frame.setLocation(300, 50);
		frame.setVisible(true);

		// Create UI elements
		scanButton = new JButton("Scan");
		scannerPanel = new JPanel();

		// Add UI element to frame
		scannerPanel.add(scanButton);
		frame.getContentPane().add(scannerPanel);

		scanButton.addActionListener(e -> generateUPC());
	}

	private int generateUPC() {
		int upcCode = 12345;
		// upcCode = 67890;
		
		String[] product = this.model.getProduct(upcCode);
		// System.out.println(product[0] + " " + product[1] + " " + product[2]);
		this.view.setProduct(product);
		
		return upcCode;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JPanel getScannerPanel() {
		return scannerPanel;
	}

	public void setScannerPanel(JPanel scannerPanel) {
		this.scannerPanel = scannerPanel;
	}

	public JButton getScanButton() {
		return scanButton;
	}

	public void setScanButton(JButton scanButton) {
		this.scanButton = scanButton;
	}

}
