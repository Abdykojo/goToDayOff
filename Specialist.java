package CEO;

import java.util.logging.Level;

class  Specialist extends Employee {
    private int Levels;

    public Specialist(String name, int age, int cash, int levels) {
        super(name, age, cash);
        Levels = levels;
    }

    public Specialist (){

    }

    public int getLevels() {
        return Levels;
    }

    public void setLevels(int levels) {
        Levels = levels;
    }

    @Override
    public void vyvod() {
        System.out.println("Specialist:");
        super.vyvod();
        System.out.println("Level: " + getLevels() + "\n");
    }
    @Override
    public void goToDayOff(){
        System.out.println(getName()+" нужен отгул в связи с досрочным выполнением плана");
    }
    void workWithClients(){
        System.out.println(getName()+":"+" Don't interfere, i'm working with a client.");
    }

    @Override
    public void goToVocation() {
        System.out.println("Specialist "+getName()+": I am going to Issyk-Kul");

    }
}
