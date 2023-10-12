// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend_qos_volume.proto

package opi_api.storage.v1;

public interface QosVolumeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.QosVolume)
    com.google.protobuf.MessageOrBuilder {

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
  java.lang.String getName();
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
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Middleend/backend volume to apply QoS on
   * </pre>
   *
   * <code>string volume_name_ref = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The volumeNameRef.
   */
  java.lang.String getVolumeNameRef();
  /**
   * <pre>
   * Middleend/backend volume to apply QoS on
   * </pre>
   *
   * <code>string volume_name_ref = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for volumeNameRef.
   */
  com.google.protobuf.ByteString
      getVolumeNameRefBytes();

  /**
   * <pre>
   * At least one limit value should be set, oitherwise volume does not make
   * sense.
   * AIP-203 says that a field should be described as REQUIRED if it is a
   * field on a resource that a user provides somewhere as input.
   * In this case, the resource is only valid if a "truthy" value is stored.
   * "truthy" is defined as:
   * * For primitives, values other than 0, 0.0, empty string/bytes, and false
   * * For repeated fields maps, values with at least one entry
   * * For messages, any message with at least one "truthy" field.
   * We cannot mark both min and max QosLimit as REQUIRED directly here, since
   * it forces one limit field is set on both. Limits message is added to
   * overcome it. REQUIRED on limits forces at least one limit field in
   * either min/max sub message is set.
   * </pre>
   *
   * <code>.opi_api.storage.v1.Limits limits = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the limits field is set.
   */
  boolean hasLimits();
  /**
   * <pre>
   * At least one limit value should be set, oitherwise volume does not make
   * sense.
   * AIP-203 says that a field should be described as REQUIRED if it is a
   * field on a resource that a user provides somewhere as input.
   * In this case, the resource is only valid if a "truthy" value is stored.
   * "truthy" is defined as:
   * * For primitives, values other than 0, 0.0, empty string/bytes, and false
   * * For repeated fields maps, values with at least one entry
   * * For messages, any message with at least one "truthy" field.
   * We cannot mark both min and max QosLimit as REQUIRED directly here, since
   * it forces one limit field is set on both. Limits message is added to
   * overcome it. REQUIRED on limits forces at least one limit field in
   * either min/max sub message is set.
   * </pre>
   *
   * <code>.opi_api.storage.v1.Limits limits = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The limits.
   */
  opi_api.storage.v1.Limits getLimits();
  /**
   * <pre>
   * At least one limit value should be set, oitherwise volume does not make
   * sense.
   * AIP-203 says that a field should be described as REQUIRED if it is a
   * field on a resource that a user provides somewhere as input.
   * In this case, the resource is only valid if a "truthy" value is stored.
   * "truthy" is defined as:
   * * For primitives, values other than 0, 0.0, empty string/bytes, and false
   * * For repeated fields maps, values with at least one entry
   * * For messages, any message with at least one "truthy" field.
   * We cannot mark both min and max QosLimit as REQUIRED directly here, since
   * it forces one limit field is set on both. Limits message is added to
   * overcome it. REQUIRED on limits forces at least one limit field in
   * either min/max sub message is set.
   * </pre>
   *
   * <code>.opi_api.storage.v1.Limits limits = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.storage.v1.LimitsOrBuilder getLimitsOrBuilder();
}
