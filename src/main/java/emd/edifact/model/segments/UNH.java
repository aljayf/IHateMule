package emd.edifact.model.segments;

import emd.edifact.model.elements.composites.TestComposite;

public class UNH extends Segment{
    private TestComposite element1;
    private String element2;


    public UNH(String input) {
        super(input);
    }

    public static void main(String[] args) {
        String input = "US::US+50138";
        UNH unh = new UNH(input);
        System.out.println("done");
    }
}
