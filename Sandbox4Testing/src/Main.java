import com.sandbox.recursion.Recursion;
import com.sandbox.recursion.TowerOfHanoi;


public class Main {

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
//        recursion.run();
        TowerOfHanoi t = new TowerOfHanoi();
        t.solve(3,"A","B","C");
        System.out.println("total number of moves = (2^number of disks) - 1 = " + t.getCntr());
        t.setCntr(0);
    }
}
