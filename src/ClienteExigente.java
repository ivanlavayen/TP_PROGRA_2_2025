public class ClienteExigente extends Cliente {
    public ClienteExigente(String nombreCliente, String domicilio, int dni,double descuento) {
        super(nombreCliente, domicilio, dni,descuento);
    }

    @Override
    public boolean leGusta(Articulo articulo) {
        if (super.leGusta(articulo)) {
            for (String genero : generosFavoritos) {
                //Verifica si el artículo tiene alguno de los géneros que le gustan al cliente.
                if (articulo.tieneGenero(genero)) {
                    // Si encontramos una coincidencia, devuelve true
                    return true;
                }
            }
            // 4. Si el bucle termina y no se encontró ninguna coincidencia, devuelve false.
            return false;
        }
        // 5. Si la condición del método padre es falsa, devuelve false.
        return false;
    }
}
