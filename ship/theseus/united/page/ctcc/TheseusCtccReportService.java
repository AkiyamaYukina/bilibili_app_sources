package com.bilibili.ship.theseus.united.page.ctcc;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.player.tangram.playercore.u;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ctcc/TheseusCtccReportService.class */
@StabilityInferred(parameters = 0)
public final class TheseusCtccReportService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final j f99300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f99301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageReportService f99302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BiliAccountInfo f99303e;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ctcc.TheseusCtccReportService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ctcc/TheseusCtccReportService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusCtccReportService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ctcc.TheseusCtccReportService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ctcc/TheseusCtccReportService$1$1.class */
        public static final class C09691 extends SuspendLambda implements Function2<u, Continuation<? super Boolean>, Object> {
            Object L$0;
            int label;

            public C09691(Continuation<? super C09691> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09691 c09691 = new C09691(continuation);
                c09691.L$0 = obj;
                return c09691;
            }

            public final Object invoke(u uVar, Continuation<? super Boolean> continuation) {
                return create(uVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = ((u) this.L$0).f79460c.mVodIndex.mVodList;
                boolean z6 = false;
                if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        z6 = false;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            z6 = false;
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((PlayIndex) it.next()).canWatchReason == PlayIndex.CanWatchReason.CAN_WATCH_QN_REASON_CTCC_HOME_NETWORK) {
                                z6 = true;
                                break;
                            }
                        }
                    }
                }
                return Boxing.boxBoolean(z6);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusCtccReportService theseusCtccReportService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusCtccReportService;
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
                Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.f99300b.b());
                C09691 c09691 = new C09691(null);
                this.label = 1;
                if (FlowKt.first(flowFilterNotNull, c09691, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            TheseusCtccReportService theseusCtccReportService = this.this$0;
            PageReportService pageReportService = theseusCtccReportService.f99302d;
            VipUserInfo vipInfo = theseusCtccReportService.f99303e.getVipInfo();
            String strValueOf = vipInfo != null ? String.valueOf(vipInfo.getVipType()) : null;
            String str = strValueOf;
            if (strValueOf == null) {
                str = "";
            }
            Pair pair = TuplesKt.to("vip_type", str);
            VipUserInfo vipInfo2 = this.this$0.f99303e.getVipInfo();
            String strValueOf2 = null;
            if (vipInfo2 != null) {
                strValueOf2 = String.valueOf(vipInfo2.getVipStatus());
            }
            if (strValueOf2 == null) {
                strValueOf2 = "";
            }
            PageReportService.i(pageReportService, "player.player.family-vip-play.start.player", MapsKt.mapOf(new Pair[]{pair, TuplesKt.to("vip_status", strValueOf2)}), 4);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ctcc.TheseusCtccReportService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ctcc/TheseusCtccReportService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusCtccReportService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ctcc.TheseusCtccReportService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ctcc/TheseusCtccReportService$2$1.class */
        public static final class AnonymousClass1<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusCtccReportService f99304a;

            public AnonymousClass1(TheseusCtccReportService theseusCtccReportService) {
                this.f99304a = theseusCtccReportService;
            }

            /* JADX WARN: Removed duplicated region for block: B:44:0x0158  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0162  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(com.bilibili.player.tangram.basic.a r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
                /*
                    Method dump skipped, instruction units count: 361
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.ctcc.TheseusCtccReportService.AnonymousClass2.AnonymousClass1.emit(com.bilibili.player.tangram.basic.a, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TheseusCtccReportService theseusCtccReportService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = theseusCtccReportService;
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
                j jVar = this.this$0.f99300b;
                this.label = 1;
                if (jVar.u(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            Flow<com.bilibili.player.tangram.basic.a> flowH = this.this$0.f99300b.H();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 2;
            if (flowH.collect(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Inject
    public TheseusCtccReportService(@NotNull CoroutineScope coroutineScope, @NotNull j jVar, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull PageReportService pageReportService, @NotNull BiliAccountInfo biliAccountInfo) {
        this.f99299a = coroutineScope;
        this.f99300b = jVar;
        this.f99301c = iPlayerCoreService;
        this.f99302d = pageReportService;
        this.f99303e = biliAccountInfo;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }
}
