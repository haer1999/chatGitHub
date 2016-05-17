package chatClient;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChatClient extends Frame{
	
	public static void main(String[] args) {
		ChatClient client = new ChatClient();
		client.initFrame();
	}
	
	public void initFrame(){
		setSize(500,300);
		setLocation(200,100);
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
}
