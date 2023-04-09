package com.trabalho.conclusao.doacao.doacao.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

  private Long id;

  @NotEmpty(message = "Ops... Parece que você esqueceu do nome!")
  private String name;

  @NotEmpty(message = "Ops... Parece que você esqueceu o Email!")
  @Email(message = "Ops... Este não parece um Email válido!")
  private String email;

  @NotEmpty(message = "Ops... Não esqueça de informar uma senha!")
  private String password;

  private String phone;

  private String gender;

  private String birth;

  private String role;
}
