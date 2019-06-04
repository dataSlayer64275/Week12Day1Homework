package Staff;

public class Employee {
    private String name;
    private int NInumber;
    private int salary;

    public Employee(String name, int NInumber, int salary){
        this.name = name;
        this.NInumber = NInumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNInumber() {
        return NInumber;
    }

    public int getSalary() {
        return salary;
    }

    public int raiseSalary(double raiseAmount) {
        //How to test this
//        if (raiseAmount < 0)
//            throw new IllegalArgumentException();
        this.salary += raiseAmount;
        return this.salary;
    }

    public double payBonus(){
        double bonusAmount = (this.salary * 0.01);
        return bonusAmount;
    }
}
