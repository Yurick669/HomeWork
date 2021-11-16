package pro.sky.courseWork;

public class coursework {

    private static Employee[] employee = new Employee[10];

    public static void main(String[] args) {

        employee[0] = new Employee("Иванов Иван Иванович", 1, 37456);
        employee[1] = new Employee("Иванов Степан Иванович", 2, 54334);
        employee[2] = new Employee("Иванов Роман Иванович", 3, 44362);
        employee[3] = new Employee("Иванов Пётр Иванович", 4, 64386);
        employee[4] = new Employee("Иванов Юрий Иванович", 5, 82318);
        employee[5] = new Employee("Иванов Василий Иванович", 6, 64323);
        employee[6] = new Employee("Иванов Илья Иванович", 7, 74346);
        employee[7] = new Employee("Иванов Денис Иванович", 8, 42301);
        employee[8] = new Employee("Иванов Дмитрий Иванович", 9, 39320);
        employee[9] = new Employee("Иванов Игорь Иванович", 10, 85525);

        for (Employee employeeName : employee) {
            if (employee != null) {
                System.out.println(employeeName);
            }
        }

        int salarySum = getSalarySum();
        System.out.println("Сумма затрат = " + salarySum + "руб.");

        int minSalary = getMinSalary().getSalary();
        System.out.println("Минимальная зарплата = " + minSalary + "руб. Сотрудник: " +  getMinSalary().getEmployeeName());

        int maxSalary = getMaxSalary().getSalary();
        System.out.println("Максимальная зарплата = " + maxSalary + "руб. Сотрудник: " + getMaxSalary().getEmployeeName());

        float averageSalary = getAverageSalary();
        System.out.println("Средняя зарплата = " + averageSalary + "руб.");

        for (Employee employeeName : employee) {
            if (employee != null) {
                System.out.println("ФИО: " + employeeName.getEmployeeName());
            }
        }




    }




    private static int getSalarySum() {
        int salarySum = 0;
        for (Employee employee : employee)
            salarySum += employee.getSalary();
        return salarySum;
    }

    private static Employee getMinSalary() {
        float minSalary = employee[0].getSalary();
        Employee nameMinSalary = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
                nameMinSalary = employee[i];
            }
        }
        return nameMinSalary;
    }

    private static Employee getMaxSalary() {
        float maxSalary = employee[0].getSalary();
        Employee nameMaxSalary = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
                nameMaxSalary = employee[i];
            }
        }
        return nameMaxSalary;
    }
    private static float getAverageSalary() {
        float salarySum = getSalarySum();
        float averageSalary = salarySum / employee.length;
        return averageSalary;
    }

}
