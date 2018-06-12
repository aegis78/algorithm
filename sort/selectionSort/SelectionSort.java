public class SelectionSort {
    
    private static void selectionSort( int[] arr ) {
        selectionSort( arr, 0 );
    }
    
    private static void selectionSort( int[] arr, int start ) {
        if ( start < arr.length - 1 ) {
            int min_index = start;
            for ( int i = start; i<arr.length; i++ ) {
                if ( arr[i] < arr[min_index]) min_index = i;
            }
            swap(arr, start, min_index);
            selectionSort(arr, start + 1);
        }
        
        
    }
    
    private static void swap(int[] arr, int source, int target ) {
        int tmp = arr[source];
        arr[source] = arr[target];
        arr[target] = tmp;
    }
    
    private static void printArray( int[] arr ) {
        for( int data : arr ) {
            System.out.print(data + ", ");
        }
        System.out.println();
    }
    
    public static void main ( String args[] ) {
        int[] arr = {9, 6, 4, 3, 2, 10, 0};
        printArray( arr );
        selectionSort( arr );
        printArray( arr );
    }
}