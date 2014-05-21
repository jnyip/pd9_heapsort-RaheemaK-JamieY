public class HeapSort{
    
    public Integer[] Heapify(Integer[datz]){

	int temp=0, tempPos=0;
	boolean reached=false;

	for (int x=data.length-1; x>0; x++){

	    temp=data[x];

	    //stops when in correct place or when root reached- cant go any furthur

	    while (!reached && tempPos>-0){

		//if child less than parent, swap 
		if ((int)data[tempPos]<(int)data[(tempPos-1)/2]){
		    data= swap(data, tempPos, (tempPos-1)/2);
		    tempPos= (tempPos-1)/2;
		    temp= data[tempPos];
		}
		else
		    reached=true;
		
	    }
	}
    }
    

    public Integer[] swap(Integer[]array, int x, int y ){
	Integer temp= array[x];
	array[x]= array[y];
	array[y]= temp;
    }

    public static void main (String[]args){
    }

}
