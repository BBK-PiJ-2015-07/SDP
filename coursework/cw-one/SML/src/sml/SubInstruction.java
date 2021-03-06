package sml;

/**
 * Created by Andras Pinter on 07/03/2017.
 * Subtracts the value stored in register op2 from the value stored in register op1
 */
public class SubInstruction extends Instruction {
    private int result;
    private int op1;
    private int op2;

    public SubInstruction(String label, String op) {
        super(label, op);
    }

    public SubInstruction(String label, int result, int op1, int op2) {
        this(label, "sub");
        this.result = result;
        this.op1 = op1;
        this.op2 = op2;
    }

    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        int value2 = m.getRegisters().getRegister(op2);
        m.getRegisters().setRegister(result, value1 - value2);
    }

    @Override
    public String toString() {
        return super.toString() + " reg " + op1 + " - reg " + op2 + " to reg " + result;
    }
}