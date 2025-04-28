
package hosbitasl;
public class Hosbitasl {
private String pathent;
private int doctor;
private static int num;
  public Hosbitasl()
  {
      num++;
  }
    public String getName(){return pathent;}
    public void setName(String name){this.pathent=name;}
    public int getdocNume(){return doctor;}
    public void setdocNume(int nume){this.doctor=nume;}
    public static int getnum(){return num;}
   
    
    
    
    
}
