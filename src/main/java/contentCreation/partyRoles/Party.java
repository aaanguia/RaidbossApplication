package contentCreation.partyRoles;

import contentCreation.Character.Character;
import gui.GameWindow;
import java.util.ArrayList;
import java.util.Random;

public class Party {
    protected ArrayList<Character> party;

    public Party(Character c1, Character c2, Character c3, Character c4, Character c5  ){
        party = new ArrayList<Character>();
        party.add(c1);
        party.add(c2);
        party.add(c3);
        party.add(c4);
        party.add(c5);
    }

    public ArrayList<Character> sendParty(){
        return party;
    }

    public boolean isPartyAlive(){
        for(Character c: party){
            if(c.isAlive()){
                return true;
            }
        }
        return false;
    }

    public void partyHealthEffect(int value){
       if(value > 0) {
           for (Character c : party) {
               if(c.isAlive()){
                   c.setHealthPoints(c.getHealthPoints() + value);
               }
           }
       } else{
           for (Character c : party) {
               c.setHealthPoints(c.getHealthPoints() + value/5);
           }
       }
    }

    public Character lowestHealthPartyMember(){
        Character ctest = party.get(0);
        for(Character c: party){
            if(ctest.getHealthPoints() > c.getHealthPoints()){
                ctest = c;
            }
        }
        return ctest;
    }

    public void experienceGain(int value){
        for(Character c: party){
            c.setExperiencePoints(value);
        }
    }

    public Character randomPartyMember(){
        Random rand = new Random();
        return party.get(rand.nextInt(party.size()));
    }

    public void refreshPartyInfo(){
        GameWindow.resetPartyLog();
        for (Character c : party){
            GameWindow.appendToPartyLog(c);
        }
    }

}


