package transport;

public class Mechanic{
    private String names;
    private String company;

    public Mechanic(String names, String company) {
        this.names = names;
        this.company = company;

    }

    public String getNames() {
        return names;
    }

    public void setNames(String name) {
        this.names = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void carryOutMaintenance() {
        System.out.println("Провести техобслуживание");
    }
    public void fixTheCar() {
        System.out.println("Починить машину");
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "names='" + names + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
