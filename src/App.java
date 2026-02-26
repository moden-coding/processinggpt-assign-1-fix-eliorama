import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }
    public void settings(){
        size(400,400);
    }
    public void setup(){
          background(103,120,220);
    }
    public void draw(){
       fill(0,0,120);
       stroke(190);
       strokeWeight(3);
        ellipse(160, 150, 120, 120);
        fill(120,0,0);
        stroke(190);
       strokeWeight(3);
        triangle(120, 20, 30, 140, 45, 30);
        stroke(200);
        strokeWeight(1);
        line(160, 150, 120, 20);
    }

}