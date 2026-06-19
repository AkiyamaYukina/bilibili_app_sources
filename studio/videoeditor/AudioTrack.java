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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/AudioTrack.class */
public final class AudioTrack extends GeneratedMessageLite<AudioTrack, b> implements InterfaceC6595c {
    public static final int AUDIOCLIPS_FIELD_NUMBER = 4;
    private static final AudioTrack DEFAULT_INSTANCE;
    public static final int IDSTRING_FIELD_NUMBER = 1;
    private static volatile Parser<AudioTrack> PARSER;
    public static final int TRACKTYPE_FIELD_NUMBER = 2;
    public static final int VIDEOTRACKID_FIELD_NUMBER = 5;
    public static final int VOLUME_FIELD_NUMBER = 3;
    private int trackType_;
    private Volume volume_;
    private String idString_ = "";
    private Internal.ProtobufList<AudioClip> audioClips_ = GeneratedMessageLite.emptyProtobufList();
    private String videoTrackId_ = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/AudioTrack$Type.class */
    public enum Type implements Internal.EnumLite {
        Original(0),
        BGM(1),
        Effect(2),
        Record(3),
        Voice(4),
        PIP(5),
        TTS(6),
        Avatar(7),
        AvatarCapture(8),
        GCOriginal(9),
        GCBgm(10),
        AIMark(11),
        Other(100),
        UNRECOGNIZED(-1);

        public static final int AIMark_VALUE = 11;
        public static final int AvatarCapture_VALUE = 8;
        public static final int Avatar_VALUE = 7;
        public static final int BGM_VALUE = 1;
        public static final int Effect_VALUE = 2;
        public static final int GCBgm_VALUE = 10;
        public static final int GCOriginal_VALUE = 9;
        public static final int Original_VALUE = 0;
        public static final int Other_VALUE = 100;
        public static final int PIP_VALUE = 5;
        public static final int Record_VALUE = 3;
        public static final int TTS_VALUE = 6;
        public static final int Voice_VALUE = 4;
        private static final Internal.EnumLiteMap<Type> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/AudioTrack$Type$a.class */
        public final class a implements Internal.EnumLiteMap<Type> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return Type.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/AudioTrack$Type$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108826a = new Object();

            public final boolean isInRange(int i7) {
                return Type.forNumber(i7) != null;
            }
        }

        Type(int i7) {
            this.value = i7;
        }

