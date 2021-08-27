package com.company;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Integer> myTreeSet = new TreeSet<>();

        myTreeSet.add(-2000);
        myTreeSet.add(18);
        myTreeSet.add(59);
        myTreeSet.add(1);
        myTreeSet.add(1994);
        myTreeSet.add(18);

        // Print whole TreeSet (It is automatically sorted)
        System.out.println("All elements of the tree: " + myTreeSet);

        // Get first and last elements
        System.out.println("First element: " + myTreeSet.first());
        System.out.println("Last element: " + myTreeSet.last());

        // Remove the chosen element
        myTreeSet.remove(59);
        System.out.println("Removed a value: " + myTreeSet);

        TreeSet<String> myStringSet = new TreeSet<>();

        myStringSet.add("Oksana");
        myStringSet.add("Martins");
        myStringSet.add("Cat");
        myStringSet.add("Artjoms");
        myStringSet.add("Kate");

        System.out.println(myStringSet);

    }
}
