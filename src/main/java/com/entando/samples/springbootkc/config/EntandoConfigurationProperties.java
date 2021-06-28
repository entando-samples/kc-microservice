package com.entando.samples.springbootkc.config;

import lombok.Data;
import lombok.ToString;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "entando")
@Data
@Slf4j
@ToString
public class EntandoConfigurationProperties implements InitializingBean {

    private Map<String, String> spring;
    private Map<String, String> keycloak;

    @Override
    public void afterPropertiesSet() throws Exception {
        log.debug("ENTANDO CONFIGURATION \n************************\n{}\n************************\n",this.toString());
    }
}
