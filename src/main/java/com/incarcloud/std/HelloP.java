// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloP.proto

package com.incarcloud.std;

public final class HelloP {
  private HelloP() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014HelloP.proto\022\022com.incarcloud.std\032\014Hell" +
      "oV.proto2b\n\016HelloServiceV1\022P\n\005hello\022\".co" +
      "m.incarcloud.std.HelloRequestV1\032#.com.in" +
      "carcloud.std.HelloResponseV1b\006proto3"
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
          com.incarcloud.std.HelloV.getDescriptor(),
        }, assigner);
    com.incarcloud.std.HelloV.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
