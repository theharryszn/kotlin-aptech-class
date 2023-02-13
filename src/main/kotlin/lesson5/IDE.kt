package lesson5

fun main() {
    val ide = IDE(Compiler())

    ide.start()
}

class Compiler {
    val name = "GCC"
    fun compile() {
        println("Compiling....")
    }


    fun run() {
        println("Running....")
    }

}
class IDE(private val compiler: Compiler) {
    private fun installCompiler() {
        println("Installing ${compiler.name} compiler...." )
    }

    private fun Compiler.compileAndRun() {
        installCompiler()
        this@IDE.run()
        compile()
        run()
    }

    private fun run() {
        println("IDE is running....")
    }

    fun start(){
        compiler.compileAndRun()
    }
}