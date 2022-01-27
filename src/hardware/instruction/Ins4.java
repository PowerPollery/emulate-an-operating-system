package hardware.instruction;

public class Ins4 extends Instruction{

    @Override
    protected void init() {
        this.iid = 4;
    }

    @Override
    public void execute() {
        System.out.println("啦啦啦啦，我是4号指令！");
    }
}
