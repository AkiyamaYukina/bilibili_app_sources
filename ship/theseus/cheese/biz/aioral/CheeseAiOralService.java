package com.bilibili.ship.theseus.cheese.biz.aioral;

import L3.C2516h;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.playingarea.g;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import eu0.C7005x;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/aioral/CheeseAiOralService.class */
@StabilityInferred(parameters = 0)
public final class CheeseAiOralService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f89000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C7005x f89001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f89002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final g f89003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f89004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageReportService f89005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f89006g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.a f89007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f89008j = LazyKt.lazy(new C2516h(4));

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.aioral.CheeseAiOralService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/aioral/CheeseAiOralService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseAiOralService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseAiOralService cheeseAiOralService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseAiOralService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r7 = r0
                r0 = r4
                int r0 = r0.label
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L23
                r0 = r6
                r1 = 1
                if (r0 != r1) goto L19
                r0 = r5
                kotlin.ResultKt.throwOnFailure(r0)
                goto L8c
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L23:
                r0 = r5
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r4
                com.bilibili.ship.theseus.cheese.biz.aioral.CheeseAiOralService r0 = r0.this$0
                r8 = r0
                r0 = r4
                r1 = 1
                r0.label = r1
                r0 = r8
                eu0.x r0 = r0.f89001b
                boolean r0 = r0.f117592a
                if (r0 == 0) goto L81
                r0 = r8
                kotlin.Lazy r0 = r0.f89008j
                r5 = r0
                r0 = r5
                java.lang.Object r0 = r0.getValue()
                tv.danmaku.bili.widget.preference.a r0 = (tv.danmaku.bili.widget.preference.a) r0
                android.content.SharedPreferences r0 = r0.a
                java.lang.String r1 = "key_pref_ai_oral_guide_shown"
                r2 = 0
                boolean r0 = r0.getBoolean(r1, r2)
                if (r0 != 0) goto L81
                r0 = r5
                java.lang.Object r0 = r0.getValue()
                tv.danmaku.bili.widget.preference.a r0 = (tv.danmaku.bili.widget.preference.a) r0
                java.lang.String r1 = "key_pref_ai_oral_guide_shown"
                r2 = 1
                r0.l(r1, r2)
                r0 = r8
                r1 = r4
                java.lang.Object r0 = r0.a(r1)
                r5 = r0
                r0 = r5
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r0 != r1) goto L7a
                goto L85
            L7a:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                r5 = r0
                goto L85
            L81:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                r5 = r0
            L85:
                r0 = r5
                r1 = r7
                if (r0 != r1) goto L8c
                r0 = r7
                return r0
            L8c:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.aioral.CheeseAiOralService.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public CheeseAiOralService(@NotNull CoroutineScope coroutineScope, @NotNull C7005x c7005x, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull g gVar, @NotNull BackActionRepository backActionRepository, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar, @NotNull com.bilibili.ship.theseus.united.page.playingarea.a aVar2) {
        this.f89000a = coroutineScope;
        this.f89001b = c7005x;
        this.f89002c = theseusFloatLayerService;
        this.f89003d = gVar;
        this.f89004e = backActionRepository;
        this.f89005f = pageReportService;
        this.f89006g = cVar;
        this.h = aVar;
        this.f89007i = aVar2;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.aioral.CheeseAiOralService.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
