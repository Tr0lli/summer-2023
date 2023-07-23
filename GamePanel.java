import javax.swing.*;
import java.util.Random;

import java.awt.Graphics;
import java.awt.event.*;

public class GamePanel extends JPanel implements ActionListener{

    static final int  SCREEN_WIDTH = 600;
    static final int  SCREEN_HEIGHT = 600;

    GamePanel(){

    }

    public void startGame() {

    }

    public void paintComponenet(Graphics g){


    }

    public void draw(Graphics g){

        
    }

    public void move() {

    }

    public void checkApple(){

    }

    public void checkCollision() {

    }

    public void gameOver(Graphics g) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){

        }
    }
    
}
