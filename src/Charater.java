import java.awt.*;

public class Charater {
    String name;
    Image image;
    int xpos;
    int ypos;
    double dx;
    double dy;
    int width;
    int height;
    Rectangle hitbox;

    public Charater(){
        hitbox = new Rectangle(xpos,ypos,width,height);
    }
    //overloaded constructor - more than 1 constructor, program will use the above construtor if you don't give it enough inputs, if you give all the right inputs itll skip the top constructor and use the bottom one
    public Charater(int xposInput, int yposInput, double dxInput, double dyInput, int heightInput, int widthInput){
        xpos=xposInput;
        ypos=yposInput;
        dx=dxInput;
        dy=dyInput;
        height=heightInput;
        width=widthInput;
        hitbox = new Rectangle(xpos,ypos,width,height);
    }


/*    public void move(char key) {
        if (key == 'w') {
            ypos = ypos + speed;
            System.out.println("x=" + xpos + "y=" + ypos);
        }
        if (key == 's') {
            ypos = ypos - speed;
            System.out.println("x=" + xpos + "y=" + ypos);
        }
        if (key == 'd') {
            xpos = xpos + speed;
            System.out.println("x=" + xpos + "y=" + ypos);
        }
        if (key == 'a') {
            xpos = xpos - speed;
            System.out.println("x=" + xpos + "y=" + ypos);
        }

    } */

    public static void main(String[] args) {

    }

}
