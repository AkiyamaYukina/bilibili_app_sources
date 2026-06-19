package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import zu0.U0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvPreviewSectionMergedFloatLayerUIComponent$bind$2.class */
final class OgvPreviewSectionMergedFloatLayerUIComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final com.bilibili.app.gemini.ui.f $adapter;
    final U0 $binding;
    private Object L$0;
    int label;
    final g this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvPreviewSectionMergedFloatLayerUIComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvPreviewSectionMergedFloatLayerUIComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends UIComponent<?>>, Continuation<? super Unit>, Object> {
        final com.bilibili.app.gemini.ui.f $adapter;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.app.gemini.ui.f fVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$adapter = fVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adapter, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(List<? extends UIComponent<?>> list, Continuation<? super Unit> continuation) {
            return create(list, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$adapter.N((List) this.L$0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvPreviewSectionMergedFloatLayerUIComponent$bind$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvPreviewSectionMergedFloatLayerUIComponent$bind$2$4.class */
    public static final /* synthetic */ class AnonymousClass4 extends AdaptedFunctionReference implements Function3<OgvEpisode, List<? extends UIComponent<?>>, Continuation<? super Pair<? extends OgvEpisode, ? extends List<? extends UIComponent<?>>>>, Object>, SuspendFunction {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        public final Object invoke(OgvEpisode ogvEpisode, List<? extends UIComponent<?>> list, Continuation<? super Pair<OgvEpisode, ? extends List<? extends UIComponent<?>>>> continuation) {
            return OgvPreviewSectionMergedFloatLayerUIComponent$bind$2.invokeSuspend$lambda$0(ogvEpisode, list, continuation);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvPreviewSectionMergedFloatLayerUIComponent$bind$2$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvPreviewSectionMergedFloatLayerUIComponent$bind$2$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<Pair<? extends OgvEpisode, ? extends List<? extends UIComponent<?>>>, Continuation<? super Unit>, Object> {
        final U0 $binding;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(U0 u02, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$binding = u02;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$binding, continuation);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        public final Object invoke(Pair<OgvEpisode, ? extends List<? extends UIComponent<?>>> pair, Continuation<? super Unit> continuation) {
            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.L$0;
            List list = (List) pair.getSecond();
            OgvEpisode ogvEpisode = (OgvEpisode) pair.getFirst();
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((UIComponent) it.next()).a());
            }
            Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i7 = -1;
                    break;
                }
                if (Intrinsics.areEqual(ogvEpisode != null ? Boxing.boxLong(ogvEpisode.f93555a) : null, ((com.bilibili.ship.theseus.ogv.intro.section.ui.m) it2.next()).f93840d)) {
                    break;
                }
                i7++;
            }
            if (i7 != -1) {
                RecyclerView.LayoutManager layoutManager = this.$binding.f130580x.getLayoutManager();
                LinearLayoutManager linearLayoutManager = null;
                if (layoutManager instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) layoutManager;
                }
                if (linearLayoutManager != null) {
                    linearLayoutManager.scrollToPositionWithOffset(i7, (int) Uj0.c.a(48, this.$binding.getRoot().getContext()));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvPreviewSectionMergedFloatLayerUIComponent$bind$2$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvPreviewSectionMergedFloatLayerUIComponent$bind$2$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final U0 $binding;
        int label;
        final g this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvPreviewSectionMergedFloatLayerUIComponent$bind$2$6$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvPreviewSectionMergedFloatLayerUIComponent$bind$2$6$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final U0 f93618a;

            public a(U0 u02) {
                this.f93618a = u02;
            }

            public final Object emit(Object obj, Continuation continuation) {
                WindowSizeClass windowSizeClass = (WindowSizeClass) obj;
                ((GridLayoutManager) this.f93618a.f130580x.getLayoutManager()).setSpanSizeLookup(new d(com.bilibili.ship.theseus.united.page.screensize.b.c(windowSizeClass) || com.bilibili.ship.theseus.united.page.screensize.b.b(windowSizeClass)));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(g gVar, U0 u02, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = gVar;
            this.$binding = u02;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<WindowSizeClass> stateFlow = this.this$0.f93660e;
                a aVar = new a(this.$binding);
                this.label = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvPreviewSectionMergedFloatLayerUIComponent$bind$2(g gVar, com.bilibili.app.gemini.ui.f fVar, U0 u02, Continuation<? super OgvPreviewSectionMergedFloatLayerUIComponent$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$adapter = fVar;
        this.$binding = u02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$lambda$0(OgvEpisode ogvEpisode, List list, Continuation continuation) {
        return new Pair(ogvEpisode, list);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvPreviewSectionMergedFloatLayerUIComponent$bind$2 ogvPreviewSectionMergedFloatLayerUIComponent$bind$2 = new OgvPreviewSectionMergedFloatLayerUIComponent$bind$2(this.this$0, this.$adapter, this.$binding, continuation);
        ogvPreviewSectionMergedFloatLayerUIComponent$bind$2.L$0 = obj;
        return ogvPreviewSectionMergedFloatLayerUIComponent$bind$2;
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
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        FlowKt.launchIn(FlowKt.onEach(this.this$0.f93657b, new AnonymousClass1(this.$adapter, null)), coroutineScope);
        g gVar = this.this$0;
        FlowKt.launchIn(FlowKt.onEach(FlowKt.flowCombine(gVar.f93659d, gVar.f93657b, AnonymousClass4.INSTANCE), new AnonymousClass5(this.$binding, null)), coroutineScope);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this.this$0, this.$binding, null), 3, (Object) null);
    }
}
