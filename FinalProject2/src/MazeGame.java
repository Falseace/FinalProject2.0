import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.awt.event.KeyEvent.*;


public class MazeGame extends JFrame implements KeyListener  {
    private Maze m;
    private int Playerh, Playerc;
    public MazeGame() {
        super("Maze");
        this.setBounds(200, 200, 1000, 1000);
        this.setVisible(true);
        m = new Maze(100);
        m.addMaze(this);
        repaint();
        Playerc = 1;
        Playerh = 1;
        setFocusable(true);
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyCode()) {


            case KeyEvent.VK_UP:
                m.movement(Playerh--, Playerc, 2);
                System.out.println("UP");
                break;

            case KeyEvent.VK_DOWN:
                m.movement(Playerh++, Playerc, 1);
                System.out.println("Down");
                break;

            case KeyEvent.VK_LEFT:
                m.movement(Playerh, Playerc--, 3);
                System.out.println("Left");
                break;

            case KeyEvent.VK_RIGHT:
                m.movement(Playerh, Playerc++, 4);
                System.out.println("Right");
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {


            case KeyEvent.VK_UP:
                if(!m.movement(--Playerh, Playerc, 2))
                {
                    Playerh++;
                }
                System.out.println("UP");
                break;

            case KeyEvent.VK_DOWN:
                if(!m.movement(++Playerh, Playerc, 1))
                {
                    Playerh--;
                }
                System.out.println("Down");
                break;

            case KeyEvent.VK_LEFT:
                if(!m.movement(Playerh, --Playerc, 3))
                {
                    Playerc++;
                }
                System.out.println("Left");
                break;

            case KeyEvent.VK_RIGHT:
                if(!m.movement(Playerh, ++Playerc, 4))
                {
                    Playerc--;
                }
                System.out.println("Right");
                break;

        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {



    }
}
