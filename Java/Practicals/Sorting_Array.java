
public class Sorting_Array{
    public static void main(String args[]){
        int myarray[]={10,15,14,13,12,11};
        boolean swapped;   
        for(int elem:myarray){
        System.out.print(elem+" ");
        }
        System.out.println("\n");
        do{
        swapped=false;
        System.out.println(swapped);
        for(int i=0;i<myarray.length-1;i++){
           

            if(myarray[i]>myarray[i+1]){
                int temp=myarray[i];
                myarray[i]=myarray[i+1];
                myarray[i+1]=temp;
               swapped=true; 
            }
        }
        System.out.println(swapped);
    }
    while(swapped);
      
    System.out.println("\nSorted array:");
    for(int ele:myarray){
        System.out.print(ele+" ");
    }
        
    
       

    }
}

