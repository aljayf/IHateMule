package emd.edifact.model.elements.composites;

import emd.edifact.model.segments.Segment;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public abstract class Composite implements CompositeInterface{
    private static final String COMPOSITE_SEPARATOR = ":";

    public Composite(){}

    public Composite(String input) {
        String[] components = input.split(COMPOSITE_SEPARATOR);
        Field[] fields = getFields();

        try {
            for (int i = 0; i < fields.length; i++) {
                fields[i].setAccessible(true);
                if (components[i] != null && !components[i].isEmpty()) {
                    fields[i].set(this, components[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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


    public static <T> T createInstance(Class<? extends T> clazz, String input) {
        T obj = null;
        try {
            // Get the constructor of the specified class that takes a single String argument
            Constructor<?> constructor = clazz.getDeclaredConstructor(String.class);
            // Create a new instance of the specified class using the constructor and the input string
            obj = clazz.cast(constructor.newInstance(input));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
