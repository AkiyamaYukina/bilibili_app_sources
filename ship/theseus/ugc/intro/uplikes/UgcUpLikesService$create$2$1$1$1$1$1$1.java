package com.bilibili.ship.theseus.ugc.intro.uplikes;

import com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesPanelComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesService$create$2$1$1$1$1$1$1.class */
public final class UgcUpLikesService$create$2$1$1$1$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final List<User> $list;
    int label;
    final UgcUpLikesService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcUpLikesService$create$2$1$1$1$1$1$1(UgcUpLikesService ugcUpLikesService, List<User> list, Continuation<? super UgcUpLikesService$create$2$1$1$1$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = ugcUpLikesService;
        this.$list = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$0(UgcUpLikesService ugcUpLikesService) {
        return ugcUpLikesService.f97679j.f() ? 3 : 1;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UgcUpLikesService$create$2$1$1$1$1$1$1(this.this$0, this.$list, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UgcUpLikesService ugcUpLikesService = this.this$0;
            TheseusFloatLayerService theseusFloatLayerService = ugcUpLikesService.f97676f;
            List<User> list = this.$list;
            h hVar = ugcUpLikesService.f97674d;
            UgcUpLikesPanelComponent ugcUpLikesPanelComponent = new UgcUpLikesPanelComponent(hVar.f97742i, ugcUpLikesService.f97679j);
            hVar.h.setValue(new UgcUpLikesPanelComponent.b(false, 0L, UgcUpLikesPanelComponent.LoadingState.EMPTY, ugcUpLikesService.f97677g.a().f123881c, (String) null, 39));
            ugcUpLikesPanelComponent.j(!r0.f());
            UgcUpLikesService$createUgcUpLikesPanel$1$1 ugcUpLikesService$createUgcUpLikesPanel$1$1 = new UgcUpLikesService$createUgcUpLikesPanel$1$1(ugcUpLikesService, ugcUpLikesPanelComponent, null);
            CoroutineScope coroutineScope = ugcUpLikesService.f97672b;
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, ugcUpLikesService$createUgcUpLikesPanel$1$1, 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UgcUpLikesService$createUgcUpLikesPanel$1$2(ugcUpLikesService, ugcUpLikesPanelComponent, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UgcUpLikesService$createUgcUpLikesPanel$1$3(ugcUpLikesPanelComponent, ugcUpLikesService, list, null), 3, (Object) null);
            final UgcUpLikesService ugcUpLikesService2 = this.this$0;
            TheseusFloatLayerService.a aVar = new TheseusFloatLayerService.a(0, 0, new Function0(ugcUpLikesService2) { // from class: com.bilibili.ship.theseus.ugc.intro.uplikes.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final UgcUpLikesService f97746a;

                {
                    this.f97746a = ugcUpLikesService2;
                }

                public final Object invoke() {
                    return Integer.valueOf(UgcUpLikesService$create$2$1$1$1$1$1$1.invokeSuspend$lambda$0(this.f97746a));
                }
            }, 12);
            this.label = 1;
            if (theseusFloatLayerService.e(ugcUpLikesPanelComponent, aVar, this) == coroutine_suspended) {
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
