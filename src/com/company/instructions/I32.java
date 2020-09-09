package com.company.instructions;

import com.company.WasmInstruction;
import com.company.WasmVariable;

public class I32 {
    public static class Add extends WasmInstruction{
        WasmVariable left;
        WasmVariable right;
        public Add(WasmVariable left, WasmVariable right) {
            super("i32.add", 0x6a);
            this.left = left;
            this.right = right;
        }

        public String toWat() {
            return String.format("(i32.add %s %s )", this.left.getLocalForAdding(), this.right.getLocalForAdding());
        }

    }
}
