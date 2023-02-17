Wiki Project 


*general configuration 

-set bootstrap on localhost:9092 
-set up Serializer/Deselializer 
-set up kafka.topic_name 

*CONFIG

-set up topic builder 


*DB 



*Consumer 

-set up db connections in application.properties 
-set up repository 
-set up Entity 


in consume(String eventMessage):  

-set up KafkaListener for(topic, groupId) 
-set Eventmessage --> then save this data in DB by repository 




 *PRODUCER

CHANGE-HANDLER
-set up EventHAndler (implements EventHandler) 
-- onMessage(msg, msgEvent) will send kafkaTemplate.send(topic, msgEvent.get()) 


CHANGE-PRODUCER
-inject CHANGE-HANDLER, API url, and then build EventSource with them 
-eventSource.start() 

<TimeUnit.MINUTES.sleep(10) - will sleep after 10 mins 



*MAIN

injectChangesProducer.sendMessage() and run it 










