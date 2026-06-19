package com.bilibili.ship.theseus.united.page.weblayer;

import com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.weblayer.l;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusV3WebService$show$2$4.class */
final class TheseusV3WebService$show$2$4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final l.a $displayMode;
    final Ref.ObjectRef<String> $finishReason;
    final String $urlLogSummary;
    final PlayerV3WebGeneralUIComponent $webUiComponent;
    int label;
    final l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusV3WebService$show$2$4(l lVar, String str, l.a aVar, Ref.ObjectRef<String> objectRef, PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent, Continuation<? super TheseusV3WebService$show$2$4> continuation) {
        super(1, continuation);
        this.this$0 = lVar;
        this.$urlLogSummary = str;
        this.$displayMode = aVar;
        this.$finishReason = objectRef;
        this.$webUiComponent = playerV3WebGeneralUIComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(String str, l lVar, l.a aVar, Ref.ObjectRef objectRef, PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent, boolean z6) {
        lVar.getClass();
        j4.o.a("show backAction close ", str, " mode=", l.c(aVar), "TheseusV3Web");
        objectRef.element = "back_action";
        playerV3WebGeneralUIComponent.d();
        return true;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TheseusV3WebService$show$2$4(this.this$0, this.$urlLogSummary, this.$displayMode, this.$finishReason, this.$webUiComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final l lVar = this.this$0;
            BackActionRepository backActionRepository = lVar.f104276i;
            final String str = this.$urlLogSummary;
            final l.a aVar = this.$displayMode;
            final Ref.ObjectRef<String> objectRef = this.$finishReason;
            final PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent = this.$webUiComponent;
            Function1<? super Boolean, Boolean> function1 = new Function1(str, lVar, aVar, objectRef, playerV3WebGeneralUIComponent) { // from class: com.bilibili.ship.theseus.united.page.weblayer.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f104282a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final l f104283b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final l.a f104284c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Ref.ObjectRef f104285d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final PlayerV3WebGeneralUIComponent f104286e;

                {
                    this.f104282a = str;
                    this.f104283b = lVar;
                    this.f104284c = aVar;
                    this.f104285d = objectRef;
                    this.f104286e = playerV3WebGeneralUIComponent;
                }

                public final Object invoke(Object obj2) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    return Boolean.valueOf(TheseusV3WebService$show$2$4.invokeSuspend$lambda$0(this.f104282a, this.f104283b, this.f104284c, this.f104285d, this.f104286e, zBooleanValue));
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
