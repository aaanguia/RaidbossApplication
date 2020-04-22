# DesignPatternSuperHeroUniverse

I want to do a reenactment of a popular games series I played when I was a kid:
Final Fantasy. The theme of the story will follow around three characters (heros).
As they take on I will use a builder pattern that will create my base party and 
the villians. I will use decorator pattern to add new abilities/powerups when a party 
member has a significant xp they will level up and may powerup every once in a while.


Requirements I think im implementing: 

1) One idea for a strategy is to use the villain or hero power levels as a multiplier for different random numbers (e.g. electric shock is power level of 2, so it’s 2*(random number from 1-50). This total can be deducted from the opponent’s hitpoints. This is just one option you can be creative here.) – this would also mean that there need to be hitpoints for each villain and hero.
    Explaination: Hero's current level applies a multiplier to stats they use. 

2)Villains spawn from another villain and get this villain’s power (basically a clone). Heroes are made and can only gain more power by defeating villains (they do have an initial power though).
    Explanation: Experience based system that gives better stats the higher the level. Trial is the same villian but they are made stronger each phase (respawn); 

3) Each person (no matter if villain or hero) needs to rest and recover, during these breaks they cannot battle and if they are attacked they will lose.  
    Explanation: Random Time Generator that will give a slight chance that a hero will be attacked.

4) The way it is stated here the villains might become more powerful faster, since they can spawn with many powers already. Try to come up with a good way to balance. You can consider only given villains part of the heroes strength they defeat or make newly spawned villains weaker etc. 

    Explanation: It is almost impossible that one hero can defeat a trial, therefore a party is required.

5)When there is a battle there can be different battle strategies. You can decide on the strategy based on your systems state, the power levels or whatever you think makes sense. You could also give different heroes different battle strategies to give them an edge. You can be creative here.
    Explanation: GUI forces users to do decide what moves are used. 

6) If all villains are killed then no new villains can spawn and they are extinct. The heroes won and an age of light begins. If all of the heroes are killed, the villains have won and the simulation is over and an age of darkness has begun.

    Explanation: If all the heros are dead, the game is over, if the trial is passed 4 times game over.

7) The simulation should end when either the villains or the heroes have won.
    Explanation: Checks if party is all dead

8) Heroes have their own bases and they also cooperate best in teams of 5. When there are more than 5 heroes, they will create a new base.

    Explanation: 5 people in a party.
