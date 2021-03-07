public class Main {
        public  static void main(String[] args){

            System.out.println("Zad 1");
            Kwadrat kwadrat = new Kwadrat(7);
            System.out.println(kwadrat.Pole());

            Prostokat prostokat = new Prostokat(8,3);
            System.out.println(prostokat.Pole());


            System.out.println("Zad 2");
            Pies pies = new Pies(3,4,"Siersciuch","Szara",20);
            pies.dajGlos();

            System.out.println("Zad 3");
            Spawacz spawacz = new Spawacz(2500,"pełny",true,true);
            spawacz.wykonujePrace();

            System.out.println("Zad 4");
            System.out.println("Która metoda przysłania metodę z klasy nadrzędnej/superclass?\n methodTwo, methodFour");
            System.out.println("Która metoda jest ukryta/niewidzialna w klasie B?\n methodThree i medtodOne");


        }

    }

