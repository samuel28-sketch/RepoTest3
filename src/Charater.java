import java.awt.*;
import java.awt.event.KeyEvent;

public class Charater {
    String name;
    Image image;
    int xpos;
    int ypos;
    double dx;
    double dy;
    int width;
    int height;
    char lastdirection;

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

    public void keyInput(){}


    public void move(char key) {
        if (key == 'w') {
            ypos = ypos - (int)dy;
            lastdirection = 'w';
            System.out.println("x=" + xpos + "y=" + ypos);
        }
        else if (key == 's') {
            ypos = ypos + (int)dy;
            lastdirection = 's';
            System.out.println("x=" + xpos + "y=" + ypos);
        }
        else if (key == 'd') {
            xpos = xpos + (int)dx;
            lastdirection = 'd';
            System.out.println("x=" + xpos + "y=" + ypos);
        }
        else if (key == 'a') {
            xpos = xpos - (int)dx;
            lastdirection = 'a';
            System.out.println("x=" + xpos + "y=" + ypos);
        }

        if (xpos>1000){
            xpos = 0;
        }
        else if (xpos<0){
            xpos=1000;
        }
        if (ypos>700){
            ypos = 0;
        }
        else if (ypos<0){
            ypos=700;
        }
    /*    if (xpos>900||xpos<0){
            xpos = xpos*-1;
            dx=dx*-1;

        }
        if (ypos>700||ypos<0){
            dy=dy*-1;
            ypos = ypos*-1;

        } */



    }

    public static void main(String[] args) {

    }

}
