package com.bilibili.music.podcast;

import Ky0.k0;
import android.app.Application;
import bz0.j;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import fC0.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/c.class */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseAppCompatActivity f66374b;

    public /* synthetic */ c(int i7, BaseAppCompatActivity baseAppCompatActivity) {
        this.f66373a = i7;
        this.f66374b = baseAppCompatActivity;
    }

    public final Object invoke() {
        int statusBarHeight = 0;
        switch (this.f66373a) {
            case 0:
                int i7 = MusicPodcastMainActivity.f66358F;
                MusicPodcastMainActivity musicPodcastMainActivity = (MusicPodcastMainActivity) this.f66374b;
                if (musicPodcastMainActivity != null) {
                    statusBarHeight = StatusBarCompat.getStatusBarHeight(musicPodcastMainActivity);
                }
                return Integer.valueOf(statusBarHeight);
            default:
                BiliEditorMainActivity biliEditorMainActivity = (BiliEditorMainActivity) this.f66374b;
                int i8 = BiliEditorMainActivity.f106268Y;
                dz0.c cVar = ((Yv0.b) biliEditorMainActivity).B;
                if (cVar != null) {
                    j jVar = cVar.e.h;
                    EditVideoInfo editVideoInfo = cVar.d.b.f4806b;
                    EditVideoInfo editVideoInfo2 = cVar.d.b.f4808d;
                    jVar.getClass();
                    boolean z6 = false;
                    if (zw0.b.i()) {
                        z6 = false;
                        if (zw0.b.d()) {
                            z6 = true;
                        }
                    }
                    k0 k0Var = jVar.f57218g;
                    if (editVideoInfo == null || !editVideoInfo.isFromDraft()) {
                        if (z6) {
                            k0Var.i(jVar.f57223m, "1");
                        }
                        int i9 = BiliEditorMainActivity.f106268Y;
                        biliEditorMainActivity.a7();
                        Unit unit = Unit.INSTANCE;
                    } else {
                        if (z6) {
                            k0Var.i(jVar.f57223m, "3");
                        }
                        if (editVideoInfo2 == null) {
                            int i10 = BiliEditorMainActivity.f106268Y;
                            biliEditorMainActivity.a7();
                            Unit unit2 = Unit.INSTANCE;
                        } else {
                            BLog.e("TopBtnUseCase", "on cancel Auto Draft clicked");
                            editVideoInfo2.setDraftId(-2233L);
                            Application application = BiliContext.application();
                            if (application != null) {
                                e.a(application, editVideoInfo2);
                            }
                            int i11 = BiliEditorMainActivity.f106268Y;
                            biliEditorMainActivity.a7();
                            Unit unit3 = Unit.INSTANCE;
                        }
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
