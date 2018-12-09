package cn.ok.demos.nacosdemo.web;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * File Header
 * PROJECT_NAME: nacos-demo
 * PACKAGE_NAME: cn.ok.demos.nacosdemo.web
 *
 * @author Kyou
 * @date 2018/12/7 23:13
 */
@Data
@RestController
public class DemoController {

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @GetMapping("/nacos")
    public boolean doTest() {

        return useLocalCache;
    }
}
