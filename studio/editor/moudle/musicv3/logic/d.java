package com.bilibili.studio.editor.moudle.musicv3.logic;

import Ez0.e;
import G.p;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.adcommon.utils.i;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.moudle.music.manager.MusicDownloadData;
import com.bilibili.studio.editor.moudle.music.manager.b;
import com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicFragmentV3;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.widgets.EditCircleProgressBar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/logic/d.class */
public final class d extends BiliEditorMusicBaseLogicV2 implements b.InterfaceC1198b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Bgm f107947j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public EditorMusicInfo f107948k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public e f107949l;

    @Override // com.bilibili.studio.editor.moudle.music.manager.b.InterfaceC1198b
    public final void a(@Nullable MusicDownloadData musicDownloadData) {
        Bgm downloadBgmInfo = musicDownloadData != null ? musicDownloadData.getDownloadBgmInfo() : null;
        String localFilePath = musicDownloadData != null ? musicDownloadData.getLocalFilePath() : null;
        String fileName = musicDownloadData != null ? musicDownloadData.getFileName() : null;
        long inPoint = musicDownloadData != null ? musicDownloadData.getInPoint() : 0L;
        S9.b.a(G0.b.a("refresh bgm name=", downloadBgmInfo != null ? downloadBgmInfo.name : null, ",localFilePath=", localFilePath, ",fileName="), fileName, "BiliEditorMusicMainLogicV3");
        if (downloadBgmInfo == null || TextUtils.isEmpty(localFilePath) || TextUtils.isEmpty(fileName)) {
            BLog.e("BiliEditorMusicMainLogicV3", "refresh state bgm is error ");
            return;
        }
        if (Intrinsics.areEqual(downloadBgmInfo, this.f107947j)) {
            e(inPoint, p.a(localFilePath, fileName), downloadBgmInfo);
            MutableLiveData<Boolean> mutableLiveData = this.f107933e;
            if (mutableLiveData != null) {
                mutableLiveData.postValue(Boolean.TRUE);
                return;
            }
            return;
        }
        Bgm bgm = this.f107947j;
        String str = null;
        if (bgm != null) {
            str = bgm.name;
        }
        i.a("currentSelectedBgm=", str, ",downloadBgmInfo=", downloadBgmInfo.name, "BiliEditorMusicMainLogicV3");
    }

    @Override // com.bilibili.studio.editor.moudle.music.manager.b.InterfaceC1198b
    public final void c(@Nullable MusicDownloadData musicDownloadData) {
        TextView textView;
        Hz0.a aVar = this.f107932d;
        BiliEditorMusicFragmentV3 biliEditorMusicFragmentV3 = aVar instanceof BiliEditorMusicFragmentV3 ? (BiliEditorMusicFragmentV3) aVar : null;
        if (biliEditorMusicFragmentV3 == null || (textView = biliEditorMusicFragmentV3.f107968t.f13215t) == null) {
            return;
        }
        textView.setText(2131842254);
    }

    @Override // com.bilibili.studio.editor.moudle.music.manager.b.InterfaceC1198b
    public final void d(@Nullable MusicDownloadData musicDownloadData, int i7) {
        Hz0.a aVar = this.f107932d;
        BiliEditorMusicFragmentV3 biliEditorMusicFragmentV3 = aVar instanceof BiliEditorMusicFragmentV3 ? (BiliEditorMusicFragmentV3) aVar : null;
        if (biliEditorMusicFragmentV3 != null) {
            Kz0.b bVar = biliEditorMusicFragmentV3.f107968t;
            EditCircleProgressBar editCircleProgressBar = bVar.f13214s;
            if (editCircleProgressBar != null) {
                editCircleProgressBar.setProgress(i7);
            }
            TextView textView = bVar.f13215t;
            if (textView != null) {
                textView.setText(2131842045);
            }
        }
    }
}
