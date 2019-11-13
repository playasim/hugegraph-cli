package com.wayz.ai;

import com.google.common.io.CharStreams;
import com.wayz.ai.config.Printer;
import org.apache.commons.io.Charsets;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class FileRead {
    public static void main(String[] args) throws IOException {
        InputStream in = FileRead.class.getClassLoader().getResourceAsStream("alice.txt");
        List<String> result = CharStreams.readLines(new InputStreamReader(in, Charsets.UTF_8));
        Printer.printList(result);
    }
}
