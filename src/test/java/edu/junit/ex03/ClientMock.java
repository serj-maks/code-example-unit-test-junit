package edu.junit.ex03;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ClientMock implements Client {

    @Override
    public InputStream getPage(String link) throws IOException {
//        return new ByteArrayInputStream(new byte[] {1});
        return new ByteArrayInputStream("str".getBytes());
    }
}
