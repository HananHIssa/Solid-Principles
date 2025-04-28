
package timecomplixity;
class Test<T> {
    T obj;
    Test(T obj) { this.obj = obj; }
    public T getObject() { return this.obj; }


public static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    

}