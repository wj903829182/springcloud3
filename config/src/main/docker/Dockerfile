FROM hub.c.163.com/library/java:latest
MAINTAINER  jack
VOLUME /tmp
RUN mkdir /app
ADD config.jar /app/app.jar
ADD runboot.sh /app/
RUN bash -c 'touch /app/app.jar'
WORKDIR /app
RUN chmod a+x runboot.sh
EXPOSE 8888
CMD /app/runboot.sh