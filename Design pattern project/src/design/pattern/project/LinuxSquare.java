
package design.pattern.project;
public class LinuxSquare extends Shape{
 private static LinuxSquare instance=null;
  private LinuxSquare()
  {
      
  }
  public static LinuxSquare getInstance()
  {
      if(instance==null)
      {
          if(instance==null)
               synchronized (LinuxSquare .class) 
               {
                if (instance == null) 
                {
                    instance = new LinuxSquare();
                }
                }
         }  
      return instance;
  }
    @Override
    void draw() {
        System.out.print(" Drawing Linux Square");
    }

    @Override
    String getDescription() {
        return "LinuxSquare";
    }
            
}
