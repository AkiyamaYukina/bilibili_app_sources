package com.bilibili.studio.editor.timeline;

import J3.P0;
import P50.m;
import P50.n;
import R50.r;
import R50.v;
import Vn.A;
import androidx.core.view.C4559c;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.editor.timeline.backup.UpperEditorBackUpManager;
import com.bilibili.studio.kaleidoscope.sdk.Timeline;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfoUtils;
import com.bilibili.studio.videoeditor.nvsstreaming.EditNvsTimelineInfoBase;
import com.bilibili.studio.videoeditor.nvsstreaming.EditProxyUtils;
import com.bilibili.studio.videoeditor.util.SimpleUtilKt;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.videoeditor.config.BTimelineConfigInfo;
import eA0.InterfaceC6919b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/i.class */
public final class i implements InterfaceC6919b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UpperEngineScene f108299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public UpperTimeline f108300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public P50.i f108301c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Set<Function2<UpperEngineScene, m, Unit>> f108303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public r f108304f;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public UC0.l f108306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f108307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f108308k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public UpperEditorBackUpManager f108310m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f108302d = LazyKt.lazy(new P0(9));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f108305g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final List<com.bilibili.studio.editor.timeline.a> f108309l = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final g f108311n = new Function2(this) { // from class: com.bilibili.studio.editor.timeline.g

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f108295a;

        {
            this.f108295a = this;
        }

