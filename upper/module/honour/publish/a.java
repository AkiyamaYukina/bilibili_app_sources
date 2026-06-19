package com.bilibili.upper.module.honour.publish;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import bD0.C4940b;
import com.bilibili.studio.videoeditor.C6600h;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/publish/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f113177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C6600h f113178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public C4940b f113179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f113180d = CoroutineScopeKt.CoroutineScope(JobKt.Job$default((Job) null, 1, (Object) null));

    public a(@NotNull Context context, @NotNull C6600h c6600h) {
        this.f113177a = context;
        this.f113178b = c6600h;
    }
}
