package com.company;

class WasmModule {
    public int memory;
    public WasmFunction[] functions;

    public WasmModule(int memory, WasmFunction[] functions) {
        this.memory = memory;
        this.functions = functions;
    }

    public String toWat() {
        String wattedFunctions = "";
        for (WasmFunction wasmFunction : this.functions) {
            wattedFunctions += wasmFunction.toWat();
        }
        return String.format("(module (memory %s) %s) ", memory, wattedFunctions);
    }

}
