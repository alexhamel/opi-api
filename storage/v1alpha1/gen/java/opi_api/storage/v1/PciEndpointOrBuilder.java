// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opicommon.proto

package opi_api.storage.v1;

public interface PciEndpointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.PciEndpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The "port" or "device". In other words, the connector/cable that's
   * plugged into a particular host. This number may end up matching
   * the host-assigned "device" value in the bus:device:function identifier,
   * but it does not strictly have to and that should not be relied upon.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value port_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the portId field is set.
   */
  boolean hasPortId();
  /**
   * <pre>
   * The "port" or "device". In other words, the connector/cable that's
   * plugged into a particular host. This number may end up matching
   * the host-assigned "device" value in the bus:device:function identifier,
   * but it does not strictly have to and that should not be relied upon.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value port_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The portId.
   */
  com.google.protobuf.Int32Value getPortId();
  /**
   * <pre>
   * The "port" or "device". In other words, the connector/cable that's
   * plugged into a particular host. This number may end up matching
   * the host-assigned "device" value in the bus:device:function identifier,
   * but it does not strictly have to and that should not be relied upon.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value port_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getPortIdOrBuilder();

  /**
   * <pre>
   * Physical function index. This may end up matching the host-assigned
   * "function" value in the bus:device:function identifier, but it does not
   * strictly have to and that should not be relied upon.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value physical_function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the physicalFunction field is set.
   */
  boolean hasPhysicalFunction();
  /**
   * <pre>
   * Physical function index. This may end up matching the host-assigned
   * "function" value in the bus:device:function identifier, but it does not
   * strictly have to and that should not be relied upon.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value physical_function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The physicalFunction.
   */
  com.google.protobuf.Int32Value getPhysicalFunction();
  /**
   * <pre>
   * Physical function index. This may end up matching the host-assigned
   * "function" value in the bus:device:function identifier, but it does not
   * strictly have to and that should not be relied upon.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value physical_function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getPhysicalFunctionOrBuilder();

  /**
   * <pre>
   * Virtual function index. 1-based index.
   * The value 0 is reserved to represent the PCI physical "device".
   * This may end up matching the host-assigned "function" value in the
   * bus:device:function identifier, but it does not strictly have to and
   * that should not be relied upon.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value virtual_function = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the virtualFunction field is set.
   */
  boolean hasVirtualFunction();
  /**
   * <pre>
   * Virtual function index. 1-based index.
   * The value 0 is reserved to represent the PCI physical "device".
   * This may end up matching the host-assigned "function" value in the
   * bus:device:function identifier, but it does not strictly have to and
   * that should not be relied upon.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value virtual_function = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The virtualFunction.
   */
  com.google.protobuf.Int32Value getVirtualFunction();
  /**
   * <pre>
   * Virtual function index. 1-based index.
   * The value 0 is reserved to represent the PCI physical "device".
   * This may end up matching the host-assigned "function" value in the
   * bus:device:function identifier, but it does not strictly have to and
   * that should not be relied upon.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value virtual_function = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getVirtualFunctionOrBuilder();
}