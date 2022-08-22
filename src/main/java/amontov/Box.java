package amontov;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{
   private List<T> box;

    public Box() {
        box = new ArrayList<>();
    }
    public void setFruit(T fruit){
        box.add(fruit);
    }

    
    private boolean checkBox () {
        return box.size() == 0;
    }
    private Fruit checkBoxForType () {
        return box.get(0);
    }
}
