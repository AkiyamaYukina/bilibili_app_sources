package com.bilibili.ship.theseus.united.page.ad;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bapis.bilibili.app.viewunite.v1.CM;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import com.bilibili.gripper.api.ad.biz.videodetail.IAdPanelListener;
import com.bilibili.gripper.api.ad.biz.videodetail.IPanelCallback;
import com.bilibili.gripper.api.ad.biz.videodetail.IPanelData;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.gripper.api.ad.core.openapk.AdOpenApkScene;
import com.bilibili.gripper.api.ad.core.openapk.IAdOpenApkWatcher;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.page.view.d;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdRepository.class */
@StabilityInferred(parameters = 0)
public final class AdRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AdPanelRepository f98927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f98928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f98929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f98930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Flow<Boolean> f98931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f98932g;

    @NotNull
    public final Lazy h = LazyKt.lazy(LazyThreadSafetyMode.NONE, new As.a(this, 3));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IAdOpenApkWatcher f98933i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public String f98934j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<CM> f98935k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final StateFlow<CM> f98936l;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.AdRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AdRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdRepository adRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = adRepository;
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
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.this$0.f98927b.releasePanel();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.AdRepository$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdRepository$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AdRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.AdRepository$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdRepository$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final AdRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AdRepository adRepository, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = adRepository;
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
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f98933i.onWindowFocusChanged(this.Z$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AdRepository adRepository, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = adRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                AdRepository adRepository = this.this$0;
                Flow<Boolean> flow = adRepository.f98931f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(adRepository, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.AdRepository$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdRepository$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AdRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.AdRepository$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdRepository$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final AdRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AdRepository adRepository, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = adRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(c.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f98933i.onAvailable(((c.a) this.L$0).f102987a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AdRepository adRepository, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = adRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowC = this.this$0.f98932g.c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowC, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.AdRepository$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdRepository$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AdRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.AdRepository$4$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdRepository$4$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<d.a, Long, Continuation<? super Pair<? extends d.a, ? extends Long>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(d.a aVar, long j7, Continuation<? super Pair<d.a, Long>> continuation) {
                return AnonymousClass4.invokeSuspend$lambda$0(aVar, j7, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((d.a) obj, ((Number) obj2).longValue(), (Continuation<? super Pair<d.a, Long>>) obj3);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.AdRepository$4$4, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdRepository$4$4.class */
        public static final class C09444 extends SuspendLambda implements Function2<Pair<? extends d.a, ? extends Long>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final AdRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09444(AdRepository adRepository, Continuation<? super C09444> continuation) {
                super(2, continuation);
                this.this$0 = adRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09444 c09444 = new C09444(this.this$0, continuation);
                c09444.L$0 = obj;
                return c09444;
            }

            public final Object invoke(Pair<d.a, Long> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                d.a aVar = (d.a) pair.component1();
                long jLongValue = ((Number) pair.component2()).longValue();
                PageAdRepository pageAdRepository = this.this$0.f98928c;
                String str = aVar != null ? aVar.f104070n : null;
                String str2 = str;
                if (str == null) {
                    str2 = "";
                }
                pageAdRepository.h = str2;
                long j7 = aVar != null ? aVar.f104058a : 0L;
                pageAdRepository.getClass();
                pageAdRepository.f98949m.setValue(new i(j7, jLongValue));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AdRepository adRepository, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = adRepository;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(d.a aVar, long j7, Continuation continuation) {
            return new Pair(aVar, Boxing.boxLong(j7));
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                AdRepository adRepository = this.this$0;
                Flow flowCombine = FlowKt.combine(adRepository.f98929d.f104057d, adRepository.f98930e.f104038c, AnonymousClass3.INSTANCE);
                C09444 c09444 = new C09444(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, c09444, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdRepository$a.class */
    public static final class a implements IPanelCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AdRepository f98937a;

        public a(AdRepository adRepository) {
            this.f98937a = adRepository;
        }

        public final void dismissPanel() {
            this.f98937a.f98927b.dismissPanel();
        }

        public final boolean isPanelShowing() {
            return this.f98937a.f98927b.isPanelShowing();
        }

        public final <T extends IPanelData> void showPanel(int i7, T t7, IAdPanelListener iAdPanelListener) {
            this.f98937a.f98927b.showPanel(i7, t7, iAdPanelListener);
        }
    }

    @Inject
    public AdRepository(@NotNull CoroutineScope coroutineScope, @NotNull FragmentActivity fragmentActivity, @NotNull ViewReply viewReply, @NotNull AdPanelRepository adPanelRepository, @NotNull PageAdRepository pageAdRepository, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull Flow<Boolean> flow, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar) {
        this.f98926a = coroutineScope;
        this.f98927b = adPanelRepository;
        this.f98928c = pageAdRepository;
        this.f98929d = dVar;
        this.f98930e = aVar;
        this.f98931f = flow;
        this.f98932g = cVar;
        this.f98933i = GAdCoreKt.getGAdOpenApk().getWatcher(fragmentActivity, AdOpenApkScene.VideoDetail);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        MutableStateFlow<CM> MutableStateFlow = StateFlowKt.MutableStateFlow(viewReply.hasCm() ? viewReply.getCm() : null);
        this.f98935k = MutableStateFlow;
        this.f98936l = FlowKt.asStateFlow(MutableStateFlow);
    }

    @NotNull
    public final String a() {
        Bundle bundle = this.f98928c.f98948l;
        bundle.putString("ai_track_id", this.f98934j);
        return GAdCoreKt.getGAdExtra().get4UgcMerchandise(bundle);
    }

    @NotNull
    public final IPanelCallback b() {
        return (IPanelCallback) this.h.getValue();
    }
}
