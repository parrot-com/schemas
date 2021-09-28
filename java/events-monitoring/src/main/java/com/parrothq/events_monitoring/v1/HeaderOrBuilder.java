// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: parrotschemas/events_monitoring/v1/events.proto

package com.parrothq.events_monitoring.v1;

public interface HeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:parrotschemas.events_monitoring.v1.Header)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of the event in spec. Used for serializing.
   * </pre>
   *
   * <code>string event_type = 1;</code>
   * @return The eventType.
   */
  java.lang.String getEventType();
  /**
   * <pre>
   * Type of the event in spec. Used for serializing.
   * </pre>
   *
   * <code>string event_type = 1;</code>
   * @return The bytes for eventType.
   */
  com.google.protobuf.ByteString
      getEventTypeBytes();

  /**
   * <pre>
   * Unique identifier value that allow reference to a particular event chain.
   * </pre>
   *
   * <code>string correlation_id = 2;</code>
   * @return The correlationId.
   */
  java.lang.String getCorrelationId();
  /**
   * <pre>
   * Unique identifier value that allow reference to a particular event chain.
   * </pre>
   *
   * <code>string correlation_id = 2;</code>
   * @return The bytes for correlationId.
   */
  com.google.protobuf.ByteString
      getCorrelationIdBytes();

  /**
   * <pre>
   * Time of the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 3;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <pre>
   * Time of the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 3;</code>
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <pre>
   * Time of the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <pre>
   * Silent events do NOT trigger notifications. Useful for newly added (untested) expectations.
   * </pre>
   *
   * <code>bool silent = 4;</code>
   * @return The silent.
   */
  boolean getSilent();
}
