import java.awt.*;

public class Tile extends Sprite{
    public Tile(int x, int y, String s)
    {
        super(x,y,10,10,s);
    }
    public Tile(int x, int y, int w, int h, String s)
    {
        super(x,y,w,h,s);
    }

    @Override
    public void move() {

    }
    public void setPlayer(boolean b)
    {

    }
}
