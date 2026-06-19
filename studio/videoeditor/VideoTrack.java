package com.bilibili.studio.videoeditor;

import com.bilibili.studio.videoeditor.Volume;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoTrack.class */
public final class VideoTrack extends GeneratedMessageLite<VideoTrack, b> implements I {
    public static final int CLIPS_FIELD_NUMBER = 4;
    private static final VideoTrack DEFAULT_INSTANCE;
    public static final int IDSTRING_FIELD_NUMBER = 1;
    private static volatile Parser<VideoTrack> PARSER;
    public static final int TRANSITIONS_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int VOLUME_FIELD_NUMBER = 2;
    private int type_;
    private Volume volume_;
    private String idString_ = "";
    private Internal.ProtobufList<VideoTransition> transitions_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<VideoClip> clips_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoTrack$Type.class */
    public enum Type implements Internal.EnumLite {
        VIDEO_TRACK_MAIN(0),
        VIDEO_TRACK_PIP(1),
        VIDEO_TRACK_IDOL(2),
        UNRECOGNIZED(-1);

        public static final int VIDEO_TRACK_IDOL_VALUE = 2;
        public static final int VIDEO_TRACK_MAIN_VALUE = 0;
        public static final int VIDEO_TRACK_PIP_VALUE = 1;
        private static final Internal.EnumLiteMap<Type> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoTrack$Type$a.class */
        public final class a implements Internal.EnumLiteMap<Type> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return Type.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoTrack$Type$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108906a = new Object();

            public final boolean isInRange(int i7) {
                return Type.forNumber(i7) != null;
            }
        }

        Type(int i7) {
            this.value = i7;
        }

        public static Type forNumber(int i7) {
            if (i7 == 0) {
                return VIDEO_TRACK_MAIN;
            }
            if (i7 == 1) {
                return VIDEO_TRACK_PIP;
            }
            if (i7 != 2) {
                return null;
            }
            return VIDEO_TRACK_IDOL;
        }

