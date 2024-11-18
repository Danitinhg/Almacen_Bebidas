package alma_bebidas

class Almacen {

    val bebida1 = Bebida(1, 330, 2.20, "Fanta", true, porcentajeAzucar = 12, descuento = true)
    val bebida2 = Bebida(2, 330, 2.20, "Sprite", true, porcentajeAzucar = 12, descuento = true)
    val bebida3 = Bebida(3, 330, 2.20, "CocaCola", true, porcentajeAzucar = 12, descuento = true)
    val bebida4 = Bebida(4, 220, 2.20, "Agua", false, "Manantial")
    val bebida5 = Bebida(5, 330, 2.20, "Pepsi", true, porcentajeAzucar = 12, descuento = true)
    val bebida6 = Bebida(6, 330, 2.20, "Dr Pepper", true, porcentajeAzucar = 12, descuento = true)

    val mtrzBebidas = Array(5)  { Array<Bebida?>(5) {null} }

    fun agregarBebida (id: Int) {
        for (i in mtrzBebidas.indices) {
            for (j in mtrzBebidas[i].indices) {
                // Si ya existe una bebida con el mismo ID en la matriz, no agregarla
                if (mtrzBebidas[i][j]?.id == Bebida.id) {
                    println("Ya existe una bebida este id")
                } else if (mtrzBebidas[i][j] == null) {
                    mtrzBebidas[i][j] = be

                }
            }
        }
    }

    fun eliminarBebida () {

    }

    fun mostrarBebida () {

    }

    fun calcularPrecio () {

    }

    fun calcularPrecioMarca () {

    }

    fun calcularPrecioColumna() {

    }

}

