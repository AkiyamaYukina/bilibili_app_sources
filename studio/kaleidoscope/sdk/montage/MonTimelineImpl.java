package com.bilibili.studio.kaleidoscope.sdk.montage;

import G0.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.runtime.snapshots.z;
import com.bilibili.montage.FX.MontageTimelineAnimatedSticker;
import com.bilibili.montage.FX.MontageTimelineCaption;
import com.bilibili.montage.FX.MontageTimelineCompoundCaption;
import com.bilibili.montage.FX.MontageTimelineVideoFx;
import com.bilibili.montage.avinfo.MontageVideoResolution;
import com.bilibili.montage.timeline.MontageAudioTrack;
import com.bilibili.montage.timeline.MontageTimeline;
import com.bilibili.montage.timeline.MontageVideoTrack;
import com.bilibili.studio.comm.report.editor.bean.EditorAction;
import com.bilibili.studio.kaleidoscope.sdk.AudioTrack;
import com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx;
import com.bilibili.studio.kaleidoscope.sdk.Timeline;
import com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker;
import com.bilibili.studio.kaleidoscope.sdk.TimelineCaption;
import com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption;
import com.bilibili.studio.kaleidoscope.sdk.TimelineVideoFx;
import com.bilibili.studio.kaleidoscope.sdk.VideoResolution;
import com.bilibili.studio.kaleidoscope.sdk.VideoTrack;
import com.bilibili.studio.kaleidoscope.sdk.montage.MonCustomVideoFxImpl;
import j4.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonTimelineImpl.class */
public final class MonTimelineImpl implements Timeline {
    private static final String TAG = "Mon.T.Impl";
    private MontageTimeline mMonTimeline;

    private MonTimelineImpl(@NonNull MontageTimeline montageTimeline) {
        this.mMonTimeline = montageTimeline;
    }

    @Nullable
    public static Timeline box(@Nullable MontageTimeline montageTimeline) {
        if (montageTimeline == null) {
            return null;
        }
        return new MonTimelineImpl(montageTimeline);
    }

