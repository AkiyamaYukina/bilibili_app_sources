package com.bilibili.ship.theseus.ogv.web;

import androidx.fragment.app.Fragment;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.floatlayer.e;
import com.bilibili.ship.theseus.united.page.floatlayer.j;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/web/OgvWebAndExternalBizFloatLayerService$showVipPaymentLayer$2.class */
final class OgvWebAndExternalBizFloatLayerService$showVipPaymentLayer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final e<? extends Fragment> $fragmentUIComponent;
    private Object L$0;
    int label;
    final b this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.web.OgvWebAndExternalBizFloatLayerService$showVipPaymentLayer$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/web/OgvWebAndExternalBizFloatLayerService$showVipPaymentLayer$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final e<? extends Fragment> $fragmentUIComponent;
        private Object L$0;
        int label;
        final b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e<? extends Fragment> eVar, b bVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$fragmentUIComponent = eVar;
            this.this$0 = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(CoroutineScope coroutineScope) {
            CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$fragmentUIComponent, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                UIComponent<?> jVar = new j<>(this.$fragmentUIComponent, new a((CoroutineScope) this.L$0));
                TheseusFloatLayerService theseusFloatLayerService = this.this$0.f94916a;
                this.label = 1;
                if (theseusFloatLayerService.h(jVar, theseusFloatLayerService.f99664n, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvWebAndExternalBizFloatLayerService$showVipPaymentLayer$2(e<? extends Fragment> eVar, b bVar, Continuation<? super OgvWebAndExternalBizFloatLayerService$showVipPaymentLayer$2> continuation) {
        super(2, continuation);
        this.$fragmentUIComponent = eVar;
        this.this$0 = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvWebAndExternalBizFloatLayerService$showVipPaymentLayer$2 ogvWebAndExternalBizFloatLayerService$showVipPaymentLayer$2 = new OgvWebAndExternalBizFloatLayerService$showVipPaymentLayer$2(this.$fragmentUIComponent, this.this$0, continuation);
        ogvWebAndExternalBizFloatLayerService$showVipPaymentLayer$2.L$0 = obj;
        return ogvWebAndExternalBizFloatLayerService$showVipPaymentLayer$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$fragmentUIComponent, this.this$0, null), 3, (Object) null);
    }
}
