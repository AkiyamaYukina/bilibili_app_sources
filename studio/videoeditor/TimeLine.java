package com.bilibili.studio.videoeditor;

import com.bilibili.studio.videoeditor.Device;
import com.bilibili.studio.videoeditor.Range;
import com.bilibili.studio.videoeditor.TimeLineConfig;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/TimeLine.class */
public final class TimeLine extends GeneratedMessageLite<TimeLine, b> implements MessageLiteOrBuilder {
    public static final int APPLYTOALLRECOGNIZEDCAPTION_FIELD_NUMBER = 26;
    public static final int AUDIOTRACKS_FIELD_NUMBER = 7;
    public static final int CAPTIONTRACKS_FIELD_NUMBER = 9;
    public static final int COMPOUNDCAPTIONTRACKS_FIELD_NUMBER = 10;
    public static final int CONFIG_FIELD_NUMBER = 4;
    private static final TimeLine DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 3;
    public static final int ENABLEHEADTAIL_FIELD_NUMBER = 22;
    public static final int ENGINETYPE_FIELD_NUMBER = 21;
    public static final int EXPORTCONFIG_FIELD_NUMBER = 5;
    public static final int EXTRAGAMETEMPLATEID_FIELD_NUMBER = 20;
    public static final int EXTRAGCALBUMID_FIELD_NUMBER = 15;
    public static final int EXTRAGCFROMSOURCE_FIELD_NUMBER = 12;
    public static final int EXTRAGCMUSICID_FIELD_NUMBER = 14;
    public static final int EXTRAGCPUBLISHTID_FIELD_NUMBER = 13;
    public static final int EXTRAGCSCENE_FIELD_NUMBER = 16;
    public static final int EXTRAPICTURERATIODESCRIBE_FIELD_NUMBER = 19;
    public static final int EXTRATUWENTEMPLATEID_FIELD_NUMBER = 17;
    public static final int EXTRAVIRTUALIDOLTEMPLATEID_FIELD_NUMBER = 18;
    public static final int HEAD_FIELD_NUMBER = 23;
    public static final int IDSTRING_FIELD_NUMBER = 1;
    public static final int ONEKEYTEMPLATEID_FIELD_NUMBER = 25;
    private static volatile Parser<TimeLine> PARSER;
    public static final int STICKERTRACKS_FIELD_NUMBER = 8;
    public static final int TAIL_FIELD_NUMBER = 24;
    public static final int TIMELINEVIDEOFXTRACKS_FIELD_NUMBER = 11;
    public static final int VERSION_FIELD_NUMBER = 2;
    public static final int VIDEOTRACKS_FIELD_NUMBER = 6;
    private boolean applyToAllRecognizedCaption_;
    private TimeLineConfig config_;
    private Device device_;
    private boolean enableHeadTail_;
    private int engineType_;
    private TimeLineConfig exportConfig_;
    private Range head_;
    private Range tail_;
    private String idString_ = "";
    private String version_ = "";
    private Internal.ProtobufList<VideoTrack> videoTracks_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<AudioTrack> audioTracks_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<StickerTrack> stickerTracks_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<CaptionTrack> captionTracks_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<CompoundCaptionTrack> compoundCaptionTracks_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<TimelineVideoFxTrack> timelineVideoFxTracks_ = GeneratedMessageLite.emptyProtobufList();
    private String extraGcFromSource_ = "";
    private String extraGcPublishTid_ = "";
    private String extraGcMusicId_ = "";
    private String extraGcAlbumId_ = "";
    private String extraGcScene_ = "";
    private String extraTuwenTemplateId_ = "";
    private String extraVirtualIdolTemplateId_ = "";
    private String extraPictureRatioDescribe_ = "";
    private String extraGameTemplateId_ = "";
    private String onekeyTemplateId_ = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/TimeLine$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108884a;

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
                com.bilibili.studio.videoeditor.TimeLine.a.f108884a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.TimeLine.a.f108884a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.TimeLine.a.f108884a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.studio.videoeditor.TimeLine.a.f108884a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.studio.videoeditor.TimeLine.a.f108884a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.studio.videoeditor.TimeLine.a.f108884a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.studio.videoeditor.TimeLine.a.f108884a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.TimeLine.a.m10338clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/TimeLine$b.class */
    public static final class b extends GeneratedMessageLite.Builder<TimeLine, b> implements MessageLiteOrBuilder {
        public b() {
            super(TimeLine.DEFAULT_INSTANCE);
        }
    }

