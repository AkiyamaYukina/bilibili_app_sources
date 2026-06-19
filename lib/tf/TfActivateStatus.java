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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfActivateStatus.class */
public final class TfActivateStatus extends GeneratedMessageLite<TfActivateStatus, Builder> implements TfActivateStatusOrBuilder {
    public static final int CAPTCHA_FIELD_NUMBER = 6;
    private static final TfActivateStatus DEFAULT_INSTANCE;
    public static final int FAKE_ID_FIELD_NUMBER = 7;
    public static final int IS_AUTO_FIELD_NUMBER = 5;
    private static volatile Parser<TfActivateStatus> PARSER;
    public static final int PIP_FIELD_NUMBER = 4;
    public static final int PRODUCT_DESC_FIELD_NUMBER = 14;
    public static final int PRODUCT_ID_FIELD_NUMBER = 13;
    public static final int PRODUCT_TAG_FIELD_NUMBER = 15;
    public static final int PRODUCT_TYPE_FIELD_NUMBER = 16;
    public static final int PROVIDER_FIELD_NUMBER = 1;
    public static final int SP_ID_FIELD_NUMBER = 22;
    public static final int TIMESTAMP_FIELD_NUMBER = 21;
    public static final int TYPE_EXT_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 11;
    public static final int USER_MOB_FIELD_NUMBER = 3;
    public static final int WAY_FIELD_NUMBER = 12;
    private boolean isAuto_;
    private int productType_;
    private int provider_;
    private long timestamp_;
    private int typeExt_;
    private int type_;
    private int way_;
    private String userMob_ = "";
    private String pip_ = "";
    private String captcha_ = "";
    private String fakeId_ = "";
    private String productId_ = "";
    private String productDesc_ = "";
    private String productTag_ = "";
    private String spId_ = "";

    /* JADX INFO: renamed from: com.bilibili.lib.tf.TfActivateStatus$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfActivateStatus$1.class */
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
                com.bilibili.lib.tf.TfActivateStatus.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.lib.tf.TfActivateStatus.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.lib.tf.TfActivateStatus.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.lib.tf.TfActivateStatus.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.lib.tf.TfActivateStatus.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.lib.tf.TfActivateStatus.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.lib.tf.TfActivateStatus.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.tf.TfActivateStatus.AnonymousClass1.m6808clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfActivateStatus$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder<TfActivateStatus, Builder> implements TfActivateStatusOrBuilder {
        private Builder() {
            super(TfActivateStatus.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearCaptcha() {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).clearCaptcha();
            return this;
        }

        public Builder clearFakeId() {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).clearFakeId();
            return this;
        }

        public Builder clearIsAuto() {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).clearIsAuto();
            return this;
        }

