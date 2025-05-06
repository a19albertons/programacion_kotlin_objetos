fun main() {
    val editor = Editor()

    editor.insert("Estimado amigo")
    println(editor.getTexto())  // → Estimado amigo

    editor.delete(5)
    println(editor.getTexto())  // → Estimado

    editor.insert("enemigo")
    println(editor.getTexto())  // → Estimado enemigo

    editor.insert(" me las vas a pagar")
    println(editor.getTexto())  // → Estimado enemigo me las vas a pagar

    // Más llamadas a undo() de las necesarias
    repeat(9) { editor.undo() }

    println(editor.getTexto())  // → (vacío o primer estado)

    editor.insert("Empecemos ...")
    println(editor.getTexto())  // → Empecemos ...
}

//incluye mejora propuesta por copilot al crear el estado inicial integramos un init con el listOf
class Editor {
    private val texto = StringBuilder()
    private val stack = ArrayDeque<String>(listOf(""))
    private var estado = 0
    fun insert(text: String) {
        texto.append(text)
        stack.add(texto.toString())
        estado++
    }

    fun delete(length: Int) {
        val inicio = maxOf(0, texto.length - length)
        texto.delete(inicio, texto.length)
        stack.add(texto.toString())
        estado++
    }

    fun getTexto(): String {
        return texto.toString()
    }
    fun undo(){
        if (estado>=1){
            estado--
            texto.delete(0,texto.length)
            texto.append(stack[estado])
        }
    }
}