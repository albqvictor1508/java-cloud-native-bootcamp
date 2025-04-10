public class Invited {
    private String name;
    private int age;
    private int inviteCode;

    public Invited(String name, int age, int inviteCode) {
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

    public int getInviteCode() {
        return inviteCode;
    }

    @Override
    public String toString() {
        return "Invited[" + name + ", " + age + ", "+ inviteCode + "]";
    }
}
