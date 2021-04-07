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
        int taskIndex = 0; //fillo prej zeros

        System.out.printf("Shkruaj taskun e %d: ", (taskIndex + 1));
        task = reader.nextLine();
        //rojtari - SENTINELI qe po kontroll per nje vlere e cila nuk lejohet
        while (!task.equalsIgnoreCase(SENTINEL) && taskIndex < tasks.length) { // negacioni perdoret me !
            tasks[taskIndex] = task; // rreshti 35 koment

            System.out.println("A eshte tasku i perfunduar (P,p per PO, tjerat JO):");
            char perfunduar = reader.nextLine().charAt(0);

            //operatoret e krahasimit ==, >=, <
            // TRUE || TRUE => TRUE
            // TURE || FALSE => TRUE
            // FALSE || TRUE => TRUE
            // FALSE || FALSE => FALSE
            tasksStatus[taskIndex] = perfunduar == 'P' || perfunduar == 'p';
            taskIndex++;
            // pre-increment -> ++i, --i
            // post-increment -> i++, i--


            System.out.printf("Shkruaj taskun e %d: ", (taskIndex + 1));
            task = reader.nextLine();
        }

        System.out.println("Aplikacioni u mbyll!!!");

    }


}









