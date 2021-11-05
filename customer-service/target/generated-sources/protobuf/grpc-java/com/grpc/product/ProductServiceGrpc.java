package com.grpc.product;

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
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: ProductService.proto")
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.product.ProductService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grpc.product.emptyRequest,
      com.grpc.product.ModelResponse> METHOD_FIND_ALL_PRODUCT =
      io.grpc.MethodDescriptor.<com.grpc.product.emptyRequest, com.grpc.product.ModelResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.grpc.product.ProductService", "findAllProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.product.emptyRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.product.ModelResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grpc.product.ModelRequest,
      com.grpc.product.ModelOneRespone> METHOD_FIND_ONE_PRODUCT =
      io.grpc.MethodDescriptor.<com.grpc.product.ModelRequest, com.grpc.product.ModelOneRespone>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.grpc.product.ProductService", "findOneProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.product.ModelRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.product.ModelOneRespone.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    return new ProductServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProductServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProductServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProductServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void findAllProduct(com.grpc.product.emptyRequest request,
        io.grpc.stub.StreamObserver<com.grpc.product.ModelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_ALL_PRODUCT, responseObserver);
    }

    /**
     */
    public void findOneProduct(com.grpc.product.ModelRequest request,
        io.grpc.stub.StreamObserver<com.grpc.product.ModelOneRespone> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_ONE_PRODUCT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FIND_ALL_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.product.emptyRequest,
                com.grpc.product.ModelResponse>(
                  this, METHODID_FIND_ALL_PRODUCT)))
          .addMethod(
            METHOD_FIND_ONE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.product.ModelRequest,
                com.grpc.product.ModelOneRespone>(
                  this, METHODID_FIND_ONE_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class ProductServiceStub extends io.grpc.stub.AbstractStub<ProductServiceStub> {
    private ProductServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void findAllProduct(com.grpc.product.emptyRequest request,
        io.grpc.stub.StreamObserver<com.grpc.product.ModelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_ALL_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findOneProduct(com.grpc.product.ModelRequest request,
        io.grpc.stub.StreamObserver<com.grpc.product.ModelOneRespone> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_ONE_PRODUCT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductServiceBlockingStub extends io.grpc.stub.AbstractStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.product.ModelResponse findAllProduct(com.grpc.product.emptyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_ALL_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public com.grpc.product.ModelOneRespone findOneProduct(com.grpc.product.ModelRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_ONE_PRODUCT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductServiceFutureStub extends io.grpc.stub.AbstractStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.product.ModelResponse> findAllProduct(
        com.grpc.product.emptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_ALL_PRODUCT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.product.ModelOneRespone> findOneProduct(
        com.grpc.product.ModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_ONE_PRODUCT, getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_ALL_PRODUCT = 0;
  private static final int METHODID_FIND_ONE_PRODUCT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_ALL_PRODUCT:
          serviceImpl.findAllProduct((com.grpc.product.emptyRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.product.ModelResponse>) responseObserver);
          break;
        case METHODID_FIND_ONE_PRODUCT:
          serviceImpl.findOneProduct((com.grpc.product.ModelRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.product.ModelOneRespone>) responseObserver);
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

  private static final class ProductServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.product.ProductServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceDescriptorSupplier())
              .addMethod(METHOD_FIND_ALL_PRODUCT)
              .addMethod(METHOD_FIND_ONE_PRODUCT)
              .build();
        }
      }
    }
    return result;
  }
}
