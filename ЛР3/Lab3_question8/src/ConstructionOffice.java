import java.util.ArrayList;
import java.util.List;

class ConstructionOffice {
    private List<TechnicalTask> technicalTasks;
    private List<ConstructionTeam> constructionTeams;

    public ConstructionOffice() {
        this.technicalTasks = new ArrayList<>();
        this.constructionTeams = new ArrayList<>();
    }

    public void registerTechnicalTask(TechnicalTask technicalTask) {
        technicalTasks.add(technicalTask);
        System.out.println("Зарегистрировано техническое задание: " + technicalTask.getDescription());
    }

    public void calculateCost(TechnicalTask technicalTask) {
        // Пример логики расчета стоимости на основе технического задания
        double baseCost = 5000.0;
        double additionalCost = technicalTask.getTaskId() * 1000.0;
        double cost = baseCost + additionalCost;
        Invoice invoice = new Invoice(1, cost);
        System.out.println("Расчет стоимости для технического задания: " + technicalTask.getDescription() + " - " + cost + " $");
        // Отправить счет заказчику
    }

    public void createConstructionTeam() {
        int teamId = constructionTeams.size() + 1;
        ConstructionTeam team = new ConstructionTeam(teamId);
        constructionTeams.add(team);
        System.out.println("Создана строительная бригада: " + teamId);
    }

    public List<ConstructionTeam> getConstructionTeams() {
        return constructionTeams;
    }
}
