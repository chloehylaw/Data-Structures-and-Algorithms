import jdk.swing.interop.SwingInterOpUtils;

public class Driver {

    public static void main(String[] args) {

        int numOfParticipants = 10;
        String[] pName = new String[numOfParticipants];
        String[] pDOB = new String[numOfParticipants];

        pName[0] = "Linda  ";
        pName[1] = "Sam    ";
        pName[2] = "Roger  ";
        pName[3] = "Alfred ";
        pName[4] = "Roberto";
        pName[5] = "Melissa";
        pName[6] = "Brian  ";
        pName[7] = "Thomas ";
        pName[8] = "Leslie ";
        pName[9] = "Maria  ";

        pDOB[0] = "01-01-2003";
        pDOB[1] = "24-02-1940";
        pDOB[2] = "11-12-1995";
        pDOB[3] = "31-03-1980";
        pDOB[4] = "29-06-1950";
        pDOB[5] = "25-07-1945";
        pDOB[6] = "15-07-2002";
        pDOB[7] = "20-07-2004";
        pDOB[8] = "27-04-1990";
        pDOB[9] = "09-05-1941";

        /*I took off the scanner because we dont know its cost and she said it was okay to just set todays date
         * even if its not up to date... and we only really need the year to calculate the ages
         */
        int year = 2021;

        long startTimeCalculateAge = System.nanoTime();
        int[] currentAge = calculateAge(pDOB, numOfParticipants, year);
        long endTimeCalculateAgge = System.nanoTime();
        long durationCalculateAge = (endTimeCalculateAgge - startTimeCalculateAge);

        System.out.println();
        System.out.println("------------UNSORTED------------");
        System.out.println("Name        DOB            Age");
        for (int i = 0; i < numOfParticipants; i++) {
            System.out.println(pName[i] + "     " + pDOB[i] + "     " + currentAge[i]);
        }

        System.out.println();

        long startNumOfSeniors = System.nanoTime();
        int senior = numberOfSeniors(currentAge, numOfParticipants);
        long endNumOfSeniors = System.nanoTime();
        long durationNumOfSeniors = (endNumOfSeniors - startNumOfSeniors);

        int nonSenior = numOfParticipants - senior;

        long startRearrangeParticipants = System.nanoTime();
        rearrangeParticipantsLinear(pName, pDOB, currentAge, numOfParticipants);
        long endRearrangeParticipants = System.nanoTime();
        long durationRearrangeParticipants = (endRearrangeParticipants - startRearrangeParticipants);

        System.out.println();
        System.out.println("-------------SORTED-------------");
        System.out.println("Name        DOB            Age");
        long startDisplaySeniorsDecreasing = System.nanoTime();
        displaySeniorsDecreasingOrder(pName, pDOB, currentAge, numOfParticipants, nonSenior);
        long endDisplayingSeniorsDecreasing = System.nanoTime();
        long durationDisplaySeniorsDecreasing = (endDisplayingSeniorsDecreasing - startDisplaySeniorsDecreasing);

        long startDisplayNonSeniorsIncreasing = System.nanoTime();
        displayNonSeniorsIncreasingOrder(pName, pDOB, currentAge, numOfParticipants, nonSenior, senior);
        long endDisplayingnNonSeniorsIncreasing = System.nanoTime();
        long durationDisplayNonSeniorsIncreasing = (endDisplayingnNonSeniorsIncreasing - startDisplayNonSeniorsIncreasing);

        System.out.println("\n\nNumber of seniors: " + senior);

        System.out.println("Number of non seniors: " + nonSenior);

        System.out.println();
        System.out.println("------DISPLAY SENIOR ORDER------");
        System.out.println("Name        DOB            Age");
        long startDisplaySeniorsIncreasing = System.nanoTime();
        displaySeniorsIncreasingOrder(pName, pDOB, currentAge, numOfParticipants, senior);
        long endDisplaySeniorsIncreasing = System.nanoTime();
        long durationDisplaySeniorsIncreasing = (endDisplaySeniorsIncreasing - startDisplaySeniorsIncreasing);

        System.out.println();
        System.out.println("----DISPLAY NON-SENIOR ORDER----");
        System.out.println("Name        DOB            Age");
        displayNonSeniorsIncreasingOrder(pName, pDOB, currentAge, numOfParticipants, nonSenior, senior);

        System.out.println();
        System.out.println("----DISPLAY INCREASING ORDER----");
        System.out.println("Name        DOB            Age");
        long startIncreasingOrder = System.nanoTime();
        displayIncreasingOrder(pName, pDOB, currentAge, numOfParticipants);
        long endIncreasingOrder = System.nanoTime();
        long durationIncreasingOrder = (endIncreasingOrder - startIncreasingOrder);

        System.out.println();
        System.out.println();
        System.out.println("------- DISPLAY RUNTIMES -------");
        System.out.println("calculateAge function: " + durationCalculateAge + "ns");
        System.out.println("numberOfSeniors function: " + durationNumOfSeniors + "ns");
        System.out.println("rearrangeParticipants function: " + durationRearrangeParticipants + "ns");
        System.out.println("displaySeniorsDecreasingOrder function: " + durationDisplaySeniorsDecreasing + "ns");
        System.out.println("displayNonSeniorsIncreasingOrder function: " + durationDisplayNonSeniorsIncreasing + "ns");
        System.out.println("displaySeniorsIncreasingOrder function: " + durationDisplaySeniorsIncreasing + "ns");
        System.out.println("displayIncreasingOrder function: " + durationIncreasingOrder + "ns");

    }

