import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private int actCounter;
   
    public MyWorld()
    {    
        super(1000, 800, 1);
        this.actCounter=0;
        addObject(new rocket(8), getWidth()/2, getHeight()/2);
        bomb.rocketScore = 0;
        yellow.rocketScore = 0;
    }
   
    public void act(){
        
        if(this.actCounter%100==0 && yellow.getRocketScore() + bomb.getRocketScore2()>=0){
            addObject(new yellow(), (int)(Math.random()*600), (int)(Math.random()*400));
        } else if(this.actCounter%40==0 && yellow.getRocketScore() + bomb.getRocketScore2()>=0){
            addObject(new bomb(10), (int)(Math.random()*600), (int)(Math.random()*400));
        }
       this.actCounter++;
       
    }
}