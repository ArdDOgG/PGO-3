public class CafeCustomer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;

    public CafeCustomer(int customerId, String firstName, String lastName, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
public String getCustomerInfo() {
        return "Customer ID: " +customerId + "\t" + "First Name: "+ firstName + "\t" +"Last Name: "+ lastName + "\t" + "Email address: "+ email;
}

public String getFirstName() {
        return firstName;
}

@Override
    public String toString() {
        return getCustomerInfo();
}
@Override
    public boolean equals(Object o) {
if (this == o) return true;
if(!(o instanceof CafeCustomer)) return false;
CafeCustomer other = (CafeCustomer) o;
return this.customerId == other.customerId || this.email.equals(other.email);
}

}
