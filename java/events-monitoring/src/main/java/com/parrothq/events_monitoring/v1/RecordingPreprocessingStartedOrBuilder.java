// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: parrotschemas/events_monitoring/v1/expectations.proto

package com.parrothq.events_monitoring.v1;

public interface RecordingPreprocessingStartedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:parrotschemas.events_monitoring.v1.RecordingPreprocessingStarted)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.parrotschemas.events_monitoring.v1.RecordingSource source = 1;</code>
   * @return The enum numeric value on the wire for source.
   */
  int getSourceValue();
  /**
   * <code>.parrotschemas.events_monitoring.v1.RecordingSource source = 1;</code>
   * @return The source.
   */
  com.parrothq.events_monitoring.v1.RecordingSource getSource();

  /**
   * <code>.parrotschemas.events_monitoring.v1.RecordingType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.parrotschemas.events_monitoring.v1.RecordingType type = 2;</code>
   * @return The type.
   */
  com.parrothq.events_monitoring.v1.RecordingType getType();

  /**
   * <code>bool has_video = 3;</code>
   * @return The hasVideo.
   */
  boolean getHasVideo();

  /**
   * <code>bool has_exhibits = 4;</code>
   * @return The hasExhibits.
   */
  boolean getHasExhibits();

  /**
   * <code>bool has_unwanted_parts = 5;</code>
   * @return The hasUnwantedParts.
   */
  boolean getHasUnwantedParts();
}
