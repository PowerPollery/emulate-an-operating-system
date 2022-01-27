package software;

public class SW1 extends Software{

    @Override
    protected int[] createInsArr() {
        this.setName("我的第一个程序");
        return new int[]{1,3,3,2,1,1,5,2,1};
    }
}
