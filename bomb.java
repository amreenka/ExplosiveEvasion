import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class bomb extends Actor
{
    public int speed;
    public static int rocketScore = 0;
   
    public bomb(int speed){
        this.speed=speed;
    }
    //act keeps on looping throughout the program, going through the following if statements
    public void act()
    {
        if(yellow.getRocketScore() + bomb.getRocketScore2() < 0)
        {
            this.speed = 0;
        }
        move(this.speed);
        if(isAtEdge()){
            int turn = (int)(Math.random()*81+140);
            this.turn(turn);
        }
        if(intersects((Actor)getWorld().getObjects(rocket.class).get(0))){
            getWorld().removeObject(this);
            rocketScore--;
        }
    }  

    public static int getRocketScore2(){
        return rocketScore;
    }
}
