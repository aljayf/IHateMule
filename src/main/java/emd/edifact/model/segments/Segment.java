package emd.edifact.model.segments;

import emd.edifact.model.elements.composites.Composite;

import java.lang.reflect.Field;

public class Segment {

    private static final String ELEMENT_SEPARATOR = "\\+";

    public Segment(String input) {
        String[] components = input.split(ELEMENT_SEPARATOR);
        Field[] fields = getFields();

        try {
            for (int i = 0; i < fields.length; i++) {
                fields[i].setAccessible(true);
                Class<?> fieldType = fields[i].getType();
                if (Composite.class.isAssignableFrom(fieldType)) {
                    // Create an instance of the appropriate Composite class using reflection
                    Composite composite = (Composite) Composite.createInstance(fieldType, components[i]);
                    fields[i].set(this, composite);
                } else {
                    fields[i].set(this, components[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        try {
//            for (int i = 0; i < fields.length; i++) {
//                fields[i].setAccessible(true);
//                fields[i].set(this, components[i]);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public Field[] getFields() {
        // Get all fields of the class using reflection
        Field[] fields = this.getClass().getDeclaredFields();

        // Store the fields in an array
        Object[] fieldValues = new Object[fields.length];
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            try {
                fieldValues[i] = fields[i].get(this);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return fields;
    }


}
