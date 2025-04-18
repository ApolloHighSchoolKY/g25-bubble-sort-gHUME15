public class BubbleSort
{

	public static void main(String[] args)
	{
		int[] myNums = {12, 15, 0, 44, 13, 1, 2};
		int passes;
		int comparisons;
		int tempNum;


		for (passes =0; passes < myNums.length -1; passes++)
    {
            for (comparisons = 0; comparisons < myNums.length - 1- passes; comparisons++)
        {
            
            if (myNums[comparisons] >myNums[comparisons +1])
            {
                tempNum =myNums[comparisons];
                myNums[comparisons]= myNums[comparisons + 1];
                myNums[comparisons + 1] =tempNum;
            }
        }
    }

		//Loop once for each pass, where passes is one less than the number of items.
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
				//If they are out of order, swap the values
			//End Loop for comparisons
    
			//The next pass will use one less comparison
    
		//End Loop for passes
		System.out.print("Array: ");
        for (int num : myNums)
        {
            System.out.print(num + " ");
        }


	}
}
