import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class yellow extends Actor
{
    public static int rocketScore = 0;
    public static int highScore;

    public void act()
    {
        
        if(intersects((Actor)getWorld().getObjects(rocket.class).get(0))){
            getWorld().removeObject(this);
            rocketScore++;
            if(rocketScore + bomb.getRocketScore2() > highScore)
            {
                highScore = rocketScore + bomb.getRocketScore2();
            }
            showScores(true);
        }
        
    }    

    public static String showScores(boolean act)
    {
        
        int totalRocketScore = 0;
        int [] totalScore = {rocketScore, bomb.getRocketScore2()};
        for(int i = 0; i < totalScore.length; i++)
        {
            totalRocketScore += totalScore[i];
        }
        if(totalRocketScore < 0)
        {
            return "Game Over!";
        }
        return "Current Score: " + totalRocketScore + "\nHigh Score: " + highScore;
        
    }
    
    public static int getRocketScore(){

        return rocketScore;
    }

}