    // I didn't use time so I found the age of each person
    private static int[] calculateAge(String[] pDOB, int participants, int year) {
        int[] birthYear = new int[participants];
        // int[] birthMonth = new int[participants];
        // int[] birthDay = new int[participants];
        int[] age = new int[participants];
        for (int i = 0; i < participants; i++) {
            try {
                birthYear[i] = Integer.parseInt(pDOB[i].split("-")[2]);
                //birthMonth[i] = Integer.parseInt(pDOB[i].split("-")[1]);
                //birthDay[i] = Integer.parseInt(pDOB[i].split("-")[0]);
            } catch (NumberFormatException e) {
                System.err.println("Unable to convert string to int");
            }
        }
        for (int i = 0; i < participants; i++) {
            age[i] = (int) (year - birthYear[i]);
        }
        return age;
    }

    // I was just able to arrange it in a linear order
    private static int numberOfSeniors(int[] currentAge, int participants){
        int numberOfSeniors = 0;

        /*if(participants == 1)
            return numberOfSeniors;*/

        for(int i = 0; i < participants; i++){
            if(currentAge[i] >= 65)
                numberOfSeniors++;
        }

        return numberOfSeniors;
    }

    private static void rearrangeParticipantsLinear(String[] pName, String[] pDOB, int[] currentAge, int participants){
        for(int i = 0; i < participants - 1; i++){
            if (currentAge[i] > currentAge[i + 1]) {
                int temp1 = currentAge[i];
                currentAge[i] = currentAge[i + 1];
                currentAge[i + 1] = temp1;

                String temp2 = pName[i];
                pName[i] = pName[i + 1];
                pName[i + 1] = temp2;

                String temp3 = pDOB[i];
                pDOB[i] = pDOB[i + 1];
                pDOB[i + 1] = temp3;
            }
            rearrangeParticipantsLinear(pName, pDOB, currentAge, (participants - 1));
        }
    }

    // Why would I need this to be recursive idk...
    // UPDATE: I made it recursive
    private static void displaySeniorsIncreasingOrder(String[] pName, String[] pDOB, int[] currentAge, int participants, int seniors){
        /*for(int i = 0; i < seniors; i++){
            System.out.println(pName[participants-1-i] + "     " + pDOB[participants-1-i] + "     " + currentAge[participants-1-i]);
        }*/
        if(participants - seniors >= participants)
            return;
        System.out.println(pName[participants - seniors] + "     " + pDOB[participants - seniors] + "     " + currentAge[participants - seniors]);
        displaySeniorsIncreasingOrder(pName, pDOB, currentAge, participants, seniors-1);

    }
    // UPDATE: I made it recursive
    private static void displaySeniorsDecreasingOrder(String[] pName, String[] pDOB, int[] currentAge, int participants, int seniors){
        /*for(int i = 0; i < seniors; i++){
            System.out.println(pName[participants-1-i] + "     " + pDOB[participants-1-i] + "     " + currentAge[participants-1-i]);
        }*/
        if(participants - seniors >= participants)
            return;
        System.out.println(pName[participants-1] + "     " + pDOB[participants-1] + "     " + currentAge[participants-1]);
        displaySeniorsDecreasingOrder(pName, pDOB, currentAge, participants-1, seniors-1);

    }

    // Same here, I don't know how it would be recursive...
    // UPDATE: I made it recursive
    private static void displayNonSeniorsIncreasingOrder(String[] pName, String[] pDOB, int[] currentAge, int participants, int nonSenior, int senior){
        /*for(int i = 0; i < nonSenior; i++){
            System.out.println(pName[i] + "     " + pDOB[i] + "     " + currentAge[i]);
        }*/
        if((participants - nonSenior - senior) >= nonSenior)
            return;
        System.out.println(pName[(participants - nonSenior - senior)] + "     " + pDOB[(participants - nonSenior - senior)] + "     " + currentAge[(participants - nonSenior - senior)]);
        displayNonSeniorsIncreasingOrder(pName, pDOB, currentAge, participants+1, nonSenior, senior);

    }

    // This is just to print it in increasing order which is same as sorted cuz idk how to sort it properly
    private static void displayIncreasingOrder(String[] pName, String[] pDOB, int[] currentAge, int participants){
        for (int i = 0; i < participants; i++) {
            System.out.println(pName[i] + "     " + pDOB[i] + "     " + currentAge[i]);
        }
    }
}