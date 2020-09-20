package com.tcmb.webservices.tcmbwebservices.resttemplate;
import org.springframework.beans.factory.annotation.Value;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class TcmbCommon {

    @Value("${tcmb.request.dolar}")
    public String dolarUrl;

    }

