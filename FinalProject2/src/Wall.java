import java.awt.*;

public class Wall extends Tile{
    public Wall(int x,int y)
    {
        super(x,y,10,10, Color.BLACK);
        setVisible(false);
    }
    public Wall(int x, int y, int w, int h,Color c)
    {
        super(x,y,w,h,c);
        setVisible(false);
    }
    public static void main(String[]args)
    {
        Wall w=new Wall(0,0);
    }
}
