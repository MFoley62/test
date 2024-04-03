package com.company;

import java.util.*;

public class ArraylistEx {
    public static void main(String[] args) {
//        List<Integer> numberList = Arrays.asList(1,2,3,4);
//        numberList.replaceAll(e -> e * 2);
//        System.out.println(numberList);
//        for (Integer e : numberList){
//            numberList.set(numberList.indexOf(e), e *2);
//        }
//        System.out.println(numberList);

//        List<String> firstList =new ArrayList<>();
//        firstList.add("Java");
//        firstList.add("Python");
//        List<String> secondList = new ArrayList<>();
//        secondList.add("Scala");
//        secondList.add("Kotlin");
//        secondList.add("React.js");
//        secondList.add("Vue.js");
//
//        secondList.addAll(firstList);
//        List<String> thirdList = new ArrayList<>(secondList);


        Queue<String> linkList = new LinkedList<>();
        linkList.add("React.js");
        linkList.add("Vue.js");
        linkList.add("Python");
        linkList.add("Java");
        System.out.println(linkList);
        String str1 = linkList.peek();
        System.out.println("Accessed Element : " + str1);
        String str2 = linkList.poll();
        System.out.println("LinkedList after poll() : " + str2);
        System.out.println(linkList);
        linkList.offer("Swift");
        System.out.println(linkList);
        System.out.println(linkList.toArray()[3]);

        Deque<String> animalList = new LinkedList<>();
        animalList.add("Cow1");
        animalList.add("Cow2");
        animalList.add("Cow3");
        animalList.add("Cow4");
        animalList.add("Cow5");
        System.out.println("linkedlist deques " + animalList);
        animalList.addFirst("Dog");
        System.out.println("New LinkedList : " + animalList);
        animalList.addLast("Cat");
        System.out.println("New new linkedlist : " + animalList);
        animalList.removeFirst();
        System.out.println("Remove First Status " + animalList);
        animalList.removeLast();
        System.out.println("Remove Last Status " + animalList);
    }
}
