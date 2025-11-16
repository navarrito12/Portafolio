public class Tanque
{
    private int fila;       // >=0
    private int columna;    // >=0
    private char direccion; // 'N'  {‘N’,’S’,’E’,’O’,'A'}
    
    public Tanque() {
        this(0, 0, 'N');
    }
    
    public Tanque(int fila, int columna) {
        this(fila, columna, 'N'); 
    }
    
    public Tanque(int fila, int columna, char direccion) {
        setFila(fila);
        setColumna(columna);
        setDireccion(direccion);
    }
    
    public int getFila() {
        return fila;
    }
    
    public int getColumna() {
        return columna;
    }
    
    public char getDireccion() {
        return direccion;
    }
    
    private void setFila(int fila) {
        /* assert fila>=0: 
            "La fila debe ser >=0 [fila=%d]".formatted(fila);*/
        this.fila=fila;
    }
    
    private void setColumna(int columna) {
        /*assert columna>=0: 
            "La columna debe ser >=0 [columna=%d]".formatted(columna);*/
        this.columna=columna;
    }
    
    public void setDireccion(char direccion) {
        assert  direccion=='N' 
                || direccion=='S'
                || direccion=='E'
                || direccion=='O'
                || direccion=='A':
                "La dirección no es válida [direccion=%c] [direcciones=NSEO]".formatted(direccion);
        this.direccion=direccion;        
    }
    
    public void girar() {
        if (direccion == 'N') {
            direccion = 'E';
        } else if (direccion == 'E') {
            direccion = 'S';
        } else if (direccion == 'S') {
            direccion = 'O';
        } else if (direccion == 'O') {
            direccion = 'N';
        } 
        // Si la dirección es 'A' o desconocida, no hace nada o la deja como 'A'
    }
    
    public void avanzar(int distancia) {
        assert distancia>=0: "La distancia a avanzar debe ser >=0 [distancia=%d]".formatted(distancia);
        
        if (direccion=='N') {
            int nuevaFila = fila - distancia;
            setFila(fila-distancia);
        }
        else if (direccion=='S')
            setFila(fila+distancia);
        else if (direccion=='E')
            setColumna(columna+distancia);
        else if (direccion=='O')
            setColumna(columna-distancia);
        else {                                        // PROGRAMACIÓN DEFENSIVA
            System.err.printf("Dirección desconocida: %c\n", direccion);
            // System.exit(1);
        }
    }
        
    public String toString() {
        return "(%d,%d) -> %c".formatted(fila, columna, direccion);
    }
}