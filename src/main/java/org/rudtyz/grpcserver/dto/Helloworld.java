// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package org.rudtyz.grpcserver.dto;

public final class Helloworld {
  private Helloworld() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_HelloReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_SampleReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_SampleReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020helloworld.proto\022\nhelloworld\032\033google/p" +
      "rotobuf/empty.proto\"\034\n\014HelloRequest\022\014\n\004n" +
      "ame\030\001 \001(\t\"\035\n\nHelloReply\022\017\n\007message\030\001 \001(\t" +
      "\"+\n\013SampleReply\022\014\n\004name\030\001 \001(\t\022\016\n\006number\030" +
      "\002 \001(\0052\211\001\n\007Greeter\022>\n\010SayHello\022\030.hellowor" +
      "ld.HelloRequest\032\026.helloworld.HelloReply\"" +
      "\000\022>\n\tGetSample\022\026.google.protobuf.Empty\032\027" +
      ".helloworld.SampleReply\"\000B%\n\031org.rudtyz." +
      "grpcserver.dtoP\001Z\006.;mainb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_helloworld_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_helloworld_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_HelloRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_helloworld_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_helloworld_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_HelloReply_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_helloworld_SampleReply_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_helloworld_SampleReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_SampleReply_descriptor,
        new java.lang.String[] { "Name", "Number", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}