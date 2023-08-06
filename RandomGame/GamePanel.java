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
	static int DELAY = 200;
    Random random;
    char direction = 'R';
	boolean running = false;
	Timer timer;
    int totalCoin;
    int coinX;
    int coinY;
    int playerX;
    int playerY;
    int[] xWall = new int[20];
    int[] yWall = new int[20];


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
        newWall();
        running = true;
		timer = new Timer(DELAY,this);
		timer.start();
    }

    private void newWall() {
        for(int i=0; i<xWall.length; i++) {
            xWall[i] = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
		    yWall[i] = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
        }
        //xWall[0] = 1*UNIT_SIZE;
        //yWall[0] = 3*UNIT_SIZE;

    }


    public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}

    private void draw(Graphics g) {
        if(running) {
            g.setColor(Color.yellow);
			g.fillOval(coinX, coinY, UNIT_SIZE, UNIT_SIZE);

            g.setColor(Color.blue);
			g.fillRect(playerX, playerY, UNIT_SIZE, UNIT_SIZE);

            for(int i=0; i<xWall.length; i++) {
                g.setColor(Color.darkGray);
                g.fillRect(xWall[i], yWall[i], UNIT_SIZE, UNIT_SIZE);
            }
        } else {
			gameOver(g);
		}
    }


    private void gameOver(Graphics g) {
    }


    private void newCoin() {
        coinX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
		coinY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
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

    public void checkCollisions() {
	
		//check if head touches left border
		if(playerX < 0) {
			running = false;
		}
		//check if head touches right border
		if(playerX > SCREEN_WIDTH) {
			running = false;
		}
		//check if head touches top border
		if(playerY < 0) {
			running = false;
		}
		//check if head touches bottom border
		if(playerY > SCREEN_HEIGHT) {
			running = false;
		}
        //check if touches the wall
        for (int i=0; i<xWall.length; i++){
            if(playerX == xWall[i] && playerY == yWall[i]){
                
            }
        }
		
		if(!running) {
			timer.stop();
		}
	}

    private void checkCoin() {
        if((playerX == coinX) && (playerY == coinY)) {
			totalCoin++;
			newCoin();
		}
    }


    
    
    public class MyKeyAdapter extends KeyAdapter{
        @Override
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
            case KeyEvent.VK_SPACE:
                if (timer.isRunning()){
                    timer.stop();;
                } else {
                    timer.start();
                }
                    
                break;
			case KeyEvent.VK_LEFT:
				
				direction = 'L';
				
				break;
			case KeyEvent.VK_RIGHT:
				
				direction = 'R';
				
				break;
			case KeyEvent.VK_UP:
				
				direction = 'U';
				
				break;
			case KeyEvent.VK_DOWN:
				
				direction = 'D';
				
				break;
			}
        }
    }
}
