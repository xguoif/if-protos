// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/Ping.proto

package com.insightfinder.InsightFinderApp.protos;

public final class PingWrapper {
  private PingWrapper() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Ping)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 pingNum = 1;</code>
     * @return The pingNum.
     */
    long getPingNum();
  }
  /**
   * <pre>
   * Heart beat sent to server every 10 seconds
   * </pre>
   *
   * Protobuf type {@code Ping}
   */
  public static final class Ping extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Ping)
      PingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Ping.newBuilder() to construct.
    private Ping(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Ping() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Ping();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Ping(
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

              pingNum_ = input.readInt64();
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
      return com.insightfinder.InsightFinderApp.protos.PingWrapper.internal_static_Ping_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.insightfinder.InsightFinderApp.protos.PingWrapper.internal_static_Ping_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping.class, com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping.Builder.class);
    }

    public static final int PINGNUM_FIELD_NUMBER = 1;
    private long pingNum_;
    /**
     * <code>int64 pingNum = 1;</code>
     * @return The pingNum.
     */
    @java.lang.Override
    public long getPingNum() {
      return pingNum_;
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
      if (pingNum_ != 0L) {
        output.writeInt64(1, pingNum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pingNum_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, pingNum_);
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
      if (!(obj instanceof com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping)) {
        return super.equals(obj);
      }
      com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping other = (com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping) obj;

      if (getPingNum()
          != other.getPingNum()) return false;
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
      hash = (37 * hash) + PINGNUM_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPingNum());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping parseFrom(
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
    public static Builder newBuilder(com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping prototype) {
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
     * <pre>
     * Heart beat sent to server every 10 seconds
     * </pre>
     *
     * Protobuf type {@code Ping}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Ping)
        com.insightfinder.InsightFinderApp.protos.PingWrapper.PingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.insightfinder.InsightFinderApp.protos.PingWrapper.internal_static_Ping_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.insightfinder.InsightFinderApp.protos.PingWrapper.internal_static_Ping_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping.class, com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping.Builder.class);
      }

      // Construct using com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping.newBuilder()
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
        pingNum_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.insightfinder.InsightFinderApp.protos.PingWrapper.internal_static_Ping_descriptor;
      }

      @java.lang.Override
      public com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping getDefaultInstanceForType() {
        return com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping.getDefaultInstance();
      }

      @java.lang.Override
      public com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping build() {
        com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping buildPartial() {
        com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping result = new com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping(this);
        result.pingNum_ = pingNum_;
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
        if (other instanceof com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping) {
          return mergeFrom((com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping other) {
        if (other == com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping.getDefaultInstance()) return this;
        if (other.getPingNum() != 0L) {
          setPingNum(other.getPingNum());
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
        com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long pingNum_ ;
      /**
       * <code>int64 pingNum = 1;</code>
       * @return The pingNum.
       */
      @java.lang.Override
      public long getPingNum() {
        return pingNum_;
      }
      /**
       * <code>int64 pingNum = 1;</code>
       * @param value The pingNum to set.
       * @return This builder for chaining.
       */
      public Builder setPingNum(long value) {
        
        pingNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 pingNum = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPingNum() {
        
        pingNum_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:Ping)
    }

    // @@protoc_insertion_point(class_scope:Ping)
    private static final com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping();
    }

    public static com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Ping>
        PARSER = new com.google.protobuf.AbstractParser<Ping>() {
      @java.lang.Override
      public Ping parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Ping(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Ping> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Ping> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.insightfinder.InsightFinderApp.protos.PingWrapper.Ping getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ping_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ping_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021protos/Ping.proto\"\027\n\004Ping\022\017\n\007pingNum\030\001" +
      " \001(\003B8\n)com.insightfinder.InsightFinderA" +
      "pp.protosB\013PingWrapperb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Ping_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Ping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ping_descriptor,
        new java.lang.String[] { "PingNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}