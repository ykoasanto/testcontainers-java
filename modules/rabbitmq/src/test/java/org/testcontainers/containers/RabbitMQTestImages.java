package org.testcontainers.containers;

import org.testcontainers.utility.DockerImageName;

public interface RabbitMQTestImages {
    DockerImageName RABBITMQ_IMAGE = new DockerImageName("rabbitmq:3.7.25-management-alpine");
}
