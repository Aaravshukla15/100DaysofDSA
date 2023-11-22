/**
 *  
 */
class Account {
    public String bname;
    protected String email;
    private String password;

    // getters and setters
    public String getpassword() {
        return this.password;
    }

    public void setpassword(String pass) {
        this.password = pass;
    }

    public void infos(String bname, String email) {
        System.out.println("Bank Name is:" + " " + bname + " " + "and email is:" + " " + email);
    }
}

public class Oops3 {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.bname = "State Bank of India";
        account1.email = "sbi.ind@gmail.com";
        account1.setpassword("Hello_user");
        System.out.println(account1.getpassword());

        account1.infos(account1.bname, account1.email);
    }
}
