import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Department> departments;

    public Shop() {
        departments = new ArrayList<>();
    }

    // Добавляет новый отдел в магазин
    public void addDepartment(String name) {
        Department department = new Department(name);
        departments.add(department);
    }

    // Добавляет товар в указанный отдел
    public void addProductToDepartment(String departmentName, String productName) {
        Department department = findDepartmentByName(departmentName);
        if (department != null) {
            department.addProduct(productName);
        }
    }

    // Добавляет услугу в указанный отдел
    public void addServiceToDepartment(String departmentName, String serviceName) {
        Department department = findDepartmentByName(departmentName);
        if (department != null) {
            department.addService(serviceName);
        }
    }

    // Выводит информацию о всех отделах магазина
    public void printDepartments() {
        System.out.println("Отделы в магазине:");
        for (Department department : departments) {
            System.out.println(department);
        }
    }

    // Поиск отдела по имени
    private Department findDepartmentByName(String name) {
        for (Department department : departments) {
            if (department.getName().equals(name)) {
                return department;
            }
        }
        return null;
    }

    // Внутренний класс, представляющий отдел магазина
    private class Department {
        private String name;
        private List<String> products;
        private List<String> services;

        public Department(String name) {
            this.name = name;
            products = new ArrayList<>();
            services = new ArrayList<>();
        }

        // Возвращает имя отдела
        public String getName() {
            return name;
        }

        // Добавляет товар в отдел
        public void addProduct(String productName) {
            products.add(productName);
        }

        // Добавляет услугу в отдел
        public void addService(String serviceName) {
            services.add(serviceName);
        }

        // Возвращает строковое представление отдела
        @Override
        public String toString() {
            return "Отдел: " + name + ", Товары: " + products + ", Услуги: " + services;
        }
    }
}
