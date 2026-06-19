package com.bilibili.ship.theseus.cheese.biz.intro.season;

import androidx.compose.foundation.text.selection.C3751q;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6355q;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6356s;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonActivity;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonService;
import com.bilibili.ship.theseus.united.page.intro.module.season.Z;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import eu0.C6985d;
import java.util.HashMap;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/season/CheeseSeasonService.class */
@StabilityInferred(parameters = 0)
public final class CheeseSeasonService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f90032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PageReportService f90033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonDetailRepository f90034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C7893a f90035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C6356s f90036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f90037g;

    @NotNull
    public final UnitedSeasonService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f90038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f90039j;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.season.CheeseSeasonService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/season/CheeseSeasonService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseSeasonService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.season.CheeseSeasonService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/season/CheeseSeasonService$1$1.class */
        public static final class C06321 extends SuspendLambda implements Function2<C6985d, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheeseSeasonService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06321(CheeseSeasonService cheeseSeasonService, Continuation<? super C06321> continuation) {
                super(2, continuation);
                this.this$0 = cheeseSeasonService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06321 c06321 = new C06321(this.this$0, continuation);
                c06321.L$0 = obj;
                return c06321;
            }

            public final Object invoke(C6985d c6985d, Continuation<? super Unit> continuation) {
                return create(c6985d, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C6985d c6985d = (C6985d) this.L$0;
                if (!this.this$0.f90034d.a(c6985d.f117510e, c6985d.f117511f)) {
                    UnitedSeasonDetailRepository unitedSeasonDetailRepository = this.this$0.f90034d;
                    unitedSeasonDetailRepository.f101573d.setValue(0L);
                    unitedSeasonDetailRepository.f101571b.setValue(CollectionsKt.emptyList());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseSeasonService cheeseSeasonService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseSeasonService;
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
                Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.f90037g.f90695y);
                C06321 c06321 = new C06321(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFilterNotNull, c06321, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/season/CheeseSeasonService$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Ref.ObjectRef<com.bilibili.ship.theseus.cheese.biz.intro.season.a> f90040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Ref.ObjectRef<C6353o> f90041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Ref.ObjectRef<String> f90042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CheeseSeasonService f90043d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Ref.BooleanRef f90044e;

        public a(Ref.ObjectRef<com.bilibili.ship.theseus.cheese.biz.intro.season.a> objectRef, Ref.ObjectRef<C6353o> objectRef2, Ref.ObjectRef<String> objectRef3, CheeseSeasonService cheeseSeasonService, Ref.BooleanRef booleanRef) {
            this.f90040a = objectRef;
            this.f90041b = objectRef2;
            this.f90042c = objectRef3;
            this.f90043d = cheeseSeasonService;
            this.f90044e = booleanRef;
        }

        public final String a() {
            return (String) this.f90042c.element;
        }

        public final void b(boolean z6) {
            Ref.ObjectRef<C6353o> objectRef = this.f90041b;
            Integer numValueOf = null;
            CheeseSeasonService cheeseSeasonService = this.f90043d;
            if (!z6) {
                PageReportService pageReportService = cheeseSeasonService.f90033c;
                HashMap map = new HashMap();
                map.put("goto_daid", String.valueOf(((C6353o) objectRef.element).f101669a));
                UnitedSeasonActivity unitedSeasonActivity = ((C6353o) objectRef.element).f101678k;
                Integer numValueOf2 = null;
                if (unitedSeasonActivity != null) {
                    numValueOf2 = Integer.valueOf(unitedSeasonActivity.k());
                }
                map.put("clockin_type", String.valueOf(numValueOf2));
                Unit unit = Unit.INSTANCE;
                PageReportService.g(pageReportService, "united.player-video-detail.base-drama.0.click", map, 4);
                return;
            }
            Ref.BooleanRef booleanRef = this.f90044e;
            if (booleanRef.element) {
                return;
            }
            PageReportService pageReportService2 = cheeseSeasonService.f90033c;
            HashMap map2 = new HashMap();
            map2.put("goto_daid", String.valueOf(((C6353o) objectRef.element).f101669a));
            UnitedSeasonActivity unitedSeasonActivity2 = ((C6353o) objectRef.element).f101678k;
            if (unitedSeasonActivity2 != null) {
                numValueOf = Integer.valueOf(unitedSeasonActivity2.k());
            }
            map2.put("clockin_type", String.valueOf(numValueOf));
            Unit unit2 = Unit.INSTANCE;
            PageReportService.i(pageReportService2, "united.player-video-detail.base-drama.0.show", map2, 4);
            booleanRef.element = true;
        }
    }

    @Inject
    public CheeseSeasonService(@NotNull CoroutineScope coroutineScope, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull PageReportService pageReportService, @NotNull UnitedSeasonDetailRepository unitedSeasonDetailRepository, @NotNull C7893a c7893a, @NotNull C6356s c6356s, @NotNull CheesePlayRepository cheesePlayRepository, @NotNull UnitedSeasonService unitedSeasonService) {
        this.f90031a = coroutineScope;
        this.f90032b = theseusFloatLayerService;
        this.f90033c = pageReportService;
        this.f90034d = unitedSeasonDetailRepository;
        this.f90035e = c7893a;
        this.f90036f = c6356s;
        this.f90037g = cheesePlayRepository;
        this.h = unitedSeasonService;
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.f90038i = MutableStateFlow;
        this.f90039j = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public static final void a(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, long j7) {
        C6353o c6353o = (C6353o) objectRef.element;
        long j8 = c6353o.f101672d;
        Iterator<Z> it = c6353o.h.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Iterator<C6355q> it2 = it.next().f101648d.iterator();
            int i8 = i7;
            while (true) {
                i7 = i8;
                if (it2.hasNext()) {
                    if (it2.next().f101682b == j7) {
                        objectRef2.element = (i8 + 1) + "/" + j8;
                        return;
                    }
                    i8++;
                }
            }
        }
    }

    public final void b(@NotNull C6353o c6353o) {
        if (c6353o.f101672d <= 0) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = c6353o;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = C3751q.a(((C6353o) objectRef.element).f101672d, "1/");
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        CheeseSeasonComponent cheeseSeasonComponent = new CheeseSeasonComponent(new a(objectRef3, objectRef, objectRef2, this, new Ref.BooleanRef()), this.f90039j, this.f90034d.f101572c);
        BuildersKt.launch$default(this.f90031a, (CoroutineContext) null, (CoroutineStart) null, new CheeseSeasonService$create$1(this, objectRef3, objectRef, objectRef2, null), 3, (Object) null);
        BuildersKt.launch$default(this.f90031a, (CoroutineContext) null, (CoroutineStart) null, new CheeseSeasonService$create$2(this, objectRef, c6353o, objectRef3, objectRef2, null), 3, (Object) null);
        BuildersKt.launch$default(this.f90031a, (CoroutineContext) null, (CoroutineStart) null, new CheeseSeasonService$create$3(this, cheeseSeasonComponent, null), 3, (Object) null);
    }
}
