package com.bilibili.search2.result;

import M3.O;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bapis.bilibili.broadcast.message.main.SearchMoss;
import com.bilibili.lib.moss.api.CallOptions;
import com.google.protobuf.Empty;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import q4.C8397q;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/t.class */
@StabilityInferred(parameters = 0)
public final class t implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy<t> f88516c = LazyKt.lazy(new O(6));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final o f88518b = new o();

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
        if (this.f88517a == 0) {
            BLog.i("SearchLongConnectionManager", "startLongConnection");
            try {
                new SearchMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).chatResultPush(Empty.newBuilder().build(), new s(this));
            } catch (Exception e7) {
                C8397q.a("chatResultPush onError: ", "SearchLongConnectionManager", e7);
            }
        }
        int i7 = this.f88517a + 1;
        this.f88517a = i7;
        bilibili.live.app.service.resolver.c.a(i7, "onCreate ", "SearchLongConnectionManager");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        int i7 = this.f88517a - 1;
        this.f88517a = i7;
        if (i7 == 0) {
            BLog.i("SearchLongConnectionManager", "stopLongConnection");
            try {
                new SearchMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).unChatResultPush();
            } catch (Exception e7) {
                C8397q.a("chatResultPush onError: ", "SearchLongConnectionManager", e7);
            }
        }
        bilibili.live.app.service.resolver.c.a(this.f88517a, "onDestroy ", "SearchLongConnectionManager");
    }
}
