package alma_bebidas

class Almacen {

    val mtrzBebidas = Array(5)  { Array<Bebida?>(5) {null} }

    fun agregarBebida (bebid: Bebida) {

        for (i in mtrzBebidas.indices) {
            for (j in mtrzBebidas[i].indices) {
                if (mtrzBebidas[i][j]?.id == bebid.id) {
                    println("Ya existe una bebida con este id")
                } else  {
                    for (i in mtrzBebidas.indices) {
                        for (j in mtrzBebidas.indices) {
                            if (mtrzBebidas[i][j] == null) {
                                mtrzBebidas[i][j]
                                println("Bebida con el ${bebid.id} agregada")
                            }
                        }
                    }
                }
            }
        }
    }

    fun eliminarBebida (bebid: Bebida) {
        for (i in mtrzBebidas.indices) {
            for (j in mtrzBebidas[i].indices) {
                if (mtrzBebidas[i][j]?.id == bebid.id) {
                    mtrzBebidas[i][j] == null
                    println("Bebida con el ${bebid.id} eliminada")
                } else {
                    println("No hay bebidas con este id")
                }
            }
        }
    }

    fun mostrarBebida (bebid: Bebida) {

        for (i in mtrzBebidas.indices) {
            for (j in mtrzBebidas[i].indices) {
                if (mtrzBebidas[i][j] != null) {
                    if (bebid.refresco) {
                        println("id: ${bebid.id}")
                        println("Litros: ${bebid.litros}")
                        println("Precio: ${bebid.precio}")
                        println("Marca: ${bebid.marca}")
                        println("Porcentaje de azúcar: ${bebid.porcentajeAzucar}")
                        println("Descuento: ${bebid.descuento}")
                    } else {
                        println("id: ${bebid.id}")
                        println("Centilitros: ${bebid.litros}")
                        println("Precio: ${bebid.precio}")
                        println("Marca: ${bebid.litros}")
                        println("Origen: ${bebid.origen}")
                    }
                }
            }
        }
    }

    fun calcularPrecio () {

    }

    fun calcularPrecioMarca () {

    }

    fun calcularPrecioColumna() {

    }

}

