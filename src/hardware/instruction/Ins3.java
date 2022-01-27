package hardware.instruction;

public class Ins3 extends Instruction{

    @Override
    protected void init() {
        this.iid = 3;
    }

    @Override
    public void execute() {
        System.out.println("啦啦啦啦，我是3号指令！");
    }
}
