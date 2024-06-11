package turkpol.org.pl.bootcamp_turkpol.lesson5;

public class Main {
    public static void main(String[] args) {

        String clientModelName = "HP";
        String clientRamCap = "16GB";



        // what you mean by use?
        // new - create an instance of Class

        Laptop lp = new Laptop(clientModelName, clientRamCap);
        System.out.println("Model name of laptop is: "+lp.modelName);
        // null - empty


        Laptop dellFofMustafo = new Laptop("Dell", "32");
        System.out.println("Model name of laptop is: "+ dellFofMustafo.modelName);

    }
}
