package com.bilibili.playerbizcommonv2.history;

import Wr0.e;
import Wr0.f;
import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.BiliContext;
import com.bilibili.playerdb.basic.PlayerDBEntity;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/history/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Application f81789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final e<CommonVideoPlayerDBData> f81790b;

    /* JADX WARN: Type inference failed for: r0v3, types: [Wr0.b, java.lang.Object] */
    public b() {
        Application application = BiliContext.application();
        this.f81789a = application;
        this.f81790b = new e<>(application, new f(application), new Object());
    }

    @Nullable
    public final PlayerDBEntity<CommonVideoPlayerDBData> a(long j7) {
        long jA = f.a(this.f81789a);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return this.f81790b.b(CommonVideoPlayerDBData.class, String.format(Locale.US, "av:%d%d", Arrays.copyOf(new Object[]{Long.valueOf(jA), Long.valueOf(j7)}, 2)));
    }
}
