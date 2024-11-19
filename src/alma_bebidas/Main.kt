package alma_bebidas

fun main()  {
    val bebida1 = Bebida(1, 0.33, 2.20, "Fanta", true, porcentajeAzucar = 12, descuento = true)
    val bebida2 = Bebida(2, 0.33, 2.20, "Sprite", true, porcentajeAzucar = 12, descuento = true)
    val bebida3 = Bebida(3, 0.33, 2.20, "CocaCola", true, porcentajeAzucar = 12, descuento = true)
    val bebida4 = Bebida(4, 1.2, 2.20, "Bezoya", false, "Fuente del pueblo")
    val bebida5 = Bebida(5, 0.33, 2.20, "Pepsi", true, porcentajeAzucar = 12, descuento = true)
    val bebida6 = Bebida(6, 0.33, 2.20, "Dr Pepper", true, porcentajeAzucar = 12, descuento = true)

    val almacen1 = Almacen()

    almacen1.agregarBebida(bebida1)
    almacen1.mostrarBebida(bebida1)
    almacen1.eliminarBebida(bebida1)
    almacen1.mostrarBebida(bebida1)

}


