public class Account {
    int acc_no;
    String c_name;
    int p_no;
    String email;
    String location;
    int bal;

    void withdraw(int amt){
      bal = bal - amt;
    }
    void deposit(int amt){
        bal = bal + amt;
    }
}
