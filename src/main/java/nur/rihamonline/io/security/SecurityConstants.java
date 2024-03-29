package nur.rihamonline.io.security;

public class SecurityConstants {

    public static final String SIGN_UP_URLS_ = "/api/users/**";
    public static final String SIGN_UP_URLS = "/api/**";
    public static final String H2_URL = "h2-console/**";
    public static final String SECRET ="SecretKeyToGenJWTs";
    public static final String TOKEN_PREFIX= "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final long EXPIRATION_TIME = 6000_000; //30 seconds
}
