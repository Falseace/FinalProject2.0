import javax.swing.*;
import java.lang.reflect.Array;

public class Maze {
    private Tile[][] multi;
    private int w;
    private int h;
    public Maze()
    {
        h=7;
        w=7;
        multi=new Tile[h][w];
        makeMaze();
    }
    public void makeMaze()
    {
        for(int i=0;i<h;i++)
        {
            for(int j=0;j<w;j++)
            {
                if(i==0) {

                }
                else if(j==0)
                {

                }
                else if(i==h-1)
                {

                }
                else(j==w-1)
                {

                }
            }
        }
    }
    public JFrame addMaze(JFrame J)
    {
        for(int i=0;i<h;i++)
        {
            for(int j=0;j<w;j++)
            {
                J.add(multi[i][j]);
            }
        }
        return J;
    }
    public int getHeight()
    {
        return multi.length;
    }
    public static void main(String[]args)
    {
        Maze m=new Maze();
        JFrame J=new JFrame("Hello");
        //J.set
        J.setVisible(true);


    }
}
