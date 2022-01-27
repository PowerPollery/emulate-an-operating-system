package hardware.instruction;

/**
 * 指令实体
 */
public abstract class Instruction {
    protected int iid;    //指令ID
    public Instruction(){
        init();
    }
    protected abstract void init();
    //执行的指令
    public abstract void execute();
}
