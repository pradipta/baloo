package com.pradipta.baloo;

import com.pradipta.baloo.entity.instance.Instance;
import com.pradipta.baloo.handler.CommandHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class CommandController {
    @Autowired
    private CommandHandler commandHandler;

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public List<Instance> receiveCommand(HttpServletRequest request) throws Exception {
        return commandHandler.processCheckRequest(request);
    }
}
