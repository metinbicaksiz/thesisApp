package com.bicaksiz.apigateway.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Component
public class JwtUtil {


    public static final String SECRET = "cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e";

    public JwtUtil() throws NoSuchAlgorithmException {
    }


    public boolean validateToken(final String token) {
        Jwts.parserBuilder().setSigningKey(getSignKey()).build().parseClaimsJws(token);
        return true;
    }

    public String getRole(String token){
        return Jwts.parserBuilder().setSigningKey(getSignKey())
                .build()
                .parseClaimsJws(token)
                .getBody().getIssuer();
    }

    MessageDigest md = MessageDigest.getInstance("SHA3-512");

    private SecretKey getSignKey() {
        byte[] keyBytes = md.digest(SECRET.getBytes());
//        byte[] keyBytes = Decoders.BASE64URL.decode(secretKey);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
