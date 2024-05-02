package org.example;

import java.util.Scanner;

public class ProjectManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Project project = new Project("O00O", "Новый программный проект");

        while (true) {
            System.out.println("1. Добавить сотрудника в проект");
            System.out.println("2. Удалить сотрудника из проекта");
            System.out.println("3. Добавить задачу в проект");
            System.out.println("4. Удалить задачу из проекта");
            System.out.println("5. Отображение информации о проекте");
            System.out.println("6. Выход");
            System.out.print("Введите свой выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите идентификатор сотрудника: ");
                    String employeeId = scanner.nextLine();
                    System.out.print("Введите имя сотрудника: ");
                    String employeeName = scanner.nextLine();
                    System.out.print("Введите должность сотрудника: ");
                    String employeePosition = scanner.nextLine();
                    Employee employee = new Employee(employeeId, employeeName, employeePosition);
                    project.addEmployee(employee);
                    break;
                case 2:
                    System.out.print("Введите идентификатор сотрудника, чтобы удалить: ");
                    String removeEmployeeId = scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Введите идентификатор задачи: ");
                    String taskId = scanner.nextLine();
                    System.out.print("Введите описание задачи: ");
                    String taskDescription = scanner.nextLine();
                    System.out.print("Введите статус задачи: ");
                    String taskStatus = scanner.nextLine();
                    System.out.print("Введите срок выполнения задачи: ");
                    String taskDeadline = scanner.nextLine();
                    Task task = new Task(taskId, taskDescription, taskStatus, taskDeadline);
                    project.addTask(task);
                    break;
                case 4:
                    System.out.print("Введите идентификатор задачи для удаления: ");
                    String removeTaskId = scanner.nextLine();
                    break;
                case 5:
                    project.displayInfo();
                    break;
                case 6:
                    System.out.println("Выход...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, введите число от 1 до 6.");
            }
        }
    }
}
