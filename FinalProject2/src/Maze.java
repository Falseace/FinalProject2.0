import javax.swing.*;
import java.lang.reflect.Array;

public class Maze {
    private Tile[][] multi;
    private int w;
    private int h;
    private int side;

    public Maze(int s) {
        h = 7;
        w = 7;
        side = s;
        multi = new Tile[h][w];
        makeMaze();
    }

    public void makeMaze() {
        multi[1][1] = new Floor(side * (1 + 1), side * (1 + 1));
        multi[1][1].setPlayer(true);
        multi[2][1] = new Floor(side * (1 + 1), side * (2 + 1));
        multi[2][2] = new Floor(side * (2 + 1), side * (2 + 1));
        multi[3][2] = new Floor(side * (2 + 1), side * (3 + 1));
        multi[4][2] = new Floor(side * (2 + 1), side * (4 + 1));
        multi[4][1] = new Floor(side * (1 + 1), side * (4 + 1));
        multi[5][1] = new Floor(side * (1 + 1), side * (5 + 1));
        multi[4][3] = new Floor(side * (3 + 1), side * (4 + 1));
        multi[5][3] = new Floor(side * (3 + 1), side * (5 + 1));
        multi[5][4] = new Floor(side * (4 + 1), side * (5 + 1));
        multi[5][5] = new Floor(side * (5 + 1), side * (5 + 1));
        multi[2][3] = new Floor(side * (3 + 1), side * (2 + 1));
        multi[2][4] = new Floor(side * (1 + 4), side * (2 + 1));
        multi[1][4] = new Floor(side * (4 + 1), side * (1 + 1));
        multi[1][5] = new Floor(side * (5 + 1), side * (1 + 1));
        multi[4][5] = new Floor(side * (5 + 1), side * (4 + 1));
        multi[3][5] = new Floor(side * (5 + 1), side * (3 + 1));
        multi[3][5].setItem(true);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if ((i == 0) || (j == 0) || (i == h - 1) || (j == w - 1)) {
                    multi[i][j] = new Wall(side * (j + 1), side * (i + 1));
                } else if (multi[i][j] == null) {
                    multi[i][j] = new Wall(side * (j + 1), side * (i + 1));
                }
            }
        }
    }

    public JFrame addMaze(JFrame J) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (multi[i][j] == null) {

                } else {
                    J.add(multi[i][j], 0);
                }
            }
        }
        return J;
    }
    public JFrame reset(JFrame J)
    {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (multi[i][j].getName().equalsIgnoreCase("wall")) {
                    multi[i][j].setVisible(false);
                } else {
                    J.remove(multi[i][j]);
                }
            }
        }
        makeMaze();
        addMaze(J);
        return J;
    }
    public void tese(int r, int c) {
    if(multi[r][c].getName().equalsIgnoreCase("Floor"))
    {
        multi[r][c].setPlayer(true);
    }
    }

    public boolean isItem(int r, int c)
    {
        return multi[r][c].getItem();
    }

    public boolean movement(int r, int c,int f)
    {
        System.out.println(multi[r][c].getName());
        if (multi[r][c].getName().equalsIgnoreCase("Floor")) {
            multi[r][c].setPlayer(true);
            if (multi[r][c].getItem()) {
                System.out.println("You Win");
            } if (f == 1) {
                multi[--r][c].setPlayer(false);
            } else if (f == 2) {
                multi[++r][c].setPlayer(false);
            } else if (f == 3) {
                multi[r][++c].setPlayer(false);
            } else if (f == 4) {
                multi[r][--c].setPlayer(false);
            }
            return true;
        } else if (multi[r][c].getName().equalsIgnoreCase("wall")) {
            multi[r][c].setVisible(true);
        }
        return false;
    }
    public int getHeight()
    {
        return multi.length;
    }
    public static void main(String[]args)
    {
        Maze m=new Maze(100);
        JFrame J=new JFrame("Hello");
        J.setBounds(300,300,1000,1000);
        J.setLayout(null);
        m.addMaze(J);
        J.setVisible(true);
        m.movement(1,1,1);
        J.repaint();
    }
}
