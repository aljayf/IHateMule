package emd.edifact.model.elements.composites;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class TestComposite extends Composite{

    private String country1;
    private String country2;
    private String country3;

    public TestComposite(String country1, String country2, String country3) {
        this.country1 = country1;
        this.country2 = country2;
        this.country3 = country3;
    }

    public TestComposite(String input){
        super(input);
    }
}
