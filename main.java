import java.util.ArrayList;
   class main{
      /**
     * @param args
     */
    public static void main(String[] args) {
            ArrayList<String> list1 = new ArrayList<>();
            list1.set(0,"Hi");
            list1.set(1,"Hello");
            list1.set(2, "blank");
            System.out.println(list1);
        
        
            ArrayList<String> list2 = new ArrayList<>();
            list2.set(0,"Hi");
            list2.set(1,"Hello");
            list2.set(2,"bloom");
            System.out.println(list2);
        
        /*part 3 */
            ArrayList<Boolean> list3 = new ArrayList<>();
            int i; 
             boolean result;
            for (i=0;;i++) {
               if (list1(i).equalsIgnoreCase(list2(i)) {   
                 result = true; }
            else{
                result = false;}
           list3.add(result) ;
           System.out.println("copare list 2 with 1"+list3);
       }
    }
}