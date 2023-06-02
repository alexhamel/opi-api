// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_null.proto

package opi_api.storage.v1;

public final class BackendNullProto {
  private BackendNullProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebug_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebug_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_CreateNullDebugRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_CreateNullDebugRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_DeleteNullDebugRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_DeleteNullDebugRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_UpdateNullDebugRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_UpdateNullDebugRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListNullDebugsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListNullDebugsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListNullDebugsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListNullDebugsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_GetNullDebugRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_GetNullDebugRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugStatsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugStatsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugStatsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022backend_null.proto\022\022opi_api.storage.v1" +
      "\032\027google/api/client.proto\032\031google/api/re" +
      "source.proto\032\033google/protobuf/empty.prot" +
      "o\032\034google/api/annotations.proto\032\037google/" +
      "api/field_behavior.proto\032 google/protobu" +
      "f/field_mask.proto\032\020object_key.proto\032\017op" +
      "icommon.proto\032\nuuid.proto\"\243\001\n\tNullDebug\022" +
      "\014\n\004name\030\001 \001(\t\022\022\n\nblock_size\030\002 \001(\003\022\024\n\014blo" +
      "cks_count\030\003 \001(\003\022%\n\004uuid\030\004 \001(\0132\027.opi_api." +
      "common.v1.Uuid:7\352A4\n storage.opiproject." +
      "org/NullDebug\022\020volumes/{volume}\"g\n\026Creat" +
      "eNullDebugRequest\0226\n\nnull_debug\030\002 \001(\0132\035." +
      "opi_api.storage.v1.NullDebugB\003\340A\002\022\025\n\rnul" +
      "l_debug_id\030\003 \001(\t\"c\n\026DeleteNullDebugReque" +
      "st\0222\n\004name\030\001 \001(\tB$\340A\002\372A\036\n\034opi_api.storag" +
      "e.v1/NullDebug\022\025\n\rallow_missing\030\002 \001(\010\"\223\001" +
      "\n\026UpdateNullDebugRequest\0221\n\nnull_debug\030\001" +
      " \001(\0132\035.opi_api.storage.v1.NullDebug\022/\n\013u" +
      "pdate_mask\030\002 \001(\0132\032.google.protobuf.Field" +
      "Mask\022\025\n\rallow_missing\030\003 \001(\010\"t\n\025ListNullD" +
      "ebugsRequest\0224\n\006parent\030\001 \001(\tB$\340A\002\372A\036\n\034op" +
      "i_api.storage.v1/NullDebug\022\021\n\tpage_size\030" +
      "\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"e\n\026ListNullDeb" +
      "ugsResponse\0222\n\013null_debugs\030\001 \003(\0132\035.opi_a" +
      "pi.storage.v1.NullDebug\022\027\n\017next_page_tok" +
      "en\030\002 \001(\t\"I\n\023GetNullDebugRequest\0222\n\004name\030" +
      "\001 \001(\tB$\340A\002\372A\036\n\034opi_api.storage.v1/NullDe" +
      "bug\"E\n\025NullDebugStatsRequest\022,\n\006handle\030\001" +
      " \001(\0132\034.opi_api.common.v1.ObjectKey\"v\n\026Nu" +
      "llDebugStatsResponse\022,\n\006handle\030\001 \001(\0132\034.o" +
      "pi_api.common.v1.ObjectKey\022.\n\005stats\030\002 \001(" +
      "\0132\037.opi_api.storage.v1.VolumeStats2\357\006\n\020N" +
      "ullDebugService\022\230\001\n\017CreateNullDebug\022*.op" +
      "i_api.storage.v1.CreateNullDebugRequest\032" +
      "\035.opi_api.storage.v1.NullDebug\":\202\323\344\223\002\031\"\013" +
      "/v1/volumes:\nnull_debug\332A\030null_debug,nul" +
      "l_debug_id\022\207\001\n\017DeleteNullDebug\022*.opi_api" +
      ".storage.v1.DeleteNullDebugRequest\032\026.goo" +
      "gle.protobuf.Empty\"0\202\323\344\223\002#*!/v1/{name=su" +
      "bsystems}/{subsystem}\332A\004name\022\253\001\n\017UpdateN" +
      "ullDebug\022*.opi_api.storage.v1.UpdateNull" +
      "DebugRequest\032\035.opi_api.storage.v1.NullDe" +
      "bug\"M\202\323\344\223\002.2 /v1/{null_debug.name=subsys" +
      "tems}:\nnull_debug\332A\026null_debug,update_ma" +
      "sk\022\221\001\n\016ListNullDebugs\022).opi_api.storage." +
      "v1.ListNullDebugsRequest\032*.opi_api.stora" +
      "ge.v1.ListNullDebugsResponse\"(\202\323\344\223\002\031\022\027/v" +
      "1/{parent=subsystems}\332A\006parent\022\210\001\n\014GetNu" +
      "llDebug\022\'.opi_api.storage.v1.GetNullDebu" +
      "gRequest\032\035.opi_api.storage.v1.NullDebug\"" +
      "0\202\323\344\223\002#\022!/v1/{name=subsystems}/{subsyste" +
      "m}\332A\004name\022i\n\016NullDebugStats\022).opi_api.st" +
      "orage.v1.NullDebugStatsRequest\032*.opi_api" +
      ".storage.v1.NullDebugStatsResponse\"\000B_\n\022" +
      "opi_api.storage.v1B\020BackendNullProtoP\001Z5" +
      "github.com/opiproject/opi-api/storage/v1" +
      "alpha1/gen/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          opi_api.common.v1.ObjectKeyProto.getDescriptor(),
          opi_api.storage.v1.OpiCommonProto.getDescriptor(),
          opi_api.common.v1.UuidProto.getDescriptor(),
        });
    internal_static_opi_api_storage_v1_NullDebug_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_storage_v1_NullDebug_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebug_descriptor,
        new java.lang.String[] { "Name", "BlockSize", "BlocksCount", "Uuid", });
    internal_static_opi_api_storage_v1_CreateNullDebugRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_storage_v1_CreateNullDebugRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_CreateNullDebugRequest_descriptor,
        new java.lang.String[] { "NullDebug", "NullDebugId", });
    internal_static_opi_api_storage_v1_DeleteNullDebugRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_storage_v1_DeleteNullDebugRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_DeleteNullDebugRequest_descriptor,
        new java.lang.String[] { "Name", "AllowMissing", });
    internal_static_opi_api_storage_v1_UpdateNullDebugRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_storage_v1_UpdateNullDebugRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_UpdateNullDebugRequest_descriptor,
        new java.lang.String[] { "NullDebug", "UpdateMask", "AllowMissing", });
    internal_static_opi_api_storage_v1_ListNullDebugsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_storage_v1_ListNullDebugsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListNullDebugsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_opi_api_storage_v1_ListNullDebugsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_storage_v1_ListNullDebugsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListNullDebugsResponse_descriptor,
        new java.lang.String[] { "NullDebugs", "NextPageToken", });
    internal_static_opi_api_storage_v1_GetNullDebugRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_storage_v1_GetNullDebugRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_GetNullDebugRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_opi_api_storage_v1_NullDebugStatsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_storage_v1_NullDebugStatsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugStatsRequest_descriptor,
        new java.lang.String[] { "Handle", });
    internal_static_opi_api_storage_v1_NullDebugStatsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opi_api_storage_v1_NullDebugStatsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugStatsResponse_descriptor,
        new java.lang.String[] { "Handle", "Stats", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ClientProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    opi_api.common.v1.ObjectKeyProto.getDescriptor();
    opi_api.storage.v1.OpiCommonProto.getDescriptor();
    opi_api.common.v1.UuidProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
