public class Invited {
    private String name;
    private int age;
    private String inviteCode;

    public Invited(String name, int age, String inviteCode) {
        this.name = name;
        this.age = age;
        this.inviteCode = inviteCode;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    @Override
    public String toString() {
        return "Invited[" + name + ", " + age + ", "+ inviteCode + "]";
    }
}
