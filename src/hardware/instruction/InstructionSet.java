package hardware.instruction;

import java.util.HashMap;

/**
 * 硬件指令集，每个指令
 */
public class InstructionSet {
    private HashMap<Integer, Instruction> insSet = new HashMap<>();
    public InstructionSet(){
        init();
    }
    public void init(){
        insSet.put(1, new Ins1());
        insSet.put(2, new Ins2());
        insSet.put(3, new Ins3());
        insSet.put(4, new Ins4());
        insSet.put(5, new Ins5());
    }
    public Instruction getIns(int iid){
        return insSet.get(iid);
    }
}
