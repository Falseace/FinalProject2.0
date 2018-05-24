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


    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(!m.isItem(Playerh,Playerc)) {
            switch (e.getKeyCode()) {


                case KeyEvent.VK_UP:
                    if (!m.movement(--Playerh, Playerc, 2)) {
                        Playerh++;
                    }
                    break;

                case KeyEvent.VK_DOWN:
                    if (!m.movement(++Playerh, Playerc, 1)) {
                        Playerh--;
                    }
                    break;

                case KeyEvent.VK_LEFT:
                    if (!m.movement(Playerh, --Playerc, 3)) {
                        Playerc++;
                    }
                    break;

                case KeyEvent.VK_RIGHT:
                    if (!m.movement(Playerh, ++Playerc, 4)) {
                        Playerc--;
                    }
                    break;

            }

            this.repaint();
        }else
        {
            m.reset(this);
            Playerc=1;
            Playerh=1;
            this.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {



    }
}
