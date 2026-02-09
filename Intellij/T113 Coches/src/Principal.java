public class Principal {
    public static void main(String[] args) {
        probarMatriculas();
    }

    private static void probarMatriculas() {
        String[] textoMatriculas=new String[]{
                "",         // Error longitud
                "1234ABC",  // Ok
                "1234AB",   // Error longitud
                "1234ÑAB",  // Error Ñ
                "@123ABC"   // Error @
        };
        Matricula[] matriculas=new Matricula[textoMatriculas.length];
        for (int i = 0; i < textoMatriculas.length; i++) {
            try {
                matriculas[i] = new Matricula(textoMatriculas[i]);
                System.out.printf("Matricula: %s\n", matriculas[i]);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
