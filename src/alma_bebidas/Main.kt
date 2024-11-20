package alma_bebidas

fun main()  {

    // Crear una instancia del Almacen
    val almacen = Almacen()

    // Agregar bebidas a la matriz
    println("Probando agregar bebidas...\n")
    almacen.agregarBebida(1)  // Fanta
    almacen.agregarBebida(2)  // Sprite
    almacen.agregarBebida(3)  // CocaCola
    almacen.agregarBebida(4)  // Bezoya
    almacen.agregarBebida(5)  // Pepsi
    almacen.agregarBebida(6)  // Dr Pepper

    // Ver la matriz después de agregar las bebidas
    println("\nMatriz después de agregar las bebidas:")
    almacen.verMatriz()

    // Calcular el precio total de todas las bebidas
    println("\nCalculando el precio total de todas las bebidas...")
    almacen.calcularPrecio()

    // Calcular el precio total de la marca "Dr Pepper"
    println("\nCalculando el precio total de la marca Dr Pepper...")
    almacen.calcularPrecioMarca("Dr Pepper")

    // Calcular el precio total de la columna 0
    println("\nCalculando el precio total de la columna 0...")
    almacen.calcularPrecioColumna(0)

    // Mostrar las bebidas en la matriz
    println("\nMostrando todas las bebidas en la matriz:")
    almacen.mostrarBebida()

    // Eliminar una bebida con id 3 (CocaCola)
    println("\nProbando eliminar una bebida con id 3 (CocaCola)...")
    almacen.eliminarBebida(3)

    // Mostrar la matriz después de eliminar la bebida
    println("\nMatriz después de eliminar la bebida con id 3 (CocaCola):")
    almacen.verMatriz()

    // Calcular el precio total de todas las bebidas después de eliminar una
    println("\nCalculando el precio total de todas las bebidas después de eliminar una...")
    almacen.calcularPrecio()

    // Calcular el precio total de la marca "Dr Pepper" después de la eliminación
    println("\nCalculando el precio total de la marca Dr Pepper después de eliminar una bebida...")
    almacen.calcularPrecioMarca("Dr Pepper")

    // Ver la matriz después de la eliminación
    println("\nMatriz después de eliminar una bebida:")
    almacen.verMatriz()

    // Agregar más bebidas para completar la matriz
    println("\nProbando agregar más bebidas para llenar la matriz...")
    almacen.agregarBebida(7)  // Dr Pepper (2L)

    // Ver la matriz después de agregar más bebidas
    println("\nMatriz después de agregar más bebidas:")
    almacen.verMatriz()

    // Calcular el precio total de la columna 1 después de agregar más bebidas
    println("\nCalculando el precio total de la columna 1 después de agregar más bebidas...")
    almacen.calcularPrecioColumna(1)

    // Eliminar todas las bebidas para ver el comportamiento con la matriz vacía
    println("\nProbando eliminar todas las bebidas...")
    almacen.eliminarBebida(1)  // Fanta
    almacen.eliminarBebida(2)  // Sprite
    almacen.eliminarBebida(4)  // Bezoya
    almacen.eliminarBebida(5)  // Pepsi
    almacen.eliminarBebida(6)  // Dr Pepper
    almacen.eliminarBebida(7)  // Dr Pepper (2L)

    // Ver la matriz después de eliminar todas las bebidas
    println("\nMatriz después de eliminar todas las bebidas:")
    almacen.verMatriz()

    // Intentar calcular el precio después de eliminar todas las bebidas
    println("\nCalculando el precio total después de eliminar todas las bebidas...")
    almacen.calcularPrecio()

    // Intentar eliminar una bebida inexistente
    println("\nProbando eliminar una bebida con un id inexistente (id 99)...")
    almacen.eliminarBebida(99)

}


