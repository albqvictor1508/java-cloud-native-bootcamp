import java.util.HashSet;
import java.util.Set;

public class Inviteds {
    private Set<Invited> inviteds;

    public Inviteds() {
        this.inviteds = new HashSet<>();
    }

    public void addNewInvited(String name, int age, String inviteCode) {
        this.inviteds.add(new Invited(name, age, inviteCode));
    }

    public void removeInvitedByInviteCode(int inviteCode) {
        Invited invitedToRemove = null;
        for(Invited i : this.inviteds) {
            if(i.getInviteCode() == inviteCode) {
                invitedToRemove = i;
                break;
            }
        }
        this.inviteds.remove(invitedToRemove);
    }

    public int countInviteds() {
        return this.inviteds.size();
    }

    public void showInviteds() {
        System.out.println(this.inviteds);
    }
}
