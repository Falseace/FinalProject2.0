import java.awt.*;

public class Wall extends Tile{
    public Wall(int x,int y)
    {
        super(x,y,100,100, "TrumpWall.jfif");
        setVisible(true);
    }
    public Wall(int x, int y, int w, int h,String s)
    {
        super(x,y,w,h,s);
        setVisible(false);
    }
    public static void main(String[]args)
    {

    }
}
