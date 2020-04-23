package contentCreation.partyRoles;

import contentCreation.Character.Character;
import gui.GameWindow;

import java.util.ArrayList;
import java.util.Random;

public class Party {
    protected ArrayList<Character> party;

    /**
     * Adding Characters into a party
     *
     * @param c1
     * @param c2
     * @param c3
     * @param c4
     * @param c5
     */
    public Party(Character c1, Character c2, Character c3, Character c4, Character c5) {
        party = new ArrayList<Character>();
        party.add(c1);
        party.add(c2);
        party.add(c3);
        party.add(c4);
        party.add(c5);
    }

    /**
     * return arraylist.
     *
     * @return
     */
    public ArrayList<Character> sendParty() {
        return party;
    }

    /**
     * Checks if atleast one party member is alive
     *
     * @return
     */
    public boolean isPartyAlive() {
        for (Character c : party) {
            if (c.isAlive()) {
                return true;
            }
        }
        return false;
    }

    /**
     * An easier way to apply damage or healing to a party as a whole
     *
     * @param value
     */
    public void partyHealthEffect(int value) {
        if (value > 0) {
            for (Character c : party) {
                if (c.isAlive()) {
                    c.setHealthPoints(c.getHealthPoints() + value);
                }
            }
        } else {
            for (Character c : party) {
                c.setHealthPoints(c.getHealthPoints() + value / 5);
            }
        }
    }

    /**
     * For sake of simplicity I made the lowest hp member to
     * get healed first
     *
     * @return
     */
    public Character lowestHealthPartyMember() {
        Character ctest = party.get(0);
        for (Character c : party) {
            if (ctest.getHealthPoints() > c.getHealthPoints()) {
                ctest = c;
            }
        }
        return ctest;
    }

    /**
     * Applying exp to all characters
     *
     * @param value
     */
    public void experienceGain(int value) {
        for (Character c : party) {
            c.setExperiencePoints(value);
        }
    }

    /**
     * Random Character selected to be applied
     *
     * @return
     */
    public Character randomPartyMember() {
        Random rand = new Random();
        return party.get(rand.nextInt(party.size()));
    }

    /**
     * Refreshes gui
     */
    public void refreshPartyInfo() {
        GameWindow.resetPartyLog();
        for (Character c : party) {
            GameWindow.appendToPartyLog(c);
        }
    }

}


