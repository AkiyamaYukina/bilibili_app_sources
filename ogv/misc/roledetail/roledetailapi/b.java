package com.bilibili.ogv.misc.roledetail.roledetailapi;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.okretro.ServiceGenerator;
import io.reactivex.rxjava3.core.Single;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/roledetailapi/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f69290a = (a) ServiceGenerator.createService(a.class);

    @NotNull
    public static Single a(long j7) {
        return f69290a.getRoleInfoDetail(j7);
    }

    @NotNull
    public static Single b(long j7, int i7, int i8, int i9) {
        return f69290a.getRoleWorksDetail(j7, i7, i8, i9);
    }
}
