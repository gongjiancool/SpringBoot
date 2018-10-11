package com.example.demo.Controller;

import com.example.demo.config.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
@RequestMapping()
public class WebSocketController {
    //推送数据接口
    @RequestMapping(value = "/socket/push")
    public String pushMsg(HttpServletRequest request) {
        String message = request.getParameter("text");
        try {
            WebSocketServer.sendInfo(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "server";
    }
}