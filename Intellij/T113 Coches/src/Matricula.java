import org.jetbrains.annotations.NotNull;

public class Matricula {
    private static final String FORMATO="9999AAA";  // 9=Cifra [0-9] A=letra mayúscula [A-Z] (sin eñe)
    private String texto;                           // NO NULO, LONGITUD=FORMATO.length()

    public Matricula(String texto) {
        setTexto(texto);
    }

    private void setTexto(@NotNull String texto) {
        if (texto.length()!=FORMATO.length())
            throw new IllegalArgumentException("La longitud de la matrícula debe ser %d [longitud=%d]"
                    .formatted(FORMATO.length(), texto.length()));
        if (!validarFormato(texto))
            throw new IllegalArgumentException("La matrícula %s no cumple el formato %s"
                    .formatted(texto, FORMATO));
        this.texto=texto;
    }

    private boolean validarFormato(@NotNull String texto) {
        final String cifras = "0123456789";
        final String letras = letrasMayusculas();         // [A-Z] Excepto la Ñ

        for (int i = 0; i < texto.length(); i++) {
            switch (FORMATO.charAt(i)) {
                case '9':
                    if (cifras.indexOf(texto.charAt(i)) == -1)  // ¿Es una cifra?
                        return false;
                    break;
                case 'A':
                    if (letras.indexOf(texto.charAt(i)) == -1)  // ¿Es una letra mayúscula?
                        return false;
                    break;
                default:
                    throw new IllegalStateException("El FORMATO contiene el caracter formato inesperado: %c"
                            .formatted(FORMATO.charAt(i)));
            }
        }
        return true;
    }

    // Devuelve una cadena con las letras mayúsculas de la A a la Z (excepto la Ñ)
    private String letrasMayusculas() {
        StringBuilder sb=new StringBuilder();
        for (char c='A'; c<='Z' ; c++)
            sb.append(c);
        return sb.toString();
    }

    @Override
    public String toString() {
        return texto;
    }
}
