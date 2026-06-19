package com.bilibili.search2.result.holder.aichat;

import G3.G;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bapis.bilibili.broadcast.message.main.ChatResultV2;
import com.bapis.bilibili.broadcast.message.main.SearchMoss;
import com.bilibili.lib.moss.api.CallOptions;
import com.google.protobuf.Empty;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import q4.C8397q;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/b.class */
@StabilityInferred(parameters = 0)
public final class b implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy<b> f87770c = LazyKt.lazy(new G(10));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f87771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c f87772b = new Object();

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
        if (this.f87771a == 0) {
            BLog.i("[Search]AIChatConnectionManager", "startConnection");
            try {
                new SearchMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).chatResultPushV2(Empty.newBuilder().build(), new a(this));
            } catch (Exception e7) {
                C8397q.a("startConnection error: ", "[Search]AIChatConnectionManager", e7);
            }
        }
        int i7 = this.f87771a + 1;
        this.f87771a = i7;
        bilibili.live.app.service.resolver.c.a(i7, "onCreate ", "[Search]AIChatConnectionManager");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        int iMax = Math.max(0, this.f87771a - 1);
        this.f87771a = iMax;
        if (iMax == 0) {
            BLog.i("[Search]AIChatConnectionManager", "stopConnection");
            try {
                new SearchMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).unChatResultPushV2();
            } catch (Exception e7) {
                C8397q.a("stopConnection error: ", "[Search]AIChatConnectionManager", e7);
            }
            c cVar = this.f87772b;
            synchronized (cVar) {
                CompletableDeferred<ChatResultV2> completableDeferred = cVar.f87774b;
                if (completableDeferred != null) {
                    Job.DefaultImpls.cancel$default(completableDeferred, (CancellationException) null, 1, (Object) null);
                }
                cVar.f87774b = null;
                cVar.f87773a = null;
                Unit unit = Unit.INSTANCE;
            }
        }
        bilibili.live.app.service.resolver.c.a(this.f87771a, "onDestroy ", "[Search]AIChatConnectionManager");
    }
}
