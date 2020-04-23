package observerPattern;

import contentCreation.partyRoles.Party;
import contentCreation.Character.Character;
import contentCreation.partyRoles.TankDecorator;
import gui.GameWindow;

import java.util.Random;


public class BattleCode {

    public static void trial1Fight(Party heros, Character villian){
        int test;
        do{
            GameWindow.setGameLog("Fighting is happening");

            test = getRandomNumberInRange(0,2);

            if(heros.isPartyAlive()){
                // Heros Attack first
                for(Character c: heros.sendParty()){
                    if(c.getRole().equals("Tank") || c.getRole().equals("DPS")){
                        if(test == 1){
                            villian.setHealthPoints(villian.getHealthPoints() - c.ability1());
                        }
                        else if(test == 2){
                            villian.setHealthPoints(villian.getHealthPoints() - c.ability2());
                        } else{
                            c.rest();
                        }
                    }else{
                        if(test == 1){
                            heros.lowestHealthPartyMember().setHealthPoints(c.ability1());
                        }
                        else if(test == 2){
                            heros.partyHealthEffect(c.ability2());
                        } else{
                            c.rest();
                        }
                    }
                }


            }else{
                String loseMsg = "Trial is Lost, game will end";
                GameWindow.setGameLog(loseMsg);
                System.out.println(loseMsg);
                break;
            }

            if(villian.isAlive()){
                if(test == 2) {
                    heros.randomPartyMember().setHealthPoints(10);
                } else{
                    heros.partyHealthEffect(villian.ability1());
                }
            }else{
                heros.experienceGain(350);
                String winMsg = "Trial Completed, Move on to next one";
                GameWindow.setGameLog(winMsg);
                heros.refreshPartyInfo();
                break;
            }
        }while(heros.isPartyAlive() || villian.isAlive());

    }


    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
