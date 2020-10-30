package demo;

public class Thief extends Character{

    public Thief(int initiative, int endurance, int attack, int flexibility) {
        super(7, 5, 5, 7);
    }
    
    
    
    //Specialförmåga: Kritisk träff. Tjuven har 25% chans att göra dubbel skada varje gång
    //tjuven attackerar.
    @Override
    public void skill() {
        System.out.println("Special skill: Critical hit.");
    }
}

