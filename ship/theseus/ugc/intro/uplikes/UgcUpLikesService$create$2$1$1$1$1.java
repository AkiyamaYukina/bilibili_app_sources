package com.bilibili.ship.theseus.ugc.intro.uplikes;

import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesService$create$2$1$1$1$1.class */
final class UgcUpLikesService$create$2$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<User> $list;
    Object L$0;
    Object L$1;
    int label;
    final UgcUpLikesService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcUpLikesService$create$2$1$1$1$1(UgcUpLikesService ugcUpLikesService, List<User> list, Continuation<? super UgcUpLikesService$create$2$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = ugcUpLikesService;
        this.$list = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcUpLikesService$create$2$1$1$1$1(this.this$0, this.$list, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        UgcUpLikesService ugcUpLikesService;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ugcUpLikesService = (UgcUpLikesService) this.L$1;
            com.bilibili.ship.theseus.united.page.playingarea.g gVar2 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                gVar = gVar2;
                gVar.j(ugcUpLikesService);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                gVar = gVar2;
                gVar.j(ugcUpLikesService);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        UgcUpLikesService ugcUpLikesService2 = this.this$0;
        gVar = ugcUpLikesService2.f97675e;
        List<User> list = this.$list;
        gVar.f(ugcUpLikesService2);
        try {
            BackActionRepository backActionRepository = ugcUpLikesService2.f97680k;
            UgcUpLikesService$create$2$1$1$1$1$1$1 ugcUpLikesService$create$2$1$1$1$1$1$1 = new UgcUpLikesService$create$2$1$1$1$1$1$1(ugcUpLikesService2, list, null);
            this.L$0 = gVar;
            this.L$1 = ugcUpLikesService2;
            this.label = 1;
            if (backActionRepository.a(ugcUpLikesService$create$2$1$1$1$1$1$1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            ugcUpLikesService = ugcUpLikesService2;
            gVar.j(ugcUpLikesService);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            ugcUpLikesService = ugcUpLikesService2;
            gVar.j(ugcUpLikesService);
            throw th;
        }
    }
}
