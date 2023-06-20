package Model;

public class Customer {
    private int customerId;
    private String registationCode;
    private String fullName;
    private String email;
    private String telephone;

    public Customer(int parCustomerId, String parRegistationCode, String parFullName, String parEmail, String parTelephone){
        customerId = parCustomerId;
        registationCode = parRegistationCode;
        fullName =parFullName;
        email =parEmail;
        telephone =parTelephone;
    }

    public int GetCustomerId() {
        return customerId;
    }

    public String GetRegistationCode() {
        return registationCode;
    }

    public String GetFullName() {
        return fullName;
    }

    public String GetEmail() {
        return email;
    }

    public String GetTelephone() {
        return telephone;
    }

    public void SetCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void SetRegistationCode(String registationCode) {
        this.registationCode = registationCode;
    }

    public void SetFullName(String fullName) {
        this.fullName = fullName;
    }

    public void SetEmail(String email) {
        this.email = email;
    }

    public void SetTelephone(String telephone) {
        this.telephone = telephone;
    }
}
