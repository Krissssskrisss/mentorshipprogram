public class Main{
    public static void main(String[] args) {

     FixedPriceEmployee FixedPriceEmployee = new FixedPriceEmployee("Kriss", "Vas", 1,245);

     PerHourEmployee perHourEmployee = new PerHourEmployee("Dan", "Dd", 45, 2);


        System.out.println(FixedPriceEmployee.employeeToString());
        System.out.println(perHourEmployee.employeeToString());

    }

}

