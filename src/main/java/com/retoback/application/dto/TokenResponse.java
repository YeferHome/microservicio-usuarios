package com.retoback.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TokenResponse (
    @JsonProperty("acces_token")
    String accessToken,
    @JsonProperty("refresh_token")
    String refreshToken
){}
