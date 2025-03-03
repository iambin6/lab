package week6.bai2;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Worker> lw = new ArrayList<>();
        ArrayList<History> lh = new ArrayList<>();
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.addWorker(lw);
                    break;
                case 2:
                    Manager.changeSalary(lw, lh, 1);
                    break;
                case 3:
                    Manager.changeSalary(lw, lh, 2);
                    break;
                case 4:
                    Manager.printListHistory(lh);
                    break;
                case 5:
                    return;
            }
        }
    }
}
