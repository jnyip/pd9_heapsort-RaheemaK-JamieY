//Raheema Kadwa
//APCS2 pd9
//HW41
//2014-05-19

import java.util.*;
/*
worst case is when children have to be swapped for every level 
resulting in nlog n run time
best case , children of root are in increasing ordeR(by level) , 
resulting in n run time
*/

public class HeapSort{
    ALHeap heap;
    
    public HeapSort(Integer[]data){
	heap= new ALHeap();
	//add every pos into heap (add method sorts)
	for (int x=0; x<data.length; x++)
	    heap.add (x);
    }
    public static Integer[] sort (Integer[]data){
	Integer[]sorted= new Integer[data.length];

	//remove will return  next el 
	for (int y=0; y< data.length; y++)
	    data[y]= heap.removeMin();

	return  data;
    }
}
