# DesignPatternSuperHeroUniverse

I want to do a re-enactment of a popular games series I played when I was a kid:
Final Fantasy. The theme of the story will follow around three characters (heros).
As they take on I will use a builder pattern that will create my base party and 
the villians. I will use decorator pattern to add new abilities/powerups when a party 
member has a significant xp they will level up and may powerup every once in a while.


Fun Facts / Implementation Strategies/logic
1) Hero's current level applies a multiplier to stats they use. 

2) Experience based system that gives better stats the higher the level. Trial is the same villian but they are made stronger each phase (respawn); 

3) Random Time Generator that will give a slight chance that a hero will be attacked. More Rest == More Health Regen

4) It is almost impossible that one hero can defeat a trial, therefore a party is required.
 
5) GUI forces users to do decide what moves are used. 

6) Win Conditions: If all the heros are dead, the game is over, if the trial is passed 4 times game over.

7) SystemChecks if party is all dead

8) 5 people in a party.
