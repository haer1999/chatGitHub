package chatClient;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient2 {
	private JFrame frame;
	private JTextArea ta;
	private JTextField tf;
	public static void main(String[] args) {
		ChatClient2 c = new ChatClient2();
		c.init();
	}
	
	private void init(){
		frame = new JFrame();
		frame.setBounds(100,200,500,400);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
