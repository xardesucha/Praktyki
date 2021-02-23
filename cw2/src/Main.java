public class Main {
    public static void main(String[] args)
    {
        //Zadanie 1 Pętle
        //Napisz pętle, która wypisze znaki(A-Z) z tabeli , wynikiem mają być wypisane znaki (co drugi!)
        char PierwszaLitera = 'A';

        for (int i = 0; i < 26; i++)
        {
            if ( i % 2 == 0)
                System.out.print(PierwszaLitera + "\t");
            PierwszaLitera++;
        }
        //Zadanie 2
        //Napisz pętle, która wypisze ciąg fibonacciego o długości X
        int x = 9;
        int k = 1;
        int l = 1;
        System.out.print("\n 1  1 ");
        for(int i = 3; i <= x; i++)
        {
            int p = l;
            l = k + l;
            k = p;
            System.out.print(" " + l + " ");
        }
    }

    }
