// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: net/pocrd/api/resp/Api_LoginResp.proto

package net.pocrd.api.resp;

public final class ApiLoginResp {
  private ApiLoginResp() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface Api_LoginRespOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string token = 1;
    boolean hasToken();
    String getToken();
    
    // optional int64 expire = 2;
    boolean hasExpire();
    long getExpire();
    
    // optional int64 uid = 3;
    boolean hasUid();
    long getUid();
    
    // optional string oaUserid = 4;
    boolean hasOaUserid();
    String getOaUserid();
    
    // optional string oaType = 5;
    boolean hasOaType();
    String getOaType();
    
    // optional string oaToken = 6;
    boolean hasOaToken();
    String getOaToken();
    
    // optional string nickname = 7;
    boolean hasNickname();
    String getNickname();
  }
  public static final class Api_LoginResp extends
      com.google.protobuf.GeneratedMessage
      implements Api_LoginRespOrBuilder {
    // Use Api_LoginResp.newBuilder() to construct.
    private Api_LoginResp(Builder builder) {
      super(builder);
    }
    private Api_LoginResp(boolean noInit) {}
    
    private static final Api_LoginResp defaultInstance;
    public static Api_LoginResp getDefaultInstance() {
      return defaultInstance;
    }
    
    public Api_LoginResp getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pocrd.api.resp.ApiLoginResp.internal_static_net_pocrd_api_resp_Api_LoginResp_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pocrd.api.resp.ApiLoginResp.internal_static_net_pocrd_api_resp_Api_LoginResp_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string token = 1;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private java.lang.Object token_;
    public boolean hasToken() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getToken() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          token_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int64 expire = 2;
    public static final int EXPIRE_FIELD_NUMBER = 2;
    private long expire_;
    public boolean hasExpire() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getExpire() {
      return expire_;
    }
    
    // optional int64 uid = 3;
    public static final int UID_FIELD_NUMBER = 3;
    private long uid_;
    public boolean hasUid() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public long getUid() {
      return uid_;
    }
    
    // optional string oaUserid = 4;
    public static final int OAUSERID_FIELD_NUMBER = 4;
    private java.lang.Object oaUserid_;
    public boolean hasOaUserid() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public String getOaUserid() {
      java.lang.Object ref = oaUserid_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          oaUserid_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getOaUseridBytes() {
      java.lang.Object ref = oaUserid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        oaUserid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string oaType = 5;
    public static final int OATYPE_FIELD_NUMBER = 5;
    private java.lang.Object oaType_;
    public boolean hasOaType() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public String getOaType() {
      java.lang.Object ref = oaType_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          oaType_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getOaTypeBytes() {
      java.lang.Object ref = oaType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        oaType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string oaToken = 6;
    public static final int OATOKEN_FIELD_NUMBER = 6;
    private java.lang.Object oaToken_;
    public boolean hasOaToken() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public String getOaToken() {
      java.lang.Object ref = oaToken_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          oaToken_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getOaTokenBytes() {
      java.lang.Object ref = oaToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        oaToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string nickname = 7;
    public static final int NICKNAME_FIELD_NUMBER = 7;
    private java.lang.Object nickname_;
    public boolean hasNickname() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public String getNickname() {
      java.lang.Object ref = nickname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          nickname_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getNicknameBytes() {
      java.lang.Object ref = nickname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        nickname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      token_ = "";
      expire_ = 0L;
      uid_ = 0L;
      oaUserid_ = "";
      oaType_ = "";
      oaToken_ = "";
      nickname_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getTokenBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, expire_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, uid_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getOaUseridBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getOaTypeBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(6, getOaTokenBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBytes(7, getNicknameBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getTokenBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, expire_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, uid_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getOaUseridBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getOaTypeBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, getOaTokenBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(7, getNicknameBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static net.pocrd.api.resp.ApiLoginResp.Api_LoginResp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pocrd.api.resp.ApiLoginResp.Api_LoginResp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pocrd.api.resp.ApiLoginResp.Api_LoginResp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pocrd.api.resp.ApiLoginResp.Api_LoginResp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pocrd.api.resp.ApiLoginResp.Api_LoginResp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pocrd.api.resp.ApiLoginResp.Api_LoginResp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pocrd.api.resp.ApiLoginResp.Api_LoginResp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pocrd.api.resp.ApiLoginResp.Api_LoginResp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pocrd.api.resp.ApiLoginResp.Api_LoginResp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pocrd.api.resp.ApiLoginResp.Api_LoginResp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pocrd.api.resp.ApiLoginResp.Api_LoginResp prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements net.pocrd.api.resp.ApiLoginResp.Api_LoginRespOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pocrd.api.resp.ApiLoginResp.internal_static_net_pocrd_api_resp_Api_LoginResp_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pocrd.api.resp.ApiLoginResp.internal_static_net_pocrd_api_resp_Api_LoginResp_fieldAccessorTable;
      }
      
      // Construct using net.pocrd.api.resp.ApiLoginResp.Api_LoginResp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        token_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        expire_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        uid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        oaUserid_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        oaType_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        oaToken_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        nickname_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pocrd.api.resp.ApiLoginResp.Api_LoginResp.getDescriptor();
      }
      
      public net.pocrd.api.resp.ApiLoginResp.Api_LoginResp getDefaultInstanceForType() {
        return net.pocrd.api.resp.ApiLoginResp.Api_LoginResp.getDefaultInstance();
      }
      
      public net.pocrd.api.resp.ApiLoginResp.Api_LoginResp build() {
        net.pocrd.api.resp.ApiLoginResp.Api_LoginResp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pocrd.api.resp.ApiLoginResp.Api_LoginResp buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pocrd.api.resp.ApiLoginResp.Api_LoginResp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pocrd.api.resp.ApiLoginResp.Api_LoginResp buildPartial() {
        net.pocrd.api.resp.ApiLoginResp.Api_LoginResp result = new net.pocrd.api.resp.ApiLoginResp.Api_LoginResp(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.token_ = token_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.expire_ = expire_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.uid_ = uid_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.oaUserid_ = oaUserid_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.oaType_ = oaType_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.oaToken_ = oaToken_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.nickname_ = nickname_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pocrd.api.resp.ApiLoginResp.Api_LoginResp) {
          return mergeFrom((net.pocrd.api.resp.ApiLoginResp.Api_LoginResp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pocrd.api.resp.ApiLoginResp.Api_LoginResp other) {
        if (other == net.pocrd.api.resp.ApiLoginResp.Api_LoginResp.getDefaultInstance()) return this;
        if (other.hasToken()) {
          setToken(other.getToken());
        }
        if (other.hasExpire()) {
          setExpire(other.getExpire());
        }
        if (other.hasUid()) {
          setUid(other.getUid());
        }
        if (other.hasOaUserid()) {
          setOaUserid(other.getOaUserid());
        }
        if (other.hasOaType()) {
          setOaType(other.getOaType());
        }
        if (other.hasOaToken()) {
          setOaToken(other.getOaToken());
        }
        if (other.hasNickname()) {
          setNickname(other.getNickname());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              token_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              expire_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              uid_ = input.readInt64();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              oaUserid_ = input.readBytes();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              oaType_ = input.readBytes();
              break;
            }
            case 50: {
              bitField0_ |= 0x00000020;
              oaToken_ = input.readBytes();
              break;
            }
            case 58: {
              bitField0_ |= 0x00000040;
              nickname_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string token = 1;
      private java.lang.Object token_ = "";
      public boolean hasToken() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getToken() {
        java.lang.Object ref = token_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          token_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setToken(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        token_ = value;
        onChanged();
        return this;
      }
      public Builder clearToken() {
        bitField0_ = (bitField0_ & ~0x00000001);
        token_ = getDefaultInstance().getToken();
        onChanged();
        return this;
      }
      void setToken(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        token_ = value;
        onChanged();
      }
      
      // optional int64 expire = 2;
      private long expire_ ;
      public boolean hasExpire() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getExpire() {
        return expire_;
      }
      public Builder setExpire(long value) {
        bitField0_ |= 0x00000002;
        expire_ = value;
        onChanged();
        return this;
      }
      public Builder clearExpire() {
        bitField0_ = (bitField0_ & ~0x00000002);
        expire_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int64 uid = 3;
      private long uid_ ;
      public boolean hasUid() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public long getUid() {
        return uid_;
      }
      public Builder setUid(long value) {
        bitField0_ |= 0x00000004;
        uid_ = value;
        onChanged();
        return this;
      }
      public Builder clearUid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        uid_ = 0L;
        onChanged();
        return this;
      }
      
      // optional string oaUserid = 4;
      private java.lang.Object oaUserid_ = "";
      public boolean hasOaUserid() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public String getOaUserid() {
        java.lang.Object ref = oaUserid_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          oaUserid_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setOaUserid(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        oaUserid_ = value;
        onChanged();
        return this;
      }
      public Builder clearOaUserid() {
        bitField0_ = (bitField0_ & ~0x00000008);
        oaUserid_ = getDefaultInstance().getOaUserid();
        onChanged();
        return this;
      }
      void setOaUserid(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000008;
        oaUserid_ = value;
        onChanged();
      }
      
      // optional string oaType = 5;
      private java.lang.Object oaType_ = "";
      public boolean hasOaType() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public String getOaType() {
        java.lang.Object ref = oaType_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          oaType_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setOaType(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        oaType_ = value;
        onChanged();
        return this;
      }
      public Builder clearOaType() {
        bitField0_ = (bitField0_ & ~0x00000010);
        oaType_ = getDefaultInstance().getOaType();
        onChanged();
        return this;
      }
      void setOaType(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000010;
        oaType_ = value;
        onChanged();
      }
      
      // optional string oaToken = 6;
      private java.lang.Object oaToken_ = "";
      public boolean hasOaToken() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public String getOaToken() {
        java.lang.Object ref = oaToken_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          oaToken_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setOaToken(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        oaToken_ = value;
        onChanged();
        return this;
      }
      public Builder clearOaToken() {
        bitField0_ = (bitField0_ & ~0x00000020);
        oaToken_ = getDefaultInstance().getOaToken();
        onChanged();
        return this;
      }
      void setOaToken(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000020;
        oaToken_ = value;
        onChanged();
      }
      
      // optional string nickname = 7;
      private java.lang.Object nickname_ = "";
      public boolean hasNickname() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public String getNickname() {
        java.lang.Object ref = nickname_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          nickname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setNickname(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        nickname_ = value;
        onChanged();
        return this;
      }
      public Builder clearNickname() {
        bitField0_ = (bitField0_ & ~0x00000040);
        nickname_ = getDefaultInstance().getNickname();
        onChanged();
        return this;
      }
      void setNickname(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000040;
        nickname_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:net.pocrd.api.resp.Api_LoginResp)
    }
    
    static {
      defaultInstance = new Api_LoginResp(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.pocrd.api.resp.Api_LoginResp)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_pocrd_api_resp_Api_LoginResp_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_pocrd_api_resp_Api_LoginResp_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&net/pocrd/api/resp/Api_LoginResp.proto" +
      "\022\022net.pocrd.api.resp\"\200\001\n\rApi_LoginResp\022\r" +
      "\n\005token\030\001 \001(\t\022\016\n\006expire\030\002 \001(\003\022\013\n\003uid\030\003 \001" +
      "(\003\022\020\n\010oaUserid\030\004 \001(\t\022\016\n\006oaType\030\005 \001(\t\022\017\n\007" +
      "oaToken\030\006 \001(\t\022\020\n\010nickname\030\007 \001(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_net_pocrd_api_resp_Api_LoginResp_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_net_pocrd_api_resp_Api_LoginResp_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_pocrd_api_resp_Api_LoginResp_descriptor,
              new java.lang.String[] { "Token", "Expire", "Uid", "OaUserid", "OaType", "OaToken", "Nickname", },
              net.pocrd.api.resp.ApiLoginResp.Api_LoginResp.class,
              net.pocrd.api.resp.ApiLoginResp.Api_LoginResp.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
