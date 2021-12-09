package gameStore.dataModel.user;

import java.util.Objects;

public class User {
    private String realName;
    private String nickname;
    private final Long id;
    private final Role role;
    private String password;
    private final String email;
    private Double balance;
    private Double bonusBalance;

    public User(String realName, String nickname, Long id, Role role, String password, String email,
                Double balance, Double bonusBalance) {
        this.realName = realName;
        this.nickname = nickname;
        this.id = id;
        this.role = role;
        this.password = password;
        this.email = email;
        this.balance = balance;
        this.bonusBalance = bonusBalance;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Long getId() {
        return id;
    }

    public Role getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBonusBalance() {
        return bonusBalance;
    }

    public void setBonusBalance(Double bonusBalance) {
        this.bonusBalance = bonusBalance;
    }

    @Override
    public String toString() {
        return "User:\n" +
                "RealName: " + realName + "\n" +
                "Nickname: " + nickname + "\n" +
                "Id: " + id + "\n" +
                "Role: " + role + "\n" +
                "Password: " + password + "\n" +
                "Email: " + email + "\n" +
                "Balance: " + balance + "\n" +
                "Bonus balance: " + bonusBalance;
    }

    public String userInfo() {
        String user = "User: \n" +
                "RealName: %s" + "\n" +
                "Nickname: %s" + "\n" +
                "Id: %d" + "\n" +
                "Role: %s" + "\n" +
                "Email: %s" + "\n" +
                "Balance: %f" + "\n" +
                "Bonus balance: %f";

        return String.format(user, realName, nickname, id, role, email, balance, bonusBalance);
    }

    public String balanceInfo() {
        String balance = "Your account balance: %f" + "\n" +
                "Your account bonus balance: %f";
        return String.format(balance, this.balance, this.bonusBalance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getNickname().equals(user.getNickname()) && getId().equals(user.getId()) &&
                getRole() == user.getRole() && getEmail().equals(user.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNickname(), getId(), getRole(), getEmail());
    }
}
