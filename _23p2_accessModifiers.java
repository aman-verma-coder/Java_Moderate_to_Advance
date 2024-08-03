public class _23p2_accessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "amanverma1234";
        myAcc.setPassword("asdf");
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
        System.out.println("Password: " + password);
    }
}