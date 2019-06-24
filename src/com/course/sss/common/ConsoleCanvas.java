package com.course.sss.common;

public class ConsoleCanvas extends Canvas {

    private char[][] pixes;
    private int width;
    private int height;

    public ConsoleCanvas(int width,int height){
        this.height=height;
        this.width=width;
        init();
    }

    public void init(){
        pixes=new char[height][width];
        reset();
    }

    private void reset(){
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                pixes[i][j]='.';
            }
        }
    }

    public void draw(){
        for(int i=0;i<height;i++) {
            System.out.print("\n");
            for (int j = 0; j < width; j++) {
                System.out.print(pixes[i][j]);
            }
        }
    }

    public void setSybolAt(int x,int y, char symbol){
        pixes[x][y]=symbol;
    }

    @Override
    public void drawText(String text) {
        System.out.println(text);
    }


    public void drawRect(int[] coordinates){

    }

    public void drawSquare(int x,int y, int size){
        for(int j=0;j<size;j++){
                pixes[x][y+j]='#';
                pixes[x+size-1][y+j]='#';
                pixes[x+j][y]='#';
                pixes[x+j][y+size-1]='#';
        }

    }

    public void drawCircle(int x, int y,int radius){
        for (int i=0;i<1000;i++){
            for(int j=0;j<1000;j++){
                if((i-x)*(i-x)+(j-y)*(j-y)<radius*radius){
                    pixes[i][j]='#';
                }
            }

        }
    }
    public void drawText(int x,int y,String text){

    }
}
