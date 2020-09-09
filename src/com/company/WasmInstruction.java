package com.company;

public class WasmInstruction {
    public String name;
    public int opcode;

    public WasmInstruction(String name, int opcode) {
        this.name = name;
        this.opcode = opcode;
    }

    public String toWat() {
        return "nop";
    }

}
