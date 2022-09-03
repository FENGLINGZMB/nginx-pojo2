package com.example.nginxpojo2.service;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.grpc.examples.helloworld.DogServiceGrpc;
import io.grpc.examples.helloworld.GetDogRequest;
import io.grpc.examples.helloworld.GetDogResponse;


/**
 * @author fenglingzmb
 * @date 2022/9/4
 */
public class GrpcDogService {
    private static final Logger logger = Logger.getLogger(GrpcDogService.class.getName());

    private final DogServiceGrpc.DogServiceBlockingStub blockingStub;

    /**
     * Construct client for accessing HelloWorld server using the existing channel.
     */
    public GrpcDogService(Channel channel) {
        blockingStub = DogServiceGrpc.newBlockingStub(channel);
    }

    /**
     * Say hello to server.
     */
    public void greet() {
        GetDogRequest request = GetDogRequest.newBuilder().build();
        GetDogResponse response;
        try {
            response = blockingStub.getDog(request);
            System.out.println(response.getAge());
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
    }

    /**
     * Greet server. If provided, the first element of {@code args} is the name to use in the
     * greeting. The second argument is the target server.
     */
    public static void main(String[] args) throws Exception {
        String user = "world";
        // Access a service running on the local machine on port 50051
        String target = "localhost:6666";
        if (args.length > 0) {
            user = args[0];
        }
        if (args.length > 1) {
            target = args[1];
        }
        ManagedChannel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();
        try {
            GrpcDogService client = new GrpcDogService(channel);
            client.greet();
        } finally {
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }
}
