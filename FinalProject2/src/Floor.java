
import java.awt.*;
import java.awt.event.KeyEvent;

public class Floor extends Tile {
    private boolean player;
    private boolean item;
    private String name;
    public Floor(int x, int y)
    {
        super(x,y,100,100, "BasketBall.jpg");
        player=false;
        item = false;
        name="Floor";
        setVisible(false);
    }
    public Floor(int x, int y, int w, int h, String s)
    {
        super(x,y,w,h,s);
        name="Floor";
        item=false;
    }

    @Override
    public String getName() {
        return name;
    }
    public void setItem(boolean b){
        this.setImage("Treasure.jpg");
        item = b;
        setVisible(true);
    }
    public boolean getItem(){
        return item;
    }
    @Override
    public void setPlayer(boolean b)
    {
        setVisible(true);
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
