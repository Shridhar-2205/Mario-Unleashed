import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Second start menu
 * 
 * @author  
 * @version
 */
public class StartMenu2 extends World
{
    private int enterDelayCount; //Ticks up to determine when the player can press enter - to keep them from accidentally flipping through two worlds
    static GreenfootSound theme = new GreenfootSound("Theme Song.mp3");
    GreenfootSound clicked = new GreenfootSound("Clicked.wav");
    /**
     * Constructor for objects of class StartMenu2.
     * 
     */
    public StartMenu2()
    {    
        super(500, 1080/2, 1); 
        if(theme.isPlaying() == false)
        {
            theme.playLoop();
        }
    }
    
    /**
     * Will set the world to the appropriate one based on the user's input and the delayCount reaching 15
     */
    public void act()
    {
        enterDelayCount ++;
        if (Greenfoot.isKeyDown("enter") && enterDelayCount > 15)
        {
            clicked.play();
            Greenfoot.setWorld(new Controls());
        }
        if (Greenfoot.isKeyDown("up"))
        {
            clicked.play();
            Greenfoot.setWorld(new StartMenu1());
        }
    }
}
