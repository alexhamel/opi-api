// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend_qos_volume.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.QosVolume}
 */
public final class QosVolume extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.QosVolume)
    QosVolumeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QosVolume.newBuilder() to construct.
  private QosVolume(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QosVolume() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QosVolume();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QosVolume(
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
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (qosVolumeId_ != null) {
              subBuilder = qosVolumeId_.toBuilder();
            }
            qosVolumeId_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(qosVolumeId_);
              qosVolumeId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (volumeId_ != null) {
              subBuilder = volumeId_.toBuilder();
            }
            volumeId_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(volumeId_);
              volumeId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            opi_api.storage.v1.QosLimit.Builder subBuilder = null;
            if (limitMin_ != null) {
              subBuilder = limitMin_.toBuilder();
            }
            limitMin_ = input.readMessage(opi_api.storage.v1.QosLimit.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(limitMin_);
              limitMin_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            opi_api.storage.v1.QosLimit.Builder subBuilder = null;
            if (limitMax_ != null) {
              subBuilder = limitMax_.toBuilder();
            }
            limitMax_ = input.readMessage(opi_api.storage.v1.QosLimit.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(limitMax_);
              limitMax_ = subBuilder.buildPartial();
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
    return opi_api.storage.v1.MiddleendQosVolumeProto.internal_static_opi_api_storage_v1_QosVolume_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.MiddleendQosVolumeProto.internal_static_opi_api_storage_v1_QosVolume_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.QosVolume.class, opi_api.storage.v1.QosVolume.Builder.class);
  }

  public static final int QOS_VOLUME_ID_FIELD_NUMBER = 1;
  private opi_api.common.v1.ObjectKey qosVolumeId_;
  /**
   * <code>.opi_api.common.v1.ObjectKey qos_volume_id = 1;</code>
   * @return Whether the qosVolumeId field is set.
   */
  @java.lang.Override
  public boolean hasQosVolumeId() {
    return qosVolumeId_ != null;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey qos_volume_id = 1;</code>
   * @return The qosVolumeId.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getQosVolumeId() {
    return qosVolumeId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : qosVolumeId_;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey qos_volume_id = 1;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getQosVolumeIdOrBuilder() {
    return getQosVolumeId();
  }

  public static final int VOLUME_ID_FIELD_NUMBER = 2;
  private opi_api.common.v1.ObjectKey volumeId_;
  /**
   * <pre>
   * Middleend/backend volume to apply QoS on
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
   * @return Whether the volumeId field is set.
   */
  @java.lang.Override
  public boolean hasVolumeId() {
    return volumeId_ != null;
  }
  /**
   * <pre>
   * Middleend/backend volume to apply QoS on
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
   * @return The volumeId.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getVolumeId() {
    return volumeId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : volumeId_;
  }
  /**
   * <pre>
   * Middleend/backend volume to apply QoS on
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getVolumeIdOrBuilder() {
    return getVolumeId();
  }

  public static final int LIMIT_MIN_FIELD_NUMBER = 3;
  private opi_api.storage.v1.QosLimit limitMin_;
  /**
   * <code>.opi_api.storage.v1.QosLimit limit_min = 3;</code>
   * @return Whether the limitMin field is set.
   */
  @java.lang.Override
  public boolean hasLimitMin() {
    return limitMin_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.QosLimit limit_min = 3;</code>
   * @return The limitMin.
   */
  @java.lang.Override
  public opi_api.storage.v1.QosLimit getLimitMin() {
    return limitMin_ == null ? opi_api.storage.v1.QosLimit.getDefaultInstance() : limitMin_;
  }
  /**
   * <code>.opi_api.storage.v1.QosLimit limit_min = 3;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.QosLimitOrBuilder getLimitMinOrBuilder() {
    return getLimitMin();
  }

  public static final int LIMIT_MAX_FIELD_NUMBER = 4;
  private opi_api.storage.v1.QosLimit limitMax_;
  /**
   * <code>.opi_api.storage.v1.QosLimit limit_max = 4;</code>
   * @return Whether the limitMax field is set.
   */
  @java.lang.Override
  public boolean hasLimitMax() {
    return limitMax_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.QosLimit limit_max = 4;</code>
   * @return The limitMax.
   */
  @java.lang.Override
  public opi_api.storage.v1.QosLimit getLimitMax() {
    return limitMax_ == null ? opi_api.storage.v1.QosLimit.getDefaultInstance() : limitMax_;
  }
  /**
   * <code>.opi_api.storage.v1.QosLimit limit_max = 4;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.QosLimitOrBuilder getLimitMaxOrBuilder() {
    return getLimitMax();
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
    if (qosVolumeId_ != null) {
      output.writeMessage(1, getQosVolumeId());
    }
    if (volumeId_ != null) {
      output.writeMessage(2, getVolumeId());
    }
    if (limitMin_ != null) {
      output.writeMessage(3, getLimitMin());
    }
    if (limitMax_ != null) {
      output.writeMessage(4, getLimitMax());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (qosVolumeId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getQosVolumeId());
    }
    if (volumeId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVolumeId());
    }
    if (limitMin_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLimitMin());
    }
    if (limitMax_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getLimitMax());
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
    if (!(obj instanceof opi_api.storage.v1.QosVolume)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.QosVolume other = (opi_api.storage.v1.QosVolume) obj;

    if (hasQosVolumeId() != other.hasQosVolumeId()) return false;
    if (hasQosVolumeId()) {
      if (!getQosVolumeId()
          .equals(other.getQosVolumeId())) return false;
    }
    if (hasVolumeId() != other.hasVolumeId()) return false;
    if (hasVolumeId()) {
      if (!getVolumeId()
          .equals(other.getVolumeId())) return false;
    }
    if (hasLimitMin() != other.hasLimitMin()) return false;
    if (hasLimitMin()) {
      if (!getLimitMin()
          .equals(other.getLimitMin())) return false;
    }
    if (hasLimitMax() != other.hasLimitMax()) return false;
    if (hasLimitMax()) {
      if (!getLimitMax()
          .equals(other.getLimitMax())) return false;
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
    if (hasQosVolumeId()) {
      hash = (37 * hash) + QOS_VOLUME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQosVolumeId().hashCode();
    }
    if (hasVolumeId()) {
      hash = (37 * hash) + VOLUME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getVolumeId().hashCode();
    }
    if (hasLimitMin()) {
      hash = (37 * hash) + LIMIT_MIN_FIELD_NUMBER;
      hash = (53 * hash) + getLimitMin().hashCode();
    }
    if (hasLimitMax()) {
      hash = (37 * hash) + LIMIT_MAX_FIELD_NUMBER;
      hash = (53 * hash) + getLimitMax().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.QosVolume parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.QosVolume parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.QosVolume parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.QosVolume parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.QosVolume parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.QosVolume parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.QosVolume parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.QosVolume parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.QosVolume parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.QosVolume parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.QosVolume parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.QosVolume parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.QosVolume prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.QosVolume}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.QosVolume)
      opi_api.storage.v1.QosVolumeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.MiddleendQosVolumeProto.internal_static_opi_api_storage_v1_QosVolume_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.MiddleendQosVolumeProto.internal_static_opi_api_storage_v1_QosVolume_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.QosVolume.class, opi_api.storage.v1.QosVolume.Builder.class);
    }

    // Construct using opi_api.storage.v1.QosVolume.newBuilder()
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
      if (qosVolumeIdBuilder_ == null) {
        qosVolumeId_ = null;
      } else {
        qosVolumeId_ = null;
        qosVolumeIdBuilder_ = null;
      }
      if (volumeIdBuilder_ == null) {
        volumeId_ = null;
      } else {
        volumeId_ = null;
        volumeIdBuilder_ = null;
      }
      if (limitMinBuilder_ == null) {
        limitMin_ = null;
      } else {
        limitMin_ = null;
        limitMinBuilder_ = null;
      }
      if (limitMaxBuilder_ == null) {
        limitMax_ = null;
      } else {
        limitMax_ = null;
        limitMaxBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.MiddleendQosVolumeProto.internal_static_opi_api_storage_v1_QosVolume_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.QosVolume getDefaultInstanceForType() {
      return opi_api.storage.v1.QosVolume.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.QosVolume build() {
      opi_api.storage.v1.QosVolume result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.QosVolume buildPartial() {
      opi_api.storage.v1.QosVolume result = new opi_api.storage.v1.QosVolume(this);
      if (qosVolumeIdBuilder_ == null) {
        result.qosVolumeId_ = qosVolumeId_;
      } else {
        result.qosVolumeId_ = qosVolumeIdBuilder_.build();
      }
      if (volumeIdBuilder_ == null) {
        result.volumeId_ = volumeId_;
      } else {
        result.volumeId_ = volumeIdBuilder_.build();
      }
      if (limitMinBuilder_ == null) {
        result.limitMin_ = limitMin_;
      } else {
        result.limitMin_ = limitMinBuilder_.build();
      }
      if (limitMaxBuilder_ == null) {
        result.limitMax_ = limitMax_;
      } else {
        result.limitMax_ = limitMaxBuilder_.build();
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
      if (other instanceof opi_api.storage.v1.QosVolume) {
        return mergeFrom((opi_api.storage.v1.QosVolume)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.QosVolume other) {
      if (other == opi_api.storage.v1.QosVolume.getDefaultInstance()) return this;
      if (other.hasQosVolumeId()) {
        mergeQosVolumeId(other.getQosVolumeId());
      }
      if (other.hasVolumeId()) {
        mergeVolumeId(other.getVolumeId());
      }
      if (other.hasLimitMin()) {
        mergeLimitMin(other.getLimitMin());
      }
      if (other.hasLimitMax()) {
        mergeLimitMax(other.getLimitMax());
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
      opi_api.storage.v1.QosVolume parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.QosVolume) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.common.v1.ObjectKey qosVolumeId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> qosVolumeIdBuilder_;
    /**
     * <code>.opi_api.common.v1.ObjectKey qos_volume_id = 1;</code>
     * @return Whether the qosVolumeId field is set.
     */
    public boolean hasQosVolumeId() {
      return qosVolumeIdBuilder_ != null || qosVolumeId_ != null;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey qos_volume_id = 1;</code>
     * @return The qosVolumeId.
     */
    public opi_api.common.v1.ObjectKey getQosVolumeId() {
      if (qosVolumeIdBuilder_ == null) {
        return qosVolumeId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : qosVolumeId_;
      } else {
        return qosVolumeIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey qos_volume_id = 1;</code>
     */
    public Builder setQosVolumeId(opi_api.common.v1.ObjectKey value) {
      if (qosVolumeIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        qosVolumeId_ = value;
        onChanged();
      } else {
        qosVolumeIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey qos_volume_id = 1;</code>
     */
    public Builder setQosVolumeId(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (qosVolumeIdBuilder_ == null) {
        qosVolumeId_ = builderForValue.build();
        onChanged();
      } else {
        qosVolumeIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey qos_volume_id = 1;</code>
     */
    public Builder mergeQosVolumeId(opi_api.common.v1.ObjectKey value) {
      if (qosVolumeIdBuilder_ == null) {
        if (qosVolumeId_ != null) {
          qosVolumeId_ =
            opi_api.common.v1.ObjectKey.newBuilder(qosVolumeId_).mergeFrom(value).buildPartial();
        } else {
          qosVolumeId_ = value;
        }
        onChanged();
      } else {
        qosVolumeIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey qos_volume_id = 1;</code>
     */
    public Builder clearQosVolumeId() {
      if (qosVolumeIdBuilder_ == null) {
        qosVolumeId_ = null;
        onChanged();
      } else {
        qosVolumeId_ = null;
        qosVolumeIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey qos_volume_id = 1;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getQosVolumeIdBuilder() {
      
      onChanged();
      return getQosVolumeIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey qos_volume_id = 1;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getQosVolumeIdOrBuilder() {
      if (qosVolumeIdBuilder_ != null) {
        return qosVolumeIdBuilder_.getMessageOrBuilder();
      } else {
        return qosVolumeId_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : qosVolumeId_;
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey qos_volume_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getQosVolumeIdFieldBuilder() {
      if (qosVolumeIdBuilder_ == null) {
        qosVolumeIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getQosVolumeId(),
                getParentForChildren(),
                isClean());
        qosVolumeId_ = null;
      }
      return qosVolumeIdBuilder_;
    }

    private opi_api.common.v1.ObjectKey volumeId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> volumeIdBuilder_;
    /**
     * <pre>
     * Middleend/backend volume to apply QoS on
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
     * @return Whether the volumeId field is set.
     */
    public boolean hasVolumeId() {
      return volumeIdBuilder_ != null || volumeId_ != null;
    }
    /**
     * <pre>
     * Middleend/backend volume to apply QoS on
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
     * @return The volumeId.
     */
    public opi_api.common.v1.ObjectKey getVolumeId() {
      if (volumeIdBuilder_ == null) {
        return volumeId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : volumeId_;
      } else {
        return volumeIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Middleend/backend volume to apply QoS on
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
     */
    public Builder setVolumeId(opi_api.common.v1.ObjectKey value) {
      if (volumeIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        volumeId_ = value;
        onChanged();
      } else {
        volumeIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Middleend/backend volume to apply QoS on
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
     */
    public Builder setVolumeId(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (volumeIdBuilder_ == null) {
        volumeId_ = builderForValue.build();
        onChanged();
      } else {
        volumeIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Middleend/backend volume to apply QoS on
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
     */
    public Builder mergeVolumeId(opi_api.common.v1.ObjectKey value) {
      if (volumeIdBuilder_ == null) {
        if (volumeId_ != null) {
          volumeId_ =
            opi_api.common.v1.ObjectKey.newBuilder(volumeId_).mergeFrom(value).buildPartial();
        } else {
          volumeId_ = value;
        }
        onChanged();
      } else {
        volumeIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Middleend/backend volume to apply QoS on
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
     */
    public Builder clearVolumeId() {
      if (volumeIdBuilder_ == null) {
        volumeId_ = null;
        onChanged();
      } else {
        volumeId_ = null;
        volumeIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Middleend/backend volume to apply QoS on
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getVolumeIdBuilder() {
      
      onChanged();
      return getVolumeIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Middleend/backend volume to apply QoS on
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getVolumeIdOrBuilder() {
      if (volumeIdBuilder_ != null) {
        return volumeIdBuilder_.getMessageOrBuilder();
      } else {
        return volumeId_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : volumeId_;
      }
    }
    /**
     * <pre>
     * Middleend/backend volume to apply QoS on
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getVolumeIdFieldBuilder() {
      if (volumeIdBuilder_ == null) {
        volumeIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getVolumeId(),
                getParentForChildren(),
                isClean());
        volumeId_ = null;
      }
      return volumeIdBuilder_;
    }

    private opi_api.storage.v1.QosLimit limitMin_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.QosLimit, opi_api.storage.v1.QosLimit.Builder, opi_api.storage.v1.QosLimitOrBuilder> limitMinBuilder_;
    /**
     * <code>.opi_api.storage.v1.QosLimit limit_min = 3;</code>
     * @return Whether the limitMin field is set.
     */
    public boolean hasLimitMin() {
      return limitMinBuilder_ != null || limitMin_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit limit_min = 3;</code>
     * @return The limitMin.
     */
    public opi_api.storage.v1.QosLimit getLimitMin() {
      if (limitMinBuilder_ == null) {
        return limitMin_ == null ? opi_api.storage.v1.QosLimit.getDefaultInstance() : limitMin_;
      } else {
        return limitMinBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit limit_min = 3;</code>
     */
    public Builder setLimitMin(opi_api.storage.v1.QosLimit value) {
      if (limitMinBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        limitMin_ = value;
        onChanged();
      } else {
        limitMinBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit limit_min = 3;</code>
     */
    public Builder setLimitMin(
        opi_api.storage.v1.QosLimit.Builder builderForValue) {
      if (limitMinBuilder_ == null) {
        limitMin_ = builderForValue.build();
        onChanged();
      } else {
        limitMinBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit limit_min = 3;</code>
     */
    public Builder mergeLimitMin(opi_api.storage.v1.QosLimit value) {
      if (limitMinBuilder_ == null) {
        if (limitMin_ != null) {
          limitMin_ =
            opi_api.storage.v1.QosLimit.newBuilder(limitMin_).mergeFrom(value).buildPartial();
        } else {
          limitMin_ = value;
        }
        onChanged();
      } else {
        limitMinBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit limit_min = 3;</code>
     */
    public Builder clearLimitMin() {
      if (limitMinBuilder_ == null) {
        limitMin_ = null;
        onChanged();
      } else {
        limitMin_ = null;
        limitMinBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit limit_min = 3;</code>
     */
    public opi_api.storage.v1.QosLimit.Builder getLimitMinBuilder() {
      
      onChanged();
      return getLimitMinFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit limit_min = 3;</code>
     */
    public opi_api.storage.v1.QosLimitOrBuilder getLimitMinOrBuilder() {
      if (limitMinBuilder_ != null) {
        return limitMinBuilder_.getMessageOrBuilder();
      } else {
        return limitMin_ == null ?
            opi_api.storage.v1.QosLimit.getDefaultInstance() : limitMin_;
      }
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit limit_min = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.QosLimit, opi_api.storage.v1.QosLimit.Builder, opi_api.storage.v1.QosLimitOrBuilder> 
        getLimitMinFieldBuilder() {
      if (limitMinBuilder_ == null) {
        limitMinBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.QosLimit, opi_api.storage.v1.QosLimit.Builder, opi_api.storage.v1.QosLimitOrBuilder>(
                getLimitMin(),
                getParentForChildren(),
                isClean());
        limitMin_ = null;
      }
      return limitMinBuilder_;
    }

    private opi_api.storage.v1.QosLimit limitMax_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.QosLimit, opi_api.storage.v1.QosLimit.Builder, opi_api.storage.v1.QosLimitOrBuilder> limitMaxBuilder_;
    /**
     * <code>.opi_api.storage.v1.QosLimit limit_max = 4;</code>
     * @return Whether the limitMax field is set.
     */
    public boolean hasLimitMax() {
      return limitMaxBuilder_ != null || limitMax_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit limit_max = 4;</code>
     * @return The limitMax.
     */
    public opi_api.storage.v1.QosLimit getLimitMax() {
      if (limitMaxBuilder_ == null) {
        return limitMax_ == null ? opi_api.storage.v1.QosLimit.getDefaultInstance() : limitMax_;
      } else {
        return limitMaxBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit limit_max = 4;</code>
     */
    public Builder setLimitMax(opi_api.storage.v1.QosLimit value) {
      if (limitMaxBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        limitMax_ = value;
        onChanged();
      } else {
        limitMaxBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit limit_max = 4;</code>
     */
    public Builder setLimitMax(
        opi_api.storage.v1.QosLimit.Builder builderForValue) {
      if (limitMaxBuilder_ == null) {
        limitMax_ = builderForValue.build();
        onChanged();
      } else {
        limitMaxBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit limit_max = 4;</code>
     */
    public Builder mergeLimitMax(opi_api.storage.v1.QosLimit value) {
      if (limitMaxBuilder_ == null) {
        if (limitMax_ != null) {
          limitMax_ =
            opi_api.storage.v1.QosLimit.newBuilder(limitMax_).mergeFrom(value).buildPartial();
        } else {
          limitMax_ = value;
        }
        onChanged();
      } else {
        limitMaxBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit limit_max = 4;</code>
     */
    public Builder clearLimitMax() {
      if (limitMaxBuilder_ == null) {
        limitMax_ = null;
        onChanged();
      } else {
        limitMax_ = null;
        limitMaxBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit limit_max = 4;</code>
     */
    public opi_api.storage.v1.QosLimit.Builder getLimitMaxBuilder() {
      
      onChanged();
      return getLimitMaxFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit limit_max = 4;</code>
     */
    public opi_api.storage.v1.QosLimitOrBuilder getLimitMaxOrBuilder() {
      if (limitMaxBuilder_ != null) {
        return limitMaxBuilder_.getMessageOrBuilder();
      } else {
        return limitMax_ == null ?
            opi_api.storage.v1.QosLimit.getDefaultInstance() : limitMax_;
      }
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit limit_max = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.QosLimit, opi_api.storage.v1.QosLimit.Builder, opi_api.storage.v1.QosLimitOrBuilder> 
        getLimitMaxFieldBuilder() {
      if (limitMaxBuilder_ == null) {
        limitMaxBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.QosLimit, opi_api.storage.v1.QosLimit.Builder, opi_api.storage.v1.QosLimitOrBuilder>(
                getLimitMax(),
                getParentForChildren(),
                isClean());
        limitMax_ = null;
      }
      return limitMaxBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.QosVolume)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.QosVolume)
  private static final opi_api.storage.v1.QosVolume DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.QosVolume();
  }

  public static opi_api.storage.v1.QosVolume getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QosVolume>
      PARSER = new com.google.protobuf.AbstractParser<QosVolume>() {
    @java.lang.Override
    public QosVolume parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QosVolume(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QosVolume> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QosVolume> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.QosVolume getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
