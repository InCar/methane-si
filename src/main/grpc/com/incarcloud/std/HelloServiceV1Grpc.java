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
    comments = "Source: HelloP.proto")
public class HelloServiceV1Grpc {

  private HelloServiceV1Grpc() {}

  public static final String SERVICE_NAME = "com.incarcloud.std.HelloServiceV1";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.incarcloud.std.HelloV.HelloRequestV1,
      com.incarcloud.std.HelloV.HelloResponseV1> METHOD_HELLO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.incarcloud.std.HelloServiceV1", "hello"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.incarcloud.std.HelloV.HelloRequestV1.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.incarcloud.std.HelloV.HelloResponseV1.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceV1Stub newStub(io.grpc.Channel channel) {
    return new HelloServiceV1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceV1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloServiceV1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceV1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloServiceV1FutureStub(channel);
  }

  /**
   */
  public static abstract class HelloServiceV1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void hello(com.incarcloud.std.HelloV.HelloRequestV1 request,
        io.grpc.stub.StreamObserver<com.incarcloud.std.HelloV.HelloResponseV1> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HELLO, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_HELLO,
            asyncUnaryCall(
              new MethodHandlers<
                com.incarcloud.std.HelloV.HelloRequestV1,
                com.incarcloud.std.HelloV.HelloResponseV1>(
                  this, METHODID_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class HelloServiceV1Stub extends io.grpc.stub.AbstractStub<HelloServiceV1Stub> {
    private HelloServiceV1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceV1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceV1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceV1Stub(channel, callOptions);
    }

    /**
     */
    public void hello(com.incarcloud.std.HelloV.HelloRequestV1 request,
        io.grpc.stub.StreamObserver<com.incarcloud.std.HelloV.HelloResponseV1> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HELLO, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HelloServiceV1BlockingStub extends io.grpc.stub.AbstractStub<HelloServiceV1BlockingStub> {
    private HelloServiceV1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceV1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceV1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceV1BlockingStub(channel, callOptions);
    }

    /**
     */
    public com.incarcloud.std.HelloV.HelloResponseV1 hello(com.incarcloud.std.HelloV.HelloRequestV1 request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HELLO, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloServiceV1FutureStub extends io.grpc.stub.AbstractStub<HelloServiceV1FutureStub> {
    private HelloServiceV1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceV1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceV1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceV1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.incarcloud.std.HelloV.HelloResponseV1> hello(
        com.incarcloud.std.HelloV.HelloRequestV1 request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HELLO, getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloServiceV1ImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(HelloServiceV1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((com.incarcloud.std.HelloV.HelloRequestV1) request,
              (io.grpc.stub.StreamObserver<com.incarcloud.std.HelloV.HelloResponseV1>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
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
        METHOD_HELLO);
  }

}
