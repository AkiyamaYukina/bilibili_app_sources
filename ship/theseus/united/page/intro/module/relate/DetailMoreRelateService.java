package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.RelateTab;
import com.bilibili.ship.theseus.united.page.intro.module.relate.footer.DetailFooterComponent;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailMoreRelateService.class */
@StabilityInferred(parameters = 0)
public final class DetailMoreRelateService {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f100835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f100836m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f100837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C6318i f100838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.intro.module.relate.footer.c f100839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final DetailRelateRepository f100840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final DetailRelateService f100841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IntroRecycleViewService f100842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C6322k f100843g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f100844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f100845j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final a f100846k = new a(this);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailMoreRelateService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailMoreRelateService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final DetailMoreRelateService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DetailMoreRelateService detailMoreRelateService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = detailMoreRelateService;
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
                    DetailMoreRelateService detailMoreRelateService = this.this$0;
                    detailMoreRelateService.f100842f.a(detailMoreRelateService.f100846k);
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
                DetailMoreRelateService detailMoreRelateService2 = this.this$0;
                ((ArrayList) detailMoreRelateService2.f100842f.f100041g).remove(detailMoreRelateService2.f100846k);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailMoreRelateService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailMoreRelateService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final DetailMoreRelateService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailMoreRelateService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailMoreRelateService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super Integer>, Object> {
            int I$0;
            int label;
            final DetailMoreRelateService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DetailMoreRelateService detailMoreRelateService, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.this$0 = detailMoreRelateService;
            }

