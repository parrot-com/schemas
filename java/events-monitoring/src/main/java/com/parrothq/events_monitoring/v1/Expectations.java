// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: events_monitoring/v1/expectations.proto

package com.parrothq.events_monitoring.v1;

public final class Expectations {
  private Expectations() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_events_monitoring_v1_RecordingPreprocessingStarted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_events_monitoring_v1_RecordingPreprocessingStarted_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_events_monitoring_v1_TranscodingAudioCompleted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_events_monitoring_v1_TranscodingAudioCompleted_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_events_monitoring_v1_TranscodingVideoCompleted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_events_monitoring_v1_TranscodingVideoCompleted_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_events_monitoring_v1_RemoveUnwantedAudioCompleted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_events_monitoring_v1_RemoveUnwantedAudioCompleted_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_events_monitoring_v1_RemoveUnwantedVideoCompleted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_events_monitoring_v1_RemoveUnwantedVideoCompleted_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_events_monitoring_v1_BlackOutUnwantedVideoCompleted_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_events_monitoring_v1_BlackOutUnwantedVideoCompleted_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_events_monitoring_v1_ComputeWaveformCompleted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_events_monitoring_v1_ComputeWaveformCompleted_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_events_monitoring_v1_ProcessExhibitsCompleted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_events_monitoring_v1_ProcessExhibitsCompleted_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_events_monitoring_v1_RecordingPreprocessingCompleted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_events_monitoring_v1_RecordingPreprocessingCompleted_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_events_monitoring_v1_RoughDraftStarted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_events_monitoring_v1_RoughDraftStarted_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_events_monitoring_v1_GenerateDocumentsCompleted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_events_monitoring_v1_GenerateDocumentsCompleted_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_events_monitoring_v1_RoughDraftCompleted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_events_monitoring_v1_RoughDraftCompleted_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'events_monitoring/v1/expectations.prot" +
      "o\022\024events_monitoring.v1\"\316\001\n\035RecordingPre" +
      "processingStarted\0225\n\006source\030\001 \001(\0162%.even" +
      "ts_monitoring.v1.RecordingSource\0221\n\004type" +
      "\030\002 \001(\0162#.events_monitoring.v1.RecordingT" +
      "ype\022\021\n\thas_video\030\003 \001(\010\022\024\n\014has_exhibits\030\004" +
      " \001(\010\022\032\n\022has_unwanted_parts\030\005 \001(\010\"\033\n\031Tran" +
      "scodingAudioCompleted\"\033\n\031TranscodingVide" +
      "oCompleted\"\036\n\034RemoveUnwantedAudioComplet" +
      "ed\"\036\n\034RemoveUnwantedVideoCompleted\" \n\036Bl" +
      "ackOutUnwantedVideoCompleted\"\032\n\030ComputeW" +
      "aveformCompleted\"\032\n\030ProcessExhibitsCompl" +
      "eted\"!\n\037RecordingPreprocessingCompleted\"" +
      "1\n\021RoughDraftStarted\022\034\n\024audio_length_sec" +
      "onds\030\001 \001(\005\"\034\n\032GenerateDocumentsCompleted" +
      "\"%\n\023RoughDraftCompleted\022\016\n\006status\030\001 \001(\t*" +
      "F\n\017RecordingSource\022\034\n\030RECORDING_SOURCE_U" +
      "NKNOWN\020\000\022\n\n\006UPLOAD\020\001\022\t\n\005EVENT\020\002*F\n\rRecor" +
      "dingType\022\032\n\026RECORDING_TYPE_UNKNOWN\020\000\022\r\n\t" +
      "RESERVOIR\020\001\022\n\n\006CLIENT\020\002B%\n!com.parrothq." +
      "events_monitoring.v1P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_events_monitoring_v1_RecordingPreprocessingStarted_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_events_monitoring_v1_RecordingPreprocessingStarted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_events_monitoring_v1_RecordingPreprocessingStarted_descriptor,
        new java.lang.String[] { "Source", "Type", "HasVideo", "HasExhibits", "HasUnwantedParts", });
    internal_static_events_monitoring_v1_TranscodingAudioCompleted_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_events_monitoring_v1_TranscodingAudioCompleted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_events_monitoring_v1_TranscodingAudioCompleted_descriptor,
        new java.lang.String[] { });
    internal_static_events_monitoring_v1_TranscodingVideoCompleted_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_events_monitoring_v1_TranscodingVideoCompleted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_events_monitoring_v1_TranscodingVideoCompleted_descriptor,
        new java.lang.String[] { });
    internal_static_events_monitoring_v1_RemoveUnwantedAudioCompleted_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_events_monitoring_v1_RemoveUnwantedAudioCompleted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_events_monitoring_v1_RemoveUnwantedAudioCompleted_descriptor,
        new java.lang.String[] { });
    internal_static_events_monitoring_v1_RemoveUnwantedVideoCompleted_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_events_monitoring_v1_RemoveUnwantedVideoCompleted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_events_monitoring_v1_RemoveUnwantedVideoCompleted_descriptor,
        new java.lang.String[] { });
    internal_static_events_monitoring_v1_BlackOutUnwantedVideoCompleted_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_events_monitoring_v1_BlackOutUnwantedVideoCompleted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_events_monitoring_v1_BlackOutUnwantedVideoCompleted_descriptor,
        new java.lang.String[] { });
    internal_static_events_monitoring_v1_ComputeWaveformCompleted_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_events_monitoring_v1_ComputeWaveformCompleted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_events_monitoring_v1_ComputeWaveformCompleted_descriptor,
        new java.lang.String[] { });
    internal_static_events_monitoring_v1_ProcessExhibitsCompleted_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_events_monitoring_v1_ProcessExhibitsCompleted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_events_monitoring_v1_ProcessExhibitsCompleted_descriptor,
        new java.lang.String[] { });
    internal_static_events_monitoring_v1_RecordingPreprocessingCompleted_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_events_monitoring_v1_RecordingPreprocessingCompleted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_events_monitoring_v1_RecordingPreprocessingCompleted_descriptor,
        new java.lang.String[] { });
    internal_static_events_monitoring_v1_RoughDraftStarted_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_events_monitoring_v1_RoughDraftStarted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_events_monitoring_v1_RoughDraftStarted_descriptor,
        new java.lang.String[] { "AudioLengthSeconds", });
    internal_static_events_monitoring_v1_GenerateDocumentsCompleted_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_events_monitoring_v1_GenerateDocumentsCompleted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_events_monitoring_v1_GenerateDocumentsCompleted_descriptor,
        new java.lang.String[] { });
    internal_static_events_monitoring_v1_RoughDraftCompleted_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_events_monitoring_v1_RoughDraftCompleted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_events_monitoring_v1_RoughDraftCompleted_descriptor,
        new java.lang.String[] { "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
