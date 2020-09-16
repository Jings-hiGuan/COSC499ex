public class main {

    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String[] args) {
        int[] array = {2,6,3,7,8,9,1,16,21,239,24,124};  
        System.out.println("Before Insertion Sort");    
        for(int i:array){    
            System.out.print(i+" ");    
        }    
        System.out.println();  

        insertionSort(array);//sorting array using insertion sort    
           
        System.out.println("After Sorted:");    
        for(int i:array){    
            System.out.print(i+" ");    
        }    
    }
}