        public static Internal.EnumLiteMap<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108906a;
        }

        @Deprecated
        public static Type valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoTrack$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108907a;

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
                com.bilibili.studio.videoeditor.VideoTrack.a.f108907a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.VideoTrack.a.f108907a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.VideoTrack.a.f108907a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.studio.videoeditor.VideoTrack.a.f108907a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.studio.videoeditor.VideoTrack.a.f108907a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.studio.videoeditor.VideoTrack.a.f108907a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.studio.videoeditor.VideoTrack.a.f108907a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.VideoTrack.a.m10391clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoTrack$b.class */
    public static final class b extends GeneratedMessageLite.Builder<VideoTrack, b> implements I {
        public b() {
            super(VideoTrack.DEFAULT_INSTANCE);
        }
    }

    static {
        VideoTrack videoTrack = new VideoTrack();
        DEFAULT_INSTANCE = videoTrack;
        GeneratedMessageLite.registerDefaultInstance(VideoTrack.class, videoTrack);
    }

    private VideoTrack() {
    }

    private void addAllClips(Iterable<? extends VideoClip> iterable) {
        ensureClipsIsMutable();
        AbstractMessageLite.addAll(iterable, this.clips_);
    }

    private void addAllTransitions(Iterable<? extends VideoTransition> iterable) {
        ensureTransitionsIsMutable();
        AbstractMessageLite.addAll(iterable, this.transitions_);
    }

    private void addClips(int i7, VideoClip videoClip) {
        videoClip.getClass();
        ensureClipsIsMutable();
        this.clips_.add(i7, videoClip);
    }

    private void addClips(VideoClip videoClip) {
        videoClip.getClass();
        ensureClipsIsMutable();
        this.clips_.add(videoClip);
    }

    private void addTransitions(int i7, VideoTransition videoTransition) {
        videoTransition.getClass();
        ensureTransitionsIsMutable();
        this.transitions_.add(i7, videoTransition);
    }

    private void addTransitions(VideoTransition videoTransition) {
        videoTransition.getClass();
        ensureTransitionsIsMutable();
        this.transitions_.add(videoTransition);
    }

    private void clearClips() {
        this.clips_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearIdString() {
        this.idString_ = getDefaultInstance().getIdString();
    }

    private void clearTransitions() {
        this.transitions_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearType() {
        this.type_ = 0;
    }

    private void clearVolume() {
        this.volume_ = null;
    }

    private void ensureClipsIsMutable() {
        Internal.ProtobufList<VideoClip> protobufList = this.clips_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.clips_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureTransitionsIsMutable() {
        Internal.ProtobufList<VideoTransition> protobufList = this.transitions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.transitions_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static VideoTrack getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeVolume(Volume volume) {
        volume.getClass();
        Volume volume2 = this.volume_;
        if (volume2 == null || volume2 == Volume.getDefaultInstance()) {
            this.volume_ = volume;
        } else {
            this.volume_ = (Volume) ((Volume.b) Volume.newBuilder(this.volume_).mergeFrom(volume)).buildPartial();
        }
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(VideoTrack videoTrack) {
        return (b) DEFAULT_INSTANCE.createBuilder(videoTrack);
    }

    public static VideoTrack parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VideoTrack) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoTrack parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoTrack) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoTrack parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VideoTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static VideoTrack parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VideoTrack parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VideoTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VideoTrack parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static VideoTrack parseFrom(InputStream inputStream) throws IOException {
        return (VideoTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoTrack parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoTrack parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VideoTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static VideoTrack parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VideoTrack parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VideoTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VideoTrack parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<VideoTrack> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeClips(int i7) {
        ensureClipsIsMutable();
        this.clips_.remove(i7);
    }

    private void removeTransitions(int i7) {
        ensureTransitionsIsMutable();
        this.transitions_.remove(i7);
    }

    private void setClips(int i7, VideoClip videoClip) {
        videoClip.getClass();
        ensureClipsIsMutable();
        this.clips_.set(i7, videoClip);
    }

    private void setIdString(String str) {
        str.getClass();
        this.idString_ = str;
    }

    private void setIdStringBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.idString_ = byteString.toStringUtf8();
    }

    private void setTransitions(int i7, VideoTransition videoTransition) {
        videoTransition.getClass();
        ensureTransitionsIsMutable();
        this.transitions_.set(i7, videoTransition);
    }

    private void setType(Type type) {
        this.type_ = type.getNumber();
    }

    private void setTypeValue(int i7) {
        this.type_ = i7;
    }

    private void setVolume(Volume volume) {
        volume.getClass();
        this.volume_ = volume;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f108907a[methodToInvoke.ordinal()]) {
            case 1:
                return new VideoTrack();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\t\u0003\u001b\u0004\u001b\u0005\f", new Object[]{"idString_", "volume_", "transitions_", VideoTransition.class, "clips_", VideoClip.class, "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (VideoTrack.class) {
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

    public VideoClip getClips(int i7) {
        return (VideoClip) this.clips_.get(i7);
    }

    public int getClipsCount() {
        return this.clips_.size();
    }

    public List<VideoClip> getClipsList() {
        return this.clips_;
    }

    public C getClipsOrBuilder(int i7) {
        return (C) this.clips_.get(i7);
    }

    public List<? extends C> getClipsOrBuilderList() {
        return this.clips_;
    }

    public String getIdString() {
        return this.idString_;
    }

    public ByteString getIdStringBytes() {
        return ByteString.copyFromUtf8(this.idString_);
    }

    public VideoTransition getTransitions(int i7) {
        return (VideoTransition) this.transitions_.get(i7);
    }

    public int getTransitionsCount() {
        return this.transitions_.size();
    }

    public List<VideoTransition> getTransitionsList() {
        return this.transitions_;
    }

    public J getTransitionsOrBuilder(int i7) {
        return (J) this.transitions_.get(i7);
    }

    public List<? extends J> getTransitionsOrBuilderList() {
        return this.transitions_;
    }

    public Type getType() {
        Type typeForNumber = Type.forNumber(this.type_);
        Type type = typeForNumber;
        if (typeForNumber == null) {
            type = Type.UNRECOGNIZED;
        }
        return type;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public Volume getVolume() {
        Volume volume = this.volume_;
        Volume defaultInstance = volume;
        if (volume == null) {
            defaultInstance = Volume.getDefaultInstance();
        }
        return defaultInstance;
    }

    public boolean hasVolume() {
        return this.volume_ != null;
    }
}
