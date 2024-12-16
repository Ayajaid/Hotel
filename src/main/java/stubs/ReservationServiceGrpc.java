package stubs;

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
 * Service pour gérer les réservations
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: hotel.proto")
public final class ReservationServiceGrpc {

  private ReservationServiceGrpc() {}

  public static final String SERVICE_NAME = "ReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stubs.GetAllReservationsRequest,
      stubs.GetAllReservationsResponse> getGetAllReservationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllReservations",
      requestType = stubs.GetAllReservationsRequest.class,
      responseType = stubs.GetAllReservationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stubs.GetAllReservationsRequest,
      stubs.GetAllReservationsResponse> getGetAllReservationsMethod() {
    io.grpc.MethodDescriptor<stubs.GetAllReservationsRequest, stubs.GetAllReservationsResponse> getGetAllReservationsMethod;
    if ((getGetAllReservationsMethod = ReservationServiceGrpc.getGetAllReservationsMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetAllReservationsMethod = ReservationServiceGrpc.getGetAllReservationsMethod) == null) {
          ReservationServiceGrpc.getGetAllReservationsMethod = getGetAllReservationsMethod = 
              io.grpc.MethodDescriptor.<stubs.GetAllReservationsRequest, stubs.GetAllReservationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "GetAllReservations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stubs.GetAllReservationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stubs.GetAllReservationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("GetAllReservations"))
                  .build();
          }
        }
     }
     return getGetAllReservationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stubs.GetReservationByIdRequest,
      stubs.GetReservationByIdResponse> getGetReservationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReservationById",
      requestType = stubs.GetReservationByIdRequest.class,
      responseType = stubs.GetReservationByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stubs.GetReservationByIdRequest,
      stubs.GetReservationByIdResponse> getGetReservationByIdMethod() {
    io.grpc.MethodDescriptor<stubs.GetReservationByIdRequest, stubs.GetReservationByIdResponse> getGetReservationByIdMethod;
    if ((getGetReservationByIdMethod = ReservationServiceGrpc.getGetReservationByIdMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetReservationByIdMethod = ReservationServiceGrpc.getGetReservationByIdMethod) == null) {
          ReservationServiceGrpc.getGetReservationByIdMethod = getGetReservationByIdMethod = 
              io.grpc.MethodDescriptor.<stubs.GetReservationByIdRequest, stubs.GetReservationByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "GetReservationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stubs.GetReservationByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stubs.GetReservationByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("GetReservationById"))
                  .build();
          }
        }
     }
     return getGetReservationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stubs.CreateReservationRequest,
      stubs.CreateReservationResponse> getCreateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateReservation",
      requestType = stubs.CreateReservationRequest.class,
      responseType = stubs.CreateReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stubs.CreateReservationRequest,
      stubs.CreateReservationResponse> getCreateReservationMethod() {
    io.grpc.MethodDescriptor<stubs.CreateReservationRequest, stubs.CreateReservationResponse> getCreateReservationMethod;
    if ((getCreateReservationMethod = ReservationServiceGrpc.getCreateReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getCreateReservationMethod = ReservationServiceGrpc.getCreateReservationMethod) == null) {
          ReservationServiceGrpc.getCreateReservationMethod = getCreateReservationMethod = 
              io.grpc.MethodDescriptor.<stubs.CreateReservationRequest, stubs.CreateReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "CreateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stubs.CreateReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stubs.CreateReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("CreateReservation"))
                  .build();
          }
        }
     }
     return getCreateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stubs.DeleteReservationRequest,
      stubs.DeleteReservationResponse> getDeleteReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteReservation",
      requestType = stubs.DeleteReservationRequest.class,
      responseType = stubs.DeleteReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stubs.DeleteReservationRequest,
      stubs.DeleteReservationResponse> getDeleteReservationMethod() {
    io.grpc.MethodDescriptor<stubs.DeleteReservationRequest, stubs.DeleteReservationResponse> getDeleteReservationMethod;
    if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
          ReservationServiceGrpc.getDeleteReservationMethod = getDeleteReservationMethod = 
              io.grpc.MethodDescriptor.<stubs.DeleteReservationRequest, stubs.DeleteReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "DeleteReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stubs.DeleteReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stubs.DeleteReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("DeleteReservation"))
                  .build();
          }
        }
     }
     return getDeleteReservationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationServiceStub newStub(io.grpc.Channel channel) {
    return new ReservationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReservationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReservationServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service pour gérer les réservations
   * </pre>
   */
  public static abstract class ReservationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Récupérer toutes les réservations
     * </pre>
     */
    public void getAllReservations(stubs.GetAllReservationsRequest request,
        io.grpc.stub.StreamObserver<stubs.GetAllReservationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllReservationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Récupérer une réservation par ID
     * </pre>
     */
    public void getReservationById(stubs.GetReservationByIdRequest request,
        io.grpc.stub.StreamObserver<stubs.GetReservationByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetReservationByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sauvegarder une réservation (création ou mise à jour)
     * </pre>
     */
    public void createReservation(stubs.CreateReservationRequest request,
        io.grpc.stub.StreamObserver<stubs.CreateReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateReservationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Supprimer une réservation par ID
     * </pre>
     */
    public void deleteReservation(stubs.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<stubs.DeleteReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteReservationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllReservationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stubs.GetAllReservationsRequest,
                stubs.GetAllReservationsResponse>(
                  this, METHODID_GET_ALL_RESERVATIONS)))
          .addMethod(
            getGetReservationByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stubs.GetReservationByIdRequest,
                stubs.GetReservationByIdResponse>(
                  this, METHODID_GET_RESERVATION_BY_ID)))
          .addMethod(
            getCreateReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stubs.CreateReservationRequest,
                stubs.CreateReservationResponse>(
                  this, METHODID_CREATE_RESERVATION)))
          .addMethod(
            getDeleteReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stubs.DeleteReservationRequest,
                stubs.DeleteReservationResponse>(
                  this, METHODID_DELETE_RESERVATION)))
          .build();
    }
  }

  /**
   * <pre>
   * Service pour gérer les réservations
   * </pre>
   */
  public static final class ReservationServiceStub extends io.grpc.stub.AbstractStub<ReservationServiceStub> {
    private ReservationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Récupérer toutes les réservations
     * </pre>
     */
    public void getAllReservations(stubs.GetAllReservationsRequest request,
        io.grpc.stub.StreamObserver<stubs.GetAllReservationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllReservationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Récupérer une réservation par ID
     * </pre>
     */
    public void getReservationById(stubs.GetReservationByIdRequest request,
        io.grpc.stub.StreamObserver<stubs.GetReservationByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetReservationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sauvegarder une réservation (création ou mise à jour)
     * </pre>
     */
    public void createReservation(stubs.CreateReservationRequest request,
        io.grpc.stub.StreamObserver<stubs.CreateReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Supprimer une réservation par ID
     * </pre>
     */
    public void deleteReservation(stubs.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<stubs.DeleteReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service pour gérer les réservations
   * </pre>
   */
  public static final class ReservationServiceBlockingStub extends io.grpc.stub.AbstractStub<ReservationServiceBlockingStub> {
    private ReservationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Récupérer toutes les réservations
     * </pre>
     */
    public stubs.GetAllReservationsResponse getAllReservations(stubs.GetAllReservationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllReservationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Récupérer une réservation par ID
     * </pre>
     */
    public stubs.GetReservationByIdResponse getReservationById(stubs.GetReservationByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetReservationByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sauvegarder une réservation (création ou mise à jour)
     * </pre>
     */
    public stubs.CreateReservationResponse createReservation(stubs.CreateReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateReservationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Supprimer une réservation par ID
     * </pre>
     */
    public stubs.DeleteReservationResponse deleteReservation(stubs.DeleteReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteReservationMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service pour gérer les réservations
   * </pre>
   */
  public static final class ReservationServiceFutureStub extends io.grpc.stub.AbstractStub<ReservationServiceFutureStub> {
    private ReservationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Récupérer toutes les réservations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stubs.GetAllReservationsResponse> getAllReservations(
        stubs.GetAllReservationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllReservationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Récupérer une réservation par ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stubs.GetReservationByIdResponse> getReservationById(
        stubs.GetReservationByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetReservationByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sauvegarder une réservation (création ou mise à jour)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stubs.CreateReservationResponse> createReservation(
        stubs.CreateReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Supprimer une réservation par ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stubs.DeleteReservationResponse> deleteReservation(
        stubs.DeleteReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_RESERVATIONS = 0;
  private static final int METHODID_GET_RESERVATION_BY_ID = 1;
  private static final int METHODID_CREATE_RESERVATION = 2;
  private static final int METHODID_DELETE_RESERVATION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReservationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReservationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_RESERVATIONS:
          serviceImpl.getAllReservations((stubs.GetAllReservationsRequest) request,
              (io.grpc.stub.StreamObserver<stubs.GetAllReservationsResponse>) responseObserver);
          break;
        case METHODID_GET_RESERVATION_BY_ID:
          serviceImpl.getReservationById((stubs.GetReservationByIdRequest) request,
              (io.grpc.stub.StreamObserver<stubs.GetReservationByIdResponse>) responseObserver);
          break;
        case METHODID_CREATE_RESERVATION:
          serviceImpl.createReservation((stubs.CreateReservationRequest) request,
              (io.grpc.stub.StreamObserver<stubs.CreateReservationResponse>) responseObserver);
          break;
        case METHODID_DELETE_RESERVATION:
          serviceImpl.deleteReservation((stubs.DeleteReservationRequest) request,
              (io.grpc.stub.StreamObserver<stubs.DeleteReservationResponse>) responseObserver);
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

  private static abstract class ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return stubs.Hotel.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReservationService");
    }
  }

  private static final class ReservationServiceFileDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier {
    ReservationServiceFileDescriptorSupplier() {}
  }

  private static final class ReservationServiceMethodDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReservationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationServiceFileDescriptorSupplier())
              .addMethod(getGetAllReservationsMethod())
              .addMethod(getGetReservationByIdMethod())
              .addMethod(getCreateReservationMethod())
              .addMethod(getDeleteReservationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
