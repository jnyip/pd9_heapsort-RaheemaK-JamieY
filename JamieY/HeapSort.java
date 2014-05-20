// Jamie Yip
// APCS - Pd 9
// HW #41
// 2014.05.20

/************************************************************
The best case scenario if the data set was already sorted so
that it would not need to traverse the data for the minimum. 

The worst case scario was if the data set was in any sort of 
randomized order because then the data would actually have to 
sorted. It would also be bad if it contained duplicates. 

************************************************************/

public class HeapSort{

    public Integer[] sort (Integer[] data){
	ALHeap heap = new ALHeap();
	Integer[] sorted = new Integer[ data.length ];

	for ( int i = 0; i < data.length; i++){
	    heap.add(data[i]);
	}

	for ( int j = 0; j < data.length; j++){
	    sorted[j] = heap.removeMin();
	}
	return sorted;	
    }
}
