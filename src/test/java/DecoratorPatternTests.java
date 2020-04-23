import contentCreation.Character.HydaelynInhabitantImpl;
import contentCreation.partyRoles.DpsDecorator;
import contentCreation.partyRoles.HealerDecorator;
import contentCreation.partyRoles.TankDecorator;
import contentCreation.Character.Character;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DecoratorPatternTests {

    /**
     *Testing main shows that decorator is being created properly since the
     * heros abilities would be reporting 0 if they did get decorated.
     */
    @Test
    public void decorateTank() {
        Character test = new TankDecorator(new HydaelynInhabitantImpl("Azumi Aki",
                "High Elf", "Eorzea", "Limsa Lominsa", "Azeyma"));
        assertEquals(test.ability1(), 6 );
    }

    @Test
    public void decorateHealer() {
        Character test = new HealerDecorator(new HydaelynInhabitantImpl("Azumi Aki",
                "High Elf", "Eorzea", "Limsa Lominsa", "Azeyma"));
        assertEquals(test.ability1(), 8 );
    }

    @Test
    public void DpsDecorator() {
        Character test = new DpsDecorator(new HydaelynInhabitantImpl("Azumi Aki",
                "High Elf", "Eorzea", "Limsa Lominsa", "Azeyma"));
        assertEquals(test.ability1(), 11 );
    }


}
