package com.trabalho.conclusao.doacao.doacao.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {

  @JsonProperty("user_name")
  private String name;

  @JsonProperty("user_email")
  private String email;

  @JsonProperty("user_phone")
  private String phone;

  @JsonProperty("user_gender")
  private String gender;

  @JsonProperty("user_birth")
  private String birth;

  @JsonProperty("access_token")
  private String accessToken;

  @JsonProperty("refresh_token")
  private String refreshToken;

}
