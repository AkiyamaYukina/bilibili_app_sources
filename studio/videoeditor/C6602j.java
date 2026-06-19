package com.bilibili.studio.videoeditor;

import androidx.compose.ui.graphics.O;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.mod.ModErrorInfo;
import com.bilibili.lib.mod.ModProgress;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.lib.mod.ModResourceClient;
import com.bilibili.lib.mod.request.ModUpdateRequest;
import com.bilibili.studio.videoeditor.BiliSenseMeModManager;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.StringsKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/j.class */
public final class C6602j implements ModResourceClient.OnUpdateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliSenseMeModManager f109769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f109771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f109772d;

    public C6602j(BiliSenseMeModManager biliSenseMeModManager, String str, String str2, s sVar) {
        this.f109769a = biliSenseMeModManager;
        this.f109770b = str;
        this.f109771c = str2;
        this.f109772d = sVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void onFail(ModUpdateRequest modUpdateRequest, ModErrorInfo modErrorInfo) throws NoWhenBranchMatchedException {
        BiliSenseMeModManager biliSenseMeModManager = this.f109769a;
        biliSenseMeModManager.f108843e.a(this.f109772d, LoadStatus.FAILED);
        BiliSenseMeModManager.OnSenseMeModResourceUpdateCallback onSenseMeModResourceUpdateCallback = biliSenseMeModManager.f108842d;
        if (onSenseMeModResourceUpdateCallback != null) {
            onSenseMeModResourceUpdateCallback.onFailed(this.f109770b, this.f109771c);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void onProgress(ModUpdateRequest modUpdateRequest, ModProgress modProgress) throws NoWhenBranchMatchedException {
        BiliSenseMeModManager biliSenseMeModManager = this.f109769a;
        biliSenseMeModManager.f108843e.a(this.f109772d, LoadStatus.SUCCESS);
        BiliSenseMeModManager.OnSenseMeModResourceUpdateCallback onSenseMeModResourceUpdateCallback = biliSenseMeModManager.f108842d;
        if (onSenseMeModResourceUpdateCallback != null) {
            onSenseMeModResourceUpdateCallback.onProgress(modUpdateRequest != null ? modUpdateRequest.getModName() : null, modProgress != null ? Float.valueOf(modProgress.getProgress()) : null);
        }
        Float fValueOf = null;
        if (modProgress != null) {
            fValueOf = Float.valueOf(modProgress.getProgress());
        }
        BLog.i("BiliSenseMeModManager", "ModManager onProgress modName = " + this.f109770b + " progress = " + fValueOf);
    }

    public final void onSuccess(final ModResource modResource) {
        final s sVar = this.f109772d;
        final BiliSenseMeModManager biliSenseMeModManager = this.f109769a;
        final String str = this.f109770b;
        final String str2 = this.f109771c;
        HandlerThreads.post(3, new Runnable(modResource, biliSenseMeModManager, str, str2, sVar) { // from class: com.bilibili.studio.videoeditor.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ModResource f109764a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliSenseMeModManager f109765b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f109766c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f109767d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final s f109768e;

            {
                this.f109764a = modResource;
                this.f109765b = biliSenseMeModManager;
                this.f109766c = str;
                this.f109767d = str2;
                this.f109768e = sVar;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            @Override // java.lang.Runnable
            public final void run() throws NoWhenBranchMatchedException {
                BiliSenseMeModManager.OnSenseMeModResourceUpdateCallback onSenseMeModResourceUpdateCallback;
                ModResource modResource2 = this.f109764a;
                BiliSenseMeModManager biliSenseMeModManager2 = this.f109765b;
                String str3 = this.f109766c;
                String str4 = this.f109767d;
                s sVar2 = this.f109768e;
                if (!modResource2.isAvailable()) {
                    BLog.e("BiliSenseMeModManager", "download success but resource is not available: modName = " + modResource2.getModName());
                    biliSenseMeModManager2.f108843e.a(sVar2, LoadStatus.FAILED);
                    BiliSenseMeModManager.OnSenseMeModResourceUpdateCallback onSenseMeModResourceUpdateCallback2 = biliSenseMeModManager2.f108842d;
                    if (onSenseMeModResourceUpdateCallback2 != null) {
                        onSenseMeModResourceUpdateCallback2.onFailed(str3, str4);
                        return;
                    }
                    return;
                }
                String strA = biliSenseMeModManager2.a(modResource2.getModName(), str4);
                String modName = modResource2.getModName();
                BiliSenseMeModManager.Companion companion = BiliSenseMeModManager.Companion;
                if (StringsKt.n(modName, companion.getSO_NAME_BMM_AURORA()) || StringsKt.n(modResource2.getModName(), companion.getSO_NAME_BMM()) || StringsKt.n(modResource2.getModName(), companion.getSO_NAME_AURORA_THIRD_PART()) || StringsKt.n(modResource2.getModName(), companion.getSO_NAME_CV()) || StringsKt.n(modResource2.getModName(), companion.getSO_NAME_MON()) || StringsKt.n(modResource2.getModName(), companion.getSO_NAME_MON_THIRD_PART()) || StringsKt.n(modResource2.getModName(), companion.getSO_NAME_BMM_EFFECT()) || StringsKt.n(modResource2.getModName(), companion.getSO_NAME_BMM_IMAGE_FILTER())) {
                    biliSenseMeModManager2.f108839a.put(modResource2.getModName(), strA);
                } else if (StringsKt.n(modResource2.getModName(), BiliSenseMeModManager.MOD_NAME_BLIVE_CV_MODELS) || StringsKt.n(modResource2.getModName(), "android_cv_model_3")) {
                    biliSenseMeModManager2.f108840b.put(modResource2.getModName(), strA);
                } else if (StringsKt.n(modResource2.getModName(), BiliSenseMeModManager.f108836p)) {
                    biliSenseMeModManager2.f108841c.put(modResource2.getModName(), strA);
                }
                BiliSenseMeModManager.OnSenseMeModResourceUpdateCallback onSenseMeModResourceUpdateCallback3 = biliSenseMeModManager2.f108842d;
                if (onSenseMeModResourceUpdateCallback3 != null) {
                    onSenseMeModResourceUpdateCallback3.onProgress(modResource2.getModName(), Float.valueOf(1.0f));
                }
                biliSenseMeModManager2.f108843e.a(sVar2, LoadStatus.SUCCESS);
                O.a("download success: modName = ", modResource2.getModName(), ", filePath =  ", strA, "BiliSenseMeModManager");
                if (!biliSenseMeModManager2.isSenseMeModResourcesExisted() || (onSenseMeModResourceUpdateCallback = biliSenseMeModManager2.f108842d) == null) {
                    return;
                }
                onSenseMeModResourceUpdateCallback.onSuccess();
            }
        });
    }
}
