package Autotest;

public class Auto {
    
private String Beifahrer;
private String Fahrer;
private String Typ;
private boolean Wochenende;

//Konstruktor / Jede Klasse min 1 leeren Konstr.
public Auto() {
}

public Auto(String typ) {
    Typ = typ;
}


//Getter / Setter
public String getBeifahrer() {
    return Beifahrer;
}
public void setBeifahrer(String beifahrer) {
    Beifahrer = beifahrer;
}
public String getFahrer() {
    return Fahrer;
}
public void setFahrer(String fahrer) {
    Fahrer = fahrer;
}    

public String getTyp() {
    return Typ;
}

public void setTyp(String typ) {
    Typ = typ;
}

public boolean isWochenende() {
    return Wochenende;
}

public void setWochenende(boolean wochenende) {
    Wochenende = wochenende;
}

public String returnBeifahrerWochenende() {
    if (Wochenende==true) {
        Beifahrer = "Irina";
        return Beifahrer;
    } else {
        Beifahrer = "Albert";
        return Beifahrer;
    }
    
}


//zusammenbau
public String returnAllInsassen(String beifahrer, String fahrer){
Beifahrer = beifahrer;
Fahrer = fahrer;
    return beifahrer + " " + fahrer;
}




}