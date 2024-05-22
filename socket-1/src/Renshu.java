import static org.junit.jupiter.api.Assertions.*;

public class Renshu {
    // xを2倍にして返す関数
    public int doubleValue(int x) {
        return x * 2;
    }

    //ここに続きを実装していく。

    public int sumUpToN(int x) {
        return (x / 2) * (x + 1);
    }

    public int sumFromPtoQ(int x, int y){
        return ;
    }

    public int testSumFromArrayIndex(int[] a, int index){
        return ;
    }

    public int testSelectMaxValue(int[] a){
        return ;
    }

    public int testSelectMinValue(int[] a){
        return ;
    }

    public int testSelectMaxIndex(int[] a){
        return ;
    }

    public int testSelectMinIndex(int[] a){
        return ;
    }

    public int testSwapArrayElements(int[] p, int i, int j)){
        int[] p = {10,9,8,4,15,0,-3,18,9,7};
    //0番目と9番目入れ替え後の配列
    int[] q = {7,9,8,4,15,0,-3,18,9,10};
    renshu.swapArrayElements(p, 0, 9);//この瞬間参照渡しのpが書き換わる
    assertTrue(Arrays.equals(p, q));
        return ;
    }

    public int testSwapTwoArrays(int x, int y){
        return ;
    }
}
