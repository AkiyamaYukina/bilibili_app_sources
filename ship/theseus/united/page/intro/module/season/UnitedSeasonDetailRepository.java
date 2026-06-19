package com.bilibili.ship.theseus.united.page.intro.module.season;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonDetailRepository.class */
@StabilityInferred(parameters = 0)
public final class UnitedSeasonDetailRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f101570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<List<C6353o>> f101571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<List<C6353o>> f101572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Long> f101573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<Long> f101574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Long> f101575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Long> f101576g;

    @Nullable
    public final C6353o h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<C6355q> f101577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final SharedFlow<C6355q> f101578j;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonDetailRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C6356s $seasonPageRepository;
        int label;
        final UnitedSeasonDetailRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonDetailRepository$1$1.class */
        public static final class C10501 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final Ref.BooleanRef $reverse;
            boolean Z$0;
            int label;
            final UnitedSeasonDetailRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10501(Ref.BooleanRef booleanRef, UnitedSeasonDetailRepository unitedSeasonDetailRepository, Continuation<? super C10501> continuation) {
                super(2, continuation);
                this.$reverse = booleanRef;
                this.this$0 = unitedSeasonDetailRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10501 c10501 = new C10501(this.$reverse, this.this$0, continuation);
                c10501.Z$0 = ((Boolean) obj).booleanValue();
                return c10501;
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
                boolean z6 = this.Z$0;
                Ref.BooleanRef booleanRef = this.$reverse;
                if (z6 == booleanRef.element) {
                    return Unit.INSTANCE;
                }
                booleanRef.element = z6;
                UnitedSeasonDetailRepository unitedSeasonDetailRepository = this.this$0;
                List<C6353o> listB = unitedSeasonDetailRepository.b();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listB, 10));
                Iterator<T> it = listB.iterator();
                while (it.hasNext()) {
                    arrayList.add(C6354p.a((C6353o) it.next()));
                }
                unitedSeasonDetailRepository.f101571b.setValue(arrayList);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C6356s c6356s, UnitedSeasonDetailRepository unitedSeasonDetailRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$seasonPageRepository = c6356s;
            this.this$0 = unitedSeasonDetailRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$seasonPageRepository, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                Ref.BooleanRef booleanRefA = androidx.paging.Y.a(obj);
                MutableStateFlow mutableStateFlow = this.$seasonPageRepository.f101701b;
                C10501 c10501 = new C10501(booleanRefA, this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c10501, this) == coroutine_suspended) {
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

    @Inject
    public UnitedSeasonDetailRepository(@NotNull CoroutineScope coroutineScope, @NotNull ViewReply viewReply, @NotNull Y y6, @NotNull C6356s c6356s, @NotNull C7893a c7893a, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull List<C6353o> list) {
        Object obj;
        Object obj2;
        Object next;
        this.f101570a = coroutineScope;
        MutableStateFlow<List<C6353o>> MutableStateFlow = StateFlowKt.MutableStateFlow(list);
        this.f101571b = MutableStateFlow;
        this.f101572c = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Long> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0L);
        this.f101573d = MutableStateFlow2;
        this.f101574e = FlowKt.asStateFlow(MutableStateFlow2);
        MutableSharedFlow<Long> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, (Object) null);
        this.f101575f = mutableSharedFlowMutableSharedFlow$default;
        this.f101576g = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        if (viewReply.hasReqUser()) {
            y6.b(viewReply.getReqUser().getFavSeason() == 1);
        }
        C7893a.C1318a c1318aC = c7893a.c();
        long j7 = c1318aC != null ? c1318aC.f123395a.f123398b : 0L;
        long cid = j7;
        if (j7 == 0) {
            cid = j7;
            if (viewReply.hasArc()) {
                cid = viewReply.getArc().getCid();
            }
        }
        long j8 = 0;
        if (!b().isEmpty()) {
            if (!b().get(0).h.isEmpty()) {
                if (b().size() != 1) {
                    if (cid != 0) {
                        Iterator<T> it = b().iterator();
                        loop0: while (true) {
                            j8 = 0;
                            if (!it.hasNext()) {
                                break;
                            }
                            C6353o c6353o = (C6353o) it.next();
                            Iterator<T> it2 = c6353o.h.iterator();
                            while (it2.hasNext()) {
                                Iterator<T> it3 = ((Z) it2.next()).f101648d.iterator();
                                while (it3.hasNext()) {
                                    if (cid == ((C6355q) it3.next()).f101683c) {
                                        j8 = c6353o.f101669a;
                                        break loop0;
                                    }
                                }
                            }
                        }
                    } else {
                        j8 = 0;
                    }
                } else {
                    j8 = b().get(0).f101669a;
                }
            } else {
                j8 = 0;
            }
        }
        this.f101573d.setValue(Long.valueOf(j8));
        BuildersKt.launch$default(this.f101570a, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(c6356s, this, null), 3, (Object) null);
        Iterator<T> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj = null;
                break;
            }
            Object next2 = it4.next();
            Iterator<T> it5 = ((C6353o) next2).h.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    obj2 = null;
                    break;
                }
                Object next3 = it5.next();
                Iterator<T> it6 = ((Z) next3).f101648d.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it6.next();
                        if (((C6355q) next).f101682b == aVar.a()) {
                            break;
                        }
                    }
                }
                if (next != null) {
                    obj2 = next3;
                    break;
                }
            }
            if (obj2 != null) {
                obj = next2;
                break;
            }
        }
        this.h = (C6353o) obj;
        MutableSharedFlow<C6355q> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, (Object) null);
        this.f101577i = mutableSharedFlowMutableSharedFlow$default2;
        this.f101578j = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
    }

    public final boolean a(long j7, long j8) {
        boolean z6;
        List<C6353o> listB = b();
        if ((listB instanceof Collection) && listB.isEmpty()) {
            z6 = false;
        } else {
            Iterator<T> it = listB.iterator();
            loop0: while (true) {
                z6 = false;
                if (!it.hasNext()) {
                    break;
                }
                List<Z> list = ((C6353o) it.next()).h;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        List<C6355q> list2 = ((Z) it2.next()).f101648d;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<T> it3 = list2.iterator();
                            while (it3.hasNext()) {
                                List<Av0.a> list3 = ((C6355q) it3.next()).f101689j;
                                if (list3 == null || !list3.isEmpty()) {
                                    for (Av0.a aVar : list3) {
                                        if (aVar.f591b == j8 && aVar.f590a == j7) {
                                            z6 = true;
                                            break loop0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return z6;
    }

    @NotNull
    public final List<C6353o> b() {
        return (List) this.f101572c.getValue();
    }

    @Nullable
    public final C6353o c() {
        if (b().isEmpty()) {
            return null;
        }
        List<C6353o> listB = b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((C6353o) it.next()).h);
        }
        C6353o c6353o = (C6353o) CollectionsKt.first(b());
        return new C6353o(c6353o.f101669a, c6353o.f101670b, c6353o.f101671c, c6353o.f101672d, c6353o.f101673e, c6353o.f101674f, c6353o.f101675g, arrayList, c6353o.f101676i, c6353o.f101677j, c6353o.f101678k);
    }

    public final boolean d() {
        return !b().isEmpty();
    }

    public final void e(long j7) {
        BuildersKt.launch$default(this.f101570a, (CoroutineContext) null, (CoroutineStart) null, new UnitedSeasonDetailRepository$showSeasonLayer$1(this, j7, null), 3, (Object) null);
    }
}
