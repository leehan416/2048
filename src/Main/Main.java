
/*
 Project 2048 
 
 */
package Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
	public static void main(String[] args) {
		class key implements KeyListener { // 키 입력

			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == 'r') {
					// 재시작
				}
				Controller.Move(Integer.valueOf(e.getKeyCode()));
			}

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}
		}
		UserInterface.frame.addKeyListener(new key());
		UserInterface ui = new UserInterface();
	}
}