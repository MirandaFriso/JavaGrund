
package demo;

public abstract class Character {   
   
    private int initiative;
    private int endurance;
    private int attack;
    private int flexibility;
    
    public Character(int initiative, int endurance, int attack, int flexibility) {
        this.initiative = initiative;
        this.endurance = endurance;
        this.attack = attack;
        this.flexibility = flexibility;
    }
    
    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getFlexibility() {
        return flexibility;
    }

    public void setFlexibility(int flexibility) {
        this.flexibility = flexibility;
    }
    
    public abstract void skill();
    
    public void attack() { 
        //variabel för spelkaraktär (thief) get.initiative
        //variabel för monster (giantSpider) get.initiative
        
    }
        
}
 
