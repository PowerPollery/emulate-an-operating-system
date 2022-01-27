package hardware.instruction;

public class Ins1 extends Instruction{

    @Override
    protected void init() {
        this.iid = 1;
    }

    @Override
    public void execute() {
        System.out.println("啦啦啦啦，我是1号指令！");
    }
}
