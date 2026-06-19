package com.bilibili.lib.rpc.track.model;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/CrVersion.class */
public final class CrVersion extends GeneratedMessageLite<CrVersion, Builder> implements MessageLiteOrBuilder {
    public static final int BILI_LAST_CHANGE_FIELD_NUMBER = 3;
    private static final CrVersion DEFAULT_INSTANCE;
    public static final int LAST_CHANGE_FIELD_NUMBER = 2;
    private static volatile Parser<CrVersion> PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private String version_ = "";
    private String lastChange_ = "";
    private String biliLastChange_ = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/CrVersion$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder<CrVersion, Builder> implements MessageLiteOrBuilder {
        public Builder() {
            super(CrVersion.DEFAULT_INSTANCE);
        }

        public Builder clearBiliLastChange() {
            copyOnWrite();
            ((CrVersion) ((GeneratedMessageLite.Builder) this).instance).clearBiliLastChange();
            return this;
        }

        public Builder clearLastChange() {
            copyOnWrite();
            ((CrVersion) ((GeneratedMessageLite.Builder) this).instance).clearLastChange();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((CrVersion) ((GeneratedMessageLite.Builder) this).instance).clearVersion();
            return this;
        }

        public String getBiliLastChange() {
            return ((CrVersion) ((GeneratedMessageLite.Builder) this).instance).getBiliLastChange();
        }

        public ByteString getBiliLastChangeBytes() {
            return ((CrVersion) ((GeneratedMessageLite.Builder) this).instance).getBiliLastChangeBytes();
        }

        public String getLastChange() {
            return ((CrVersion) ((GeneratedMessageLite.Builder) this).instance).getLastChange();
        }

        public ByteString getLastChangeBytes() {
            return ((CrVersion) ((GeneratedMessageLite.Builder) this).instance).getLastChangeBytes();
        }

        public String getVersion() {
            return ((CrVersion) ((GeneratedMessageLite.Builder) this).instance).getVersion();
        }

        public ByteString getVersionBytes() {
            return ((CrVersion) ((GeneratedMessageLite.Builder) this).instance).getVersionBytes();
        }

        public Builder setBiliLastChange(String str) {
            copyOnWrite();
            ((CrVersion) ((GeneratedMessageLite.Builder) this).instance).setBiliLastChange(str);
            return this;
        }

        public Builder setBiliLastChangeBytes(ByteString byteString) {
            copyOnWrite();
            ((CrVersion) ((GeneratedMessageLite.Builder) this).instance).setBiliLastChangeBytes(byteString);
            return this;
        }

        public Builder setLastChange(String str) {
            copyOnWrite();
            ((CrVersion) ((GeneratedMessageLite.Builder) this).instance).setLastChange(str);
            return this;
        }

        public Builder setLastChangeBytes(ByteString byteString) {
            copyOnWrite();
            ((CrVersion) ((GeneratedMessageLite.Builder) this).instance).setLastChangeBytes(byteString);
            return this;
        }

        public Builder setVersion(String str) {
            copyOnWrite();
            ((CrVersion) ((GeneratedMessageLite.Builder) this).instance).setVersion(str);
            return this;
        }

        public Builder setVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((CrVersion) ((GeneratedMessageLite.Builder) this).instance).setVersionBytes(byteString);
            return this;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/CrVersion$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f64364a;

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
                com.bilibili.lib.rpc.track.model.CrVersion.a.f64364a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.lib.rpc.track.model.CrVersion.a.f64364a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.lib.rpc.track.model.CrVersion.a.f64364a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.lib.rpc.track.model.CrVersion.a.f64364a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.lib.rpc.track.model.CrVersion.a.f64364a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.lib.rpc.track.model.CrVersion.a.f64364a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.lib.rpc.track.model.CrVersion.a.f64364a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.rpc.track.model.CrVersion.a.m6726clinit():void");
        }
    }

    static {
        CrVersion crVersion = new CrVersion();
        DEFAULT_INSTANCE = crVersion;
        GeneratedMessageLite.registerDefaultInstance(CrVersion.class, crVersion);
    }

    private CrVersion() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBiliLastChange() {
        this.biliLastChange_ = getDefaultInstance().getBiliLastChange();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastChange() {
        this.lastChange_ = getDefaultInstance().getLastChange();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    public static CrVersion getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(CrVersion crVersion) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(crVersion);
    }

    public static CrVersion parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CrVersion) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CrVersion parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CrVersion) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CrVersion parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CrVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CrVersion parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CrVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CrVersion parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CrVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CrVersion parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CrVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static CrVersion parseFrom(InputStream inputStream) throws IOException {
        return (CrVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CrVersion parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CrVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CrVersion parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CrVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static CrVersion parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CrVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CrVersion parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CrVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CrVersion parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CrVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<CrVersion> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBiliLastChange(String str) {
        str.getClass();
        this.biliLastChange_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBiliLastChangeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.biliLastChange_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastChange(String str) {
        str.getClass();
        this.lastChange_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastChangeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.lastChange_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.version_ = byteString.toStringUtf8();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f64364a[methodToInvoke.ordinal()]) {
            case 1:
                return new CrVersion();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"version_", "lastChange_", "biliLastChange_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CrVersion.class) {
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

    public String getBiliLastChange() {
        return this.biliLastChange_;
    }

    public ByteString getBiliLastChangeBytes() {
        return ByteString.copyFromUtf8(this.biliLastChange_);
    }

    public String getLastChange() {
        return this.lastChange_;
    }

    public ByteString getLastChangeBytes() {
        return ByteString.copyFromUtf8(this.lastChange_);
    }

    public String getVersion() {
        return this.version_;
    }

    public ByteString getVersionBytes() {
        return ByteString.copyFromUtf8(this.version_);
    }
}
