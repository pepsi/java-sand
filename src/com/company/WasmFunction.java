package com.company;

public class WasmFunction {
    public String name;
    public WasmVariable[] parameters;
    public WasmVariable[] locals;
    public WasmInstruction[] instructions;
    public WasmType result;

    public WasmFunction(String name, WasmVariable[] parameters, WasmVariable[] locals, WasmType result, WasmInstruction[] instructions) {
        this.name = name;
        this.parameters = parameters;
        this.locals = locals;
        this.instructions = instructions;
        this.result = result;
    }

    public String toWat() {
        String wattedInstructions = "";
        for (WasmInstruction wasmInstruction : this.instructions) {
            if(wasmInstruction == null) // Might not exist if the array is empty
                continue;
            wattedInstructions += wasmInstruction.toWat();
        }
        String wattedParams = "";
        for (WasmVariable param : this.parameters) {
            wattedParams += param.getParam();
//            System.out.println(wattedParams);
        }
        return String.format("(func (export \"%s\") %s (result %s) %s)", this.name, wattedParams, this.result, wattedInstructions);
    }
}