    static {
        TimeLine timeLine = new TimeLine();
        DEFAULT_INSTANCE = timeLine;
        GeneratedMessageLite.registerDefaultInstance(TimeLine.class, timeLine);
    }

    private TimeLine() {
    }

    private void addAllAudioTracks(Iterable<? extends AudioTrack> iterable) {
        ensureAudioTracksIsMutable();
        AbstractMessageLite.addAll(iterable, this.audioTracks_);
    }

    private void addAllCaptionTracks(Iterable<? extends CaptionTrack> iterable) {
        ensureCaptionTracksIsMutable();
        AbstractMessageLite.addAll(iterable, this.captionTracks_);
    }

    private void addAllCompoundCaptionTracks(Iterable<? extends CompoundCaptionTrack> iterable) {
        ensureCompoundCaptionTracksIsMutable();
        AbstractMessageLite.addAll(iterable, this.compoundCaptionTracks_);
    }

    private void addAllStickerTracks(Iterable<? extends StickerTrack> iterable) {
        ensureStickerTracksIsMutable();
        AbstractMessageLite.addAll(iterable, this.stickerTracks_);
    }

    private void addAllTimelineVideoFxTracks(Iterable<? extends TimelineVideoFxTrack> iterable) {
        ensureTimelineVideoFxTracksIsMutable();
        AbstractMessageLite.addAll(iterable, this.timelineVideoFxTracks_);
    }

    private void addAllVideoTracks(Iterable<? extends VideoTrack> iterable) {
        ensureVideoTracksIsMutable();
        AbstractMessageLite.addAll(iterable, this.videoTracks_);
    }

    private void addAudioTracks(int i7, AudioTrack audioTrack) {
        audioTrack.getClass();
        ensureAudioTracksIsMutable();
        this.audioTracks_.add(i7, audioTrack);
    }

    private void addAudioTracks(AudioTrack audioTrack) {
        audioTrack.getClass();
        ensureAudioTracksIsMutable();
        this.audioTracks_.add(audioTrack);
    }

    private void addCaptionTracks(int i7, CaptionTrack captionTrack) {
        captionTrack.getClass();
        ensureCaptionTracksIsMutable();
        this.captionTracks_.add(i7, captionTrack);
    }

    private void addCaptionTracks(CaptionTrack captionTrack) {
        captionTrack.getClass();
        ensureCaptionTracksIsMutable();
        this.captionTracks_.add(captionTrack);
    }

    private void addCompoundCaptionTracks(int i7, CompoundCaptionTrack compoundCaptionTrack) {
        compoundCaptionTrack.getClass();
        ensureCompoundCaptionTracksIsMutable();
        this.compoundCaptionTracks_.add(i7, compoundCaptionTrack);
    }

    private void addCompoundCaptionTracks(CompoundCaptionTrack compoundCaptionTrack) {
        compoundCaptionTrack.getClass();
        ensureCompoundCaptionTracksIsMutable();
        this.compoundCaptionTracks_.add(compoundCaptionTrack);
    }

    private void addStickerTracks(int i7, StickerTrack stickerTrack) {
        stickerTrack.getClass();
        ensureStickerTracksIsMutable();
        this.stickerTracks_.add(i7, stickerTrack);
    }

