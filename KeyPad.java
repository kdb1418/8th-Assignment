import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class KeyPad extends JFrame implements ActionListener{
	private JTextField txt;
	private JTextField result;
	private JPanel panel;
	private JButton[] btn = new JButton[16];
	public KeyPad() {
		String[] b = {"7","8","9","/","4","5","6","*","1","2","3","-","=","0",".","+"};
		txt = new JTextField(20);
		result = new JTextField(20);
		add(txt, BorderLayout.NORTH);
		add(result, BorderLayout.SOUTH);
		panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));
		add(panel, BorderLayout.CENTER);
		for(int i=0; i<16; i++) {
			btn[i] = new JButton(b[i]);
			btn[i].addActionListener(this);
			btn[i].setPreferredSize(new Dimension(100, 100));
			panel.add(btn[i]);
		}
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		String temp = new String();
		txt.setText(txt.getText()+actionCommand);
		temp = txt.getText();
			if(e.getSource()==this.btn[12]) {
				Token c = new Token(temp);
				
				result.setText(""+c.getResult());
			}
		}
	public static void main(String[] args) {
		new KeyPad();
		
		
		
		
	}
}
