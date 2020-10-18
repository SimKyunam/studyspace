package kr.co.fastcampus.cli.res;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 * Created by mileNote on 2020-10-18
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
@Component
public class ResourceExample implements ResourceLoaderAware {
    private ResourceLoader resourceLoader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void print(){
        System.out.println(resourceLoader);
    }
}
