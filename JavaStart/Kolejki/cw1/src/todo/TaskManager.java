package todo;

import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
    private Queue<Task> taskQueue = new PriorityQueue<>();
    Scanner skanuj = new Scanner(System.in);

    void mainLoop(){
        Option option;
        do{
            printOptions();
            System.out.println("Wybierz opcje:");
            option = Option.createFromInt(skanuj.nextInt());
            skanuj.nextLine();
            switch (option) {
                case ADD:
                    taskQueue.offer(readAndCreateTask());
                    System.out.println("Zadanie dodane do kolejki!");
                    break;
                case TAKE:
                    takeTask();
                    break;
                case EXIT:
                    System.out.println("Do widzenia!");
                    break;
            }
        }while (option != Option.EXIT);
    }

    private void takeTask() {
        if(taskQueue.isEmpty()){
            System.out.println("Brak zadan do wykonania");
        }else {
            Task nextTask = taskQueue.poll();
            System.out.print("Zadanie do wykonania:");
            System.out.println(nextTask);
        }
    }

    private Task readAndCreateTask() {
        System.out.println("Podaj nazwe zadania:");
        String nazwa = skanuj.nextLine();
        System.out.println("Podaj opis zadania:");
        String  opis = skanuj.nextLine();
        System.out.println("Podaj priorytet zadania:");
        for (Task.Priority priority : Task.Priority.values()) {
            System.out.print(priority + " ");
        }
        System.out.println();
        Task.Priority priority = Task.Priority.valueOf(skanuj.nextLine().toUpperCase(Locale.ROOT));
        return new Task(nazwa,opis,priority);

    }

    private void printOptions() {
        Option[] values = Option.values();
        for (Option value : values) {
            System.out.println(value);
        }
    }

    private enum Option{
        ADD(0,"Dodaj zadanie"),
        TAKE(1,"Wykonaj kolejne zadanie"),
        EXIT(2, "Wyjdz");
        int option;
        String description;

        Option(int option, String description) {
            this.option = option;
            this.description = description;
        }
        static Option createFromInt(int option){
            return values()[option];
        }

        @Override
        public String toString() {
            return option + " - " + description;
        }
    }

}
