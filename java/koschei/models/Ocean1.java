//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {
    @Autowired
    private Island2 island;

    public Ocean1() {
    }

    public String toString() {
        return "на океане остров " + this.island.toString();
    }
}

