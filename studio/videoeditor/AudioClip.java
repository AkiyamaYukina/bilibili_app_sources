package com.bilibili.studio.videoeditor;

import com.bilibili.studio.videoeditor.LocalPath;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/AudioClip.class */
public final class AudioClip extends GeneratedMessageLite<AudioClip, b> implements InterfaceC6594b {
    public static final int AUDIOSEPARATE_FIELD_NUMBER = 23;
    public static final int AUDITIONSPEED_FIELD_NUMBER = 12;
    public static final int AUTOMARKERFILEPATH_FIELD_NUMBER = 11;
    public static final int AUTOMARKERISON_FIELD_NUMBER = 10;
    public static final int CURVESTRING_FIELD_NUMBER = 31;
    public static final int CURVETYPE_FIELD_NUMBER = 30;
    private static final AudioClip DEFAULT_INSTANCE;
    public static final int EXTRAATTACHVIRTUALIDOLIDS_FIELD_NUMBER = 33;
    public static final int EXTRACLIPNEEDMUTE_FIELD_NUMBER = 34;
    public static final int EXTRACLIPVOLUMEBEFOREMUTE_FIELD_NUMBER = 35;
    public static final int EXTRARELATEDEFFECTID_FIELD_NUMBER = 32;
    public static final int FADEIN_FIELD_NUMBER = 6;
    public static final int FADEOUT_FIELD_NUMBER = 7;
    public static final int FXS_FIELD_NUMBER = 21;
    public static final int IDSTRING_FIELD_NUMBER = 1;
    public static final int INPOINT_FIELD_NUMBER = 2;
    public static final int KEEPAUDIOPITCH_FIELD_NUMBER = 14;
    public static final int MAKERS_FIELD_NUMBER = 9;
    public static final int MATERIALID_FIELD_NUMBER = 18;
    public static final int MATERIALTYPE_FIELD_NUMBER = 38;
    public static final int MUTE_FIELD_NUMBER = 25;
    public static final int ORIGINALAUDIOFILEPATH_FIELD_NUMBER = 40;
    public static final int OUTPOINT_FIELD_NUMBER = 3;
    private static volatile Parser<AudioClip> PARSER;
    public static final int RECORDCAPTIONIDS_FIELD_NUMBER = 20;
    public static final int RECYCLE_FIELD_NUMBER = 39;
    public static final int ROWINTRACK_FIELD_NUMBER = 19;
    public static final int SOURCECOVER_FIELD_NUMBER = 36;
    public static final int SOURCEFROM_FIELD_NUMBER = 15;
    public static final int SOURCENAME_FIELD_NUMBER = 16;
    public static final int SOURCEPATH_FIELD_NUMBER = 17;
    public static final int SOURCESID_FIELD_NUMBER = 37;
    public static final int SPEED_FIELD_NUMBER = 13;
    public static final int TEMPLATEFXFROM_FIELD_NUMBER = 41;
    public static final int TRIMIN_FIELD_NUMBER = 4;
    public static final int TRIMOUT_FIELD_NUMBER = 5;
    public static final int TTSCAPTIONID_FIELD_NUMBER = 28;
    public static final int TTSCAPTIONSOURCETYPE_FIELD_NUMBER = 29;
    public static final int TTSSELECTED_FIELD_NUMBER = 26;
    public static final int TTSTEXT_FIELD_NUMBER = 27;
    public static final int TTSVOICEID_FIELD_NUMBER = 42;
    public static final int VOLUMEBEFOREAUDIOMUTE_FIELD_NUMBER = 24;
    public static final int VOLUMEBEFOREAUDIOSEPARATE_FIELD_NUMBER = 22;
    public static final int VOLUME_FIELD_NUMBER = 8;
    private boolean audioSeparate_;
    private float auditionSpeed_;
    private boolean autoMarkerIsOn_;
    private int curveType_;
    private float fadeIn_;
    private float fadeOut_;
    private long inPoint_;
    private boolean keepAudioPitch_;
    private LocalPath materialId_;
    private int materialType_;
    private boolean mute_;
    private LocalPath originalAudioFilePath_;
    private long outPoint_;
    private boolean recycle_;
    private int rowInTrack_;
    private int sourceFrom_;
    private LocalPath sourcePath_;
    private float speed_;
    private int templateFxFrom_;
    private long trimIn_;
    private long trimOut_;
    private boolean ttsSelected_;
    private Volume volumeBeforeAudioMute_;
    private Volume volumeBeforeAudioSeparate_;
    private Volume volume_;
    private int makersMemoizedSerializedSize = -1;
    private int recordCaptionIdsMemoizedSerializedSize = -1;
    private String idString_ = "";
    private Internal.LongList makers_ = GeneratedMessageLite.emptyLongList();
    private String autoMarkerFilePath_ = "";
    private String sourceName_ = "";
    private Internal.LongList recordCaptionIds_ = GeneratedMessageLite.emptyLongList();
    private Internal.ProtobufList<AudioClipFx> fxs_ = GeneratedMessageLite.emptyProtobufList();
    private String ttsText_ = "";
    private String ttsCaptionId_ = "";
    private String ttsCaptionSourceType_ = "";
    private String curveString_ = "";
    private String extraRelatedEffectId_ = "";
    private String extraAttachVirtualIdolIds_ = "";
    private String extraClipNeedMute_ = "";
    private String extraClipVolumeBeforeMute_ = "";
    private String sourceCover_ = "";
    private String sourceSid_ = "";
    private String ttsVoiceId_ = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/AudioClip$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108822a;

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
                com.bilibili.studio.videoeditor.AudioClip.a.f108822a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.AudioClip.a.f108822a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.AudioClip.a.f108822a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.studio.videoeditor.AudioClip.a.f108822a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.studio.videoeditor.AudioClip.a.f108822a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.studio.videoeditor.AudioClip.a.f108822a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.studio.videoeditor.AudioClip.a.f108822a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.AudioClip.a.m10261clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/AudioClip$b.class */
    public static final class b extends GeneratedMessageLite.Builder<AudioClip, b> implements InterfaceC6594b {
        public b() {
            super(AudioClip.DEFAULT_INSTANCE);
        }
    }

