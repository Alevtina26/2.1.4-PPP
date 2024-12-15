//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {
    private Duck5 duck;

    public Rabbit4() {
    }

    @Autowired
    public void setDuck(Duck5 duck) {
        this.duck = duck;
    }

    public String toString() {
        return ", в зайце утка " + this.duck.toString();
    }
}
