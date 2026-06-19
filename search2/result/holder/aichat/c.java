package com.bilibili.search2.result.holder.aichat;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.broadcast.message.main.ChatResultV2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public volatile String f87773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public volatile CompletableDeferred<ChatResultV2> f87774b;

    public final void a(@NotNull ChatResultV2 chatResultV2) {
        CompletableDeferred<ChatResultV2> completableDeferredCompletableDeferred$default;
        String sessionId = chatResultV2.getSessionId();
        if (sessionId == null || sessionId.length() == 0) {
            return;
        }
        ze.c.a(chatResultV2.getCode(), "dispatch sessionId=", sessionId, ", code=", "[Search]SearchChatResultItemPool");
        synchronized (this) {
            String str = this.f87773a;
            if (Intrinsics.areEqual(str, sessionId)) {
                completableDeferredCompletableDeferred$default = this.f87774b;
            } else if (str == null) {
                completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default((Job) null, 1, (Object) null);
                this.f87773a = sessionId;
                this.f87774b = completableDeferredCompletableDeferred$default;
            } else {
                completableDeferredCompletableDeferred$default = null;
            }
        }
        if (completableDeferredCompletableDeferred$default == null) {
            Wh.c.a("dispatch ignored: stale sessionId=", sessionId, ", active=", this.f87773a, "[Search]SearchChatResultItemPool");
        } else {
            if (completableDeferredCompletableDeferred$default.complete(chatResultV2)) {
                return;
            }
            Dd.k.b("dispatch ignored: sessionId=", sessionId, " already completed", "[Search]SearchChatResultItemPool");
        }
    }
}
