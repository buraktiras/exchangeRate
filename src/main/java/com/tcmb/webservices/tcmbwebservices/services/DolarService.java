package com.tcmb.webservices.tcmbwebservices.services;

import com.tcmb.webservices.tcmbwebservices.resttemplate.TcmbCommon;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
@Component
@PropertySource("classpath:application.properties")
public class DolarService {

    private @NonNull TcmbCommon tcmbCommon;

    public String getDolar(){

        RestTemplate rest = new RestTemplate();
        String data = rest.getForObject(tcmbCommon.getDolarUrl(), String.class);

        return data;
    }
}
