import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Chatbot extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JTextArea chat= new JTextArea();
	private JTextField message=new JTextField();                                  
	private JButton Enter=new JButton();
	private JLabel send_message=new JLabel();
	
	Chatbot(){                                                                                        
		
		JFrame f=new JFrame();                                     
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);                      
		f.setVisible(true);
		f.setResizable(false);
		f.setLayout(null);
		f.setBounds(0,0,1000,1000);
		f.setTitle("ChatBot");
		f.add(chat);
		f.add(message);
		chat.setBounds(0, 0,1000,800);
		chat.setLocation(1, 1);
		chat.setBackground(Color.black);
		message.setBounds(0, 800,800,200);
		f.add(Enter);
		send_message.setText("SEND");
		Enter.add(send_message);
		Enter.setBounds(800, 800,200,200);
		Enter.setBackground(Color.white);
		
		Enter.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				replyMeth("Hello, I am Chat bot. I can assist you with weather forecast and top 10 trend within the US");

				if(e.getSource()==Enter) {                           
					
					String text=message.getText().toLowerCase();
					chat.setForeground(Color.white);
					chat.append("You-->"+text+"\n");
					message.setText("");
					
					if(text.contains("")) {                        
						replyMeth("");
					}
					else if(text.contains("")) {
						replyMeth("");
					}
					else if(text.contains("")) {
						replyMeth("");
					}
					else if(text.contains("")) {
						replyMeth("");
					}
					else if(text.contains("")) {
						replyMeth("");
					}
					else if(text.contains("bye")) {
						replyMeth("Good Bye!"+"\n"+"-------------------------------------------------------------------------"+"\n"+"If you would like to download the chat log, Please press the button");
					}
					else 
						replyMeth("I Can't Understand");
					
				}
				
			}
			
		});
		
	}
	public void replyMeth(String s) {                         
		chat.append("ChatBot-->"+s+"\n");         
	}
			

}



public class App {                                    

	public static void main(String[] args) {            
		
          new Chatbot();                                 
	}

}