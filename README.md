This is a Kotlin Multiplatform project targeting WebAssembly (WASI).


> **As of now, I tried a few runtimes, but I couldn't get the code to run in any of them (Node.js, WasmEdge, Wasmtime, Wasmer).**

## Build and run

Prerequisite: install WasmEdge WebAssembly runtime.

Run the following task:

```shell
./gradlew runWasm
```

Example session:

```text
hello
Wasm received: hello
```