package com.inn.cafe.JWT;

//import com.google.common.base.Function;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class JwtUtil {

    private String secret = "Virus1738%";

    public <T> T extractClaims(String token, Function<Claims, T> claimsResolver){
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    public Claims extractAllClaims(String token){
//        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        return null;
    }

}
