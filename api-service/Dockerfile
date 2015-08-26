FROM ubuntu:latest
ENV DEBIAN_FRONTEND noninteractive

RUN apt-get update
RUN apt-get install software-properties-common -y
RUN add-apt-repository ppa:webupd8team/java -y
RUN apt-get update
RUN echo debconf shared/accepted-oracle-license-v1-1 select true | debconf-set-selections
RUN apt-get install oracle-java8-installer -y
RUN apt-get install oracle-java8-set-default

EXPOSE 8080

ADD /build/libs/com.guillaume.bees.api-0.0.1-SNAPSHOT.jar /com.guillaume.bees.api-0.0.1-SNAPSHOT.jar
RUN java -jar /com.guillaume.bees.api-0.0.1-SNAPSHOT.jar