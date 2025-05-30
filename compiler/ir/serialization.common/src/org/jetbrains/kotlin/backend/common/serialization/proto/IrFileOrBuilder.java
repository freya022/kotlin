// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

public interface IrFileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.backend.common.serialization.proto.IrFile)
    org.jetbrains.kotlin.protobuf.MessageLiteOrBuilder {

  /**
   * <code>repeated int32 declaration_id = 1 [packed = true];</code>
   */
  java.util.List<java.lang.Integer> getDeclarationIdList();
  /**
   * <code>repeated int32 declaration_id = 1 [packed = true];</code>
   */
  int getDeclarationIdCount();
  /**
   * <code>repeated int32 declaration_id = 1 [packed = true];</code>
   */
  int getDeclarationId(int index);

  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry file_entry = 2;</code>
   *
   * <pre>
   * Required: either `file_entry` or `file_entry_id` is present.
   * </pre>
   */
  boolean hasFileEntry();
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry file_entry = 2;</code>
   *
   * <pre>
   * Required: either `file_entry` or `file_entry_id` is present.
   * </pre>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry getFileEntry();

  /**
   * <code>optional int32 file_entry_id = 7;</code>
   *
   * <pre>
   * Required: either `file_entry` or `file_entry_id` is present.
   * </pre>
   */
  boolean hasFileEntryId();
  /**
   * <code>optional int32 file_entry_id = 7;</code>
   *
   * <pre>
   * Required: either `file_entry` or `file_entry_id` is present.
   * </pre>
   */
  int getFileEntryId();

  /**
   * <code>repeated int32 fq_name = 3 [packed = true];</code>
   */
  java.util.List<java.lang.Integer> getFqNameList();
  /**
   * <code>repeated int32 fq_name = 3 [packed = true];</code>
   */
  int getFqNameCount();
  /**
   * <code>repeated int32 fq_name = 3 [packed = true];</code>
   */
  int getFqName(int index);

  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
   */
  java.util.List<org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall> 
      getAnnotationList();
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall getAnnotation(int index);
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
   */
  int getAnnotationCount();

  /**
   * <code>repeated int64 explicitly_exported_to_compiler = 5 [packed = true];</code>
   */
  java.util.List<java.lang.Long> getExplicitlyExportedToCompilerList();
  /**
   * <code>repeated int64 explicitly_exported_to_compiler = 5 [packed = true];</code>
   */
  int getExplicitlyExportedToCompilerCount();
  /**
   * <code>repeated int64 explicitly_exported_to_compiler = 5 [packed = true];</code>
   */
  long getExplicitlyExportedToCompiler(int index);
}