            public final Object invoke(int i7, int i8, Continuation<? super Integer> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.I$0 = i8;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (Continuation<? super Integer>) obj3);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = this.I$0;
                defpackage.a.b("[theseus-united-DetailMoreRelateService$2$1-invokeSuspend] ", com.bilibili.app.comm.bh.x5.b.a("init, recyclerViewBindFlow, recyclerViewLoadCheck: ", this.this$0.f100845j), "DetailMoreRelateService$2$1-invokeSuspend");
                this.this$0.f100845j = true;
                return Boxing.boxInt(i7);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DetailMoreRelateService detailMoreRelateService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = detailMoreRelateService;
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
                DetailMoreRelateService detailMoreRelateService = this.this$0;
                StateFlow<Integer> stateFlow = detailMoreRelateService.f100842f.f100044k;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(detailMoreRelateService, null);
                this.label = 1;
                if (FlowKt.reduce(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailMoreRelateService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailMoreRelateService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final DetailMoreRelateService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailMoreRelateService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailMoreRelateService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final DetailMoreRelateService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DetailMoreRelateService detailMoreRelateService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = detailMoreRelateService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                RelateTab relateTabB = this.this$0.f100840d.b();
                if (relateTabB == null) {
                    BLog.e("DetailMoreRelateService", "reloadFlow, tab is null");
                    return Unit.INSTANCE;
                }
                this.this$0.b(relateTabB);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(DetailMoreRelateService detailMoreRelateService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = detailMoreRelateService;
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
                DetailMoreRelateService detailMoreRelateService = this.this$0;
                SharedFlow<Unit> sharedFlow = detailMoreRelateService.f100838b.f101254g;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(detailMoreRelateService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailMoreRelateService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailMoreRelateService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final DetailMoreRelateService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(DetailMoreRelateService detailMoreRelateService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = detailMoreRelateService;
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
            boolean z6 = true;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<q0> stateFlow = this.this$0.f100840d.f100853c;
                this.label = 1;
                Object objA = com.bilibili.ogv.infra.coroutine.b.a(stateFlow, this);
                obj = objA;
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            q0 q0Var = (q0) obj;
            String str = q0Var.f101367d.f101373c.f101190b;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            DetailMoreRelateService detailMoreRelateService = this.this$0;
            detailMoreRelateService.h = false;
            RelateTab relateTabB = detailMoreRelateService.f100840d.b();
            if (relateTabB != null) {
                RelateTab.RelateTabStatus relateTabStatus = RelateTab.RelateTabStatus.INIT;
                relateTabB.f101052e = str2;
                if (str2.length() <= 0) {
                    z6 = false;
                }
                relateTabB.f101053f = z6;
                relateTabB.f101054g = 1L;
            }
            DetailMoreRelateService detailMoreRelateService2 = this.this$0;
            DetailFooterComponent.FooterType footerType = (!((ArrayList) q0Var.f101364a).isEmpty() && str2.length() == 0) ? DetailFooterComponent.FooterType.ReachEnd : DetailFooterComponent.FooterType.None;
            detailMoreRelateService2.f100839c.f101200b.setValue(footerType);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailMoreRelateService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailMoreRelateService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final DetailMoreRelateService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailMoreRelateService$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailMoreRelateService$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
            boolean Z$0;
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Boolean> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.Z$0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(DetailMoreRelateService detailMoreRelateService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = detailMoreRelateService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 235
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailMoreRelateService.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailMoreRelateService$a.class */
    public static final class a extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DetailMoreRelateService f100847a;

        public a(DetailMoreRelateService detailMoreRelateService) {
            this.f100847a = detailMoreRelateService;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            DetailMoreRelateService detailMoreRelateService = this.f100847a;
            detailMoreRelateService.getClass();
            if (i7 == 1) {
                detailMoreRelateService.f100843g.f101271a = true;
                detailMoreRelateService.f100844i = true;
            } else if (detailMoreRelateService.f100844i && i7 == 0) {
                detailMoreRelateService.f100844i = false;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            RecyclerView.Adapter adapter;
            DetailMoreRelateService detailMoreRelateService = this.f100847a;
            if (i8 >= 0 && detailMoreRelateService.f100844i) {
                detailMoreRelateService.f100845j = false;
                detailMoreRelateService.a(recyclerView);
                return;
            }
            defpackage.a.b("[theseus-united-DetailMoreRelateService$scrollListener$1-onScrolled] ", "onScrolled, ignore, dy " + i8 + ", dragged " + detailMoreRelateService.f100844i, "DetailMoreRelateService$scrollListener$1-onScrolled");
            if (detailMoreRelateService.f100845j) {
                detailMoreRelateService.f100845j = false;
                int childCount = recyclerView.getChildCount();
                if (childCount <= 0 || (adapter = recyclerView.getAdapter()) == null) {
                    return;
                }
                int iA = com.bilibili.app.authorspace.ui.b.a(recyclerView, childCount, 1);
                BLog.i("DetailMoreRelateService$scrollListener$1-onScrolled", "[theseus-united-DetailMoreRelateService$scrollListener$1-onScrolled] " + G.f.a(iA, adapter.getItemCount(), "onScrolled, first check, lastVisiblePosition ", ", itemCount "));
                if (iA == adapter.getItemCount() - 1) {
                    detailMoreRelateService.a(recyclerView);
                }
            }
        }
    }

    static {
        Integer intOrNull;
        Integer intOrNull2;
        String str = (String) Contract.get$default(ConfigManager.Companion.config(), "videodetail.relate_load_more_page_multiple", (Object) null, 2, (Object) null);
        int iIntValue = (str == null || (intOrNull2 = StringsKt.toIntOrNull(str)) == null) ? 3 : intOrNull2.intValue();
        if (iIntValue <= 0) {
            iIntValue = 3;
        }
        f100835l = iIntValue;
        String str2 = (String) Contract.get$default(ConfigManager.Companion.config(), "videodetail.relates_feed_max_count", (Object) null, 2, (Object) null);
        int iIntValue2 = (str2 == null || (intOrNull = StringsKt.toIntOrNull(str2)) == null) ? 1000 : intOrNull.intValue();
        if (iIntValue2 <= 0) {
            iIntValue2 = 1000;
        }
        f100836m = iIntValue2;
    }

    @Inject
    public DetailMoreRelateService(@NotNull CoroutineScope coroutineScope, @NotNull C6318i c6318i, @NotNull com.bilibili.ship.theseus.united.page.intro.module.relate.footer.c cVar, @NotNull DetailRelateRepository detailRelateRepository, @NotNull DetailRelateService detailRelateService, @NotNull IntroRecycleViewService introRecycleViewService, @NotNull C6322k c6322k) {
        this.f100837a = coroutineScope;
        this.f100838b = c6318i;
        this.f100839c = cVar;
        this.f100840d = detailRelateRepository;
        this.f100841e = detailRelateService;
        this.f100842f = introRecycleViewService;
        this.f100843g = c6322k;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView.Adapter adapter;
        RelateTab relateTabB = this.f100840d.b();
        if (relateTabB == null) {
            BLog.e("DetailMoreRelateService", "checkAndLoad, tab is null");
            return;
        }
        int childCount = recyclerView.getChildCount();
        if (childCount <= 0 || !relateTabB.f101053f || this.h || (adapter = recyclerView.getAdapter()) == null || com.bilibili.app.authorspace.ui.b.a(recyclerView, childCount, 1) < (adapter.getItemCount() - 1) - f100835l) {
            return;
        }
        b(relateTabB);
    }

    public final void b(RelateTab relateTab) {
        String str = relateTab.f101052e;
        long j7 = relateTab.f101054g;
        BLog.i("DetailMoreRelateService", androidx.core.content.c.b(j7, "request next ", str, ", page "));
        if (str.length() == 0) {
            return;
        }
        BuildersKt.launch$default(this.f100837a, (CoroutineContext) null, (CoroutineStart) null, new DetailMoreRelateService$request$1(this, str, relateTab.f101048a, relateTab.f101049b, relateTab, j7, null), 3, (Object) null);
    }
}
