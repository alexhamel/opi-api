// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_aio.proto

package opi_api.storage.v1;

public final class BackendAioProto {
  private BackendAioProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_AioVolume_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_AioVolume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_CreateAioVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_CreateAioVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_DeleteAioVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_DeleteAioVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_UpdateAioVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_UpdateAioVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListAioVolumesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListAioVolumesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListAioVolumesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListAioVolumesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_GetAioVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_GetAioVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_StatsAioVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_StatsAioVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_StatsAioVolumeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_StatsAioVolumeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021backend_aio.proto\022\022opi_api.storage.v1\032" +
      "\027google/api/client.proto\032\031google/api/res" +
      "ource.proto\032\033google/protobuf/empty.proto" +
      "\032\034google/api/annotations.proto\032\037google/a" +
      "pi/field_behavior.proto\032 google/protobuf" +
      "/field_mask.proto\032\017opicommon.proto\032\nuuid" +
      ".proto\"\211\002\n\tAioVolume\0222\n\004name\030\001 \001(\tB$\340A\010\372" +
      "A\036\n\034opi_api.storage.v1/AioVolume\022\027\n\nbloc" +
      "k_size\030\002 \001(\003B\003\340A\001\022\031\n\014blocks_count\030\003 \001(\003B" +
      "\003\340A\001\022*\n\004uuid\030\004 \001(\0132\027.opi_api.common.v1.U" +
      "uidB\003\340A\001\022\025\n\010filename\030\005 \001(\tB\003\340A\002:Q\352AN\n st" +
      "orage.opiproject.org/AioVolume\022\023aioVolum" +
      "es/{volume}*\naioVolumes2\taioVolume\"l\n\026Cr" +
      "eateAioVolumeRequest\0226\n\naio_volume\030\001 \001(\013" +
      "2\035.opi_api.storage.v1.AioVolumeB\003\340A\002\022\032\n\r" +
      "aio_volume_id\030\002 \001(\tB\003\340A\001\"h\n\026DeleteAioVol" +
      "umeRequest\0222\n\004name\030\001 \001(\tB$\340A\002\372A\036\n\034opi_ap" +
      "i.storage.v1/AioVolume\022\032\n\rallow_missing\030" +
      "\002 \001(\010B\003\340A\001\"\242\001\n\026UpdateAioVolumeRequest\0226\n" +
      "\naio_volume\030\001 \001(\0132\035.opi_api.storage.v1.A" +
      "ioVolumeB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.goo" +
      "gle.protobuf.FieldMaskB\003\340A\001\022\032\n\rallow_mis" +
      "sing\030\003 \001(\010B\003\340A\001\"~\n\025ListAioVolumesRequest" +
      "\0224\n\006parent\030\001 \001(\tB$\340A\002\372A\036\n\034opi_api.storag" +
      "e.v1/AioVolume\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027" +
      "\n\npage_token\030\003 \001(\tB\003\340A\001\"e\n\026ListAioVolume" +
      "sResponse\0222\n\013aio_volumes\030\001 \003(\0132\035.opi_api" +
      ".storage.v1.AioVolume\022\027\n\017next_page_token" +
      "\030\002 \001(\t\"I\n\023GetAioVolumeRequest\0222\n\004name\030\001 " +
      "\001(\tB$\340A\002\372A\036\n\034opi_api.storage.v1/AioVolum" +
      "e\"K\n\025StatsAioVolumeRequest\0222\n\004name\030\001 \001(\t" +
      "B$\340A\002\372A\036\n\034opi_api.storage.v1/AioVolume\"H" +
      "\n\026StatsAioVolumeResponse\022.\n\005stats\030\001 \001(\0132" +
      "\037.opi_api.storage.v1.VolumeStats2\213\007\n\020Aio" +
      "VolumeService\022\233\001\n\017CreateAioVolume\022*.opi_" +
      "api.storage.v1.CreateAioVolumeRequest\032\035." +
      "opi_api.storage.v1.AioVolume\"=\202\323\344\223\002\034\"\016/v" +
      "1/aioVolumes:\naio_volume\332A\030aio_volume,ai" +
      "o_volume_id\022}\n\017DeleteAioVolume\022*.opi_api" +
      ".storage.v1.DeleteAioVolumeRequest\032\026.goo" +
      "gle.protobuf.Empty\"&\202\323\344\223\002\031*\027/v1/{name=ai" +
      "oVolumes/*}\332A\004name\022\255\001\n\017UpdateAioVolume\022*" +
      ".opi_api.storage.v1.UpdateAioVolumeReque" +
      "st\032\035.opi_api.storage.v1.AioVolume\"O\202\323\344\223\002" +
      "02\"/v1/{aio_volume.name=aioVolumes/*}:\na" +
      "io_volume\332A\026aio_volume,update_mask\022\221\001\n\016L" +
      "istAioVolumes\022).opi_api.storage.v1.ListA" +
      "ioVolumesRequest\032*.opi_api.storage.v1.Li" +
      "stAioVolumesResponse\"(\202\323\344\223\002\031\022\027/v1/{paren" +
      "t=subsystems}\332A\006parent\022~\n\014GetAioVolume\022\'" +
      ".opi_api.storage.v1.GetAioVolumeRequest\032" +
      "\035.opi_api.storage.v1.AioVolume\"&\202\323\344\223\002\031\022\027" +
      "/v1/{name=aioVolumes/*}\332A\004name\022\225\001\n\016Stats" +
      "AioVolume\022).opi_api.storage.v1.StatsAioV" +
      "olumeRequest\032*.opi_api.storage.v1.StatsA" +
      "ioVolumeResponse\",\202\323\344\223\002\037\022\035/v1/{name=aioV" +
      "olumes/*}:stats\332A\004nameB^\n\022opi_api.storag" +
      "e.v1B\017BackendAioProtoP\001Z5github.com/opip" +
      "roject/opi-api/storage/v1alpha1/gen/gob\006" +
      "proto3"
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
          opi_api.storage.v1.OpiCommonProto.getDescriptor(),
          opi_api.common.v1.UuidProto.getDescriptor(),
        });
    internal_static_opi_api_storage_v1_AioVolume_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_storage_v1_AioVolume_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_AioVolume_descriptor,
        new java.lang.String[] { "Name", "BlockSize", "BlocksCount", "Uuid", "Filename", });
    internal_static_opi_api_storage_v1_CreateAioVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_storage_v1_CreateAioVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_CreateAioVolumeRequest_descriptor,
        new java.lang.String[] { "AioVolume", "AioVolumeId", });
    internal_static_opi_api_storage_v1_DeleteAioVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_storage_v1_DeleteAioVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_DeleteAioVolumeRequest_descriptor,
        new java.lang.String[] { "Name", "AllowMissing", });
    internal_static_opi_api_storage_v1_UpdateAioVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_storage_v1_UpdateAioVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_UpdateAioVolumeRequest_descriptor,
        new java.lang.String[] { "AioVolume", "UpdateMask", "AllowMissing", });
    internal_static_opi_api_storage_v1_ListAioVolumesRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_storage_v1_ListAioVolumesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListAioVolumesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_opi_api_storage_v1_ListAioVolumesResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_storage_v1_ListAioVolumesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListAioVolumesResponse_descriptor,
        new java.lang.String[] { "AioVolumes", "NextPageToken", });
    internal_static_opi_api_storage_v1_GetAioVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_storage_v1_GetAioVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_GetAioVolumeRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_opi_api_storage_v1_StatsAioVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_storage_v1_StatsAioVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_StatsAioVolumeRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_opi_api_storage_v1_StatsAioVolumeResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opi_api_storage_v1_StatsAioVolumeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_StatsAioVolumeResponse_descriptor,
        new java.lang.String[] { "Stats", });
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
    opi_api.storage.v1.OpiCommonProto.getDescriptor();
    opi_api.common.v1.UuidProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