    private void addStickerTracks(StickerTrack stickerTrack) {
        stickerTrack.getClass();
        ensureStickerTracksIsMutable();
        this.stickerTracks_.add(stickerTrack);
    }

    private void addTimelineVideoFxTracks(int i7, TimelineVideoFxTrack timelineVideoFxTrack) {
        timelineVideoFxTrack.getClass();
        ensureTimelineVideoFxTracksIsMutable();
        this.timelineVideoFxTracks_.add(i7, timelineVideoFxTrack);
    }

    private void addTimelineVideoFxTracks(TimelineVideoFxTrack timelineVideoFxTrack) {
        timelineVideoFxTrack.getClass();
        ensureTimelineVideoFxTracksIsMutable();
        this.timelineVideoFxTracks_.add(timelineVideoFxTrack);
    }

    private void addVideoTracks(int i7, VideoTrack videoTrack) {
        videoTrack.getClass();
        ensureVideoTracksIsMutable();
        this.videoTracks_.add(i7, videoTrack);
    }

    private void addVideoTracks(VideoTrack videoTrack) {
        videoTrack.getClass();
        ensureVideoTracksIsMutable();
        this.videoTracks_.add(videoTrack);
    }

    private void clearApplyToAllRecognizedCaption() {
        this.applyToAllRecognizedCaption_ = false;
    }

