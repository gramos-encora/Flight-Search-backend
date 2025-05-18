FROM openjdk:17-slim

# Habilita instalación de paquetes necesarios
RUN apt-get update && apt-get install -y \
    ca-certificates \
    curl \
    openssl \
    gnupg \
    --no-install-recommends

# Crea directorio de trabajo
WORKDIR /my-project

# Copia tu certificado Zscaler (en formato .pem o .crt)
COPY trusted_certs.pem /usr/local/share/ca-certificates/zscaler.crt

# Agrega el certificado al sistema y al truststore de Java
RUN update-ca-certificates && \
    keytool -importcert -noprompt \
        -trustcacerts \
        -alias zscaler \
        -file /usr/local/share/ca-certificates/zscaler.crt \
        -keystore $JAVA_HOME/lib/security/cacerts \
        -storepass changeit

# Copia el JAR generado
COPY build/libs/flight-search-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto de la app
EXPOSE 8080

# Ejecuta la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
