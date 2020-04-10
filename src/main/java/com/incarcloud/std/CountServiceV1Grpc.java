package com.incarcloud.std;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0-pre2)",
    comments = "Source: HelloM.proto")
public class CountServiceV1Grpc {

  private CountServiceV1Grpc() {}

  public static final String SERVICE_NAME = "com.incarcloud.std.CountServiceV1";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<HelloM.HelloCountArgV1,
      HelloM.HelloCountV1> METHOD_COUNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.incarcloud.std.CountServiceV1", "Count"),
          io.grpc.protobuf.ProtoUtils.marshaller(HelloM.HelloCountArgV1.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(HelloM.HelloCountV1.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CountServiceV1Stub newStub(io.grpc.Channel channel) {
    return new CountServiceV1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CountServiceV1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CountServiceV1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static CountServiceV1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CountServiceV1FutureStub(channel);
  }

  /**
   */
  public static abstract class CountServiceV1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void count(HelloM.HelloCountArgV1 request,
                      io.grpc.stub.StreamObserver<HelloM.HelloCountV1> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COUNT, responseObserver);
    }

    @Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_COUNT,
            asyncUnaryCall(
              new MethodHandlers<
                HelloM.HelloCountArgV1,
                HelloM.HelloCountV1>(
                  this, METHODID_COUNT)))
          .build();
    }
  }

  /**
   */
  public static final class CountServiceV1Stub extends io.grpc.stub.AbstractStub<CountServiceV1Stub> {
    private CountServiceV1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private CountServiceV1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CountServiceV1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CountServiceV1Stub(channel, callOptions);
    }

    /**
     */
    public void count(HelloM.HelloCountArgV1 request,
                      io.grpc.stub.StreamObserver<HelloM.HelloCountV1> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COUNT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CountServiceV1BlockingStub extends io.grpc.stub.AbstractStub<CountServiceV1BlockingStub> {
    private CountServiceV1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CountServiceV1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CountServiceV1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CountServiceV1BlockingStub(channel, callOptions);
    }

    /**
     */
    public HelloM.HelloCountV1 count(HelloM.HelloCountArgV1 request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COUNT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CountServiceV1FutureStub extends io.grpc.stub.AbstractStub<CountServiceV1FutureStub> {
    private CountServiceV1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CountServiceV1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CountServiceV1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CountServiceV1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<HelloM.HelloCountV1> count(
        HelloM.HelloCountArgV1 request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COUNT, getCallOptions()), request);
    }
  }

  private static final int METHODID_COUNT = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CountServiceV1ImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(CountServiceV1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COUNT:
          serviceImpl.count((HelloM.HelloCountArgV1) request,
              (io.grpc.stub.StreamObserver<HelloM.HelloCountV1>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_COUNT);
  }

}
