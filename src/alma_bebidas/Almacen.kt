package alma_bebidas

class Almacen {

    val mtrzBebidas = Array(5)  { Array<Bebida?>(5) {null} }

    val bebidasmap = mutableMapOf(
        1 to Bebida(1, 0.33, 2.20, "Fanta", true, porcentajeAzucar = 12, descuento = true),
        2 to Bebida(2, 0.33, 2.20, "Sprite", true, porcentajeAzucar = 12, descuento = false),
        3 to Bebida(3, 0.33, 2.20, "CocaCola", true, porcentajeAzucar = 12, descuento = true),
        4 to Bebida(4, 1.2, 0.60, "Bezoya", false, "Fuente del pueblo"),
        5 to Bebida(5, 0.33, 2.20, "Pepsi", true, porcentajeAzucar = 12, descuento = false),
        6 to Bebida(6, 0.33, 2.20, "Dr Pepper", true, porcentajeAzucar = 12, descuento = true),
        7 to Bebida(7, 2.00, 1.80, "Dr Pepper", true, porcentajeAzucar = 12, descuento = false)
    )

    fun agregarBebida (id: Int) {

        val bebid = bebidasmap[id]

        if (bebid == null) {
            println("La bebida con el id $id no existe")
            return
        }

        for (i in mtrzBebidas.indices) {
            for (j in mtrzBebidas[i].indices) {
                if (mtrzBebidas[i][j] == null) {
                    mtrzBebidas[i][j] = bebid
                    println("Bebida con el id $id agregada")
                    return
                }
            }
        }
    }

    fun eliminarBebida (id: Int) {
        var haybebida: Boolean = false

        for (i in mtrzBebidas.indices) {
            for (j in mtrzBebidas[i].indices) {
                val bebid = mtrzBebidas[i][j]
                if (bebid != null) {
                    if (bebid.id == id) {
                        mtrzBebidas[i][j] = null
                        println("Bebida con el id $id eliminada")
                        haybebida = true
                        return
                    }
                }
            }
        }

        if (!haybebida) {
            println("No existe la bebida con el id $id")
        }
    }

    fun mostrarBebida () {
        var haybebida: Boolean = false

        for (i in mtrzBebidas.indices) {
            for (j in mtrzBebidas[i].indices) {
                val bebid = mtrzBebidas[i][j]
                if (bebid != null) {
                    haybebida = true
                    if (bebid.refresco) {
                        println("Id: ${bebid.id}")
                        println("Litros: ${bebid.litros}")
                        println("Precio: ${bebid.precio}")
                        println("Marca: ${bebid.marca}")
                        println("Porcentaje de azúcar: ${bebid.porcentajeAzucar}")
                        if (bebid.descuento) {
                            println("Descuento: 10%")
                            println("-------------------------")
                        } else {
                            println("Descuento: No tiene")
                            println("-------------------------")
                        }

                    } else {
                        println("Id: ${bebid.id}")
                        println("Centilitros: ${bebid.litros}")
                        println("Precio: ${bebid.precio}")
                        println("Marca: ${bebid.marca}")
                        println("Origen: ${bebid.origen}")
                        println("-------------------------")
                    }
                }
            }
        }

        if (!haybebida) {
            println("No hay bebidas que mostrar")
        }
    }

    fun calcularPrecio () {
        var preciototal: Double = 0.00
        for (i in mtrzBebidas.indices) {
            for (j in mtrzBebidas[i].indices) {
                val bebid = mtrzBebidas[i][j]
                if (bebid != null) {
                    if (bebid.descuento) {
                        val descuento = bebid.precio * (10/100.0)
                        val precioDescuento = bebid.precio - descuento

                        preciototal += precioDescuento
                    } else {
                        preciototal += bebid.precio
                    }
                }
            }
        }
        println("El precio total es €${"%.2f".format(preciototal)}")
    }

    fun calcularPrecioMarca (Marca: String) {
        var preciototalMarca: Double = 0.00
        for (i in mtrzBebidas.indices) {
            for (j in mtrzBebidas[i].indices) {
                val bebid = mtrzBebidas[i][j]
                if (bebid != null) {
                    if(bebid.marca == Marca) {
                        if (bebid.descuento) {
                            val descuento = bebid.precio * (10/100.0)
                            val precioDescuento = bebid.precio - descuento

                            preciototalMarca += precioDescuento
                        } else {
                            preciototalMarca += bebid.precio
                        }
                    }

                }
            }
        }
        println("El precio total de la marca $Marca es €${"%.2f".format(preciototalMarca)}")
    }

    fun calcularPrecioColumna(colum: Int) {
        var preciototalColumna: Double = 0.00
        for (i in mtrzBebidas.indices) {
            val bebid = mtrzBebidas[i][colum]

            if (bebid != null) {
                if (bebid.descuento) {
                    val descuento = bebid.precio * (10/100.0)
                    val precioDescuento = bebid.precio - descuento

                    preciototalColumna += precioDescuento
                } else {
                    preciototalColumna += bebid.precio
                }
            }
        }
        println("El precio total de la columna $colum es €${"%.2f".format(preciototalColumna)}")
    }

    fun verMatriz() {
        for (i in mtrzBebidas.indices) {
            for (j in mtrzBebidas[i].indices) {

                val bebida = mtrzBebidas[i][j]
                if (bebida != null) {
                    print("${bebida.marca}  ")
                } else {
                    print("×  ")
                }
            }
            println()
        }
    }
}