import java.util.ArrayList;
import java.util.List;

class ConstructionTeam {
    private int teamId;
    private List<String> members;

    public ConstructionTeam(int teamId) {
        this.teamId = teamId;
        this.members = new ArrayList<>();
    }

    public void startConstruction() {
        System.out.println("Строительная бригада " + teamId + " начала строительство.");
    }

    public void completeConstruction() {
        System.out.println("Строительная бригада " + teamId + " завершила строительство.");
    }

    public void addMember(String member) {
        members.add(member);
        System.out.println("Добавлен участник " + member + " в строительную бригаду " + teamId);
    }
}




