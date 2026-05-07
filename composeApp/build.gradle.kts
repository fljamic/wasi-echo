import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    kotlin("multiplatform") version "2.3.21"
}

kotlin {
    @OptIn(ExperimentalWasmDsl::class)
    wasmWasi {
        nodejs()
        binaries.executable()
    }
}

val wasmBinaryPath = layout.buildDirectory.file(
    "compileSync/wasmWasi/main/productionExecutable/kotlin/wasi-${project.name}.wasm"
)

tasks.register<Exec>("runWasm") {
    dependsOn("compileProductionExecutableKotlinWasmWasi")
    val wasmFile = wasmBinaryPath.get().asFile
    commandLine(
        "wasmedge",
        "--enable-gc",
        "--enable-threads",
        wasmFile.absolutePath
    )
    standardInput = System.`in`
}