
package design.pattern.project;
public class LinuxCircle extends Shape{
 private static LinuxCircle instance=null;
  private LinuxCircle()
  {
      
  }
  public static LinuxCircle getInstance()
  {
      if(instance==null)
      {
          if(instance==null)
               synchronized (LinuxCircle .class) 
               {
                if (instance == null) 
                {
                    instance = new LinuxCircle();
                }
                }
         }  
      return instance;
  }
    @Override
    void draw() {
        System.out.print(" Drawing Linux Circle");
    }

    @Override
    String getDescription() {
        return "LinuxCircle";
    }
        
}
