// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opicommon.proto

package opi_api.storage.v1;

/**
 * <pre>
 * QoS limits applied to volumes/devices
 * </pre>
 *
 * Protobuf type {@code opi_api.storage.v1.QosLimit}
 */
public final class QosLimit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.QosLimit)
    QosLimitOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QosLimit.newBuilder() to construct.
  private QosLimit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QosLimit() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QosLimit();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QosLimit(
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
          case 8: {

            rdIopsKiops_ = input.readInt64();
            break;
          }
          case 16: {

            wrIopsKiops_ = input.readInt64();
            break;
          }
          case 24: {

            rwIopsKiops_ = input.readInt64();
            break;
          }
          case 32: {

            rdBandwidthMbs_ = input.readInt64();
            break;
          }
          case 40: {

            wrBandwidthMbs_ = input.readInt64();
            break;
          }
          case 48: {

            rwBandwidthMbs_ = input.readInt64();
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
    return opi_api.storage.v1.OpiCommonProto.internal_static_opi_api_storage_v1_QosLimit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.OpiCommonProto.internal_static_opi_api_storage_v1_QosLimit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.QosLimit.class, opi_api.storage.v1.QosLimit.Builder.class);
  }

  public static final int RD_IOPS_KIOPS_FIELD_NUMBER = 1;
  private long rdIopsKiops_;
  /**
   * <pre>
   * Read kIOPS
   * </pre>
   *
   * <code>int64 rd_iops_kiops = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The rdIopsKiops.
   */
  @java.lang.Override
  public long getRdIopsKiops() {
    return rdIopsKiops_;
  }

  public static final int WR_IOPS_KIOPS_FIELD_NUMBER = 2;
  private long wrIopsKiops_;
  /**
   * <pre>
   * Write kIOPS
   * </pre>
   *
   * <code>int64 wr_iops_kiops = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The wrIopsKiops.
   */
  @java.lang.Override
  public long getWrIopsKiops() {
    return wrIopsKiops_;
  }

  public static final int RW_IOPS_KIOPS_FIELD_NUMBER = 3;
  private long rwIopsKiops_;
  /**
   * <pre>
   * Read/write kIOPS
   * </pre>
   *
   * <code>int64 rw_iops_kiops = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The rwIopsKiops.
   */
  @java.lang.Override
  public long getRwIopsKiops() {
    return rwIopsKiops_;
  }

  public static final int RD_BANDWIDTH_MBS_FIELD_NUMBER = 4;
  private long rdBandwidthMbs_;
  /**
   * <pre>
   * Read bandwidth (MB/s)
   * </pre>
   *
   * <code>int64 rd_bandwidth_mbs = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The rdBandwidthMbs.
   */
  @java.lang.Override
  public long getRdBandwidthMbs() {
    return rdBandwidthMbs_;
  }

  public static final int WR_BANDWIDTH_MBS_FIELD_NUMBER = 5;
  private long wrBandwidthMbs_;
  /**
   * <pre>
   * Write bandwidth (MB/s)
   * </pre>
   *
   * <code>int64 wr_bandwidth_mbs = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The wrBandwidthMbs.
   */
  @java.lang.Override
  public long getWrBandwidthMbs() {
    return wrBandwidthMbs_;
  }

  public static final int RW_BANDWIDTH_MBS_FIELD_NUMBER = 6;
  private long rwBandwidthMbs_;
  /**
   * <pre>
   * Read/write bandwidth (MB/s)
   * </pre>
   *
   * <code>int64 rw_bandwidth_mbs = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The rwBandwidthMbs.
   */
  @java.lang.Override
  public long getRwBandwidthMbs() {
    return rwBandwidthMbs_;
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
    if (rdIopsKiops_ != 0L) {
      output.writeInt64(1, rdIopsKiops_);
    }
    if (wrIopsKiops_ != 0L) {
      output.writeInt64(2, wrIopsKiops_);
    }
    if (rwIopsKiops_ != 0L) {
      output.writeInt64(3, rwIopsKiops_);
    }
    if (rdBandwidthMbs_ != 0L) {
      output.writeInt64(4, rdBandwidthMbs_);
    }
    if (wrBandwidthMbs_ != 0L) {
      output.writeInt64(5, wrBandwidthMbs_);
    }
    if (rwBandwidthMbs_ != 0L) {
      output.writeInt64(6, rwBandwidthMbs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rdIopsKiops_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, rdIopsKiops_);
    }
    if (wrIopsKiops_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, wrIopsKiops_);
    }
    if (rwIopsKiops_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, rwIopsKiops_);
    }
    if (rdBandwidthMbs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, rdBandwidthMbs_);
    }
    if (wrBandwidthMbs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, wrBandwidthMbs_);
    }
    if (rwBandwidthMbs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, rwBandwidthMbs_);
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
    if (!(obj instanceof opi_api.storage.v1.QosLimit)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.QosLimit other = (opi_api.storage.v1.QosLimit) obj;

    if (getRdIopsKiops()
        != other.getRdIopsKiops()) return false;
    if (getWrIopsKiops()
        != other.getWrIopsKiops()) return false;
    if (getRwIopsKiops()
        != other.getRwIopsKiops()) return false;
    if (getRdBandwidthMbs()
        != other.getRdBandwidthMbs()) return false;
    if (getWrBandwidthMbs()
        != other.getWrBandwidthMbs()) return false;
    if (getRwBandwidthMbs()
        != other.getRwBandwidthMbs()) return false;
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
    hash = (37 * hash) + RD_IOPS_KIOPS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRdIopsKiops());
    hash = (37 * hash) + WR_IOPS_KIOPS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getWrIopsKiops());
    hash = (37 * hash) + RW_IOPS_KIOPS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRwIopsKiops());
    hash = (37 * hash) + RD_BANDWIDTH_MBS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRdBandwidthMbs());
    hash = (37 * hash) + WR_BANDWIDTH_MBS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getWrBandwidthMbs());
    hash = (37 * hash) + RW_BANDWIDTH_MBS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRwBandwidthMbs());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.QosLimit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.QosLimit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.QosLimit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.QosLimit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.QosLimit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.QosLimit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.QosLimit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.QosLimit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.QosLimit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.QosLimit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.QosLimit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.QosLimit parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.QosLimit prototype) {
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
   * QoS limits applied to volumes/devices
   * </pre>
   *
   * Protobuf type {@code opi_api.storage.v1.QosLimit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.QosLimit)
      opi_api.storage.v1.QosLimitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.OpiCommonProto.internal_static_opi_api_storage_v1_QosLimit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.OpiCommonProto.internal_static_opi_api_storage_v1_QosLimit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.QosLimit.class, opi_api.storage.v1.QosLimit.Builder.class);
    }

    // Construct using opi_api.storage.v1.QosLimit.newBuilder()
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
      rdIopsKiops_ = 0L;

      wrIopsKiops_ = 0L;

      rwIopsKiops_ = 0L;

      rdBandwidthMbs_ = 0L;

      wrBandwidthMbs_ = 0L;

      rwBandwidthMbs_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.OpiCommonProto.internal_static_opi_api_storage_v1_QosLimit_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.QosLimit getDefaultInstanceForType() {
      return opi_api.storage.v1.QosLimit.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.QosLimit build() {
      opi_api.storage.v1.QosLimit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.QosLimit buildPartial() {
      opi_api.storage.v1.QosLimit result = new opi_api.storage.v1.QosLimit(this);
      result.rdIopsKiops_ = rdIopsKiops_;
      result.wrIopsKiops_ = wrIopsKiops_;
      result.rwIopsKiops_ = rwIopsKiops_;
      result.rdBandwidthMbs_ = rdBandwidthMbs_;
      result.wrBandwidthMbs_ = wrBandwidthMbs_;
      result.rwBandwidthMbs_ = rwBandwidthMbs_;
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
      if (other instanceof opi_api.storage.v1.QosLimit) {
        return mergeFrom((opi_api.storage.v1.QosLimit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.QosLimit other) {
      if (other == opi_api.storage.v1.QosLimit.getDefaultInstance()) return this;
      if (other.getRdIopsKiops() != 0L) {
        setRdIopsKiops(other.getRdIopsKiops());
      }
      if (other.getWrIopsKiops() != 0L) {
        setWrIopsKiops(other.getWrIopsKiops());
      }
      if (other.getRwIopsKiops() != 0L) {
        setRwIopsKiops(other.getRwIopsKiops());
      }
      if (other.getRdBandwidthMbs() != 0L) {
        setRdBandwidthMbs(other.getRdBandwidthMbs());
      }
      if (other.getWrBandwidthMbs() != 0L) {
        setWrBandwidthMbs(other.getWrBandwidthMbs());
      }
      if (other.getRwBandwidthMbs() != 0L) {
        setRwBandwidthMbs(other.getRwBandwidthMbs());
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
      opi_api.storage.v1.QosLimit parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.QosLimit) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long rdIopsKiops_ ;
    /**
     * <pre>
     * Read kIOPS
     * </pre>
     *
     * <code>int64 rd_iops_kiops = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The rdIopsKiops.
     */
    @java.lang.Override
    public long getRdIopsKiops() {
      return rdIopsKiops_;
    }
    /**
     * <pre>
     * Read kIOPS
     * </pre>
     *
     * <code>int64 rd_iops_kiops = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The rdIopsKiops to set.
     * @return This builder for chaining.
     */
    public Builder setRdIopsKiops(long value) {
      
      rdIopsKiops_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Read kIOPS
     * </pre>
     *
     * <code>int64 rd_iops_kiops = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearRdIopsKiops() {
      
      rdIopsKiops_ = 0L;
      onChanged();
      return this;
    }

    private long wrIopsKiops_ ;
    /**
     * <pre>
     * Write kIOPS
     * </pre>
     *
     * <code>int64 wr_iops_kiops = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The wrIopsKiops.
     */
    @java.lang.Override
    public long getWrIopsKiops() {
      return wrIopsKiops_;
    }
    /**
     * <pre>
     * Write kIOPS
     * </pre>
     *
     * <code>int64 wr_iops_kiops = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The wrIopsKiops to set.
     * @return This builder for chaining.
     */
    public Builder setWrIopsKiops(long value) {
      
      wrIopsKiops_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Write kIOPS
     * </pre>
     *
     * <code>int64 wr_iops_kiops = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearWrIopsKiops() {
      
      wrIopsKiops_ = 0L;
      onChanged();
      return this;
    }

    private long rwIopsKiops_ ;
    /**
     * <pre>
     * Read/write kIOPS
     * </pre>
     *
     * <code>int64 rw_iops_kiops = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The rwIopsKiops.
     */
    @java.lang.Override
    public long getRwIopsKiops() {
      return rwIopsKiops_;
    }
    /**
     * <pre>
     * Read/write kIOPS
     * </pre>
     *
     * <code>int64 rw_iops_kiops = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The rwIopsKiops to set.
     * @return This builder for chaining.
     */
    public Builder setRwIopsKiops(long value) {
      
      rwIopsKiops_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Read/write kIOPS
     * </pre>
     *
     * <code>int64 rw_iops_kiops = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearRwIopsKiops() {
      
      rwIopsKiops_ = 0L;
      onChanged();
      return this;
    }

    private long rdBandwidthMbs_ ;
    /**
     * <pre>
     * Read bandwidth (MB/s)
     * </pre>
     *
     * <code>int64 rd_bandwidth_mbs = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The rdBandwidthMbs.
     */
    @java.lang.Override
    public long getRdBandwidthMbs() {
      return rdBandwidthMbs_;
    }
    /**
     * <pre>
     * Read bandwidth (MB/s)
     * </pre>
     *
     * <code>int64 rd_bandwidth_mbs = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The rdBandwidthMbs to set.
     * @return This builder for chaining.
     */
    public Builder setRdBandwidthMbs(long value) {
      
      rdBandwidthMbs_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Read bandwidth (MB/s)
     * </pre>
     *
     * <code>int64 rd_bandwidth_mbs = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearRdBandwidthMbs() {
      
      rdBandwidthMbs_ = 0L;
      onChanged();
      return this;
    }

    private long wrBandwidthMbs_ ;
    /**
     * <pre>
     * Write bandwidth (MB/s)
     * </pre>
     *
     * <code>int64 wr_bandwidth_mbs = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The wrBandwidthMbs.
     */
    @java.lang.Override
    public long getWrBandwidthMbs() {
      return wrBandwidthMbs_;
    }
    /**
     * <pre>
     * Write bandwidth (MB/s)
     * </pre>
     *
     * <code>int64 wr_bandwidth_mbs = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The wrBandwidthMbs to set.
     * @return This builder for chaining.
     */
    public Builder setWrBandwidthMbs(long value) {
      
      wrBandwidthMbs_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Write bandwidth (MB/s)
     * </pre>
     *
     * <code>int64 wr_bandwidth_mbs = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearWrBandwidthMbs() {
      
      wrBandwidthMbs_ = 0L;
      onChanged();
      return this;
    }

    private long rwBandwidthMbs_ ;
    /**
     * <pre>
     * Read/write bandwidth (MB/s)
     * </pre>
     *
     * <code>int64 rw_bandwidth_mbs = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The rwBandwidthMbs.
     */
    @java.lang.Override
    public long getRwBandwidthMbs() {
      return rwBandwidthMbs_;
    }
    /**
     * <pre>
     * Read/write bandwidth (MB/s)
     * </pre>
     *
     * <code>int64 rw_bandwidth_mbs = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The rwBandwidthMbs to set.
     * @return This builder for chaining.
     */
    public Builder setRwBandwidthMbs(long value) {
      
      rwBandwidthMbs_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Read/write bandwidth (MB/s)
     * </pre>
     *
     * <code>int64 rw_bandwidth_mbs = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearRwBandwidthMbs() {
      
      rwBandwidthMbs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.QosLimit)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.QosLimit)
  private static final opi_api.storage.v1.QosLimit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.QosLimit();
  }

  public static opi_api.storage.v1.QosLimit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QosLimit>
      PARSER = new com.google.protobuf.AbstractParser<QosLimit>() {
    @java.lang.Override
    public QosLimit parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QosLimit(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QosLimit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QosLimit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.QosLimit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
