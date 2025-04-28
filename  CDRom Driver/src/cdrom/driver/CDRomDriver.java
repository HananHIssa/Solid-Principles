
package cdrom.driver;

/**
 *
 * @author hp
 */
public class CDRomDriver {

    public static CDRomDriver instance=null;

    private CDRomDriver() {
    }
    public static synchronized CDRomDriver getInstance()
    {
        if(instance==null)
          new CDRomDriver();
        return instance;
    }
    
}
