package basic.workshop.one;

import java.util.Scanner;

public class MenaxhimiTaskave {
    //shkurtesa main + ENTER (TAB)
    public static void main(String[] args) {
        //ArrayList
        String[] tasks; // vargu ku do ti ruajme taskat (detyrat)
        boolean[] tasksStatus; // statusat e tasqeve

        //nje klase nepermjet se ciles krijojme nje objekt qe na sherben
        // per te lexuar vlera nga shfrytezuesi
        Scanner reader = new Scanner(System.in);

        System.out.println("Sa taska ki mi ruajtur: ");
        int length = reader.nextInt(); //5
        reader.nextLine(); // zbraze bufferin
        //rezervo memorien ne heap, dhe ruaje adresen e tyre ne keto variabla
        //array i tipeve primitive -> mbushet me zero, ose per boolean mbushet me false
        //per tipet reference -> mbushet me null
        tasks = new String[length]; // [null,null,null,null,null]
        tasksStatus = new boolean[length]; //[false, false, false, false, false]

        final String SENTINEL = "EXIT"; // konstante
        //sentinel kur e shkruan EXIT me u nderpre

        String task;
        int taskCounter = 0; //fillo prej zeros

        System.out.printf("Shkruaj taskun e %d: ", (taskCounter + 1));
        task = reader.nextLine();
        //rojtari - SENTINELI qe po kontroll per nje vlere e cila nuk lejohet
        while (!task.equalsIgnoreCase(SENTINEL) && taskCounter < tasks.length) { // negacioni perdoret me !
            tasks[taskCounter] = task; // rreshti 35 koment

            System.out.println("A eshte tasku i perfunduar (P,p per PO, tjerat JO):");
            char perfunduar = reader.nextLine().charAt(0);

            //operatoret e krahasimit ==, >=, <
            // TRUE || TRUE => TRUE
            // TURE || FALSE => TRUE
            // FALSE || TRUE => TRUE
            // FALSE || FALSE => FALSE
            tasksStatus[taskCounter] = perfunduar == 'P' || perfunduar == 'p';
            taskCounter++;
            // pre-increment -> ++i, --i
            // post-increment -> i++, i--
            System.out.printf("Shkruaj taskun e %d: ", (taskCounter + 1));
            task = reader.nextLine();
        }
        System.out.printf("Te perfunduara: %d%n", countFinishedTasks(tasksStatus, taskCounter));
        System.out.printf("Te pa-perfunduara: %d%n", (taskCounter - countFinishedTasks(tasksStatus, taskCounter)));

        printAllTask(tasks, tasksStatus, length);
        System.out.println("Aplikacioni u mbyll!!!");
    }

    public static void printAllTask(String[] tasks, boolean[] tasksStatus, int length) {
        for (int i = 0; i < length; i++) {
            // ?: - operatori ternar
            System.out.printf("%s - %s%n", tasks[i], tasksStatus[i] ? "E KOMPLETUAR" : "E PAPERFUNDUAR");
        }
    }

    //metoda e cila pranon vargun me boolean statuse te tasqeve, dhe numeron ato te perfunduara
    public static int countFinishedTasks(boolean[] tasksStatus, int length) {
        int counter = 0; //
        for (int i = 0; i < length; i++) {
            if (tasksStatus[i]) counter++;
        }
        return counter;
    }


}









