package software;

/**
 * 可执行软件 - 包含指令序列
 */
public abstract class Software {
    private String name = "未知"; //程序名
    //软件的指令序列
    private int[] insArr;
    public Software(){
        this.insArr = createInsArr();
    }

    public int[] getInsArr() {
        return insArr;
    }

    protected abstract int[] createInsArr();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
