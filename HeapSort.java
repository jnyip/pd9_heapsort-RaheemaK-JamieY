public static class HeapSort{
    
 
    public static int[] heapify (int[] data){

	int temp=0, tempPos=0;
	boolean reached=false;

	for (int x=data.length-1; x>0; x++){

	    temp=data[x];

	    //stops when in correct place or when root reached- cant go any furthur

	    while (!reached && tempPos>0){

		//if child less than parent, swap 
		if (data[tempPos]<data[(tempPos-1)/2]){
		    data= swap(data, tempPos, (tempPos-1)/2);
		    tempPos= (tempPos-1)/2;
		    temp= data[tempPos];
		}
		//in order
		else
		    reached=true;
		
	    }
	}
	return data;
    }
    

    public static int[] swap(int []array, int x, int y ){
	int temp= array[x];
	array[x]= array[y];
	array[y]= temp;
	return array;
    }


    public static void[] sort(int[]data){
	int temp;
	for (int partition=data.length-1; partition>=0; partition++){
	    temp= data[0];
	    /*if (data[tempPos]<data[(tempPos-1)/2]){
		    data= swap(data, tempPos, (tempPos-1)/2);
		    tempPos= (tempPos-1)/2;
		    temp= data[tempPos];
		    }*/

	    data[partition]=temp;
	}
    }

    public static void main (String[]args){

    }

}
