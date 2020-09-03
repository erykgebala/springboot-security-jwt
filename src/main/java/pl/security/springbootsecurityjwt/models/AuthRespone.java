package pl.security.springbootsecurityjwt.models;

public class AuthRespone {

    private final String jwt;

    public AuthRespone(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
