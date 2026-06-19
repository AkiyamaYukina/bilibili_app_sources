package com.bilibili.studio.videoeditor;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CompoundCaptionTrack.class */
public final class CompoundCaptionTrack extends GeneratedMessageLite<CompoundCaptionTrack, b> implements o {
    public static final int COMPOUNDCAPTIONS_FIELD_NUMBER = 2;
    private static final CompoundCaptionTrack DEFAULT_INSTANCE;
    public static final int IDSTRING_FIELD_NUMBER = 1;
    private static volatile Parser<CompoundCaptionTrack> PARSER;
    private String idString_ = "";
    private Internal.ProtobufList<CompoundCaptionFx> compoundCaptions_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CompoundCaptionTrack$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108852a;

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
                com.bilibili.studio.videoeditor.CompoundCaptionTrack.a.f108852a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.CompoundCaptionTrack.a.f108852a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.CompoundCaptionTrack.a.f108852a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.studio.videoeditor.CompoundCaptionTrack.a.f108852a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.studio.videoeditor.CompoundCaptionTrack.a.f108852a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.studio.videoeditor.CompoundCaptionTrack.a.f108852a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.studio.videoeditor.CompoundCaptionTrack.a.f108852a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.CompoundCaptionTrack.a.m10289clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CompoundCaptionTrack$b.class */
    public static final class b extends GeneratedMessageLite.Builder<CompoundCaptionTrack, b> implements o {
        public b() {
            super(CompoundCaptionTrack.DEFAULT_INSTANCE);
        }
    }

    static {
        CompoundCaptionTrack compoundCaptionTrack = new CompoundCaptionTrack();
        DEFAULT_INSTANCE = compoundCaptionTrack;
        GeneratedMessageLite.registerDefaultInstance(CompoundCaptionTrack.class, compoundCaptionTrack);
    }

    private CompoundCaptionTrack() {
    }

    private void addAllCompoundCaptions(Iterable<? extends CompoundCaptionFx> iterable) {
        ensureCompoundCaptionsIsMutable();
        AbstractMessageLite.addAll(iterable, this.compoundCaptions_);
    }

    private void addCompoundCaptions(int i7, CompoundCaptionFx compoundCaptionFx) {
        compoundCaptionFx.getClass();
        ensureCompoundCaptionsIsMutable();
        this.compoundCaptions_.add(i7, compoundCaptionFx);
    }

    private void addCompoundCaptions(CompoundCaptionFx compoundCaptionFx) {
        compoundCaptionFx.getClass();
        ensureCompoundCaptionsIsMutable();
        this.compoundCaptions_.add(compoundCaptionFx);
    }

    private void clearCompoundCaptions() {
        this.compoundCaptions_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearIdString() {
        this.idString_ = getDefaultInstance().getIdString();
    }

    private void ensureCompoundCaptionsIsMutable() {
        Internal.ProtobufList<CompoundCaptionFx> protobufList = this.compoundCaptions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.compoundCaptions_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static CompoundCaptionTrack getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(CompoundCaptionTrack compoundCaptionTrack) {
        return (b) DEFAULT_INSTANCE.createBuilder(compoundCaptionTrack);
    }

    public static CompoundCaptionTrack parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CompoundCaptionTrack) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CompoundCaptionTrack parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CompoundCaptionTrack) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CompoundCaptionTrack parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CompoundCaptionTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CompoundCaptionTrack parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CompoundCaptionTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CompoundCaptionTrack parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CompoundCaptionTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CompoundCaptionTrack parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CompoundCaptionTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static CompoundCaptionTrack parseFrom(InputStream inputStream) throws IOException {
        return (CompoundCaptionTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CompoundCaptionTrack parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CompoundCaptionTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CompoundCaptionTrack parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CompoundCaptionTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static CompoundCaptionTrack parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CompoundCaptionTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CompoundCaptionTrack parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CompoundCaptionTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CompoundCaptionTrack parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CompoundCaptionTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<CompoundCaptionTrack> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeCompoundCaptions(int i7) {
        ensureCompoundCaptionsIsMutable();
        this.compoundCaptions_.remove(i7);
    }

    private void setCompoundCaptions(int i7, CompoundCaptionFx compoundCaptionFx) {
        compoundCaptionFx.getClass();
        ensureCompoundCaptionsIsMutable();
        this.compoundCaptions_.set(i7, compoundCaptionFx);
    }

    private void setIdString(String str) {
        str.getClass();
        this.idString_ = str;
    }

    private void setIdStringBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.idString_ = byteString.toStringUtf8();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f108852a[methodToInvoke.ordinal()]) {
            case 1:
                return new CompoundCaptionTrack();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"idString_", "compoundCaptions_", CompoundCaptionFx.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CompoundCaptionTrack.class) {
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

    public CompoundCaptionFx getCompoundCaptions(int i7) {
        return (CompoundCaptionFx) this.compoundCaptions_.get(i7);
    }

    public int getCompoundCaptionsCount() {
        return this.compoundCaptions_.size();
    }

    public List<CompoundCaptionFx> getCompoundCaptionsList() {
        return this.compoundCaptions_;
    }

    public n getCompoundCaptionsOrBuilder(int i7) {
        return (n) this.compoundCaptions_.get(i7);
    }

    public List<? extends n> getCompoundCaptionsOrBuilderList() {
        return this.compoundCaptions_;
    }

    public String getIdString() {
        return this.idString_;
    }

    public ByteString getIdStringBytes() {
        return ByteString.copyFromUtf8(this.idString_);
    }
}
