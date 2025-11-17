import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

//look at YT tutorial by RealTutsGML
public class KeyInput extends KeyAdapter implements KeyListener {
    BasicGameApp game;
    ArrayList<Integer> pressedKeys;
 //   ArrayList<Integer> upKeys;


    public KeyInput(BasicGameApp game){
        this.game=game;
        pressedKeys = new ArrayList<>();
 //       upKeys = new ArrayList<>();
    }

    public void keyPressed(KeyEvent e){
        game.keyPressed(e);
        pressedKeys.add(e.getKeyCode()); //check this line lol
    }

    public void keyReleased(KeyEvent e){
        game.keyReleased(e);
        pressedKeys.remove(e.getKeyCode());
 //       upKeys.add(e.getKeyCode());
    }

    public boolean isKeyDown (int keyCode){ //googled
        return pressedKeys.contains(keyCode);
    }
    public boolean anyKeyDown(){
        return pressedKeys.isEmpty();
    }
 //   public boolean isKeyUp (int keyCode){ //googled
 //       return upKeys.contains(keyCode);
  //  }



}
