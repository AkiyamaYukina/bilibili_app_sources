package com.bilibili.studio.editor.moudle.musicv3.logic;

import L50.a;
import Pb.E;
import R50.r;
import R50.v;
import UC0.n;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.ToastHelper;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.editor.timeline.i;
import com.bilibili.studio.kaleidoscope.sdk.AVFileInfo;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import fC0.e;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/logic/BiliEditorMusicBaseLogicV2.class */
public class BiliEditorMusicBaseLogicV2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final EditVideoInfo f107929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Cz0.a f107930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final n f107931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Hz0.a f107932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final MutableLiveData<Boolean> f107933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public UC0.a f107934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public BMusic f107935g;
    public long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f107936i;

    public BiliEditorMusicBaseLogicV2(@Nullable EditVideoInfo editVideoInfo, @NotNull Cz0.a aVar, @NotNull n nVar, @Nullable Hz0.a aVar2, @Nullable MutableLiveData<Boolean> mutableLiveData) {
        this.f107929a = editVideoInfo;
        this.f107930b = aVar;
        this.f107931c = nVar;
        this.f107932d = aVar2;
        this.f107933e = mutableLiveData;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.studio.editor.moudle.musicv3.logic.BiliEditorMusicBaseLogicV2 r5, com.bilibili.studio.videoeditor.capturev3.data.BgmMissionInfo r6, com.bilibili.studio.videoeditor.bean.BMusic r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.musicv3.logic.BiliEditorMusicBaseLogicV2.b(com.bilibili.studio.editor.moudle.musicv3.logic.BiliEditorMusicBaseLogicV2, com.bilibili.studio.videoeditor.capturev3.data.BgmMissionInfo, com.bilibili.studio.videoeditor.bean.BMusic, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static boolean h(@Nullable Context context, @NotNull String str) {
        R50.a aVarS = null;
        r rVarU = a.a.a.a != null ? r.u() : null;
        if (rVarU != null) {
            aVarS = rVarU.s(str);
        }
        if (aVarS != null) {
            AVFileInfo aVFileInfo = aVarS.a;
            if (aVFileInfo.getAudioStreamDuration(0) > 0) {
                if (aVFileInfo.getAudioStreamDuration(0) >= TransitionInfo.DEFAULT_DURATION) {
                    return true;
                }
                ToastHelper.showToastShort(context, 2131842001);
                return false;
            }
        }
        ToastHelper.showToastShort(context, 2131841946);
        return false;
    }

    public static void j(BMusic bMusic, EditorMusicInfo editorMusicInfo) {
        if (bMusic == null) {
            return;
        }
        if (Intrinsics.areEqual(bMusic, editorMusicInfo.themeMusic)) {
            editorMusicInfo.themeMusic = null;
            return;
        }
        int iIndexOf = editorMusicInfo.bMusicList.indexOf(bMusic);
        if (iIndexOf != -1) {
            editorMusicInfo.bMusicList.remove(iIndexOf);
        }
    }

    public final void e(long j7, @NotNull String str, @NotNull Bgm bgm) {
        UC0.a newBgmAudioTrack;
        EditorMusicInfo editorMusicInfo;
        ArrayList<BMusic> arrayList;
        EditVideoInfo editVideoInfo = this.f107929a;
        if (editVideoInfo == null) {
            BLog.e("BiliEditorMusicBaseLogicV2", "mEditVideoIno error is null");
            return;
        }
        EditorMusicInfo editorMusicInfo2 = editVideoInfo.getEditorMusicInfo();
        if (editorMusicInfo2 == null) {
            BLog.e("BiliEditorMusicBaseLogicV2", "musicInfo error is null");
            return;
        }
        E.a("refresh bgm name=", bgm.name, ", is logic v2", "BiliEditorMusicBaseLogicV2");
        n nVar = this.f107931c;
        nVar.getClass();
        i iVarB = n.b();
        P50.n nVarI = iVarB != null ? iVarB.i() : null;
        long duration = nVarI != null ? ((v) nVarI).a.getDuration() : 0L;
        i iVarB2 = n.b();
        long jG = iVarB2 != null ? iVarB2.g(str) : 0L;
        if (this.f107934f != null) {
            j(this.f107935g, editorMusicInfo2);
            UC0.a aVar = this.f107934f;
            if (aVar != null) {
                aVar.y();
            }
            UpperTimeline upperTimelineC = n.c();
            if (upperTimelineC != null) {
                upperTimelineC.removeAudioTrack(this.f107934f);
            }
        }
        if (this.f107936i && (editorMusicInfo = editVideoInfo.getEditorMusicInfo()) != null && (arrayList = editorMusicInfo.bMusicList) != null) {
            ArrayList<BMusic> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((BMusic) obj).isBindByTemplate) {
                    arrayList2.add(obj);
                }
            }
            for (BMusic bMusic : arrayList2) {
                j(bMusic, editorMusicInfo2);
                UpperTimeline upperTimelineC2 = n.c();
                UC0.a audioTrackByMusic = upperTimelineC2 != null ? upperTimelineC2.getAudioTrackByMusic(bMusic) : null;
                if (audioTrackByMusic != null) {
                    audioTrackByMusic.y();
                }
                UpperTimeline upperTimelineC3 = n.c();
                if (upperTimelineC3 != null) {
                    upperTimelineC3.removeAudioTrack(audioTrackByMusic);
                }
            }
        }
        BMusic bMusicC = Az0.a.c(str, jG, j7, duration, bgm);
        bMusicC.isBindByTemplate = this.f107936i;
        this.f107935g = bMusicC;
        UpperTimeline upperTimelineC4 = n.c();
        if (upperTimelineC4 == null || (newBgmAudioTrack = upperTimelineC4.getNewBgmAudioTrack(bMusicC)) == null) {
            return;
        }
        this.f107934f = newBgmAudioTrack;
        if (b.c()) {
            b.a(bMusicC, editVideoInfo.getVideoDuration());
        } else {
            a.a(bMusicC);
        }
        editorMusicInfo2.bMusicList.add(bMusicC);
        UC0.a aVar2 = this.f107934f;
        nVar.getClass();
        UpperTimeline upperTimelineC5 = n.c();
        if (upperTimelineC5 != null) {
            upperTimelineC5.buildBgmAudioV2(bMusicC, aVar2, "BiliEditorMusicBaseLogicV2.applyMusicAfterMusicDownloadV2".concat("->buildFxV2"));
        }
        BuildersKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), (CoroutineStart) null, new BiliEditorMusicBaseLogicV2$applyMusicAfterMusicDownloadV2$3(this, bgm, bMusicC, null), 2, (Object) null);
        editVideoInfo.setIsEdited(true);
        editorMusicInfo2.selectMusic = bMusicC;
        e.a(BiliContext.application(), editVideoInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int f(@NotNull BMusic bMusic) {
        int size;
        Cz0.a aVar = this.f107930b;
        if (Cz0.a.c((EditorMusicInfo) aVar.f16451b)) {
            int size2 = ((EditorMusicInfo) aVar.f16451b).bMusicList.size();
            size = 0;
            while (size < size2) {
                if (bMusic.inPoint < ((EditorMusicInfo) aVar.f16451b).bMusicList.get(size).inPoint) {
                    ((EditorMusicInfo) aVar.f16451b).bMusicList.add(size, bMusic);
                    break;
                }
                size++;
            }
            ((EditorMusicInfo) aVar.f16451b).bMusicList.add(bMusic);
            size = ((EditorMusicInfo) aVar.f16451b).bMusicList.size() - 1;
        } else {
            ((EditorMusicInfo) aVar.f16451b).bMusicList.add(bMusic);
            size = ((EditorMusicInfo) aVar.f16451b).bMusicList.size() - 1;
        }
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        this.f107931c.getClass();
        UpperTimeline upperTimelineC = n.c();
        if (upperTimelineC != null) {
            upperTimelineC.buildBgmAudio((EditorMusicInfo) this.f107930b.f16451b);
        }
    }

    public final void i() {
        EditorMusicInfo editorMusicInfo;
        EditorMusicInfo editorMusicInfo2;
        ArrayList<BMusic> arrayList;
        if (this.f107935g != null) {
            EditVideoInfo editVideoInfo = this.f107929a;
            if (editVideoInfo != null && (editorMusicInfo2 = editVideoInfo.getEditorMusicInfo()) != null && (arrayList = editorMusicInfo2.bMusicList) != null) {
                arrayList.remove(this.f107935g);
            }
            if (editVideoInfo != null && (editorMusicInfo = editVideoInfo.getEditorMusicInfo()) != null) {
                editorMusicInfo.selectMusic = null;
            }
            this.f107935g = null;
        }
        UC0.a aVar = this.f107934f;
        if (aVar != null) {
            aVar.y();
            this.f107931c.getClass();
            UpperTimeline upperTimelineC = n.c();
            if (upperTimelineC != null) {
                upperTimelineC.removeAudioTrack(this.f107934f);
            }
            this.f107934f = null;
        }
    }
}
