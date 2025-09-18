
//import java.util.Scanner;
import src.methods.Methods;

public class Main {
    public static void main( String[] args ){
        
            
    /*
        Double:
        double a = 3;
        double b = 4;
        double svar = a / b;
        System.out.println(svar);
       
        if-sats:
        int x = ( 4 < 3) ? 1 : -1;
        System.out.println(x);

        Strängar:
        String s = "Detta är en sträng";
        System.out.println (s);

        String s = "Hejsan hallå där.";
        String sub = s.substring(7, 12);
        System.out.println(sub);

        String message = "Det är dags för lite Java";
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        String message2 = "Tycker Mahdi";
        String hopslagenSträng = message.concat(". " + message2);
        System.out.println(hopslagenSträng);

        Inmatning:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv tre ord, separera med mellanslag");
        String s1 = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.next();
        System.out.println(s1 + "\n" + s2 + "\n" + s3 );
        scanner.close();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Skriv in en hel mening");
        String helmening = scanner2.nextLine();
        System.out.println(helmening);
        scanner2.close();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Skriv in ett tal");
        int tal = scanner3.nextInt();
        System.out.println("Du skrev talet " + tal);
        scanner3.close();

        String text1 = "Hejsan hallå där";
        System.out.println(text1.endsWith("r"));

        String text2 = "Hej hallå där";
        System.out.println("Längden på texten är " + text2.length());
        System.out.println("Sista bokstaven är " + text2.charAt(12)); 

        Loopar:
        int i = 0;
        while (i  < 10) {
            System.out.println(i);
            i++;
        }

        Do While används ifall vi vill köra koden minst en gång till skillnad
        från vanlig While
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }while ( i < 10);

         for( int i = 0 ; i <= 10 ; i++){
            System.out.println(i);
        }

        int i = 0;
        boolean b = true;
        while (b) {
            System.out.println(i);
            i++;
            if (i == 22323) {
                b = false;
            }
       }
            Switch case loop
            int x = 4;
            switch (x) {
            case 1: System.out.println("Case 1");
                break;
            case 2: System.out.println("Case 2");
                break;
            case 3: System.out.println("Case 3");
                break;
            case 4: System.out.println("Case 4");
                break;
            default: System.out.println("Default");
                break;
        }
        int x = 4;
        int y = 5;
        add( x , y );
        int z = add(x, y);
        System.out.println(z);

        public static int add(int x, int y) {
        return x + y;

        int x = 2;
        int y = 9;
        Method minaMetoder = new Method();
        int z = minaMetoder.add(x, y);
        System.out.println("Svaret på additionen blir " + z);

        Arrayer:
        String [] textArray = { "Mahdi", "Hussein", "Ali", "Beni", "Mohsen", "Morteza"};
        Method m = new Method();
        String count = "h";
        String result = m.demo(textArray, count);
        System.out.println(result);

        Bubblesort algoritm:
         int [] intArray = new int[10];   
        intArray[9] = 1;
        intArray[7] = 2;
        intArray[2] = 3;
        intArray[1] = 4;
        intArray[0] = 5;
        intArray[8] = 6;
        intArray[4] = 7;
        intArray[6] = 8;
        intArray[5] = 9;
        intArray[3] = 10;

        System.out.print("Osorterat: ");
        for(int i : intArray) {
            System.out.print(i + " ");
        }

        for( int i = 0; i < intArray.length - 1; i++){
            for( int j = 0; j < intArray.length - 1 - i; j++){
                if( intArray[j] > intArray[j+1]){
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
        }

        System.out.print("Sorterad: ");
        for( int i : intArray){
            System.out.print( i + " ");
        }
    }

    // Bubblesort algoritm for ett array som innehåller 20 tal
        int[] bubbleArray = { 5, 1, 4, 2, 8, 3, 7, 6, 10, 9, 15, 12, 14, 11, 20, 18, 19, 17, 16, 13 };
        System.out.print("Osorterat: ");
        for (int i : bubbleArray) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < bubbleArray.length - 1; i++) {
            for (int j = 0; j < bubbleArray.length - 1 - i; j++) {
                if (bubbleArray[j] > bubbleArray[j + 1]) {
                    int temp = bubbleArray[j];
                    bubbleArray[j] = bubbleArray[j + 1];
                    bubbleArray[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorterad: ");
        for (int i : bubbleArray) {
            System.out.print(i + " ");
        }
    */
        Methods m = new Methods();
        int sum = m.add(5, 10);
        System.out.println("Summan är: " + sum);
        
    }
}