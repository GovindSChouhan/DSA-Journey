public class mergeSort {
    public static void conquer(int arr[],int si,int ei){
        //conquer k liye ek nai merger create kani hogi jo nai memo location hogi .

        int merged[] = new int [ei-si+1];//ei totallenggth se ek kaam hota hai 
                                        //

        int indx1 = si;//trace 1st arr
        int indx = mid+1;//trace 2nd arr
        int x = 0;//merged index ko trace kr rha hai 

        while(indx1 <= mid && indx2 <=ei){//jb tk sort krthy jaenge .
            if(arr[indx1] <= arr[indx2]){//1arr mai chota.2nd arr mai bada

                merged[x++] = arr[indx1++];
                x++; indx1++;
            }else{//in case if indx 2 elmt is greater
                merged[x++] = arr[idx2++];

            }//yee whille cond jb tk kaam karega tb tk 2no arr mai compare kr rhe hai
             // if comparision comp in one arr or tusry arr mai elmt hai
        }//so tuusey cond banaynge to print (copy)hat left elemt
        while(indx1 <=mid){
            merged[x++] = arr[indx1++];
        }
        while(indx <= ei){
            merged[x++] = arr[indx2++];
            //in 2dono mai se koi 1 hi codn run hogi
        }
        //now . in original arr we have to copy the merged arr
        for(int i = 0,j = si;i <merged.length;i++,j++){
            arr[j] = merged[i];
        }



    }

    public static void divide(int arr[],int si,int ei){
        if(si>=ei){//if aesa case ho jb si hai vo ei se bada ho jaeye mean
                   //arr finish or single elemnt aa jaye
            return;
        }
        

       int mid = si + (ei - si)/2;//(si+ei)/2if both values bahut badi then yee int se bhar nikal jati hai 
                               // jo space issue create karta hai
        divide(arr,si,mid);
        divide(arr,mid+1,ei);  
        
        conquer(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        divide(arr,0,n-1);
        //print
        for(int i =0;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
}