    static {
        AudioClip audioClip = new AudioClip();
        DEFAULT_INSTANCE = audioClip;
        GeneratedMessageLite.registerDefaultInstance(AudioClip.class, audioClip);
    }

    private AudioClip() {
    }

    private void addAllFxs(Iterable<? extends AudioClipFx> iterable) {
        ensureFxsIsMutable();
        AbstractMessageLite.addAll(iterable, this.fxs_);
    }

    private void addAllMakers(Iterable<? extends Long> iterable) {
        ensureMakersIsMutable();
        AbstractMessageLite.addAll(iterable, this.makers_);
    }

    private void addAllRecordCaptionIds(Iterable<? extends Long> iterable) {
        ensureRecordCaptionIdsIsMutable();
        AbstractMessageLite.addAll(iterable, this.recordCaptionIds_);
    }

    private void addFxs(int i7, AudioClipFx audioClipFx) {
        audioClipFx.getClass();
        ensureFxsIsMutable();
        this.fxs_.add(i7, audioClipFx);
    }

    private void addFxs(AudioClipFx audioClipFx) {
        audioClipFx.getClass();
        ensureFxsIsMutable();
        this.fxs_.add(audioClipFx);
    }

    private void addMakers(long j7) {
        ensureMakersIsMutable();
        this.makers_.addLong(j7);
    }

    private void addRecordCaptionIds(long j7) {
        ensureRecordCaptionIdsIsMutable();
        this.recordCaptionIds_.addLong(j7);
    }

    private void clearAudioSeparate() {
        this.audioSeparate_ = false;
    }

    private void clearAuditionSpeed() {
        this.auditionSpeed_ = 0.0f;
    }

