package alma_bebidas

class Bebida(
    val id: Int,
    val litros: Double,
    val precio: Double,
    val marca: String,
    val refresco: Boolean,
    val origen: String? = null,
    val porcentajeAzucar: Int? = null,
    val descuento: Boolean = false

) {


}