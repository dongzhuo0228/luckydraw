package com.example.luckydraw;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@RestController
@RequestMapping("/api")
public class WeiXinController {

    @RequestMapping("/token")
    public void val(String signature, String nonce, String timestamp, String echostr, HttpServletResponse response) throws Exception{
        System.err.println("进入方法"+signature+"      "+nonce+"       "+timestamp+"        "+echostr);
        PrintWriter out = response.getWriter();
        if (SignUtil.checkSignature(signature, timestamp, nonce)) {
            out.print(echostr);
        }
    }



}
