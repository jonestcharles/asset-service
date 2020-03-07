A basic REST service, supporting a GET response with a POJO, deployed with Docker.

To run:
Build with "mvn clean package docker:build" from the root directory

Run with "docker-compose -f docker/common/docker-compose.yml up"

To shutdown:
Ctrl+c from terminal