package com.jramun.websocket;

import com.jramun.websocket.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("/send/message")
    @SendTo("/listening/message")
    public Message greeting(String content) throws Exception {
        Thread.sleep(1000); // simulated delay
        System.out.println(content);
        return new Message(content);
    }


}
