import java.awt.*;

public class Wall extends Tile{
    private String name;
    public Wall(int x,int y)
    {
        super(x,y,100,100, "TrumpWall.jfif");
        name="wall";
        setVisible(true);
    }
    public Wall(int x, int y, int w, int h,String s)
    {
        super(x,y,w,h,s);
        setVisible(false);
        name="wall";
    }

    @Override
    public String getName() {
        return name;
    }

    public static void main(String[]args)
    {

    }
}
