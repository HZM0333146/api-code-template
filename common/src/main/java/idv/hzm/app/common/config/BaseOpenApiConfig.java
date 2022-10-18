package idv.hzm.app.common.config;

import org.springframework.context.annotation.Bean;
import idv.hzm.app.common.domain.OpenApiProperties;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

public abstract class BaseOpenApiConfig {

  @Bean
  public OpenAPI springShopOpenAPI() {
    OpenApiProperties openApiProperties = openApiProperties();
    return new OpenAPI().info(info(openApiProperties))
        .externalDocs(externalDocumentation(openApiProperties));
  }

  private ExternalDocumentation externalDocumentation(OpenApiProperties openApiProperties) {
    return new ExternalDocumentation()
        .description(openApiProperties.getExternalDocumentationDescription())
        .url(openApiProperties.getExternalDocumentationUrl());
  }

  private Info info(OpenApiProperties openApiProperties) {
    return new Info().title(openApiProperties.getTitle())
        .description(openApiProperties.getDescription()).version(openApiProperties.getVersion())
        .license(license(openApiProperties));
  }

  private License license(OpenApiProperties openApiProperties) {
    return new License().name(openApiProperties.getLicenseName())
        .url(openApiProperties.getLicenseUrl());
  }

  /**
   * Custom OpenApi configuration
   */
  public abstract OpenApiProperties openApiProperties();
}
