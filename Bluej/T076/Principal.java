public class Principal {

    // Método que devuelve true si la cadena contiene todas las vocales
    public static boolean vocales5(String cadena) {
        // Pasamos todo a minúsculas para simplificar
        cadena = cadena.toLowerCase();

        // Comprobamos si contiene cada vocal
        return cadena.contains("a") &&
               cadena.contains("e") &&
               cadena.contains("i") &&
               cadena.contains("o") &&
               cadena.contains("u");
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        System.out.println(vocales5("murciélago")); // true (tiene todas las vocales)
        System.out.println(vocales5("hola mundo")); // false (falta la 'i')
    }
}