package cardoso.tv.consumerapi.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class StrConsumerListener {

    @KafkaListener(groupId = "group-test", topics = "quiz-ai", containerFactory = "strConsumerFactory")
    public void listener(String message) {
        log.info("Message received: {}", message);
    }

}
