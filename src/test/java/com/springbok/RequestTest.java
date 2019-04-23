package com.springbok;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest
public class RequestTest {

    @LocalServerPort
    private int port = 8083;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {

        try {
            String output = this.restTemplate.getForObject("http://localhost:" + port + "/",
                    String.class);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }


    }
}