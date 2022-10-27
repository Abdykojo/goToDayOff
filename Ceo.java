package CEO;
class Ceo extends Manager {
    private boolean hasCompanyCar;

    public  Ceo(){

    }

    public Ceo(String name, int age, int cash, boolean hasStocks, boolean hasCompanyCar) {
        super(name, age, cash, hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    @Override
    public void vyvod() {
        System.out.println("CEO:");
        super.vyvod();
        System.out.print("is has Company car : " + isHasCompanyCar());
    }
    @Override
    public void goToDayOff(){
        System.out.println(getName()+" нужен огул в связи с семейными обстоятельствами");
    }
    void goPublic(){
        System.out.print(getName()+":"+" i'll be back soon");
    }


    public void goToVacation(){
        System.out.println("I am going ");
    }
    @Override
    public void goToVocation() {
        System.out.println("CEO "+getName()+": I am going to Hawaii!");

    }
}
