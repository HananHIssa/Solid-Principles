
package furniturefactory;
/**
 * This is AbstractFactory interface
 */
public interface FurnitureFactory {

    public Chair createChair();
    public Sofa createSofa();
    public ServiceTable createServiceTable() ;
}