        public static Type forNumber(int i7) {
            if (i7 == 100) {
                return Other;
            }
            switch (i7) {
                case 0:
                    return Original;
                case 1:
                    return BGM;
                case 2:
                    return Effect;
                case 3:
                    return Record;
                case 4:
                    return Voice;
                case 5:
                    return PIP;
                case 6:
                    return TTS;
                case 7:
                    return Avatar;
                case 8:
                    return AvatarCapture;
                case 9:
                    return GCOriginal;
                case 10:
                    return GCBgm;
                case 11:
                    return AIMark;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108826a;
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/AudioTrack$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108827a;

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
                com.bilibili.studio.videoeditor.AudioTrack.a.f108827a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.AudioTrack.a.f108827a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.AudioTrack.a.f108827a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.studio.videoeditor.AudioTrack.a.f108827a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.studio.videoeditor.AudioTrack.a.f108827a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.studio.videoeditor.AudioTrack.a.f108827a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.studio.videoeditor.AudioTrack.a.f108827a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.AudioTrack.a.m10271clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/AudioTrack$b.class */
    public static final class b extends GeneratedMessageLite.Builder<AudioTrack, b> implements InterfaceC6595c {
        public b() {
            super(AudioTrack.DEFAULT_INSTANCE);
        }
    }

    static {
        AudioTrack audioTrack = new AudioTrack();
        DEFAULT_INSTANCE = audioTrack;
        GeneratedMessageLite.registerDefaultInstance(AudioTrack.class, audioTrack);
    }

    private AudioTrack() {
    }

    private void addAllAudioClips(Iterable<? extends AudioClip> iterable) {
        ensureAudioClipsIsMutable();
        AbstractMessageLite.addAll(iterable, this.audioClips_);
    }

    private void addAudioClips(int i7, AudioClip audioClip) {
        audioClip.getClass();
        ensureAudioClipsIsMutable();
        this.audioClips_.add(i7, audioClip);
    }

    private void addAudioClips(AudioClip audioClip) {
        audioClip.getClass();
        ensureAudioClipsIsMutable();
        this.audioClips_.add(audioClip);
    }

    private void clearAudioClips() {
        this.audioClips_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearIdString() {
        this.idString_ = getDefaultInstance().getIdString();
    }

    private void clearTrackType() {
        this.trackType_ = 0;
    }

    private void clearVideoTrackId() {
        this.videoTrackId_ = getDefaultInstance().getVideoTrackId();
    }

    private void clearVolume() {
        this.volume_ = null;
    }

    private void ensureAudioClipsIsMutable() {
        Internal.ProtobufList<AudioClip> protobufList = this.audioClips_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.audioClips_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static AudioTrack getDefaultInstance() {
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

    public static b newBuilder(AudioTrack audioTrack) {
        return (b) DEFAULT_INSTANCE.createBuilder(audioTrack);
    }

    public static AudioTrack parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AudioTrack) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioTrack parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioTrack) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioTrack parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AudioTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AudioTrack parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AudioTrack parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AudioTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AudioTrack parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AudioTrack parseFrom(InputStream inputStream) throws IOException {
        return (AudioTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioTrack parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioTrack parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AudioTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AudioTrack parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AudioTrack parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AudioTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AudioTrack parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioTrack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<AudioTrack> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAudioClips(int i7) {
        ensureAudioClipsIsMutable();
        this.audioClips_.remove(i7);
    }

    private void setAudioClips(int i7, AudioClip audioClip) {
        audioClip.getClass();
        ensureAudioClipsIsMutable();
        this.audioClips_.set(i7, audioClip);
    }

    private void setIdString(String str) {
        str.getClass();
        this.idString_ = str;
    }

    private void setIdStringBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.idString_ = byteString.toStringUtf8();
    }

    private void setTrackType(Type type) {
        this.trackType_ = type.getNumber();
    }

    private void setTrackTypeValue(int i7) {
        this.trackType_ = i7;
    }

    private void setVideoTrackId(String str) {
        str.getClass();
        this.videoTrackId_ = str;
    }

    private void setVideoTrackIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.videoTrackId_ = byteString.toStringUtf8();
    }

    private void setVolume(Volume volume) {
        volume.getClass();
        this.volume_ = volume;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f108827a[methodToInvoke.ordinal()]) {
            case 1:
                return new AudioTrack();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\t\u0004\u001b\u0005Ȉ", new Object[]{"idString_", "trackType_", "volume_", "audioClips_", AudioClip.class, "videoTrackId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (AudioTrack.class) {
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

    public AudioClip getAudioClips(int i7) {
        return (AudioClip) this.audioClips_.get(i7);
    }

    public int getAudioClipsCount() {
        return this.audioClips_.size();
    }

    public List<AudioClip> getAudioClipsList() {
        return this.audioClips_;
    }

    public InterfaceC6594b getAudioClipsOrBuilder(int i7) {
        return (InterfaceC6594b) this.audioClips_.get(i7);
    }

    public List<? extends InterfaceC6594b> getAudioClipsOrBuilderList() {
        return this.audioClips_;
    }

    public String getIdString() {
        return this.idString_;
    }

    public ByteString getIdStringBytes() {
        return ByteString.copyFromUtf8(this.idString_);
    }

    public Type getTrackType() {
        Type typeForNumber = Type.forNumber(this.trackType_);
        Type type = typeForNumber;
        if (typeForNumber == null) {
            type = Type.UNRECOGNIZED;
        }
        return type;
    }

    public int getTrackTypeValue() {
        return this.trackType_;
    }

    public String getVideoTrackId() {
        return this.videoTrackId_;
    }

    public ByteString getVideoTrackIdBytes() {
        return ByteString.copyFromUtf8(this.videoTrackId_);
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
