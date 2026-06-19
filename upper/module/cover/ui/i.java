package com.bilibili.upper.module.cover.ui;

import LH0.a;
import android.text.TextUtils;
import com.bilibili.studio.editor.timeline.UpperEngineScene;
import com.bilibili.studio.videoeditor.exception.FileNotExistedError;
import com.bilibili.studio.videoeditor.mediav3.base.ConfigV3;
import com.bilibili.upper.module.cover_v2.draft.MultiCoverDraft;
import com.bilibili.upper.module.cover_v2.model.MultiCoverConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/ui/i.class */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpperCoverEditorActivity f112766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MultiCoverDraft f112767b;

    public /* synthetic */ i(UpperCoverEditorActivity upperCoverEditorActivity, MultiCoverDraft multiCoverDraft) {
        this.f112766a = upperCoverEditorActivity;
        this.f112767b = multiCoverDraft;
    }

    public final Object invoke() {
        int i7 = UpperCoverEditorActivity.f112688Y;
        String strA = ConfigV3.a();
        boolean zIsEmpty = TextUtils.isEmpty(strA);
        UpperCoverEditorActivity upperCoverEditorActivity = this.f112766a;
        if (zIsEmpty || !cn.com.chinatelecom.account.api.d.m.b(strA)) {
            BLog.e("UpperCoverActivity", "android_aurora_resources font is not exists");
            upperCoverEditorActivity.f112699K = false;
            throw new FileNotExistedError("android_aurora_resources sdk mod path is empty");
        }
        boolean z6 = upperCoverEditorActivity.f112706R;
        MultiCoverDraft multiCoverDraft = this.f112767b;
        MultiCoverConfig config = multiCoverDraft.getConfig();
        try {
            KH0.i iVar = new KH0.i(upperCoverEditorActivity, z6 ? UpperEngineScene.PUBLISH_MULTI_COVER_CROP_MAIN : UpperEngineScene.PUBLISH_MULTI_COVER_CROP_SUB, config, a.C0078a.a(config), multiCoverDraft);
            iVar.g();
            upperCoverEditorActivity.f112700L = iVar;
            return Unit.INSTANCE;
        } catch (Throwable th) {
            BLog.e("MultiVideoEngine", "create error", th);
            throw th;
        }
    }
}
