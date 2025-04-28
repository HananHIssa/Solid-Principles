
package ex;

/**
 *
 * @author hp
 */
public class Ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=10; System.out.println("hanan");
           ConvertTobinary(32);
          
    }
    public static void ConvertTobinary(int x)
    {  
        String binary="";
        while(x>0)  
        {
           int rem=x%2 ;
           binary+=rem;
           System.out.println("binary = "+ binary);
            x/=2;
           System.out.println("x = "+ x);
           
        }
        StringBuffer str=new StringBuffer(binary);
        str.reverse();
         System.out.println(str);
    }
    /*
     public boolezn Search (Node tree,int x)
    {
      if(tree=null) return false;
      if(tree.val==x) return true;
     else{
      if(x<tree.val)
       return Search(tree.left,x);
     else if (x>tree.val)
     return Search(tree.right,x);
      Animal o =new Cat();
      o.playsond();
      list<animal> animal = new Arrylist();
        animal.add(o);
            animal d =neew dog();
            animal.add(d);

     }
    }
    */
}
