// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opicommon.proto

package opi_api.storage.v1;

public final class OpiCommonProto {
  private OpiCommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_PciEndpoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_PciEndpoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017opicommon.proto\022\022opi_api.storage.v1\"S\n" +
      "\013PciEndpoint\022\017\n\007port_id\030\001 \001(\005\022\031\n\021physica" +
      "l_function\030\002 \001(\005\022\030\n\020virtual_function\030\003 \001" +
      "(\005B]\n\022opi_api.storage.v1B\016OpiCommonProto" +
      "P\001Z5github.com/opiproject/opi-api/storag" +
      "e/v1alpha1/gen/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_opi_api_storage_v1_PciEndpoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_storage_v1_PciEndpoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_PciEndpoint_descriptor,
        new java.lang.String[] { "PortId", "PhysicalFunction", "VirtualFunction", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}