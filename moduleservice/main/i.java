package com.bilibili.moduleservice.main;

import android.net.Uri;
import com.bilibili.relation.Z;
import com.bilibili.relation.a0;
import java.util.Map;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/i.class */
public interface i {
    static /* synthetic */ Callable e(i iVar, String str, long j7, int i7, FollowOption followOption, String str2, String str3, Map map, int i8) {
        if ((i8 & 32) != 0) {
            str3 = null;
        }
        return iVar.a(str, j7, i7, followOption, str2, str3, null, map);
    }

    @Nullable
    Z a(@Nullable String str, long j7, int i7, @Nullable FollowOption followOption, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Map map);

    @Nullable
    a0 b(@Nullable String str, long j7, @Nullable FollowOption followOption);

    @Nullable
    Uri c(int i7, long j7);

    @Nullable
    Uri d(long j7);
}
