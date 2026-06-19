package com.bilibili.playerbizcommon.history.ugc;

import Wr0.e;
import Wr0.f;
import android.app.Application;
import com.bilibili.base.BiliContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/history/ugc/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Application f80093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final e<UgcVideoPlayerDBData> f80094b;

    /* JADX WARN: Type inference failed for: r0v3, types: [Wr0.b, java.lang.Object] */
    public a() {
        Application application = BiliContext.application();
        this.f80093a = application;
        this.f80094b = new e<>(application, new f(application), new Object());
    }
}
