package com.xcs.spring;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * @author xcs
 * @date 2023年10月30日 17时30分
 **/
public class PathMatchingResourcePatternResolverDemo {
    public static void main(String[] args) throws Exception {
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        // 加载所有匹配的类路径资源
        Resource[] resources = resolver.getResources("classpath*:*.properties");
        for (Resource resource : resources) {
            System.out.println("Classpath = " + resource.getFilename());
        }

        // 加载文件系统中的所有匹配资源
        String locationPattern = "file:C:/Users/Admin/IdeaProjects/clone/spring-reading/spring-resources/spring-resource-resourceLoader/*.txt";
        Resource[] fileResources = resolver.getResources(locationPattern);
        System.out.println(fileResources.length);
        for (Resource resource : fileResources) {
            System.out.println("File = " + resource.getFilename());
        }
    }
}
