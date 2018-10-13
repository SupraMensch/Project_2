//  Christopher Burt

//  Project_2

//
//
//  Sort an Array (20 points)
//
//  Create an array of integers that contains the following:
//
//  int[] numbers = { 12, 193, 56, 74, 9, 34, 165, 102, 154, 63, 19, 49 }
//
//  In your main program, sort the array and display all of the elements in sorted order.



package project_2;


public class Project_2 {

    public static void main(String[] args)
    {
        int[] numbers = { 12, 193, 56, 74, 9, 34, 165, 102, 154, 63, 19, 49 };
        
        arraySort(numbers);
        
        System.out.println("The sorted numbers are:");
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
        
    }
    
    
    
    public static void arraySort(int[] numbers)
   {
      int startScan, index, minIndex, minValue;

      for (startScan = 0; startScan < (numbers.length-1); startScan++)
      {
         minIndex = startScan;
         minValue = numbers[startScan];
         for(index = startScan + 1; index < numbers.length; index++)
         {
            if (numbers[index] < minValue)
            {
               minValue = numbers[index];
               minIndex = index;
            }
         }
         numbers[minIndex] = numbers[startScan];
         numbers[startScan] = minValue;
      }
   }
}
