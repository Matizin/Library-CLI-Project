public class User {

    private String fullName;
    private double money;

    public User(String fullName, double money){
        this.fullName = fullName;
        this.money = money;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    

}
