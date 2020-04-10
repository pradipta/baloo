package com.pradipta.baloo.handler;

import com.pradipta.baloo.entity.instance.Instance;
import com.pradipta.baloo.entity.service.ServiceHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Component
public class CommandHandler {
    @Autowired
    private ServiceHandler serviceHandler;
    public List<Instance> processCheckRequest(HttpServletRequest request) throws Exception {
        String username = request.getParameterMap().get("user_name") [0];
        String channel = request.getParameterMap().get("channel_name")[0];
        String service = null;
        String[] textArray = request.getParameterMap().get("text");
        if (textArray.length==0) {
            throw new Exception("Must pass service name");
        }
        service = textArray[0];
        return serviceHandler.checkWithParanms(service);
    }
}
