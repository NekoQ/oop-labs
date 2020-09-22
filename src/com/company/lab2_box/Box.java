package com.company.lab2_box;

public class Box {
    int height, width, depth;

    public Box(){
        this.height = this.width = this.depth = 1;
    }

    public Box(int _value){
        this.height = this.width = this.depth = _value;
    }

    public Box(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int surfArea(){
        return 2 * (width*height + width*depth + height*depth);
    }

    public int volume(){
        return height * width * depth;
    }

}
