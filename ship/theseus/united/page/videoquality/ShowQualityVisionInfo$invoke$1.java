package com.bilibili.ship.theseus.united.page.videoquality;

import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/ShowQualityVisionInfo$invoke$1.class */
final class ShowQualityVisionInfo$invoke$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $targetQuality;
    private Object L$0;
    Object L$1;
    int label;
    final T this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowQualityVisionInfo$invoke$1(T t7, int i7, Continuation<? super ShowQualityVisionInfo$invoke$1> continuation) {
        super(2, continuation);
        this.this$0 = t7;
        this.$targetQuality = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(CoroutineScope coroutineScope) {
        CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShowQualityVisionInfo$invoke$1 showQualityVisionInfo$invoke$1 = new ShowQualityVisionInfo$invoke$1(this.this$0, this.$targetQuality, continuation);
        showQualityVisionInfo$invoke$1.L$0 = obj;
        return showQualityVisionInfo$invoke$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) throws Throwable {
        T t7;
        T t8;
        com.bilibili.player.tangram.basic.d dVar;
        com.bilibili.player.tangram.basic.d dVar2;
        T t9;
        com.bilibili.player.tangram.basic.d dVar3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Function0 function0 = new Function0(coroutineScope) { // from class: com.bilibili.ship.theseus.united.page.videoquality.S

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CoroutineScope f103752a;

                {
                    this.f103752a = coroutineScope;
                }

                public final Object invoke() {
                    return ShowQualityVisionInfo$invoke$1.invokeSuspend$lambda$0(this.f103752a);
                }
            };
            T t10 = this.this$0;
            com.bilibili.ship.theseus.keel.player.h hVar = t10.f103758a;
            int i8 = this.$targetQuality;
            hVar.h(t10);
            try {
                BackActionRepository backActionRepository = t10.f103761d;
                ShowQualityVisionInfo$invoke$1$1$1 showQualityVisionInfo$invoke$1$1$1 = new ShowQualityVisionInfo$invoke$1$1$1(t10, function0, i8, null);
                this.L$0 = hVar;
                this.L$1 = t10;
                this.label = 1;
                if (backActionRepository.a(showQualityVisionInfo$invoke$1$1$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                t8 = t10;
                dVar = hVar;
            } catch (Throwable th) {
                th = th;
                t7 = t10;
                dVar2 = hVar;
                dVar2.i(t7);
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8 = (T) this.L$1;
            com.bilibili.player.tangram.basic.d dVar4 = (com.bilibili.player.tangram.basic.d) this.L$0;
            t9 = t8;
            dVar3 = dVar4;
            try {
                ResultKt.throwOnFailure(obj);
                dVar = dVar4;
            } catch (Throwable th2) {
                t7 = t9;
                th = th2;
                dVar2 = dVar3;
                dVar2.i(t7);
                throw th;
            }
        }
        t9 = t8;
        dVar3 = dVar == true ? 1 : 0;
        Unit unit = Unit.INSTANCE;
        dVar.i(t8);
        return Unit.INSTANCE;
    }
}
