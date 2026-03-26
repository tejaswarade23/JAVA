package Employee;

import Date.ConsoleInput;

public class Program {

    public static void main(String[] args) {

        LinkedList objList = new LinkedList();

        int choice = 0;

        final int MENU_ADD = 1;
        final int MENU_DISPLAY = 2;
        final int MENU_SORT = 3;
        final int MENU_EXIT = 4;

        do {
            System.out.println("\n1. Add");
            System.out.println("2. Display");
            System.out.println("3. Sort");
            System.out.println("4. Exit");
            System.out.print("Enter your Choice: ");

            choice = ConsoleInput.getInt();

            switch (choice) {

                //  ADD
                case MENU_ADD: {
                    int subChoice;

                    do {
                        System.out.println("\n1. Manager");
                        System.out.println("2. Engineer");
                        System.out.println("3. SalesPerson");
                        System.out.println("4. Exit");

                        subChoice = ConsoleInput.getInt();

                        if (subChoice == 4)
                            break;

                        System.out.print("Enter Name: ");
                        String name = ConsoleInput.getString();

                        System.out.print("Enter Address: ");
                        String address = ConsoleInput.getString();

                        System.out.print("Enter Age: ");
                        int age = ConsoleInput.getInt();

                        System.out.print("Enter Gender (true/false): ");
                        boolean gender = Boolean.parseBoolean(ConsoleInput.getString());

                        System.out.print("Enter Basic Salary: ");
                        float basicSalary = ConsoleInput.getFloat();

                        switch (subChoice) {

                            case 1:
                                System.out.print("Enter HRA: ");
                                float hra = ConsoleInput.getFloat();
                                objList.add(new Manager(name, address, age, gender, basicSalary, hra));
                                break;

                            case 2:
                                System.out.print("Enter OT: ");
                                float ot = ConsoleInput.getFloat();
                                objList.add(new Engineer(name, address, age, gender, basicSalary, ot));
                                break;

                            case 3:
                                System.out.print("Enter Commission: ");
                                float commission = ConsoleInput.getFloat();
                                objList.add(new SalesPerson(name, address, age, gender, basicSalary, commission));
                                break;

                            default:
                                System.out.println("Invalid choice");
                        }

                    } while (true);
                    break;
                }

                //  DISPLAY
                case MENU_DISPLAY: {

                    Object data = objList.getFirst();

                    while (data != null) {
                        displayEmployee((Employee) data);
                        data = objList.getNext();
                    }
                    break;
                }

                //  SORT
                case MENU_SORT: {

                    Object[] arr = objList.toArray();

                    System.out.println("\n1. Managers");
                    System.out.println("2. Engineers");
                    System.out.println("3. SalesPerson");
                    System.out.println("4. Name Ascending");
                    System.out.println("5. Name Descending");

                    int sortChoice = ConsoleInput.getInt();

                    switch (sortChoice) {

                        case 1:
                            for (Object obj : arr)
                                if (obj instanceof Manager)
                                    displayEmployee((Employee) obj);
                            break;

                        case 2:
                            for (Object obj : arr)
                                if (obj instanceof Engineer)
                                    displayEmployee((Employee) obj);
                            break;

                        case 3:
                            for (Object obj : arr)
                                if (obj instanceof SalesPerson)
                                    displayEmployee((Employee) obj);
                            break;

                        case 4: // Ascending
                            for (int i = 0; i < arr.length - 1; i++)
                                for (int j = i + 1; j < arr.length; j++)
                                    if (((Employee) arr[i]).getName().compareTo(((Employee) arr[j]).getName()) > 0) {
                                        Object temp = arr[i];
                                        arr[i] = arr[j];
                                        arr[j] = temp;
                                    }
                            displayArray(arr);
                            break;

                        case 5: // Descending
                            for (int i = 0; i < arr.length - 1; i++)
                                for (int j = i + 1; j < arr.length; j++)
                                    if (((Employee) arr[i]).getName().compareTo(((Employee) arr[j]).getName()) < 0) {
                                        Object temp = arr[i];
                                        arr[i] = arr[j];
                                        arr[j] = temp;
                                    }
                            displayArray(arr);
                            break;

                        default:
                            System.out.println("Invalid choice");
                    }
                    break;
                }

                case MENU_EXIT:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != MENU_EXIT);
    }

    //  DISPLAY METHOD
    public static void displayEmployee(Employee emp) {

        System.out.println("------------------------");
        System.out.println("Name : " + emp.getName());
        System.out.println("Address : " + emp.getAddress());
        System.out.println("Age : " + emp.getAge());
        System.out.println("Gender : " + emp.isGender());
        System.out.println("Basic Salary : " + emp.getbasicSalary());

        if (emp instanceof Manager)
            System.out.println("HRA : " + ((Manager) emp).getHra());

        else if (emp instanceof Engineer)
            System.out.println("OT : " + ((Engineer) emp).getOverTime());

        else if (emp instanceof SalesPerson)
            System.out.println("Commission : " + ((SalesPerson) emp).getCommission());

        System.out.println("------------------------");
    }

    //  DISPLAY ARRAY (USED IN SORT)
    public static void displayArray(Object[] arr) {
        for (Object obj : arr) {
            displayEmployee((Employee) obj);
        }
    }
}