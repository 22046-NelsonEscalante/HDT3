public class MergeSort{
  public void sort(int nums[], int left, int right){
    if(left < right){
    //Encuentra el punto medio del vector.
    int middle = (left + right) / 2;
    
      //Divide la primera y segunda mitad (llamada recursiva).
      sort(nums, left, middle);
      sort(nums, middle+1, right);
    
      //Une las mitades.
      merge(nums, left, middle, right);
    }
  }
    

  public void merge(int nums[], int left, int middle, int right) {
    //Encuentra el tamaño de los sub-vectores para unirlos.
    int n1 = middle - left + 1;
    int n2 = right - middle;
    
    //Vectores temporales.
    int leftArray[] = new int [n1];
    int rightArray[] = new int [n2];
    
    //Copia los datos a los arrays temporales.
    for (int i=0; i < n1; i++) {
    leftArray[i] = nums[left+i];
    }
    for (int j=0; j < n2; j++) {
    rightArray[j] = nums[middle + j + 1];
    }
    /* Une los vectorestemporales. */
    
    //Índices inicial del primer y segundo sub-vector.
    int i = 0, j = 0;
    
    //Índice inicial del sub-vector nums[].
    int k = left;
    
    //Ordenamiento.
    while (i < n1 && j < n2) {
    if (leftArray[i] <= rightArray[j]) {
    nums[k] = leftArray[i];
    i++;
    } else {
    nums[k] = rightArray[j];
    j++;
    }
    k++;
    }//Fin del while.
    
    /* Si quedan elementos por ordenar */
    //Copiar los elementos restantes de leftArray[].
    while (i < n1) {
    nums[k] = leftArray[i];
    i++;
    k++;
    }
    //Copiar los elementos restantes de rightArray[].
    while (j < n2) {
    nums[k] = rightArray[j];
    j++;
    k++;
    }
    }


public void printArray(int nums[]) {
  int n = nums.length;
  for (int i=0; i<n; ++i) {
      System.out.println(nums[i] + " ");
  }
  System.out.println();
}
}
