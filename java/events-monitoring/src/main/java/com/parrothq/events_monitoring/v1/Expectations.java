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
    internal_static_events_monitoring_v1_LiveTranscriptRoughDraftCompleted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_events_monitoring_v1_LiveTranscriptRoughDraftCompleted_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_events_monitoring_v1_RoughDraftCompleted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_events_monitoring_v1_RoughDraftCompleted_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_events_monitoring_v1_RoughDraftWithSpeakersCompleted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_events_monitoring_v1_RoughDraftWithSpeakersCompleted_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'events_monitoring/v1/expectations.prot" +
      "o\022\024events_monitoring.v1\"t\n\035RecordingPrep" +
      "rocessingStarted\022\034\n\024audio_length_seconds" +
      "\030\001 \001(\005\0225\n\006source\030\002 \001(\0162%.events_monitori" +
      "ng.v1.RecordingSource\"#\n!LiveTranscriptR" +
      "oughDraftCompleted\"\025\n\023RoughDraftComplete" +
      "d\"!\n\037RoughDraftWithSpeakersCompleted*K\n\017" +
      "RecordingSource\022\034\n\030RECORDING_SOURCE_UNKN" +
      "OWN\020\000\022\n\n\006UPLOAD\020\001\022\016\n\nDEPOSITION\020\002B%\n!com" +
      ".parrothq.events_monitoring.v1P\001b\006proto3"
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
        new java.lang.String[] { "AudioLengthSeconds", "Source", });
    internal_static_events_monitoring_v1_LiveTranscriptRoughDraftCompleted_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_events_monitoring_v1_LiveTranscriptRoughDraftCompleted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_events_monitoring_v1_LiveTranscriptRoughDraftCompleted_descriptor,
        new java.lang.String[] { });
    internal_static_events_monitoring_v1_RoughDraftCompleted_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_events_monitoring_v1_RoughDraftCompleted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_events_monitoring_v1_RoughDraftCompleted_descriptor,
        new java.lang.String[] { });
    internal_static_events_monitoring_v1_RoughDraftWithSpeakersCompleted_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_events_monitoring_v1_RoughDraftWithSpeakersCompleted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_events_monitoring_v1_RoughDraftWithSpeakersCompleted_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
