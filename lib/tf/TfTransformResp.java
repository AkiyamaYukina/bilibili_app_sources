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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfTransformResp.class */
public final class TfTransformResp extends GeneratedMessageLite<TfTransformResp, Builder> implements TfTransformRespOrBuilder {
    public static final int CODE_FIELD_NUMBER = 2;
    private static final TfTransformResp DEFAULT_INSTANCE;
    public static final int IS_CACHE_FIELD_NUMBER = 5;
    public static final int METHOD_FIELD_NUMBER = 4;
    private static volatile Parser<TfTransformResp> PARSER;
    public static final int PROVIDER_FIELD_NUMBER = 6;
    public static final int TF_FIELD_NUMBER = 1;
    public static final int TYPE_EXT_FIELD_NUMBER = 7;
    public static final int URL_FIELD_NUMBER = 3;
    private int code_;
    private boolean isCache_;
    private int method_;
    private int provider_;
    private boolean tf_;
    private int typeExt_;
    private String url_ = "";

    /* JADX INFO: renamed from: com.bilibili.lib.tf.TfTransformResp$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfTransformResp$1.class */
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
                com.bilibili.lib.tf.TfTransformResp.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.lib.tf.TfTransformResp.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.lib.tf.TfTransformResp.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.lib.tf.TfTransformResp.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.lib.tf.TfTransformResp.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.lib.tf.TfTransformResp.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.lib.tf.TfTransformResp.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.tf.TfTransformResp.AnonymousClass1.m6834clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfTransformResp$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder<TfTransformResp, Builder> implements TfTransformRespOrBuilder {
        private Builder() {
            super(TfTransformResp.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearCode() {
            copyOnWrite();
            ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).clearCode();
            return this;
        }

        public Builder clearIsCache() {
            copyOnWrite();
            ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).clearIsCache();
            return this;
        }

        public Builder clearMethod() {
            copyOnWrite();
            ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).clearMethod();
            return this;
        }

