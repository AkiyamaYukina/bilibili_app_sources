package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.h;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.o;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.u;
import com.bilibili.ship.theseus.ogv.intro.section.ui.u;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$2$1.class */
public final class OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final u.a $caVm;
    final u.a $item;
    final com.bilibili.ship.theseus.ogv.intro.section.ui.u $seasonListUIComponent;
    final o.b $vm;
    final h.a $wrapVm;
    int label;
    final OgvSectionFloatLayerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$2$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$2$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
        final u.a $caVm;
        final com.bilibili.ship.theseus.ogv.intro.section.ui.u $seasonListUIComponent;
        final o.b $vm;
        final h.a $wrapVm;
        long J$0;
        int label;
        final OgvSectionFloatLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.ship.theseus.ogv.intro.section.ui.u uVar, OgvSectionFloatLayerService ogvSectionFloatLayerService, o.b bVar, h.a aVar, u.a aVar2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$seasonListUIComponent = uVar;
            this.this$0 = ogvSectionFloatLayerService;
            this.$vm = bVar;
            this.$wrapVm = aVar;
            this.$caVm = aVar2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$seasonListUIComponent, this.this$0, this.$vm, this.$wrapVm, this.$caVm, continuation);
            anonymousClass1.J$0 = ((Number) obj).longValue();
            return anonymousClass1;
        }

        public final Object invoke(long j7, Continuation<? super Unit> continuation) {
            return create(Long.valueOf(j7), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).longValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                long j7 = this.J$0;
                this.$seasonListUIComponent.e(j7);
                OgvSectionFloatLayerService ogvSectionFloatLayerService = this.this$0;
                o.b bVar = this.$vm;
                h.a aVar = this.$wrapVm;
                u.a aVar2 = this.$caVm;
                this.label = 1;
                if (OgvSectionFloatLayerService.b(ogvSectionFloatLayerService, j7, bVar, aVar, aVar2, this) == coroutine_suspended) {
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
    public OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$2$1(u.a aVar, com.bilibili.ship.theseus.ogv.intro.section.ui.u uVar, OgvSectionFloatLayerService ogvSectionFloatLayerService, o.b bVar, h.a aVar2, u.a aVar3, Continuation<? super OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$2$1> continuation) {
        super(2, continuation);
        this.$item = aVar;
        this.$seasonListUIComponent = uVar;
        this.this$0 = ogvSectionFloatLayerService;
        this.$vm = bVar;
        this.$wrapVm = aVar2;
        this.$caVm = aVar3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$2$1(this.$item, this.$seasonListUIComponent, this.this$0, this.$vm, this.$wrapVm, this.$caVm, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<Long> mutableSharedFlow = this.$item.f93885a.f93887b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$seasonListUIComponent, this.this$0, this.$vm, this.$wrapVm, this.$caVm, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableSharedFlow, anonymousClass1, this) == coroutine_suspended) {
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
