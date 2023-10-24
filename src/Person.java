public class Person {


    public void personInfo(String name, String surname, String city, long phone){
        System.out.println("Зателефонувати громадянину " + name +" " + surname + " із міста " + city +  " можна за номером " + phone);
    }

    public static void personInfoStatic(String name, String surname, String city, long phone){

        System.out.println("Зателефонувати громадянину " + name +" " + surname + " із міста " + city +  " можна за номером " + phone);

    }
}