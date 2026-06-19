package com.bilibili.ship.theseus.ogv.intro.section.ui;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/OgvEpisodeRelatedToFeatureUIComponent$bindToView$2.class */
final class OgvEpisodeRelatedToFeatureUIComponent$bindToView$2 extends SuspendLambda implements Function2<List<? extends RunningUIComponent>, Continuation<? super Unit>, Object> {
    final com.bilibili.app.gemini.ui.f $adapter;
    Object L$0;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.ui.OgvEpisodeRelatedToFeatureUIComponent$bindToView$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/OgvEpisodeRelatedToFeatureUIComponent$bindToView$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final List<RunningUIComponent> $runningUIComponentList;
        private Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<RunningUIComponent> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$runningUIComponentList = list;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$runningUIComponentList, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Iterator<T> it = this.$runningUIComponentList.iterator();
            while (it.hasNext()) {
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new OgvEpisodeRelatedToFeatureUIComponent$bindToView$2$1$1$1((RunningUIComponent) it.next(), null), 3, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvEpisodeRelatedToFeatureUIComponent$bindToView$2(com.bilibili.app.gemini.ui.f fVar, Continuation<? super OgvEpisodeRelatedToFeatureUIComponent$bindToView$2> continuation) {
        super(2, continuation);
        this.$adapter = fVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvEpisodeRelatedToFeatureUIComponent$bindToView$2 ogvEpisodeRelatedToFeatureUIComponent$bindToView$2 = new OgvEpisodeRelatedToFeatureUIComponent$bindToView$2(this.$adapter, continuation);
        ogvEpisodeRelatedToFeatureUIComponent$bindToView$2.L$0 = obj;
        return ogvEpisodeRelatedToFeatureUIComponent$bindToView$2;
    }

    public final Object invoke(List<RunningUIComponent> list, Continuation<? super Unit> continuation) {
        return create(list, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((RunningUIComponent) it.next()).a);
            }
            this.$adapter.N(arrayList);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(list, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
