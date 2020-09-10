package com.company;

import com.company.instructions.I32;

public class Bootstrap {

    public void go() {
//                        public WasmFunction(String name, WasmVariable[] parameters, WasmVariable[] locals, WasmInstruction[] instructions) {
        WasmVariable left = new WasmVariable("left", WasmType.i32);
        WasmConst right = new WasmConst(91, WasmType.i32);
//        WasmVariable right = new WasmVariable("right", WasmType.i32);
        WasmInstruction[] instructions = new WasmInstruction[100];
        instructions[0] = new I32.Add(left, right);
        WasmFunction add = new WasmFunction("add", new WasmVariable[]{left,right }, null, WasmType.i32, instructions);
        WasmModule mod = new WasmModule(1, new WasmFunction[]{add});
        System.out.println(mod.toWat());
    }
}
