package com.bilibili.ship.theseus.united.page.intro;

import android.content.res.Configuration;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.infra.util.j;
import com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.widget.TouchAwareConstraintLayout;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/HidePageWhenFullscreenService.class */
@StabilityInferred(parameters = 0)
public final class HidePageWhenFullscreenService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Flow<Configuration> f100013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Flow<a> f100014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C7893a f100015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f100016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f100017e;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.HidePageWhenFullscreenService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/HidePageWhenFullscreenService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final HidePageWhenFullscreenService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.HidePageWhenFullscreenService$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/HidePageWhenFullscreenService$1$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function5<a, Configuration, c.a, PlayingAreaDescription, Continuation<? super j<? extends a, ? extends Configuration, ? extends c.a, ? extends PlayingAreaDescription>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(5, j.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(a aVar, Configuration configuration, c.a aVar2, PlayingAreaDescription playingAreaDescription, Continuation<? super j<a, Configuration, c.a, PlayingAreaDescription>> continuation) {
                return AnonymousClass1.invokeSuspend$lambda$0(aVar, configuration, aVar2, playingAreaDescription, continuation);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.HidePageWhenFullscreenService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/HidePageWhenFullscreenService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<T> f100018a = (a<T>) new Object();

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:8:0x004e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r4, kotlin.coroutines.Continuation r5) {
                /*
                    r3 = this;
                    r0 = r4
                    com.bilibili.ogv.infra.util.j r0 = (com.bilibili.ogv.infra.util.j) r0
                    r9 = r0
                    r0 = r9
                    T1 r0 = r0.f67956a
                    com.bilibili.ship.theseus.united.page.intro.HidePageWhenFullscreenService$a r0 = (com.bilibili.ship.theseus.united.page.intro.HidePageWhenFullscreenService.a) r0
                    r8 = r0
                    r0 = r9
                    T2 r0 = r0.f67957b
                    android.content.res.Configuration r0 = (android.content.res.Configuration) r0
                    r4 = r0
                    r0 = r9
                    T3 r0 = r0.f67958c
                    com.bilibili.ship.theseus.united.page.screenstate.c$a r0 = (com.bilibili.ship.theseus.united.page.screenstate.c.a) r0
                    r5 = r0
                    r0 = r9
                    T4 r0 = r0.f67959d
                    com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription r0 = (com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription) r0
                    r9 = r0
                    r0 = r8
                    com.bilibili.ship.theseus.united.widget.TouchAwareConstraintLayout r0 = r0.f100019a
                    r8 = r0
                    r0 = 0
                    r7 = r0
                    r0 = r9
                    if (r0 == 0) goto L54
                    r0 = r9
                    boolean r0 = r0.a()
                    r1 = 1
                    if (r0 != r1) goto L54
                    r0 = r7
                    r6 = r0
                    r0 = r5
                    boolean r0 = r0.f102988b
                    if (r0 == 0) goto L69
                L4e:
                    r0 = 8
                    r6 = r0
                    goto L69
                L54:
                    r0 = r7
                    r6 = r0
                    r0 = r4
                    int r0 = r0.orientation
                    r1 = 2
                    if (r0 != r1) goto L69
                    r0 = r5
                    boolean r0 = r0.f102988b
                    if (r0 != 0) goto L4e
                    r0 = r7
                    r6 = r0
                L69:
                    r0 = r8
                    r1 = r6
                    r0.setVisibility(r1)
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.HidePageWhenFullscreenService.AnonymousClass1.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HidePageWhenFullscreenService hidePageWhenFullscreenService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = hidePageWhenFullscreenService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(a aVar, Configuration configuration, c.a aVar2, PlayingAreaDescription playingAreaDescription, Continuation continuation) {
            return new j(aVar, configuration, aVar2, playingAreaDescription);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                HidePageWhenFullscreenService hidePageWhenFullscreenService = this.this$0;
                Flow flowCombine = FlowKt.combine(hidePageWhenFullscreenService.f100014b, hidePageWhenFullscreenService.f100013a, hidePageWhenFullscreenService.f100016d.c(), this.this$0.f100015c.f123389b, AnonymousClass3.INSTANCE);
                FlowCollector flowCollector = a.f100018a;
                this.label = 1;
                if (flowCombine.collect(flowCollector, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/HidePageWhenFullscreenService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TouchAwareConstraintLayout f100019a;

        public a(@NotNull TouchAwareConstraintLayout touchAwareConstraintLayout) {
            this.f100019a = touchAwareConstraintLayout;
        }
    }

    @Inject
    public HidePageWhenFullscreenService(@NotNull Flow<Configuration> flow, @NotNull Flow<a> flow2, @NotNull C7893a c7893a, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull CoroutineScope coroutineScope) {
        this.f100013a = flow;
        this.f100014b = flow2;
        this.f100015c = c7893a;
        this.f100016d = cVar;
        this.f100017e = coroutineScope;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
