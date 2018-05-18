
import java.awt.*;
public class Floor extends Tile {
    private boolean player;
    public Floor(int x, int y)
    {
        super(x,y,100,100, "BasketBall.jpg");
        player=false;
    }
    public Floor(int x, int y, int w, int h, String s)
    {
        super(x,y,w,h,s);
    }



    public void setPlayer(boolean b)
    {
        if(b)
        {
            this.setImage("SpriteCan.jfif");
        }
        else
        {
            this.setImage("BasketBall.jpg");
        }
    }

}
