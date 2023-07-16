// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/Unsubscribe.proto

package com.insightfinder.InsightFinderApp.protos;

public final class UnsubscribeWrapper {
  private UnsubscribeWrapper() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UnsubscribeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unsubscribe)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *true unsubscribe all tasks with this socket client, or only unsubscribe tasks in taskIds
     * </pre>
     *
     * <code>bool unsubscribeAll = 1;</code>
     * @return The unsubscribeAll.
     */
    boolean getUnsubscribeAll();

    /**
     * <code>repeated string taskIds = 2;</code>
     * @return A list containing the taskIds.
     */
    java.util.List<java.lang.String>
        getTaskIdsList();
    /**
     * <code>repeated string taskIds = 2;</code>
     * @return The count of taskIds.
     */
    int getTaskIdsCount();
    /**
     * <code>repeated string taskIds = 2;</code>
     * @param index The index of the element to return.
     * @return The taskIds at the given index.
     */
    java.lang.String getTaskIds(int index);
    /**
     * <code>repeated string taskIds = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the taskIds at the given index.
     */
    com.google.protobuf.ByteString
        getTaskIdsBytes(int index);
  }
  /**
   * Protobuf type {@code Unsubscribe}
   */
  public static final class Unsubscribe extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unsubscribe)
      UnsubscribeOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unsubscribe.newBuilder() to construct.
    private Unsubscribe(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unsubscribe() {
      taskIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unsubscribe();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unsubscribe(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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

              unsubscribeAll_ = input.readBool();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                taskIds_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              taskIds_.add(s);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          taskIds_ = taskIds_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.internal_static_Unsubscribe_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.internal_static_Unsubscribe_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe.class, com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe.Builder.class);
    }

    public static final int UNSUBSCRIBEALL_FIELD_NUMBER = 1;
    private boolean unsubscribeAll_;
    /**
     * <pre>
     *true unsubscribe all tasks with this socket client, or only unsubscribe tasks in taskIds
     * </pre>
     *
     * <code>bool unsubscribeAll = 1;</code>
     * @return The unsubscribeAll.
     */
    @java.lang.Override
    public boolean getUnsubscribeAll() {
      return unsubscribeAll_;
    }

    public static final int TASKIDS_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList taskIds_;
    /**
     * <code>repeated string taskIds = 2;</code>
     * @return A list containing the taskIds.
     */
    public com.google.protobuf.ProtocolStringList
        getTaskIdsList() {
      return taskIds_;
    }
    /**
     * <code>repeated string taskIds = 2;</code>
     * @return The count of taskIds.
     */
    public int getTaskIdsCount() {
      return taskIds_.size();
    }
    /**
     * <code>repeated string taskIds = 2;</code>
     * @param index The index of the element to return.
     * @return The taskIds at the given index.
     */
    public java.lang.String getTaskIds(int index) {
      return taskIds_.get(index);
    }
    /**
     * <code>repeated string taskIds = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the taskIds at the given index.
     */
    public com.google.protobuf.ByteString
        getTaskIdsBytes(int index) {
      return taskIds_.getByteString(index);
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
      if (unsubscribeAll_ != false) {
        output.writeBool(1, unsubscribeAll_);
      }
      for (int i = 0; i < taskIds_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, taskIds_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unsubscribeAll_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, unsubscribeAll_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < taskIds_.size(); i++) {
          dataSize += computeStringSizeNoTag(taskIds_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getTaskIdsList().size();
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
      if (!(obj instanceof com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe)) {
        return super.equals(obj);
      }
      com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe other = (com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe) obj;

      if (getUnsubscribeAll()
          != other.getUnsubscribeAll()) return false;
      if (!getTaskIdsList()
          .equals(other.getTaskIdsList())) return false;
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
      hash = (37 * hash) + UNSUBSCRIBEALL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnsubscribeAll());
      if (getTaskIdsCount() > 0) {
        hash = (37 * hash) + TASKIDS_FIELD_NUMBER;
        hash = (53 * hash) + getTaskIdsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe parseFrom(
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
    public static Builder newBuilder(com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe prototype) {
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
     * Protobuf type {@code Unsubscribe}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unsubscribe)
        com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.UnsubscribeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.internal_static_Unsubscribe_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.internal_static_Unsubscribe_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe.class, com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe.Builder.class);
      }

      // Construct using com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe.newBuilder()
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
        unsubscribeAll_ = false;

        taskIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.internal_static_Unsubscribe_descriptor;
      }

      @java.lang.Override
      public com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe getDefaultInstanceForType() {
        return com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe.getDefaultInstance();
      }

      @java.lang.Override
      public com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe build() {
        com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe buildPartial() {
        com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe result = new com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe(this);
        int from_bitField0_ = bitField0_;
        result.unsubscribeAll_ = unsubscribeAll_;
        if (((bitField0_ & 0x00000001) != 0)) {
          taskIds_ = taskIds_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.taskIds_ = taskIds_;
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
        if (other instanceof com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe) {
          return mergeFrom((com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe other) {
        if (other == com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe.getDefaultInstance()) return this;
        if (other.getUnsubscribeAll() != false) {
          setUnsubscribeAll(other.getUnsubscribeAll());
        }
        if (!other.taskIds_.isEmpty()) {
          if (taskIds_.isEmpty()) {
            taskIds_ = other.taskIds_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTaskIdsIsMutable();
            taskIds_.addAll(other.taskIds_);
          }
          onChanged();
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
        com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean unsubscribeAll_ ;
      /**
       * <pre>
       *true unsubscribe all tasks with this socket client, or only unsubscribe tasks in taskIds
       * </pre>
       *
       * <code>bool unsubscribeAll = 1;</code>
       * @return The unsubscribeAll.
       */
      @java.lang.Override
      public boolean getUnsubscribeAll() {
        return unsubscribeAll_;
      }
      /**
       * <pre>
       *true unsubscribe all tasks with this socket client, or only unsubscribe tasks in taskIds
       * </pre>
       *
       * <code>bool unsubscribeAll = 1;</code>
       * @param value The unsubscribeAll to set.
       * @return This builder for chaining.
       */
      public Builder setUnsubscribeAll(boolean value) {
        
        unsubscribeAll_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *true unsubscribe all tasks with this socket client, or only unsubscribe tasks in taskIds
       * </pre>
       *
       * <code>bool unsubscribeAll = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnsubscribeAll() {
        
        unsubscribeAll_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList taskIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureTaskIdsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          taskIds_ = new com.google.protobuf.LazyStringArrayList(taskIds_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string taskIds = 2;</code>
       * @return A list containing the taskIds.
       */
      public com.google.protobuf.ProtocolStringList
          getTaskIdsList() {
        return taskIds_.getUnmodifiableView();
      }
      /**
       * <code>repeated string taskIds = 2;</code>
       * @return The count of taskIds.
       */
      public int getTaskIdsCount() {
        return taskIds_.size();
      }
      /**
       * <code>repeated string taskIds = 2;</code>
       * @param index The index of the element to return.
       * @return The taskIds at the given index.
       */
      public java.lang.String getTaskIds(int index) {
        return taskIds_.get(index);
      }
      /**
       * <code>repeated string taskIds = 2;</code>
       * @param index The index of the value to return.
       * @return The bytes of the taskIds at the given index.
       */
      public com.google.protobuf.ByteString
          getTaskIdsBytes(int index) {
        return taskIds_.getByteString(index);
      }
      /**
       * <code>repeated string taskIds = 2;</code>
       * @param index The index to set the value at.
       * @param value The taskIds to set.
       * @return This builder for chaining.
       */
      public Builder setTaskIds(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureTaskIdsIsMutable();
        taskIds_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string taskIds = 2;</code>
       * @param value The taskIds to add.
       * @return This builder for chaining.
       */
      public Builder addTaskIds(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureTaskIdsIsMutable();
        taskIds_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string taskIds = 2;</code>
       * @param values The taskIds to add.
       * @return This builder for chaining.
       */
      public Builder addAllTaskIds(
          java.lang.Iterable<java.lang.String> values) {
        ensureTaskIdsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, taskIds_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string taskIds = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTaskIds() {
        taskIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string taskIds = 2;</code>
       * @param value The bytes of the taskIds to add.
       * @return This builder for chaining.
       */
      public Builder addTaskIdsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureTaskIdsIsMutable();
        taskIds_.add(value);
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


      // @@protoc_insertion_point(builder_scope:Unsubscribe)
    }

    // @@protoc_insertion_point(class_scope:Unsubscribe)
    private static final com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe();
    }

    public static com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unsubscribe>
        PARSER = new com.google.protobuf.AbstractParser<Unsubscribe>() {
      @java.lang.Override
      public Unsubscribe parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unsubscribe(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unsubscribe> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unsubscribe> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.insightfinder.InsightFinderApp.protos.UnsubscribeWrapper.Unsubscribe getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unsubscribe_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unsubscribe_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030protos/Unsubscribe.proto\"6\n\013Unsubscrib" +
      "e\022\026\n\016unsubscribeAll\030\001 \001(\010\022\017\n\007taskIds\030\002 \003" +
      "(\tB?\n)com.insightfinder.InsightFinderApp" +
      ".protosB\022UnsubscribeWrapperb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unsubscribe_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unsubscribe_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unsubscribe_descriptor,
        new java.lang.String[] { "UnsubscribeAll", "TaskIds", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
