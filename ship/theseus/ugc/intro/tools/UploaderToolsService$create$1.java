package com.bilibili.ship.theseus.ugc.intro.tools;

import android.content.Context;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsComponent;
import com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsService;
import com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsService$create$1.class */
public final class UploaderToolsService$create$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final UploaderToolsService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsService$create$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsService$create$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final UploaderToolsService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsService$create$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsService$create$1$1$1.class */
        public static final class C08521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final UploaderToolsService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsService$create$1$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsService$create$1$1$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final UploaderToolsService f97206a;

                public a(UploaderToolsService uploaderToolsService) {
                    this.f97206a = uploaderToolsService;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                    UploaderToolsComponent.a aVar = (UploaderToolsComponent.a) obj;
                    UploaderToolsService uploaderToolsService = this.f97206a;
                    uploaderToolsService.getClass();
                    defpackage.a.b("[theseus-ugc-UploaderToolsService-handleEffect] ", "UploaderToolsComponent effect -> " + aVar, "UploaderToolsService-handleEffect");
                    boolean z6 = aVar instanceof UploaderToolsComponent.a.C0850a;
                    PageReportService pageReportService = uploaderToolsService.f97199a;
                    if (z6) {
                        b bVar = ((UploaderToolsComponent.a.C0850a) aVar).f97189a;
                        Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("entry_name", bVar.f97211b)});
                        mapMutableMapOf.putAll(bVar.f97215f);
                        PageReportService.g(pageReportService, "united.player-video-detail.up-tool.entry.click", mapMutableMapOf, 4);
                        int i7 = UploaderToolsService.a.f97205a[bVar.f97210a.ordinal()];
                        if (i7 == 1) {
                            uploaderToolsService.f97200b.h("", "", HalfScreenDanmakuInputService.DanmakuInputControl.WITH_INTERACTION);
                        } else if (i7 == 2) {
                            uploaderToolsService.f97202d.b();
                        } else if (i7 == 3) {
                            uploaderToolsService.f97201c.b();
                        } else if (i7 == 4) {
                            BLRouter.routeTo$default(new RouteRequest.Builder(bVar.f97213d).build(), (Context) null, 2, (Object) null);
                        }
                    } else {
                        if (!(aVar instanceof UploaderToolsComponent.a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        UploaderToolsComponent.a.b bVar2 = (UploaderToolsComponent.a.b) aVar;
                        List<String> list = bVar2.f97190a;
                        List<Map<String, String>> list2 = bVar2.f97191b;
                        Map mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("show_entry_list", list.toString())});
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            mapMutableMapOf2.putAll((Map) it.next());
                        }
                        PageReportService.i(pageReportService, "united.player-video-detail.up-tool.0.show", mapMutableMapOf2, 4);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08521(UploaderToolsService uploaderToolsService, Continuation<? super C08521> continuation) {
                super(2, continuation);
                this.this$0 = uploaderToolsService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08521(this.this$0, continuation);
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
                    UploaderToolsService uploaderToolsService = this.this$0;
                    SharedFlow<UploaderToolsComponent.a> sharedFlow = uploaderToolsService.f97204f.f97186d;
                    a aVar = new a(uploaderToolsService);
                    this.label = 1;
                    if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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
        public AnonymousClass1(UploaderToolsService uploaderToolsService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uploaderToolsService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
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
            BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C08521(this.this$0, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploaderToolsService$create$1(UploaderToolsService uploaderToolsService, Continuation<? super UploaderToolsService$create$1> continuation) {
        super(1, continuation);
        this.this$0 = uploaderToolsService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UploaderToolsService$create$1(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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
