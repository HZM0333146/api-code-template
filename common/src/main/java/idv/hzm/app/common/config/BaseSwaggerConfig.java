package idv.hzm.app.common.config;

//import java.lang.reflect.Field;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.BeanPostProcessor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.servlet.mvc.method.RequestMappingInfoHandlerMapping;
//import org.springframework.util.ReflectionUtils;
//
//import idv.hzm.app.common.domain.SwaggerProperties;
//import idv.hzm.app.common.log.WebLogAspect;
//import io.swagger.v3.oas.annotations.Operation;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.ApiKey;
//import springfox.documentation.service.AuthorizationScope;
//import springfox.documentation.service.SecurityReference;
//import springfox.documentation.service.SecurityScheme;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spi.service.contexts.SecurityContext;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.spring.web.plugins.WebFluxRequestHandlerProvider;
//import springfox.documentation.spring.web.plugins.WebMvcRequestHandlerProvider;
//import springfox.documentation.service.Contact;


/**
 * Swagger basic configuration.
 */
public abstract class BaseSwaggerConfig {
  
//  @Bean
//  public Docket createRestApi() {
//    SwaggerProperties swaggerProperties = swaggerProperties();
//    Docket docket = new Docket(DocumentationType.OAS_30)
//        .apiInfo(apiInfo(swaggerProperties))
//        .select()
//        .apis(RequestHandlerSelectors.basePackage(swaggerProperties.getApiBasePackage()))
//        .paths(PathSelectors.any())
//        .build();
//
//    if (swaggerProperties.isEnableSecurity()) {
//      docket.securitySchemes(securitySchemes()).securityContexts(securityContexts());
//    }
//    return docket;
//  }
//
//  private ApiInfo apiInfo(SwaggerProperties swaggerProperties) {
//    return new ApiInfoBuilder().title(swaggerProperties.getTitle())
//        .description(swaggerProperties.getDescription())
//        .contact(new Contact(swaggerProperties.getContactName(), swaggerProperties.getContactUrl(),
//            swaggerProperties.getContactEmail()))
//        .version(swaggerProperties.getVersion()).build();
//  }
//
//  private List<SecurityScheme> securitySchemes() {
//    // Set the request header information
//    List<SecurityScheme> result = new ArrayList<>();
//    ApiKey apiKey = new ApiKey("Authorization", "Authorization", "header");
//    result.add(apiKey);
//    return result;
//  }
//
//  private List<SecurityContext> securityContexts() {
//    // Set the path that requires login authentication
//    List<SecurityContext> result = new ArrayList<>();
//    result.add(getContextByPath("/*/.*"));
//    return result;
//  }
//
//  private SecurityContext getContextByPath(String pathRegex) {
//    return SecurityContext.builder().securityReferences(defaultAuth())
//        .forPaths(PathSelectors.regex(pathRegex)).build();
//  }
//
//  private List<SecurityReference> defaultAuth() {
//    List<SecurityReference> result = new ArrayList<>();
//    AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
//    AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
//    authorizationScopes[0] = authorizationScope;
//    result.add(new SecurityReference("Authorization", authorizationScopes));
//    return result;
//  }
//
//  public BeanPostProcessor generateBeanPostProcessor() {
//    return new BeanPostProcessor() {
//
//      @Override
//      public Object postProcessAfterInitialization(Object bean, String beanName)
//          throws BeansException {
//        if (bean instanceof WebMvcRequestHandlerProvider
//            || bean instanceof WebFluxRequestHandlerProvider) {
//          customizeSpringfoxHandlerMappings(getHandlerMappings(bean));
//        }
//        return bean;
//      }
//
//      private <T extends RequestMappingInfoHandlerMapping> void customizeSpringfoxHandlerMappings(
//          List<T> mappings) {
//        List<T> copy = mappings.stream().filter(mapping -> mapping.getPatternParser() == null)
//            .collect(Collectors.toList());
//        mappings.clear();
//        mappings.addAll(copy);
//      }
//
//      @SuppressWarnings("unchecked")
//      private List<RequestMappingInfoHandlerMapping> getHandlerMappings(Object bean) {
//        try {
//          Field field = ReflectionUtils.findField(bean.getClass(), "handlerMappings");
//          field.setAccessible(true);
//          return (List<RequestMappingInfoHandlerMapping>) field.get(bean);
//        } catch (IllegalArgumentException | IllegalAccessException e) {
//          throw new IllegalStateException(e);
//        }
//      }
//    };
//  }
//
//  /**
//   * Custom Swagger configuration
//   */
//  public abstract SwaggerProperties swaggerProperties();
}
