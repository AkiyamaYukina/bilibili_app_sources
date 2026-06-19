package com.bilibili.studio.videoeditor;

import com.bilibili.studio.videoeditor.TimeLine;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/Draft.class */
public final class Draft extends GeneratedMessageLite<Draft, b> implements MessageLiteOrBuilder {
    public static final int COVERURL_FIELD_NUMBER = 6;
    public static final int CREATETIME_FIELD_NUMBER = 7;
    private static final Draft DEFAULT_INSTANCE;
    public static final int DRAFTID_FIELD_NUMBER = 2;
    public static final int DRAFTNAME_FIELD_NUMBER = 3;
    public static final int DRAFTTYPE_FIELD_NUMBER = 9;
    public static final int DRAFTVERSION_FIELD_NUMBER = 11;
    public static final int DURATION_FIELD_NUMBER = 5;
    private static volatile Parser<Draft> PARSER;
    public static final int PROTOCOLVERSION_FIELD_NUMBER = 1;
    public static final int SIZE_FIELD_NUMBER = 4;
    public static final int TIMELINE_FIELD_NUMBER = 10;
    public static final int UPDATETIME_FIELD_NUMBER = 8;
    private long createTime_;
    private int draftType_;
    private long duration_;
    private long size_;
    private TimeLine timeLine_;
    private long updateTime_;
    private String protocolVersion_ = "";
    private String draftId_ = "";
    private String draftName_ = "";
    private String coverUrl_ = "";
    private String draftVersion_ = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/Draft$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108857a;

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
                com.bilibili.studio.videoeditor.Draft.a.f108857a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.Draft.a.f108857a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.Draft.a.f108857a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.studio.videoeditor.Draft.a.f108857a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.studio.videoeditor.Draft.a.f108857a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.studio.videoeditor.Draft.a.f108857a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.studio.videoeditor.Draft.a.f108857a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.Draft.a.m10299clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/Draft$b.class */
    public static final class b extends GeneratedMessageLite.Builder<Draft, b> implements MessageLiteOrBuilder {
        public b() {
            super(Draft.DEFAULT_INSTANCE);
        }
    }

    static {
        Draft draft = new Draft();
        DEFAULT_INSTANCE = draft;
        GeneratedMessageLite.registerDefaultInstance(Draft.class, draft);
    }

    private Draft() {
    }

    private void clearCoverUrl() {
        this.coverUrl_ = getDefaultInstance().getCoverUrl();
    }

    private void clearCreateTime() {
        this.createTime_ = 0L;
    }

    private void clearDraftId() {
        this.draftId_ = getDefaultInstance().getDraftId();
    }

    private void clearDraftName() {
        this.draftName_ = getDefaultInstance().getDraftName();
    }

    private void clearDraftType() {
        this.draftType_ = 0;
    }

    private void clearDraftVersion() {
        this.draftVersion_ = getDefaultInstance().getDraftVersion();
    }

    private void clearDuration() {
        this.duration_ = 0L;
    }

    private void clearProtocolVersion() {
        this.protocolVersion_ = getDefaultInstance().getProtocolVersion();
    }

    private void clearSize() {
        this.size_ = 0L;
    }

    private void clearTimeLine() {
        this.timeLine_ = null;
    }

    private void clearUpdateTime() {
        this.updateTime_ = 0L;
    }

