FROM jboss/wildfly:18.0.0.Final

COPY build/libs/microprofile-poc.war /opt/jboss/wildfly/standalone/deployments/microprofile-poc.war
