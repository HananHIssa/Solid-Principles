
package design.pattern.project;
public class WindowsSquare extends Shape{
  private static WindowsSquare instance=null;
  private WindowsSquare()
  {
      
  }
  public static WindowsSquare getInstance()
  {
      if(instance==null)
      {
          if(instance==null)
               synchronized (WindowsSquare .class) 
               {
                if (instance == null) 
                {
                    instance = new WindowsSquare();
                }
                }
         }  
      return instance;
  }
    @Override
    void draw() {
        System.out.print(" Drawing Windows Square");
    }

    @Override
    String getDescription() {
        return "WindowsSquare";
    }
    
}
