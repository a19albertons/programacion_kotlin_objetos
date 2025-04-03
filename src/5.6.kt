
fun main() {
    // Crear una instancia de Persona
    val persona = Persona("Telma Telmeira", 25)

    // Crear una instancia de la clase interna Direccion usando la instancia de Persona
    val direccion = persona.Direccion("Plaza de Galicia 4", "Santiago", "15701")

    // Mostrar la información de la persona y su dirección
    println("Nombre: ${persona.nombre}")
    println("Edad: ${persona.edad}")
    println("Dirección: ${direccion.obtenerDireccionCompleta()}")
}
class Persona(val nombre: String, val edad: Int) {
    inner class Direccion(val lugar: String, val ciudad: String, val codigoPostal: String) {
        fun obtenerDireccionCompleta(): String {
            return "$lugar, $ciudad, $codigoPostal"
        }

    }

}