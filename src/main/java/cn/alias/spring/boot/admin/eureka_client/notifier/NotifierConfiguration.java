package cn.alias.spring.boot.admin.eureka_client.notifier;

import de.codecentric.boot.admin.server.notify.Notifier;
import de.codecentric.boot.admin.server.notify.RemindingNotifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class NotifierConfiguration {
    @Autowired
    private Notifier notifier;

}
