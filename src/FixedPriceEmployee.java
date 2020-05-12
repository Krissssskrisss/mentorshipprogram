public class FixedPriceEmployee extends Employee{

    private double fixedSalary;

    FixedPriceEmployee(String firstName, String lastName, int id, double fixedSalary){
        super(firstName, lastName, id);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double getAverageSalary() {
          return this.fixedSalary;
    }

}
