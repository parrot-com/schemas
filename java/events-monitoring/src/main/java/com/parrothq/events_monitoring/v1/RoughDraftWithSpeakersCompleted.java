// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: events_monitoring/v1/expectations.proto

package com.parrothq.events_monitoring.v1;

/**
 * Protobuf type {@code events_monitoring.v1.RoughDraftWithSpeakersCompleted}
 */
public final class RoughDraftWithSpeakersCompleted extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:events_monitoring.v1.RoughDraftWithSpeakersCompleted)
    RoughDraftWithSpeakersCompletedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RoughDraftWithSpeakersCompleted.newBuilder() to construct.
  private RoughDraftWithSpeakersCompleted(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RoughDraftWithSpeakersCompleted() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RoughDraftWithSpeakersCompleted();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RoughDraftWithSpeakersCompleted(
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
    return com.parrothq.events_monitoring.v1.Expectations.internal_static_events_monitoring_v1_RoughDraftWithSpeakersCompleted_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.parrothq.events_monitoring.v1.Expectations.internal_static_events_monitoring_v1_RoughDraftWithSpeakersCompleted_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted.class, com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted.Builder.class);
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted)) {
      return super.equals(obj);
    }
    com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted other = (com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted parseFrom(
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
  public static Builder newBuilder(com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted prototype) {
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
   * Protobuf type {@code events_monitoring.v1.RoughDraftWithSpeakersCompleted}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:events_monitoring.v1.RoughDraftWithSpeakersCompleted)
      com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompletedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.parrothq.events_monitoring.v1.Expectations.internal_static_events_monitoring_v1_RoughDraftWithSpeakersCompleted_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.parrothq.events_monitoring.v1.Expectations.internal_static_events_monitoring_v1_RoughDraftWithSpeakersCompleted_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted.class, com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted.Builder.class);
    }

    // Construct using com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.parrothq.events_monitoring.v1.Expectations.internal_static_events_monitoring_v1_RoughDraftWithSpeakersCompleted_descriptor;
    }

    @java.lang.Override
    public com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted getDefaultInstanceForType() {
      return com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted.getDefaultInstance();
    }

    @java.lang.Override
    public com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted build() {
      com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted buildPartial() {
      com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted result = new com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted(this);
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
      if (other instanceof com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted) {
        return mergeFrom((com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted other) {
      if (other == com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted.getDefaultInstance()) return this;
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
      com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
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


    // @@protoc_insertion_point(builder_scope:events_monitoring.v1.RoughDraftWithSpeakersCompleted)
  }

  // @@protoc_insertion_point(class_scope:events_monitoring.v1.RoughDraftWithSpeakersCompleted)
  private static final com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted();
  }

  public static com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RoughDraftWithSpeakersCompleted>
      PARSER = new com.google.protobuf.AbstractParser<RoughDraftWithSpeakersCompleted>() {
    @java.lang.Override
    public RoughDraftWithSpeakersCompleted parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RoughDraftWithSpeakersCompleted(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RoughDraftWithSpeakersCompleted> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RoughDraftWithSpeakersCompleted> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.parrothq.events_monitoring.v1.RoughDraftWithSpeakersCompleted getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

