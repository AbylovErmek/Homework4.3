package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите названия обьектов в Список А:");
        ArrayList<String> list1 = new ArrayList<>();
        while (list1.size() < 5) {
            Scanner scanner = new Scanner(System.in);
            String s1 = scanner.nextLine();
            list1.add(s1);
        }
        System.out.println("Это Список А");
        getInfo(list1);

        System.out.println("Введите названия обьектов в Список Б:");
        ArrayList<String> list2 = new ArrayList<>();
        while (list2.size() < 5) {
            Scanner sc = new Scanner(System.in);
            String s2 = sc.nextLine();
            list2.add(s2);
        }
        System.out.println("Это Список Б");
        getInfo(list2);

        System.out.println("Обьедененный Список С:");
        ArrayList<String> list3 = new ArrayList<>();
        Collections.reverse(list2);
        Iterator<String> iterator = list2.iterator();
        while (iterator.hasNext()) {
            Iterator<String> iterator1 = list1.iterator();
            while (iterator1.hasNext()) {
                String f = iterator1.next();
                list3.add(f);
                iterator1.remove();
                break;
            }
        String s = iterator.next();
            list3.add(s);
        }

        getInfo(list3);
        list3.sort(Comparator.comparing(String::length));
        System.out.println("Отсортированный Список С:");
        getInfo(list3);

    }

    public static void getInfo(ArrayList<?> arrayList) {
        Iterator<?> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
