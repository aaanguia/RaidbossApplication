package battle;

import contentCreation.Character.Character;
import contentCreation.partyRoles.Party;
import gui.GameWindow;

import java.util.Random;


public class BattleCode {
    /**
     * Every trial fights call this function for ease of use
     *
     * @param heros
     * @param villian
     */
    public static void trial1Fight(Party heros, Character villian) {
        int test;
        do {
            GameWindow.setGameLog("Fighting is happening"); // Variable lets users know that fighting is occurring
            test = getRandomNumberInRange(0, 2);  // How the ability is chosen at random.

            // Hero attacks firsts so we must make sure party is still alive.
            if (heros.isPartyAlive()) {
                // Randomly selecting ability depending on what role you are.
                for (Character c : heros.sendParty()) {
                    if (c.getRole().equals("Tank") || c.getRole().equals("DPS")) {
                        if (test == 1) {
                            villian.setHealthPoints(villian.getHealthPoints() - c.ability1());
                        } else if (test == 2) {
                            villian.setHealthPoints(villian.getHealthPoints() - c.ability2());
                        } else{
                            c.rest();
                        }
                    } else {
                        if (test == 1) {
                            heros.lowestHealthPartyMember().setHealthPoints(c.ability1());
                        } else if (test == 2) {
                            heros.partyHealthEffect(c.ability2());
                        } else {
                            c.rest();
                        }
                    }
                }
            } else {  // If all party is dead you are notified.
                String loseMsg = "Trial is Lost, game will end";
                GameWindow.setGameLog(loseMsg);
                System.out.println(loseMsg);
                break;
            }

            // Next is vilians turn.
            if (villian.isAlive()) {
                // chooses between AOE attack and single attack
                if (test == 2) {
                    heros.randomPartyMember().setHealthPoints(10);
                } else {
                    heros.partyHealthEffect(villian.ability1());
                }
            } else { // if villian dies, users get experience
                heros.experienceGain(350);
                String winMsg = "Trial Completed, Move on to next one";
                GameWindow.setGameLog(winMsg);
                heros.refreshPartyInfo();
                break;
            }
        } while (heros.isPartyAlive() || villian.isAlive()); // fight until one dies.

    }

    /**
     * Random number generator
     *
     * @param min
     * @param max
     * @return
     */
    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
