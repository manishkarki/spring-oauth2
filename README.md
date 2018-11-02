Elasticsearch - Logstash - Kibana with Spring boot oauth2
=========================

Building the ELK
---------------------
Building the Containers
----------------------
    $ docker-compose build 

Running Containers with the docker-compose
---------------------
To run these containers:

    $ docker-compose up
    
Consuming Rest Service
---------------------
To consume SpringBoot app user service:

    $ curl http://localhost:8087/user/{userid}
    
To view generated logs on Kibana UI: [http://localhost:5601](http://localhost:5601)