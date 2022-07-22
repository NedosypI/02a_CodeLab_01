package Autotest;

public class App {
    
public static void main(String[] args) {
    
Auto autoMama = new Auto("Volvo");
autoMama.setWochenende(false);
// autoMama.setFahrer("Mama");
// autoMama.setBeifahrer("Irina");
// konto2.setUeberkredit(1500000);

System.out.println(autoMama.returnAllInsassen("Irina","Mama"));
// System.out.println(autoMama.getFahrer());
System.out.println(autoMama.getTyp());
System.out.println(autoMama.returnBeifahrerWochenende());


System.out.println(autoMama.getBeifahrer());
}

}


// Wochende =Beifahrer Irina
//NichtWochende = Beifahrer Albert