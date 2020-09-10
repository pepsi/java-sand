package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class WasmInstructions {
    public ArrayList<WasmInstruction> instructions;
    public WasmInstructions(){
        this.instructions = new ArrayList<WasmInstruction>();
    }
    public void insert(WasmInstruction... instructions){
        this.instructions.addAll(Arrays.asList(instructions));
    }
}
