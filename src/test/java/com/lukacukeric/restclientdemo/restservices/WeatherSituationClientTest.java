package com.lukacukeric.restclientdemo.restservices;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;
import static org.assertj.core.api.Assertions.assertThat;
import com.lukacukeric.restclientdemo.restservices.WeatherSituationClient;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WeatherSituationClientTest {

    private final WeatherSituationClient client;

    public WeatherSituationClientTest(WeatherSituationClient client) {
        this.client = client;
    }

    @Test
    void weHaveContact(){
        assertThat(client.getTemperature("London")).isNotNull();
    }

}
