// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloM.proto

package com.incarcloud.std;

public final class HelloM {
  private HelloM() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HelloCountArgV1OrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.incarcloud.std.HelloCountArgV1)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code com.incarcloud.std.HelloCountArgV1}
   */
  public  static final class HelloCountArgV1 extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.incarcloud.std.HelloCountArgV1)
      HelloCountArgV1OrBuilder {
    // Use HelloCountArgV1.newBuilder() to construct.
    private HelloCountArgV1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HelloCountArgV1() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private HelloCountArgV1(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.incarcloud.std.HelloM.internal_static_com_incarcloud_std_HelloCountArgV1_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.incarcloud.std.HelloM.internal_static_com_incarcloud_std_HelloCountArgV1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.incarcloud.std.HelloM.HelloCountArgV1.class, com.incarcloud.std.HelloM.HelloCountArgV1.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.incarcloud.std.HelloM.HelloCountArgV1)) {
        return super.equals(obj);
      }
      com.incarcloud.std.HelloM.HelloCountArgV1 other = (com.incarcloud.std.HelloM.HelloCountArgV1) obj;

      boolean result = true;
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.incarcloud.std.HelloM.HelloCountArgV1 prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code com.incarcloud.std.HelloCountArgV1}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.incarcloud.std.HelloCountArgV1)
        com.incarcloud.std.HelloM.HelloCountArgV1OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.incarcloud.std.HelloM.internal_static_com_incarcloud_std_HelloCountArgV1_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.incarcloud.std.HelloM.internal_static_com_incarcloud_std_HelloCountArgV1_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.incarcloud.std.HelloM.HelloCountArgV1.class, com.incarcloud.std.HelloM.HelloCountArgV1.Builder.class);
      }

      // Construct using com.incarcloud.std.HelloM.HelloCountArgV1.newBuilder()
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
      public Builder clear() {
        super.clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.incarcloud.std.HelloM.internal_static_com_incarcloud_std_HelloCountArgV1_descriptor;
      }

      public com.incarcloud.std.HelloM.HelloCountArgV1 getDefaultInstanceForType() {
        return com.incarcloud.std.HelloM.HelloCountArgV1.getDefaultInstance();
      }

      public com.incarcloud.std.HelloM.HelloCountArgV1 build() {
        com.incarcloud.std.HelloM.HelloCountArgV1 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.incarcloud.std.HelloM.HelloCountArgV1 buildPartial() {
        com.incarcloud.std.HelloM.HelloCountArgV1 result = new com.incarcloud.std.HelloM.HelloCountArgV1(this);
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.incarcloud.std.HelloM.HelloCountArgV1) {
          return mergeFrom((com.incarcloud.std.HelloM.HelloCountArgV1)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.incarcloud.std.HelloM.HelloCountArgV1 other) {
        if (other == com.incarcloud.std.HelloM.HelloCountArgV1.getDefaultInstance()) return this;
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.incarcloud.std.HelloM.HelloCountArgV1 parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.incarcloud.std.HelloM.HelloCountArgV1) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:com.incarcloud.std.HelloCountArgV1)
    }

    // @@protoc_insertion_point(class_scope:com.incarcloud.std.HelloCountArgV1)
    private static final com.incarcloud.std.HelloM.HelloCountArgV1 DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.incarcloud.std.HelloM.HelloCountArgV1();
    }

    public static com.incarcloud.std.HelloM.HelloCountArgV1 getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HelloCountArgV1>
        PARSER = new com.google.protobuf.AbstractParser<HelloCountArgV1>() {
      public HelloCountArgV1 parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new HelloCountArgV1(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HelloCountArgV1> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HelloCountArgV1> getParserForType() {
      return PARSER;
    }

    public com.incarcloud.std.HelloM.HelloCountArgV1 getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface HelloCountV1OrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.incarcloud.std.HelloCountV1)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string vin = 1;</code>
     */
    java.lang.String getVin();
    /**
     * <code>optional string vin = 1;</code>
     */
    com.google.protobuf.ByteString
        getVinBytes();

    /**
     * <code>optional int32 count = 2;</code>
     */
    int getCount();
  }
  /**
   * Protobuf type {@code com.incarcloud.std.HelloCountV1}
   */
  public  static final class HelloCountV1 extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.incarcloud.std.HelloCountV1)
      HelloCountV1OrBuilder {
    // Use HelloCountV1.newBuilder() to construct.
    private HelloCountV1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HelloCountV1() {
      vin_ = "";
      count_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private HelloCountV1(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              vin_ = s;
              break;
            }
            case 16: {

              count_ = input.readInt32();
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.incarcloud.std.HelloM.internal_static_com_incarcloud_std_HelloCountV1_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.incarcloud.std.HelloM.internal_static_com_incarcloud_std_HelloCountV1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.incarcloud.std.HelloM.HelloCountV1.class, com.incarcloud.std.HelloM.HelloCountV1.Builder.class);
    }

    public static final int VIN_FIELD_NUMBER = 1;
    private volatile java.lang.Object vin_;
    /**
     * <code>optional string vin = 1;</code>
     */
    public java.lang.String getVin() {
      java.lang.Object ref = vin_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vin_ = s;
        return s;
      }
    }
    /**
     * <code>optional string vin = 1;</code>
     */
    public com.google.protobuf.ByteString
        getVinBytes() {
      java.lang.Object ref = vin_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COUNT_FIELD_NUMBER = 2;
    private int count_;
    /**
     * <code>optional int32 count = 2;</code>
     */
    public int getCount() {
      return count_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getVinBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vin_);
      }
      if (count_ != 0) {
        output.writeInt32(2, count_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getVinBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vin_);
      }
      if (count_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, count_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.incarcloud.std.HelloM.HelloCountV1)) {
        return super.equals(obj);
      }
      com.incarcloud.std.HelloM.HelloCountV1 other = (com.incarcloud.std.HelloM.HelloCountV1) obj;

      boolean result = true;
      result = result && getVin()
          .equals(other.getVin());
      result = result && (getCount()
          == other.getCount());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + VIN_FIELD_NUMBER;
      hash = (53 * hash) + getVin().hashCode();
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.incarcloud.std.HelloM.HelloCountV1 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.incarcloud.std.HelloM.HelloCountV1 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.incarcloud.std.HelloM.HelloCountV1 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.incarcloud.std.HelloM.HelloCountV1 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.incarcloud.std.HelloM.HelloCountV1 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.incarcloud.std.HelloM.HelloCountV1 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.incarcloud.std.HelloM.HelloCountV1 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.incarcloud.std.HelloM.HelloCountV1 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.incarcloud.std.HelloM.HelloCountV1 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.incarcloud.std.HelloM.HelloCountV1 parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.incarcloud.std.HelloM.HelloCountV1 prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code com.incarcloud.std.HelloCountV1}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.incarcloud.std.HelloCountV1)
        com.incarcloud.std.HelloM.HelloCountV1OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.incarcloud.std.HelloM.internal_static_com_incarcloud_std_HelloCountV1_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.incarcloud.std.HelloM.internal_static_com_incarcloud_std_HelloCountV1_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.incarcloud.std.HelloM.HelloCountV1.class, com.incarcloud.std.HelloM.HelloCountV1.Builder.class);
      }

      // Construct using com.incarcloud.std.HelloM.HelloCountV1.newBuilder()
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
      public Builder clear() {
        super.clear();
        vin_ = "";

        count_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.incarcloud.std.HelloM.internal_static_com_incarcloud_std_HelloCountV1_descriptor;
      }

      public com.incarcloud.std.HelloM.HelloCountV1 getDefaultInstanceForType() {
        return com.incarcloud.std.HelloM.HelloCountV1.getDefaultInstance();
      }

      public com.incarcloud.std.HelloM.HelloCountV1 build() {
        com.incarcloud.std.HelloM.HelloCountV1 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.incarcloud.std.HelloM.HelloCountV1 buildPartial() {
        com.incarcloud.std.HelloM.HelloCountV1 result = new com.incarcloud.std.HelloM.HelloCountV1(this);
        result.vin_ = vin_;
        result.count_ = count_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.incarcloud.std.HelloM.HelloCountV1) {
          return mergeFrom((com.incarcloud.std.HelloM.HelloCountV1)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.incarcloud.std.HelloM.HelloCountV1 other) {
        if (other == com.incarcloud.std.HelloM.HelloCountV1.getDefaultInstance()) return this;
        if (!other.getVin().isEmpty()) {
          vin_ = other.vin_;
          onChanged();
        }
        if (other.getCount() != 0) {
          setCount(other.getCount());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.incarcloud.std.HelloM.HelloCountV1 parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.incarcloud.std.HelloM.HelloCountV1) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object vin_ = "";
      /**
       * <code>optional string vin = 1;</code>
       */
      public java.lang.String getVin() {
        java.lang.Object ref = vin_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          vin_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string vin = 1;</code>
       */
      public com.google.protobuf.ByteString
          getVinBytes() {
        java.lang.Object ref = vin_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          vin_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string vin = 1;</code>
       */
      public Builder setVin(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        vin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string vin = 1;</code>
       */
      public Builder clearVin() {
        
        vin_ = getDefaultInstance().getVin();
        onChanged();
        return this;
      }
      /**
       * <code>optional string vin = 1;</code>
       */
      public Builder setVinBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        vin_ = value;
        onChanged();
        return this;
      }

      private int count_ ;
      /**
       * <code>optional int32 count = 2;</code>
       */
      public int getCount() {
        return count_;
      }
      /**
       * <code>optional int32 count = 2;</code>
       */
      public Builder setCount(int value) {
        
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 count = 2;</code>
       */
      public Builder clearCount() {
        
        count_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:com.incarcloud.std.HelloCountV1)
    }

    // @@protoc_insertion_point(class_scope:com.incarcloud.std.HelloCountV1)
    private static final com.incarcloud.std.HelloM.HelloCountV1 DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.incarcloud.std.HelloM.HelloCountV1();
    }

    public static com.incarcloud.std.HelloM.HelloCountV1 getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HelloCountV1>
        PARSER = new com.google.protobuf.AbstractParser<HelloCountV1>() {
      public HelloCountV1 parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new HelloCountV1(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HelloCountV1> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HelloCountV1> getParserForType() {
      return PARSER;
    }

    public com.incarcloud.std.HelloM.HelloCountV1 getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_incarcloud_std_HelloCountArgV1_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_incarcloud_std_HelloCountArgV1_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_incarcloud_std_HelloCountV1_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_incarcloud_std_HelloCountV1_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014HelloM.proto\022\022com.incarcloud.std\"\021\n\017He" +
      "lloCountArgV1\"*\n\014HelloCountV1\022\013\n\003vin\030\001 \001" +
      "(\t\022\r\n\005count\030\002 \001(\0052`\n\016CountServiceV1\022N\n\005C" +
      "ount\022#.com.incarcloud.std.HelloCountArgV" +
      "1\032 .com.incarcloud.std.HelloCountV1b\006pro" +
      "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_incarcloud_std_HelloCountArgV1_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_incarcloud_std_HelloCountArgV1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_incarcloud_std_HelloCountArgV1_descriptor,
        new java.lang.String[] { });
    internal_static_com_incarcloud_std_HelloCountV1_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_incarcloud_std_HelloCountV1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_incarcloud_std_HelloCountV1_descriptor,
        new java.lang.String[] { "Vin", "Count", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
