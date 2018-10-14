//  Christopher Burt

//  Project_2

//  This program creates an array and sorts it

package project_2;


public class Project_2
{

    //  Main method intializes array and colles arraySort Method then loops a display 
    public static void main(String[] args)
    {
        int[] numbers = { 12, 193, 56, 74, 9, 34, 165, 102, 154, 63, 19, 49 };
        
        arraySort(numbers);
        
        System.out.println("The sorted numbers are:");
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
    }
    
    // sort Method   
    public static void arraySort(int[] numbers)
   {
      int numScan, index, minIndex, minValue;

      for (numScan = 0; numScan < (numbers.length-1); numScan++)
      {
         minIndex = numScan;
         minValue = numbers[numScan];
         for(index = numScan + 1; index < numbers.length; index++)
         {
            if (numbers[index] < minValue)
            {
               minValue = numbers[index];
               minIndex = index;
            }
         }
         numbers[minIndex] = numbers[numScan];
         numbers[numScan] = minValue;
      }
   }
}
