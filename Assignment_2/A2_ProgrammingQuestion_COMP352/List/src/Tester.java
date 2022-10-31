import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        printToTextFile();
    }

    private static void printToTextFile(){
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        Random random = new Random();
        PrintWriter pw = null;
        long startTime, endTime, durationStart, durationEnd, durationRandom;
        int[] N = {10, 100, 1000, 10000};

        try{
            pw = new PrintWriter(new FileOutputStream("runFile.txt"));

            //========================= PART A ==============================
            // Adding numbers to empty list
            System.out.println("\nPart A");
            pw.println("\nPart A");

            for (int i : N) {
                System.out.println("\nN = " + i + "\t\t\t\tInsert @ Start (ns)\t\t\tInsert @ End (ns)\t\t\tInsert @ Random (ns)");
                pw.println("\nN = " + i + "\t\t\tInsert @ Start (ns)\t\t\tInsert @ End (ns)\t\t\tInsert @ Random (ns)");

                // INSERT START MYARRAYLIST
                startTime = System.nanoTime();
                for (int n = i; n < 1000000; n *= i) {
                    arrayList.add(0, random.nextInt(2 * i));
                }
                endTime = System.nanoTime();
                durationStart = (endTime - startTime);

                // INSERT END MYARRAYLIST
                startTime = System.nanoTime();
                for (int n = i; n < 1000000; n *= i) {
                    arrayList.add(random.nextInt(2 * i));
                }
                endTime = System.nanoTime();
                durationEnd = (endTime - startTime);

                // INSERT RANDOM MYARRAYLIST
                startTime = System.nanoTime();
                for (int n = i; n < 1000000; n *= i) {
                    arrayList.add((int) Math.random(), random.nextInt(2 * i));
                }
                endTime = System.nanoTime();
                durationRandom = (endTime - startTime);

                System.out.println("MyArrayList\t\t\t\t\t" + durationStart + "\t\t\t\t\t" + durationEnd + "\t\t\t\t\t\t\t" + durationRandom);
                pw.println("MyArrayList\t\t\t\t\t" + durationStart + "\t\t\t\t\t" + durationEnd + "\t\t\t\t\t\t\t" + durationRandom);


                // INSERT START MYLINKEDLIST
                startTime = System.nanoTime();
                for (int n = i; n < 1000000; n *= i) {
                    linkedList.add(0, random.nextInt(2 * i));
                }
                endTime = System.nanoTime();
                durationStart = (endTime - startTime);

                // INSERT END MYARRAYLIST
                startTime = System.nanoTime();
                for (int n = i; n < 1000000; n *= i) {
                    linkedList.add(random.nextInt(2 * i));
                }
                endTime = System.nanoTime();
                durationEnd = (endTime - startTime);

                // INSERT RANDOM MYARRAYLIST
                startTime = System.nanoTime();
                for (int n = i; n < 1000000; n *= i) {
                    linkedList.add((int) Math.random(), random.nextInt(2 * i));
                }
                endTime = System.nanoTime();
                durationRandom = (endTime - startTime);

                System.out.println("MyLinkedList\t\t\t\t" + durationStart + "\t\t\t\t\t" + durationEnd + "\t\t\t\t\t\t\t" + durationRandom);
                pw.println("MyLinkedList\t\t\t\t" + durationStart + "\t\t\t\t\t" + durationEnd + "\t\t\t\t\t\t\t" + durationRandom);
            }

            //========================= PART B ==============================
            // Remove N numbers from the lists
            System.out.println("\n\nPart B");
            pw.println("\n\nPart B");

            for (int i : N) {
                System.out.println("\nN = " + i + "\t\t\t\tRemove @ Start (ns)\t\t\tRemove @ End (ns)\t\t\tRemove @ Random (ns)");
                pw.println("\nN = " + i + "\t\t\tRemove @ Start (ns)\t\t\tRemove @ End (ns)\t\t\tRemove @ Random (ns)");

                // REMOVE START MYARRAYLIST
                startTime = System.nanoTime();
                for (int n = i; n < 1000000; n *= i) {
                    arrayList.remove(0);
                }
                endTime = System.nanoTime();
                durationStart = (endTime - startTime);

                // REMOVE END MYLINKEDLIST
                startTime = System.nanoTime();
                for (int n = i; n < 1000000; n *= i) {
                    arrayList.remove(Integer.valueOf(arrayList.size() - 1));
                }
                endTime = System.nanoTime();
                durationEnd = (endTime - startTime);

                // REMOVE RANDOM MYLINKEDLIST
                startTime = System.nanoTime();
                for (int n = i; n < 1000000; n *= i) {
                    arrayList.remove((int) Math.random());
                }
                endTime = System.nanoTime();
                durationRandom = (endTime - startTime);

                System.out.println("MyArrayList\t\t\t\t\t" + durationStart + "\t\t\t\t\t" + durationEnd + "\t\t\t\t\t\t\t" + durationRandom);
                pw.println("MyArrayList\t\t\t\t\t" + durationStart + "\t\t\t\t\t" + durationEnd + "\t\t\t\t\t\t\t" + durationRandom);

                // REMOVE START MYLINKEDLIST
                startTime = System.nanoTime();
                for (int n = i; n < 1000000; n *= i) {
                    linkedList.remove(0);
                }
                endTime = System.nanoTime();
                durationStart = (endTime - startTime);

                // REMOVE END MYLINKEDLIST
                startTime = System.nanoTime();
                for (int n = i; n < 1000000; n *= i) {
                    linkedList.remove(Integer.valueOf(linkedList.size() - 1));
                }
                endTime = System.nanoTime();
                durationEnd = (endTime - startTime);

                // REMOVE RANDOM MYLINKEDLIST
                startTime = System.nanoTime();
                for (int n = i; n < 1000000; n *= i) {
                    linkedList.remove((int) Math.random());
                }
                endTime = System.nanoTime();
                durationRandom = (endTime - startTime);

                System.out.println("MyLinkedList\t\t\t\t" + durationStart + "\t\t\t\t\t" + durationEnd + "\t\t\t\t\t\t\t" + durationRandom);
                pw.println("MyLinkedList\t\t\t\t" + durationStart + "\t\t\t\t\t" + durationEnd + "\t\t\t\t\t\t\t" + durationRandom);
            }

            //========================= PART C ==============================
            // Measure how long it takes to remove N random numbers starting with non-empty lists
            System.out.println("\n\nPart C");
            pw.println("\n\nPart C");

            for (int i : N) {
                System.out.println("\nN = " + i + "\t\t\t\tRemove @ Value (ns)");
                pw.println("\nN = " + i + "\t\t\t\tRemove @ Value (ns)");

                // REMOVE BY VALUE MYARRAYLIST
                startTime = System.nanoTime();
                for (int n = i; n < 1000000; n *= i) {
                    arrayList.remove(arrayList);
                }
                endTime = System.nanoTime();
                durationStart = (endTime - startTime);

                System.out.println("MyArrayList\t\t\t\t\t" + durationStart);
                pw.println("MyArrayList\t\t\t\t\t" + durationStart);

                // REMOVE BY VALUE MYLINKEDLIST
                startTime = System.nanoTime();
                for (int n = i; n < 1000000; n *= i) {
                    linkedList.remove(linkedList);
                }
                endTime = System.nanoTime();
                durationStart = (endTime - startTime);

                System.out.println("MyLinkedList\t\t\t\t" + durationStart);
                pw.println("MyLinkedList\t\t\t\t" + durationStart);
            }

            // TEST THE REST OF THE METHODS FROM BOTH CLASSES
            System.out.println("\n\n========== TESTING OTHER METHODS ==========");
            System.out.println("Current list information\n" + arrayList + "\n\n" + linkedList);
            System.out.println("\nCLEARING LISTS");
            arrayList.clear();
            linkedList.clear();
            System.out.println("Current list information:\n" + arrayList + "\n\n" + linkedList);

        } catch (FileNotFoundException e) {
            System.err.println("File not found. End of program.");
            e.printStackTrace();
            System.exit(0);
        }finally{
            assert pw != null;
            pw.close();
        }
    }

}
