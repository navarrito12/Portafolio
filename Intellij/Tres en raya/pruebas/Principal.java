public class Principal {
    public static void main(String[] args) {
        m1();
//        m2();
    }

    private static void m1() {
        TipoFicha[] tipos=TipoFicha.values();
        for (int i = 0; i < tipos.length; i++) {
            System.out.print(new Ficha(tipos[i]));
            System.out.println(tipos[i].ordinal());
        }
    }

    private static void m2() {
        TipoFicha[] tipos=TipoFicha.values();
        for (int i = 0; i < tipos.length; i++) {
            Casilla casilla=new Casilla();
            casilla.colocar(new Ficha(tipos[i]));
            System.out.print(casilla);
        }
    }

    private static void m3() {
        Tablero t1=new Tablero();
        System.out.println(t1);
        t1.colocar(new Ficha(TipoFicha.X), new Coordenada(1,2));
        t1.colocar(new Ficha(TipoFicha.O), new Coordenada(2,1));
        t1.colocar(new Ficha(TipoFicha.X), new Coordenada(0,1));
        try {
            // Error: coordenada no válida
            t1.colocar(new Ficha(TipoFicha.X), new Coordenada(0, 3));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            // Error: casilla ocupada
            t1.colocar(new Ficha(TipoFicha.X), new Coordenada(0,1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(t1);
    }

    private static void m4() {
        Tablero t1=new Tablero();
        // null -> La casilla está vacía (no tiene ficha)
        TipoFicha[][] pruebas= {
                {null, null, null},
                {TipoFicha.X, null, null},
                {null, TipoFicha.X, null},
                {TipoFicha.O, null, null},
                {null, TipoFicha.O, null},
                {TipoFicha.X, TipoFicha.X, TipoFicha.X},
                {TipoFicha.O, TipoFicha.O, TipoFicha.O}
        };
        for (int i=0; i<pruebas.length; i++) {
            Casilla[] casillas = new Casilla[3];
            for (int j = 0; j < casillas.length; j++) {
                casillas[j] = new Casilla();
                if (pruebas[i][j] != null)
                    casillas[j].colocar(new Ficha(pruebas[i][j]));
            }
            System.out.printf("%s -> %s\n", Arrays.toString(casillas), t1.hayLinea(casillas));
        }
    }
}
