package com.company;

public class WasmInstruction {
    public String name;
    public int opcode;

    public WasmInstruction(String name) {
        this.name = name;
    }

    public String toWat() {
        return "nop";
    }

}
