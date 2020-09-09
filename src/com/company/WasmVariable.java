package com.company;

public class WasmVariable {
    public String name;
    public WasmType type;

    public WasmVariable(String name, WasmType type) {
        this.name = name;
        this.type = type;
    }

    public String getLocal() {
        return "(get_local $" + this.name + ")";
    }

    public String getParam() {
        return String.format("(param $%s %s)", this.name, this.type);
    }

    public String getLocalForAdding() {
        return String.format("(get_local $%s)", this.name);
    }



    public String getParamForAdding() {
        return String.format("get_local $%s", this.name);
    }



}
