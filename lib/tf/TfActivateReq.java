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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfActivateReq.class */
public final class TfActivateReq extends GeneratedMessageLite<TfActivateReq, Builder> implements TfActivateReqOrBuilder {
    public static final int CAPTCHA_FIELD_NUMBER = 6;
    private static final TfActivateReq DEFAULT_INSTANCE;
    public static final int FAKE_ID_FIELD_NUMBER = 7;
    public static final int IS_AUTO_FIELD_NUMBER = 5;
    private static volatile Parser<TfActivateReq> PARSER;
    public static final int PIP_FIELD_NUMBER = 4;
    public static final int PROVIDER_FIELD_NUMBER = 1;
    public static final int TYPE_EXT_FIELD_NUMBER = 2;
    public static final int USER_MOB_FIELD_NUMBER = 3;
    private boolean isAuto_;
    private int provider_;
    private int typeExt_;
    private String userMob_ = "";
    private String pip_ = "";
    private String captcha_ = "";
    private String fakeId_ = "";

    /* JADX INFO: renamed from: com.bilibili.lib.tf.TfActivateReq$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfActivateReq$1.class */
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
                com.bilibili.lib.tf.TfActivateReq.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.lib.tf.TfActivateReq.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.lib.tf.TfActivateReq.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.lib.tf.TfActivateReq.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.lib.tf.TfActivateReq.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.lib.tf.TfActivateReq.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.lib.tf.TfActivateReq.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.tf.TfActivateReq.AnonymousClass1.m6804clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfActivateReq$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder<TfActivateReq, Builder> implements TfActivateReqOrBuilder {
        private Builder() {
            super(TfActivateReq.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearCaptcha() {
            copyOnWrite();
            ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).clearCaptcha();
            return this;
        }

        public Builder clearFakeId() {
            copyOnWrite();
            ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).clearFakeId();
            return this;
        }

        public Builder clearIsAuto() {
            copyOnWrite();
            ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).clearIsAuto();
            return this;
        }

