package Main;

import javax.swing.JFrame;

public class UserInterface {
	public static JFrame frame = new JFrame("2048");

	public UserInterface() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600); // canvas size set
		frame.setVisible(true);
		frame.setResizable(false); // 사이즈 재조정 불가능
		frame.setLocationRelativeTo(null); // 창이 가운데에 뜨도록 함
		frame.getGraphics().drawRect(100, 100, 100, 100);
	}
}
