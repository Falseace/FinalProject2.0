
import java.awt.*;
import java.awt.event.KeyEvent;

public class Floor extends Tile {
    private boolean player;
    private String name;
    public Floor(int x, int y)
    {
        super(x,y,100,100, "BasketBall.jpg");
        player=false;
        name="Floor";
    }
    public Floor(int x, int y, int w, int h, String s)
    {
        super(x,y,w,h,s);
        name="Floor";
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setPlayer(boolean b)
    {
        if(b)
        {
            this.setImage("SpriteCan.jfif");
        }
        else if(!b)
        {
            this.setImage("BasketBall.jpg");
        }
    }

}
