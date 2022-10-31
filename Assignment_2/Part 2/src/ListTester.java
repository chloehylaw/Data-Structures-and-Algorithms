/*
import java.util.Random;

public class ListTester {
    public static MyLinkedList<Integer> lst;
    public static MyArrayList<Integer> array;

    public static void main(String[] args) {

        //create the objects of the classs
        //MyArrayList and MyLinkedList
        array = new MyArrayList<Integer>();
        lst = new MyLinkedList<>();

        //declare the variables
        Random random = new Random();
        int number, location;
        int N[] = { 10, 100, 1000,10000 };

        //measure how long it takes to insert N integer numbers
        //(int, or Integer) with random values ranging from 0 to 2N into the lists
        for (int k : N) {
            System.out.println("N =" + k
                    + "\t\t\tInsert@start(ms)\tInsert@end (ms)\tInsert@random(ms)");

            //inserting them at the beginning of MyArrayList
            long startTime = System.nanoTime();
            for (int i = 0; i < k; i++) {
                number = random.nextInt((2 * k) + 1);
                array.add(i, number);
            }

            long endTime = System.nanoTime();
            long insertStart = endTime - startTime;
            insertStart = (insertStart / 1000000);

            //inserting them at the end of MyArrayList
            startTime = System.nanoTime();
            for (int i = k - 1; i >= 0; i--) {
                number = random.nextInt((2 * k) + 1);
                array.add(i, number);
            }

            endTime = System.nanoTime();
            long insertEnd = endTime - startTime;
            insertEnd = (insertEnd / 1000000);

            //inserting them at the random location of MyArrayList
            startTime = System.nanoTime();
            for (int i = k - 1; i >= 0; i--) {
                number = random.nextInt((2 * k) + 1);
                location = random.nextInt(k + 1);
                array.add(location, number);
            }

            endTime = System.nanoTime();
            long insertRan = endTime - startTime;
            insertRan = (insertRan / 1000000);

            System.out.println("MyArrayList\t\t\t\t" + insertStart + "\t\t\t\t"
                    + insertEnd + "\t\t\t\t\t" + insertRan);

            //inserting them at the beginning of MyLinkedList
            startTime = System.nanoTime();
            for (int i = 0; i < k; i++) {
                number = random.nextInt((2 * k) + 1);
                lst.add(i, number);
            }

            endTime = System.nanoTime();
            long insertListStart = endTime - startTime;
            insertStart = (insertStart / 1000000);

            //inserting them at the end of MyLinkedList
            startTime = System.nanoTime();
            for (int i = k - 1; i >= 0; i--) {
                number = random.nextInt((2 * k) + 1);
                lst.add(i, number);
            }

            endTime = System.nanoTime();
            long insertListEnd = endTime - startTime;
            insertEnd = (insertEnd / 1000000);

            //inserting them at the random location of MyLinkedList
            startTime = System.nanoTime();
            for (int i = k - 1; i >= 0; i--) {
                number = random.nextInt((2 * k) + 1);
                location = random.nextInt(k + 1);
                lst.add(location, number);
            }

            endTime = System.nanoTime();
            long insertListRan = endTime - startTime;
            insertRan = (insertRan / 1000000);

            System.out.println("MyLinkedList\t\t\t" + insertListStart + "\t\t\t"
                    + insertListEnd + "\t\t\t\t" + insertListRan + "\n\n");

        }

        //removing the elements from MyArrayList and MyLinkedList
        for (int j = 0; j < N.length; j++) {
            System.out.println("N =" + N[j]
                    + "\t\t\tRemove@start(ms)\tRemove@end (ms)\tRemove@random(ms)");

            long startTime = System.nanoTime();
            for (int i = 0; i < N[j]; i++) {
                array.remove(i);
            }

            long endTime = System.nanoTime();
            long insertStart = endTime - startTime;
            insertStart = (insertStart / 1000000);
            startTime = System.nanoTime();

            array.subList(0, N[j]).clear();

            endTime = System.nanoTime();
            long insertEnd = endTime - startTime;
            insertEnd = (insertEnd / 1000000);
            startTime = System.nanoTime();

           for (int i = N[j] - 1; i >= 0; i--) {
                location = random.nextInt(N[j] + 1);
                array.remove(location);
            }

            endTime = System.nanoTime();
            long insertRan = endTime - startTime;
            insertRan = (insertRan / 1000000);
            System.out.println("MyArrayList\t\t\t\t" + insertStart + "\t\t\t\t"
                    + insertEnd + "\t\t\t\t\t" + insertRan);

            startTime = System.nanoTime();
            for (int i = 0; i < N[j]; i++) {
                lst.remove(i);
            }

            endTime = System.nanoTime();
            long insertListStart = endTime - startTime;
            insertStart = (insertStart / 1000000);
            startTime = System.nanoTime();

            lst.subList(0, N[j]).clear();

            endTime = System.nanoTime();
            long insertListEnd = endTime - startTime;
            insertEnd = (insertEnd / 1000000);
            startTime = System.nanoTime();

            for (int i = N[j] - 1; i >= 0; i--) {
                location = random.nextInt(N[j]+ 1);
                lst.remove(location);
            }

            endTime = System.nanoTime();
            long insertListRan = endTime - startTime;
            insertRan = (insertRan / 1000000);
            System.out.println("MyLinkedList\t\t\t" + insertListStart + "\t\t\t"
                    + insertListEnd + "\t\t\t\t" + insertListRan + "\n\n");

        }
    }
}*/

import java.util.Random;

public class ListTester

{

    public static MyLinkedList lst;

    public static MyArrayList array;

    public static void main(String[] args)

