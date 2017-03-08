package sml;

/**
 * Created by Andras Pinter on 07/03/2017.
 * Branch to label if the value stored in register is not zero.
 */
public class BnzInstruction extends Instruction{

    private int register;
    private String label2;

    public BnzInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public BnzInstruction(String label, int register, String label2) {
        super(label, "bnz");
        this.register = register;
        this.label2 = label2;
    }

    @Override
    public void execute(Machine m) {
        if(m.getRegisters().getRegister(register) != 0){
            //int labelIdx = m.getLabels().indexOf(label2);

            m.setPc(m.getLabels().indexOf(label2));
        }
    }

    @Override
    public String toString() { return super.toString() + " register " + register + " jump to label " + label2; }
}
