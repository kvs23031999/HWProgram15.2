public class HWPersonInfoProgram {


    public static void main(String[] args){

        Person person = new Person();

        Person.personInfoStatic("Will ", "Smith", " New York", 2936729462846L);
        Person.personInfoStatic("Jackie","Chan",  "Shanghai", 12312412412L);
        Person.personInfoStatic("Sherlock ","Holmes",  " London", 37742123513L);
        person.personInfo("Will ", "Smith", " New York", 2936729462846L);
        person.personInfo("Jackie","Chan",  "Shanghai", 12312412412L);
        person.personInfo("Sherlock ","Holmes",  " London", 37742123513L);
    }
}
