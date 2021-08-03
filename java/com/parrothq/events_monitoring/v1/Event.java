// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: events_monitoring/v1/events.proto

package com.parrothq.events_monitoring.v1;

/**
 * Protobuf type {@code events_monitoring.v1.Event}
 */
public final class Event extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:events_monitoring.v1.Event)
    EventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Event.newBuilder() to construct.
  private Event(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Event() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Event();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Event(
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
          case 10: {
            com.parrothq.events_monitoring.v1.Header.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(com.parrothq.events_monitoring.v1.Header.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.Any.Builder subBuilder = null;
            if (spec_ != null) {
              subBuilder = spec_.toBuilder();
            }
            spec_ = input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(spec_);
              spec_ = subBuilder.buildPartial();
            }

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
    return com.parrothq.events_monitoring.v1.Events.internal_static_events_monitoring_v1_Event_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.parrothq.events_monitoring.v1.Events.internal_static_events_monitoring_v1_Event_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.parrothq.events_monitoring.v1.Event.class, com.parrothq.events_monitoring.v1.Event.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private com.parrothq.events_monitoring.v1.Header header_;
  /**
   * <code>.events_monitoring.v1.Header header = 1;</code>
   * @return Whether the header field is set.
   */
  @java.lang.Override
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <code>.events_monitoring.v1.Header header = 1;</code>
   * @return The header.
   */
  @java.lang.Override
  public com.parrothq.events_monitoring.v1.Header getHeader() {
    return header_ == null ? com.parrothq.events_monitoring.v1.Header.getDefaultInstance() : header_;
  }
  /**
   * <code>.events_monitoring.v1.Header header = 1;</code>
   */
  @java.lang.Override
  public com.parrothq.events_monitoring.v1.HeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int SPEC_FIELD_NUMBER = 2;
  private com.google.protobuf.Any spec_;
  /**
   * <code>.google.protobuf.Any spec = 2;</code>
   * @return Whether the spec field is set.
   */
  @java.lang.Override
  public boolean hasSpec() {
    return spec_ != null;
  }
  /**
   * <code>.google.protobuf.Any spec = 2;</code>
   * @return The spec.
   */
  @java.lang.Override
  public com.google.protobuf.Any getSpec() {
    return spec_ == null ? com.google.protobuf.Any.getDefaultInstance() : spec_;
  }
  /**
   * <code>.google.protobuf.Any spec = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getSpecOrBuilder() {
    return getSpec();
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
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    if (spec_ != null) {
      output.writeMessage(2, getSpec());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    if (spec_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSpec());
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
    if (!(obj instanceof com.parrothq.events_monitoring.v1.Event)) {
      return super.equals(obj);
    }
    com.parrothq.events_monitoring.v1.Event other = (com.parrothq.events_monitoring.v1.Event) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (hasSpec() != other.hasSpec()) return false;
    if (hasSpec()) {
      if (!getSpec()
          .equals(other.getSpec())) return false;
    }
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
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (hasSpec()) {
      hash = (37 * hash) + SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getSpec().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.parrothq.events_monitoring.v1.Event parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.parrothq.events_monitoring.v1.Event parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.parrothq.events_monitoring.v1.Event parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.parrothq.events_monitoring.v1.Event parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.parrothq.events_monitoring.v1.Event parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.parrothq.events_monitoring.v1.Event parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.parrothq.events_monitoring.v1.Event parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.parrothq.events_monitoring.v1.Event parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.parrothq.events_monitoring.v1.Event parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.parrothq.events_monitoring.v1.Event parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.parrothq.events_monitoring.v1.Event parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.parrothq.events_monitoring.v1.Event parseFrom(
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
  public static Builder newBuilder(com.parrothq.events_monitoring.v1.Event prototype) {
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
   * Protobuf type {@code events_monitoring.v1.Event}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:events_monitoring.v1.Event)
      com.parrothq.events_monitoring.v1.EventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.parrothq.events_monitoring.v1.Events.internal_static_events_monitoring_v1_Event_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.parrothq.events_monitoring.v1.Events.internal_static_events_monitoring_v1_Event_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.parrothq.events_monitoring.v1.Event.class, com.parrothq.events_monitoring.v1.Event.Builder.class);
    }

    // Construct using com.parrothq.events_monitoring.v1.Event.newBuilder()
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
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      if (specBuilder_ == null) {
        spec_ = null;
      } else {
        spec_ = null;
        specBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.parrothq.events_monitoring.v1.Events.internal_static_events_monitoring_v1_Event_descriptor;
    }

    @java.lang.Override
    public com.parrothq.events_monitoring.v1.Event getDefaultInstanceForType() {
      return com.parrothq.events_monitoring.v1.Event.getDefaultInstance();
    }

    @java.lang.Override
    public com.parrothq.events_monitoring.v1.Event build() {
      com.parrothq.events_monitoring.v1.Event result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.parrothq.events_monitoring.v1.Event buildPartial() {
      com.parrothq.events_monitoring.v1.Event result = new com.parrothq.events_monitoring.v1.Event(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (specBuilder_ == null) {
        result.spec_ = spec_;
      } else {
        result.spec_ = specBuilder_.build();
      }
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
      if (other instanceof com.parrothq.events_monitoring.v1.Event) {
        return mergeFrom((com.parrothq.events_monitoring.v1.Event)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.parrothq.events_monitoring.v1.Event other) {
      if (other == com.parrothq.events_monitoring.v1.Event.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.hasSpec()) {
        mergeSpec(other.getSpec());
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
      com.parrothq.events_monitoring.v1.Event parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.parrothq.events_monitoring.v1.Event) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.parrothq.events_monitoring.v1.Header header_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.parrothq.events_monitoring.v1.Header, com.parrothq.events_monitoring.v1.Header.Builder, com.parrothq.events_monitoring.v1.HeaderOrBuilder> headerBuilder_;
    /**
     * <code>.events_monitoring.v1.Header header = 1;</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <code>.events_monitoring.v1.Header header = 1;</code>
     * @return The header.
     */
    public com.parrothq.events_monitoring.v1.Header getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? com.parrothq.events_monitoring.v1.Header.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <code>.events_monitoring.v1.Header header = 1;</code>
     */
    public Builder setHeader(com.parrothq.events_monitoring.v1.Header value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.events_monitoring.v1.Header header = 1;</code>
     */
    public Builder setHeader(
        com.parrothq.events_monitoring.v1.Header.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.events_monitoring.v1.Header header = 1;</code>
     */
    public Builder mergeHeader(com.parrothq.events_monitoring.v1.Header value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            com.parrothq.events_monitoring.v1.Header.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.events_monitoring.v1.Header header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.events_monitoring.v1.Header header = 1;</code>
     */
    public com.parrothq.events_monitoring.v1.Header.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>.events_monitoring.v1.Header header = 1;</code>
     */
    public com.parrothq.events_monitoring.v1.HeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            com.parrothq.events_monitoring.v1.Header.getDefaultInstance() : header_;
      }
    }
    /**
     * <code>.events_monitoring.v1.Header header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.parrothq.events_monitoring.v1.Header, com.parrothq.events_monitoring.v1.Header.Builder, com.parrothq.events_monitoring.v1.HeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.parrothq.events_monitoring.v1.Header, com.parrothq.events_monitoring.v1.Header.Builder, com.parrothq.events_monitoring.v1.HeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private com.google.protobuf.Any spec_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> specBuilder_;
    /**
     * <code>.google.protobuf.Any spec = 2;</code>
     * @return Whether the spec field is set.
     */
    public boolean hasSpec() {
      return specBuilder_ != null || spec_ != null;
    }
    /**
     * <code>.google.protobuf.Any spec = 2;</code>
     * @return The spec.
     */
    public com.google.protobuf.Any getSpec() {
      if (specBuilder_ == null) {
        return spec_ == null ? com.google.protobuf.Any.getDefaultInstance() : spec_;
      } else {
        return specBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Any spec = 2;</code>
     */
    public Builder setSpec(com.google.protobuf.Any value) {
      if (specBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        spec_ = value;
        onChanged();
      } else {
        specBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Any spec = 2;</code>
     */
    public Builder setSpec(
        com.google.protobuf.Any.Builder builderForValue) {
      if (specBuilder_ == null) {
        spec_ = builderForValue.build();
        onChanged();
      } else {
        specBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Any spec = 2;</code>
     */
    public Builder mergeSpec(com.google.protobuf.Any value) {
      if (specBuilder_ == null) {
        if (spec_ != null) {
          spec_ =
            com.google.protobuf.Any.newBuilder(spec_).mergeFrom(value).buildPartial();
        } else {
          spec_ = value;
        }
        onChanged();
      } else {
        specBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Any spec = 2;</code>
     */
    public Builder clearSpec() {
      if (specBuilder_ == null) {
        spec_ = null;
        onChanged();
      } else {
        spec_ = null;
        specBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Any spec = 2;</code>
     */
    public com.google.protobuf.Any.Builder getSpecBuilder() {
      
      onChanged();
      return getSpecFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Any spec = 2;</code>
     */
    public com.google.protobuf.AnyOrBuilder getSpecOrBuilder() {
      if (specBuilder_ != null) {
        return specBuilder_.getMessageOrBuilder();
      } else {
        return spec_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : spec_;
      }
    }
    /**
     * <code>.google.protobuf.Any spec = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getSpecFieldBuilder() {
      if (specBuilder_ == null) {
        specBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getSpec(),
                getParentForChildren(),
                isClean());
        spec_ = null;
      }
      return specBuilder_;
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


    // @@protoc_insertion_point(builder_scope:events_monitoring.v1.Event)
  }

  // @@protoc_insertion_point(class_scope:events_monitoring.v1.Event)
  private static final com.parrothq.events_monitoring.v1.Event DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.parrothq.events_monitoring.v1.Event();
  }

  public static com.parrothq.events_monitoring.v1.Event getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Event>
      PARSER = new com.google.protobuf.AbstractParser<Event>() {
    @java.lang.Override
    public Event parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Event(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Event> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Event> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.parrothq.events_monitoring.v1.Event getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

