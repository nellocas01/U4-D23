package com.example.u4d23.auth.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationSuccessfullPayload {
	private String accessToken;
}