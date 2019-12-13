package spi;

import java.util.ServiceLoader;

public class SPIApplication {

    public static void main(String[] args) {
        ServiceLoader<IService> services = ServiceLoader.load(IService.class);
        for(IService service:services){
            service.sayYourName();
        }
    }
}
