import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class rocket extends Actor
{
    public int speed;
    public int score = 0;
    boolean gameEnded = false;
    
    public rocket(int speed){
        this.speed=speed;
        setRotation(180);
    }
    public void act()
    {
        
        score = yellow.getRocketScore() + bomb.getRocketScore2();
        move(this.speed);
        if(Greenfoot.isKeyDown("right")){
            setRotation(0);
        }
        else if(Greenfoot.isKeyDown("left")){
            setRotation(180);
        }
        else if(Greenfoot.isKeyDown("up")){
            setRotation(270);
        }
        else if(Greenfoot.isKeyDown("down")){
            setRotation(90);
        }
        getWorld().showText(toString(), 100, 750);

    }    
  
    public String toString()
    {
        if(score < 0)
        {
            this.speed = 0;
        }
        return yellow.showScores(true);
        }
      
    }
   
