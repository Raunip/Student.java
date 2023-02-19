package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    /** instance variable to represent firstname and lastname
     @param fname is used for first name
     @param lname is  used for the last name
     */

    String fname;
    String lname;

    /** initialize the arrayList to store integer values for score

     */
    ArrayList<Integer> scores = new ArrayList<>();

    /** parameterized constructor
     * takes two arguments
     * @param fname for first name and
     * @param lname for last name
     */
    public Student(String fname, String lname)
    {

/** initialize variables for first and last name

 */
        this.fname = fname;
        this.lname = lname;

    }

    /** non-argument constructor
     * passing default or no arguments
     */

    public Student() {

        this.fname = "";
        this.lname = "";

    }

    /** setter to set the first name of the student

     */

    public void setFirstName(String fname) {

        this.fname = fname;

    }
    /** setter to set the last name of the student

     */
    public void setLastName(String lname) {

        this.lname = lname;

    }

    /** method to get the Full name

     */

    public String getFullName() {

        return fname+" "+lname;

    }

    /** method to add scores/grades to list

     */

    public void addTest(int grades) {

        scores.add(grades);

    }

    /** method to return Average

     */

    public double getAverage() {
        /** initialize sum to zero */
        double sum = 0;
        /**
         iterate until the end of the array list
         */
        for(int i=0;i<scores.size();i++)
        {
            sum += scores.get(i);
        }
        /** divide the sum by the size of the array to get the average

         */
        return sum/(scores.size());

    }


    /** method to return Test Count
     *size of the array will be the test count
     * so used the size of score
     */

    public int getTestCount() {

        return scores.size();

    }

    /** Method to get the input from user in a single line
     * It calls the Scanner to get input from user
     * @param line gets the user input at stores the input
     * @param namedata splits the line input in the array of strings
     *                 so index 0 of the array will be our first name
     *                 and index 1 of the array will be last name


     * @return the Student's full name, test count and grade average as a single line output
     */
    public String StudentDataInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a student's data on a single line and press return: ");
        String line = in.nextLine();
        String[] namedata = line.split(" ");
        Student student = new Student(namedata[0],namedata[1]); /**hen it creates the student object and create student name using namedata */
        /**
         *  for loop prints out the grade from remaining of the array
         *              and then call the addTest method to add the
         *              test score, but since we saved the array as a string
         *              so we have to convert it back to integer because addTest method
         *              takes integer as an input
         */
        for(int i=2;i< namedata.length;i++){
            student.addTest(Integer.parseInt(namedata[i]));
        }
        return student.getFullName() + " has " + student.getTestCount() +
                " grades and an average of " + student.getAverage();

    }

}


