public class Employee {
    private String firstName;
    private String lastName;
    private double id;
    private String category;
    private double payment;

    public Employee(String firstName, String lastName, double id, String category, double payment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.category = category;
        this.payment = payment;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(double id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public double getPayment() {
        return payment;
    }
}
