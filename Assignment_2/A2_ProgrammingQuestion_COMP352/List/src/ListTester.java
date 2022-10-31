import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

public class ListTester{

	public static void main(String[] args) {

		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		MyArrayList<Integer> list2 = new MyArrayList<Integer>();
		MyLinkedList<Integer> list3 = new MyLinkedList<Integer>();
		MyArrayList<Integer> list4 = new MyArrayList<Integer>();
		MyLinkedList<Integer> list5 = new MyLinkedList<Integer>();
		MyArrayList<Integer> list6 = new MyArrayList<Integer>();
		MyLinkedList<Integer> list7 = new MyLinkedList<Integer>();
		MyArrayList<Integer> list8 = new MyArrayList<Integer>();

		Random nb= new Random();
		PrintWriter pw=null;

		try {

			pw = new PrintWriter(new FileOutputStream("testrun.txt"));

			//========================= PART A ==============================
			// Adding numbers to empty list
			pw.println("----------------------N=10--------------------------");

			// ==================== ADDING AT RANDOM ======================
			pw.println("Adding @ random: ");

			// RANDOM LINKED LIST
			long startaddinglinkedlist1 = System.nanoTime();
			for (int n = 10; n < 1000000; n *= 10) {
				list.add((int) Math.random(), nb.nextInt(20));
			}
			long endaddinglinkedlist1 = System.nanoTime();
			long duration = (endaddinglinkedlist1 - startaddinglinkedlist1);
			pw.println("linked list: " + duration + "ns");

			// RANDOM ARRAY LIST
			long startaddingarraylist2 = System.nanoTime();
			for (int n = 10; n < 1000000; n *= 10) {
				list2.add((int) Math.random(), nb.nextInt(20));
			}
			long endaddingarraylist2 = System.nanoTime();
			long duration2 = (endaddingarraylist2 - startaddingarraylist2);
			pw.println("array list: " + duration2 + "ns");


			// =================== ADDING AT BEGINNING ====================
			pw.println("\nAdding @ beginning: ");

			// BEGINNING LINKED LIST
			long startaddingbeglinkedlist1 = System.nanoTime();
			for (int n = 10; n < 1000000; n *= 10) {
				list.add(0, nb.nextInt(20));
			}
			long endaddingbeglinkedlist1 = System.nanoTime();
			long duration3 = (endaddingbeglinkedlist1 - startaddingbeglinkedlist1);
			pw.println("linked list: " + duration3+ "ns");

			// BEGINNING ARRAY LIST
			long startaddingbegarraylist2 = System.nanoTime();
			for (int n = 10; n < 1000000; n *= 10) {
				list2.add(0, nb.nextInt(20));
			}
			long endaddingbegarraylist2 = System.nanoTime();
			long duration4 = (endaddingbegarraylist2 - startaddingbegarraylist2);
			pw.println("array list: " + duration4 + "ns");

			// ==================== ADDING AT END =======================
			pw.println("\nAdding @ end: ");

			// END LINKED LIST
			long startaddingendlinkedlist1 = System.nanoTime();
			for (int n = 10; n < 1000000; n *= 10) {
				list.add(nb.nextInt(20));
			}
			long endaddingendlinkedlist1 = System.nanoTime();
			long duration5 = (endaddingendlinkedlist1 - startaddingendlinkedlist1);
			pw.println("linked list: " + duration5+ "ns");

			// END ARRAY LIST
			long startaddingendarraylist2 = System.nanoTime();
			for (int n = 10; n < 1000000; n *= 10) {
				list2.add(0, nb.nextInt(20));
			}
			long endaddingendarraylist2 = System.nanoTime();
			long duration6 = (endaddingendarraylist2- startaddingendarraylist2);
			pw.println("array list: " + duration6 + "ns");


			//========================= PART B ==============================
			// Remove N numbers from the lists

			// ================= REMOVING AT BEGINNING ======================
			pw.println("\nRemoving @ beginning: ");

			// BEGINNING LINKED LIST
			long startremovingbeglinkedlist1 = System.nanoTime();
			for (int n = 10; n < 1000000; n *= 10) {
				list.remove(0);
			}
			long endremovingbeglinkedlist1 = System.nanoTime();
			long duration7 = (endremovingbeglinkedlist1 - startremovingbeglinkedlist1);
			pw.println("linked list: " + duration7+ "ns");

			// BEGINNING ARRAY LIST
			long startremovingbegarraylist2 = System.nanoTime();
			for (int n = 10; n < 1000000; n *= 10) {
				list2.remove(0);
			}
			long endremovingbegarraylist2 = System.nanoTime();
			long duration8 = (endremovingbegarraylist2 - startremovingbegarraylist2);
			pw.println("array list: " + duration8+ "ns");

			// ================== REMOVING AT RANDOM =====================
			pw.println("\nRemoving @ random: ");

			// RANDOM LINKED LIST
			long startremovingrandomlinkedlist1 = System.nanoTime();
			for (int n = 10; n < 1000000; n *= 10) {
				list.remove((int) Math.random());
			}
			long endremovingrandomlinkedlist1 = System.nanoTime();
			long duration9 = (endremovingrandomlinkedlist1 - startremovingrandomlinkedlist1);
			pw.println("linked list: " + duration9+ "ns");

			// RANDOM ARRAY LIST
			long startremovingrandomarraylist2 = System.nanoTime();
			for (int n = 10; n < 1000000; n *= 10) {
				list2.remove((int) Math.random());
			}
			long endremovingrandomarraylist2 = System.nanoTime();
			long duration10 = (endremovingrandomarraylist2 - startremovingrandomarraylist2);
			pw.println("array list: " + duration10+ "ns");

			// =================== REMOVING AT END =======================
			pw.println("\nRemoving @ end: ");
			//not sure how to do this one!!

			// END LINKED LIST
			long startremovingendoflinkedlist1 = System.nanoTime();
			for (int n = 10; n < 1000000; n *= 10) {
				list2.remove(Integer.valueOf(list.size() - 1));
			}
			long endremovingendoflinkedlist1 = System.nanoTime();
			long duration11 = (endremovingendoflinkedlist1 - startremovingendoflinkedlist1);
			pw.println("linked list: " + duration11 + "ns");

			// END ARRAY LIST
			long startremovingendofarraylist2 = System.nanoTime();
			for (int n = 10; n < 1000000; n *= 10) {
				list2.remove(Integer.valueOf(list2.size() - 1));
			}
			long endremovingendofarraylist2 = System.nanoTime();
			long duration12 = (endremovingendofarraylist2 - startremovingendofarraylist2);
			pw.println("array list: " + duration12 + "ns");


			//========================= PART C ==============================
			// Measure how long it takes to remove N random numbers starting with non-empty lists

			// REMOVING BY VALUE
			pw.println("\nRemoving @ by value: ");
			long startremovingendlinkedlist1 = System.nanoTime();
			for (int n = 10; n < 1000000; n *= 10) {
				list.remove(list);
			}
			// VALUE LINKED LIST
			long endremovingendlinkedlist1 = System.nanoTime();
			long duration13 = (endremovingendlinkedlist1- startremovingendlinkedlist1);
			pw.println("linked list: " + duration13+ "ns");

			long startremovingendarraylist2 = System.nanoTime();
			for (int n = 10; n < 1000000; n *= 10) {
				list2.remove(list2);
			}
			// VALUE ARRAY LIST
			long endremovingendarraylist2 = System.nanoTime();
			long duration14 = (endremovingendarraylist2 - startremovingendarraylist2);
			pw.println("array list: " + duration14+ "ns");


			//========================= PART A ==============================
			// Adding numbers to empty list
			pw.println("----------------------N=100--------------------------");
			// ADDING AT RANDOM
			pw.println("Adding @ random: ");
			long startaddinglinkedlist3 = System.nanoTime();
			for (int n = 100; n < 1000000; n *= 100) {
				list3.add((int) Math.random(), nb.nextInt(200));
			}
			// RANDOM LINKED LIST
			long endaddinglinkedlist3 = System.nanoTime();
			long duration15 = (endaddinglinkedlist3 - startaddinglinkedlist3);
			pw.println("linked list: " + duration15 + "ns");
			long startaddingarraylist4 = System.nanoTime();
			for (int n = 100; n < 1000000; n *= 100) {
				list4.add((int) Math.random(), nb.nextInt(200));
			}
			// RANDOM ARRAY LIST
			long endaddingarraylist4 = System.nanoTime();
			long duration16 = (endaddingarraylist4 - startaddingarraylist4);
			pw.println("array list: " + duration16 + "ns");

			// ADDING AT BEGINNING
			pw.println("\nAdding @ beginning: ");
			long startaddingbeglinkedlist3 = System.nanoTime();
			for (int n = 100; n < 1000000; n *= 100) {
				list3.add(0, nb.nextInt(200));
			}
			// BEGINNING LINKED LIST
			long endaddingbeglinkedlist3 = System.nanoTime();
			long duration17 = (endaddingbeglinkedlist3 - startaddingbeglinkedlist3);
			pw.println("linked list: " + duration17+ "ns");
			long startaddingbegarraylist4 = System.nanoTime();
			for (int n = 100; n < 1000000; n *= 100) {
				list4.add(0, nb.nextInt(200));
			}
			// BEGINNING ARRAY LIST
			long endaddingbegarraylist4 = System.nanoTime();
			long duration18 = (endaddingbegarraylist4 - startaddingbegarraylist4);
			pw.println("array list: " + duration18 + "ns");

			// ADDING AT END
			pw.println("\nAdding @ end: ");
			long startaddingendlinkedlist3 = System.nanoTime();
			for (int n = 100; n < 1000000; n *= 100) {
				list3.add(nb.nextInt(200));
			}
			// END LINKED LIST
			long endaddingendlinkedlist3 = System.nanoTime();
			long duration19 = (endaddingendlinkedlist3 - startaddingendlinkedlist3);
			pw.println("linked list: " + duration19+ "ns");
			long startaddingendarraylist4 = System.nanoTime();
			for (int n = 100; n < 1000000; n *= 100) {
				list4.add(0, nb.nextInt(200));
			}
			// END ARRAY LIST
			long endaddingendarraylist4 = System.nanoTime();
			long duration20 = (endaddingendarraylist4- startaddingendarraylist4);
			pw.println("array list: " + duration20 + "ns");



			//========================= PART B ==============================
			// Remove N numbers from the lists
			pw.println();
			pw.println("Removing @ beginning: ");
			long startremovingbeglinkedlist3 = System.nanoTime();
			for (int n = 100; n < 1000000; n *= 100) {
				list3.remove(0);
			}
			long endremovingbeglinkedlist3 = System.nanoTime();
			long duration21 = (endremovingbeglinkedlist3 - startremovingbeglinkedlist3);
			pw.println("linked list: " + duration21+ "ns");

			long startremovingbegarraylist4 = System.nanoTime();
			for (int n = 100; n < 1000000; n *= 100) {
				list4.remove(0);
			}
			long endremovingbegarraylist4 = System.nanoTime();
			long duration22 = (endremovingbegarraylist4 - startremovingbegarraylist4);
			pw.println("array list: " + duration22+ "ns");
			pw.println();
			pw.println("Removing @ random: ");
			long startremovingrandomlinkedlist3 = System.nanoTime();
			for (int n = 100; n < 1000000; n *= 100) {
				list3.remove((int) Math.random());
			}
			long endremovingrandomlinkedlist3 = System.nanoTime();
			long duration23 = (endremovingrandomlinkedlist3 - startremovingrandomlinkedlist3);
			pw.println("linked list: " + duration23+ "ns");

			long startremovingrandomarraylist4 = System.nanoTime();
			for (int n = 100; n < 1000000; n *= 100) {
				list4.remove((int) Math.random());
			}
			long endremovingrandomarraylist4 = System.nanoTime();
			long duration24 = (endremovingrandomarraylist4 - startremovingrandomarraylist4);
			pw.println("array list: " + duration24+ "ns");

			pw.println();
			pw.println("Removing @ end: ");
			//not sure how to do this one!!

			//========================= PART C ==============================
			// Measure how long it takes to remove N random numbers starting with non-empty lists
			pw.println();
			pw.println("Removing @ by value: ");
			long startremovingendlinkedlist3 = System.nanoTime();
			for (int n = 100; n < 1000000; n *= 100) {
				list3.remove(list3);
			}
			long endremovingendlinkedlist3 = System.nanoTime();
			long duration25 = (endremovingendlinkedlist3- startremovingendlinkedlist3);
			pw.println("linked list: " + duration25+ "ns");

			long startremovingendarraylist4 = System.nanoTime();
			for (int n = 100; n < 1000000; n *= 100) {
				list4.remove(list4);
			}
			long endremovingendarraylist4 = System.nanoTime();
			long duration26 = (endremovingendarraylist4 - startremovingendarraylist4);
			pw.println("array list: " + duration26+ "ns");


			//========================= PART A ==============================
			// Adding numbers to empty list
			pw.println("----------------------N=1000--------------------------");
			pw.println("Adding @ random: ");
			long startaddinglinkedlist5 = System.nanoTime();
			for (int n = 1000; n < 1000000; n *= 1000) {
				list5.add((int) Math.random(), nb.nextInt(2000));
			}
			long endaddinglinkedlist5 = System.nanoTime();
			long duration27 = (endaddinglinkedlist5 - startaddinglinkedlist5);
			pw.println("linked list: " + duration27 + "ns");

			long startaddingarraylist6 = System.nanoTime();
			for (int n = 1000; n < 1000000; n *= 1000) {
				list6.add((int) Math.random(), nb.nextInt(2000));
			}
			long endaddingarraylist6 = System.nanoTime();
			long duration28 = (endaddingarraylist6 - startaddingarraylist6);
			pw.println("array list: " + duration28 + "ns");
			pw.println();
			pw.println("Adding @ beginning: ");
			long startaddingbeglinkedlist5 = System.nanoTime();
			for (int n = 1000; n < 1000000; n *= 1000) {
				list5.add(0, nb.nextInt(2000));
			}
			long endaddingbeglinkedlist5 = System.nanoTime();
			long duration29 = (endaddingbeglinkedlist5 - startaddingbeglinkedlist5);
			pw.println("linked list: " + duration29+ "ns");

			long startaddingbegarraylist6 = System.nanoTime();
			for (int n = 1000; n < 1000000; n *= 1000) {
				list6.add(0, nb.nextInt(2000));
			}
			long endaddingbegarraylist6 = System.nanoTime();
			long duration30 = (endaddingbegarraylist6 - startaddingbegarraylist6);
			pw.println("array list: " + duration30 + "ns");

			pw.println();
			pw.println("Adding @ end: ");
			long startaddingendlinkedlist5 = System.nanoTime();
			for (int n = 1000; n < 1000000; n *= 1000) {
				list5.add(nb.nextInt(2000));
			}
			long endaddingendlinkedlist5 = System.nanoTime();
			long duration31 = (endaddingendlinkedlist5 - startaddingendlinkedlist5);
			pw.println("linked list: " + duration31+ "ns");

			long startaddingendarraylist6 = System.nanoTime();
			for (int n = 1000; n < 1000000; n *= 1000) {
				list6.add(0, nb.nextInt(2000));
			}
			long endaddingendarraylist6 = System.nanoTime();
			long duration32 = (endaddingendarraylist6- startaddingendarraylist6);
			pw.println("array list: " + duration32 + "ns");



			//========================= PART B ==============================
			// Remove N numbers from the lists
			pw.println();
			pw.println("Removing @ beginning: ");
			long startremovingbeglinkedlist5 = System.nanoTime();
			for (int n = 1000; n < 1000000; n *= 1000) {
				list5.remove(0);
			}
			long endremovingbeglinkedlist5 = System.nanoTime();
			long duration33 = (endremovingbeglinkedlist5 - startremovingbeglinkedlist5);
			pw.println("linked list: " + duration33+ "ns");

			long startremovingbegarraylist6 = System.nanoTime();
			for (int n = 1000; n < 1000000; n *= 1000) {
				list6.remove(0);
			}
			long endremovingbegarraylist6 = System.nanoTime();
			long duration34 = (endremovingbegarraylist6 - startremovingbegarraylist6);
			pw.println("array list: " + duration34+ "ns");
			pw.println();
			pw.println("Removing @ random: ");
			long startremovingrandomlinkedlist5 = System.nanoTime();
			for (int n = 1000; n < 1000000; n *= 1000) {
				list5.remove((int) Math.random());
			}
			long endremovingrandomlinkedlist5 = System.nanoTime();
			long duration35 = (endremovingrandomlinkedlist5 - startremovingrandomlinkedlist5);
			pw.println("linked list: " + duration35+ "ns");

			long startremovingrandomarraylist6 = System.nanoTime();
			for (int n = 1000; n < 1000000; n *= 1000) {
				list6.remove((int) Math.random());
			}
			long endremovingrandomarraylist6 = System.nanoTime();
			long duration36 = (endremovingrandomarraylist6 - startremovingrandomarraylist6);
			pw.println("array list: " + duration36+ "ns");

			pw.println();
			pw.println("Removing @ end: ");
			//not sure how to do this one!!

			//========================= PART C ==============================
			// Measure how long it takes to remove N random numbers starting with non-empty lists
			pw.println();
			pw.println("Removing @ by value: ");
			long startremovingendlinkedlist5 = System.nanoTime();
			for (int n = 1000; n < 1000000; n *= 1000) {
				list5.remove(list5);
			}
			long endremovingendlinkedlist5 = System.nanoTime();
			long duration37 = (endremovingendlinkedlist5- startremovingendlinkedlist5);
			pw.println("linked list: " + duration37+ "ns");

			long startremovingendarraylist6 = System.nanoTime();
			for (int n = 1000; n < 1000000; n *= 1000) {
				list6.remove(list6);
			}
			long endremovingendarraylist6 = System.nanoTime();
			long duration38 = (endremovingendarraylist6 - startremovingendarraylist6);
			pw.println("array list: " + duration38+ "ns");

			pw.println("----------------------N=10000--------------------------");
			pw.println("Adding @ random: ");
			long startaddinglinkedlist7 = System.nanoTime();
			for (int n = 10000; n < 1000000; n *= 10000) {
				list7.add((int) Math.random(), nb.nextInt(20000));
			}
			long endaddinglinkedlist7 = System.nanoTime();
			long duration39 = (endaddinglinkedlist7 - startaddinglinkedlist7);
			pw.println("linked list: " + duration39 + "ns");

			long startaddingarraylist8 = System.nanoTime();
			for (int n = 10000; n < 1000000; n *= 10000) {
				list8.add((int) Math.random(), nb.nextInt(20000));
			}
			long endaddingarraylist8 = System.nanoTime();
			long duration40 = (endaddingarraylist8 - startaddingarraylist8);
			pw.println("array list: " + duration40 + "ns");
			pw.println();
			pw.println("Adding @ beginning: ");
			long startaddingbeglinkedlist7 = System.nanoTime();
			for (int n = 10000; n < 1000000; n *= 10000) {
				list7.add(0, nb.nextInt(20000));
			}
			long endaddingbeglinkedlist7 = System.nanoTime();
			long duration41 = (endaddingbeglinkedlist7 - startaddingbeglinkedlist7);
			pw.println("linked list: " + duration41+ "ns");

			long startaddingbegarraylist8 = System.nanoTime();
			for (int n = 10000; n < 1000000; n *= 10000) {
				list8.add(0, nb.nextInt(20000));
			}
			long endaddingbegarraylist8 = System.nanoTime();
			long duration42 = (endaddingbegarraylist8 - startaddingbegarraylist8);
			pw.println("array list: " + duration42 + "ns");

			pw.println();
			pw.println("Adding @ end: ");
			long startaddingendlinkedlist7 = System.nanoTime();
			for (int n = 10000; n < 1000000; n *= 10000) {
				list7.add(nb.nextInt(20000));
			}
			long endaddingendlinkedlist7 = System.nanoTime();
			long duration43 = (endaddingendlinkedlist7 - startaddingendlinkedlist7);
			pw.println("linked list: " + duration43+ "ns");

			long startaddingendarraylist8 = System.nanoTime();
			for (int n = 10000; n < 1000000; n *= 10000) {
				list8.add(0, nb.nextInt(20000));
			}
			long endaddingendarraylist8 = System.nanoTime();
			long duration44 = (endaddingendarraylist8- startaddingendarraylist8);
			pw.println("array list: " + duration44 + "ns");



			//part b) removing
			pw.println();
			pw.println("Removing @ beginning: ");
			long startremovingbeglinkedlist7 = System.nanoTime();
			for (int n = 10000; n < 1000000; n *= 10000) {
				list7.remove(0);
			}
			long endremovingbeglinkedlist7 = System.nanoTime();
			long duration45 = (endremovingbeglinkedlist7 - startremovingbeglinkedlist7);
			pw.println("linked list: " + duration45+ "ns");

			long startremovingbegarraylist8 = System.nanoTime();
			for (int n = 10000; n < 1000000; n *= 10000) {
				list8.remove(0);
			}
			long endremovingbegarraylist8 = System.nanoTime();
			long duration46 = (endremovingbegarraylist8 - startremovingbegarraylist8);
			pw.println("array list: " + duration46+ "ns");
			pw.println();
			pw.println("Removing @ random: ");
			long startremovingrandomlinkedlist7 = System.nanoTime();
			for (int n = 10000; n < 1000000; n *= 10000) {
				list7.remove((int) Math.random());
			}
			long endremovingrandomlinkedlist7 = System.nanoTime();
			long duration47 = (endremovingrandomlinkedlist7 - startremovingrandomlinkedlist7);
			pw.println("linked list: " + duration47+ "ns");

			long startremovingrandomarraylist8 = System.nanoTime();
			for (int n = 10000; n < 1000000; n *= 10000) {
				list8.remove((int) Math.random());
			}
			long endremovingrandomarraylist8 = System.nanoTime();
			long duration48 = (endremovingrandomarraylist8 - startremovingrandomarraylist8);
			pw.println("array list: " + duration48+ "ns");

			pw.println();
			pw.println("Removing @ end: ");
			//not sure how to do this one!!

			//part c)
			pw.println();
			pw.println("Removing @ by value: ");
			long startremovingendlinkedlist7 = System.nanoTime();
			for (int n = 10000; n < 1000000; n *= 10000) {
				list7.remove(list7);
			}
			long endremovingendlinkedlist7 = System.nanoTime();
			long duration49 = (endremovingendlinkedlist7- startremovingendlinkedlist7);
			pw.println("linked list: " + duration49+ "ns");

			long startremovingendarraylist8 = System.nanoTime();
			for (int n = 10000; n < 1000000; n *= 10000) {
				list8.remove(list8);
			}
			long endremovingendarraylist8 = System.nanoTime();
			long duration50 = (endremovingendarraylist8 - startremovingendarraylist8);
			pw.println("array list: " + duration50+ "ns");

			//TEST REST OF METHODS FROM BOTH CLASSES
			System.out.println("-----TESTING OTHER METHODS------");
			//print list size and representation
			System.out.println("Current list info: ");
			System.out.println(list);
			System.out.println(list2);
			list.clear();
			list2.clear();
			System.out.println();
			System.out.println("After calling the clear method: ");
			System.out.println(list);
			System.out.println(list2);
		} catch (FileNotFoundException e){
			System.err.println("File not found. End of program.");
			System.exit(0);
		} finally{
			assert pw != null;
			pw.close();
		}
	}

}