    private void clearAutoMarkerFilePath() {
        this.autoMarkerFilePath_ = getDefaultInstance().getAutoMarkerFilePath();
    }

    private void clearAutoMarkerIsOn() {
        this.autoMarkerIsOn_ = false;
    }

    private void clearCurveString() {
        this.curveString_ = getDefaultInstance().getCurveString();
    }

    private void clearCurveType() {
        this.curveType_ = 0;
    }

    private void clearExtraAttachVirtualIdolIds() {
        this.extraAttachVirtualIdolIds_ = getDefaultInstance().getExtraAttachVirtualIdolIds();
    }

    private void clearExtraClipNeedMute() {
        this.extraClipNeedMute_ = getDefaultInstance().getExtraClipNeedMute();
    }

    private void clearExtraClipVolumeBeforeMute() {
        this.extraClipVolumeBeforeMute_ = getDefaultInstance().getExtraClipVolumeBeforeMute();
    }

    private void clearExtraRelatedEffectId() {
        this.extraRelatedEffectId_ = getDefaultInstance().getExtraRelatedEffectId();
    }

    private void clearFadeIn() {
        this.fadeIn_ = 0.0f;
    }

    private void clearFadeOut() {
        this.fadeOut_ = 0.0f;
    }

    private void clearFxs() {
        this.fxs_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearIdString() {
        this.idString_ = getDefaultInstance().getIdString();
    }

    private void clearInPoint() {
        this.inPoint_ = 0L;
    }

    private void clearKeepAudioPitch() {
        this.keepAudioPitch_ = false;
    }

    private void clearMakers() {
        this.makers_ = GeneratedMessageLite.emptyLongList();
    }

    private void clearMaterialId() {
        this.materialId_ = null;
    }

    private void clearMaterialType() {
        this.materialType_ = 0;
    }

    private void clearMute() {
        this.mute_ = false;
    }

    private void clearOriginalAudioFilePath() {
        this.originalAudioFilePath_ = null;
    }

    private void clearOutPoint() {
        this.outPoint_ = 0L;
    }

    private void clearRecordCaptionIds() {
        this.recordCaptionIds_ = GeneratedMessageLite.emptyLongList();
    }

    private void clearRecycle() {
        this.recycle_ = false;
    }

    private void clearRowInTrack() {
        this.rowInTrack_ = 0;
    }

    private void clearSourceCover() {
        this.sourceCover_ = getDefaultInstance().getSourceCover();
    }

    private void clearSourceFrom() {
        this.sourceFrom_ = 0;
    }

    private void clearSourceName() {
        this.sourceName_ = getDefaultInstance().getSourceName();
    }

    private void clearSourcePath() {
        this.sourcePath_ = null;
    }

    private void clearSourceSid() {
        this.sourceSid_ = getDefaultInstance().getSourceSid();
    }

    private void clearSpeed() {
        this.speed_ = 0.0f;
    }

    private void clearTemplateFxFrom() {
        this.templateFxFrom_ = 0;
    }

    private void clearTrimIn() {
        this.trimIn_ = 0L;
    }

    private void clearTrimOut() {
        this.trimOut_ = 0L;
    }

    private void clearTtsCaptionId() {
        this.ttsCaptionId_ = getDefaultInstance().getTtsCaptionId();
    }

    private void clearTtsCaptionSourceType() {
        this.ttsCaptionSourceType_ = getDefaultInstance().getTtsCaptionSourceType();
    }

    private void clearTtsSelected() {
        this.ttsSelected_ = false;
    }

    private void clearTtsText() {
        this.ttsText_ = getDefaultInstance().getTtsText();
    }

    private void clearTtsVoiceId() {
        this.ttsVoiceId_ = getDefaultInstance().getTtsVoiceId();
    }

    private void clearVolume() {
        this.volume_ = null;
    }

    private void clearVolumeBeforeAudioMute() {
        this.volumeBeforeAudioMute_ = null;
    }

    private void clearVolumeBeforeAudioSeparate() {
        this.volumeBeforeAudioSeparate_ = null;
    }

    private void ensureFxsIsMutable() {
        Internal.ProtobufList<AudioClipFx> protobufList = this.fxs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.fxs_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureMakersIsMutable() {
        Internal.LongList longList = this.makers_;
        if (longList.isModifiable()) {
            return;
        }
        this.makers_ = GeneratedMessageLite.mutableCopy(longList);
    }

    private void ensureRecordCaptionIdsIsMutable() {
        Internal.LongList longList = this.recordCaptionIds_;
        if (longList.isModifiable()) {
            return;
        }
        this.recordCaptionIds_ = GeneratedMessageLite.mutableCopy(longList);
    }

    public static AudioClip getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeMaterialId(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.materialId_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.materialId_ = localPath;
        } else {
            this.materialId_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.materialId_).mergeFrom(localPath)).buildPartial();
        }
    }

    private void mergeOriginalAudioFilePath(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.originalAudioFilePath_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.originalAudioFilePath_ = localPath;
        } else {
            this.originalAudioFilePath_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.originalAudioFilePath_).mergeFrom(localPath)).buildPartial();
        }
    }

    private void mergeSourcePath(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.sourcePath_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.sourcePath_ = localPath;
        } else {
            this.sourcePath_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.sourcePath_).mergeFrom(localPath)).buildPartial();
        }
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

    private void mergeVolumeBeforeAudioMute(Volume volume) {
        volume.getClass();
        Volume volume2 = this.volumeBeforeAudioMute_;
        if (volume2 == null || volume2 == Volume.getDefaultInstance()) {
            this.volumeBeforeAudioMute_ = volume;
        } else {
            this.volumeBeforeAudioMute_ = (Volume) ((Volume.b) Volume.newBuilder(this.volumeBeforeAudioMute_).mergeFrom(volume)).buildPartial();
        }
    }

    private void mergeVolumeBeforeAudioSeparate(Volume volume) {
        volume.getClass();
        Volume volume2 = this.volumeBeforeAudioSeparate_;
        if (volume2 == null || volume2 == Volume.getDefaultInstance()) {
            this.volumeBeforeAudioSeparate_ = volume;
        } else {
            this.volumeBeforeAudioSeparate_ = (Volume) ((Volume.b) Volume.newBuilder(this.volumeBeforeAudioSeparate_).mergeFrom(volume)).buildPartial();
        }
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(AudioClip audioClip) {
        return (b) DEFAULT_INSTANCE.createBuilder(audioClip);
    }

    public static AudioClip parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AudioClip) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioClip parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioClip) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioClip parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AudioClip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AudioClip parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioClip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AudioClip parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AudioClip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AudioClip parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioClip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AudioClip parseFrom(InputStream inputStream) throws IOException {
        return (AudioClip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioClip parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioClip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioClip parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AudioClip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AudioClip parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioClip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AudioClip parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AudioClip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AudioClip parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioClip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<AudioClip> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeFxs(int i7) {
        ensureFxsIsMutable();
        this.fxs_.remove(i7);
    }

    private void setAudioSeparate(boolean z6) {
        this.audioSeparate_ = z6;
    }

    private void setAuditionSpeed(float f7) {
        this.auditionSpeed_ = f7;
    }

    private void setAutoMarkerFilePath(String str) {
        str.getClass();
        this.autoMarkerFilePath_ = str;
    }

    private void setAutoMarkerFilePathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.autoMarkerFilePath_ = byteString.toStringUtf8();
    }

    private void setAutoMarkerIsOn(boolean z6) {
        this.autoMarkerIsOn_ = z6;
    }

    private void setCurveString(String str) {
        str.getClass();
        this.curveString_ = str;
    }

    private void setCurveStringBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.curveString_ = byteString.toStringUtf8();
    }

    private void setCurveType(CurveType curveType) {
        this.curveType_ = curveType.getNumber();
    }

    private void setCurveTypeValue(int i7) {
        this.curveType_ = i7;
    }

    private void setExtraAttachVirtualIdolIds(String str) {
        str.getClass();
        this.extraAttachVirtualIdolIds_ = str;
    }

    private void setExtraAttachVirtualIdolIdsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraAttachVirtualIdolIds_ = byteString.toStringUtf8();
    }

    private void setExtraClipNeedMute(String str) {
        str.getClass();
        this.extraClipNeedMute_ = str;
    }

    private void setExtraClipNeedMuteBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraClipNeedMute_ = byteString.toStringUtf8();
    }

    private void setExtraClipVolumeBeforeMute(String str) {
        str.getClass();
        this.extraClipVolumeBeforeMute_ = str;
    }

    private void setExtraClipVolumeBeforeMuteBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraClipVolumeBeforeMute_ = byteString.toStringUtf8();
    }

    private void setExtraRelatedEffectId(String str) {
        str.getClass();
        this.extraRelatedEffectId_ = str;
    }

    private void setExtraRelatedEffectIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraRelatedEffectId_ = byteString.toStringUtf8();
    }

    private void setFadeIn(float f7) {
        this.fadeIn_ = f7;
    }

    private void setFadeOut(float f7) {
        this.fadeOut_ = f7;
    }

    private void setFxs(int i7, AudioClipFx audioClipFx) {
        audioClipFx.getClass();
        ensureFxsIsMutable();
        this.fxs_.set(i7, audioClipFx);
    }

    private void setIdString(String str) {
        str.getClass();
        this.idString_ = str;
    }

    private void setIdStringBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.idString_ = byteString.toStringUtf8();
    }

    private void setInPoint(long j7) {
        this.inPoint_ = j7;
    }

    private void setKeepAudioPitch(boolean z6) {
        this.keepAudioPitch_ = z6;
    }

    private void setMakers(int i7, long j7) {
        ensureMakersIsMutable();
        this.makers_.setLong(i7, j7);
    }

    private void setMaterialId(LocalPath localPath) {
        localPath.getClass();
        this.materialId_ = localPath;
    }

    private void setMaterialType(MaterialType materialType) {
        this.materialType_ = materialType.getNumber();
    }

    private void setMaterialTypeValue(int i7) {
        this.materialType_ = i7;
    }

    private void setMute(boolean z6) {
        this.mute_ = z6;
    }

    private void setOriginalAudioFilePath(LocalPath localPath) {
        localPath.getClass();
        this.originalAudioFilePath_ = localPath;
    }

    private void setOutPoint(long j7) {
        this.outPoint_ = j7;
    }

    private void setRecordCaptionIds(int i7, long j7) {
        ensureRecordCaptionIdsIsMutable();
        this.recordCaptionIds_.setLong(i7, j7);
    }

    private void setRecycle(boolean z6) {
        this.recycle_ = z6;
    }

    private void setRowInTrack(int i7) {
        this.rowInTrack_ = i7;
    }

    private void setSourceCover(String str) {
        str.getClass();
        this.sourceCover_ = str;
    }

    private void setSourceCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sourceCover_ = byteString.toStringUtf8();
    }

    private void setSourceFrom(MediaFrom mediaFrom) {
        this.sourceFrom_ = mediaFrom.getNumber();
    }

    private void setSourceFromValue(int i7) {
        this.sourceFrom_ = i7;
    }

    private void setSourceName(String str) {
        str.getClass();
        this.sourceName_ = str;
    }

    private void setSourceNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sourceName_ = byteString.toStringUtf8();
    }

    private void setSourcePath(LocalPath localPath) {
        localPath.getClass();
        this.sourcePath_ = localPath;
    }

    private void setSourceSid(String str) {
        str.getClass();
        this.sourceSid_ = str;
    }

    private void setSourceSidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sourceSid_ = byteString.toStringUtf8();
    }

    private void setSpeed(float f7) {
        this.speed_ = f7;
    }

    private void setTemplateFxFrom(TemplateFxFrom templateFxFrom) {
        this.templateFxFrom_ = templateFxFrom.getNumber();
    }

    private void setTemplateFxFromValue(int i7) {
        this.templateFxFrom_ = i7;
    }

    private void setTrimIn(long j7) {
        this.trimIn_ = j7;
    }

    private void setTrimOut(long j7) {
        this.trimOut_ = j7;
    }

    private void setTtsCaptionId(String str) {
        str.getClass();
        this.ttsCaptionId_ = str;
    }

    private void setTtsCaptionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ttsCaptionId_ = byteString.toStringUtf8();
    }

    private void setTtsCaptionSourceType(String str) {
        str.getClass();
        this.ttsCaptionSourceType_ = str;
    }

    private void setTtsCaptionSourceTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ttsCaptionSourceType_ = byteString.toStringUtf8();
    }

    private void setTtsSelected(boolean z6) {
        this.ttsSelected_ = z6;
    }

    private void setTtsText(String str) {
        str.getClass();
        this.ttsText_ = str;
    }

    private void setTtsTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ttsText_ = byteString.toStringUtf8();
    }

    private void setTtsVoiceId(String str) {
        str.getClass();
        this.ttsVoiceId_ = str;
    }

    private void setTtsVoiceIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ttsVoiceId_ = byteString.toStringUtf8();
    }

    private void setVolume(Volume volume) {
        volume.getClass();
        this.volume_ = volume;
    }

    private void setVolumeBeforeAudioMute(Volume volume) {
        volume.getClass();
        this.volumeBeforeAudioMute_ = volume;
    }

    private void setVolumeBeforeAudioSeparate(Volume volume) {
        volume.getClass();
        this.volumeBeforeAudioSeparate_ = volume;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f108822a[methodToInvoke.ordinal()]) {
            case 1:
                return new AudioClip();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000*\u0000\u0000\u0001**\u0000\u0003\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0001\u0007\u0001\b\t\t%\n\u0007\u000bȈ\f\u0001\r\u0001\u000e\u0007\u000f\f\u0010Ȉ\u0011\t\u0012\t\u0013\u0004\u0014%\u0015\u001b\u0016\t\u0017\u0007\u0018\t\u0019\u0007\u001a\u0007\u001bȈ\u001cȈ\u001dȈ\u001e\f\u001fȈ Ȉ!Ȉ\"Ȉ#Ȉ$Ȉ%Ȉ&\f'\u0007(\t)\f*Ȉ", new Object[]{"idString_", "inPoint_", "outPoint_", "trimIn_", "trimOut_", "fadeIn_", "fadeOut_", "volume_", "makers_", "autoMarkerIsOn_", "autoMarkerFilePath_", "auditionSpeed_", "speed_", "keepAudioPitch_", "sourceFrom_", "sourceName_", "sourcePath_", "materialId_", "rowInTrack_", "recordCaptionIds_", "fxs_", AudioClipFx.class, "volumeBeforeAudioSeparate_", "audioSeparate_", "volumeBeforeAudioMute_", "mute_", "ttsSelected_", "ttsText_", "ttsCaptionId_", "ttsCaptionSourceType_", "curveType_", "curveString_", "extraRelatedEffectId_", "extraAttachVirtualIdolIds_", "extraClipNeedMute_", "extraClipVolumeBeforeMute_", "sourceCover_", "sourceSid_", "materialType_", "recycle_", "originalAudioFilePath_", "templateFxFrom_", "ttsVoiceId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (AudioClip.class) {
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

    public boolean getAudioSeparate() {
        return this.audioSeparate_;
    }

    public float getAuditionSpeed() {
        return this.auditionSpeed_;
    }

    public String getAutoMarkerFilePath() {
        return this.autoMarkerFilePath_;
    }

    public ByteString getAutoMarkerFilePathBytes() {
        return ByteString.copyFromUtf8(this.autoMarkerFilePath_);
    }

    public boolean getAutoMarkerIsOn() {
        return this.autoMarkerIsOn_;
    }

    public String getCurveString() {
        return this.curveString_;
    }

    public ByteString getCurveStringBytes() {
        return ByteString.copyFromUtf8(this.curveString_);
    }

    public CurveType getCurveType() {
        CurveType curveTypeForNumber = CurveType.forNumber(this.curveType_);
        CurveType curveType = curveTypeForNumber;
        if (curveTypeForNumber == null) {
            curveType = CurveType.UNRECOGNIZED;
        }
        return curveType;
    }

    public int getCurveTypeValue() {
        return this.curveType_;
    }

    public String getExtraAttachVirtualIdolIds() {
        return this.extraAttachVirtualIdolIds_;
    }

    public ByteString getExtraAttachVirtualIdolIdsBytes() {
        return ByteString.copyFromUtf8(this.extraAttachVirtualIdolIds_);
    }

    public String getExtraClipNeedMute() {
        return this.extraClipNeedMute_;
    }

    public ByteString getExtraClipNeedMuteBytes() {
        return ByteString.copyFromUtf8(this.extraClipNeedMute_);
    }

    public String getExtraClipVolumeBeforeMute() {
        return this.extraClipVolumeBeforeMute_;
    }

    public ByteString getExtraClipVolumeBeforeMuteBytes() {
        return ByteString.copyFromUtf8(this.extraClipVolumeBeforeMute_);
    }

    public String getExtraRelatedEffectId() {
        return this.extraRelatedEffectId_;
    }

    public ByteString getExtraRelatedEffectIdBytes() {
        return ByteString.copyFromUtf8(this.extraRelatedEffectId_);
    }

    public float getFadeIn() {
        return this.fadeIn_;
    }

    public float getFadeOut() {
        return this.fadeOut_;
    }

    public AudioClipFx getFxs(int i7) {
        return (AudioClipFx) this.fxs_.get(i7);
    }

    public int getFxsCount() {
        return this.fxs_.size();
    }

    public List<AudioClipFx> getFxsList() {
        return this.fxs_;
    }

    public InterfaceC6593a getFxsOrBuilder(int i7) {
        return (InterfaceC6593a) this.fxs_.get(i7);
    }

    public List<? extends InterfaceC6593a> getFxsOrBuilderList() {
        return this.fxs_;
    }

    public String getIdString() {
        return this.idString_;
    }

    public ByteString getIdStringBytes() {
        return ByteString.copyFromUtf8(this.idString_);
    }

    public long getInPoint() {
        return this.inPoint_;
    }

    public boolean getKeepAudioPitch() {
        return this.keepAudioPitch_;
    }

    public long getMakers(int i7) {
        return this.makers_.getLong(i7);
    }

    public int getMakersCount() {
        return this.makers_.size();
    }

    public List<Long> getMakersList() {
        return this.makers_;
    }

    public LocalPath getMaterialId() {
        LocalPath localPath = this.materialId_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public MaterialType getMaterialType() {
        MaterialType materialTypeForNumber = MaterialType.forNumber(this.materialType_);
        MaterialType materialType = materialTypeForNumber;
        if (materialTypeForNumber == null) {
            materialType = MaterialType.UNRECOGNIZED;
        }
        return materialType;
    }

    public int getMaterialTypeValue() {
        return this.materialType_;
    }

    public boolean getMute() {
        return this.mute_;
    }

    public LocalPath getOriginalAudioFilePath() {
        LocalPath localPath = this.originalAudioFilePath_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public long getOutPoint() {
        return this.outPoint_;
    }

    public long getRecordCaptionIds(int i7) {
        return this.recordCaptionIds_.getLong(i7);
    }

    public int getRecordCaptionIdsCount() {
        return this.recordCaptionIds_.size();
    }

    public List<Long> getRecordCaptionIdsList() {
        return this.recordCaptionIds_;
    }

    public boolean getRecycle() {
        return this.recycle_;
    }

    public int getRowInTrack() {
        return this.rowInTrack_;
    }

    public String getSourceCover() {
        return this.sourceCover_;
    }

    public ByteString getSourceCoverBytes() {
        return ByteString.copyFromUtf8(this.sourceCover_);
    }

    public MediaFrom getSourceFrom() {
        MediaFrom mediaFromForNumber = MediaFrom.forNumber(this.sourceFrom_);
        MediaFrom mediaFrom = mediaFromForNumber;
        if (mediaFromForNumber == null) {
            mediaFrom = MediaFrom.UNRECOGNIZED;
        }
        return mediaFrom;
    }

    public int getSourceFromValue() {
        return this.sourceFrom_;
    }

    public String getSourceName() {
        return this.sourceName_;
    }

    public ByteString getSourceNameBytes() {
        return ByteString.copyFromUtf8(this.sourceName_);
    }

    public LocalPath getSourcePath() {
        LocalPath localPath = this.sourcePath_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public String getSourceSid() {
        return this.sourceSid_;
    }

    public ByteString getSourceSidBytes() {
        return ByteString.copyFromUtf8(this.sourceSid_);
    }

    public float getSpeed() {
        return this.speed_;
    }

    public TemplateFxFrom getTemplateFxFrom() {
        TemplateFxFrom templateFxFromForNumber = TemplateFxFrom.forNumber(this.templateFxFrom_);
        TemplateFxFrom templateFxFrom = templateFxFromForNumber;
        if (templateFxFromForNumber == null) {
            templateFxFrom = TemplateFxFrom.UNRECOGNIZED;
        }
        return templateFxFrom;
    }

    public int getTemplateFxFromValue() {
        return this.templateFxFrom_;
    }

    public long getTrimIn() {
        return this.trimIn_;
    }

    public long getTrimOut() {
        return this.trimOut_;
    }

    public String getTtsCaptionId() {
        return this.ttsCaptionId_;
    }

    public ByteString getTtsCaptionIdBytes() {
        return ByteString.copyFromUtf8(this.ttsCaptionId_);
    }

    public String getTtsCaptionSourceType() {
        return this.ttsCaptionSourceType_;
    }

    public ByteString getTtsCaptionSourceTypeBytes() {
        return ByteString.copyFromUtf8(this.ttsCaptionSourceType_);
    }

    public boolean getTtsSelected() {
        return this.ttsSelected_;
    }

    public String getTtsText() {
        return this.ttsText_;
    }

    public ByteString getTtsTextBytes() {
        return ByteString.copyFromUtf8(this.ttsText_);
    }

    public String getTtsVoiceId() {
        return this.ttsVoiceId_;
    }

    public ByteString getTtsVoiceIdBytes() {
        return ByteString.copyFromUtf8(this.ttsVoiceId_);
    }

    public Volume getVolume() {
        Volume volume = this.volume_;
        Volume defaultInstance = volume;
        if (volume == null) {
            defaultInstance = Volume.getDefaultInstance();
        }
        return defaultInstance;
    }

    public Volume getVolumeBeforeAudioMute() {
        Volume volume = this.volumeBeforeAudioMute_;
        Volume defaultInstance = volume;
        if (volume == null) {
            defaultInstance = Volume.getDefaultInstance();
        }
        return defaultInstance;
    }

    public Volume getVolumeBeforeAudioSeparate() {
        Volume volume = this.volumeBeforeAudioSeparate_;
        Volume defaultInstance = volume;
        if (volume == null) {
            defaultInstance = Volume.getDefaultInstance();
        }
        return defaultInstance;
    }

    public boolean hasMaterialId() {
        return this.materialId_ != null;
    }

    public boolean hasOriginalAudioFilePath() {
        return this.originalAudioFilePath_ != null;
    }

    public boolean hasSourcePath() {
        return this.sourcePath_ != null;
    }

    public boolean hasVolume() {
        return this.volume_ != null;
    }

    public boolean hasVolumeBeforeAudioMute() {
        return this.volumeBeforeAudioMute_ != null;
    }

    public boolean hasVolumeBeforeAudioSeparate() {
        return this.volumeBeforeAudioSeparate_ != null;
    }
}
