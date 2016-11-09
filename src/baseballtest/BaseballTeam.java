/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseballtest;

/**
 *
 * @author luoos2514
 */
public class BaseballTeam extends SportsTeam implements Stats{
    String pitcher;
    String batting;
    
    int gamesWon;
    int gamesLost;
    int gamesTied;
    
    public void setPitcher(String pitcherName){
        pitcher = pitcherName;
    }
    
    public void setSide(String side){
        if (side.equalsIgnoreCase("y")){
            batting = "Batting";
        }
        
        else if (side.equalsIgnoreCase("n")){
            batting = "Fielding";
        }
    }
    
    public void setGamesWon(int gamesWonNum){
        gamesWon = gamesWonNum;
    }
    
    public void setGamesLost(int gamesLostNum){
        gamesLost = gamesLostNum;
    }
    
    public void setGamesTied(int gamesTiedNum){
        gamesTied = gamesTiedNum;
    }
    
    public void printStats(){
        System.out.println("The team's name is " + teamName);
        System.out.println("The team has " + teamMembers + " players");
        System.out.println("The team's pitcher is " + pitcher);
        System.out.println("The team is currently " + batting);
        System.out.println("\nThe team has won " + gamesWon + " games (" + gamesWon*2 + " points)");
        System.out.println("The team has tied " + gamesTied + " games (" + gamesTied + " points)");
        System.out.println("The team has lost " + gamesLost + " games");
    }
}
