package com.bilibili.ship.theseus.playlist;

import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistActionService$descExpand$1$1$2.class */
public final class PlaylistActionService$descExpand$1$1$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final com.bilibili.ship.theseus.united.page.intro.module.season.D $uiComponent;
    int label;
    final C6241f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistActionService$descExpand$1$1$2(C6241f c6241f, com.bilibili.ship.theseus.united.page.intro.module.season.D d7, Continuation<? super PlaylistActionService$descExpand$1$1$2> continuation) {
        super(1, continuation);
        this.this$0 = c6241f;
        this.$uiComponent = d7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(com.bilibili.ship.theseus.united.page.intro.module.season.D d7, boolean z6) {
        return d7.c();
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PlaylistActionService$descExpand$1$1$2(this.this$0, this.$uiComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BackActionRepository backActionRepository = this.this$0.h;
            final com.bilibili.ship.theseus.united.page.intro.module.season.D d7 = this.$uiComponent;
            Function1<? super Boolean, Boolean> function1 = new Function1(d7) { // from class: com.bilibili.ship.theseus.playlist.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.bilibili.ship.theseus.united.page.intro.module.season.D f95757a;

                {
                    this.f95757a = d7;
                }

                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(PlaylistActionService$descExpand$1$1$2.invokeSuspend$lambda$0(this.f95757a, ((Boolean) obj2).booleanValue()));
                }
            };
            this.label = 1;
            if (backActionRepository.b(function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
