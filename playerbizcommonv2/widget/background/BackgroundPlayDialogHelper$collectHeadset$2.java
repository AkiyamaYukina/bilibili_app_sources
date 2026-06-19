package com.bilibili.playerbizcommonv2.widget.background;

import com.bilibili.playerbizcommonv2.widget.background.BackgroundPlayDialogHelper$collectHeadset$2;
import com.bilibili.playerbizcommonv2.widget.background.g;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import uq0.InterfaceC8754b;
import uq0.InterfaceC8755c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/background/BackgroundPlayDialogHelper$collectHeadset$2.class */
final class BackgroundPlayDialogHelper$collectHeadset$2 extends SuspendLambda implements Function2<ProducerScope<? super Unit>, Continuation<? super Unit>, Object> {
    final InterfaceC8755c $headsetService;
    final Function0<Unit> $onClose;
    private Object L$0;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/background/BackgroundPlayDialogHelper$collectHeadset$2$a.class */
    public static final class a implements InterfaceC8754b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProducerScope<Unit> f82299a;

        public a(ProducerScope<? super Unit> producerScope) {
            this.f82299a = producerScope;
        }

        @Override // uq0.InterfaceC8754b
        public final void a() {
            f();
        }

        @Override // uq0.InterfaceC8754b
        public final void b() {
            f();
        }

        @Override // uq0.InterfaceC8754b
        public final void c(String str) {
            if (Intrinsics.areEqual(str, "com.bilibili.player.music.notification.favorite") || Intrinsics.areEqual(str, "com.bilibili.player.music.notification.unfavorite")) {
                g();
            }
            f();
        }

        @Override // uq0.InterfaceC8754b
        public final void d() {
            g();
        }

        @Override // uq0.InterfaceC8754b
        public final void e() {
            g();
        }

        public final void f() {
            boolean z6 = g.f82315k;
            if (g.a.a()) {
                ChannelsKt.trySendBlocking(this.f82299a, Unit.INSTANCE);
            }
        }

        public final void g() {
            boolean z6 = g.f82315k;
            if (g.a.a()) {
                return;
            }
            ChannelsKt.trySendBlocking(this.f82299a, Unit.INSTANCE);
        }

        @Override // uq0.InterfaceC8754b
        public final void pause() {
            g();
        }

        @Override // uq0.InterfaceC8754b
        public final void resume() {
            ChannelsKt.trySendBlocking(this.f82299a, Unit.INSTANCE);
        }

        @Override // uq0.InterfaceC8754b
        public final void rewind() {
            f();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayDialogHelper$collectHeadset$2(InterfaceC8755c interfaceC8755c, Function0<Unit> function0, Continuation<? super BackgroundPlayDialogHelper$collectHeadset$2> continuation) {
        super(2, continuation);
        this.$headsetService = interfaceC8755c;
        this.$onClose = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(InterfaceC8755c interfaceC8755c, a aVar, Function0 function0) {
        interfaceC8755c.removeHeadsetEventObserver(aVar);
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BackgroundPlayDialogHelper$collectHeadset$2 backgroundPlayDialogHelper$collectHeadset$2 = new BackgroundPlayDialogHelper$collectHeadset$2(this.$headsetService, this.$onClose, continuation);
        backgroundPlayDialogHelper$collectHeadset$2.L$0 = obj;
        return backgroundPlayDialogHelper$collectHeadset$2;
    }

    public final Object invoke(ProducerScope<? super Unit> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            final a aVar = new a(producerScope);
            this.$headsetService.addHeadsetEventObserver(aVar);
            final InterfaceC8755c interfaceC8755c = this.$headsetService;
            final Function0<Unit> function0 = this.$onClose;
            Function0 function02 = new Function0(interfaceC8755c, aVar, function0) { // from class: com.bilibili.playerbizcommonv2.widget.background.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final InterfaceC8755c f82333a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final BackgroundPlayDialogHelper$collectHeadset$2.a f82334b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f82335c;

                {
                    this.f82333a = interfaceC8755c;
                    this.f82334b = aVar;
                    this.f82335c = function0;
                }

                public final Object invoke() {
                    return BackgroundPlayDialogHelper$collectHeadset$2.invokeSuspend$lambda$0(this.f82333a, this.f82334b, this.f82335c);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, function02, this) == coroutine_suspended) {
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
