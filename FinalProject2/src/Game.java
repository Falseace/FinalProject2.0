import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Component;
class Game extends FileManager{
    UI ui;
    public Game(int x, int y, int w, int h, boolean sb){
        ui = new UI(x, y, w, h, sb);
    }
    
    public UI getUI(){
        return ui;
    }

    public static void main(String[]args){
        Game gameOne = new Game(0,0,1300,700,true);
        UI ui = gameOne.getUI();
        Scoreboard sb = ui.getScoreBoard();
        Card card = new Card(200,0,400,400,"dude");
        sb.addPost(new Post("memes","dude","lel"));
        sb.addPost(new Post("memes","dude","lel"));
        sb.reDisplayPosts(sb);
        ui.addGameObject(card);
    }
}
