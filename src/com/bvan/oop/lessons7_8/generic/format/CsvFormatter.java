package com.bvan.oop.lessons7_8.generic.format;

import java.util.List;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class CsvFormatter<T extends Formattable> implements Formatter<T> {

    private final String delimiter;

    public CsvFormatter(String delimiter) {
        this.delimiter = delimiter;
    }

    public CsvFormatter(char c) {
        this(String.valueOf(c));
    }

    public CsvFormatter() {
        this(";");
    }

    @Override
    public String format(T formattable) {
        List<String> values = formattable.getValues();
        StringJoiner joiner = new StringJoiner(delimiter);
        for (String value : values) {
            joiner.add(value);
        }
        return joiner.toString();
    }
}
