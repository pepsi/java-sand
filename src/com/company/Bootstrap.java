package com.company;

import com.company.instructions.I32;

public class Bootstrap {

    public WasmFunction generateWasmAdd(){
        WasmVariable left = new WasmVariable("left", WasmType.i32);
        WasmVariable right = new WasmVariable("right", WasmType.i32);
        WasmInstruction[] instructions = new WasmInstruction[100];
        instructions[0] = new I32.Add(left, right);
        return new WasmFunction("add", new WasmVariable[]{left,right }, null, WasmType.i32, instructions);
    }
    public WasmFunction generateWasmSub(){
        WasmVariable left = new WasmVariable("left", WasmType.i32);
        WasmVariable right = new WasmVariable("right", WasmType.i32);
        WasmInstruction[] instructions = new WasmInstruction[100];
        instructions[0] = new I32.Sub(left, right);
        return new WasmFunction("sub", new WasmVariable[]{left,right }, null, WasmType.i32, instructions);
    }
    public void go() {
        WasmModule mod = new WasmModule(1, new WasmFunction[]{generateWasmAdd(), generateWasmSub()});
        System.out.println(mod.toWat());
    }
}
