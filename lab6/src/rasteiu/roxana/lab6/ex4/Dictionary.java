package rasteiu.roxana.lab6.ex4;

import java.util.HashMap;

public class Dictionary {
    HashMap map=new HashMap();
    Word w;
    Definition d;
    public void addWord(Word w, Definition d){
        if(map.containsKey(w))
            System.out.println("Modific cuvant existent!");
        else
            System.out.println("Adauga cuvant nou.");
        map.put(w, d);
    }
    public Definition getDefinition(Word w){
       return (Definition) map.get(w);
    }
    public void getAllWords(){
        map.forEach((key,value)->System.out.println(key));
    }
    public void getAllDefinitions(){

        map.forEach((key,value)->System.out.println(value));
    }
}
