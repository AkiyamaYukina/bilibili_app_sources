package com.bilibili.studio.editor.moudle.musicv3.logic;

import AL.i;
import Ez0.e;
import G.p;
import UC0.n;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bilibili.studio.editor.moudle.music.manager.MusicDownloadData;
import com.bilibili.studio.editor.moudle.music.manager.b;
import com.bilibili.studio.editor.moudle.music.model.EditorMusicItem;
import com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListContentFragment;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.picker.bean.AudioItem;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/logic/c.class */
public final class c extends BiliEditorMusicBaseLogicV2 implements b.InterfaceC1198b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public e f107942j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public i f107943k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public String f107944l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public BiliEditorMusicListContentFragment f107945m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Bgm f107946n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(com.bilibili.studio.editor.moudle.musicv3.logic.c r10, java.lang.String r11, long r12, com.bilibili.studio.videoeditor.bgm.Bgm r14, long r15, com.bilibili.studio.videoeditor.bean.BMusic r17, com.bilibili.studio.editor.moudle.music.model.EditorMusicItem r18, boolean r19, boolean r20, java.lang.String r21, int r22) {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.musicv3.logic.c.k(com.bilibili.studio.editor.moudle.musicv3.logic.c, java.lang.String, long, com.bilibili.studio.videoeditor.bgm.Bgm, long, com.bilibili.studio.videoeditor.bean.BMusic, com.bilibili.studio.editor.moudle.music.model.EditorMusicItem, boolean, boolean, java.lang.String, int):void");
    }

    @Override // com.bilibili.studio.editor.moudle.music.manager.b.InterfaceC1198b
    public final void a(@Nullable MusicDownloadData musicDownloadData) {
        Bgm downloadBgmInfo = musicDownloadData != null ? musicDownloadData.getDownloadBgmInfo() : null;
        String localFilePath = musicDownloadData != null ? musicDownloadData.getLocalFilePath() : null;
        String fileName = musicDownloadData != null ? musicDownloadData.getFileName() : null;
        EditorMusicItem musicItem = musicDownloadData != null ? musicDownloadData.getMusicItem() : null;
        long inPoint = musicDownloadData != null ? musicDownloadData.getInPoint() : 0L;
        S9.b.a(G0.b.a("refresh bgm name=", downloadBgmInfo != null ? downloadBgmInfo.name : null, ",localFilePath=", localFilePath, ",fileName="), fileName, "BiliEditorMusicListLogic");
        if (downloadBgmInfo == null || TextUtils.isEmpty(localFilePath) || TextUtils.isEmpty(fileName)) {
            BLog.e("BiliEditorMusicListLogic", "refresh state bgm is error ");
            return;
        }
        if (musicItem != null) {
            musicItem.downloadStatus = 5;
        }
        BiliEditorMusicListContentFragment biliEditorMusicListContentFragment = this.f107945m;
        int i7 = 0;
        if (biliEditorMusicListContentFragment != null) {
            e eVar = this.f107942j;
            biliEditorMusicListContentFragment.Bf(eVar != null && eVar.h);
        }
        if (!Intrinsics.areEqual(downloadBgmInfo, this.f107946n)) {
            Bgm bgm = this.f107946n;
            String str = null;
            if (bgm != null) {
                str = bgm.name;
            }
            com.bilibili.adcommon.utils.i.a("currentSelectedBgm=", str, ",downloadBgmInfo=", downloadBgmInfo.name, "BiliEditorMusicListLogic");
            return;
        }
        e(inPoint, p.a(localFilePath, fileName), downloadBgmInfo);
        this.f107933e.postValue(Boolean.FALSE);
        e eVar2 = this.f107942j;
        if (eVar2 != null && eVar2.h) {
            eVar2.h = false;
            return;
        }
        if (musicDownloadData.getStartDownloadTime() != 0) {
            Lazy<n> lazy = n.f24629b;
            n.a.a().getClass();
            EditorMusicItem musicItem2 = musicDownloadData.getMusicItem();
            if (musicItem2 == null) {
                return;
            }
            long j7 = downloadBgmInfo.sid;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long startDownloadTime = musicDownloadData.getStartDownloadTime();
            Xz0.d dVar = Xz0.d.f28458a;
            if (musicItem2.aiRecType != 0) {
                i7 = 1;
            }
            dVar.getClass();
            Xz0.d.B(i7, jCurrentTimeMillis - startDownloadTime, String.valueOf(j7), "播放");
        }
    }

    @Override // com.bilibili.studio.editor.moudle.music.manager.b.InterfaceC1198b
    public final void c(@Nullable MusicDownloadData musicDownloadData) {
        EditorMusicItem musicItem = musicDownloadData != null ? musicDownloadData.getMusicItem() : null;
        if (musicItem != null) {
            musicItem.downloadStatus = 6;
        }
        Hz0.a aVar = this.f107932d;
        if (aVar != null) {
            aVar.ld(true);
        }
    }

    @Override // com.bilibili.studio.editor.moudle.music.manager.b.InterfaceC1198b
    public final void d(@Nullable MusicDownloadData musicDownloadData, int i7) {
    }

    public final void l(boolean z6, EditorMusicItem editorMusicItem, int i7) {
        AudioItem audioItem;
        BMusic bMusicB;
        String str;
        e eVar;
        if ((editorMusicItem == null || editorMusicItem.downloadStatus != 5) && ((editorMusicItem == null || !editorMusicItem.isEdit) && !z6 && editorMusicItem != null)) {
            editorMusicItem.downloadStatus = 3;
        }
        if (editorMusicItem != null && (str = editorMusicItem.flag) != null && (eVar = this.f107942j) != null) {
            eVar.e(str);
        }
        Hz0.a aVar = this.f107932d;
        if (editorMusicItem == null || !editorMusicItem.isEdit) {
            String str2 = (editorMusicItem == null || (audioItem = editorMusicItem.audioItem) == null) ? null : audioItem.path;
            if (!TextUtils.isEmpty(str2)) {
                if (!BiliEditorMusicBaseLogicV2.h(aVar != null ? aVar.V6() : null, str2)) {
                    editorMusicItem.isSelect = false;
                    if (aVar != null) {
                        aVar.ld(false);
                        return;
                    }
                    return;
                }
            }
            Bgm bgm = editorMusicItem != null ? editorMusicItem.editBgm : null;
            BiliEditorMusicListContentFragment biliEditorMusicListContentFragment = aVar instanceof BiliEditorMusicListContentFragment ? (BiliEditorMusicListContentFragment) aVar : null;
            k(this, str2, 0L, bgm, this.h, biliEditorMusicListContentFragment != null ? biliEditorMusicListContentFragment.wf() : null, editorMusicItem, false, z6, null, 512);
            return;
        }
        List<BMusic> list = editorMusicItem.bindMusic;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f107946n = editorMusicItem.editBgm;
        i();
        List<BMusic> array = JSON.parseArray(JSON.toJSONString(editorMusicItem.bindMusic), BMusic.class);
        if (array != null) {
            for (BMusic bMusic : array) {
                int iF = -1;
                EditVideoInfo editVideoInfo = this.f107929a;
                if (editVideoInfo != null) {
                    EditVideoClip userVideoTrack = editVideoInfo.getUserVideoTrack();
                    long currVideoDuration = userVideoTrack != null ? userVideoTrack.getCurrVideoDuration() : 0L;
                    long j7 = bMusic.inPoint;
                    if (currVideoDuration > j7) {
                        if (currVideoDuration < bMusic.outPoint) {
                            bMusic.outPoint = currVideoDuration;
                            bMusic.trimOut = currVideoDuration;
                        }
                        long j8 = bMusic.trimIn;
                        if (j8 >= bMusic.trimOut) {
                            bMusic.trimOut = (j8 + bMusic.outPoint) - j7;
                        }
                        iF = f(bMusic);
                    }
                }
                if (iF >= 0 && (bMusicB = this.f107930b.b(iF)) != null && aVar != null) {
                    aVar.Tb(bMusicB);
                }
            }
        }
        g();
        if (aVar != null) {
            aVar.s6();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m() {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r7 = r0
            r0 = r5
            java.lang.String r1 = ""
            r0.f107944l = r1
            r0 = r5
            com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r0 = r0.f107929a
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L76
            r0 = r8
            com.bilibili.studio.videoeditor.editor.editdata.EditVideoIntelligenceInfo r0 = r0.getIntelligenceInfo()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L63
            r0 = r6
            java.util.List<java.lang.String> r0 = r0.recMusicIds
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L5d
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        L2f:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L56
            r0 = r9
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
            r0 = r5
            r1 = r5
            java.lang.String r1 = r1.f107944l
            java.lang.String r2 = ","
            r3 = r6
            java.lang.String r1 = B0.a.a(r1, r2, r3)
            r0.f107944l = r1
            goto L2f
        L56:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r6 = r0
            goto L5f
        L5d:
            r0 = 0
            r6 = r0
        L5f:
            r0 = r6
            if (r0 != 0) goto L76
        L63:
            r0 = r8
            java.lang.String r0 = r0.getRecMusicSids()
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L71
            r0 = r7
            r6 = r0
            goto L71
        L71:
            r0 = r5
            r1 = r6
            r0.f107944l = r1
        L76:
            java.lang.String r0 = Jz0.f.f11746a
            r6 = r0
            java.lang.String r0 = Jz0.f.f11750e
            int r0 = r0.length()
            if (r0 != 0) goto L8c
            r0 = r5
            java.lang.String r0 = r0.f107944l
            Jz0.f.f11750e = r0
        L8c:
            r0 = r5
            java.lang.String r0 = r0.f107944l
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.musicv3.logic.c.m():java.lang.String");
    }
}
