package com.bilibili.studio.editor.moudle.intelligence.logic;

import android.app.Application;
import android.text.TextUtils;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.room.m;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.okretro.BiliApiDataCallback;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/logic/l.class */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CoroutineScope f107360a = m.a(null, 1, null, Dispatchers.getDefault());

    public static void a(@NotNull String str, @NotNull String str2, @Nullable String str3, long j7, long j8, long j9, @NotNull BiliApiDataCallback biliApiDataCallback) {
        String str4 = !TextUtils.isEmpty(str) ? str : null;
        String strA = str4;
        if (str4 == null) {
            Application application = BiliContext.application();
            strA = application == null ? C3751q.a(System.currentTimeMillis(), "none_") : ec.a.a(BiliAccounts.get(application).mid(), System.currentTimeMillis(), "_");
        }
        String strD = Xz0.g.d();
        if (strD == null || strD.length() == 0) {
            strD = strA;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = biliApiDataCallback;
        BuildersKt.launch$default(f107360a, (CoroutineContext) null, (CoroutineStart) null, new PollingMusicLogic$getPollingMusic$1(j7, j9, objectRef, strA, str2, 2, Constant.SDK_OS, str3, strD, j8, null), 3, (Object) null);
    }
}
