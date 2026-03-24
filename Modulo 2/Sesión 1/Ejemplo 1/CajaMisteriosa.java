// PascalCase -> Primera letra de c/palabra mayuscula
// camelCase -> La primer letra es minúscula y luego la de c/palabra mayuscula

/*
    La clase Object es el padre de todos.
*/

public class CajaMisteriosa<t>{

    private x valor;

    public void guardar(x nuevoValor) {
        this.valor = nuevoValor;
    }

    public x sacar() {
        return valor;
    }

    public boolean estaVacia() {
        return valor == null;
    }
}

// new CajaMisteriosa(); -> Ejecuta el constructor de Object