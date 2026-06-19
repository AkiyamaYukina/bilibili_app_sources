package com.bilibili.ship.theseus.united.page.intro.module.relate;

import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6318i;
import com.bilibili.ship.theseus.united.page.intro.module.relate.footer.DetailFooterComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailMoreRelateService$request$1.class */
final class DetailMoreRelateService$request$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $category;
    final String $categoryName;
    final String $next;
    final long $page;
    final RelateTab $tab;
    int label;
    final DetailMoreRelateService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailMoreRelateService$request$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailMoreRelateService$request$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super C6318i.a>, Continuation<? super Unit>, Object> {
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

        public final Object invoke(FlowCollector<? super C6318i.a> flowCollector, Continuation<? super Unit> continuation) {
            return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DetailMoreRelateService detailMoreRelateService = this.this$0;
            detailMoreRelateService.h = true;
            detailMoreRelateService.f100839c.f101200b.setValue(DetailFooterComponent.FooterType.Loading);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailMoreRelateService$request$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailMoreRelateService$request$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<? super C6318i.a>, Throwable, Continuation<? super Unit>, Object> {
        private Object L$0;
        Object L$1;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
        }

        public final Object invoke(FlowCollector<? super C6318i.a> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = flowCollector;
            anonymousClass2.L$1 = th;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                C6318i.a.C1048a c1048a = new C6318i.a.C1048a((Throwable) this.L$1);
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(c1048a, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailMoreRelateService$request$1$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailMoreRelateService$request$1$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super C6318i.a>, Throwable, Continuation<? super Unit>, Object> {
        int label;
        final DetailMoreRelateService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(DetailMoreRelateService detailMoreRelateService, Continuation<? super AnonymousClass3> continuation) {
            super(3, continuation);
            this.this$0 = detailMoreRelateService;
        }

        public final Object invoke(FlowCollector<? super C6318i.a> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return new AnonymousClass3(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.h = false;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailMoreRelateService$request$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RelateTab f100848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f100849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DetailMoreRelateService f100850c;

        public a(RelateTab relateTab, long j7, DetailMoreRelateService detailMoreRelateService) {
            this.f100848a = relateTab;
            this.f100849b = j7;
            this.f100850c = detailMoreRelateService;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
            C6318i.a aVar = (C6318i.a) obj;
            boolean z6 = aVar instanceof C6318i.a.b;
            long j7 = this.f100849b;
            DetailMoreRelateService detailMoreRelateService = this.f100850c;
            if (z6) {
                C6318i.b bVar = ((C6318i.a.b) aVar).f101256a;
                String str = bVar.f101258b;
                RelateTab relateTab = this.f100848a;
                relateTab.f101052e = str;
                int i7 = 0;
                relateTab.f101053f = str.length() > 0 && !bVar.f101257a.isEmpty();
                relateTab.f101054g = j7;
                List<o0> list = bVar.f101257a;
                int i8 = DetailMoreRelateService.f100835l;
                detailMoreRelateService.getClass();
                ArrayList arrayList = (ArrayList) list;
                boolean zIsEmpty = arrayList.isEmpty();
                IntroRecycleViewService introRecycleViewService = detailMoreRelateService.f100842f;
                if (zIsEmpty) {
                    BLog.e("DetailMoreRelateService", "insertMoreRelates, list is empty");
                } else if (((ArrayList) introRecycleViewService.f100040f).size() >= DetailMoreRelateService.f100836m) {
                    BLog.w("DetailMoreRelateService", "insertMoreRelates, more than threshold");
                } else {
                    int size = arrayList.size();
                    StringBuilder sb = new StringBuilder("insertMoreRelates, ");
                    sb.append(relateTab.f101048a);
                    J1.z.a(j7, " ", ", ", sb);
                    com.bilibili.ad.adview.liveroom.answer.fragment.compont.category.Z.b(size, "DetailMoreRelateService", sb);
                    int size2 = ((ArrayList) relateTab.f101050c).size();
                    for (T t7 : list) {
                        if (i7 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        o0 o0Var = (o0) t7;
                        o0Var.f101332r = i7 + size2 + 1;
                        o0Var.f101333s = j7;
                        i7++;
                    }
                    ((ArrayList) relateTab.f101050c).addAll(list);
                    detailMoreRelateService.f100841e.k(relateTab, list);
                    DetailRelateRepository detailRelateRepository = detailMoreRelateService.f100840d;
                    detailRelateRepository.getClass();
                    if (!arrayList.isEmpty()) {
                        detailRelateRepository.h.tryEmit(list);
                    }
                }
                int length = bVar.f101258b.length();
                com.bilibili.ship.theseus.united.page.intro.module.relate.footer.c cVar = detailMoreRelateService.f100839c;
                if (length != 0 && ((ArrayList) introRecycleViewService.f100040f).size() < DetailMoreRelateService.f100836m) {
                    cVar.f101200b.setValue(DetailFooterComponent.FooterType.None);
                } else {
                    cVar.f101200b.setValue(DetailFooterComponent.FooterType.ReachEnd);
                }
            } else {
                if (!(aVar instanceof C6318i.a.C1048a)) {
                    throw new NoWhenBranchMatchedException();
                }
                BLog.e("DetailMoreRelateService", "loadNextPage page " + j7 + ", error: " + ((C6318i.a.C1048a) aVar).f101255a);
                detailMoreRelateService.f100839c.f101200b.setValue(DetailFooterComponent.FooterType.Error);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailMoreRelateService$request$1(DetailMoreRelateService detailMoreRelateService, String str, long j7, String str2, RelateTab relateTab, long j8, Continuation<? super DetailMoreRelateService$request$1> continuation) {
        super(2, continuation);
        this.this$0 = detailMoreRelateService;
        this.$next = str;
        this.$category = j7;
        this.$categoryName = str2;
        this.$tab = relateTab;
        this.$page = j8;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailMoreRelateService$request$1(this.this$0, this.$next, this.$category, this.$categoryName, this.$tab, this.$page, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            C6318i c6318i = this.this$0.f100838b;
            String str = this.$next;
            long j7 = this.$category;
            String str2 = this.$categoryName;
            c6318i.getClass();
            Flow flowOnCompletion = FlowKt.onCompletion(FlowKt.catch(FlowKt.onStart(FlowKt.flowOn(FlowKt.flow(new DetailMoreRelateRepository$getRequestMoreFlow$1(c6318i, str, j7, str2, null)), Dispatchers.getIO()), new AnonymousClass1(this.this$0, null)), new AnonymousClass2(null)), new AnonymousClass3(this.this$0, null));
            a aVar = new a(this.$tab, this.$page, this.this$0);
            this.label = 1;
            if (flowOnCompletion.collect(aVar, this) == coroutine_suspended) {
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