    public static Draft getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeTimeLine(TimeLine timeLine) {
        timeLine.getClass();
        TimeLine timeLine2 = this.timeLine_;
        if (timeLine2 == null || timeLine2 == TimeLine.getDefaultInstance()) {
            this.timeLine_ = timeLine;
        } else {
            this.timeLine_ = (TimeLine) ((TimeLine.b) TimeLine.newBuilder(this.timeLine_).mergeFrom(timeLine)).buildPartial();
        }
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(Draft draft) {
        return (b) DEFAULT_INSTANCE.createBuilder(draft);
    }

    public static Draft parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Draft) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Draft parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Draft) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Draft parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Draft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Draft parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Draft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Draft parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Draft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Draft parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Draft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Draft parseFrom(InputStream inputStream) throws IOException {
        return (Draft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Draft parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Draft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Draft parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Draft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Draft parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Draft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Draft parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Draft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Draft parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Draft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<Draft> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCoverUrl(String str) {
        str.getClass();
        this.coverUrl_ = str;
    }

    private void setCoverUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverUrl_ = byteString.toStringUtf8();
    }

    private void setCreateTime(long j7) {
        this.createTime_ = j7;
    }

    private void setDraftId(String str) {
        str.getClass();
        this.draftId_ = str;
    }

    private void setDraftIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.draftId_ = byteString.toStringUtf8();
    }

    private void setDraftName(String str) {
        str.getClass();
        this.draftName_ = str;
    }

    private void setDraftNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.draftName_ = byteString.toStringUtf8();
    }

    private void setDraftType(DraftType draftType) {
        this.draftType_ = draftType.getNumber();
    }

    private void setDraftTypeValue(int i7) {
        this.draftType_ = i7;
    }

    private void setDraftVersion(String str) {
        str.getClass();
        this.draftVersion_ = str;
    }

    private void setDraftVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.draftVersion_ = byteString.toStringUtf8();
    }

    private void setDuration(long j7) {
        this.duration_ = j7;
    }

    private void setProtocolVersion(String str) {
        str.getClass();
        this.protocolVersion_ = str;
    }

    private void setProtocolVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.protocolVersion_ = byteString.toStringUtf8();
    }

    private void setSize(long j7) {
        this.size_ = j7;
    }

    private void setTimeLine(TimeLine timeLine) {
        timeLine.getClass();
        this.timeLine_ = timeLine;
    }

    private void setUpdateTime(long j7) {
        this.updateTime_ = j7;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f108857a[methodToInvoke.ordinal()]) {
            case 1:
                return new Draft();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0002\u0005\u0002\u0006Ȉ\u0007\u0002\b\u0002\t\f\n\t\u000bȈ", new Object[]{"protocolVersion_", "draftId_", "draftName_", "size_", "duration_", "coverUrl_", "createTime_", "updateTime_", "draftType_", "timeLine_", "draftVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Draft.class) {
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

    public String getCoverUrl() {
        return this.coverUrl_;
    }

    public ByteString getCoverUrlBytes() {
        return ByteString.copyFromUtf8(this.coverUrl_);
    }

    public long getCreateTime() {
        return this.createTime_;
    }

    public String getDraftId() {
        return this.draftId_;
    }

    public ByteString getDraftIdBytes() {
        return ByteString.copyFromUtf8(this.draftId_);
    }

    public String getDraftName() {
        return this.draftName_;
    }

    public ByteString getDraftNameBytes() {
        return ByteString.copyFromUtf8(this.draftName_);
    }

    public DraftType getDraftType() {
        DraftType draftTypeForNumber = DraftType.forNumber(this.draftType_);
        DraftType draftType = draftTypeForNumber;
        if (draftTypeForNumber == null) {
            draftType = DraftType.UNRECOGNIZED;
        }
        return draftType;
    }

    public int getDraftTypeValue() {
        return this.draftType_;
    }

    public String getDraftVersion() {
        return this.draftVersion_;
    }

    public ByteString getDraftVersionBytes() {
        return ByteString.copyFromUtf8(this.draftVersion_);
    }

    public long getDuration() {
        return this.duration_;
    }

    public String getProtocolVersion() {
        return this.protocolVersion_;
    }

    public ByteString getProtocolVersionBytes() {
        return ByteString.copyFromUtf8(this.protocolVersion_);
    }

    public long getSize() {
        return this.size_;
    }

    public TimeLine getTimeLine() {
        TimeLine timeLine = this.timeLine_;
        TimeLine defaultInstance = timeLine;
        if (timeLine == null) {
            defaultInstance = TimeLine.getDefaultInstance();
        }
        return defaultInstance;
    }

    public long getUpdateTime() {
        return this.updateTime_;
    }

    public boolean hasTimeLine() {
        return this.timeLine_ != null;
    }
}
