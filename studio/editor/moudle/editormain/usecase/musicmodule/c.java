package com.bilibili.studio.editor.moudle.editormain.usecase.musicmodule;

import Dy0.q;
import Ky0.I;
import Ky0.a0;
import Pb.E;
import com.bilibili.studio.editor.moudle.music.manager.MusicDownloadData;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.editor.timeline.i;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/usecase/musicmodule/c.class */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f107219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MusicDownloadData f107220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MusicModuleUseCase f107221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BMusic f107222d;

    public /* synthetic */ c(boolean z6, MusicDownloadData musicDownloadData, MusicModuleUseCase musicModuleUseCase, BMusic bMusic) {
        this.f107219a = z6;
        this.f107220b = musicDownloadData;
        this.f107221c = musicModuleUseCase;
        this.f107222d = bMusic;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bgm bgm;
        Bgm downloadBgmInfo;
        boolean z6 = this.f107219a;
        MusicDownloadData musicDownloadData = this.f107220b;
        MusicModuleUseCase musicModuleUseCase = this.f107221c;
        BMusic bMusic = this.f107222d;
        if (z6) {
            return;
        }
        E.a("is remove 88, name is ", (musicDownloadData == null || (downloadBgmInfo = musicDownloadData.getDownloadBgmInfo()) == null) ? null : downloadBgmInfo.name, ",remove music", "removeMusicList");
        if (musicDownloadData == null) {
            if (bMusic != null) {
                musicModuleUseCase.f107200j.h(bMusic);
                i iVar = musicModuleUseCase.f107195d.f4833c;
                if (iVar != null) {
                    iVar.a(musicModuleUseCase.f107197f.f4806b, BackUpTag.MUSIC_ADD);
                }
            }
            musicModuleUseCase.f107199i.s();
            musicModuleUseCase.u(bMusic);
            return;
        }
        musicModuleUseCase.getClass();
        if (com.bilibili.studio.editor.moudle.music.manager.b.d().f107904b == null || (bgm = musicModuleUseCase.f107204n) == null) {
            return;
        }
        MusicDownloadData musicDownloadData2 = com.bilibili.studio.editor.moudle.music.manager.b.d().f107904b;
        if (Intrinsics.areEqual(bgm, musicDownloadData2 != null ? musicDownloadData2.getDownloadBgmInfo() : null)) {
            Bgm downloadBgmInfo2 = musicDownloadData.getDownloadBgmInfo();
            musicModuleUseCase.f107205o = true;
            String str = downloadBgmInfo2.name;
            String str2 = str;
            if (str == null) {
                str2 = " 下载中";
            }
            a0 a0Var = musicModuleUseCase.f107198g;
            a0Var.getClass();
            I i7 = new I(a0Var, null);
            ez0.a aVar = a0Var.f13074a;
            aVar.x.setValue(q.a(aVar.b(), true, str2, i7, 8));
            a0Var.o();
        }
    }
}
