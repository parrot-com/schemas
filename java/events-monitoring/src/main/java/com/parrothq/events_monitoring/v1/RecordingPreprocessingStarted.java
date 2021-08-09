// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: events_monitoring/v1/expectations.proto

package com.parrothq.events_monitoring.v1;

/**
 * Protobuf type {@code events_monitoring.v1.RecordingPreprocessingStarted}
 */
public final class RecordingPreprocessingStarted extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:events_monitoring.v1.RecordingPreprocessingStarted)
    RecordingPreprocessingStartedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecordingPreprocessingStarted.newBuilder() to construct.
  private RecordingPreprocessingStarted(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecordingPreprocessingStarted() {
    source_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RecordingPreprocessingStarted();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RecordingPreprocessingStarted(
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
          case 8: {

            audioLengthSeconds_ = input.readInt32();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            source_ = rawValue;
            break;
          }
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
    return com.parrothq.events_monitoring.v1.Expectations.internal_static_events_monitoring_v1_RecordingPreprocessingStarted_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.parrothq.events_monitoring.v1.Expectations.internal_static_events_monitoring_v1_RecordingPreprocessingStarted_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted.class, com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted.Builder.class);
  }

  public static final int AUDIO_LENGTH_SECONDS_FIELD_NUMBER = 1;
  private int audioLengthSeconds_;
  /**
   * <code>int32 audio_length_seconds = 1;</code>
   * @return The audioLengthSeconds.
   */
  @java.lang.Override
  public int getAudioLengthSeconds() {
    return audioLengthSeconds_;
  }

  public static final int SOURCE_FIELD_NUMBER = 2;
  private int source_;
  /**
   * <code>.events_monitoring.v1.RecordingSource source = 2;</code>
   * @return The enum numeric value on the wire for source.
   */
  @java.lang.Override public int getSourceValue() {
    return source_;
  }
  /**
   * <code>.events_monitoring.v1.RecordingSource source = 2;</code>
   * @return The source.
   */
  @java.lang.Override public com.parrothq.events_monitoring.v1.RecordingSource getSource() {
    @SuppressWarnings("deprecation")
    com.parrothq.events_monitoring.v1.RecordingSource result = com.parrothq.events_monitoring.v1.RecordingSource.valueOf(source_);
    return result == null ? com.parrothq.events_monitoring.v1.RecordingSource.UNRECOGNIZED : result;
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
    if (audioLengthSeconds_ != 0) {
      output.writeInt32(1, audioLengthSeconds_);
    }
    if (source_ != com.parrothq.events_monitoring.v1.RecordingSource.RECORDING_SOURCE_UNKNOWN.getNumber()) {
      output.writeEnum(2, source_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (audioLengthSeconds_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, audioLengthSeconds_);
    }
    if (source_ != com.parrothq.events_monitoring.v1.RecordingSource.RECORDING_SOURCE_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, source_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted)) {
      return super.equals(obj);
    }
    com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted other = (com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted) obj;

    if (getAudioLengthSeconds()
        != other.getAudioLengthSeconds()) return false;
    if (source_ != other.source_) return false;
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
    hash = (37 * hash) + AUDIO_LENGTH_SECONDS_FIELD_NUMBER;
    hash = (53 * hash) + getAudioLengthSeconds();
    hash = (37 * hash) + SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + source_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted parseFrom(
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
  public static Builder newBuilder(com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted prototype) {
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
   * Protobuf type {@code events_monitoring.v1.RecordingPreprocessingStarted}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:events_monitoring.v1.RecordingPreprocessingStarted)
      com.parrothq.events_monitoring.v1.RecordingPreprocessingStartedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.parrothq.events_monitoring.v1.Expectations.internal_static_events_monitoring_v1_RecordingPreprocessingStarted_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.parrothq.events_monitoring.v1.Expectations.internal_static_events_monitoring_v1_RecordingPreprocessingStarted_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted.class, com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted.Builder.class);
    }

    // Construct using com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted.newBuilder()
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
      audioLengthSeconds_ = 0;

      source_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.parrothq.events_monitoring.v1.Expectations.internal_static_events_monitoring_v1_RecordingPreprocessingStarted_descriptor;
    }

    @java.lang.Override
    public com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted getDefaultInstanceForType() {
      return com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted.getDefaultInstance();
    }

    @java.lang.Override
    public com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted build() {
      com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted buildPartial() {
      com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted result = new com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted(this);
      result.audioLengthSeconds_ = audioLengthSeconds_;
      result.source_ = source_;
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
      if (other instanceof com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted) {
        return mergeFrom((com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted other) {
      if (other == com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted.getDefaultInstance()) return this;
      if (other.getAudioLengthSeconds() != 0) {
        setAudioLengthSeconds(other.getAudioLengthSeconds());
      }
      if (other.source_ != 0) {
        setSourceValue(other.getSourceValue());
      }
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
      com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int audioLengthSeconds_ ;
    /**
     * <code>int32 audio_length_seconds = 1;</code>
     * @return The audioLengthSeconds.
     */
    @java.lang.Override
    public int getAudioLengthSeconds() {
      return audioLengthSeconds_;
    }
    /**
     * <code>int32 audio_length_seconds = 1;</code>
     * @param value The audioLengthSeconds to set.
     * @return This builder for chaining.
     */
    public Builder setAudioLengthSeconds(int value) {
      
      audioLengthSeconds_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 audio_length_seconds = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAudioLengthSeconds() {
      
      audioLengthSeconds_ = 0;
      onChanged();
      return this;
    }

    private int source_ = 0;
    /**
     * <code>.events_monitoring.v1.RecordingSource source = 2;</code>
     * @return The enum numeric value on the wire for source.
     */
    @java.lang.Override public int getSourceValue() {
      return source_;
    }
    /**
     * <code>.events_monitoring.v1.RecordingSource source = 2;</code>
     * @param value The enum numeric value on the wire for source to set.
     * @return This builder for chaining.
     */
    public Builder setSourceValue(int value) {
      
      source_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.events_monitoring.v1.RecordingSource source = 2;</code>
     * @return The source.
     */
    @java.lang.Override
    public com.parrothq.events_monitoring.v1.RecordingSource getSource() {
      @SuppressWarnings("deprecation")
      com.parrothq.events_monitoring.v1.RecordingSource result = com.parrothq.events_monitoring.v1.RecordingSource.valueOf(source_);
      return result == null ? com.parrothq.events_monitoring.v1.RecordingSource.UNRECOGNIZED : result;
    }
    /**
     * <code>.events_monitoring.v1.RecordingSource source = 2;</code>
     * @param value The source to set.
     * @return This builder for chaining.
     */
    public Builder setSource(com.parrothq.events_monitoring.v1.RecordingSource value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      source_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.events_monitoring.v1.RecordingSource source = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSource() {
      
      source_ = 0;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:events_monitoring.v1.RecordingPreprocessingStarted)
  }

  // @@protoc_insertion_point(class_scope:events_monitoring.v1.RecordingPreprocessingStarted)
  private static final com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted();
  }

  public static com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecordingPreprocessingStarted>
      PARSER = new com.google.protobuf.AbstractParser<RecordingPreprocessingStarted>() {
    @java.lang.Override
    public RecordingPreprocessingStarted parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RecordingPreprocessingStarted(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RecordingPreprocessingStarted> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecordingPreprocessingStarted> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.parrothq.events_monitoring.v1.RecordingPreprocessingStarted getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

