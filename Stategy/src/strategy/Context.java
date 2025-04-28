
package strategy;
//reference to one stratgy
public class Context {
    private Strategy stratgy;

    public void setStratgy(Strategy stratgy) {
        this.stratgy = stratgy;
    }
    public int executeStrategy(int a, int b) {
        return stratgy.execute(a, b);
    }
}
