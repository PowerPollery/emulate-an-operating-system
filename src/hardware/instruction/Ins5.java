package hardware.instruction;

public class Ins5 extends Instruction{

    @Override
    protected void init() {
        this.iid = 5;
    }

    @Override
    public void execute() {
        System.out.println("啦啦啦啦，我是5号指令！");
    }
}
