// Абстрактный класс Siemens Mobile, реализующий интерфейс Mobile
abstract class SiemensMobile implements Mobile {
    private String model;

    public SiemensMobile(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    // Реализация метода звонка для мобильных телефонов Siemens
    public void call(String number) {
        System.out.println("Вызов из мобильного телефона Siemens " + getModel() + " по номеру: " + number);
    }

    // Реализация метода отправки сообщения для мобильных телефонов Siemens
    public void sendMessage(String number, String message) {
        System.out.println("Отправка сообщения из мобильного телефона Siemens " + getModel() + " на номер " + number + ": " + message);
    }
}
