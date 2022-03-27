import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class driver {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What are the highest level CS classes you have completed? Please enter in the course name (e.g. 'CS120' 'CS340', etc.)");
        String prevClasses = reader.readLine();

        ArrayList course_list = new ArrayList();
        System.out.println("prevClasses " + prevClasses);

        for(String retVal: prevClasses.split(" ")){
            System.out.println("retVal: " + retVal);
            //add to student previous classes
        }
        System.out.println("Welcome to the scheduler!");
        System.out.println("To add a course: type 'add CS###'");
        System.out.println("To remove a course: type 'rm CS###'");
        System.out.println("To see your current schedule: type 'view' ");
        System.out.println("To exit the scheduler: type 'exit' ");

        String input = "";
        String[] command;
        while(!(input.equals("exit"))){ //x button
            input = reader.readLine();
            String[] parseInput = input.split(" ");
                if(parseInput[0].equals("add")){ //add button clicked
                    //is student eligible?
                    //course_list.add();
                }
                else if(parseInput[0].equals("rm")){
                    //course_list.remove()
                }
                else if(parseInput[0].equals("view")){
                    //course_list.listIterator()
                }
        }

        System.out.println("Thank you for using the scheduler!");
    }
}
