package RandomGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener{

    static final int SCREEN_WIDTH = 1300;
	static final int SCREEN_HEIGHT = 750;
	static final int UNIT_SIZE = 50;
	static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/(UNIT_SIZE*UNIT_SIZE);
	static final int DELAY = 0;
    Random random;
    char direction = 'R';
	boolean running = false;
	Timer timer;
    int totalCoin;
    int coinX;
    int coinY;
    int playerX;
    int playerY;

    GamePanel(){
		random = new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		startGame();
	}

    
    private void startGame() {
        newCoin();
        running = true;
		timer = new Timer(DELAY,this);
		timer.start();
    }


    private void newCoin() {
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(running) {
			move();
			checkCoin();
			checkCollisions();
		}
		repaint();
    }


    private void move() {

        switch(direction) {
            case 'U':
                playerY = playerY - UNIT_SIZE;
                break;
            case 'D':
                playerY = playerY + UNIT_SIZE;
                break;
            case 'L':
                playerX = playerX - UNIT_SIZE;
                break;
            case 'R':
                playerX = playerX + UNIT_SIZE;
                break;
            }
    }

    private void checkCollisions() {
    }


    private void checkCoin() {
    }


    


    
    public class MyKeyAdapter extends KeyAdapter{

    }
}
