// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

/**
 * <pre>
 * Represents a request to create an Nvme Remote Controller.
 * </pre>
 *
 * Protobuf type {@code opi_api.storage.v1.CreateNvmeRemoteControllerRequest}
 */
public final class CreateNvmeRemoteControllerRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.CreateNvmeRemoteControllerRequest)
    CreateNvmeRemoteControllerRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateNvmeRemoteControllerRequest.newBuilder() to construct.
  private CreateNvmeRemoteControllerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateNvmeRemoteControllerRequest() {
    nvmeRemoteControllerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateNvmeRemoteControllerRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateNvmeRemoteControllerRequest(
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
            opi_api.storage.v1.NvmeRemoteController.Builder subBuilder = null;
            if (nvmeRemoteController_ != null) {
              subBuilder = nvmeRemoteController_.toBuilder();
            }
            nvmeRemoteController_ = input.readMessage(opi_api.storage.v1.NvmeRemoteController.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(nvmeRemoteController_);
              nvmeRemoteController_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nvmeRemoteControllerId_ = s;
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
    return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_CreateNvmeRemoteControllerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_CreateNvmeRemoteControllerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.CreateNvmeRemoteControllerRequest.class, opi_api.storage.v1.CreateNvmeRemoteControllerRequest.Builder.class);
  }

  public static final int NVME_REMOTE_CONTROLLER_FIELD_NUMBER = 1;
  private opi_api.storage.v1.NvmeRemoteController nvmeRemoteController_;
  /**
   * <pre>
   * The Nvme Remote Controller to be created.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeRemoteController nvme_remote_controller = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nvmeRemoteController field is set.
   */
  @java.lang.Override
  public boolean hasNvmeRemoteController() {
    return nvmeRemoteController_ != null;
  }
  /**
   * <pre>
   * The Nvme Remote Controller to be created.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeRemoteController nvme_remote_controller = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nvmeRemoteController.
   */
  @java.lang.Override
  public opi_api.storage.v1.NvmeRemoteController getNvmeRemoteController() {
    return nvmeRemoteController_ == null ? opi_api.storage.v1.NvmeRemoteController.getDefaultInstance() : nvmeRemoteController_;
  }
  /**
   * <pre>
   * The Nvme Remote Controller to be created.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeRemoteController nvme_remote_controller = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NvmeRemoteControllerOrBuilder getNvmeRemoteControllerOrBuilder() {
    return getNvmeRemoteController();
  }

  public static final int NVME_REMOTE_CONTROLLER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object nvmeRemoteControllerId_;
  /**
   * <pre>
   * An optional ID to assign to the Nvme Remote Controller.
   * If this is not provided the system will auto-generate it.
   * </pre>
   *
   * <code>string nvme_remote_controller_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The nvmeRemoteControllerId.
   */
  @java.lang.Override
  public java.lang.String getNvmeRemoteControllerId() {
    java.lang.Object ref = nvmeRemoteControllerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nvmeRemoteControllerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An optional ID to assign to the Nvme Remote Controller.
   * If this is not provided the system will auto-generate it.
   * </pre>
   *
   * <code>string nvme_remote_controller_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for nvmeRemoteControllerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNvmeRemoteControllerIdBytes() {
    java.lang.Object ref = nvmeRemoteControllerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nvmeRemoteControllerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (nvmeRemoteController_ != null) {
      output.writeMessage(1, getNvmeRemoteController());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nvmeRemoteControllerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nvmeRemoteControllerId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nvmeRemoteController_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNvmeRemoteController());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nvmeRemoteControllerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nvmeRemoteControllerId_);
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
    if (!(obj instanceof opi_api.storage.v1.CreateNvmeRemoteControllerRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.CreateNvmeRemoteControllerRequest other = (opi_api.storage.v1.CreateNvmeRemoteControllerRequest) obj;

    if (hasNvmeRemoteController() != other.hasNvmeRemoteController()) return false;
    if (hasNvmeRemoteController()) {
      if (!getNvmeRemoteController()
          .equals(other.getNvmeRemoteController())) return false;
    }
    if (!getNvmeRemoteControllerId()
        .equals(other.getNvmeRemoteControllerId())) return false;
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
    if (hasNvmeRemoteController()) {
      hash = (37 * hash) + NVME_REMOTE_CONTROLLER_FIELD_NUMBER;
      hash = (53 * hash) + getNvmeRemoteController().hashCode();
    }
    hash = (37 * hash) + NVME_REMOTE_CONTROLLER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNvmeRemoteControllerId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.CreateNvmeRemoteControllerRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNvmeRemoteControllerRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNvmeRemoteControllerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNvmeRemoteControllerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNvmeRemoteControllerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNvmeRemoteControllerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNvmeRemoteControllerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNvmeRemoteControllerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNvmeRemoteControllerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNvmeRemoteControllerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNvmeRemoteControllerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNvmeRemoteControllerRequest parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.CreateNvmeRemoteControllerRequest prototype) {
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
   * Represents a request to create an Nvme Remote Controller.
   * </pre>
   *
   * Protobuf type {@code opi_api.storage.v1.CreateNvmeRemoteControllerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.CreateNvmeRemoteControllerRequest)
      opi_api.storage.v1.CreateNvmeRemoteControllerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_CreateNvmeRemoteControllerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_CreateNvmeRemoteControllerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.CreateNvmeRemoteControllerRequest.class, opi_api.storage.v1.CreateNvmeRemoteControllerRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.CreateNvmeRemoteControllerRequest.newBuilder()
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
      if (nvmeRemoteControllerBuilder_ == null) {
        nvmeRemoteController_ = null;
      } else {
        nvmeRemoteController_ = null;
        nvmeRemoteControllerBuilder_ = null;
      }
      nvmeRemoteControllerId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_CreateNvmeRemoteControllerRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNvmeRemoteControllerRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.CreateNvmeRemoteControllerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNvmeRemoteControllerRequest build() {
      opi_api.storage.v1.CreateNvmeRemoteControllerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNvmeRemoteControllerRequest buildPartial() {
      opi_api.storage.v1.CreateNvmeRemoteControllerRequest result = new opi_api.storage.v1.CreateNvmeRemoteControllerRequest(this);
      if (nvmeRemoteControllerBuilder_ == null) {
        result.nvmeRemoteController_ = nvmeRemoteController_;
      } else {
        result.nvmeRemoteController_ = nvmeRemoteControllerBuilder_.build();
      }
      result.nvmeRemoteControllerId_ = nvmeRemoteControllerId_;
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
      if (other instanceof opi_api.storage.v1.CreateNvmeRemoteControllerRequest) {
        return mergeFrom((opi_api.storage.v1.CreateNvmeRemoteControllerRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.CreateNvmeRemoteControllerRequest other) {
      if (other == opi_api.storage.v1.CreateNvmeRemoteControllerRequest.getDefaultInstance()) return this;
      if (other.hasNvmeRemoteController()) {
        mergeNvmeRemoteController(other.getNvmeRemoteController());
      }
      if (!other.getNvmeRemoteControllerId().isEmpty()) {
        nvmeRemoteControllerId_ = other.nvmeRemoteControllerId_;
        onChanged();
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
      opi_api.storage.v1.CreateNvmeRemoteControllerRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.CreateNvmeRemoteControllerRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.storage.v1.NvmeRemoteController nvmeRemoteController_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NvmeRemoteController, opi_api.storage.v1.NvmeRemoteController.Builder, opi_api.storage.v1.NvmeRemoteControllerOrBuilder> nvmeRemoteControllerBuilder_;
    /**
     * <pre>
     * The Nvme Remote Controller to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeRemoteController nvme_remote_controller = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the nvmeRemoteController field is set.
     */
    public boolean hasNvmeRemoteController() {
      return nvmeRemoteControllerBuilder_ != null || nvmeRemoteController_ != null;
    }
    /**
     * <pre>
     * The Nvme Remote Controller to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeRemoteController nvme_remote_controller = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The nvmeRemoteController.
     */
    public opi_api.storage.v1.NvmeRemoteController getNvmeRemoteController() {
      if (nvmeRemoteControllerBuilder_ == null) {
        return nvmeRemoteController_ == null ? opi_api.storage.v1.NvmeRemoteController.getDefaultInstance() : nvmeRemoteController_;
      } else {
        return nvmeRemoteControllerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The Nvme Remote Controller to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeRemoteController nvme_remote_controller = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNvmeRemoteController(opi_api.storage.v1.NvmeRemoteController value) {
      if (nvmeRemoteControllerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nvmeRemoteController_ = value;
        onChanged();
      } else {
        nvmeRemoteControllerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Nvme Remote Controller to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeRemoteController nvme_remote_controller = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNvmeRemoteController(
        opi_api.storage.v1.NvmeRemoteController.Builder builderForValue) {
      if (nvmeRemoteControllerBuilder_ == null) {
        nvmeRemoteController_ = builderForValue.build();
        onChanged();
      } else {
        nvmeRemoteControllerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The Nvme Remote Controller to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeRemoteController nvme_remote_controller = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeNvmeRemoteController(opi_api.storage.v1.NvmeRemoteController value) {
      if (nvmeRemoteControllerBuilder_ == null) {
        if (nvmeRemoteController_ != null) {
          nvmeRemoteController_ =
            opi_api.storage.v1.NvmeRemoteController.newBuilder(nvmeRemoteController_).mergeFrom(value).buildPartial();
        } else {
          nvmeRemoteController_ = value;
        }
        onChanged();
      } else {
        nvmeRemoteControllerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Nvme Remote Controller to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeRemoteController nvme_remote_controller = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearNvmeRemoteController() {
      if (nvmeRemoteControllerBuilder_ == null) {
        nvmeRemoteController_ = null;
        onChanged();
      } else {
        nvmeRemoteController_ = null;
        nvmeRemoteControllerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The Nvme Remote Controller to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeRemoteController nvme_remote_controller = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.NvmeRemoteController.Builder getNvmeRemoteControllerBuilder() {
      
      onChanged();
      return getNvmeRemoteControllerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The Nvme Remote Controller to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeRemoteController nvme_remote_controller = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.NvmeRemoteControllerOrBuilder getNvmeRemoteControllerOrBuilder() {
      if (nvmeRemoteControllerBuilder_ != null) {
        return nvmeRemoteControllerBuilder_.getMessageOrBuilder();
      } else {
        return nvmeRemoteController_ == null ?
            opi_api.storage.v1.NvmeRemoteController.getDefaultInstance() : nvmeRemoteController_;
      }
    }
    /**
     * <pre>
     * The Nvme Remote Controller to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeRemoteController nvme_remote_controller = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NvmeRemoteController, opi_api.storage.v1.NvmeRemoteController.Builder, opi_api.storage.v1.NvmeRemoteControllerOrBuilder> 
        getNvmeRemoteControllerFieldBuilder() {
      if (nvmeRemoteControllerBuilder_ == null) {
        nvmeRemoteControllerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.NvmeRemoteController, opi_api.storage.v1.NvmeRemoteController.Builder, opi_api.storage.v1.NvmeRemoteControllerOrBuilder>(
                getNvmeRemoteController(),
                getParentForChildren(),
                isClean());
        nvmeRemoteController_ = null;
      }
      return nvmeRemoteControllerBuilder_;
    }

    private java.lang.Object nvmeRemoteControllerId_ = "";
    /**
     * <pre>
     * An optional ID to assign to the Nvme Remote Controller.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string nvme_remote_controller_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The nvmeRemoteControllerId.
     */
    public java.lang.String getNvmeRemoteControllerId() {
      java.lang.Object ref = nvmeRemoteControllerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nvmeRemoteControllerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An optional ID to assign to the Nvme Remote Controller.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string nvme_remote_controller_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for nvmeRemoteControllerId.
     */
    public com.google.protobuf.ByteString
        getNvmeRemoteControllerIdBytes() {
      java.lang.Object ref = nvmeRemoteControllerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nvmeRemoteControllerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An optional ID to assign to the Nvme Remote Controller.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string nvme_remote_controller_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The nvmeRemoteControllerId to set.
     * @return This builder for chaining.
     */
    public Builder setNvmeRemoteControllerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nvmeRemoteControllerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional ID to assign to the Nvme Remote Controller.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string nvme_remote_controller_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearNvmeRemoteControllerId() {
      
      nvmeRemoteControllerId_ = getDefaultInstance().getNvmeRemoteControllerId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional ID to assign to the Nvme Remote Controller.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string nvme_remote_controller_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for nvmeRemoteControllerId to set.
     * @return This builder for chaining.
     */
    public Builder setNvmeRemoteControllerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nvmeRemoteControllerId_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.CreateNvmeRemoteControllerRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateNvmeRemoteControllerRequest)
  private static final opi_api.storage.v1.CreateNvmeRemoteControllerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.CreateNvmeRemoteControllerRequest();
  }

  public static opi_api.storage.v1.CreateNvmeRemoteControllerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateNvmeRemoteControllerRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateNvmeRemoteControllerRequest>() {
    @java.lang.Override
    public CreateNvmeRemoteControllerRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateNvmeRemoteControllerRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateNvmeRemoteControllerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateNvmeRemoteControllerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.CreateNvmeRemoteControllerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
