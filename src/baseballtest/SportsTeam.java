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
public abstract class SportsTeam{
    String teamName;
    int teamMembers;
    
    public void setName(String getName){
        teamName = getName;
    }
    
    public void setMemberNum(int memberNum){
        teamMembers = memberNum;
    }
}
