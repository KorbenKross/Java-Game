import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Game {

	private JFrame frame;
	private Read R = new Read("C://Users//dns//Desktop//LAB7//levels//1.txt");
	public static int Lev = 1;
	final JPanel panel = new Brush();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game window = new Game();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}

	/**
	 * Create the application.
	 */
	public Game() throws IOException {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @return /*
	 */

	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(100, 100, 528, 337);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.addKeyListener(new KeyListener() {
			public void keyReleased(KeyEvent arg0) {
				switch (arg0.getKeyCode()) {
				case KeyEvent.VK_UP:
					Buttons.Up();
					panel.updateUI();
					break;
				case KeyEvent.VK_DOWN:
					Buttons.Down();
					panel.updateUI();
					break;
				case KeyEvent.VK_LEFT:
					Buttons.Left();
					panel.updateUI();
					break;
				case KeyEvent.VK_RIGHT:
					Buttons.Right();
					panel.updateUI();
					break;
				case KeyEvent.VK_R:
					if (Lev == 1) {
						R = new Read("C://Users//dns//Desktop//LAB7//levels//1.txt");
						frame.repaint();
					} else if (Lev == 2) {

						R = new Read("C://Users//dns//Desktop//LAB7//levels//2.txt");
						frame.repaint();
					} else if (Lev == 3) {
						R = new Read("C://Users//dns//Desktop//LAB7//levels//3.txt");
						frame.repaint();
					}
					panel.updateUI();
					break;
				default:
					return;
				}

				if (MassivLevel.exitkeyprove == MassivLevel.exitkey) {
					Lev++;
					if (Lev == 2) {
						R = new Read("C://Users//dns//Desktop//LAB7//levels//2.txt");
						frame.repaint();
					}
					if (Lev == 3) {
						R = new Read("C://Users//dns//Desktop//LAB7//levels//3.txt");
						frame.repaint();
					}

				}
			}

			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});
		panel.setBounds(0, 0, 407, 298);
		frame.getContentPane().add(panel);

		JLabel timeLabel = new Counter(new Timer());
		timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 38));
		timeLabel.setBounds(407, 52, 105, 58);
		frame.getContentPane().add(timeLabel);

	}
}
