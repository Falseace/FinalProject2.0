import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tile extends Sprite  {
    private String name;
    public Tile(int x, int y, String s)
    {
        super(x,y,10,10,s);
        name="Tile";
    }
    public Tile(int x, int y, int w, int h, String s)
    {
        super(x,y,w,h,s);
    }

    @Override
    public void move() {

    }
    public String getName()
    {
        return name;
}
    public void setPlayer(boolean b)
    {

    }
}
