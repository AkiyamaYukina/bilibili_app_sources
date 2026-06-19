package com.bilibili.lib.tf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfTransformEvent.class */
public final class TfTransformEvent extends GeneratedMessageLite<TfTransformEvent, Builder> implements TfTransformEventOrBuilder {
    public static final int CODE_FIELD_NUMBER = 12;
    private static final TfTransformEvent DEFAULT_INSTANCE;
    public static final int IS_AUTO_FIELD_NUMBER = 3;
    public static final int IS_CACHE_FIELD_NUMBER = 16;
    public static final int MESSAGE_FIELD_NUMBER = 13;
    public static final int METHOD_FIELD_NUMBER = 15;
    public static final int OUT_URL_FIELD_NUMBER = 14;
    private static volatile Parser<TfTransformEvent> PARSER;
    public static final int RESOURCE_FIELD_NUMBER = 1;
    public static final int TAG_FIELD_NUMBER = 4;
    public static final int TF_FIELD_NUMBER = 11;
    public static final int TYPE_EXT_FIELD_NUMBER = 17;
    public static final int URL_FIELD_NUMBER = 2;
    private int code_;
    private boolean isAuto_;
    private boolean isCache_;
    private int method_;
    private int resource_;
    private boolean tf_;
    private int typeExt_;
    private String url_ = "";
    private String tag_ = "";
    private String message_ = "";
    private String outUrl_ = "";

    /* JADX INFO: renamed from: com.bilibili.lib.tf.TfTransformEvent$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfTransformEvent$1.class */
    public static /* synthetic */ class AnonymousClass1 {
        static final int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:27:0x006d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.bilibili.lib.tf.TfTransformEvent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.lib.tf.TfTransformEvent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.lib.tf.TfTransformEvent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.lib.tf.TfTransformEvent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.lib.tf.TfTransformEvent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.lib.tf.TfTransformEvent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.lib.tf.TfTransformEvent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L71
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L71
            L58:
                return
            L59:
                r4 = move-exception
                goto L14
            L5d:
                r4 = move-exception
                goto L1f
            L61:
                r4 = move-exception
                goto L2a
            L65:
                r4 = move-exception
                goto L35
            L69:
                r4 = move-exception
                goto L40
            L6d:
                r4 = move-exception
                goto L4c
            L71:
                r4 = move-exception
                goto L58
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.tf.TfTransformEvent.AnonymousClass1.m6830clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfTransformEvent$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder<TfTransformEvent, Builder> implements TfTransformEventOrBuilder {
        private Builder() {
            super(TfTransformEvent.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearCode() {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).clearCode();
            return this;
        }

        public Builder clearIsAuto() {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).clearIsAuto();
            return this;
        }

        public Builder clearIsCache() {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).clearIsCache();
            return this;
        }

        public Builder clearMessage() {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).clearMessage();
            return this;
        }