        public Builder clearProvider() {
            copyOnWrite();
            ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).clearProvider();
            return this;
        }

        public Builder clearTf() {
            copyOnWrite();
            ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).clearTf();
            return this;
        }

        public Builder clearTypeExt() {
            copyOnWrite();
            ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).clearTypeExt();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).clearUrl();
            return this;
        }

        @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
        public TfCode getCode() {
            return ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).getCode();
        }

        @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
        public int getCodeValue() {
            return ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).getCodeValue();
        }

        @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
        public boolean getIsCache() {
            return ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).getIsCache();
        }

        @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
        public TfUrlMethod getMethod() {
            return ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).getMethod();
        }

        @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
        public int getMethodValue() {
            return ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).getMethodValue();
        }

        @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
        public TfProvider getProvider() {
            return ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).getProvider();
        }

        @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
        public int getProviderValue() {
            return ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).getProviderValue();
        }

        @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
        public boolean getTf() {
            return ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).getTf();
        }

        @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
        public TfTypeExt getTypeExt() {
            return ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).getTypeExt();
        }

        @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
        public int getTypeExtValue() {
            return ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).getTypeExtValue();
        }

        @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
        public String getUrl() {
            return ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).getUrl();
        }

        @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
        public ByteString getUrlBytes() {
            return ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).getUrlBytes();
        }

        public Builder setCode(TfCode tfCode) {
            copyOnWrite();
            ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).setCode(tfCode);
            return this;
        }

        public Builder setCodeValue(int i7) {
            copyOnWrite();
            ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).setCodeValue(i7);
            return this;
        }

        public Builder setIsCache(boolean z6) {
            copyOnWrite();
            ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).setIsCache(z6);
            return this;
        }

        public Builder setMethod(TfUrlMethod tfUrlMethod) {
            copyOnWrite();
            ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).setMethod(tfUrlMethod);
            return this;
        }

        public Builder setMethodValue(int i7) {
            copyOnWrite();
            ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).setMethodValue(i7);
            return this;
        }

        public Builder setProvider(TfProvider tfProvider) {
            copyOnWrite();
            ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).setProvider(tfProvider);
            return this;
        }

        public Builder setProviderValue(int i7) {
            copyOnWrite();
            ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).setProviderValue(i7);
            return this;
        }

        public Builder setTf(boolean z6) {
            copyOnWrite();
            ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).setTf(z6);
            return this;
        }

        public Builder setTypeExt(TfTypeExt tfTypeExt) {
            copyOnWrite();
            ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).setTypeExt(tfTypeExt);
            return this;
        }

        public Builder setTypeExtValue(int i7) {
            copyOnWrite();
            ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).setTypeExtValue(i7);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((TfTransformResp) ((GeneratedMessageLite.Builder) this).instance).setUrlBytes(byteString);
            return this;
        }
    }

    static {
        TfTransformResp tfTransformResp = new TfTransformResp();
        DEFAULT_INSTANCE = tfTransformResp;
        GeneratedMessageLite.registerDefaultInstance(TfTransformResp.class, tfTransformResp);
    }

    private TfTransformResp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCache() {
        this.isCache_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethod() {
        this.method_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.provider_ = 0;
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

    public static TfTransformResp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(TfTransformResp tfTransformResp) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tfTransformResp);
    }

    public static TfTransformResp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TfTransformResp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TfTransformResp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfTransformResp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TfTransformResp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TfTransformResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TfTransformResp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfTransformResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TfTransformResp parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TfTransformResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TfTransformResp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfTransformResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static TfTransformResp parseFrom(InputStream inputStream) throws IOException {
        return (TfTransformResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TfTransformResp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfTransformResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TfTransformResp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TfTransformResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TfTransformResp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfTransformResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TfTransformResp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TfTransformResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TfTransformResp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfTransformResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<TfTransformResp> parser() {
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
    public void setIsCache(boolean z6) {
        this.isCache_ = z6;
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
    public void setProvider(TfProvider tfProvider) {
        this.provider_ = tfProvider.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderValue(int i7) {
        this.provider_ = i7;
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
                return new TfTransformResp();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0007\u0002\f\u0003Ȉ\u0004\f\u0005\u0007\u0006\f\u0007\f", new Object[]{"tf_", "code_", "url_", "method_", "isCache_", "provider_", "typeExt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (TfTransformResp.class) {
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

    @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
    public TfCode getCode() {
        TfCode tfCodeForNumber = TfCode.forNumber(this.code_);
        TfCode tfCode = tfCodeForNumber;
        if (tfCodeForNumber == null) {
            tfCode = TfCode.UNRECOGNIZED;
        }
        return tfCode;
    }

    @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
    public int getCodeValue() {
        return this.code_;
    }

    @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
    public boolean getIsCache() {
        return this.isCache_;
    }

    @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
    public TfUrlMethod getMethod() {
        TfUrlMethod tfUrlMethodForNumber = TfUrlMethod.forNumber(this.method_);
        TfUrlMethod tfUrlMethod = tfUrlMethodForNumber;
        if (tfUrlMethodForNumber == null) {
            tfUrlMethod = TfUrlMethod.UNRECOGNIZED;
        }
        return tfUrlMethod;
    }

    @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
    public int getMethodValue() {
        return this.method_;
    }

    @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
    public TfProvider getProvider() {
        TfProvider tfProviderForNumber = TfProvider.forNumber(this.provider_);
        TfProvider tfProvider = tfProviderForNumber;
        if (tfProviderForNumber == null) {
            tfProvider = TfProvider.UNRECOGNIZED;
        }
        return tfProvider;
    }

    @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
    public int getProviderValue() {
        return this.provider_;
    }

    @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
    public boolean getTf() {
        return this.tf_;
    }

    @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
    public TfTypeExt getTypeExt() {
        TfTypeExt tfTypeExtForNumber = TfTypeExt.forNumber(this.typeExt_);
        TfTypeExt tfTypeExt = tfTypeExtForNumber;
        if (tfTypeExtForNumber == null) {
            tfTypeExt = TfTypeExt.UNRECOGNIZED;
        }
        return tfTypeExt;
    }

    @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
    public int getTypeExtValue() {
        return this.typeExt_;
    }

    @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
    public String getUrl() {
        return this.url_;
    }

    @Override // com.bilibili.lib.tf.TfTransformRespOrBuilder
    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }
}
