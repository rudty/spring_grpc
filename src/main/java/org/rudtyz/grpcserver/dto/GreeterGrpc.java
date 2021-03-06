package org.rudtyz.grpcserver.dto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.31.1)",
    comments = "Source: helloworld.proto")
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "helloworld.Greeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.rudtyz.grpcserver.dto.HelloRequest,
      org.rudtyz.grpcserver.dto.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = org.rudtyz.grpcserver.dto.HelloRequest.class,
      responseType = org.rudtyz.grpcserver.dto.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.rudtyz.grpcserver.dto.HelloRequest,
      org.rudtyz.grpcserver.dto.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<org.rudtyz.grpcserver.dto.HelloRequest, org.rudtyz.grpcserver.dto.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
          GreeterGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<org.rudtyz.grpcserver.dto.HelloRequest, org.rudtyz.grpcserver.dto.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.rudtyz.grpcserver.dto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.rudtyz.grpcserver.dto.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.rudtyz.grpcserver.dto.SampleReply> getGetSampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSample",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.rudtyz.grpcserver.dto.SampleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.rudtyz.grpcserver.dto.SampleReply> getGetSampleMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.rudtyz.grpcserver.dto.SampleReply> getGetSampleMethod;
    if ((getGetSampleMethod = GreeterGrpc.getGetSampleMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getGetSampleMethod = GreeterGrpc.getGetSampleMethod) == null) {
          GreeterGrpc.getGetSampleMethod = getGetSampleMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.rudtyz.grpcserver.dto.SampleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSample"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.rudtyz.grpcserver.dto.SampleReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("GetSample"))
              .build();
        }
      }
    }
    return getGetSampleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.rudtyz.grpcserver.dto.HelloReply> getAsyncThrowExceptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AsyncThrowException",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.rudtyz.grpcserver.dto.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.rudtyz.grpcserver.dto.HelloReply> getAsyncThrowExceptionMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.rudtyz.grpcserver.dto.HelloReply> getAsyncThrowExceptionMethod;
    if ((getAsyncThrowExceptionMethod = GreeterGrpc.getAsyncThrowExceptionMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getAsyncThrowExceptionMethod = GreeterGrpc.getAsyncThrowExceptionMethod) == null) {
          GreeterGrpc.getAsyncThrowExceptionMethod = getAsyncThrowExceptionMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.rudtyz.grpcserver.dto.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AsyncThrowException"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.rudtyz.grpcserver.dto.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("AsyncThrowException"))
              .build();
        }
      }
    }
    return getAsyncThrowExceptionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterStub>() {
        @java.lang.Override
        public GreeterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterStub(channel, callOptions);
        }
      };
    return GreeterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub>() {
        @java.lang.Override
        public GreeterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterBlockingStub(channel, callOptions);
        }
      };
    return GreeterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub>() {
        @java.lang.Override
        public GreeterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterFutureStub(channel, callOptions);
        }
      };
    return GreeterFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(org.rudtyz.grpcserver.dto.HelloRequest request,
        io.grpc.stub.StreamObserver<org.rudtyz.grpcserver.dto.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    public void getSample(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.rudtyz.grpcserver.dto.SampleReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSampleMethod(), responseObserver);
    }

    /**
     */
    public void asyncThrowException(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.rudtyz.grpcserver.dto.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAsyncThrowExceptionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.rudtyz.grpcserver.dto.HelloRequest,
                org.rudtyz.grpcserver.dto.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getGetSampleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.rudtyz.grpcserver.dto.SampleReply>(
                  this, METHODID_GET_SAMPLE)))
          .addMethod(
            getAsyncThrowExceptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.rudtyz.grpcserver.dto.HelloReply>(
                  this, METHODID_ASYNC_THROW_EXCEPTION)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractAsyncStub<GreeterStub> {
    private GreeterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(org.rudtyz.grpcserver.dto.HelloRequest request,
        io.grpc.stub.StreamObserver<org.rudtyz.grpcserver.dto.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSample(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.rudtyz.grpcserver.dto.SampleReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSampleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void asyncThrowException(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.rudtyz.grpcserver.dto.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAsyncThrowExceptionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreeterBlockingStub> {
    private GreeterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public org.rudtyz.grpcserver.dto.HelloReply sayHello(org.rudtyz.grpcserver.dto.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.rudtyz.grpcserver.dto.SampleReply getSample(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetSampleMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.rudtyz.grpcserver.dto.HelloReply asyncThrowException(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getAsyncThrowExceptionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractFutureStub<GreeterFutureStub> {
    private GreeterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.rudtyz.grpcserver.dto.HelloReply> sayHello(
        org.rudtyz.grpcserver.dto.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.rudtyz.grpcserver.dto.SampleReply> getSample(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSampleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.rudtyz.grpcserver.dto.HelloReply> asyncThrowException(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getAsyncThrowExceptionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_GET_SAMPLE = 1;
  private static final int METHODID_ASYNC_THROW_EXCEPTION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((org.rudtyz.grpcserver.dto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<org.rudtyz.grpcserver.dto.HelloReply>) responseObserver);
          break;
        case METHODID_GET_SAMPLE:
          serviceImpl.getSample((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.rudtyz.grpcserver.dto.SampleReply>) responseObserver);
          break;
        case METHODID_ASYNC_THROW_EXCEPTION:
          serviceImpl.asyncThrowException((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.rudtyz.grpcserver.dto.HelloReply>) responseObserver);
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

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.rudtyz.grpcserver.dto.Helloworld.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getGetSampleMethod())
              .addMethod(getAsyncThrowExceptionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
