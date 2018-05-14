
import java.awt.*;
public class Floor extends Tile {
    public Floor(int x, int y)
    {
        super(x,y,10,10, Color.GRAY);
    }
    public Floor(int x, int y, int w, int h, Color c)
    {
        super(x,y,w,h,c);
    }
}
