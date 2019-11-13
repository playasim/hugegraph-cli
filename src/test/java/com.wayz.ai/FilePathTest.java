package com.wayz.ai;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class FilePathTest {


    @Test
    public void fileReadTest() throws IOException {

        InputStream in = this.getClass().getClassLoader().getResourceAsStream("alice.txt");

    }
}
