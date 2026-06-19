package com.bilibili.ship.theseus.ogv.intro.section.ui;

import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/OgvFeatureEpisodeSectionUIComponent$bindToView$2.class */
final class OgvFeatureEpisodeSectionUIComponent$bindToView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final UIComponent.b<RecyclerView> $viewEntry;
    private Object L$0;
    int label;
    final p this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.ui.OgvFeatureEpisodeSectionUIComponent$bindToView$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/OgvFeatureEpisodeSectionUIComponent$bindToView$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final UIComponent.b<RecyclerView> $viewEntry;
        int label;
        final p this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UIComponent.b<RecyclerView> bVar, p pVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$viewEntry = bVar;
            this.this$0 = pVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$viewEntry, this.this$0, continuation);
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
            ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(this.$viewEntry.a, this.this$0.f93867b);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvFeatureEpisodeSectionUIComponent$bindToView$2(UIComponent.b<RecyclerView> bVar, p pVar, Continuation<? super OgvFeatureEpisodeSectionUIComponent$bindToView$2> continuation) {
        super(2, continuation);
        this.$viewEntry = bVar;
        this.this$0 = pVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvFeatureEpisodeSectionUIComponent$bindToView$2 ogvFeatureEpisodeSectionUIComponent$bindToView$2 = new OgvFeatureEpisodeSectionUIComponent$bindToView$2(this.$viewEntry, this.this$0, continuation);
        ogvFeatureEpisodeSectionUIComponent$bindToView$2.L$0 = obj;
        return ogvFeatureEpisodeSectionUIComponent$bindToView$2;
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
        return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$viewEntry, this.this$0, null), 3, (Object) null);
    }
}
