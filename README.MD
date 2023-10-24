In this project, DeliveryBoy acts as the producer at the designated production location, generating an additional 100,000 messages,
while consumeMessage serves as the consumer, responsible for consuming and displaying these messages.


Apache Kafka is a communication system which allows different parts of the system or 2/more microservices to communicate or transfer data using the producer & consumer architecture model.

Zookeper handles the state of kafka cluster.
Kafka cluster is used to store data.
Kafka brooker is the server in which data is categorized based on topic and stored using partition and offsets as the index on partition.

Steps to perform actions on CMD (Windows):

1. Start the zookeeper-server:

bin\windows\zookeeper-server-start.bat config\zookeeper.properties

2. Start the kafka server:

bin\windows\kafka-server-start.bat config\server.properties

3. Creating a topic (kafka-topic)

bin\kafka-topics.bat --create --topic <topic-name> --bootstrap-server localhost:<port>; (port:9092)

4. Producing message (Producer) (kafka-console-producer)

bin\windows\kafka-console-producer.bat --topic <topic-name> --bootstrap-server localhost:<port>; (port:9092)

5. Consuming message (Consumer) (kafka-console-consumer)

bin\windows\kafka-console-consumer.bat --topic <topic-name> --from-beginning --bootstrap-server localhost:<port>; (port:9092)


![KafkaEcosystem](https://github.com/omarbaig007212/Apache-Kafka-Demo/assets/58821151/a255d9aa-f054-45ef-9703-337ea2a09972)
