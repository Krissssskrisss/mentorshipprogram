public class PerHourEmployee  extends Employee{

    private double pricePerHour;

    PerHourEmployee(String firstName, String lastName, int id, double pricePerHour){
        super(firstName, lastName, id);
        this.pricePerHour = pricePerHour;
    }

    @Override
    public double getAverageSalary() {
        return 20.8 * 8 * this.pricePerHour;
    }

}