    @Nullable
    public static MontageTimeline unbox(@Nullable Timeline timeline) {
        if (timeline == null) {
            return null;
        }
        return (MontageTimeline) timeline.getTimeline();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public TimelineAnimatedSticker addAnimatedSticker(long j7, long j8, String str) {
        MontageTimelineAnimatedSticker montageTimelineAnimatedStickerAddAnimatedSticker = this.mMonTimeline.addAnimatedSticker(j7, j8, str);
        return montageTimelineAnimatedStickerAddAnimatedSticker != null ? MonTimelineAnimatedStickerImpl.box(montageTimelineAnimatedStickerAddAnimatedSticker) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public TimelineVideoFx addBuiltinTimelineVideoFx(long j7, long j8, String str) {
        MontageTimelineVideoFx montageTimelineVideoFxAddBuiltinTimelineVideoFx = this.mMonTimeline.addBuiltinTimelineVideoFx(j7, j8, str);
        return montageTimelineVideoFxAddBuiltinTimelineVideoFx != null ? MonTimelineVideoFxImpl.box(montageTimelineVideoFxAddBuiltinTimelineVideoFx) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public TimelineCaption addCaption(String str, long j7, long j8, String str2) {
        MontageTimelineCaption montageTimelineCaptionAddCaption = this.mMonTimeline.addCaption(str, j7, j8, str2);
        return montageTimelineCaptionAddCaption != null ? MonTimelineCaptionImpl.box(montageTimelineCaptionAddCaption) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public TimelineCompoundCaption addCompoundCaption(long j7, long j8, String str) {
        StringBuilder sbA = z.a(j7, "addCompoundCaption:\targ0=", "\targ1=");
        d.a(j8, "\targ2=", str, sbA);
        bilibili.live.app.service.resolver.b.a(sbA, "", TAG);
        MontageTimelineCompoundCaption montageTimelineCompoundCaptionAddCompoundCaption = this.mMonTimeline.addCompoundCaption(j7, j8, str);
        return montageTimelineCompoundCaptionAddCompoundCaption != null ? MonTimelineCompoundCaptionImpl.box(montageTimelineCompoundCaptionAddCompoundCaption) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public TimelineAnimatedSticker addCustomAnimatedSticker(long j7, long j8, String str, String str2) {
        MontageTimelineAnimatedSticker montageTimelineAnimatedStickerAddCustomAnimatedSticker = this.mMonTimeline.addCustomAnimatedSticker(j7, j8, str, str2);
        return montageTimelineAnimatedStickerAddCustomAnimatedSticker != null ? MonTimelineAnimatedStickerImpl.box(montageTimelineAnimatedStickerAddCustomAnimatedSticker) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public TimelineVideoFx addCustomTimelineVideoFx(long j7, long j8, CustomVideoFx.Renderer renderer) {
        Objects.toString(renderer);
        MontageTimelineVideoFx montageTimelineVideoFxAddCustomTimelineVideoFx = this.mMonTimeline.addCustomTimelineVideoFx(j7, j8, renderer != null ? new MonCustomVideoFxImpl.a(renderer) : null);
        TimelineVideoFx timelineVideoFxBox = null;
        if (montageTimelineVideoFxAddCustomTimelineVideoFx != null) {
            timelineVideoFxBox = MonTimelineVideoFxImpl.box(montageTimelineVideoFxAddCustomTimelineVideoFx);
        }
        return timelineVideoFxBox;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public TimelineCaption addModularCaption(String str, long j7, long j8) {
        MontageTimelineCaption montageTimelineCaptionAddModularCaption = this.mMonTimeline.addModularCaption(str, j7, j8);
        return montageTimelineCaptionAddModularCaption != null ? MonTimelineCaptionImpl.box(montageTimelineCaptionAddModularCaption) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public TimelineVideoFx addPackagedTimelineVideoFx(long j7, long j8, String str) {
        MontageTimelineVideoFx montageTimelineVideoFxAddPackagedTimelineVideoFx = this.mMonTimeline.addPackagedTimelineVideoFx(j7, j8, str);
        return montageTimelineVideoFxAddPackagedTimelineVideoFx != null ? MonTimelineVideoFxImpl.box(montageTimelineVideoFxAddPackagedTimelineVideoFx) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public void addStatsExtraInfo(Map<String, String> map) {
        this.mMonTimeline.addStatsExtraInfo(map);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public void addWatermark(String str, int i7, int i8, float f7, int i9, int i10, int i11) {
        this.mMonTimeline.addWatermark(str, i7, i8, f7, i9, i10, i11);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public AudioTrack appendAudioTrack() {
        BLog.i(TAG, "appendAudioTrack");
        MontageAudioTrack montageAudioTrackAppendAudioTrack = this.mMonTimeline.appendAudioTrack(false);
        return montageAudioTrackAppendAudioTrack != null ? MonAudioTrackImpl.box(montageAudioTrackAppendAudioTrack) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public VideoTrack appendVideoTrack() {
        BLog.i(TAG, EditorAction.ACTION_APPEND_VT);
        MontageVideoTrack montageVideoTrackAppendVideoTrack = this.mMonTimeline.appendVideoTrack(false);
        return montageVideoTrackAppendVideoTrack != null ? MonVideoTrackImpl.box(montageVideoTrackAppendVideoTrack) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public VideoTrack appendVideoTrack(boolean z6) {
        t.a("appendVideoTrack compacted=", TAG, z6);
        MontageVideoTrack montageVideoTrackAppendVideoTrack = this.mMonTimeline.appendVideoTrack(z6);
        return montageVideoTrackAppendVideoTrack != null ? MonVideoTrackImpl.box(montageVideoTrackAppendVideoTrack) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public int audioTrackCount() {
        return this.mMonTimeline.audioTrackCount();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public boolean changeVideoBitDepth(int i7) {
        return this.mMonTimeline.changeVideoBitDepth(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public boolean changeVideoSize(int i7, int i8) {
        return this.mMonTimeline.changeVideoSize(i7, i8);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public void enableRenderOrderByZValue(boolean z6) {
        this.mMonTimeline.enableRenderOrderByZValue(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public List<TimelineAnimatedSticker> getAnimatedStickersByTimelinePosition(long j7) {
        List<MontageTimelineAnimatedSticker> animatedStickersByTimelinePosition = this.mMonTimeline.getAnimatedStickersByTimelinePosition(j7);
        if (animatedStickersByTimelinePosition == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<MontageTimelineAnimatedSticker> it = animatedStickersByTimelinePosition.iterator();
        while (it.hasNext()) {
            arrayList.add(MonTimelineAnimatedStickerImpl.box(it.next()));
        }
        return arrayList;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public AudioTrack getAudioTrackByIndex(int i7) {
        MontageAudioTrack audioTrackByIndex = this.mMonTimeline.getAudioTrackByIndex(i7);
        return audioTrackByIndex != null ? MonAudioTrackImpl.box(audioTrackByIndex) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public List<TimelineCaption> getCaptionsByTimelinePosition(long j7) {
        List<MontageTimelineCaption> captionsByTimelinePosition = this.mMonTimeline.getCaptionsByTimelinePosition(j7);
        if (captionsByTimelinePosition == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<MontageTimelineCaption> it = captionsByTimelinePosition.iterator();
        while (it.hasNext()) {
            arrayList.add(MonTimelineCaptionImpl.box(it.next()));
        }
        return arrayList;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public List<TimelineCompoundCaption> getCompoundCaptionsByTimelinePosition(long j7) {
        List<MontageTimelineCompoundCaption> compoundCaptionsByTimelinePosition = this.mMonTimeline.getCompoundCaptionsByTimelinePosition(j7);
        if (compoundCaptionsByTimelinePosition == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<MontageTimelineCompoundCaption> it = compoundCaptionsByTimelinePosition.iterator();
        while (it.hasNext()) {
            arrayList.add(MonTimelineCompoundCaptionImpl.box(it.next()));
        }
        return arrayList;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public long getDuration() {
        return this.mMonTimeline.getDuration();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    @Nullable
    public TimelineAnimatedSticker getFirstAnimatedSticker() {
        MontageTimelineAnimatedSticker firstAnimatedSticker = this.mMonTimeline.getFirstAnimatedSticker();
        if (firstAnimatedSticker == null) {
            return null;
        }
        return MonTimelineAnimatedStickerImpl.box(firstAnimatedSticker);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public TimelineCaption getFirstCaption() {
        MontageTimelineCaption firstCaption = this.mMonTimeline.getFirstCaption();
        return firstCaption != null ? MonTimelineCaptionImpl.box(firstCaption) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public TimelineCompoundCaption getFirstCompoundCaption() {
        MontageTimelineCompoundCaption firstCompoundCaption = this.mMonTimeline.getFirstCompoundCaption();
        return firstCompoundCaption != null ? MonTimelineCompoundCaptionImpl.box(firstCompoundCaption) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    @Nullable
    public TimelineVideoFx getFirstTimelineVideoFx() {
        MontageTimelineVideoFx firstTimelineVideoFx = this.mMonTimeline.getFirstTimelineVideoFx();
        return firstTimelineVideoFx != null ? MonTimelineVideoFxImpl.box(firstTimelineVideoFx) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public TimelineAnimatedSticker getNextAnimatedSticker(@NonNull TimelineAnimatedSticker timelineAnimatedSticker) {
        MontageTimelineAnimatedSticker nextAnimatedSticker = this.mMonTimeline.getNextAnimatedSticker(MonTimelineAnimatedStickerImpl.unbox(timelineAnimatedSticker));
        return nextAnimatedSticker != null ? MonTimelineAnimatedStickerImpl.box(nextAnimatedSticker) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public TimelineCaption getNextCaption(TimelineCaption timelineCaption) {
        Objects.toString(timelineCaption);
        MontageTimelineCaption nextCaption = this.mMonTimeline.getNextCaption(timelineCaption != null ? MonTimelineCaptionImpl.unbox(timelineCaption) : null);
        TimelineCaption timelineCaptionBox = null;
        if (nextCaption != null) {
            timelineCaptionBox = MonTimelineCaptionImpl.box(nextCaption);
        }
        return timelineCaptionBox;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public TimelineCompoundCaption getNextCaption(@NonNull TimelineCompoundCaption timelineCompoundCaption) {
        MontageTimelineCompoundCaption nextCaption = this.mMonTimeline.getNextCaption(MonTimelineCompoundCaptionImpl.unbox(timelineCompoundCaption));
        if (nextCaption == null) {
            return null;
        }
        return MonTimelineCompoundCaptionImpl.box(nextCaption);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public TimelineVideoFx getNextTimelineVideoFx(@NonNull TimelineVideoFx timelineVideoFx) {
        MontageTimelineVideoFx nextTimelineVideoFx = this.mMonTimeline.getNextTimelineVideoFx(MonTimelineVideoFxImpl.unbox(timelineVideoFx));
        return nextTimelineVideoFx != null ? MonTimelineVideoFxImpl.box(nextTimelineVideoFx) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public Object getTimeline() {
        return this.mMonTimeline;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public VideoResolution getVideoRes() {
        MontageVideoResolution videoRes = this.mMonTimeline.getVideoRes();
        return videoRes != null ? MonVideoResolutionImpl.box(videoRes) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public VideoTrack getVideoTrackByIndex(int i7) {
        MontageVideoTrack videoTrackByIndex = this.mMonTimeline.getVideoTrackByIndex(i7);
        return videoTrackByIndex != null ? MonVideoTrackImpl.box(videoTrackByIndex) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public VideoTrack insertVideoTrack(int i7, boolean z6) {
        com.bilibili.ad.adview.pegasus.banner.toplive.b.a(i7, "insertVideoTrack:\targ0=", "", TAG);
        MontageVideoTrack montageVideoTrackInsertVideoTrack = this.mMonTimeline.insertVideoTrack(i7, z6);
        return montageVideoTrackInsertVideoTrack != null ? MonVideoTrackImpl.box(montageVideoTrackInsertVideoTrack) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public TimelineAnimatedSticker removeAnimatedSticker(TimelineAnimatedSticker timelineAnimatedSticker) {
        Objects.toString(timelineAnimatedSticker);
        MontageTimelineAnimatedSticker montageTimelineAnimatedStickerRemoveAnimatedSticker = this.mMonTimeline.removeAnimatedSticker(timelineAnimatedSticker != null ? MonTimelineAnimatedStickerImpl.unbox(timelineAnimatedSticker) : null);
        TimelineAnimatedSticker timelineAnimatedStickerBox = null;
        if (montageTimelineAnimatedStickerRemoveAnimatedSticker != null) {
            timelineAnimatedStickerBox = MonTimelineAnimatedStickerImpl.box(montageTimelineAnimatedStickerRemoveAnimatedSticker);
        }
        return timelineAnimatedStickerBox;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public boolean removeAudioTrack(int i7) {
        com.bilibili.ad.adview.pegasus.banner.toplive.b.a(i7, "removeAudioTrack:\targ0=", "", TAG);
        return this.mMonTimeline.removeAudioTrack(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public TimelineCaption removeCaption(TimelineCaption timelineCaption) {
        Objects.toString(timelineCaption);
        MontageTimelineCaption montageTimelineCaptionRemoveCaption = this.mMonTimeline.removeCaption(timelineCaption != null ? MonTimelineCaptionImpl.unbox(timelineCaption) : null);
        TimelineCaption timelineCaptionBox = null;
        if (montageTimelineCaptionRemoveCaption != null) {
            timelineCaptionBox = MonTimelineCaptionImpl.box(montageTimelineCaptionRemoveCaption);
        }
        return timelineCaptionBox;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public TimelineCompoundCaption removeCompoundCaption(TimelineCompoundCaption timelineCompoundCaption) {
        Objects.toString(timelineCompoundCaption);
        MontageTimelineCompoundCaption montageTimelineCompoundCaptionRemoveCompoundCaption = this.mMonTimeline.removeCompoundCaption(timelineCompoundCaption != null ? MonTimelineCompoundCaptionImpl.unbox(timelineCompoundCaption) : null);
        TimelineCompoundCaption timelineCompoundCaptionBox = null;
        if (montageTimelineCompoundCaptionRemoveCompoundCaption != null) {
            timelineCompoundCaptionBox = MonTimelineCompoundCaptionImpl.box(montageTimelineCompoundCaptionRemoveCompoundCaption);
        }
        return timelineCompoundCaptionBox;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public TimelineVideoFx removeTimelineVideoFx(TimelineVideoFx timelineVideoFx) {
        BLog.i(TAG, "removeTimelineVideoFx:\targ0=" + timelineVideoFx + "");
        MontageTimelineVideoFx montageTimelineVideoFxRemoveTimelineVideoFx = this.mMonTimeline.removeTimelineVideoFx(timelineVideoFx != null ? MonTimelineVideoFxImpl.unbox(timelineVideoFx) : null);
        TimelineVideoFx timelineVideoFxBox = null;
        if (montageTimelineVideoFxRemoveTimelineVideoFx != null) {
            timelineVideoFxBox = MonTimelineVideoFxImpl.box(montageTimelineVideoFxRemoveTimelineVideoFx);
        }
        return timelineVideoFxBox;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public boolean removeVideoTrack(int i7) {
        return this.mMonTimeline.removeVideoTrack(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public void setTimeline(Object obj) {
        this.mMonTimeline = (MontageTimeline) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Timeline
    public int videoTrackCount() {
        return this.mMonTimeline.videoTrackCount();
    }
}
