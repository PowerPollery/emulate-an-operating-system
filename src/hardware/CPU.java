package hardware;

import hardware.instruction.Instruction;
import hardware.instruction.InstructionSet;

public class CPU {
    public static InstructionSet insSet = new InstructionSet();
    //CPU执行指令
    public static void exec(int iid){
        Instruction ins = insSet.getIns(iid);
        ins.execute();
    }
}
