////////////////////////////////////////////////////////////////////
// [Filippo]  [Panighello] [2111016]
// [Riccardo] [Manisi]     [9111948]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class App {
    public static void main(String[] args) {
        int number = parseArgs(args);                   // Parsing dell'input

        String output = RomanPrinter.print( number );   // Conversione in asciiArt numero romano
        System.out.println( output );
    }

    // Parsing degli argomenti della riga di comando
    // Input deve essere un'intero compreso fra 1 e 1000
    private static int parseArgs(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException("Usage: java -jar roman-number.jar <number>");
        }
        try {
            int number = Integer.parseInt(args[0]);
            if (number < 1 || number > 1000) {
                throw new IllegalArgumentException("Il numero deve essere compreso fra 1 e 1000");
            }
            return number;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Il numero deve essere un intero compreso fra 1 e 1000");
        }
    }
}