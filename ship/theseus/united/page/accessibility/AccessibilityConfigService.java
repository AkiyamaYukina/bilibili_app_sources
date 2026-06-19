package com.bilibili.ship.theseus.united.page.accessibility;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.magicasakura.widgets.TintToolbar;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/accessibility/AccessibilityConfigService.class */
@StabilityInferred(parameters = 0)
public final class AccessibilityConfigService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Flow<a> f98825b;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.accessibility.AccessibilityConfigService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/accessibility/AccessibilityConfigService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AccessibilityConfigService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.accessibility.AccessibilityConfigService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/accessibility/AccessibilityConfigService$1$1.class */
        public static final class C09351 extends SuspendLambda implements Function2<a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final AccessibilityConfigService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09351(AccessibilityConfigService accessibilityConfigService, Continuation<? super C09351> continuation) {
                super(2, continuation);
                this.this$0 = accessibilityConfigService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09351 c09351 = new C09351(this.this$0, continuation);
                c09351.L$0 = obj;
                return c09351;
            }

            public final Object invoke(a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:21:0x0073
                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r0 = r4
                    int r0 = r0.label
                    if (r0 != 0) goto L69
                    r0 = r5
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r4
                    java.lang.Object r0 = r0.L$0
                    com.bilibili.ship.theseus.united.page.accessibility.AccessibilityConfigService$a r0 = (com.bilibili.ship.theseus.united.page.accessibility.AccessibilityConfigService.a) r0
                    r5 = r0
                    r0 = r5
                    if (r0 != 0) goto L1f
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L1f:
                    r0 = r4
                    com.bilibili.ship.theseus.united.page.accessibility.AccessibilityConfigService r0 = r0.this$0
                    r6 = r0
                    r0 = r5
                    com.bilibili.magicasakura.widgets.TintToolbar r0 = r0.f98826a
                    r5 = r0
                    r0 = r6
                    java.lang.Class r0 = r0.getClass()
                    java.lang.Class<androidx.appcompat.widget.Toolbar> r0 = androidx.appcompat.widget.Toolbar.class
                    java.lang.String r1 = "mNavButtonView"
                    java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L73
                    r6 = r0
                    r0 = r6
                    r1 = 1
                    r0.setAccessible(r1)     // Catch: java.lang.Exception -> L73
                    r0 = r6
                    r1 = r5
                    java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L73
                    r5 = r0
                    r0 = r5
                    boolean r0 = r0 instanceof android.view.View     // Catch: java.lang.Exception -> L73
                    if (r0 == 0) goto L50
                    r0 = r5
                    android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Exception -> L73
                    r5 = r0
                    goto L52
                L50:
                    r0 = 0
                    r5 = r0
                L52:
                    r0 = r5
                    if (r0 != 0) goto L59
                    goto L65
                L59:
                    r0 = r5
                    r1 = 2131302140(0x7f0916fc, float:1.8222358E38)
                    r0.setAccessibilityTraversalBefore(r1)     // Catch: java.lang.Exception -> L73
                    r0 = r5
                    java.lang.String r1 = "返回上一页"
                    AX.g.a(r0, r1)     // Catch: java.lang.Exception -> L73
                L65:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L73
                    return r0
                L69:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r0
                L73:
                    r5 = move-exception
                    goto L65
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.accessibility.AccessibilityConfigService.AnonymousClass1.C09351.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AccessibilityConfigService accessibilityConfigService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = accessibilityConfigService;
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
                AccessibilityConfigService accessibilityConfigService = this.this$0;
                Flow<a> flow = accessibilityConfigService.f98825b;
                C09351 c09351 = new C09351(accessibilityConfigService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c09351, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/accessibility/AccessibilityConfigService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TintToolbar f98826a;

        public a(@NotNull TintToolbar tintToolbar) {
            this.f98826a = tintToolbar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    @javax.inject.Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AccessibilityConfigService(@org.jetbrains.annotations.NotNull android.content.Context r9, @org.jetbrains.annotations.NotNull tv.danmaku.biliplayerv2.PlayerContainer r10, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.miniplayer.a r11, @org.jetbrains.annotations.NotNull tv.danmaku.biliplayerv2.service.IControlContainerService r12, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r13, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<com.bilibili.ship.theseus.united.page.accessibility.AccessibilityConfigService.a> r14) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.accessibility.AccessibilityConfigService.<init>(android.content.Context, tv.danmaku.biliplayerv2.PlayerContainer, com.bilibili.ship.theseus.united.page.miniplayer.a, tv.danmaku.biliplayerv2.service.IControlContainerService, kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.flow.Flow):void");
    }
}
