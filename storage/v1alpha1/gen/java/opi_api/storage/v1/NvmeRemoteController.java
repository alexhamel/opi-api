// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme.proto

package opi_api.storage.v1;

/**
 * <pre>
 * Represents a target controller
 * </pre>
 *
 * Protobuf type {@code opi_api.storage.v1.NvmeRemoteController}
 */
public final class NvmeRemoteController extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.NvmeRemoteController)
    NvmeRemoteControllerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NvmeRemoteController.newBuilder() to construct.
  private NvmeRemoteController(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NvmeRemoteController() {
    name_ = "";
    multipath_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NvmeRemoteController();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NvmeRemoteController(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            multipath_ = rawValue;
            break;
          }
          case 24: {

            ioQueuesCount_ = input.readInt64();
            break;
          }
          case 32: {

            queueSize_ = input.readInt64();
            break;
          }
          case 42: {
            opi_api.storage.v1.TcpController.Builder subBuilder = null;
            if (tcp_ != null) {
              subBuilder = tcp_.toBuilder();
            }
            tcp_ = input.readMessage(opi_api.storage.v1.TcpController.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tcp_);
              tcp_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.BackendNvmeProto.internal_static_opi_api_storage_v1_NvmeRemoteController_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.BackendNvmeProto.internal_static_opi_api_storage_v1_NvmeRemoteController_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.NvmeRemoteController.class, opi_api.storage.v1.NvmeRemoteController.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MULTIPATH_FIELD_NUMBER = 2;
  private int multipath_;
  /**
   * <pre>
   * Multipath mode
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeMultipath multipath = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for multipath.
   */
  @java.lang.Override public int getMultipathValue() {
    return multipath_;
  }
  /**
   * <pre>
   * Multipath mode
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeMultipath multipath = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The multipath.
   */
  @java.lang.Override public opi_api.storage.v1.NvmeMultipath getMultipath() {
    @SuppressWarnings("deprecation")
    opi_api.storage.v1.NvmeMultipath result = opi_api.storage.v1.NvmeMultipath.valueOf(multipath_);
    return result == null ? opi_api.storage.v1.NvmeMultipath.UNRECOGNIZED : result;
  }

  public static final int IO_QUEUES_COUNT_FIELD_NUMBER = 3;
  private long ioQueuesCount_;
  /**
   * <pre>
   * IO queues count
   * </pre>
   *
   * <code>int64 io_queues_count = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The ioQueuesCount.
   */
  @java.lang.Override
  public long getIoQueuesCount() {
    return ioQueuesCount_;
  }

  public static final int QUEUE_SIZE_FIELD_NUMBER = 4;
  private long queueSize_;
  /**
   * <pre>
   * Queue size
   * </pre>
   *
   * <code>int64 queue_size = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The queueSize.
   */
  @java.lang.Override
  public long getQueueSize() {
    return queueSize_;
  }

  public static final int TCP_FIELD_NUMBER = 5;
  private opi_api.storage.v1.TcpController tcp_;
  /**
   * <pre>
   * Nvme over TCP specific fields
   * </pre>
   *
   * <code>.opi_api.storage.v1.TcpController tcp = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the tcp field is set.
   */
  @java.lang.Override
  public boolean hasTcp() {
    return tcp_ != null;
  }
  /**
   * <pre>
   * Nvme over TCP specific fields
   * </pre>
   *
   * <code>.opi_api.storage.v1.TcpController tcp = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The tcp.
   */
  @java.lang.Override
  public opi_api.storage.v1.TcpController getTcp() {
    return tcp_ == null ? opi_api.storage.v1.TcpController.getDefaultInstance() : tcp_;
  }
  /**
   * <pre>
   * Nvme over TCP specific fields
   * </pre>
   *
   * <code>.opi_api.storage.v1.TcpController tcp = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.TcpControllerOrBuilder getTcpOrBuilder() {
    return getTcp();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (multipath_ != opi_api.storage.v1.NvmeMultipath.NVME_MULTIPATH_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, multipath_);
    }
    if (ioQueuesCount_ != 0L) {
      output.writeInt64(3, ioQueuesCount_);
    }
    if (queueSize_ != 0L) {
      output.writeInt64(4, queueSize_);
    }
    if (tcp_ != null) {
      output.writeMessage(5, getTcp());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (multipath_ != opi_api.storage.v1.NvmeMultipath.NVME_MULTIPATH_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, multipath_);
    }
    if (ioQueuesCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, ioQueuesCount_);
    }
    if (queueSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, queueSize_);
    }
    if (tcp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getTcp());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof opi_api.storage.v1.NvmeRemoteController)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.NvmeRemoteController other = (opi_api.storage.v1.NvmeRemoteController) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (multipath_ != other.multipath_) return false;
    if (getIoQueuesCount()
        != other.getIoQueuesCount()) return false;
    if (getQueueSize()
        != other.getQueueSize()) return false;
    if (hasTcp() != other.hasTcp()) return false;
    if (hasTcp()) {
      if (!getTcp()
          .equals(other.getTcp())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + MULTIPATH_FIELD_NUMBER;
    hash = (53 * hash) + multipath_;
    hash = (37 * hash) + IO_QUEUES_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIoQueuesCount());
    hash = (37 * hash) + QUEUE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getQueueSize());
    if (hasTcp()) {
      hash = (37 * hash) + TCP_FIELD_NUMBER;
      hash = (53 * hash) + getTcp().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.NvmeRemoteController parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NvmeRemoteController parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NvmeRemoteController parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NvmeRemoteController parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NvmeRemoteController parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NvmeRemoteController parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NvmeRemoteController parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NvmeRemoteController parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.NvmeRemoteController parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NvmeRemoteController parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.NvmeRemoteController parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NvmeRemoteController parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(opi_api.storage.v1.NvmeRemoteController prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Represents a target controller
   * </pre>
   *
   * Protobuf type {@code opi_api.storage.v1.NvmeRemoteController}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.NvmeRemoteController)
      opi_api.storage.v1.NvmeRemoteControllerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.BackendNvmeProto.internal_static_opi_api_storage_v1_NvmeRemoteController_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.BackendNvmeProto.internal_static_opi_api_storage_v1_NvmeRemoteController_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.NvmeRemoteController.class, opi_api.storage.v1.NvmeRemoteController.Builder.class);
    }

    // Construct using opi_api.storage.v1.NvmeRemoteController.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      multipath_ = 0;

      ioQueuesCount_ = 0L;

      queueSize_ = 0L;

      if (tcpBuilder_ == null) {
        tcp_ = null;
      } else {
        tcp_ = null;
        tcpBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.BackendNvmeProto.internal_static_opi_api_storage_v1_NvmeRemoteController_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.NvmeRemoteController getDefaultInstanceForType() {
      return opi_api.storage.v1.NvmeRemoteController.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.NvmeRemoteController build() {
      opi_api.storage.v1.NvmeRemoteController result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.NvmeRemoteController buildPartial() {
      opi_api.storage.v1.NvmeRemoteController result = new opi_api.storage.v1.NvmeRemoteController(this);
      result.name_ = name_;
      result.multipath_ = multipath_;
      result.ioQueuesCount_ = ioQueuesCount_;
      result.queueSize_ = queueSize_;
      if (tcpBuilder_ == null) {
        result.tcp_ = tcp_;
      } else {
        result.tcp_ = tcpBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof opi_api.storage.v1.NvmeRemoteController) {
        return mergeFrom((opi_api.storage.v1.NvmeRemoteController)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.NvmeRemoteController other) {
      if (other == opi_api.storage.v1.NvmeRemoteController.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.multipath_ != 0) {
        setMultipathValue(other.getMultipathValue());
      }
      if (other.getIoQueuesCount() != 0L) {
        setIoQueuesCount(other.getIoQueuesCount());
      }
      if (other.getQueueSize() != 0L) {
        setQueueSize(other.getQueueSize());
      }
      if (other.hasTcp()) {
        mergeTcp(other.getTcp());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      opi_api.storage.v1.NvmeRemoteController parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.NvmeRemoteController) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * name is an opaque object handle that is not user settable.
     * name will be returned with created object
     * user can only set {resource}_id on the Create request object
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER, (.google.api.resource_reference) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * name is an opaque object handle that is not user settable.
     * name will be returned with created object
     * user can only set {resource}_id on the Create request object
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * name is an opaque object handle that is not user settable.
     * name will be returned with created object
     * user can only set {resource}_id on the Create request object
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER, (.google.api.resource_reference) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name is an opaque object handle that is not user settable.
     * name will be returned with created object
     * user can only set {resource}_id on the Create request object
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name is an opaque object handle that is not user settable.
     * name will be returned with created object
     * user can only set {resource}_id on the Create request object
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int multipath_ = 0;
    /**
     * <pre>
     * Multipath mode
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeMultipath multipath = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The enum numeric value on the wire for multipath.
     */
    @java.lang.Override public int getMultipathValue() {
      return multipath_;
    }
    /**
     * <pre>
     * Multipath mode
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeMultipath multipath = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enum numeric value on the wire for multipath to set.
     * @return This builder for chaining.
     */
    public Builder setMultipathValue(int value) {
      
      multipath_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Multipath mode
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeMultipath multipath = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The multipath.
     */
    @java.lang.Override
    public opi_api.storage.v1.NvmeMultipath getMultipath() {
      @SuppressWarnings("deprecation")
      opi_api.storage.v1.NvmeMultipath result = opi_api.storage.v1.NvmeMultipath.valueOf(multipath_);
      return result == null ? opi_api.storage.v1.NvmeMultipath.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Multipath mode
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeMultipath multipath = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The multipath to set.
     * @return This builder for chaining.
     */
    public Builder setMultipath(opi_api.storage.v1.NvmeMultipath value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      multipath_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Multipath mode
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeMultipath multipath = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearMultipath() {
      
      multipath_ = 0;
      onChanged();
      return this;
    }

    private long ioQueuesCount_ ;
    /**
     * <pre>
     * IO queues count
     * </pre>
     *
     * <code>int64 io_queues_count = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The ioQueuesCount.
     */
    @java.lang.Override
    public long getIoQueuesCount() {
      return ioQueuesCount_;
    }
    /**
     * <pre>
     * IO queues count
     * </pre>
     *
     * <code>int64 io_queues_count = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The ioQueuesCount to set.
     * @return This builder for chaining.
     */
    public Builder setIoQueuesCount(long value) {
      
      ioQueuesCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IO queues count
     * </pre>
     *
     * <code>int64 io_queues_count = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearIoQueuesCount() {
      
      ioQueuesCount_ = 0L;
      onChanged();
      return this;
    }

    private long queueSize_ ;
    /**
     * <pre>
     * Queue size
     * </pre>
     *
     * <code>int64 queue_size = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The queueSize.
     */
    @java.lang.Override
    public long getQueueSize() {
      return queueSize_;
    }
    /**
     * <pre>
     * Queue size
     * </pre>
     *
     * <code>int64 queue_size = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The queueSize to set.
     * @return This builder for chaining.
     */
    public Builder setQueueSize(long value) {
      
      queueSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Queue size
     * </pre>
     *
     * <code>int64 queue_size = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearQueueSize() {
      
      queueSize_ = 0L;
      onChanged();
      return this;
    }

    private opi_api.storage.v1.TcpController tcp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.TcpController, opi_api.storage.v1.TcpController.Builder, opi_api.storage.v1.TcpControllerOrBuilder> tcpBuilder_;
    /**
     * <pre>
     * Nvme over TCP specific fields
     * </pre>
     *
     * <code>.opi_api.storage.v1.TcpController tcp = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the tcp field is set.
     */
    public boolean hasTcp() {
      return tcpBuilder_ != null || tcp_ != null;
    }
    /**
     * <pre>
     * Nvme over TCP specific fields
     * </pre>
     *
     * <code>.opi_api.storage.v1.TcpController tcp = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The tcp.
     */
    public opi_api.storage.v1.TcpController getTcp() {
      if (tcpBuilder_ == null) {
        return tcp_ == null ? opi_api.storage.v1.TcpController.getDefaultInstance() : tcp_;
      } else {
        return tcpBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Nvme over TCP specific fields
     * </pre>
     *
     * <code>.opi_api.storage.v1.TcpController tcp = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setTcp(opi_api.storage.v1.TcpController value) {
      if (tcpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tcp_ = value;
        onChanged();
      } else {
        tcpBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Nvme over TCP specific fields
     * </pre>
     *
     * <code>.opi_api.storage.v1.TcpController tcp = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setTcp(
        opi_api.storage.v1.TcpController.Builder builderForValue) {
      if (tcpBuilder_ == null) {
        tcp_ = builderForValue.build();
        onChanged();
      } else {
        tcpBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Nvme over TCP specific fields
     * </pre>
     *
     * <code>.opi_api.storage.v1.TcpController tcp = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeTcp(opi_api.storage.v1.TcpController value) {
      if (tcpBuilder_ == null) {
        if (tcp_ != null) {
          tcp_ =
            opi_api.storage.v1.TcpController.newBuilder(tcp_).mergeFrom(value).buildPartial();
        } else {
          tcp_ = value;
        }
        onChanged();
      } else {
        tcpBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Nvme over TCP specific fields
     * </pre>
     *
     * <code>.opi_api.storage.v1.TcpController tcp = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearTcp() {
      if (tcpBuilder_ == null) {
        tcp_ = null;
        onChanged();
      } else {
        tcp_ = null;
        tcpBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Nvme over TCP specific fields
     * </pre>
     *
     * <code>.opi_api.storage.v1.TcpController tcp = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public opi_api.storage.v1.TcpController.Builder getTcpBuilder() {
      
      onChanged();
      return getTcpFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Nvme over TCP specific fields
     * </pre>
     *
     * <code>.opi_api.storage.v1.TcpController tcp = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public opi_api.storage.v1.TcpControllerOrBuilder getTcpOrBuilder() {
      if (tcpBuilder_ != null) {
        return tcpBuilder_.getMessageOrBuilder();
      } else {
        return tcp_ == null ?
            opi_api.storage.v1.TcpController.getDefaultInstance() : tcp_;
      }
    }
    /**
     * <pre>
     * Nvme over TCP specific fields
     * </pre>
     *
     * <code>.opi_api.storage.v1.TcpController tcp = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.TcpController, opi_api.storage.v1.TcpController.Builder, opi_api.storage.v1.TcpControllerOrBuilder> 
        getTcpFieldBuilder() {
      if (tcpBuilder_ == null) {
        tcpBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.TcpController, opi_api.storage.v1.TcpController.Builder, opi_api.storage.v1.TcpControllerOrBuilder>(
                getTcp(),
                getParentForChildren(),
                isClean());
        tcp_ = null;
      }
      return tcpBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.NvmeRemoteController)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.NvmeRemoteController)
  private static final opi_api.storage.v1.NvmeRemoteController DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.NvmeRemoteController();
  }

  public static opi_api.storage.v1.NvmeRemoteController getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NvmeRemoteController>
      PARSER = new com.google.protobuf.AbstractParser<NvmeRemoteController>() {
    @java.lang.Override
    public NvmeRemoteController parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NvmeRemoteController(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NvmeRemoteController> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NvmeRemoteController> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.NvmeRemoteController getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

