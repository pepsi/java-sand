package com.company;

public class WasmConst extends WasmVariable{
    Number num;
     public WasmConst(float num, WasmType type){ // F32
         super(null, type);
        this.num = num;
     }
    public WasmConst(double num, WasmType type){ // F64
        super(null, type);
        this.num = num;
    }
    public WasmConst(int num, WasmType type){ // I32
        super(null, type);
        this.num = num;
    }
    public WasmConst(long num, WasmType type){ // I64
        super(null, type);
        this.num = num;
    }

    @Override
    public String getLocal() {
        return String.format("%s.const %s", this.type, this.num);
    }
    public String getLocalForAdding() {
        return String.format("(%s.const %s)", this.type, this.num);
    }
}
