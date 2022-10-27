package CEO;

class Manager extends Employee {
    private boolean hasStocks;

    public Manager(){

    }

    public Manager(String name, int age, int cash, boolean hasStocks) {
        super(name, age, cash);
        this.hasStocks = hasStocks;
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }
    @Override
    public void vyvod() {
        System.out.println("Manager:");
        super.vyvod();
        System.out.println("has Stocks: " + isHasStocks()+"\n");
    }
    @Override
    public void goToDayOff(){
        System.out.println(getName()+" нужен отгул по состоянию здоровья");
    }
    void writeProcedures(){
        System.out.println(getName()+":"+" i'm working"+"\n");
    }

    @Override
    public void goToVocation() {
        System.out.println("Manager "+getName()+": I am going to Albania");

    }
}
