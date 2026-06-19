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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/AudioClipFx.class */
public final class AudioClipFx extends GeneratedMessageLite<AudioClipFx, b> implements InterfaceC6593a {
    public static final int AUDIOFXTYPE_FIELD_NUMBER = 6;
    public static final int BUSINESSTYPE_FIELD_NUMBER = 2;
    public static final int CONFIGFILENAME_FIELD_NUMBER = 8;
    public static final int CUSTOMFXNAME_FIELD_NUMBER = 7;
    private static final AudioClipFx DEFAULT_INSTANCE;
    public static final int DENOISEENABLE_FIELD_NUMBER = 4;
    public static final int DENOISELEVEL_FIELD_NUMBER = 5;
    public static final int FXNAME_FIELD_NUMBER = 3;
    public static final int IDSTRING_FIELD_NUMBER = 1;
    private static volatile Parser<AudioClipFx> PARSER;
    private int audioFxType_;
    private int businessType_;
    private boolean denoiseEnable_;
    private int denoiseLevel_;
    private String idString_ = "";
    private String fxName_ = "";
    private String customFxName_ = "";
    private String configFileName_ = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/AudioClipFx$AudioFxType.class */
    public enum AudioFxType implements Internal.EnumLite {
        Default(0),
        BuildIn(1),
        Custom(2),
        CloudAI(3),
        UNRECOGNIZED(-1);

        public static final int BuildIn_VALUE = 1;
        public static final int CloudAI_VALUE = 3;
        public static final int Custom_VALUE = 2;
        public static final int Default_VALUE = 0;
        private static final Internal.EnumLiteMap<AudioFxType> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/AudioClipFx$AudioFxType$a.class */
        public final class a implements Internal.EnumLiteMap<AudioFxType> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return AudioFxType.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/AudioClipFx$AudioFxType$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108823a = new Object();

            public final boolean isInRange(int i7) {
                return AudioFxType.forNumber(i7) != null;
            }
        }

        AudioFxType(int i7) {
            this.value = i7;
        }

        public static AudioFxType forNumber(int i7) {
            if (i7 == 0) {
                return Default;
            }
            if (i7 == 1) {
                return BuildIn;
            }
            if (i7 == 2) {
                return Custom;
            }
            if (i7 != 3) {
                return null;
            }
            return CloudAI;
        }

