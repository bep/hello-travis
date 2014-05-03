package com.bepsays.travis.support;

import com.bepsays.travis.TravisConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TravisConfig.class)
@WebAppConfiguration
@IntegrationTest("server.port=0")
public class HelloTravisTests {

    @Value("${local.server.port}")
    private int port;

    @Test
    public void index() throws Exception {
        ResponseEntity<String> entity = new TestRestTemplate().getForEntity(
                "http://localhost:" + this.port, String.class);

        assertThat(entity.getStatusCode(), is(HttpStatus.OK));
        assertThat(entity.getBody(), is("Hey, Travis!"));
     }
}