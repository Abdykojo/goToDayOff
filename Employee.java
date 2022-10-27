package CEO;

public abstract class Employee implements EmployeeService {
    private String name;
    private int age;
    private int cash;
    private String[] employ;

    public Employee() {
    }

    public Employee(String[] employ) {
        this.employ = employ;
    }

    public String[] getEmploy() {
        return employ;
    }

    public void setEmploy(String[] employ) {
        this.employ = employ;
    }

    public Employee(String name, int age, int cash) {
        this.name = name;
        this.age = age;
        this.cash = cash;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void vyvod(){
        System.out.println("Name: "+getName()+"\n"+
                "Age: "+getAge()+"\n"+
                "Cash: "+getCash());
    }
    public abstract void goToDayOff();

}
