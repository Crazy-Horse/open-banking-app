package com.sygmatech.example.betterbanking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableCaching
public class BetterBankingApplication {

    //public static final String REGISTRATION_ID = "my-client";

    private static final Logger log = LoggerFactory.getLogger(BetterBankingApplication.class);

    @Value("${io.betterbanking.integration.url-base}")
    private String baseUrl;

    public static void main(String[] args) {
        SpringApplication.run(BetterBankingApplication.class, args);
    }

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl(baseUrl)
                .build();
    }

//    @Bean
//    public ReactiveRedisConnectionFactory lettuceConnectionFactory() {
//
//        LettuceClientConfiguration clientConfig = LettuceClientConfiguration.builder()
//                .useSsl().and()
//                .commandTimeout(Duration.ofSeconds(2))
//                .shutdownTimeout(Duration.ZERO)
//                .build();
//
//        return new LettuceConnectionFactory(new RedisStandaloneConfiguration("localhost", 6379));
//    }

//    @Bean
//    WebClient webClient(WebClient.Builder webClientBuilder, OAuth2AuthorizedClientManager authorizedClientManager,
//                        @Qualifier("resourceServerAuthorizationFailureHandler") OAuth2AuthorizationFailureHandler failureHandler) {
//        ServletOAuth2AuthorizedClientExchangeFilterFunction oauth2Client = new ServletOAuth2AuthorizedClientExchangeFilterFunction(
//                authorizedClientManager);
//        oauth2Client.setAuthorizationFailureHandler(failureHandler);
//        // @formatter:off
//        return webClientBuilder
//                .apply(oauth2Client.oauth2Configuration())
//                .baseUrl(baseUrl)
//                .build();
//        // @formatter:on
//    }
//
//    @Bean("resourceServerAuthorizationFailureHandler")
//    OAuth2AuthorizationFailureHandler resourceServerAuthorizationFailureHandler(
//            OAuth2AuthorizedClientService authorizedClientService) {
//        return new RemoveAuthorizedClientOAuth2AuthorizationFailureHandler(
//                (clientRegistrationId, principal, attributes) -> {
//                    log.info("Resource server authorization failure for clientRegistrationId={}", clientRegistrationId);
//                    authorizedClientService.removeAuthorizedClient(clientRegistrationId, principal.getName());
//                });
//    }
//
//    /**
//     * Since we do not want the client credentials grant request to be tied to specific
//     * HTTP session via the context of a servlet request, we do not use the
//     * DefaultOAuth2AuthorizedClientManager here. Instead we use the
//     * AuthorizedClientServiceOAuth2AuthorizedClientManager which is designed for use
//     * outside of a servlet context and behaves like we would expect for
//     * service-to-service authorization
//     */
//    @Bean
//    OAuth2AuthorizedClientManager authorizedClientManager(ClientRegistrationRepository clientRegistrationRepository,
//                                                          OAuth2AuthorizedClientService oAuth2AuthorizedClientService,
//                                                          OAuth2AccessTokenResponseClient<OAuth2ClientCredentialsGrantRequest> tokenResponseClient,
//                                                          @Qualifier("authorizationServerAuthorizationSuccessHandler") OAuth2AuthorizationSuccessHandler authorizationSuccessHandler,
//                                                          @Qualifier("authorizationServerAuthorizationFailureHandler") OAuth2AuthorizationFailureHandler authorizationFailureHandler) {
//        OAuth2AuthorizedClientProvider authorizedClientProvider = OAuth2AuthorizedClientProviderBuilder.builder()
//                .clientCredentials(r -> r.accessTokenResponseClient(tokenResponseClient)).clientCredentials().build();
//        var authorizedClientManager = new AuthorizedClientServiceOAuth2AuthorizedClientManager(
//                clientRegistrationRepository, oAuth2AuthorizedClientService);
//        authorizedClientManager.setAuthorizedClientProvider(authorizedClientProvider);
//        authorizedClientManager.setAuthorizationSuccessHandler(authorizationSuccessHandler);
//        authorizedClientManager.setAuthorizationFailureHandler(authorizationFailureHandler);
//        return authorizedClientManager;
//    }
//
//    @Bean("authorizationServerAuthorizationSuccessHandler")
//    OAuth2AuthorizationSuccessHandler authorizationSuccessHandler(
//            OAuth2AuthorizedClientService authorizedClientService) {
//        // Do not convert to lambda; We can't @SpyBean a lambda for integration testing
//        return new OAuth2AuthorizationSuccessHandler() {
//            @Override
//            public void onAuthorizationSuccess(OAuth2AuthorizedClient authorizedClient, Authentication principal,
//                                               Map<String, Object> attributes) {
//                log.info("Authorization successful for clientRegistrationId={}, tokenUri={}",
//                        authorizedClient.getClientRegistration().getRegistrationId(),
//                        authorizedClient.getClientRegistration().getProviderDetails().getTokenUri());
//                authorizedClientService.saveAuthorizedClient(authorizedClient, principal);
//            }
//        };
//    }
//
//    @Bean("authorizationServerAuthorizationFailureHandler")
//    OAuth2AuthorizationFailureHandler authorizationFailureHandler(
//            OAuth2AuthorizedClientService authorizedClientService) {
//        return new RemoveAuthorizedClientOAuth2AuthorizationFailureHandler(
//                (clientRegistrationId, principal, attributes) -> {
//                    log.info("Authorization failed for clientRegistrationId={}", clientRegistrationId);
//                    authorizedClientService.removeAuthorizedClient(clientRegistrationId, principal.getName());
//                });
//    }
//
//    @Bean
//    OAuth2AccessTokenResponseClient<OAuth2ClientCredentialsGrantRequest> tokenResponseClient() {
//        return new DefaultClientCredentialsTokenResponseClient();
//    }
}