    {

//create the objects of the classs

//MyArrayList and MyLinkedList

        array = new MyArrayList();

        lst = new MyLinkedList();

//declare the variables

        Random random = new Random();

        int number, location;

        int N[] = { 10, 100, 1000,10000 };

//measure how long it takes to insert N integer numbers

//(int, or Integer) with random values ranging from 0 to 2N into the lists

        for (int j = 0; j < N.length; j++)

        {

            System.out.println("N =" + N[j]

                    + "\t\t\tInsert@start(ms)\tInsert@end (ms)\tInsert@random(ms)");

//inserting them at the beginning of MyArrayList

            long startTime = System.nanoTime();

            for (int i = 0; i < N[j]; i++)

            {

                number = random.nextInt((2 * N[j]) - 0 + 1) + 0;

                array.add(i, number);

            }

            long endTime = System.nanoTime();

            long insertStart = endTime - startTime;

            insertStart = (insertStart / 1000000);

//inserting them at the end of MyArrayList

            startTime = System.nanoTime();

            for (int i = N[j] - 1; i >= 0; i--)

            {

                number = random.nextInt((2 * N[j]) - 0 + 1) + 0;

                array.add(i, number);

            }

            endTime = System.nanoTime();

            long insertEnd = endTime - startTime;

            insertEnd = (insertEnd / 1000000);

//inserting them at the random location of MyArrayList

            startTime = System.nanoTime();

            for (int i = N[j] - 1; i >= 0; i--)

            {

                number = random.nextInt((2 * N[j]) - 0 + 1) + 0;

                location = random.nextInt(N[j] - 0 + 1) + 0;

                array.add(location, number);

            }

            endTime = System.nanoTime();

            long insertRan = endTime - startTime;

            insertRan = (insertRan / 1000000);

            System.out.println("MyArrayList\t\t\t\t" + insertStart + "\t\t\t\t"

                    + insertEnd + "\t\t\t\t\t" + insertRan);

//inserting them at the beginning of MyLinkedList

            startTime = System.nanoTime();

            for (int i = 0; i < N[j]; i++)

            {

                number = random.nextInt((2 * N[j]) - 0 + 1) + 0;

                lst.add(i, number);

            }

            endTime = System.nanoTime();

            long insertListStart = endTime - startTime;

            insertStart = (insertStart / 1000000);

//inserting them at the end of MyLinkedList

            startTime = System.nanoTime();

            for (int i = N[j] - 1; i >= 0; i--)

            {

                number = random.nextInt((2 * N[j]) - 0 + 1) + 0;

                lst.add(i, number);

            }

            endTime = System.nanoTime();

            long insertListEnd = endTime - startTime;

            insertEnd = (insertEnd / 1000000);

//inserting them at the random location of MyLinkedList

            startTime = System.nanoTime();

            for (int i = N[j] - 1; i >= 0; i--)

            {

                number = random.nextInt((2 * N[j]) - 0 + 1) + 0;

                location = random.nextInt(N[j] - 0 + 1) + 0;

                lst.add(location, number);

            }

            endTime = System.nanoTime();

            long insertListRan = endTime - startTime;

            insertRan = (insertRan / 1000000);

            System.out.println("MyLinkedList\t\t\t" + insertListStart + "\t\t\t"

                    + insertListEnd + "\t\t\t\t" + insertListRan + "\n\n");

        }

//removing the elements from MyArrayList and MyLinkedList

        for (int j = 0; j < N.length; j++)

        {

            System.out.println("N =" + N[j]

                    + "\t\t\tRemove@start(ms)\tRemove@end (ms)\tRemove@random(ms)");

            long startTime = System.nanoTime();

            for (int i = 0; i < N[j]; i++)

            {

                array.remove(i);

            }

            long endTime = System.nanoTime();

            long insertStart = endTime - startTime;

            insertStart = (insertStart / 1000000);

            startTime = System.nanoTime();

            for (int i = N[j] - 1; i >= 0; i--)

            {

                array.remove(i);

            }

            endTime = System.nanoTime();

            long insertEnd = endTime - startTime;

            insertEnd = (insertEnd / 1000000);

            startTime = System.nanoTime();

            for (int i = N[j] - 1; i >= 0; i--)

            {

                location = random.nextInt(N[j] - 0 + 1) + 0;

                array.remove(location);

            }

            endTime = System.nanoTime();

            long insertRan = endTime - startTime;

            insertRan = (insertRan / 1000000);

            System.out.println("MyArrayList\t\t\t\t" + insertStart + "\t\t\t\t"

                    + insertEnd + "\t\t\t\t\t" + insertRan);

            startTime = System.nanoTime();

            for (int i = 0; i < N[j]; i++)

            {

                lst.remove(i);

            }

            endTime = System.nanoTime();

            long insertListStart = endTime - startTime;

            insertStart = (insertStart / 1000000);

            startTime = System.nanoTime();

            for (int i = N[j] - 1; i >= 0; i--)

            {

                lst.remove(i);

            }

            endTime = System.nanoTime();

            long insertListEnd = endTime - startTime;

            insertEnd = (insertEnd / 1000000);

            startTime = System.nanoTime();

            for (int i = N[j] - 1; i >= 0; i--)

            {

                location = random.nextInt(N[j] - 0 + 1) + 0;

                lst.remove(location);

            }

            endTime = System.nanoTime();

            long insertListRan = endTime - startTime;

            insertRan = (insertRan / 1000000);

            System.out.println("MyLinkedList\t\t\t" + insertListStart + "\t\t\t"

                    + insertListEnd + "\t\t\t\t" + insertListRan + "\n\n");

        }

    }

}