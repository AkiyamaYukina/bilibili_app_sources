package com.bilibili.studio.editor.moudle.intelligence.logic;

import G.p;
import android.app.Application;
import android.os.Environment;
import android.text.TextUtils;
import androidx.compose.foundation.text.selection.C3751q;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.comm.manager.IGVEntranceManager;
import com.bilibili.studio.editor.moudle.intelligence.music.api.AIMusicService;
import com.bilibili.studio.videoeditor.capturev3.data.BgmMissionInfo;
import com.bilibili.studio.videoeditor.downloader.DownloadRequestV1;
import java.io.File;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/logic/g.class */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String[] f107353a = {BgmMissionInfo.DownloadResource.FORMAT_64, BgmMissionInfo.DownloadResource.FORMAT_96, BgmMissionInfo.DownloadResource.FORMAT_128};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String[] f107354b = {BgmMissionInfo.DownloadResource.FORMAT_96, BgmMissionInfo.DownloadResource.FORMAT_128};

    @Nullable
    public static Object a(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull ContinuationImpl continuationImpl) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuationImpl), 1);
        cancellableContinuationImpl.initCancellability();
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(ResultKt.createFailure(new Exception())));
        } else {
            DownloadRequestV1.a aVar = new DownloadRequestV1.a();
            aVar.f109450b = str;
            aVar.f109451c = str2;
            aVar.f109452d = str3;
            aVar.f109449a = System.nanoTime();
            DownloadRequestV1 downloadRequestV1 = new DownloadRequestV1(aVar);
            VB0.d dVar = (VB0.d) VB0.d.f25301a.getValue();
            e eVar = new e(cancellableContinuationImpl);
            dVar.getClass();
            VB0.d.a(downloadRequestV1, eVar);
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return result;
    }

    @Nullable
    public static String b() {
        Application application = BiliContext.application();
        if (application == null) {
            return null;
        }
        File externalFilesDir = application.getExternalFilesDir(Environment.DIRECTORY_MUSIC);
        File file = externalFilesDir;
        if (externalFilesDir == null) {
            File cacheDir = application.getCacheDir();
            file = cacheDir;
            if (cacheDir == null) {
                return null;
            }
        }
        return p.a(file.getAbsolutePath(), File.separator);
    }

    public static void c(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull BiliApiDataCallback biliApiDataCallback) {
        String strA;
        if (TextUtils.isEmpty(str)) {
            Application application = BiliContext.application();
            strA = application == null ? C3751q.a(System.currentTimeMillis(), "none_") : ec.a.a(BiliAccounts.get(application).mid(), System.currentTimeMillis(), "_");
        } else {
            strA = str;
        }
        Lazy lazy = zw0.b.f130950a;
        if (ConfigManager.Companion.ab2().getWithDefault("uper.editor_new_music_panel_enabled", false) && Intrinsics.areEqual(IGVEntranceManager.b(IGVEntranceManager.f105374a, "music_panel"), "1")) {
            Jz0.f.f11746a = str2;
            Jz0.f.f11747b = str;
            Jz0.f.f11748c = str3;
        }
        String strD = Xz0.g.d();
        if (strD == null || strD.length() == 0) {
            strD = strA;
        }
        AIMusicService aIMusicService = (AIMusicService) ServiceGenerator.createService(AIMusicService.class);
        String str4 = str3;
        if (str3 == null) {
            str4 = "";
        }
        aIMusicService.getRecommendMusics(strA, str2, 2, Constant.SDK_OS, str4, null, null, strD).enqueue(biliApiDataCallback);
    }

    @NotNull
    public static String d(@NotNull BgmMissionInfo bgmMissionInfo) {
        return p.a(StringsKt.L(bgmMissionInfo.name, File.separator, "&"), "_mp.json");
    }

    @NotNull
    public static String e(@NotNull BgmMissionInfo bgmMissionInfo) {
        return p.a(StringsKt.L(bgmMissionInfo.name, File.separator, "&"), ".mp3");
    }
}
