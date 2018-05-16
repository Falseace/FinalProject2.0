
import java.awt.*;
public class Floor extends Tile {
    private boolean player;
    public Floor(int x, int y)
    {
        super(x,y,100,100, Color.GRAY);
        player=false;
    }
    public Floor(int x, int y, int w, int h, Color c)
    {
        super(x,y,w,h,c);
    }



    public void setPlayer(boolean b)
    {
        if(b)
        {
            this.setBackground(Color.CYAN);
        }
    }

}
