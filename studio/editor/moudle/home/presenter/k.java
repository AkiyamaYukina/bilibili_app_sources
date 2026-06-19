package com.bilibili.studio.editor.moudle.home.presenter;

import android.app.Application;
import androidx.compose.foundation.text.selection.C3751q;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/presenter/k.class */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f107252a = androidx.room.m.a(null, 1, null, Dispatchers.getDefault());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public BiliTemplateEngineManager f107253b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/presenter/k$a.class */
    public static final class a {
        @NotNull
        public static String a() {
            Application application = BiliContext.application();
            return application == null ? C3751q.a(System.currentTimeMillis(), "none_") : ec.a.a(BiliAccounts.get(application).mid(), System.currentTimeMillis(), "_");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.bilibili.studio.editor.moudle.home.presenter.k r7, java.lang.String r8, java.lang.String r9, int r10, int r11) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.home.presenter.k.a(com.bilibili.studio.editor.moudle.home.presenter.k, java.lang.String, java.lang.String, int, int):void");
    }

    public final void b() {
        CoroutineScopeKt.cancel$default(this.f107252a, (CancellationException) null, 1, (Object) null);
        BiliTemplateEngineManager biliTemplateEngineManager = this.f107253b;
        if (biliTemplateEngineManager != null) {
            biliTemplateEngineManager.k();
        }
        this.f107253b = null;
    }
}
