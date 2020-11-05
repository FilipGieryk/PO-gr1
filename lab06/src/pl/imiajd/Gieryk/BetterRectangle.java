package pl.imiajd.Gieryk;

import java.awt.*;

public class BetterRectangle extends Rectangle{
    public BetterRectangle(int x, int y,int width,int height){
        super();
        this.setLocation(x,y);
        this.setSize(width,height);
    }
    public double getPerimeter(){
        return 2*(this.height+this.width);
    }
    public double getArea(){
        return this.height*this.width;
    }
}
