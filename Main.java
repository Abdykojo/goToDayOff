package CEO;

public class Main {
    public static void main(String[]args) {
        Specialist erik = new Specialist("Erik", 25, 80000, 3);
        Specialist victoria = new Specialist("Victoria", 34, 95400, 4);
        Specialist brook = new Specialist("Brook", 21, 60000, 2);
        Developer michael = new Developer("Michael", 28, 110000, "Midle");
        Developer kristina = new Developer("Kristina", 23, 75000, "junior");
        Developer sam = new Developer("Sam", 54, 150000, "Senior");
        Developer smith = new Developer("Smith", 42, 125000, "Senior");
        Manager frank = new Manager("Frank", 25, 70000, true);
        Manager tatiana = new Manager("Tatiana", 27, 85000, false);
        Ceo barry = new Ceo("Barry", 45, 180000, true, true);
        Employee[]employees=new Employee[]{erik,victoria,brook,michael,kristina,sam,smith,frank,tatiana,barry};

        for (Employee s:employees){
            s.goToVocation();
        }

//        erik.vyvod();
//        victoria.vyvod();
//        brook.vyvod();
//        brook.workWithClients();
//
//        michael.vyvod();
//        kristina.vyvod();
//        sam.vyvod();
//        sam.writeCode();
//        smith.vyvod();
//        frank.vyvod();
//        frank.writeProcedures();
//
//        tatiana.vyvod();
//        barry.vyvod();
//        barry.goPublic();
//        erik.goToDayOff();
//        kristina.goToDayOff();
//        sam.goToDayOff();
//        frank.goToDayOff();
//        barry.goToDayOff();



    }
}
