Elasticsearch - Logstash - Kibana with Spring boot oauth2
=========================
First, build the containers using service docker compose as::
    $ docker-compose build 

Running Containers with the docker-compose
---------------------
Now run these built containers:

    $ docker-compose up
    
Consuming Rest Service
---------------------
To consume SpringBoot oauth api:

    $ curl http://localhost:8087/user
    
Logs are now ready to be viewed on Kibana: [http://localhost:5509](http://localhost:5509)