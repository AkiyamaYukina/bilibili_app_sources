package com.bilibili.ship.theseus.united.page.toolbar.actionview.projection;

import com.bilibili.lib.projection.internal.widget.e;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository$special$$inlined$map$1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/projection/ToolbarCastScreenRepository$setProjectionGuideBubbleCallback$1$onBubbleShowSuccess$1.class */
final class ToolbarCastScreenRepository$setProjectionGuideBubbleCallback$1$onBubbleShowSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ToolbarCastScreenRepository this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.ToolbarCastScreenRepository$setProjectionGuideBubbleCallback$1$onBubbleShowSuccess$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/projection/ToolbarCastScreenRepository$setProjectionGuideBubbleCallback$1$onBubbleShowSuccess$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        boolean Z$0;
        int label;
        final ToolbarCastScreenRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ToolbarCastScreenRepository toolbarCastScreenRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = toolbarCastScreenRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            ToolbarCastScreenRepository toolbarCastScreenRepository;
            e eVar;
            e eVar2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.Z$0 && (eVar = (toolbarCastScreenRepository = this.this$0).f103342B) != null && eVar.isShowing() && (eVar2 = toolbarCastScreenRepository.f103342B) != null) {
                eVar2.dismiss();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarCastScreenRepository$setProjectionGuideBubbleCallback$1$onBubbleShowSuccess$1(ToolbarCastScreenRepository toolbarCastScreenRepository, Continuation<? super ToolbarCastScreenRepository$setProjectionGuideBubbleCallback$1$onBubbleShowSuccess$1> continuation) {
        super(2, continuation);
        this.this$0 = toolbarCastScreenRepository;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ToolbarCastScreenRepository$setProjectionGuideBubbleCallback$1$onBubbleShowSuccess$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ToolbarCastScreenRepository toolbarCastScreenRepository = this.this$0;
            TheseusCastScreenRepository$special$$inlined$map$1 theseusCastScreenRepository$special$$inlined$map$1 = new TheseusCastScreenRepository$special$$inlined$map$1(toolbarCastScreenRepository.f103353n.f99126c);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(toolbarCastScreenRepository, null);
            this.label = 1;
            if (FlowKt.collectLatest(theseusCastScreenRepository$special$$inlined$map$1, anonymousClass1, this) == coroutine_suspended) {
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
