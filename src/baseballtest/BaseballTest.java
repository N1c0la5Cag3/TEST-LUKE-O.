/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseballtest;

import java.util.Scanner;

/**
 *
 * @author luoos2514
 */
public class BaseballTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the team's name? ");
        String teamName = sc.nextLine();
        
        BaseballTeam TEAM = new BaseballTeam();
        TEAM.setName(teamName);
        
        
        
        System.out.println("How many players on the team? ");
        String memberNum = sc.nextLine();
        
        int memberNumInt = Integer.parseInt(memberNum);
        TEAM.setMemberNum(memberNumInt);
        
        
        
        
        System.out.println("Who's the pitcher? ");
        String pitcher = sc.nextLine();
        
        TEAM.setPitcher(pitcher);
        
        
        
        
        System.out.println("Is the team batting? (y/n) ");
        String batting = sc.nextLine();
        
        TEAM.setSide(batting);
        
        
        
        
        System.out.println("How many games has the team won? ");
        String gamesWon = sc.nextLine();
        int gamesWonNum = Integer.parseInt(gamesWon);
        
        TEAM.setGamesWon(gamesWonNum);
        
        
        
        
        System.out.println("How many games has the team lost? ");
        String gamesLost = sc.nextLine();
        int gamesLostNum = Integer.parseInt(gamesLost);
        
        TEAM.setGamesLost(gamesLostNum);
        
        
        
        
        
        
        System.out.println("How many games the team tied? ");
        String gamesTied = sc.nextLine();
        int gamesTiedNum = Integer.parseInt(gamesTied);
        
        TEAM.setGamesTied(gamesTiedNum);
        
        TEAM.printStats();
    }
    
}
