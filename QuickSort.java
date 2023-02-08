public class QuickSort {
    public static void quicksort(int A[], int i, int k) { //Para ordenar i tiene que ser 0 y k la longitud de A - 1

        int menor = i;
        int pivote = A[i]; //El primer elemento es el pivote
        int mayor = k;
        int camb = 0;
       
        while(menor < mayor){                                                             
            while(A[menor] <= pivote && menor < mayor){ //Busca entre los elementos el que cumpla con ser menor al pivote
                menor++;
            }
            while(A[mayor] > pivote){ //Busca entre los elementos el que cumpla con ser mayor al pivote
                mayor--;
            }
            if(menor < mayor){ // Cambiar el valor actual de A[i] con A[k] y viceversa                     
               camb = A[menor];                      
               A[menor] = A[mayor];
               A[mayor] = camb;
            }
        }
         
         A[i]=A[mayor];                                
         A[mayor]=pivote;
         
        if(i < k-1){
            quicksort(A,i,mayor-1); //Array menores
        }
        if(mayor+1 < k){
            quicksort(A,mayor+1,k); //Array mayores
        }
    }
}