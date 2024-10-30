plugins {
	java
	id("org.springframework.boot") version "3.1.0"
	id("io.spring.dependency-management") version "1.1.0"
}

group = "com.maybeCRM"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	// Spring Boot Starter Web
	implementation("org.springframework.boot:spring-boot-starter-web")

	// Spring Data JPA
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")

	// Spring Security
	implementation("org.springframework.boot:spring-boot-starter-security")

	// Thymeleaf
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")

	// Validation
	implementation("org.springframework.boot:spring-boot-starter-validation")

	// Драйвер базы данных (например, PostgreSQL)
	implementation("org.postgresql:postgresql")

	// DevTools (для автоперезагрузки приложения при изменении в коде)
	developmentOnly("org.springframework.boot:spring-boot-devtools")

	// Actuator (Мониторинг состояния приложения, сбор метрик, управление приложением,
	// аудит событий, упрвление сессиями)
	implementation("org.springframework.boot:spring-boot-starter-actuator")

	// Тестовые зависимости
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.boot:spring-boot-testcontainers")
	testImplementation("org.springframework.security:spring-security-test")
	testImplementation("org.testcontainers:junit-jupiter")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")

	// Lombok
	implementation("org.projectlombok:lombok:1.18.24")
	annotationProcessor("org.projectlombok:lombok:1.18.24")
}

tasks.withType<Test> {
	useJUnitPlatform()
}