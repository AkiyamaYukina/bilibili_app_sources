package com.bilibili.search2.result.holder.aichat;

import com.bapis.bilibili.broadcast.message.main.ChatResultV2;
import java.util.List;
import java.util.concurrent.CancellationException;
import kntr.app.search.aicard.redux.c;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/SearchAIChatTyper$start$1.class */
final class SearchAIChatTyper$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchAIChatTyper$start$1(l lVar, Continuation<? super SearchAIChatTyper$start$1> continuation) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchAIChatTyper$start$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CompletableDeferred<ChatResultV2> completableDeferredCompletableDeferred$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            l lVar = this.this$0;
            c cVar = lVar.f87802f;
            String str = lVar.f87797a;
            this.label = 1;
            synchronized (cVar) {
                if (!Intrinsics.areEqual(cVar.f87773a, str) || cVar.f87774b == null) {
                    CompletableDeferred<ChatResultV2> completableDeferred = cVar.f87774b;
                    if (completableDeferred != null) {
                        Job.DefaultImpls.cancel$default(completableDeferred, (CancellationException) null, 1, (Object) null);
                    }
                    completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default((Job) null, 1, (Object) null);
                    cVar.f87773a = str;
                    cVar.f87774b = completableDeferredCompletableDeferred$default;
                } else {
                    completableDeferredCompletableDeferred$default = cVar.f87774b;
                }
            }
            Object objAwait = completableDeferredCompletableDeferred$default.await(this);
            obj = objAwait;
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ChatResultV2 chatResultV2 = (ChatResultV2) obj;
        Job job = this.this$0.f87805j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        ze.c.a(chatResultV2.getCode(), "onResult sid=", this.this$0.f87797a, ", code=", "[Search]SearchAIChatTyper");
        this.this$0.b(chatResultV2);
        if (chatResultV2.getCode() == 0) {
            this.this$0.getClass();
            Pair pairA = l.a(chatResultV2);
            List list = (List) pairA.component1();
            List list2 = (List) pairA.component2();
            a.h1 h1Var = this.this$0.f87801e.a;
            h1Var.b().a(new c.c(kntr.app.search.aicard.a.a(h1Var.a(), list), list2));
        } else {
            this.this$0.f87801e.a.b().a(new c.b(chatResultV2.getCode()));
        }
        return Unit.INSTANCE;
    }
}