        public Builder clearPip() {
            copyOnWrite();
            ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).clearPip();
            return this;
        }

        public Builder clearProvider() {
            copyOnWrite();
            ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).clearProvider();
            return this;
        }

        public Builder clearTypeExt() {
            copyOnWrite();
            ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).clearTypeExt();
            return this;
        }

        public Builder clearUserMob() {
            copyOnWrite();
            ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).clearUserMob();
            return this;
        }

        @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
        public String getCaptcha() {
            return ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).getCaptcha();
        }

        @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
        public ByteString getCaptchaBytes() {
            return ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).getCaptchaBytes();
        }

        @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
        public String getFakeId() {
            return ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).getFakeId();
        }

        @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
        public ByteString getFakeIdBytes() {
            return ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).getFakeIdBytes();
        }

        @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
        public boolean getIsAuto() {
            return ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).getIsAuto();
        }

        @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
        public String getPip() {
            return ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).getPip();
        }

        @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
        public ByteString getPipBytes() {
            return ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).getPipBytes();
        }

        @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
        public TfProvider getProvider() {
            return ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).getProvider();
        }

        @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
        public int getProviderValue() {
            return ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).getProviderValue();
        }

        @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
        public TfTypeExt getTypeExt() {
            return ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).getTypeExt();
        }

        @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
        public int getTypeExtValue() {
            return ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).getTypeExtValue();
        }

        @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
        public String getUserMob() {
            return ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).getUserMob();
        }

        @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
        public ByteString getUserMobBytes() {
            return ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).getUserMobBytes();
        }

        public Builder setCaptcha(String str) {
            copyOnWrite();
            ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).setCaptcha(str);
            return this;
        }

        public Builder setCaptchaBytes(ByteString byteString) {
            copyOnWrite();
            ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).setCaptchaBytes(byteString);
            return this;
        }

        public Builder setFakeId(String str) {
            copyOnWrite();
            ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).setFakeId(str);
            return this;
        }

        public Builder setFakeIdBytes(ByteString byteString) {
            copyOnWrite();
            ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).setFakeIdBytes(byteString);
            return this;
        }

        public Builder setIsAuto(boolean z6) {
            copyOnWrite();
            ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).setIsAuto(z6);
            return this;
        }

        public Builder setPip(String str) {
            copyOnWrite();
            ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).setPip(str);
            return this;
        }

        public Builder setPipBytes(ByteString byteString) {
            copyOnWrite();
            ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).setPipBytes(byteString);
            return this;
        }

        public Builder setProvider(TfProvider tfProvider) {
            copyOnWrite();
            ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).setProvider(tfProvider);
            return this;
        }

        public Builder setProviderValue(int i7) {
            copyOnWrite();
            ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).setProviderValue(i7);
            return this;
        }

        public Builder setTypeExt(TfTypeExt tfTypeExt) {
            copyOnWrite();
            ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).setTypeExt(tfTypeExt);
            return this;
        }

        public Builder setTypeExtValue(int i7) {
            copyOnWrite();
            ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).setTypeExtValue(i7);
            return this;
        }

        public Builder setUserMob(String str) {
            copyOnWrite();
            ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).setUserMob(str);
            return this;
        }

        public Builder setUserMobBytes(ByteString byteString) {
            copyOnWrite();
            ((TfActivateReq) ((GeneratedMessageLite.Builder) this).instance).setUserMobBytes(byteString);
            return this;
        }
    }

    static {
        TfActivateReq tfActivateReq = new TfActivateReq();
        DEFAULT_INSTANCE = tfActivateReq;
        GeneratedMessageLite.registerDefaultInstance(TfActivateReq.class, tfActivateReq);
    }

    private TfActivateReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCaptcha() {
        this.captcha_ = getDefaultInstance().getCaptcha();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFakeId() {
        this.fakeId_ = getDefaultInstance().getFakeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAuto() {
        this.isAuto_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPip() {
        this.pip_ = getDefaultInstance().getPip();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.provider_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeExt() {
        this.typeExt_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserMob() {
        this.userMob_ = getDefaultInstance().getUserMob();
    }

    public static TfActivateReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(TfActivateReq tfActivateReq) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tfActivateReq);
    }

    public static TfActivateReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TfActivateReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TfActivateReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfActivateReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TfActivateReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TfActivateReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TfActivateReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfActivateReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TfActivateReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TfActivateReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TfActivateReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfActivateReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static TfActivateReq parseFrom(InputStream inputStream) throws IOException {
        return (TfActivateReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TfActivateReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfActivateReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TfActivateReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TfActivateReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TfActivateReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfActivateReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TfActivateReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TfActivateReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TfActivateReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfActivateReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<TfActivateReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCaptcha(String str) {
        str.getClass();
        this.captcha_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCaptchaBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.captcha_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFakeId(String str) {
        str.getClass();
        this.fakeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFakeIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fakeId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAuto(boolean z6) {
        this.isAuto_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPip(String str) {
        str.getClass();
        this.pip_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPipBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pip_ = byteString.toStringUtf8();
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
    public void setTypeExt(TfTypeExt tfTypeExt) {
        this.typeExt_ = tfTypeExt.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeExtValue(int i7) {
        this.typeExt_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserMob(String str) {
        str.getClass();
        this.userMob_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserMobBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.userMob_ = byteString.toStringUtf8();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TfActivateReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002\f\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006Ȉ\u0007Ȉ", new Object[]{"provider_", "typeExt_", "userMob_", "pip_", "isAuto_", "captcha_", "fakeId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (TfActivateReq.class) {
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

    @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
    public String getCaptcha() {
        return this.captcha_;
    }

    @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
    public ByteString getCaptchaBytes() {
        return ByteString.copyFromUtf8(this.captcha_);
    }

    @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
    public String getFakeId() {
        return this.fakeId_;
    }

    @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
    public ByteString getFakeIdBytes() {
        return ByteString.copyFromUtf8(this.fakeId_);
    }

    @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
    public boolean getIsAuto() {
        return this.isAuto_;
    }

    @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
    public String getPip() {
        return this.pip_;
    }

    @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
    public ByteString getPipBytes() {
        return ByteString.copyFromUtf8(this.pip_);
    }

    @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
    public TfProvider getProvider() {
        TfProvider tfProviderForNumber = TfProvider.forNumber(this.provider_);
        TfProvider tfProvider = tfProviderForNumber;
        if (tfProviderForNumber == null) {
            tfProvider = TfProvider.UNRECOGNIZED;
        }
        return tfProvider;
    }

    @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
    public int getProviderValue() {
        return this.provider_;
    }

    @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
    public TfTypeExt getTypeExt() {
        TfTypeExt tfTypeExtForNumber = TfTypeExt.forNumber(this.typeExt_);
        TfTypeExt tfTypeExt = tfTypeExtForNumber;
        if (tfTypeExtForNumber == null) {
            tfTypeExt = TfTypeExt.UNRECOGNIZED;
        }
        return tfTypeExt;
    }

    @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
    public int getTypeExtValue() {
        return this.typeExt_;
    }

    @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
    public String getUserMob() {
        return this.userMob_;
    }

    @Override // com.bilibili.lib.tf.TfActivateReqOrBuilder
    public ByteString getUserMobBytes() {
        return ByteString.copyFromUtf8(this.userMob_);
    }
}
