package com.bilibili.studio.editor.moudle.editormain.usecase.musicmodule;

import Ax.h;
import Ex0.j;
import Ex0.n;
import Ex0.o;
import G.p;
import Ky0.C2459a;
import Ky0.a0;
import Ky0.l0;
import L50.a;
import Ly0.C2547f;
import Mx0.a;
import R50.r;
import Xy0.f;
import aC0.InterfaceC3194a;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.ToastHelper;
import com.bilibili.studio.editor.moudle.editormain.track.beans.BiliEditorMaterialMultiInfo;
import com.bilibili.studio.editor.moudle.editormain.track.cover.enums.BiliEditorTrackMode;
import com.bilibili.studio.editor.moudle.editormain.track.enums.BiliEditorMaterialType;
import com.bilibili.studio.editor.moudle.editormain.track.manager.EditorTrackLocationMode;
import com.bilibili.studio.editor.moudle.editormain.ui.panels.control.MainPanelMaterialTrackType;
import com.bilibili.studio.editor.moudle.editormain.uistate.bottomfragment.FragmentContainerModal;
import com.bilibili.studio.editor.moudle.editormain.uistate.mainpanel.MainPanelMaterialFoldTrackUiState;
import com.bilibili.studio.editor.moudle.editormain.usecase.middlemodule.MiddleControlUseCase;
import com.bilibili.studio.editor.moudle.home.presenter.airec.task.BiliEditorTaskStatus;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.moudle.music.manager.MusicDownloadData;
import com.bilibili.studio.editor.moudle.music.manager.b;
import com.bilibili.studio.editor.moudle.music.model.EditorMusicItem;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.editor.timeline.i;
import com.bilibili.studio.kaleidoscope.sdk.AVFileInfo;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import gz0.e;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/usecase/musicmodule/MusicModuleUseCase.class */
public final class MusicModuleUseCase extends Jy0.a implements b.InterfaceC1198b, l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ez0.c f107192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final o f107193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ez0.a f107194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final n f107195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final j f107196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Ex0.c f107197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a0 f107198g;

    @NotNull
    public final C2547f h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Sy0.a f107199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Uy0.d f107200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.studio.editor.moudle.editormain.usecase.musicmodule.a f107201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final f f107202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Xy0.a f107203m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Bgm f107204n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f107205o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f107206p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f107207q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final a f107208r;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/usecase/musicmodule/MusicModuleUseCase$a.class */
    public static final class a implements InterfaceC3194a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicModuleUseCase f107209a;

        public a(MusicModuleUseCase musicModuleUseCase) {
            this.f107209a = musicModuleUseCase;
        }

        @Override // aC0.InterfaceC3194a
        public final void D6() {
        }

        @Override // aC0.InterfaceC3194a
        public final void j8() {
        }

        @Override // aC0.InterfaceC3194a
        public final void l4(long j7) {
        }

        @Override // aC0.InterfaceC3194a
        public final void vd() {
        }

        @Override // aC0.InterfaceC3194a
        public final void w2(long j7) {
            this.f107209a.p(j7);
        }

        @Override // aC0.InterfaceC3194a
        public final void z4(long j7, long j8) {
            MusicModuleUseCase musicModuleUseCase = this.f107209a;
            musicModuleUseCase.p(musicModuleUseCase.f107195d.f());
        }
    }

    @Inject
    public MusicModuleUseCase(@NotNull ez0.c cVar, @NotNull o oVar, @NotNull ez0.a aVar, @NotNull n nVar, @NotNull j jVar, @NotNull Ex0.c cVar2, @NotNull a0 a0Var, @NotNull C2547f c2547f, @NotNull Sy0.a aVar2, @NotNull Uy0.d dVar, @NotNull com.bilibili.studio.editor.moudle.editormain.usecase.musicmodule.a aVar3, @NotNull f fVar, @NotNull Xy0.a aVar4, @NotNull C2459a c2459a) {
        this.f107192a = cVar;
        this.f107193b = oVar;
        this.f107194c = aVar;
        this.f107195d = nVar;
        this.f107196e = jVar;
        this.f107197f = cVar2;
        this.f107198g = a0Var;
        this.h = c2547f;
        this.f107199i = aVar2;
        this.f107200j = dVar;
        this.f107201k = aVar3;
        this.f107202l = fVar;
        this.f107203m = aVar4;
        ((ArrayList) c2459a.f13073a).add(this);
        this.f107208r = new a(this);
    }

    public static void l(MusicModuleUseCase musicModuleUseCase, String str, long j7, Bgm bgm, long j8, String str2) {
        UC0.a newBgmAudioTrack;
        musicModuleUseCase.f107204n = bgm;
        if (TextUtils.isEmpty(str)) {
            if (bgm != null) {
                MusicDownloadData musicDownloadData = new MusicDownloadData(bgm, j8, bgm.getStartTime(), null);
                musicDownloadData.setStartDownloadTime(System.currentTimeMillis());
                com.bilibili.studio.editor.moudle.music.manager.b.d().f107903a = musicModuleUseCase;
                com.bilibili.studio.editor.moudle.music.manager.b.d().c(musicDownloadData);
                return;
            }
            return;
        }
        i iVar = musicModuleUseCase.f107195d.f4833c;
        long jG = iVar != null ? iVar.g(str) : 0L;
        long jG2 = musicModuleUseCase.f107201k.f107210a.g();
        BMusic bMusicB = Az0.a.b(j7, jG, j8, jG2, str);
        if (str2 != null) {
            bMusicB.musicTypeName = str2;
        }
        EditVideoInfo editVideoInfo = musicModuleUseCase.f107197f.f4806b;
        if (editVideoInfo == null) {
            return;
        }
        musicModuleUseCase.n();
        StringBuilder sb = new StringBuilder("applyLocalMusic inPoint=");
        sb.append(j8);
        sb.append(",outPoint=");
        Os.f.b(sb, jG2, "MusicModuleUseCase");
        UpperTimeline upperTimelineB = musicModuleUseCase.f107201k.b();
        if (upperTimelineB == null || (newBgmAudioTrack = upperTimelineB.getNewBgmAudioTrack(bMusicB)) == null) {
            return;
        }
        musicModuleUseCase.m(bMusicB, newBgmAudioTrack, "MusicModuleUseCase.applyLocalMusic");
        if (com.bilibili.studio.editor.moudle.musicv3.logic.b.c()) {
            com.bilibili.studio.editor.moudle.musicv3.logic.b.a(bMusicB, editVideoInfo.getVideoDuration());
        } else {
            com.bilibili.studio.editor.moudle.musicv3.logic.a.a(bMusicB);
        }
        musicModuleUseCase.k(bMusicB);
        musicModuleUseCase.m(bMusicB, newBgmAudioTrack, "MusicModuleUseCase.applyLocalMusic2");
        editVideoInfo.setIsEdited(true);
        musicModuleUseCase.f107200j.h(bMusicB);
        musicModuleUseCase.f107197f.a();
        musicModuleUseCase.u(bMusicB);
    }

    public static boolean o(long j7, BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo) {
        long inPoint = biliEditorMaterialMultiInfo.getInPoint();
        boolean z6 = true;
        if (j7 <= biliEditorMaterialMultiInfo.getOutPoint()) {
            z6 = true;
            if (inPoint <= j7) {
                long inPoint2 = biliEditorMaterialMultiInfo.getInPoint();
                long outPoint = biliEditorMaterialMultiInfo.getOutPoint();
                z6 = true;
                if (j7 - inPoint2 >= UpperTimeline.MIN_CLIP_DURATION) {
                    z6 = outPoint - j7 < UpperTimeline.MIN_CLIP_DURATION;
                }
            }
        }
        return z6;
    }

    public static boolean q(BMusic bMusic, EditorMusicInfo editorMusicInfo) {
        int iIndexOf;
        if (bMusic == null) {
            return false;
        }
        if (Intrinsics.areEqual(bMusic, editorMusicInfo.themeMusic)) {
            editorMusicInfo.themeMusic = null;
            return true;
        }
        if (editorMusicInfo.bMusicList == null || !(!r0.isEmpty()) || (iIndexOf = editorMusicInfo.bMusicList.indexOf(bMusic)) == -1) {
            return false;
        }
        editorMusicInfo.bMusicList.remove(iIndexOf);
        return true;
    }

    @Override // com.bilibili.studio.editor.moudle.music.manager.b.InterfaceC1198b
    public final void a(@Nullable MusicDownloadData musicDownloadData) {
        UC0.a newBgmAudioTrack;
        if (this.f107205o && !this.f107194c.b().f3338a) {
            this.f107205o = false;
            return;
        }
        this.f107205o = false;
        this.f107198g.r();
        Bgm downloadBgmInfo = musicDownloadData != null ? musicDownloadData.getDownloadBgmInfo() : null;
        String localFilePath = musicDownloadData != null ? musicDownloadData.getLocalFilePath() : null;
        String fileName = musicDownloadData != null ? musicDownloadData.getFileName() : null;
        long inPoint = musicDownloadData != null ? musicDownloadData.getInPoint() : 0L;
        S9.b.a(G0.b.a("refresh bgm name=", downloadBgmInfo != null ? downloadBgmInfo.name : null, ",localFilePath=", localFilePath, ",fileName="), fileName, "MusicModuleUseCase");
        if (downloadBgmInfo == null || TextUtils.isEmpty(localFilePath) || TextUtils.isEmpty(fileName)) {
            BLog.e("MusicModuleUseCase", "refresh state bgm is error ");
            return;
        }
        if (Intrinsics.areEqual(downloadBgmInfo, this.f107204n)) {
            String strA = p.a(localFilePath, fileName);
            long jG = this.f107201k.f107210a.g();
            i iVar = this.f107195d.f4833c;
            long jG2 = iVar != null ? iVar.g(strA) : 0L;
            EditVideoInfo editVideoInfo = this.f107197f.f4806b;
            if (editVideoInfo != null) {
                n();
                BMusic bMusicC = Az0.a.c(strA, jG2, inPoint, jG, downloadBgmInfo);
                UpperTimeline upperTimelineB = this.f107201k.b();
                if (upperTimelineB != null && (newBgmAudioTrack = upperTimelineB.getNewBgmAudioTrack(bMusicC)) != null) {
                    if (com.bilibili.studio.editor.moudle.musicv3.logic.b.c()) {
                        com.bilibili.studio.editor.moudle.musicv3.logic.b.a(bMusicC, editVideoInfo.getVideoDuration());
                    } else {
                        com.bilibili.studio.editor.moudle.musicv3.logic.a.a(bMusicC);
                    }
                    k(bMusicC);
                    m(bMusicC, newBgmAudioTrack, "MusicModuleUseCase.applyMusicAfterMusicDownloadV2");
                    editVideoInfo.setIsEdited(true);
                    this.f107200j.h(bMusicC);
                    this.f107197f.a();
                    u(bMusicC);
                }
            }
            this.f107207q = 0L;
            n nVar = this.f107195d;
            nVar.getClass();
            BLog.d("StreamingRepository", "onAskVideoSeek");
            i iVar2 = nVar.f4833c;
            if (iVar2 != null) {
                iVar2.r(inPoint, 0L);
            }
            i iVar3 = this.f107195d.f4833c;
            if (iVar3 != null) {
                iVar3.a(this.f107197f.f4806b, BackUpTag.MUSIC_ADD);
            }
        } else {
            Bgm bgm = this.f107204n;
            String str = null;
            if (bgm != null) {
                str = bgm.name;
            }
            com.bilibili.adcommon.utils.i.a("currentSelectedBgm=", str, ",downloadBgmInfo=", downloadBgmInfo.name, "MusicModuleUseCase");
        }
        this.f107198g.r();
    }

    @Override // Ky0.l0
    public final boolean b(int i7) {
        return i7 == 18;
    }

    @Override // com.bilibili.studio.editor.moudle.music.manager.b.InterfaceC1198b
    public final void c(@Nullable MusicDownloadData musicDownloadData) {
        if (musicDownloadData == null) {
            return;
        }
        this.f107198g.r();
        BuildersKt.runBlocking$default((CoroutineContext) null, new MusicModuleUseCase$showDownloadBgmError$1(this, null), 1, (Object) null);
    }

    @Override // com.bilibili.studio.editor.moudle.music.manager.b.InterfaceC1198b
    public final void d(@Nullable MusicDownloadData musicDownloadData, int i7) {
        EditorMusicItem musicItem;
        if (musicDownloadData == null || (musicItem = musicDownloadData.getMusicItem()) == null) {
            return;
        }
        musicItem.downloadStatus = 3;
    }

    public final void i(@Nullable MusicDownloadData musicDownloadData) {
        Bgm downloadBgmInfo;
        M.b("name is ", (musicDownloadData == null || (downloadBgmInfo = musicDownloadData.getDownloadBgmInfo()) == null) ? null : downloadBgmInfo.name, "MusicModuleUseCase");
        if (musicDownloadData == null) {
            return;
        }
        com.bilibili.studio.editor.moudle.music.manager.b.d().f107903a = this;
        this.f107204n = musicDownloadData.getDownloadBgmInfo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        final a0 a0Var = this.f107198g;
        n nVar = a0Var.f13078e;
        if (nVar.f() > nVar.g() - TransitionInfo.DEFAULT_DURATION) {
            ToastHelper.showToastShort(BiliContext.application(), 2131842214);
        } else if (a0Var.f13079f.f4806b != null) {
            a0Var.f13078e.j();
            com.bilibili.studio.editor.moudle.home.presenter.j jVar = a0Var.h.f13178a;
            jVar.getClass();
            BLog.e("BiliEditorHomeDataLogic", "【编辑器-抽帧】取消音乐推荐(cancelMusicRec)～");
            e eVar = jVar.f107250b;
            iz0.i iVar = eVar.a;
            if (iVar != null) {
                ((iz0.a) iVar).a = BiliEditorTaskStatus.CANCELED;
                iVar.c.getClass();
                iVar.d.getClass();
                iVar.e.getClass();
                iVar.f.getClass();
            }
            iz0.i iVar2 = eVar.a;
            if (iVar2 != null) {
                iVar2.c();
            }
            eVar.a = null;
            ez0.a aVar = a0Var.f13074a;
            final int i7 = 0;
            Runnable runnable = new Runnable(a0Var, i7) { // from class: Ky0.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f13128a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f13129b;

                {
                    this.f13128a = i7;
                    this.f13129b = a0Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f13128a) {
                        case 0:
                            a0 a0Var2 = (a0) this.f13129b;
                            MiddleControlUseCase.m(a0Var2.f13081i, null, Boolean.FALSE, 1);
                            MiddleControlUseCase middleControlUseCase = a0Var2.f13081i;
                            middleControlUseCase.o(false);
                            middleControlUseCase.j(false);
                            break;
                        case 1:
                            ((tv.danmaku.bili.ui.main2.basic.story.l) this.f13129b).dismiss();
                            break;
                        default:
                            ((wi1.c) this.f13129b).l();
                            break;
                    }
                }
            };
            Dy0.p pVar = (Dy0.p) aVar.f.getValue();
            Dy0.p pVar2 = pVar;
            if (pVar == null) {
                pVar2 = new Dy0.p(false, null, FragmentContainerModal.MODAL_ALL);
            }
            aVar.f.setValue(new Dy0.p(true, runnable, pVar2.f3337c));
            a0Var.o();
        }
        i iVar3 = this.f107201k.f107210a.f4833c;
        this.f107207q = iVar3 != null ? iVar3.j() : 0L;
    }

    public final int k(@NotNull BMusic bMusic) {
        EditorMusicInfo editorMusicInfo;
        EditVideoInfo editVideoInfo = this.f107197f.f4806b;
        if (editVideoInfo == null || (editorMusicInfo = editVideoInfo.getEditorMusicInfo()) == null) {
            return -1;
        }
        if (editorMusicInfo.themeMusic != null) {
            editorMusicInfo.themeMusic = bMusic;
            return 0;
        }
        editorMusicInfo.bMusicList.add(bMusic);
        return editorMusicInfo.bMusicList.size() - 1;
    }

    public final void m(BMusic bMusic, UC0.a aVar, String str) {
        UpperTimeline upperTimelineB = this.f107201k.b();
        if (upperTimelineB != null) {
            upperTimelineB.buildBgmAudioV2(bMusic, aVar, str.concat("->buildFxV2"));
        }
    }

    public final void n() {
        EditorMusicInfo editorMusicInfo;
        BMusic bMusic;
        EditVideoInfo editVideoInfo = this.f107197f.f4806b;
        if (editVideoInfo == null || (editorMusicInfo = editVideoInfo.getEditorMusicInfo()) == null || (bMusic = editorMusicInfo.selectMusic) == null) {
            return;
        }
        q(bMusic, editorMusicInfo);
        UpperTimeline upperTimelineB = this.f107201k.b();
        UC0.a audioTrackByMusic = upperTimelineB != null ? upperTimelineB.getAudioTrackByMusic(editorMusicInfo.selectMusic) : null;
        if (audioTrackByMusic != null) {
            audioTrackByMusic.y();
            UpperTimeline upperTimelineB2 = this.f107201k.b();
            if (upperTimelineB2 != null) {
                upperTimelineB2.removeAudioTrack(audioTrackByMusic);
            }
        }
        this.f107197f.a();
        editorMusicInfo.selectMusic = null;
    }

    @Override // Ky0.l0
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            BLog.e("MusicModuleUseCase", "data or extras is null");
            return;
        }
        final String string = extras.getString("key_bgm_path");
        final String string2 = extras.getString("key_bgm_category");
        long j7 = extras.getLong("key_bgm_start_time", 0L);
        long j8 = 1000;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (!TextUtils.isEmpty(string)) {
            Application application = BiliContext.application();
            r rVarU = a.a.a.a != null ? r.u() : null;
            R50.a aVarS = rVarU != null ? rVarU.s(string) : null;
            if (aVarS != null) {
                AVFileInfo aVFileInfo = aVarS.a;
                if (aVFileInfo.getAudioStreamDuration(0) > 0) {
                    if (aVFileInfo.getAudioStreamDuration(0) < TransitionInfo.DEFAULT_DURATION) {
                        ToastHelper.showToastShort(application, 2131842001);
                        return;
                    }
                    booleanRef.element = true;
                }
            }
            ToastHelper.showToastShort(application, 2131841946);
            return;
        }
        final Bgm bgm = (Bgm) com.bilibili.studio.videoeditor.common.intent.b.f109430a.a("key_bgm_instance");
        String str = null;
        if (bgm != null) {
            str = bgm.category;
        }
        if (str == null && bgm != null) {
            bgm.category = string2;
        }
        if (bgm != null) {
            bgm.setStartTime(bgm.getStartTime() * 1000);
        }
        if (bgm != null) {
            bgm.formMusicLibrary = true;
        }
        com.bilibili.studio.editor.moudle.musicv3.logic.a.b(bgm);
        final long j9 = j8 * j7;
        this.f107198g.q(new Runnable(booleanRef, this, string, j9, bgm, string2) { // from class: com.bilibili.studio.editor.moudle.editormain.usecase.musicmodule.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Ref.BooleanRef f107213a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final MusicModuleUseCase f107214b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f107215c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final long f107216d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Bgm f107217e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final String f107218f;

            {
                this.f107213a = booleanRef;
                this.f107214b = this;
                this.f107215c = string;
                this.f107216d = j9;
                this.f107217e = bgm;
                this.f107218f = string2;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x005e  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r9 = this;
                    r0 = r9
                    kotlin.jvm.internal.Ref$BooleanRef r0 = r0.f107213a
                    r12 = r0
                    r0 = r9
                    com.bilibili.studio.editor.moudle.editormain.usecase.musicmodule.MusicModuleUseCase r0 = r0.f107214b
                    r18 = r0
                    r0 = r9
                    java.lang.String r0 = r0.f107215c
                    r17 = r0
                    r0 = r9
                    long r0 = r0.f107216d
                    r10 = r0
                    r0 = r9
                    com.bilibili.studio.videoeditor.bgm.Bgm r0 = r0.f107217e
                    r16 = r0
                    r0 = r9
                    java.lang.String r0 = r0.f107218f
                    r15 = r0
                    r0 = r12
                    boolean r0 = r0.element
                    if (r0 == 0) goto L3d
                    r0 = r18
                    r1 = r17
                    r2 = r10
                    r3 = r16
                    r4 = r18
                    long r4 = r4.f107207q
                    r5 = r15
                    com.bilibili.studio.editor.moudle.editormain.usecase.musicmodule.MusicModuleUseCase.l(r0, r1, r2, r3, r4, r5)
                    goto Lc3
                L3d:
                    r0 = r18
                    Ky0.a0 r0 = r0.f107198g
                    r14 = r0
                    r0 = r16
                    if (r0 == 0) goto L5e
                    r0 = r16
                    java.lang.String r0 = r0.name
                    r13 = r0
                    r0 = r13
                    r12 = r0
                    r0 = r13
                    if (r0 != 0) goto L5b
                    goto L5e
                L5b:
                    goto L7a
                L5e:
                    android.app.Activity r0 = com.bilibili.base.BiliContext.topActivity()
                    r12 = r0
                    r0 = r12
                    boolean r0 = com.bilibili.studio.videoeditor.extension.ActivityExtKt.isActive(r0)
                    if (r0 == 0) goto L6c
                    goto L70
                L6c:
                    android.app.Application r0 = com.bilibili.lib.foundation.FoundationAlias.getFapp()
                    r12 = r0
                L70:
                    r0 = r12
                    r1 = 2131842269(0x7f1154dd, float:1.931787E38)
                    java.lang.String r0 = r0.getString(r1)
                    r12 = r0
                    goto L5b
                L7a:
                    com.bilibili.studio.editor.moudle.editormain.usecase.musicmodule.d r0 = new com.bilibili.studio.editor.moudle.editormain.usecase.musicmodule.d
                    r1 = r0
                    r2 = r18
                    r3 = r17
                    r4 = r10
                    r5 = r16
                    r6 = r15
                    r1.<init>(r2, r3, r4, r5, r6)
                    r13 = r0
                    r0 = r14
                    java.lang.Class r0 = r0.getClass()
                    Ky0.I r0 = new Ky0.I
                    r1 = r0
                    r2 = r14
                    r3 = r13
                    r1.<init>(r2, r3)
                    r15 = r0
                    r0 = r14
                    ez0.a r0 = r0.f13074a
                    r13 = r0
                    r0 = r13
                    Dy0.q r0 = r0.b()
                    r1 = 1
                    r2 = r12
                    r3 = r15
                    r4 = 8
                    Dy0.q r0 = Dy0.q.a(r0, r1, r2, r3, r4)
                    r12 = r0
                    r0 = r13
                    androidx.lifecycle.MutableLiveData r0 = r0.x
                    r1 = r12
                    r0.setValue(r1)
                    r0 = r14
                    r0.o()
                Lc3:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.usecase.musicmodule.b.run():void");
            }
        });
    }

    public final void p(long j7) {
        BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfoK = this.f107199i.k();
        if (biliEditorMaterialMultiInfoK != null && biliEditorMaterialMultiInfoK.isMusicMaterial()) {
            s(o(j7, biliEditorMaterialMultiInfoK));
        }
    }

    public final void r(boolean z6, @Nullable BMusic bMusic, boolean z7, boolean z8) {
        Xy0.a aVar = this.f107203m;
        if (!z6) {
            aVar.l(bMusic, z7, z8, Boolean.TRUE);
            return;
        }
        com.bilibili.bililive.room.ui.input.view.e eVar = new com.bilibili.bililive.room.ui.input.view.e(this, 1);
        Sy0.a.H(this.f107199i, EditorTrackLocationMode.LOCATION_TOP, BiliEditorTrackMode.TRACK_MODE_EASY_EDIT, eVar, false, 8);
        List<Integer> list = Gx0.c.f7445a;
        Sy0.a aVar2 = this.f107199i;
        aVar2.I(list);
        h hVar = aVar2.f23144i;
        if (hVar != null) {
            hVar.invoke();
        }
        aVar.l(bMusic, z7, z8, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(boolean r8) {
        /*
            r7 = this;
            r0 = r7
            Ex0.o r0 = r0.f107193b
            r12 = r0
            r0 = r7
            Ex0.c r0 = r0.f107197f
            com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r0 = r0.f4806b
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L20
            r0 = r10
            java.lang.String r0 = r0.getCaller()
            r11 = r0
            r0 = r11
            r10 = r0
            r0 = r11
            if (r0 != 0) goto L24
        L20:
            java.lang.String r0 = ""
            r10 = r0
        L24:
            r0 = r12
            r1 = r10
            com.bilibili.studio.editor.moudle.editormain.ui.toolbar.beans.EditorToolBar r0 = r0.c(r1)
            r10 = r0
            r0 = r8
            if (r0 == 0) goto L39
            r0 = r10
            r1 = 704(0x2c0, float:9.87E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.addDisableItem(r1)
        L39:
            r0 = r7
            com.bilibili.studio.editor.moudle.editormain.usecase.musicmodule.a r0 = r0.f107201k
            com.bilibili.studio.videoeditor.bean.BMusic r0 = r0.a()
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L81
            r0 = r11
            int r0 = r0.loopState
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L81
            r0 = r9
            r1 = 2
            if (r0 != r1) goto L6d
            r0 = r10
            com.bilibili.studio.editor.moudle.editormain.ui.toolbar.beans.EditorToolBarItem r1 = new com.bilibili.studio.editor.moudle.editormain.ui.toolbar.beans.EditorToolBarItem
            r2 = r1
            r3 = 710(0x2c6, float:9.95E-43)
            r4 = 2131841797(0x7f115305, float:1.9316912E38)
            r5 = 2131243874(0x7f083362, float:1.810418E38)
            r2.<init>(r3, r4, r5)
            r0.addChildItem(r1)
            goto L81
        L6d:
            r0 = r10
            com.bilibili.studio.editor.moudle.editormain.ui.toolbar.beans.EditorToolBarItem r1 = new com.bilibili.studio.editor.moudle.editormain.ui.toolbar.beans.EditorToolBarItem
            r2 = r1
            r3 = 709(0x2c5, float:9.94E-43)
            r4 = 2131842427(0x7f11557b, float:1.931819E38)
            r5 = 2131243877(0x7f083365, float:1.8104186E38)
            r2.<init>(r3, r4, r5)
            r0.addChildItem(r1)
        L81:
            r0 = r7
            com.bilibili.studio.editor.moudle.editormain.usecase.musicmodule.MusicModuleUseCase$a r0 = r0.f107208r
            r11 = r0
            r0 = r7
            Ex0.j r0 = r0.f107196e
            r1 = r11
            java.lang.String r2 = "MusicModuleUseCase"
            r0.a(r1, r2)
            r0 = r7
            ez0.c r0 = r0.f107192a
            r1 = r10
            r0.q(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.usecase.musicmodule.MusicModuleUseCase.s(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(boolean r23) {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.usecase.musicmodule.MusicModuleUseCase.t(boolean):void");
    }

    public final void u(BMusic bMusic) {
        if (bMusic != null) {
            s(true);
            r(true, bMusic, true, true);
        } else {
            this.f107192a.l(new com.bilibili.bplus.followinglist.page.search.c(this, 1));
        }
    }

    public final void v(BMusic bMusic, BMusic bMusic2, boolean z6, BackUpTag backUpTag, String str) {
        UC0.a audioTrackByMusic;
        UpperTimeline upperTimelineB;
        UC0.a newBgmAudioTrack;
        EditVideoInfo editVideoInfo;
        UpperTimeline upperTimelineB2 = this.f107201k.b();
        if (upperTimelineB2 == null || (audioTrackByMusic = upperTimelineB2.getAudioTrackByMusic(bMusic)) == null || (upperTimelineB = this.f107201k.b()) == null || (newBgmAudioTrack = upperTimelineB.getNewBgmAudioTrack(bMusic2)) == null || (editVideoInfo = this.f107197f.f4806b) == null) {
            return;
        }
        ArrayList<BMusic> arrayList = editVideoInfo.getEditorMusicInfo().bMusicList;
        if (arrayList != null) {
            arrayList.add(bMusic2);
        }
        this.f107200j.h(bMusic2);
        this.f107200j.c(true);
        this.f107197f.a();
        UpperTimeline upperTimelineB3 = this.f107201k.b();
        if (upperTimelineB3 != null) {
            upperTimelineB3.buildBgmAudioV2(bMusic2, newBgmAudioTrack, str.concat("->syncMusicListToProject"));
        }
        float fS = audioTrackByMusic.s();
        newBgmAudioTrack.B(fS, fS);
        i iVar = this.f107195d.f4833c;
        if (iVar != null) {
            iVar.a(this.f107197f.f4806b, backUpTag);
        }
        r(false, bMusic2, true, z6);
        Mx0.a aVar = Mx0.a.f16457j;
        this.f107199i.w(a.C0086a.e(bMusic2.inPoint), Long.valueOf(bMusic2.inPoint + ((long) 50000)));
    }

    public final void w(BMusic bMusic) {
        EditVideoInfo editVideoInfo = this.f107197f.f4806b;
        if (editVideoInfo == null) {
            return;
        }
        Pair pairD = Sy0.b.d(editVideoInfo, bMusic);
        ArrayList arrayList = (ArrayList) pairD.component1();
        this.f107199i.D(Boolean.TRUE, BiliEditorMaterialType.TYPE_MUSIC, (BiliEditorMaterialMultiInfo) pairD.component2(), MainPanelMaterialTrackType.TRACK_MUSIC_FOLD, arrayList, MainPanelMaterialFoldTrackUiState.UpdateMode.ALL, new MusicModuleUseCase$updateMaterialFoldTrack$1(this));
    }
}
