import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.awt.event.KeyEvent.*;


public class MazeGame extends JFrame implements KeyListener {
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
        //addKeyListener(this) {

       // }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getKeyCode()==VK_KP_UP)
        {
            m.movement(Playerh--, Playerc,2);
        }
        else if(e.getKeyCode()==VK_KP_DOWN)
        {
            m.movement(Playerh++, Playerc,1);
        }

        else if(e.getKeyCode()==VK_KP_LEFT)
        {
            m.movement(Playerh, Playerc--,3);
        }
        else if(e.getKeyCode()==VK_KP_RIGHT)
        {
            m.movement(Playerh, Playerc++,4);
        }
    }

   @Override
   public void keyPressed(KeyEvent e)
   {

   }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
