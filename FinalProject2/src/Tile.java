import java.awt.*;

public class Tile extends GameRectangle{
    public Tile(int x, int y)
    {
        super(x,y,10,10, Color.black);
    }
    public Tile(int x, int y, int w, int h, Color c)
    {
        super(x,y,w,h,c);
    }
}