        public Builder clearPip() {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).clearPip();
            return this;
        }

        public Builder clearProductDesc() {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).clearProductDesc();
            return this;
        }

        public Builder clearProductId() {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).clearProductId();
            return this;
        }

        public Builder clearProductTag() {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).clearProductTag();
            return this;
        }

        @Deprecated
        public Builder clearProductType() {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).clearProductType();
            return this;
        }

        public Builder clearProvider() {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).clearProvider();
            return this;
        }

        public Builder clearSpId() {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).clearSpId();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).clearTimestamp();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).clearType();
            return this;
        }

        public Builder clearTypeExt() {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).clearTypeExt();
            return this;
        }

        public Builder clearUserMob() {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).clearUserMob();
            return this;
        }

        public Builder clearWay() {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).clearWay();
            return this;
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public String getCaptcha() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getCaptcha();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public ByteString getCaptchaBytes() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getCaptchaBytes();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public String getFakeId() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getFakeId();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public ByteString getFakeIdBytes() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getFakeIdBytes();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public boolean getIsAuto() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getIsAuto();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public String getPip() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getPip();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public ByteString getPipBytes() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getPipBytes();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public String getProductDesc() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getProductDesc();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public ByteString getProductDescBytes() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getProductDescBytes();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public String getProductId() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getProductId();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public ByteString getProductIdBytes() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getProductIdBytes();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public String getProductTag() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getProductTag();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public ByteString getProductTagBytes() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getProductTagBytes();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        @Deprecated
        public TfProductType getProductType() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getProductType();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        @Deprecated
        public int getProductTypeValue() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getProductTypeValue();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public TfProvider getProvider() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getProvider();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public int getProviderValue() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getProviderValue();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public String getSpId() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getSpId();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public ByteString getSpIdBytes() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getSpIdBytes();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public long getTimestamp() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getTimestamp();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public TfType getType() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getType();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public TfTypeExt getTypeExt() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getTypeExt();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public int getTypeExtValue() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getTypeExtValue();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public int getTypeValue() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getTypeValue();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public String getUserMob() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getUserMob();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public ByteString getUserMobBytes() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getUserMobBytes();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public TfWay getWay() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getWay();
        }

        @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
        public int getWayValue() {
            return ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).getWayValue();
        }

        public Builder setCaptcha(String str) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setCaptcha(str);
            return this;
        }

        public Builder setCaptchaBytes(ByteString byteString) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setCaptchaBytes(byteString);
            return this;
        }

        public Builder setFakeId(String str) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setFakeId(str);
            return this;
        }

        public Builder setFakeIdBytes(ByteString byteString) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setFakeIdBytes(byteString);
            return this;
        }

        public Builder setIsAuto(boolean z6) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setIsAuto(z6);
            return this;
        }

        public Builder setPip(String str) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setPip(str);
            return this;
        }

        public Builder setPipBytes(ByteString byteString) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setPipBytes(byteString);
            return this;
        }

        public Builder setProductDesc(String str) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setProductDesc(str);
            return this;
        }

        public Builder setProductDescBytes(ByteString byteString) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setProductDescBytes(byteString);
            return this;
        }

        public Builder setProductId(String str) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setProductId(str);
            return this;
        }

        public Builder setProductIdBytes(ByteString byteString) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setProductIdBytes(byteString);
            return this;
        }

        public Builder setProductTag(String str) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setProductTag(str);
            return this;
        }

        public Builder setProductTagBytes(ByteString byteString) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setProductTagBytes(byteString);
            return this;
        }

        @Deprecated
        public Builder setProductType(TfProductType tfProductType) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setProductType(tfProductType);
            return this;
        }

        @Deprecated
        public Builder setProductTypeValue(int i7) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setProductTypeValue(i7);
            return this;
        }

        public Builder setProvider(TfProvider tfProvider) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setProvider(tfProvider);
            return this;
        }

        public Builder setProviderValue(int i7) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setProviderValue(i7);
            return this;
        }

        public Builder setSpId(String str) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setSpId(str);
            return this;
        }

        public Builder setSpIdBytes(ByteString byteString) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setSpIdBytes(byteString);
            return this;
        }

        public Builder setTimestamp(long j7) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setTimestamp(j7);
            return this;
        }

        public Builder setType(TfType tfType) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setType(tfType);
            return this;
        }

        public Builder setTypeExt(TfTypeExt tfTypeExt) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setTypeExt(tfTypeExt);
            return this;
        }

        public Builder setTypeExtValue(int i7) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setTypeExtValue(i7);
            return this;
        }

        public Builder setTypeValue(int i7) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setTypeValue(i7);
            return this;
        }

        public Builder setUserMob(String str) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setUserMob(str);
            return this;
        }

        public Builder setUserMobBytes(ByteString byteString) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setUserMobBytes(byteString);
            return this;
        }

        public Builder setWay(TfWay tfWay) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setWay(tfWay);
            return this;
        }

        public Builder setWayValue(int i7) {
            copyOnWrite();
            ((TfActivateStatus) ((GeneratedMessageLite.Builder) this).instance).setWayValue(i7);
            return this;
        }
    }

    static {
        TfActivateStatus tfActivateStatus = new TfActivateStatus();
        DEFAULT_INSTANCE = tfActivateStatus;
        GeneratedMessageLite.registerDefaultInstance(TfActivateStatus.class, tfActivateStatus);
    }

    private TfActivateStatus() {
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
    public void clearProductDesc() {
        this.productDesc_ = getDefaultInstance().getProductDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductId() {
        this.productId_ = getDefaultInstance().getProductId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductTag() {
        this.productTag_ = getDefaultInstance().getProductTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductType() {
        this.productType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.provider_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpId() {
        this.spId_ = getDefaultInstance().getSpId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeExt() {
        this.typeExt_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserMob() {
        this.userMob_ = getDefaultInstance().getUserMob();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWay() {
        this.way_ = 0;
    }

    public static TfActivateStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(TfActivateStatus tfActivateStatus) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tfActivateStatus);
    }

    public static TfActivateStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TfActivateStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TfActivateStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfActivateStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TfActivateStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TfActivateStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TfActivateStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfActivateStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TfActivateStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TfActivateStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TfActivateStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfActivateStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static TfActivateStatus parseFrom(InputStream inputStream) throws IOException {
        return (TfActivateStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TfActivateStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfActivateStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TfActivateStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TfActivateStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TfActivateStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfActivateStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TfActivateStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TfActivateStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TfActivateStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfActivateStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<TfActivateStatus> parser() {
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
    public void setProductDesc(String str) {
        str.getClass();
        this.productDesc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.productDesc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductId(String str) {
        str.getClass();
        this.productId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.productId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductTag(String str) {
        str.getClass();
        this.productTag_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductTagBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.productTag_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductType(TfProductType tfProductType) {
        this.productType_ = tfProductType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductTypeValue(int i7) {
        this.productType_ = i7;
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
    public void setSpId(String str) {
        str.getClass();
        this.spId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.spId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j7) {
        this.timestamp_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(TfType tfType) {
        this.type_ = tfType.getNumber();
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
    public void setTypeValue(int i7) {
        this.type_ = i7;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setWay(TfWay tfWay) {
        this.way_ = tfWay.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWayValue(int i7) {
        this.way_ = i7;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TfActivateStatus();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u0016\u000f\u0000\u0000\u0000\u0001\f\u0002\f\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006Ȉ\u0007Ȉ\u000b\f\f\f\rȈ\u000eȈ\u000fȈ\u0010\f\u0015\u0002\u0016Ȉ", new Object[]{"provider_", "typeExt_", "userMob_", "pip_", "isAuto_", "captcha_", "fakeId_", "type_", "way_", "productId_", "productDesc_", "productTag_", "productType_", "timestamp_", "spId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (TfActivateStatus.class) {
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

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public String getCaptcha() {
        return this.captcha_;
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public ByteString getCaptchaBytes() {
        return ByteString.copyFromUtf8(this.captcha_);
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public String getFakeId() {
        return this.fakeId_;
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public ByteString getFakeIdBytes() {
        return ByteString.copyFromUtf8(this.fakeId_);
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public boolean getIsAuto() {
        return this.isAuto_;
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public String getPip() {
        return this.pip_;
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public ByteString getPipBytes() {
        return ByteString.copyFromUtf8(this.pip_);
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public String getProductDesc() {
        return this.productDesc_;
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public ByteString getProductDescBytes() {
        return ByteString.copyFromUtf8(this.productDesc_);
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public String getProductId() {
        return this.productId_;
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public ByteString getProductIdBytes() {
        return ByteString.copyFromUtf8(this.productId_);
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public String getProductTag() {
        return this.productTag_;
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public ByteString getProductTagBytes() {
        return ByteString.copyFromUtf8(this.productTag_);
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    @Deprecated
    public TfProductType getProductType() {
        TfProductType tfProductTypeForNumber = TfProductType.forNumber(this.productType_);
        TfProductType tfProductType = tfProductTypeForNumber;
        if (tfProductTypeForNumber == null) {
            tfProductType = TfProductType.UNRECOGNIZED;
        }
        return tfProductType;
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    @Deprecated
    public int getProductTypeValue() {
        return this.productType_;
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public TfProvider getProvider() {
        TfProvider tfProviderForNumber = TfProvider.forNumber(this.provider_);
        TfProvider tfProvider = tfProviderForNumber;
        if (tfProviderForNumber == null) {
            tfProvider = TfProvider.UNRECOGNIZED;
        }
        return tfProvider;
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public int getProviderValue() {
        return this.provider_;
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public String getSpId() {
        return this.spId_;
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public ByteString getSpIdBytes() {
        return ByteString.copyFromUtf8(this.spId_);
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public long getTimestamp() {
        return this.timestamp_;
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public TfType getType() {
        TfType tfTypeForNumber = TfType.forNumber(this.type_);
        TfType tfType = tfTypeForNumber;
        if (tfTypeForNumber == null) {
            tfType = TfType.UNRECOGNIZED;
        }
        return tfType;
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public TfTypeExt getTypeExt() {
        TfTypeExt tfTypeExtForNumber = TfTypeExt.forNumber(this.typeExt_);
        TfTypeExt tfTypeExt = tfTypeExtForNumber;
        if (tfTypeExtForNumber == null) {
            tfTypeExt = TfTypeExt.UNRECOGNIZED;
        }
        return tfTypeExt;
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public int getTypeExtValue() {
        return this.typeExt_;
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public String getUserMob() {
        return this.userMob_;
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public ByteString getUserMobBytes() {
        return ByteString.copyFromUtf8(this.userMob_);
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public TfWay getWay() {
        TfWay tfWayForNumber = TfWay.forNumber(this.way_);
        TfWay tfWay = tfWayForNumber;
        if (tfWayForNumber == null) {
            tfWay = TfWay.UNRECOGNIZED;
        }
        return tfWay;
    }

    @Override // com.bilibili.lib.tf.TfActivateStatusOrBuilder
    public int getWayValue() {
        return this.way_;
    }
}
