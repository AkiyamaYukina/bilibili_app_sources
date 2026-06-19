package com.bilibili.studio.videoeditor.template.util;

import K7.L;
import SB0.b;
import SB0.d;
import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import com.bilibili.adcommon.utils.e;
import com.bilibili.base.BiliContext;
import com.bilibili.biligame.ui.set.download.c;
import com.bilibili.studio.videoeditor.common.mod.Mod;
import com.bilibili.studio.videoeditor.exception.FileNotExistedError;
import com.bilibili.studio.videoeditor.ms.EditorEngineSDKLoadManager;
import com.bilibili.studio.videoeditor.util.C6636i;
import j4.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/util/BiliTemplateEnvironment.class */
@Keep
public final class BiliTemplateEnvironment {

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    private static final String TAG = "BiliTemplateEnvironment";
    private static boolean mIsCSharedSoLoaded;
    private static boolean mIsNvsSDKInit;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/util/BiliTemplateEnvironment$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/util/BiliTemplateEnvironment$b.class */
    public static final class b implements b.InterfaceC0114b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1<Boolean, Unit> f110163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function1<Integer, Unit> f110164b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Boolean, Unit> function1, Function1<? super Integer, Unit> function12) {
            this.f110163a = function1;
            this.f110164b = function12;
        }

        @Override // SB0.b.c
        public final void a() {
            BLog.i(BiliTemplateEnvironment.TAG, "downloadEditorEngineMods...onDownloaded");
            this.f110163a.invoke(Boolean.TRUE);
        }

        @Override // SB0.b.c
        public final void onFail(int i7) {
            pi.a.a(i7, "downloadEditorEngineMods...onFail...error = ", BiliTemplateEnvironment.TAG);
            this.f110163a.invoke(Boolean.FALSE);
        }

        @Override // SB0.b.InterfaceC0114b
        public final void onProgress(int i7) {
            BLog.i(BiliTemplateEnvironment.TAG, "downloadEditorEngineMods...onProgress...progress = " + i7);
            this.f110164b.invoke(Integer.valueOf(i7));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean checkModResourceAvailable(java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.template.util.BiliTemplateEnvironment.checkModResourceAvailable(java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downloadAndCheckEditorEngineModsLoad$lambda$0(Function1 function1, boolean z6) {
        function1.invoke(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    private final List<Mod> getEditorEngineModList() {
        ArrayList arrayList = new ArrayList();
        if (BiliContext.application() != null) {
            Mod mod = SB0.a.f22763a;
            arrayList.add(SB0.a.f22773l);
            arrayList.add(SB0.a.f22766d);
            arrayList.add(SB0.a.f22768f);
            arrayList.add(SB0.a.f22767e);
            arrayList.add(SB0.a.f22769g);
            arrayList.add(SB0.a.f22763a);
            arrayList.add(SB0.a.f22764b);
            arrayList.add(SB0.a.f22765c);
            arrayList.add(SB0.a.f22774m);
            arrayList.add(SB0.a.f22775n);
        }
        return arrayList;
    }

    public final void downloadAndCheckEditorEngineModsLoad(@NotNull Function1<? super Integer, Unit> function1, @NotNull Function1<? super Boolean, Unit> function12) {
        downloadEditorEngineMods((Mod[]) getEditorEngineModList().toArray(new Mod[0]), function1, new c(function12, 3));
    }

    public final void downloadEditorEngineMods(@NotNull Mod[] modArr, @NotNull Function1<? super Integer, Unit> function1, @NotNull Function1<? super Boolean, Unit> function12) {
        BLog.i(TAG, "downloadEditorEngineMods");
        new d().d(modArr, new b(function12, function1));
    }

    public final boolean initEditorEngineSDK(@NotNull Context context) {
        BLog.i(TAG, "initEditorEngineSDK...context = " + context + ", mIsNvsSDKInit = " + mIsNvsSDKInit);
        if (mIsNvsSDKInit) {
            EditorEngineSDKLoadManager.initMontageLibraryDirPath(context);
            return true;
        }
        mIsNvsSDKInit = false;
        try {
            EditorEngineSDKLoadManager.init(context, TAG);
            mIsNvsSDKInit = true;
            BLog.i(TAG, "initEditorEngineSDK...initEditorEngineSDK success");
        } catch (FileNotExistedError e7) {
            M.b("initEditorEngineSDK...start ms init sdk FileNotExistedError ", e7.getLocalizedMessage(), TAG);
        } catch (NullPointerException e8) {
            M.b("initEditorEngineSDK...start ms init sdk nvsStreamingContext null ", e8.getLocalizedMessage(), TAG);
        } catch (UnsatisfiedLinkError e9) {
            M.b("initEditorEngineSDK...start ms init sdk error: ", e9.getLocalizedMessage(), TAG);
        } catch (Throwable th) {
            e.a("initEditorEngineSDK...error: ", TAG, th.fillInStackTrace());
        }
        return mIsNvsSDKInit;
    }

    public final boolean initSDK(@NotNull Context context) {
        boolean z6 = mIsCSharedSoLoaded;
        boolean z7 = mIsNvsSDKInit;
        StringBuilder sb = new StringBuilder("initSDK...context = ");
        sb.append(context);
        sb.append(", mIsCSharedSoLoaded = ");
        sb.append(z6);
        sb.append(", mIsNvsSDKInit = ");
        L.a(sb, z7, TAG);
        boolean z8 = true;
        if (mIsCSharedSoLoaded && mIsNvsSDKInit) {
            return true;
        }
        loadCSharedSo();
        if (!isEditorEngineModAvailable()) {
            return false;
        }
        initEditorEngineSDK(context);
        if (!mIsCSharedSoLoaded || !mIsNvsSDKInit) {
            z8 = false;
        }
        return z8;
    }

    public final boolean isEditorEngineModAvailable() {
        boolean z6 = true;
        for (Mod mod : getEditorEngineModList()) {
            if (!checkModResourceAvailable(mod.getPool(), mod.getName())) {
                z6 = false;
            }
        }
        BLog.wfmt(TAG, com.bilibili.app.comm.bh.x5.b.a("isEditorEngineModAvailable...result = ", z6), new Object[0]);
        return z6;
    }

    public final boolean loadCSharedSo() {
        t.a("loadCSharedSo...mIsCSharedSoLoaded = ", TAG, mIsCSharedSoLoaded);
        if (mIsCSharedSoLoaded) {
            return true;
        }
        Application application = BiliContext.application();
        Context applicationContext = application != null ? application.getApplicationContext() : null;
        if (applicationContext == null) {
            BLog.e(TAG, "loadCSharedSo...application is null");
            mIsCSharedSoLoaded = false;
            return false;
        }
        boolean zA = C6636i.f110234a.a(applicationContext);
        mIsCSharedSoLoaded = zA;
        if (zA) {
            BLog.i(TAG, "loadCSharedSo...loadCSharedSo success");
        }
        return mIsCSharedSoLoaded;
    }

    public final void release() {
        ConcurrentHashMap<String, CopyOnWriteArrayList<Job>> concurrentHashMap = com.bilibili.studio.videoeditor.generalrender.model.t.f109653a;
        if (concurrentHashMap != null) {
            CopyOnWriteArrayList<Job> copyOnWriteArrayList = concurrentHashMap.get("TU_WEN_MOD_JOB");
            Iterator<Job> it = copyOnWriteArrayList != null ? copyOnWriteArrayList.iterator() : null;
            while (it != null && it.hasNext()) {
                Job.DefaultImpls.cancel$default(it.next(), (CancellationException) null, 1, (Object) null);
            }
            concurrentHashMap.remove("TU_WEN_MOD_JOB");
        }
    }
}
