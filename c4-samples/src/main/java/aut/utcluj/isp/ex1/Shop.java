package aut.utcluj.isp.ex1;

/**
 * @author stefan
 */
public class Shop {
    private String name;
    private String city;

    public Shop(String name, String city) {
        this.name=name;
        this.city=city;
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    public Shop(String name) {
        this.city = "";
        this.name=name;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean equals(Object obj){
        if(obj instanceof Shop){
            Shop p=(Shop)obj;
            return (name==p.name);
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String toString()
    {
        return "Shop: "+ getName()+ " "+"City: "+getCity();
    }
}