    private void clearAudioTracks() {
        this.audioTracks_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearCaptionTracks() {
        this.captionTracks_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearCompoundCaptionTracks() {
        this.compoundCaptionTracks_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearConfig() {
        this.config_ = null;
    }

    private void clearDevice() {
        this.device_ = null;
    }

    private void clearEnableHeadTail() {
        this.enableHeadTail_ = false;
    }

    private void clearEngineType() {
        this.engineType_ = 0;
    }

    private void clearExportConfig() {
        this.exportConfig_ = null;
    }

    private void clearExtraGameTemplateId() {
        this.extraGameTemplateId_ = getDefaultInstance().getExtraGameTemplateId();
    }

    private void clearExtraGcAlbumId() {
        this.extraGcAlbumId_ = getDefaultInstance().getExtraGcAlbumId();
    }

    private void clearExtraGcFromSource() {
        this.extraGcFromSource_ = getDefaultInstance().getExtraGcFromSource();
    }

    private void clearExtraGcMusicId() {
        this.extraGcMusicId_ = getDefaultInstance().getExtraGcMusicId();
    }

    private void clearExtraGcPublishTid() {
        this.extraGcPublishTid_ = getDefaultInstance().getExtraGcPublishTid();
    }

    private void clearExtraGcScene() {
        this.extraGcScene_ = getDefaultInstance().getExtraGcScene();
    }

    private void clearExtraPictureRatioDescribe() {
        this.extraPictureRatioDescribe_ = getDefaultInstance().getExtraPictureRatioDescribe();
    }

    private void clearExtraTuwenTemplateId() {
        this.extraTuwenTemplateId_ = getDefaultInstance().getExtraTuwenTemplateId();
    }

    private void clearExtraVirtualIdolTemplateId() {
        this.extraVirtualIdolTemplateId_ = getDefaultInstance().getExtraVirtualIdolTemplateId();
    }

    private void clearHead() {
        this.head_ = null;
    }

    private void clearIdString() {
        this.idString_ = getDefaultInstance().getIdString();
    }

    private void clearOnekeyTemplateId() {
        this.onekeyTemplateId_ = getDefaultInstance().getOnekeyTemplateId();
    }

    private void clearStickerTracks() {
        this.stickerTracks_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearTail() {
        this.tail_ = null;
    }

    private void clearTimelineVideoFxTracks() {
        this.timelineVideoFxTracks_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    private void clearVideoTracks() {
        this.videoTracks_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureAudioTracksIsMutable() {
        Internal.ProtobufList<AudioTrack> protobufList = this.audioTracks_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.audioTracks_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureCaptionTracksIsMutable() {
        Internal.ProtobufList<CaptionTrack> protobufList = this.captionTracks_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.captionTracks_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureCompoundCaptionTracksIsMutable() {
        Internal.ProtobufList<CompoundCaptionTrack> protobufList = this.compoundCaptionTracks_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.compoundCaptionTracks_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureStickerTracksIsMutable() {
        Internal.ProtobufList<StickerTrack> protobufList = this.stickerTracks_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.stickerTracks_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureTimelineVideoFxTracksIsMutable() {
        Internal.ProtobufList<TimelineVideoFxTrack> protobufList = this.timelineVideoFxTracks_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.timelineVideoFxTracks_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureVideoTracksIsMutable() {
        Internal.ProtobufList<VideoTrack> protobufList = this.videoTracks_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.videoTracks_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static TimeLine getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeConfig(TimeLineConfig timeLineConfig) {
        timeLineConfig.getClass();
        TimeLineConfig timeLineConfig2 = this.config_;
        if (timeLineConfig2 == null || timeLineConfig2 == TimeLineConfig.getDefaultInstance()) {
            this.config_ = timeLineConfig;
        } else {
            this.config_ = (TimeLineConfig) ((TimeLineConfig.b) TimeLineConfig.newBuilder(this.config_).mergeFrom(timeLineConfig)).buildPartial();
        }
    }

    private void mergeDevice(Device device) {
        device.getClass();
        Device device2 = this.device_;
        if (device2 == null || device2 == Device.getDefaultInstance()) {
            this.device_ = device;
        } else {
            this.device_ = (Device) ((Device.b) Device.newBuilder(this.device_).mergeFrom(device)).buildPartial();
        }
    }

    private void mergeExportConfig(TimeLineConfig timeLineConfig) {
        timeLineConfig.getClass();
        TimeLineConfig timeLineConfig2 = this.exportConfig_;
        if (timeLineConfig2 == null || timeLineConfig2 == TimeLineConfig.getDefaultInstance()) {
            this.exportConfig_ = timeLineConfig;
        } else {
            this.exportConfig_ = (TimeLineConfig) ((TimeLineConfig.b) TimeLineConfig.newBuilder(this.exportConfig_).mergeFrom(timeLineConfig)).buildPartial();
        }
    }

    private void mergeHead(Range range) {
        range.getClass();
        Range range2 = this.head_;
        if (range2 == null || range2 == Range.getDefaultInstance()) {
            this.head_ = range;
        } else {
            this.head_ = (Range) ((Range.b) Range.newBuilder(this.head_).mergeFrom(range)).buildPartial();
        }
    }

    private void mergeTail(Range range) {
        range.getClass();
        Range range2 = this.tail_;
        if (range2 == null || range2 == Range.getDefaultInstance()) {
            this.tail_ = range;
        } else {
            this.tail_ = (Range) ((Range.b) Range.newBuilder(this.tail_).mergeFrom(range)).buildPartial();
        }
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(TimeLine timeLine) {
        return (b) DEFAULT_INSTANCE.createBuilder(timeLine);
    }

    public static TimeLine parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TimeLine) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TimeLine parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TimeLine) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TimeLine parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TimeLine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TimeLine parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TimeLine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TimeLine parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TimeLine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TimeLine parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TimeLine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static TimeLine parseFrom(InputStream inputStream) throws IOException {
        return (TimeLine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TimeLine parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TimeLine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TimeLine parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TimeLine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TimeLine parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TimeLine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TimeLine parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TimeLine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TimeLine parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TimeLine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<TimeLine> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAudioTracks(int i7) {
        ensureAudioTracksIsMutable();
        this.audioTracks_.remove(i7);
    }

    private void removeCaptionTracks(int i7) {
        ensureCaptionTracksIsMutable();
        this.captionTracks_.remove(i7);
    }

    private void removeCompoundCaptionTracks(int i7) {
        ensureCompoundCaptionTracksIsMutable();
        this.compoundCaptionTracks_.remove(i7);
    }

    private void removeStickerTracks(int i7) {
        ensureStickerTracksIsMutable();
        this.stickerTracks_.remove(i7);
    }

    private void removeTimelineVideoFxTracks(int i7) {
        ensureTimelineVideoFxTracksIsMutable();
        this.timelineVideoFxTracks_.remove(i7);
    }

    private void removeVideoTracks(int i7) {
        ensureVideoTracksIsMutable();
        this.videoTracks_.remove(i7);
    }

    private void setApplyToAllRecognizedCaption(boolean z6) {
        this.applyToAllRecognizedCaption_ = z6;
    }

    private void setAudioTracks(int i7, AudioTrack audioTrack) {
        audioTrack.getClass();
        ensureAudioTracksIsMutable();
        this.audioTracks_.set(i7, audioTrack);
    }

    private void setCaptionTracks(int i7, CaptionTrack captionTrack) {
        captionTrack.getClass();
        ensureCaptionTracksIsMutable();
        this.captionTracks_.set(i7, captionTrack);
    }

    private void setCompoundCaptionTracks(int i7, CompoundCaptionTrack compoundCaptionTrack) {
        compoundCaptionTrack.getClass();
        ensureCompoundCaptionTracksIsMutable();
        this.compoundCaptionTracks_.set(i7, compoundCaptionTrack);
    }

    private void setConfig(TimeLineConfig timeLineConfig) {
        timeLineConfig.getClass();
        this.config_ = timeLineConfig;
    }

    private void setDevice(Device device) {
        device.getClass();
        this.device_ = device;
    }

    private void setEnableHeadTail(boolean z6) {
        this.enableHeadTail_ = z6;
    }

    private void setEngineType(EngineType engineType) {
        this.engineType_ = engineType.getNumber();
    }

    private void setEngineTypeValue(int i7) {
        this.engineType_ = i7;
    }

    private void setExportConfig(TimeLineConfig timeLineConfig) {
        timeLineConfig.getClass();
        this.exportConfig_ = timeLineConfig;
    }

    private void setExtraGameTemplateId(String str) {
        str.getClass();
        this.extraGameTemplateId_ = str;
    }

    private void setExtraGameTemplateIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraGameTemplateId_ = byteString.toStringUtf8();
    }

    private void setExtraGcAlbumId(String str) {
        str.getClass();
        this.extraGcAlbumId_ = str;
    }

    private void setExtraGcAlbumIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraGcAlbumId_ = byteString.toStringUtf8();
    }

    private void setExtraGcFromSource(String str) {
        str.getClass();
        this.extraGcFromSource_ = str;
    }

    private void setExtraGcFromSourceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraGcFromSource_ = byteString.toStringUtf8();
    }

    private void setExtraGcMusicId(String str) {
        str.getClass();
        this.extraGcMusicId_ = str;
    }

    private void setExtraGcMusicIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraGcMusicId_ = byteString.toStringUtf8();
    }

    private void setExtraGcPublishTid(String str) {
        str.getClass();
        this.extraGcPublishTid_ = str;
    }

    private void setExtraGcPublishTidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraGcPublishTid_ = byteString.toStringUtf8();
    }

    private void setExtraGcScene(String str) {
        str.getClass();
        this.extraGcScene_ = str;
    }

    private void setExtraGcSceneBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraGcScene_ = byteString.toStringUtf8();
    }

    private void setExtraPictureRatioDescribe(String str) {
        str.getClass();
        this.extraPictureRatioDescribe_ = str;
    }

    private void setExtraPictureRatioDescribeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraPictureRatioDescribe_ = byteString.toStringUtf8();
    }

    private void setExtraTuwenTemplateId(String str) {
        str.getClass();
        this.extraTuwenTemplateId_ = str;
    }

    private void setExtraTuwenTemplateIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraTuwenTemplateId_ = byteString.toStringUtf8();
    }

    private void setExtraVirtualIdolTemplateId(String str) {
        str.getClass();
        this.extraVirtualIdolTemplateId_ = str;
    }

    private void setExtraVirtualIdolTemplateIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraVirtualIdolTemplateId_ = byteString.toStringUtf8();
    }

    private void setHead(Range range) {
        range.getClass();
        this.head_ = range;
    }

    private void setIdString(String str) {
        str.getClass();
        this.idString_ = str;
    }

    private void setIdStringBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.idString_ = byteString.toStringUtf8();
    }

    private void setOnekeyTemplateId(String str) {
        str.getClass();
        this.onekeyTemplateId_ = str;
    }

    private void setOnekeyTemplateIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.onekeyTemplateId_ = byteString.toStringUtf8();
    }

    private void setStickerTracks(int i7, StickerTrack stickerTrack) {
        stickerTrack.getClass();
        ensureStickerTracksIsMutable();
        this.stickerTracks_.set(i7, stickerTrack);
    }

    private void setTail(Range range) {
        range.getClass();
        this.tail_ = range;
    }

    private void setTimelineVideoFxTracks(int i7, TimelineVideoFxTrack timelineVideoFxTrack) {
        timelineVideoFxTrack.getClass();
        ensureTimelineVideoFxTracksIsMutable();
        this.timelineVideoFxTracks_.set(i7, timelineVideoFxTrack);
    }

    private void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    private void setVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.version_ = byteString.toStringUtf8();
    }

    private void setVideoTracks(int i7, VideoTrack videoTrack) {
        videoTrack.getClass();
        ensureVideoTracksIsMutable();
        this.videoTracks_.set(i7, videoTrack);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f108884a[methodToInvoke.ordinal()]) {
            case 1:
                return new TimeLine();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001a\u0000\u0000\u0001\u001a\u001a\u0000\u0006\u0000\u0001Ȉ\u0002Ȉ\u0003\t\u0004\t\u0005\t\u0006\u001b\u0007\u001b\b\u001b\t\u001b\n\u001b\u000b\u001b\fȈ\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015\f\u0016\u0007\u0017\t\u0018\t\u0019Ȉ\u001a\u0007", new Object[]{"idString_", "version_", "device_", "config_", "exportConfig_", "videoTracks_", VideoTrack.class, "audioTracks_", AudioTrack.class, "stickerTracks_", StickerTrack.class, "captionTracks_", CaptionTrack.class, "compoundCaptionTracks_", CompoundCaptionTrack.class, "timelineVideoFxTracks_", TimelineVideoFxTrack.class, "extraGcFromSource_", "extraGcPublishTid_", "extraGcMusicId_", "extraGcAlbumId_", "extraGcScene_", "extraTuwenTemplateId_", "extraVirtualIdolTemplateId_", "extraPictureRatioDescribe_", "extraGameTemplateId_", "engineType_", "enableHeadTail_", "head_", "tail_", "onekeyTemplateId_", "applyToAllRecognizedCaption_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (TimeLine.class) {
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

    public boolean getApplyToAllRecognizedCaption() {
        return this.applyToAllRecognizedCaption_;
    }

    public AudioTrack getAudioTracks(int i7) {
        return (AudioTrack) this.audioTracks_.get(i7);
    }

    public int getAudioTracksCount() {
        return this.audioTracks_.size();
    }

    public List<AudioTrack> getAudioTracksList() {
        return this.audioTracks_;
    }

    public InterfaceC6595c getAudioTracksOrBuilder(int i7) {
        return (InterfaceC6595c) this.audioTracks_.get(i7);
    }

    public List<? extends InterfaceC6595c> getAudioTracksOrBuilderList() {
        return this.audioTracks_;
    }

    public CaptionTrack getCaptionTracks(int i7) {
        return (CaptionTrack) this.captionTracks_.get(i7);
    }

    public int getCaptionTracksCount() {
        return this.captionTracks_.size();
    }

    public List<CaptionTrack> getCaptionTracksList() {
        return this.captionTracks_;
    }

    public l getCaptionTracksOrBuilder(int i7) {
        return (l) this.captionTracks_.get(i7);
    }

    public List<? extends l> getCaptionTracksOrBuilderList() {
        return this.captionTracks_;
    }

    public CompoundCaptionTrack getCompoundCaptionTracks(int i7) {
        return (CompoundCaptionTrack) this.compoundCaptionTracks_.get(i7);
    }

    public int getCompoundCaptionTracksCount() {
        return this.compoundCaptionTracks_.size();
    }

    public List<CompoundCaptionTrack> getCompoundCaptionTracksList() {
        return this.compoundCaptionTracks_;
    }

    public o getCompoundCaptionTracksOrBuilder(int i7) {
        return (o) this.compoundCaptionTracks_.get(i7);
    }

    public List<? extends o> getCompoundCaptionTracksOrBuilderList() {
        return this.compoundCaptionTracks_;
    }

    public TimeLineConfig getConfig() {
        TimeLineConfig timeLineConfig = this.config_;
        TimeLineConfig defaultInstance = timeLineConfig;
        if (timeLineConfig == null) {
            defaultInstance = TimeLineConfig.getDefaultInstance();
        }
        return defaultInstance;
    }

    public Device getDevice() {
        Device device = this.device_;
        Device defaultInstance = device;
        if (device == null) {
            defaultInstance = Device.getDefaultInstance();
        }
        return defaultInstance;
    }

    public boolean getEnableHeadTail() {
        return this.enableHeadTail_;
    }

    public EngineType getEngineType() {
        EngineType engineTypeForNumber = EngineType.forNumber(this.engineType_);
        EngineType engineType = engineTypeForNumber;
        if (engineTypeForNumber == null) {
            engineType = EngineType.UNRECOGNIZED;
        }
        return engineType;
    }

    public int getEngineTypeValue() {
        return this.engineType_;
    }

    public TimeLineConfig getExportConfig() {
        TimeLineConfig timeLineConfig = this.exportConfig_;
        TimeLineConfig defaultInstance = timeLineConfig;
        if (timeLineConfig == null) {
            defaultInstance = TimeLineConfig.getDefaultInstance();
        }
        return defaultInstance;
    }

    public String getExtraGameTemplateId() {
        return this.extraGameTemplateId_;
    }

    public ByteString getExtraGameTemplateIdBytes() {
        return ByteString.copyFromUtf8(this.extraGameTemplateId_);
    }

    public String getExtraGcAlbumId() {
        return this.extraGcAlbumId_;
    }

    public ByteString getExtraGcAlbumIdBytes() {
        return ByteString.copyFromUtf8(this.extraGcAlbumId_);
    }

    public String getExtraGcFromSource() {
        return this.extraGcFromSource_;
    }

    public ByteString getExtraGcFromSourceBytes() {
        return ByteString.copyFromUtf8(this.extraGcFromSource_);
    }

    public String getExtraGcMusicId() {
        return this.extraGcMusicId_;
    }

    public ByteString getExtraGcMusicIdBytes() {
        return ByteString.copyFromUtf8(this.extraGcMusicId_);
    }

    public String getExtraGcPublishTid() {
        return this.extraGcPublishTid_;
    }

    public ByteString getExtraGcPublishTidBytes() {
        return ByteString.copyFromUtf8(this.extraGcPublishTid_);
    }

    public String getExtraGcScene() {
        return this.extraGcScene_;
    }

    public ByteString getExtraGcSceneBytes() {
        return ByteString.copyFromUtf8(this.extraGcScene_);
    }

    public String getExtraPictureRatioDescribe() {
        return this.extraPictureRatioDescribe_;
    }

    public ByteString getExtraPictureRatioDescribeBytes() {
        return ByteString.copyFromUtf8(this.extraPictureRatioDescribe_);
    }

    public String getExtraTuwenTemplateId() {
        return this.extraTuwenTemplateId_;
    }

    public ByteString getExtraTuwenTemplateIdBytes() {
        return ByteString.copyFromUtf8(this.extraTuwenTemplateId_);
    }

    public String getExtraVirtualIdolTemplateId() {
        return this.extraVirtualIdolTemplateId_;
    }

    public ByteString getExtraVirtualIdolTemplateIdBytes() {
        return ByteString.copyFromUtf8(this.extraVirtualIdolTemplateId_);
    }

    public Range getHead() {
        Range range = this.head_;
        Range defaultInstance = range;
        if (range == null) {
            defaultInstance = Range.getDefaultInstance();
        }
        return defaultInstance;
    }

    public String getIdString() {
        return this.idString_;
    }

    public ByteString getIdStringBytes() {
        return ByteString.copyFromUtf8(this.idString_);
    }

    public String getOnekeyTemplateId() {
        return this.onekeyTemplateId_;
    }

    public ByteString getOnekeyTemplateIdBytes() {
        return ByteString.copyFromUtf8(this.onekeyTemplateId_);
    }

    public StickerTrack getStickerTracks(int i7) {
        return (StickerTrack) this.stickerTracks_.get(i7);
    }

    public int getStickerTracksCount() {
        return this.stickerTracks_.size();
    }

    public List<StickerTrack> getStickerTracksList() {
        return this.stickerTracks_;
    }

    public y getStickerTracksOrBuilder(int i7) {
        return (y) this.stickerTracks_.get(i7);
    }

    public List<? extends y> getStickerTracksOrBuilderList() {
        return this.stickerTracks_;
    }

    public Range getTail() {
        Range range = this.tail_;
        Range defaultInstance = range;
        if (range == null) {
            defaultInstance = Range.getDefaultInstance();
        }
        return defaultInstance;
    }

    public TimelineVideoFxTrack getTimelineVideoFxTracks(int i7) {
        return (TimelineVideoFxTrack) this.timelineVideoFxTracks_.get(i7);
    }

    public int getTimelineVideoFxTracksCount() {
        return this.timelineVideoFxTracks_.size();
    }

    public List<TimelineVideoFxTrack> getTimelineVideoFxTracksList() {
        return this.timelineVideoFxTracks_;
    }

    public A getTimelineVideoFxTracksOrBuilder(int i7) {
        return (A) this.timelineVideoFxTracks_.get(i7);
    }

    public List<? extends A> getTimelineVideoFxTracksOrBuilderList() {
        return this.timelineVideoFxTracks_;
    }

    public String getVersion() {
        return this.version_;
    }

    public ByteString getVersionBytes() {
        return ByteString.copyFromUtf8(this.version_);
    }

    public VideoTrack getVideoTracks(int i7) {
        return (VideoTrack) this.videoTracks_.get(i7);
    }

    public int getVideoTracksCount() {
        return this.videoTracks_.size();
    }

    public List<VideoTrack> getVideoTracksList() {
        return this.videoTracks_;
    }

    public I getVideoTracksOrBuilder(int i7) {
        return (I) this.videoTracks_.get(i7);
    }

    public List<? extends I> getVideoTracksOrBuilderList() {
        return this.videoTracks_;
    }

    public boolean hasConfig() {
        return this.config_ != null;
    }

    public boolean hasDevice() {
        return this.device_ != null;
    }

    public boolean hasExportConfig() {
        return this.exportConfig_ != null;
    }

    public boolean hasHead() {
        return this.head_ != null;
    }

    public boolean hasTail() {
        return this.tail_ != null;
    }
}
