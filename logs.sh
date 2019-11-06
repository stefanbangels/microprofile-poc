#!/bin/sh
docker exec -ti microprofile-poc tail -f /opt/jboss/wildfly/standalone/log/server.log
