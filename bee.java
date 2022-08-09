import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bee extends Actor
{
    /**
     * Act - do whatever the bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-5);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+5);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-5,getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+5,getY());
        }
    }
}
