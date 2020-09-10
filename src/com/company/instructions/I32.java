package com.company.instructions;

import com.company.WasmInstruction;
import com.company.WasmType;
import com.company.WasmVariable;

public class I32 {
    enum MathType {
        add, div, mul, sub
    }

    public static class Math extends WasmInstruction {
        WasmVariable left;
        WasmVariable right;
        WasmType type;
        MathType mathType;

        public Math(WasmType type, MathType mathType, WasmVariable left, WasmVariable right) {
            super(String.format("%s.%s", type, mathType));
            this.left = left;
            this.right = right;
            this.type = type;
            this.mathType = mathType;
        }

        public String toWat() {
            return String.format("(%s.%s %s %s)", this.type, this.mathType, this.left.getLocalForAdding(), this.right.getLocalForAdding());
        }

    }

    public static class Add extends Math {
        public Add(WasmVariable left, WasmVariable right) {
            super(WasmType.i32, MathType.add, left, right);
        }
    }
    public static class Sub extends Math {
        public Sub(WasmVariable left, WasmVariable right) {
            super(WasmType.i32, MathType.sub, left, right);
        }
    }
}
