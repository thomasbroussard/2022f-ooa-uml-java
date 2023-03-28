package fr.epita.files;

import fr.epita.files.datamodel.Fruit;

import java.util.*;

public class LauncherDataStructures {

    public static void main(String[] args) {
        List<String> abc = new ArrayList<>();
        String[] arrays = new String[8];
        String[] arrays2 = new String[]{"a","b","c", "c"};

        List<String> stringsFromArray = Arrays.asList(arrays2);

        Set<String> set = new LinkedHashSet<>(stringsFromArray);

        System.out.println("set" + set);

        List<Fruit> dataDuplicate = Arrays.asList(
                new Fruit("apple", "green", 50),
                new Fruit("apple", "green", 50)
        );

        Set<Fruit> fruitSet = new LinkedHashSet<>(dataDuplicate);

        System.out.println("set" + fruitSet);

        Map<String,Fruit> mapRegistry = new LinkedHashMap<>();

        mapRegistry.put("my favorite",   new Fruit("apple", "green", 50) );

        Queue<Fruit> queue = new LinkedList<>();
        queue.add(new Fruit("apple", "green", 50) );
        queue.poll();
        queue.peek();


        Stack<Fruit> stack = new Stack<>();
        stack.push(new Fruit("apple", "green", 50));
        stack.pop();
        stack.peek();

















    }
}
