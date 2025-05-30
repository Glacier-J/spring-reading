package com.xcs.spring;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;

import java.io.InputStream;
import java.util.Arrays;

/**
 * @author xcs
 * @date 2023年10月30日 11时29分
 **/
public class ByteArrayResourceDemo {
    public static void main(String[] args) throws Exception {
        String classPaths = System.getProperty("java.class.path");
        Arrays.stream(classPaths.split(";")).forEach(System.out::println);

        byte[] data = "hello world".getBytes();
        Resource resource = new ByteArrayResource(data);
        try (InputStream is = resource.getInputStream()) {
            // 读取和处理资源内容
            System.out.println(new String(is.readAllBytes()));
        }
    }
}
