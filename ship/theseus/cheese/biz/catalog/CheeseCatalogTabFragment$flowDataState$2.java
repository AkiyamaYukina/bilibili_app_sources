package com.bilibili.ship.theseus.cheese.biz.catalog;

import android.widget.LinearLayout;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import bu0.C5165a;
import eu0.C6985d;
import fu0.C7200w;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogTabFragment$flowDataState$2.class */
final class CheeseCatalogTabFragment$flowDataState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final CheeseCatalogTabFragment this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogTabFragment$flowDataState$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogTabFragment$flowDataState$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C6985d, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final CheeseCatalogTabFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseCatalogTabFragment cheeseCatalogTabFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseCatalogTabFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
            final C6985d c6985d = (C6985d) this.L$0;
            if (c6985d != null) {
                final CheeseCatalogTabFragment cheeseCatalogTabFragment = this.this$0;
                int iO = cheeseCatalogTabFragment.f89141m.O(c6985d);
                Integer numValueOf = Integer.valueOf(iO);
                if (iO < 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    final int iIntValue = numValueOf.intValue();
                    C7200w c7200w = cheeseCatalogTabFragment.f89138j;
                    if (c7200w != null) {
                        final RecyclerView recyclerView = c7200w.f119623c;
                        recyclerView.post(new Runnable(recyclerView, iIntValue, cheeseCatalogTabFragment, c6985d) { // from class: com.bilibili.ship.theseus.cheese.biz.catalog.k

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final RecyclerView f89177a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final int f89178b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final CheeseCatalogTabFragment f89179c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final C6985d f89180d;

                            {
                                this.f89177a = recyclerView;
                                this.f89178b = iIntValue;
                                this.f89179c = cheeseCatalogTabFragment;
                                this.f89180d = c6985d;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                LinearLayout linearLayout;
                                RecyclerView recyclerView2 = this.f89177a;
                                int i7 = this.f89178b;
                                CheeseCatalogTabFragment cheeseCatalogTabFragment2 = this.f89179c;
                                C6985d c6985d2 = this.f89180d;
                                recyclerView2.scrollToPosition(i7);
                                bu0.c cVar = cheeseCatalogTabFragment2.f89141m;
                                cVar.getClass();
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(Integer.valueOf(cVar.f57021b));
                                int i8 = 0;
                                for (Object obj2 : (ArrayList) cVar.f57024e) {
                                    if (i8 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    Object obj3 = ((C5165a) obj2).f57015b;
                                    C6985d c6985d3 = obj3 instanceof C6985d ? (C6985d) obj3 : null;
                                    if (c6985d3 != null) {
                                        boolean z6 = c6985d2.f117510e == c6985d3.f117510e;
                                        c6985d3.f117525u = z6;
                                        if (z6) {
                                            cVar.f57021b = i8;
                                            arrayList.add(Integer.valueOf(i8));
                                        }
                                    }
                                    i8++;
                                }
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    cVar.notifyItemChanged(((Number) it.next()).intValue());
                                }
                                C7200w c7200w2 = cheeseCatalogTabFragment2.f89138j;
                                if (c7200w2 == null || (linearLayout = c7200w2.f119627g) == null) {
                                    return;
                                }
                                linearLayout.setVisibility(8);
                            }
                        });
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCatalogTabFragment$flowDataState$2(CheeseCatalogTabFragment cheeseCatalogTabFragment, Continuation<? super CheeseCatalogTabFragment$flowDataState$2> continuation) {
        super(2, continuation);
        this.this$0 = cheeseCatalogTabFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseCatalogTabFragment$flowDataState$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CheeseCatalogTabFragment cheeseCatalogTabFragment = this.this$0;
            Flow flowDrop = FlowKt.drop(FlowKt.distinctUntilChanged(FlowExtKt.flowWithLifecycle(cheeseCatalogTabFragment.f89134e.f90695y, cheeseCatalogTabFragment.getViewLifecycleOwner().getLifecycle(), Lifecycle.State.RESUMED)), 1);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDrop, anonymousClass1, this) == coroutine_suspended) {
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