        public final Object invoke(Object obj, Object obj2) {
            UpperEngineScene upperEngineScene = (UpperEngineScene) obj;
            m mVar = (m) obj2;
            Set<Function2<UpperEngineScene, m, Unit>> set = this.f108295a.f108303e;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    Function2 function2 = (Function2) it.next();
                    if (function2 != null) {
                        function2.invoke(upperEngineScene, mVar);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/i$a.class */
    public static final class a implements com.bilibili.studio.editor.timeline.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f108312a;

        public a(i iVar) {
            this.f108312a = iVar;
        }

        @Override // com.bilibili.studio.editor.timeline.a
        public final void b(final EditVideoInfo editVideoInfo, final EditVideoInfo editVideoInfo2, final BackUpTag backUpTag) {
            SimpleUtilKt.safeForEach(this.f108312a.f108309l, new Function1(editVideoInfo, editVideoInfo2, backUpTag) { // from class: com.bilibili.studio.editor.timeline.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final EditVideoInfo f108296a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final EditVideoInfo f108297b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final BackUpTag f108298c;

                {
                    this.f108296a = editVideoInfo;
                    this.f108297b = editVideoInfo2;
                    this.f108298c = backUpTag;
                }

                public final Object invoke(Object obj) {
                    ((a) obj).b(this.f108296a, this.f108297b, this.f108298c);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.bilibili.studio.editor.timeline.g] */
    public i(@NotNull UpperEngineScene upperEngineScene, @Nullable e eVar) {
        this.f108299a = upperEngineScene;
    }

    public final void a(@Nullable EditVideoInfo editVideoInfo, @NotNull BackUpTag backUpTag) {
        int i7;
        com.bilibili.studio.editor.timeline.backup.b bVar;
        if (editVideoInfo == null) {
            return;
        }
        UpperEditorBackUpManager upperEditorBackUpManager = this.f108310m;
        UpperEditorBackUpManager upperEditorBackUpManager2 = upperEditorBackUpManager;
        if (upperEditorBackUpManager == null) {
            upperEditorBackUpManager2 = new UpperEditorBackUpManager(new a(this));
        }
        this.f108310m = upperEditorBackUpManager2;
        String des = backUpTag.getDes();
        com.bilibili.studio.editor.timeline.backup.b bVar2 = upperEditorBackUpManager2.f108269c;
        eA0.c.b(upperEditorBackUpManager2, "【backUp】start tag：" + des + " currentNode:" + (bVar2 != null ? Integer.valueOf(bVar2.f108278b) : null));
        upperEditorBackUpManager2.f108268b = 3;
        com.bilibili.studio.editor.timeline.backup.b bVar3 = upperEditorBackUpManager2.f108269c;
        if (UpperEditorBackUpManager.c(bVar3 != null ? bVar3.f108277a.f108275a : null, editVideoInfo)) {
            com.bilibili.studio.editor.timeline.backup.b bVar4 = upperEditorBackUpManager2.f108269c;
            if ((bVar4 != null ? bVar4.f108280d : null) != null && bVar4 != null) {
                bVar4.f108280d = null;
            }
            com.bilibili.studio.editor.timeline.backup.a aVar = new com.bilibili.studio.editor.timeline.backup.a(editVideoInfo.m10450clone(), backUpTag);
            int i8 = upperEditorBackUpManager2.f108272f;
            upperEditorBackUpManager2.f108272f = i8 + 1;
            com.bilibili.studio.editor.timeline.backup.b bVar5 = new com.bilibili.studio.editor.timeline.backup.b(aVar, i8);
            com.bilibili.studio.editor.timeline.backup.b bVar6 = upperEditorBackUpManager2.f108269c;
            if (bVar6 != null) {
                bVar6.f108280d = bVar5;
            }
            bVar5.f108279c = bVar6;
            upperEditorBackUpManager2.f108269c = bVar5;
            if (upperEditorBackUpManager2.f108274i == null) {
                upperEditorBackUpManager2.f108274i = aVar;
            }
            upperEditorBackUpManager2.d(false);
            com.bilibili.studio.editor.timeline.backup.b bVar7 = upperEditorBackUpManager2.f108269c;
            com.bilibili.studio.editor.timeline.backup.b bVar8 = bVar7 != null ? bVar7.f108279c : null;
            int i9 = 0;
            while (true) {
                i7 = upperEditorBackUpManager2.f108273g;
                if (bVar8 == null || i9 >= i7) {
                    break;
                }
                bVar8 = bVar8.f108279c;
                i9++;
            }
            if (i9 == i7 && bVar8 != null && (bVar = bVar8.f108280d) != null) {
                bVar.f108279c = null;
            }
            com.bilibili.studio.editor.timeline.backup.b bVar9 = upperEditorBackUpManager2.f108269c;
            com.bilibili.studio.editor.timeline.backup.b bVar10 = bVar9 != null ? bVar9.f108280d : null;
            int i10 = 0;
            while (bVar10 != null && i10 < i7) {
                bVar10 = bVar10.f108280d;
                i10++;
            }
            StringBuilder sbB = A.b(i9 + i10, i9, "total:", " canUndo:", " canRedo:");
            sbB.append(i10);
            sbB.append(" limit:");
            sbB.append(i7);
            eA0.c.b(upperEditorBackUpManager2, sbB.toString());
            upperEditorBackUpManager2.f108268b = 0;
            String des2 = backUpTag.getDes();
            com.bilibili.studio.editor.timeline.backup.b bVar11 = upperEditorBackUpManager2.f108269c;
            Integer numValueOf = null;
            if (bVar11 != null) {
                numValueOf = Integer.valueOf(bVar11.f108278b);
            }
            eA0.c.b(upperEditorBackUpManager2, "【backUp】end tag：" + des2 + " currentNode:" + numValueOf);
        } else {
            eA0.c.b(upperEditorBackUpManager2, "backUp 数据没发生变化，不记录");
            upperEditorBackUpManager2.f108268b = 0;
        }
        Iterator it = ((ArrayList) this.f108309l).iterator();
        while (it.hasNext()) {
            ((com.bilibili.studio.editor.timeline.a) it.next()).a();
        }
    }

    public final boolean b(@Nullable EditVideoInfo editVideoInfo, boolean z6, @NotNull String str) {
        UpperTimeline upperTimeline;
        if (editVideoInfo == null || this.f108304f == null || i() == null || (upperTimeline = this.f108300b) == null) {
            return false;
        }
        List<UC0.k> videoTrackList = upperTimeline.getVideoTrackList();
        List<EditVideoClip> editVideoTracks = editVideoInfo.getEditVideoTracks();
        EditVideoClip userVideoTrack = editVideoInfo.getUserVideoTrack();
        if (z6) {
            UpperTimeline upperTimeline2 = this.f108300b;
            if (upperTimeline2 != null) {
                upperTimeline2.removeAllVideoTracks();
            }
            videoTrackList.clear();
            eA0.c.a(this, "buildTimelineNew removeAllVideoTrack tag=" + str);
            if (V.e(editVideoTracks)) {
                eA0.c.a(this, "buildTimelineNew fail editVideoTracks is empty");
                return false;
            }
            if (userVideoTrack == null) {
                eA0.c.a(this, "buildTimelineNew fail userVideoTrack is null");
                EditVideoInfoUtils.throwDebugException("UpperStreamingVideo-buildTimeline userVideoTrack == null");
                return false;
            }
            long videoDuration = userVideoTrack.getVideoDuration();
            eA0.c.a(this, "buildTimelineNew userTrack duration=" + videoDuration);
            upperTimeline.appendVideoTrack(videoDuration, editVideoTracks);
        }
        if (videoTrackList.isEmpty() || editVideoTracks == null) {
            eA0.c.a(this, "buildTimelineNew fail mEditVideoTrackList isEmpty");
            return false;
        }
        if (videoTrackList.size() != editVideoTracks.size()) {
            eA0.c.a(this, "buildTimelineNew fail trackSize=" + videoTrackList.size() + ",dataSize=" + editVideoTracks.size());
            EditVideoInfoUtils.throwDebugException("UpperStreamingVideo-buildTimeline");
            return false;
        }
        int size = videoTrackList.size();
        boolean z7 = true;
        for (int i7 = 0; i7 < size; i7++) {
            z7 = z7 && upperTimeline.buildVideoTrack(videoTrackList.get(i7), editVideoTracks.get(i7));
            eA0.c.a(this, "buildTimelineNew buildVideoResult=" + z7);
        }
        if (!z7) {
            eA0.c.a(this, "buildTimelineNew fail buildVideoResult=false");
            EditVideoInfoUtils.throwDebugException("UpperStreamingVideo-buildTimeline buildVideoResult==false");
        }
        boolean zBuildCaptionNew = upperTimeline.buildCaptionNew(editVideoInfo);
        eA0.c.a(this, "buildCaptionNew buildCaptionResult=" + zBuildCaptionNew);
        boolean zBuildDanmaku = upperTimeline.buildDanmaku(editVideoInfo);
        eA0.c.a(this, "buildDanmaku buildDanmakuResult=" + zBuildDanmaku);
        boolean zBuildSticker = upperTimeline.buildSticker(editVideoInfo);
        eA0.c.a(this, "buildSticker buildStickerResult=" + zBuildSticker);
        boolean zBuildTimelineVideoFxNew = upperTimeline.buildTimelineVideoFxNew(editVideoInfo);
        eA0.c.a(this, "buildTimelineVideoFxNew buildTimelineVideoFxResult=" + zBuildTimelineVideoFxNew);
        boolean zBuildMusicRhythmFx = upperTimeline.buildMusicRhythmFx(editVideoInfo);
        eA0.c.a(this, "buildMusicRhythmFx buildMusicRhythmResult=" + zBuildMusicRhythmFx);
        boolean zBuildAudioTracks = upperTimeline.buildAudioTracks(editVideoInfo);
        eA0.c.a(this, "buildAudioTracks buildAudioTracksResult=" + zBuildAudioTracks);
        Lazy lazy = zw0.b.f130950a;
        if (ConfigManager.Companion.ab2().getWithDefault("uper.enable_engine_api_upgrade", false) && !editVideoInfo.isAdaptTimelineDraft().booleanValue()) {
            editVideoInfo.setIsAdaptTimelineDraft(true);
            if (!Intrinsics.areEqual(editVideoInfo.getEngineType(), editVideoInfo.getOriginEngineType())) {
                if (Intrinsics.areEqual(editVideoInfo.getEngineType(), "UpperNvs") && Intrinsics.areEqual(editVideoInfo.getOriginEngineType(), "StudioMon")) {
                    UC0.c captionTrack = upperTimeline.getCaptionTrack();
                    if (captionTrack != null) {
                        for (CaptionInfo captionInfo : (ArrayList) captionTrack.f24624c) {
                            UC0.c.d(captionInfo.timelineCaption, captionInfo, false);
                            CaptionInfo derivedCaptionInfo = editVideoInfo.getDerivedCaptionInfo();
                            if (derivedCaptionInfo != null && captionInfo.id == derivedCaptionInfo.id) {
                                derivedCaptionInfo.pos = captionInfo.pos;
                            }
                        }
                    }
                    upperTimeline.getStickTrack();
                    upperTimeline.getCompoundCaption();
                    upperTimeline.getTimelineVideoFxTrack();
                    Iterator<T> it = upperTimeline.getAudioTrackList().iterator();
                    while (it.hasNext()) {
                        ((UC0.a) it.next()).getClass();
                    }
                    Iterator<T> it2 = upperTimeline.getVideoTrackList().iterator();
                    while (it2.hasNext()) {
                        ((UC0.k) it2.next()).getClass();
                    }
                } else if (Intrinsics.areEqual(editVideoInfo.getEngineType(), "StudioMon") && Intrinsics.areEqual(editVideoInfo.getOriginEngineType(), "UpperNvs")) {
                    UC0.c captionTrack2 = upperTimeline.getCaptionTrack();
                    if (captionTrack2 != null) {
                        for (CaptionInfo captionInfo2 : (ArrayList) captionTrack2.f24624c) {
                            UC0.c.d(captionInfo2.timelineCaption, captionInfo2, true);
                            CaptionInfo derivedCaptionInfo2 = editVideoInfo.getDerivedCaptionInfo();
                            if (derivedCaptionInfo2 != null && captionInfo2.id == derivedCaptionInfo2.id) {
                                derivedCaptionInfo2.pos = captionInfo2.pos;
                            }
                        }
                    }
                    upperTimeline.getStickTrack();
                    upperTimeline.getCompoundCaption();
                    upperTimeline.getTimelineVideoFxTrack();
                    Iterator<T> it3 = upperTimeline.getAudioTrackList().iterator();
                    while (it3.hasNext()) {
                        ((UC0.a) it3.next()).getClass();
                    }
                    Iterator<T> it4 = upperTimeline.getVideoTrackList().iterator();
                    while (it4.hasNext()) {
                        ((UC0.k) it4.next()).getClass();
                    }
                }
            }
        }
        return zBuildCaptionNew && zBuildDanmaku && zBuildSticker && zBuildTimelineVideoFxNew && zBuildAudioTracks && zBuildMusicRhythmFx;
    }

    public final void c() {
        r rVar = this.f108304f;
        if (rVar == null) {
            return;
        }
        rVar.l((C4559c) null);
        r rVar2 = this.f108304f;
        if (rVar2 != null) {
            rVar2.m((m.b) null);
        }
        r rVar3 = this.f108304f;
        if (rVar3 != null) {
            rVar3.i((m.c) null);
        }
        r rVar4 = this.f108304f;
        if (rVar4 != null) {
            rVar4.e(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c8  */
    /* JADX WARN: Type inference failed for: r0v18, types: [R50.A, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [NB0.C, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v9, types: [R50.v] */
    /* JADX WARN: Type inference failed for: r2v6, types: [P50.n] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.Pair<com.bilibili.studio.editor.timeline.UpperTimeline, java.lang.String> d(@org.jetbrains.annotations.NotNull com.bilibili.videoeditor.config.BTimelineConfigInfo r7) {
        /*
            Method dump skipped, instruction units count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.timeline.i.d(com.bilibili.videoeditor.config.BTimelineConfigInfo):kotlin.Pair");
    }

    @NotNull
    public final Pair<Boolean, String> e(@NotNull EditNvsTimelineInfoBase editNvsTimelineInfoBase, @Nullable P50.i iVar) {
        BTimelineConfigInfo bTimelineConfigInfo = new BTimelineConfigInfo();
        bTimelineConfigInfo.setVideoWidth(editNvsTimelineInfoBase.getVideoSize().getWidth());
        bTimelineConfigInfo.setVideoHeight(editNvsTimelineInfoBase.getVideoSize().getHeight());
        bTimelineConfigInfo.setFps(editNvsTimelineInfoBase.getFps());
        bTimelineConfigInfo.setAudioSampleRate(editNvsTimelineInfoBase.getSampleRate());
        bTimelineConfigInfo.setAudioChannelCount(editNvsTimelineInfoBase.getAudioChannelCount());
        this.f108301c = iVar;
        Pair<UpperTimeline, String> pairD = d(bTimelineConfigInfo);
        UpperTimeline upperTimeline = (UpperTimeline) pairD.getFirst();
        if (upperTimeline == null) {
            return new Pair<>(Boolean.FALSE, pairD.getSecond());
        }
        r rVar = this.f108304f;
        if (!(rVar != null ? rVar.r(upperTimeline.getTimeline(), iVar) : false)) {
            return new Pair<>(Boolean.FALSE, "createTimelineWithDefaultTrack connectTimelineWithLiveWindowExt fail");
        }
        upperTimeline.enableRenderOrderByZValue(editNvsTimelineInfoBase.getEnableRenderOrderByZValue());
        upperTimeline.mEditTimelineInfoBase = editNvsTimelineInfoBase;
        if (upperTimeline.appendAudioTrack("audio_track_type_bgm") == null) {
            return new Pair<>(Boolean.FALSE, "createTimelineWithDefaultTrack appendAudioTrack bgm fail");
        }
        if (upperTimeline.appendAudioTrack("audio_track_type_record") == null) {
            return new Pair<>(Boolean.FALSE, "createTimelineWithDefaultTrack appendAudioTrack record fail");
        }
        upperTimeline.createCaptionTrack();
        upperTimeline.createCompoundCaptionTrack();
        upperTimeline.createStickerTrack();
        upperTimeline.createVideoFxTrack();
        return new Pair<>(Boolean.TRUE, "");
    }

    public final void f(boolean z6) {
        eA0.c.b(this, "destroy");
        try {
            p();
            o(z6);
        } catch (Exception e7) {
            eA0.c.a(this, "fail to close streamingcontext " + e7.getMessage());
        }
        this.f108304f = null;
        this.f108300b = null;
        this.f108301c = null;
        ((ArrayList) this.f108309l).clear();
        UpperEditorBackUpManager upperEditorBackUpManager = this.f108310m;
        if (upperEditorBackUpManager != null) {
            upperEditorBackUpManager.j();
        }
        this.f108310m = null;
    }

    public final long g(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return 0L;
        }
        r rVar = this.f108304f;
        R50.a aVarS = rVar != null ? rVar.s(str) : null;
        return aVarS != null ? aVarS.a.getAudioStreamDuration(0) : -1L;
    }

    @Override // eA0.InterfaceC6919b
    @NotNull
    public final String getClassTag() {
        return "UpperStreamingVideo";
    }

    public final int h() {
        r rVar = this.f108304f;
        return rVar != null ? rVar.b.getStreamingEngineState() : 0;
    }

    @Nullable
    public final n i() {
        UpperTimeline upperTimeline = this.f108300b;
        return upperTimeline != null ? upperTimeline.getTimeline() : null;
    }

    public final long j() {
        r rVar;
        return (i() == null || (rVar = this.f108304f) == null) ? 0L : rVar.b.getTimelineCurrentPosition(v.p(i()));
    }

    public final long k() {
        UpperTimeline upperTimeline = this.f108300b;
        return upperTimeline != null ? upperTimeline.getVideoDuration() : 0L;
    }

    public final boolean l() {
        if (!this.f108305g.get()) {
            eA0.c.a(this, "engine had not been initialized error !");
        }
        return this.f108305g.get();
    }

    public final boolean m() {
        return h() == 3;
    }

    public final void n() {
        if (this.f108304f == null) {
            return;
        }
        eA0.c.a(this, " 引擎当前的状态 onVideoPausePlayBack state=" + h());
        r rVar = this.f108304f;
        eA0.c.a(this, " onVideoPausePlayBack result=" + (rVar != null ? rVar.b.pausePlayback() : false));
    }

    public final void o(boolean z6) {
        if (l()) {
            ((d) this.f108302d.getValue()).getClass();
            ((Set) d.f108289e.getValue()).remove(this.f108311n);
            Set<Function2<UpperEngineScene, m, Unit>> set = this.f108303e;
            if (set != null) {
                set.clear();
            }
            this.f108303e = null;
            UpperEngineScene upperEngineScene = this.f108299a;
            if (z6 && l()) {
                d dVar = d.f108285a;
                dVar.getClass();
                eA0.c.b(dVar, "clearContextCallback");
                if (dVar.e()) {
                    Lazy lazy = zw0.b.f130950a;
                    boolean z7 = DeviceDecision.INSTANCE.getBoolean("uper.enable_reset_engine_call_back", true);
                    if (Intrinsics.areEqual(upperEngineScene.getContextType(), "main")) {
                        N50.a aVar = d.f108288d;
                        N50.a aVar2 = aVar;
                        if (aVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mEditorCore");
                            aVar2 = null;
                        }
                        m mVar = d.f108286b;
                        m mVar2 = mVar;
                        if (mVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mMainContext");
                            mVar2 = null;
                        }
                        aVar2.a(mVar2, z7);
                    } else {
                        m mVar3 = (m) d.c().get(upperEngineScene);
                        if (mVar3 != null) {
                            N50.a aVar3 = d.f108288d;
                            N50.a aVar4 = aVar3;
                            if (aVar3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mEditorCore");
                                aVar4 = null;
                            }
                            aVar4.a(mVar3, z7);
                        }
                    }
                }
            }
            if (l()) {
                d dVar2 = d.f108285a;
                dVar2.getClass();
                eA0.c.b(dVar2, "clearContextCache");
                if (dVar2.e()) {
                    if (Intrinsics.areEqual(upperEngineScene.getContextType(), "main")) {
                        N50.a aVar5 = d.f108288d;
                        N50.a aVar6 = aVar5;
                        if (aVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mEditorCore");
                            aVar6 = null;
                        }
                        r rVar = d.f108286b;
                        r rVar2 = rVar;
                        if (rVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mMainContext");
                            rVar2 = null;
                        }
                        aVar6.getClass();
                        if (rVar2 != null) {
                            rVar2.clearCachedResources(z6);
                        }
                    } else {
                        m mVar4 = (m) d.c().get(upperEngineScene);
                        if (mVar4 != null) {
                            N50.a aVar7 = d.f108288d;
                            N50.a aVar8 = aVar7;
                            if (aVar7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mEditorCore");
                                aVar8 = null;
                            }
                            aVar8.getClass();
                            mVar4.clearCachedResources(z6);
                        }
                    }
                }
            }
            if (z6) {
                d dVar3 = d.f108285a;
                dVar3.getClass();
                eA0.c.b(dVar3, "releaseContext  " + upperEngineScene.getInfo());
                if (dVar3.e()) {
                    if (Intrinsics.areEqual(upperEngineScene.getContextType(), "main")) {
                        if (!d.c().isEmpty()) {
                            for (Map.Entry entry : d.c().entrySet()) {
                                UpperEngineScene upperEngineScene2 = (UpperEngineScene) entry.getKey();
                                m mVar5 = (m) entry.getValue();
                                eA0.c.a(dVar3, "releaseAuxiliaryContext---" + upperEngineScene2.getInfo());
                                N50.a aVar9 = d.f108288d;
                                N50.a aVar10 = aVar9;
                                if (aVar9 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mEditorCore");
                                    aVar10 = null;
                                }
                                aVar10.c(mVar5);
                            }
                            d.c().clear();
                        }
                        N50.a aVar11 = d.f108288d;
                        if (aVar11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mEditorCore");
                            aVar11 = null;
                        }
                        if (d.f108286b == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mMainContext");
                        }
                        aVar11.getClass();
                        r.w().close();
                        d.f108290f.set(false);
                    } else {
                        m mVar6 = (m) d.c().get(upperEngineScene);
                        if (mVar6 != null) {
                            eA0.c.a(dVar3, "销毁辅Context");
                            N50.a aVar12 = d.f108288d;
                            if (aVar12 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mEditorCore");
                                aVar12 = null;
                            }
                            aVar12.c(mVar6);
                        }
                    }
                }
            }
            this.f108305g.set(false);
        }
    }

    public final void p() {
        UpperTimeline upperTimeline = this.f108300b;
        if (upperTimeline == null || upperTimeline.getTimeline() == null) {
            return;
        }
        r rVar = this.f108304f;
        UpperTimeline upperTimeline2 = this.f108300b;
        if (EditProxyUtils.removeTimeline(rVar, upperTimeline2 != null ? upperTimeline2.getTimeline() : null)) {
            UpperTimeline upperTimeline3 = this.f108300b;
            if (upperTimeline3 != null) {
                upperTimeline3.destroy();
            }
            this.f108300b = null;
        }
    }

    public final boolean q(long j7, long j8) {
        long duration;
        v vVarI = i();
        r rVar = this.f108304f;
        if (rVar == null || vVarI == null) {
            eA0.c.a(this, "seekAndUpdateTimeline fail streamingContext is :" + rVar + " timeline is " + vVarI);
            return false;
        }
        v vVarI2 = i();
        if (vVarI2 != null && j7 >= 0) {
            Timeline timeline = vVarI2.a;
            duration = j7;
            if (j7 >= timeline.getDuration()) {
                duration = timeline.getDuration() - j8;
            }
        } else {
            duration = 0;
        }
        s();
        n();
        boolean zY = rVar.y(vVarI, duration, this.h);
        long duration2 = vVarI.a.getDuration();
        UC0.l lVar = this.f108306i;
        if (lVar != null) {
            lVar.a(duration, duration2);
        }
        eA0.c.a(this, "seekAndUpdateTimeline success");
        return zY;
    }

    public final boolean r(long j7, long j8) {
        long duration;
        Lazy lazy = zw0.b.f130950a;
        if (DeviceDecision.INSTANCE.getBoolean("uper.enable_seek_timeline_upgrade", false)) {
            return q(j7, j8);
        }
        v vVarI = i();
        r rVar = this.f108304f;
        if (rVar == null || vVarI == null) {
            eA0.c.a(this, "seekTimeline fail streamingContext is :" + rVar + " timeline is " + vVarI);
            return false;
        }
        v vVarI2 = i();
        if (vVarI2 != null && j7 >= 0) {
            Timeline timeline = vVarI2.a;
            duration = j7;
            if (j7 >= timeline.getDuration()) {
                duration = timeline.getDuration() - j8;
            }
        } else {
            duration = 0;
        }
        n();
        boolean zY = rVar.y(vVarI, duration, this.h);
        long duration2 = vVarI.a.getDuration();
        UC0.l lVar = this.f108306i;
        if (lVar != null) {
            lVar.a(duration, duration2);
        }
        eA0.c.a(this, "seekTimeline success");
        return zY;
    }

    public final void s() {
        r rVar = this.f108304f;
        if (rVar != null) {
            rVar.b.updateTimeline(v.p(i()));
        }
    }
}
