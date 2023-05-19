public class Main {
    public static void main(String[] args) {
        ConstructionOffice constructionOffice = new ConstructionOffice();

        TechnicalTask technicalTask = new TechnicalTask(1, "Проектирование многоэтажного дома");
        constructionOffice.registerTechnicalTask(technicalTask);

        constructionOffice.calculateCost(technicalTask);

        Customer customer = new Customer(1, "Иван");
        customer.submitTechnicalTask(technicalTask);

        Invoice invoice = new Invoice(1, 5000.0);
        customer.receiveInvoice(invoice);

        constructionOffice.createConstructionTeam();

        ConstructionTeam constructionTeam = constructionOffice.getConstructionTeams().get(0);
        constructionTeam.addMember("Алексей");

        constructionTeam.startConstruction();
        constructionTeam.completeConstruction();
    }
}


//1.	Класс Customer (Заказчик):
//    •	Свойства:
//    •	customerId (идентификатор заказчика)
//    •	name (имя заказчика)
//    •	technicalTask (техническое задание)
//    •	invoice (счет за проектирование)
//    •	Методы:
//    •	submitTechnicalTask(technicalTask: TechnicalTask) - представляет техническое задание на проектирование
//    •	receiveInvoice(invoice: Invoice) - получает счет за проектирование
//2.	Класс TechnicalTask (Техническое задание):
//    •	Свойства:
//    •	taskId (идентификатор задания)
//    •	description (описание задания)
//    •	Методы (по необходимости):
//    •	Геттеры и сеттеры для свойств
//3.	Класс Invoice (Счет):
//    •	Свойства:
//    •	invoiceId (идентификатор счета)
//    •	amount (сумма счета за проектирование)
//    •	Методы (по необходимости):
//    •	Геттеры и сеттеры для свойств
//4.	Класс ConstructionTeam (Бригада Конструкторов):
//    •	Свойства:
//    •	teamId (идентификатор бригады)
//    •	members (список участников бригады)
//    •	Методы:
//    •	Методы для выполнения проекта, например, startConstruction(), completeConstruction()
//5.	Класс ConstructionOffice (Конструкторское бюро):
//    •	Свойства:
//    •	technicalTasks (список зарегистрированных технических заданий)
//    •	constructionTeams (список созданных бригад конструкторов)
//    •	Методы:
//    •	registerTechnicalTask(technicalTask: TechnicalTask) - регистрирует техническое задание
//    •	calculateCost(technicalTask: TechnicalTask) - определяет стоимость проектирования и строительства
//    •	createConstructionTeam() - создает бригаду конструкторов для выполнения проекта