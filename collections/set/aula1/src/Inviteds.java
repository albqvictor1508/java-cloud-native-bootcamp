import java.util.HashSet;
import java.util.Set;

public class Inviteds {
    private Set<Invited> inviteds;

    public Inviteds() {
        this.inviteds = new HashSet<>();
    }

    public void addNewInvited(Invited invited) {
        this.inviteds.add(invited);
    }

    public void removeInvitedByInviteCode(String inviteCode) {
        for(Invited i : this.inviteds) {
            if(i.getInviteCode().equalsIgnoreCase(inviteCode)) {
                this.inviteds.remove(i);
            }
        }
    }

    public int countInviteds() {
        return this.inviteds.size();
    }

    public void showInviteds() {
        System.out.println(this.inviteds);
    }
}
