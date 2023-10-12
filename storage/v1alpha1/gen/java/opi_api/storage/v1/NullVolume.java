// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_null.proto

package opi_api.storage.v1;

/**
 * <pre>
 * Null volume which discards writes and returns random reads
 * </pre>
 *
 * Protobuf type {@code opi_api.storage.v1.NullVolume}
 */
public final class NullVolume extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.NullVolume)
    NullVolumeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NullVolume.newBuilder() to construct.
  private NullVolume(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NullVolume() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NullVolume();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NullVolume(
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

            blockSize_ = input.readInt64();
            break;
          }
          case 24: {

            blocksCount_ = input.readInt64();
            break;
          }
          case 34: {
            opi_api.common.v1.Uuid.Builder subBuilder = null;
            if (uuid_ != null) {
              subBuilder = uuid_.toBuilder();
            }
            uuid_ = input.readMessage(opi_api.common.v1.Uuid.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(uuid_);
              uuid_ = subBuilder.buildPartial();
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
    return opi_api.storage.v1.BackendNullProto.internal_static_opi_api_storage_v1_NullVolume_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.BackendNullProto.internal_static_opi_api_storage_v1_NullVolume_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.NullVolume.class, opi_api.storage.v1.NullVolume.Builder.class);
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

  public static final int BLOCK_SIZE_FIELD_NUMBER = 2;
  private long blockSize_;
  /**
   * <pre>
   * The block size of the NullVolume. This field is required.
   * </pre>
   *
   * <code>int64 block_size = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The blockSize.
   */
  @java.lang.Override
  public long getBlockSize() {
    return blockSize_;
  }

  public static final int BLOCKS_COUNT_FIELD_NUMBER = 3;
  private long blocksCount_;
  /**
   * <pre>
   * The number of blocks in the NullVolume. This field is required.
   * </pre>
   *
   * <code>int64 blocks_count = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The blocksCount.
   */
  @java.lang.Override
  public long getBlocksCount() {
    return blocksCount_;
  }

  public static final int UUID_FIELD_NUMBER = 4;
  private opi_api.common.v1.Uuid uuid_;
  /**
   * <pre>
   * The UUID of the NullVolume. This field is optional.
   * </pre>
   *
   * <code>.opi_api.common.v1.Uuid uuid = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the uuid field is set.
   */
  @java.lang.Override
  public boolean hasUuid() {
    return uuid_ != null;
  }
  /**
   * <pre>
   * The UUID of the NullVolume. This field is optional.
   * </pre>
   *
   * <code>.opi_api.common.v1.Uuid uuid = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The uuid.
   */
  @java.lang.Override
  public opi_api.common.v1.Uuid getUuid() {
    return uuid_ == null ? opi_api.common.v1.Uuid.getDefaultInstance() : uuid_;
  }
  /**
   * <pre>
   * The UUID of the NullVolume. This field is optional.
   * </pre>
   *
   * <code>.opi_api.common.v1.Uuid uuid = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public opi_api.common.v1.UuidOrBuilder getUuidOrBuilder() {
    return getUuid();
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
    if (blockSize_ != 0L) {
      output.writeInt64(2, blockSize_);
    }
    if (blocksCount_ != 0L) {
      output.writeInt64(3, blocksCount_);
    }
    if (uuid_ != null) {
      output.writeMessage(4, getUuid());
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
    if (blockSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, blockSize_);
    }
    if (blocksCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, blocksCount_);
    }
    if (uuid_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getUuid());
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
    if (!(obj instanceof opi_api.storage.v1.NullVolume)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.NullVolume other = (opi_api.storage.v1.NullVolume) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (getBlockSize()
        != other.getBlockSize()) return false;
    if (getBlocksCount()
        != other.getBlocksCount()) return false;
    if (hasUuid() != other.hasUuid()) return false;
    if (hasUuid()) {
      if (!getUuid()
          .equals(other.getUuid())) return false;
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
    hash = (37 * hash) + BLOCK_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBlockSize());
    hash = (37 * hash) + BLOCKS_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBlocksCount());
    if (hasUuid()) {
      hash = (37 * hash) + UUID_FIELD_NUMBER;
      hash = (53 * hash) + getUuid().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.NullVolume parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NullVolume parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NullVolume parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NullVolume parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NullVolume parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NullVolume parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NullVolume parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NullVolume parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.NullVolume parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NullVolume parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.NullVolume parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NullVolume parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.NullVolume prototype) {
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
   * Null volume which discards writes and returns random reads
   * </pre>
   *
   * Protobuf type {@code opi_api.storage.v1.NullVolume}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.NullVolume)
      opi_api.storage.v1.NullVolumeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.BackendNullProto.internal_static_opi_api_storage_v1_NullVolume_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.BackendNullProto.internal_static_opi_api_storage_v1_NullVolume_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.NullVolume.class, opi_api.storage.v1.NullVolume.Builder.class);
    }

    // Construct using opi_api.storage.v1.NullVolume.newBuilder()
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

      blockSize_ = 0L;

      blocksCount_ = 0L;

      if (uuidBuilder_ == null) {
        uuid_ = null;
      } else {
        uuid_ = null;
        uuidBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.BackendNullProto.internal_static_opi_api_storage_v1_NullVolume_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.NullVolume getDefaultInstanceForType() {
      return opi_api.storage.v1.NullVolume.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.NullVolume build() {
      opi_api.storage.v1.NullVolume result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.NullVolume buildPartial() {
      opi_api.storage.v1.NullVolume result = new opi_api.storage.v1.NullVolume(this);
      result.name_ = name_;
      result.blockSize_ = blockSize_;
      result.blocksCount_ = blocksCount_;
      if (uuidBuilder_ == null) {
        result.uuid_ = uuid_;
      } else {
        result.uuid_ = uuidBuilder_.build();
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
      if (other instanceof opi_api.storage.v1.NullVolume) {
        return mergeFrom((opi_api.storage.v1.NullVolume)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.NullVolume other) {
      if (other == opi_api.storage.v1.NullVolume.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getBlockSize() != 0L) {
        setBlockSize(other.getBlockSize());
      }
      if (other.getBlocksCount() != 0L) {
        setBlocksCount(other.getBlocksCount());
      }
      if (other.hasUuid()) {
        mergeUuid(other.getUuid());
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
      opi_api.storage.v1.NullVolume parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.NullVolume) e.getUnfinishedMessage();
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

    private long blockSize_ ;
    /**
     * <pre>
     * The block size of the NullVolume. This field is required.
     * </pre>
     *
     * <code>int64 block_size = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The blockSize.
     */
    @java.lang.Override
    public long getBlockSize() {
      return blockSize_;
    }
    /**
     * <pre>
     * The block size of the NullVolume. This field is required.
     * </pre>
     *
     * <code>int64 block_size = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The blockSize to set.
     * @return This builder for chaining.
     */
    public Builder setBlockSize(long value) {
      
      blockSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The block size of the NullVolume. This field is required.
     * </pre>
     *
     * <code>int64 block_size = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearBlockSize() {
      
      blockSize_ = 0L;
      onChanged();
      return this;
    }

    private long blocksCount_ ;
    /**
     * <pre>
     * The number of blocks in the NullVolume. This field is required.
     * </pre>
     *
     * <code>int64 blocks_count = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The blocksCount.
     */
    @java.lang.Override
    public long getBlocksCount() {
      return blocksCount_;
    }
    /**
     * <pre>
     * The number of blocks in the NullVolume. This field is required.
     * </pre>
     *
     * <code>int64 blocks_count = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The blocksCount to set.
     * @return This builder for chaining.
     */
    public Builder setBlocksCount(long value) {
      
      blocksCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of blocks in the NullVolume. This field is required.
     * </pre>
     *
     * <code>int64 blocks_count = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearBlocksCount() {
      
      blocksCount_ = 0L;
      onChanged();
      return this;
    }

    private opi_api.common.v1.Uuid uuid_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.Uuid, opi_api.common.v1.Uuid.Builder, opi_api.common.v1.UuidOrBuilder> uuidBuilder_;
    /**
     * <pre>
     * The UUID of the NullVolume. This field is optional.
     * </pre>
     *
     * <code>.opi_api.common.v1.Uuid uuid = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the uuid field is set.
     */
    public boolean hasUuid() {
      return uuidBuilder_ != null || uuid_ != null;
    }
    /**
     * <pre>
     * The UUID of the NullVolume. This field is optional.
     * </pre>
     *
     * <code>.opi_api.common.v1.Uuid uuid = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The uuid.
     */
    public opi_api.common.v1.Uuid getUuid() {
      if (uuidBuilder_ == null) {
        return uuid_ == null ? opi_api.common.v1.Uuid.getDefaultInstance() : uuid_;
      } else {
        return uuidBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The UUID of the NullVolume. This field is optional.
     * </pre>
     *
     * <code>.opi_api.common.v1.Uuid uuid = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setUuid(opi_api.common.v1.Uuid value) {
      if (uuidBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        uuid_ = value;
        onChanged();
      } else {
        uuidBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The UUID of the NullVolume. This field is optional.
     * </pre>
     *
     * <code>.opi_api.common.v1.Uuid uuid = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setUuid(
        opi_api.common.v1.Uuid.Builder builderForValue) {
      if (uuidBuilder_ == null) {
        uuid_ = builderForValue.build();
        onChanged();
      } else {
        uuidBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The UUID of the NullVolume. This field is optional.
     * </pre>
     *
     * <code>.opi_api.common.v1.Uuid uuid = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeUuid(opi_api.common.v1.Uuid value) {
      if (uuidBuilder_ == null) {
        if (uuid_ != null) {
          uuid_ =
            opi_api.common.v1.Uuid.newBuilder(uuid_).mergeFrom(value).buildPartial();
        } else {
          uuid_ = value;
        }
        onChanged();
      } else {
        uuidBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The UUID of the NullVolume. This field is optional.
     * </pre>
     *
     * <code>.opi_api.common.v1.Uuid uuid = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearUuid() {
      if (uuidBuilder_ == null) {
        uuid_ = null;
        onChanged();
      } else {
        uuid_ = null;
        uuidBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The UUID of the NullVolume. This field is optional.
     * </pre>
     *
     * <code>.opi_api.common.v1.Uuid uuid = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public opi_api.common.v1.Uuid.Builder getUuidBuilder() {
      
      onChanged();
      return getUuidFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The UUID of the NullVolume. This field is optional.
     * </pre>
     *
     * <code>.opi_api.common.v1.Uuid uuid = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public opi_api.common.v1.UuidOrBuilder getUuidOrBuilder() {
      if (uuidBuilder_ != null) {
        return uuidBuilder_.getMessageOrBuilder();
      } else {
        return uuid_ == null ?
            opi_api.common.v1.Uuid.getDefaultInstance() : uuid_;
      }
    }
    /**
     * <pre>
     * The UUID of the NullVolume. This field is optional.
     * </pre>
     *
     * <code>.opi_api.common.v1.Uuid uuid = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.Uuid, opi_api.common.v1.Uuid.Builder, opi_api.common.v1.UuidOrBuilder> 
        getUuidFieldBuilder() {
      if (uuidBuilder_ == null) {
        uuidBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.Uuid, opi_api.common.v1.Uuid.Builder, opi_api.common.v1.UuidOrBuilder>(
                getUuid(),
                getParentForChildren(),
                isClean());
        uuid_ = null;
      }
      return uuidBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.NullVolume)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.NullVolume)
  private static final opi_api.storage.v1.NullVolume DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.NullVolume();
  }

  public static opi_api.storage.v1.NullVolume getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NullVolume>
      PARSER = new com.google.protobuf.AbstractParser<NullVolume>() {
    @java.lang.Override
    public NullVolume parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NullVolume(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NullVolume> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NullVolume> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.NullVolume getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

