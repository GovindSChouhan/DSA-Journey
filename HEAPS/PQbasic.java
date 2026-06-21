import java.util.*;
    public class InsertHeap{
    static class Heap{
            ArrayList<Integer> arr =new ArrayList<>();
         public void add(int data){
            arr.add(data);
            int x = arr.size()-1;
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par)) { //o log n
                //swap;
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par,temp);

                x = par;
                par = (x-1)/2;

            }
        }
        //#2*.> GET MIN IN HEAP.
        public int peek(){// RETURN THE MIN
            return arr.get(0);//ISHII DATA KO DELETE KARNA HAI
        }
        //DELET IN HEAP.
       

            //step 3 - Heapify
            private void Heapify(int i){//Ologn
             int left = 2*i+1;
             int right = 2*i+2;
             int minIdx = i;
                 
                if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                   minIdx = left;
                }    
                if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                    minIdx = right;//3ino mai say jo max tha  i , left anfd right vo minIndx mai store ho gya hai.
                }
                //if minIdx ki value change hoti  hai.
                if(minIdx != i ){//ager min index ki value 1 k = na ho,node delete kiya tho heap nhi bigda Root hi min hai,if not tho fix karengy
                    //swap;
                    int temp = arr.get(i);
                   arr.set(i, arr.get(minIdx));
                   arr.set(minIdx , temp);

                   Heapify(minIdx);

                }
                //DELET IN HEAP.
                public int remove(){
                int data = arr.get(0);

                //swap 1 and last o(N)
                int temp = arr.get(0);
                arr.set(0,arr.get(arr.size()-1));
                arr.set(arr.size()-1,temp);

                //step2 - delete last  o(n)
                arr.remove(arr.size()-1);

                //step 3 - Heapify;
                Heapify(0);
                return data;
                
            }
            public boolean isEmpty(){
                return arr.size() == 0;
            }
           
        
    }
    public static void main(String[] args) {
      Heap h = new Heap();
      h.add(3);
      h.add(4);
      h.add(1);
      h.add(5);

      while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}    