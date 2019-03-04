# kafka-springboot

#Create topic
./bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic my-replicated-topic

#Run zookeeper
sh bin/zookeeper-server-start.sh config/zookeeper.properties

#Run kafka server
sh bin/kafka-server-start.sh config/server.properties

#Create consumer
./bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --from-beginning --topic my-replicated-topic


