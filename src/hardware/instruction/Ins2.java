package hardware.instruction;

public class Ins2 extends Instruction{

    @Override
    protected void init() {
        this.iid = 2;
    }

    @Override
    public void execute() {
        System.out.println("啦啦啦啦，我是2号指令！");
    }
}
