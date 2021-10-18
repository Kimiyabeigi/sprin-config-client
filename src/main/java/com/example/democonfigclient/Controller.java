package com.example.democonfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Controller {

  @Value(("${secretkey}"))
  private String secretKey;
  @Autowired
  private SignatureConfig signatureConfig;


  @RequestMapping("/")
  public String getValue() {
    // refresh();
    return signatureConfig.getClients().get(0).getIp();
  }
}
