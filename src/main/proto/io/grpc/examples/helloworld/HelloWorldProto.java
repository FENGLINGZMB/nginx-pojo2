// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Dog.proto

package io.grpc.examples.helloworld;

public final class HelloWorldProto {
  private HelloWorldProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_GetDogRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_GetDogRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_GetDogResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_GetDogResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tDog.proto\022\nhelloworld\"\017\n\rGetDogRequest" +
      "\";\n\016GetDogResponse\022\014\n\004name\030\001 \001(\t\022\013\n\003age\030" +
      "\002 \001(\005\022\016\n\006weight\030\003 \001(\0052O\n\nDogService\022A\n\006G" +
      "etDog\022\031.helloworld.GetDogRequest\032\032.hello" +
      "world.GetDogResponse\"\000Bg\n\033io.grpc.exampl" +
      "es.helloworldB\017HelloWorldProtoP\001Z5google" +
      ".golang.org/grpc/examples/helloworld/hel" +
      "loworldb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_helloworld_GetDogRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_helloworld_GetDogRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_GetDogRequest_descriptor,
        new java.lang.String[] { });
    internal_static_helloworld_GetDogResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_helloworld_GetDogResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_GetDogResponse_descriptor,
        new java.lang.String[] { "Name", "Age", "Weight", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}