        public Builder clearMethod() {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).clearMethod();
            return this;
        }

        public Builder clearOutUrl() {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).clearOutUrl();
            return this;
        }

        public Builder clearResource() {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).clearResource();
            return this;
        }

        public Builder clearTag() {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).clearTag();
            return this;
        }

        public Builder clearTf() {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).clearTf();
            return this;
        }

        public Builder clearTypeExt() {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).clearTypeExt();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).clearUrl();
            return this;
        }

        @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
        public TfCode getCode() {
            return ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).getCode();
        }

        @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
        public int getCodeValue() {
            return ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).getCodeValue();
        }

        @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
        public boolean getIsAuto() {
            return ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).getIsAuto();
        }

        @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
        public boolean getIsCache() {
            return ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).getIsCache();
        }

        @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
        public String getMessage() {
            return ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).getMessage();
        }

        @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
        public ByteString getMessageBytes() {
            return ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).getMessageBytes();
        }

        @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
        public TfUrlMethod getMethod() {
            return ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).getMethod();
        }

        @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
        public int getMethodValue() {
            return ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).getMethodValue();
        }

        @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
        public String getOutUrl() {
            return ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).getOutUrl();
        }

        @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
        public ByteString getOutUrlBytes() {
            return ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).getOutUrlBytes();
        }

        @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
        public TfResource getResource() {
            return ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).getResource();
        }

        @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
        public int getResourceValue() {
            return ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).getResourceValue();
        }

        @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
        public String getTag() {
            return ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).getTag();
        }

        @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
        public ByteString getTagBytes() {
            return ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).getTagBytes();
        }

        @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
        public boolean getTf() {
            return ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).getTf();
        }

        @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
        public TfTypeExt getTypeExt() {
            return ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).getTypeExt();
        }

        @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
        public int getTypeExtValue() {
            return ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).getTypeExtValue();
        }

        @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
        public String getUrl() {
            return ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).getUrl();
        }

        @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
        public ByteString getUrlBytes() {
            return ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).getUrlBytes();
        }

        public Builder setCode(TfCode tfCode) {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).setCode(tfCode);
            return this;
        }

        public Builder setCodeValue(int i7) {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).setCodeValue(i7);
            return this;
        }

        public Builder setIsAuto(boolean z6) {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).setIsAuto(z6);
            return this;
        }

        public Builder setIsCache(boolean z6) {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).setIsCache(z6);
            return this;
        }

        public Builder setMessage(String str) {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).setMessage(str);
            return this;
        }

        public Builder setMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).setMessageBytes(byteString);
            return this;
        }

        public Builder setMethod(TfUrlMethod tfUrlMethod) {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).setMethod(tfUrlMethod);
            return this;
        }

        public Builder setMethodValue(int i7) {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).setMethodValue(i7);
            return this;
        }

        public Builder setOutUrl(String str) {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).setOutUrl(str);
            return this;
        }

        public Builder setOutUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).setOutUrlBytes(byteString);
            return this;
        }

        public Builder setResource(TfResource tfResource) {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).setResource(tfResource);
            return this;
        }

        public Builder setResourceValue(int i7) {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).setResourceValue(i7);
            return this;
        }

        public Builder setTag(String str) {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).setTag(str);
            return this;
        }

        public Builder setTagBytes(ByteString byteString) {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).setTagBytes(byteString);
            return this;
        }

        public Builder setTf(boolean z6) {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).setTf(z6);
            return this;
        }

        public Builder setTypeExt(TfTypeExt tfTypeExt) {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).setTypeExt(tfTypeExt);
            return this;
        }

        public Builder setTypeExtValue(int i7) {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).setTypeExtValue(i7);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((TfTransformEvent) ((GeneratedMessageLite.Builder) this).instance).setUrlBytes(byteString);
            return this;
        }
    }

    static {
        TfTransformEvent tfTransformEvent = new TfTransformEvent();
        DEFAULT_INSTANCE = tfTransformEvent;
        GeneratedMessageLite.registerDefaultInstance(TfTransformEvent.class, tfTransformEvent);
    }

    private TfTransformEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAuto() {
        this.isAuto_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCache() {
        this.isCache_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethod() {
        this.method_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutUrl() {
        this.outUrl_ = getDefaultInstance().getOutUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResource() {
        this.resource_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTag() {
        this.tag_ = getDefaultInstance().getTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTf() {
        this.tf_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeExt() {
        this.typeExt_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static TfTransformEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(TfTransformEvent tfTransformEvent) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tfTransformEvent);
    }

    public static TfTransformEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TfTransformEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TfTransformEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfTransformEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TfTransformEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TfTransformEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TfTransformEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfTransformEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TfTransformEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TfTransformEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TfTransformEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfTransformEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static TfTransformEvent parseFrom(InputStream inputStream) throws IOException {
        return (TfTransformEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TfTransformEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfTransformEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TfTransformEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TfTransformEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TfTransformEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfTransformEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TfTransformEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TfTransformEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TfTransformEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfTransformEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<TfTransformEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(TfCode tfCode) {
        this.code_ = tfCode.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeValue(int i7) {
        this.code_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAuto(boolean z6) {
        this.isAuto_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCache(boolean z6) {
        this.isCache_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.message_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethod(TfUrlMethod tfUrlMethod) {
        this.method_ = tfUrlMethod.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethodValue(int i7) {
        this.method_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutUrl(String str) {
        str.getClass();
        this.outUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.outUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResource(TfResource tfResource) {
        this.resource_ = tfResource.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceValue(int i7) {
        this.resource_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTag(String str) {
        str.getClass();
        this.tag_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tag_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTf(boolean z6) {
        this.tf_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeExt(TfTypeExt tfTypeExt) {
        this.typeExt_ = tfTypeExt.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeExtValue(int i7) {
        this.typeExt_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TfTransformEvent();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u0011\u000b\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\u0007\u0004Ȉ\u000b\u0007\f\f\rȈ\u000eȈ\u000f\f\u0010\u0007\u0011\f", new Object[]{"resource_", "url_", "isAuto_", "tag_", "tf_", "code_", "message_", "outUrl_", "method_", "isCache_", "typeExt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (TfTransformEvent.class) {
                        try {
                            GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser3 = PARSER;
                            defaultInstanceBasedParser2 = defaultInstanceBasedParser3;
                            if (defaultInstanceBasedParser3 == null) {
                                defaultInstanceBasedParser2 = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser2;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
    public TfCode getCode() {
        TfCode tfCodeForNumber = TfCode.forNumber(this.code_);
        TfCode tfCode = tfCodeForNumber;
        if (tfCodeForNumber == null) {
            tfCode = TfCode.UNRECOGNIZED;
        }
        return tfCode;
    }

    @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
    public int getCodeValue() {
        return this.code_;
    }

    @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
    public boolean getIsAuto() {
        return this.isAuto_;
    }

    @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
    public boolean getIsCache() {
        return this.isCache_;
    }

    @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
    public String getMessage() {
        return this.message_;
    }

    @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }

    @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
    public TfUrlMethod getMethod() {
        TfUrlMethod tfUrlMethodForNumber = TfUrlMethod.forNumber(this.method_);
        TfUrlMethod tfUrlMethod = tfUrlMethodForNumber;
        if (tfUrlMethodForNumber == null) {
            tfUrlMethod = TfUrlMethod.UNRECOGNIZED;
        }
        return tfUrlMethod;
    }

    @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
    public int getMethodValue() {
        return this.method_;
    }

    @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
    public String getOutUrl() {
        return this.outUrl_;
    }

    @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
    public ByteString getOutUrlBytes() {
        return ByteString.copyFromUtf8(this.outUrl_);
    }

    @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
    public TfResource getResource() {
        TfResource tfResourceForNumber = TfResource.forNumber(this.resource_);
        TfResource tfResource = tfResourceForNumber;
        if (tfResourceForNumber == null) {
            tfResource = TfResource.UNRECOGNIZED;
        }
        return tfResource;
    }

    @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
    public int getResourceValue() {
        return this.resource_;
    }

    @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
    public String getTag() {
        return this.tag_;
    }

    @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
    public ByteString getTagBytes() {
        return ByteString.copyFromUtf8(this.tag_);
    }

    @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
    public boolean getTf() {
        return this.tf_;
    }

    @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
    public TfTypeExt getTypeExt() {
        TfTypeExt tfTypeExtForNumber = TfTypeExt.forNumber(this.typeExt_);
        TfTypeExt tfTypeExt = tfTypeExtForNumber;
        if (tfTypeExtForNumber == null) {
            tfTypeExt = TfTypeExt.UNRECOGNIZED;
        }
        return tfTypeExt;
    }

    @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
    public int getTypeExtValue() {
        return this.typeExt_;
    }

    @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
    public String getUrl() {
        return this.url_;
    }

    @Override // com.bilibili.lib.tf.TfTransformEventOrBuilder
    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }
}