        public static Internal.EnumLiteMap<AudioFxType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108823a;
        }

        @Deprecated
        public static AudioFxType valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/AudioClipFx$BusinessType.class */
    public enum BusinessType implements Internal.EnumLite {
        Foice(0),
        Denoise(1),
        UNRECOGNIZED(-1);

        public static final int Denoise_VALUE = 1;
        public static final int Foice_VALUE = 0;
        private static final Internal.EnumLiteMap<BusinessType> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/AudioClipFx$BusinessType$a.class */
        public final class a implements Internal.EnumLiteMap<BusinessType> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return BusinessType.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/AudioClipFx$BusinessType$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108824a = new Object();

            public final boolean isInRange(int i7) {
                return BusinessType.forNumber(i7) != null;
            }
        }

        BusinessType(int i7) {
            this.value = i7;
        }

        public static BusinessType forNumber(int i7) {
            if (i7 == 0) {
                return Foice;
            }
            if (i7 != 1) {
                return null;
            }
            return Denoise;
        }

        public static Internal.EnumLiteMap<BusinessType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108824a;
        }

        @Deprecated
        public static BusinessType valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/AudioClipFx$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108825a;

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
                com.bilibili.studio.videoeditor.AudioClipFx.a.f108825a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.AudioClipFx.a.f108825a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.AudioClipFx.a.f108825a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.studio.videoeditor.AudioClipFx.a.f108825a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.studio.videoeditor.AudioClipFx.a.f108825a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.studio.videoeditor.AudioClipFx.a.f108825a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.studio.videoeditor.AudioClipFx.a.f108825a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.AudioClipFx.a.m10267clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/AudioClipFx$b.class */
    public static final class b extends GeneratedMessageLite.Builder<AudioClipFx, b> implements InterfaceC6593a {
        public b() {
            super(AudioClipFx.DEFAULT_INSTANCE);
        }
    }

    static {
        AudioClipFx audioClipFx = new AudioClipFx();
        DEFAULT_INSTANCE = audioClipFx;
        GeneratedMessageLite.registerDefaultInstance(AudioClipFx.class, audioClipFx);
    }

    private AudioClipFx() {
    }

    private void clearAudioFxType() {
        this.audioFxType_ = 0;
    }

    private void clearBusinessType() {
        this.businessType_ = 0;
    }

    private void clearConfigFileName() {
        this.configFileName_ = getDefaultInstance().getConfigFileName();
    }

    private void clearCustomFxName() {
        this.customFxName_ = getDefaultInstance().getCustomFxName();
    }

    private void clearDenoiseEnable() {
        this.denoiseEnable_ = false;
    }

    private void clearDenoiseLevel() {
        this.denoiseLevel_ = 0;
    }

    private void clearFxName() {
        this.fxName_ = getDefaultInstance().getFxName();
    }

    private void clearIdString() {
        this.idString_ = getDefaultInstance().getIdString();
    }

    public static AudioClipFx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(AudioClipFx audioClipFx) {
        return (b) DEFAULT_INSTANCE.createBuilder(audioClipFx);
    }

    public static AudioClipFx parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AudioClipFx) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioClipFx parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioClipFx) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioClipFx parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AudioClipFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AudioClipFx parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioClipFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AudioClipFx parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AudioClipFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AudioClipFx parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioClipFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AudioClipFx parseFrom(InputStream inputStream) throws IOException {
        return (AudioClipFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioClipFx parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioClipFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioClipFx parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AudioClipFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AudioClipFx parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioClipFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AudioClipFx parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AudioClipFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AudioClipFx parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioClipFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<AudioClipFx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAudioFxType(AudioFxType audioFxType) {
        this.audioFxType_ = audioFxType.getNumber();
    }

    private void setAudioFxTypeValue(int i7) {
        this.audioFxType_ = i7;
    }

    private void setBusinessType(BusinessType businessType) {
        this.businessType_ = businessType.getNumber();
    }

    private void setBusinessTypeValue(int i7) {
        this.businessType_ = i7;
    }

    private void setConfigFileName(String str) {
        str.getClass();
        this.configFileName_ = str;
    }

    private void setConfigFileNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.configFileName_ = byteString.toStringUtf8();
    }

    private void setCustomFxName(String str) {
        str.getClass();
        this.customFxName_ = str;
    }

    private void setCustomFxNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.customFxName_ = byteString.toStringUtf8();
    }

    private void setDenoiseEnable(boolean z6) {
        this.denoiseEnable_ = z6;
    }

    private void setDenoiseLevel(int i7) {
        this.denoiseLevel_ = i7;
    }

    private void setFxName(String str) {
        str.getClass();
        this.fxName_ = str;
    }

    private void setFxNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fxName_ = byteString.toStringUtf8();
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
        switch (a.f108825a[methodToInvoke.ordinal()]) {
            case 1:
                return new AudioClipFx();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004\u0007\u0005\u0004\u0006\f\u0007Ȉ\bȈ", new Object[]{"idString_", "businessType_", "fxName_", "denoiseEnable_", "denoiseLevel_", "audioFxType_", "customFxName_", "configFileName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (AudioClipFx.class) {
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

    public AudioFxType getAudioFxType() {
        AudioFxType audioFxTypeForNumber = AudioFxType.forNumber(this.audioFxType_);
        AudioFxType audioFxType = audioFxTypeForNumber;
        if (audioFxTypeForNumber == null) {
            audioFxType = AudioFxType.UNRECOGNIZED;
        }
        return audioFxType;
    }

    public int getAudioFxTypeValue() {
        return this.audioFxType_;
    }

    public BusinessType getBusinessType() {
        BusinessType businessTypeForNumber = BusinessType.forNumber(this.businessType_);
        BusinessType businessType = businessTypeForNumber;
        if (businessTypeForNumber == null) {
            businessType = BusinessType.UNRECOGNIZED;
        }
        return businessType;
    }

    public int getBusinessTypeValue() {
        return this.businessType_;
    }

    public String getConfigFileName() {
        return this.configFileName_;
    }

    public ByteString getConfigFileNameBytes() {
        return ByteString.copyFromUtf8(this.configFileName_);
    }

    public String getCustomFxName() {
        return this.customFxName_;
    }

    public ByteString getCustomFxNameBytes() {
        return ByteString.copyFromUtf8(this.customFxName_);
    }

    public boolean getDenoiseEnable() {
        return this.denoiseEnable_;
    }

    public int getDenoiseLevel() {
        return this.denoiseLevel_;
    }

    public String getFxName() {
        return this.fxName_;
    }

    public ByteString getFxNameBytes() {
        return ByteString.copyFromUtf8(this.fxName_);
    }

    public String getIdString() {
        return this.idString_;
    }

    public ByteString getIdStringBytes() {
        return ByteString.copyFromUtf8(this.idString_);
    }
}
