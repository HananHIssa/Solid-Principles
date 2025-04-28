
package design.pattern.project;
public class WindowsCircle extends Shape{
     private static WindowsCircle instance=null;
  private WindowsCircle()
  {
      
  }
  public static WindowsCircle getInstance()
  {
      if(instance==null)
      {
          if(instance==null)
               synchronized (WindowsCircle .class) 
               {
                if (instance == null) 
                {
                    instance = new WindowsCircle();
                }
                }
         }  
      return instance;
  }
    @Override
    void draw() {
        System.out.print(" Drawing Windows Circle");
    }

    @Override
    String getDescription() {
        return "WindowsCircle";
    }
    
}
