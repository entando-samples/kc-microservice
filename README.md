# Springboot Keycloak Entando compatible Microservice Sample

### This is a sample of a Micro Service that can be deployed inside an Entando bundle

The application expose a single rest api protected by Keycloak, you can reach it out using swagger-ui.
There is a single script with the commands to build and push a docker image.

It needs a keycloak instance deployed somewhere, you can use a docker to running it
check https://www.keycloak.org/getting-started/getting-started-docker
e.g. docker run -p 8080:8080 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin quay.io/keycloak/keycloak:15.0.2

Before build it you need to change the CHANGE-IT placeholders (search them)

## Notes:
To Build and push the Docker image:
./prepareDockerImage.sh

Actuator enabled by default:
http://127.0.0.1:8081/actuator/health

Swagger:
http://127.0.0.1:8081/swagger-ui.html

Currently if you want to create a MS compatible with the entando platform (so deployable in a bundle) you need:
1. build it as a docker image
2. expose the apis on the 8081 port
3. have a health check endpoint exposed on port 8081 responding 200, with an application/json content type if everything is ok 


