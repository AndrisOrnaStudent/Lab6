import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public  class SortingNumbers {

    public static void sortNumber() throws FileNotFoundException {
        {
            File f = new File("C:\\Users\\Andris\\eclipse-workspace\\Lab6_2\\src\\numbers");
            Scanner sc = new Scanner(f);
            System.out.println(f);
            String words = "";
            try{

                while (sc.hasNextLine())
                {
                    words = words + sc.nextLine();
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

            System.out.println(words); // printing the words

            String [] wordsArray = words.split(","); // splitting array

            System.out.println(wordsArray[0]);
            int temp = wordsArray;
            for (int i=0; i<wordsArray.length -1; i++){
                if (wordsArray[i] > wordsArray[i+1]){
                    temp = wordsArray[i+1];
                    wordsArray[i + 1] = wordsArray[i];
                    wordsArray[i]= temp
                }
            }
        }

        /*for(int i = 0; i < input.length -1; i++)
        {
            int least = i;

            for(int j = i+1; j < input.length; j++)
            {
                if(input[j] < input[least])
                {
                    least = j;
                }
            }
            swap(input, i, least);
        }

        for(int i : input)
        {
            System.out.println(i);
        }
    }

    public static void sortStrings(String [] input)
    {
        for(int i = 0; i < input.length -1; i++)
        {
            int least = i;

            for(int j = i+1; j < input.length; j++)
            {
                if(input[j].compareTo(input[least]) < 1)
                {
                    least = j;
                }
            }
            swap(input, i, least);
        }

        for(String i : input)
        {
            System.out.println(i);
        }
    }

    public static void swap(int [] input, int i, int j)
    {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    public static void swap(String [] input, int i, int j)
    {
        String temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }*/

        //int [] unsorted = {10,15,2,8,1,66,57};

            //sortNumber(unsorted);

            //String [] s = {"hello", "athlone", "is", "great"};

            //sortStrings(s);

        }

    public static void main(String[] args) throws FileNotFoundException {
        sortNumber();
    }

}
