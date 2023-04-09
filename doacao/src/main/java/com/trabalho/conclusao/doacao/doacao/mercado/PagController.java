package com.trabalho.conclusao.doacao.doacao.mercado;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pag")
public class PagController {

  @GetMapping
  public ResponseEntity<String> sayHello() {
    return ResponseEntity.ok("criar api pag ");
  }

}
