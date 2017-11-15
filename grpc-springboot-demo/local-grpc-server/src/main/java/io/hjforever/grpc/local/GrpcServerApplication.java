package io.hjforever.grpc.local;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * User: Michael
 * Email: yidongnan@gmail.com
 * Date: 2016/11/8
 */
@SpringBootApplication
public class GrpcServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcServerApplication.class, args);
    }
}
