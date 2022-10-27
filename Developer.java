package CEO;
class Developer extends Employee {
    private String grades;

    public Developer(){

    }

    public Developer(String name, int age, int cash, String grades) {
        super(name, age, cash);
        this.grades = grades;
    }

    public String getRangs() {
        return grades;
    }

    public void setRangs(String rangs) {
        this.grades = rangs;
    }

    @Override
    public void vyvod() {
        System.out.println("Developer:");
        super.vyvod();
        System.out.println("Grades: " + getRangs() + "\n");
    }

    @Override
    public void goToDayOff() {
        System.out.println(getName()+" нужен отгул для сдачи экзамена по учебе");
    }

    void writeCode(){
            System.out.println(getName()+":"+" Who wrote this awesome code!"+"\n");
        }

    @Override
    public void goToVocation() {
        System.out.println("Developer "+getName()+": I am going to bootcamp");

    }
}
