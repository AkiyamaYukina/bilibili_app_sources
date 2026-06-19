package com.bilibili.ship.theseus.united.page.toolbar;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.magicasakura.widgets.TintToolbar;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import java.util.List;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository.class */
@StabilityInferred(parameters = 0)
public final class ToolbarRepository extends yv0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Context f103282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Flow<a> f103283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f103284g;

    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Garb f103285i = GarbManager.getCurGarb();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.utils.d f103286j = new com.bilibili.ship.theseus.united.utils.d();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.utils.d f103287k = new com.bilibili.ship.theseus.united.utils.d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.utils.d f103288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Flow<Boolean> f103289m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.utils.d f103290n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.utils.d f103291o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f103292p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public A f103293q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f103294r;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ToolbarRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$1$1.class */
        public static final class C11311 extends SuspendLambda implements Function2<a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ToolbarRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11311(ToolbarRepository toolbarRepository, Continuation<? super C11311> continuation) {
                super(2, continuation);
                this.this$0 = toolbarRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11311 c11311 = new C11311(this.this$0, continuation);
                c11311.L$0 = obj;
                return c11311;
            }

            public final Object invoke(a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    a aVar = (a) this.L$0;
                    if (aVar == null) {
                        return Unit.INSTANCE;
                    }
                    ToolbarRepository toolbarRepository = this.this$0;
                    this.label = 1;
                    toolbarRepository.getClass();
                    Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new ToolbarRepository$enforceViews$2(aVar, toolbarRepository, null), this);
                    if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCoroutineScope = Unit.INSTANCE;
                    }
                    if (objCoroutineScope == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ToolbarRepository toolbarRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = toolbarRepository;
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
                ToolbarRepository toolbarRepository = this.this$0;
                Flow<a> flow = toolbarRepository.f103283f;
                C11311 c11311 = new C11311(toolbarRepository, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c11311, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function3<Boolean, a, Continuation<? super Unit>, Object> {
        Object L$0;
        boolean Z$0;
        int label;
        final ToolbarRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ToolbarRepository toolbarRepository, Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
            this.this$0 = toolbarRepository;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke(((Boolean) obj).booleanValue(), (a) obj2, (Continuation<? super Unit>) obj3);
        }

        public final Object invoke(boolean z6, a aVar, Continuation<? super Unit> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.Z$0 = z6;
            anonymousClass2.L$0 = aVar;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int color;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z6 = this.Z$0;
            a aVar = (a) this.L$0;
            ToolbarRepository toolbarRepository = this.this$0;
            if (aVar == null) {
                toolbarRepository.getClass();
            } else {
                if (z6) {
                    ActivityColorRepository.a aVarG = toolbarRepository.f103284g.g();
                    if (aVarG != null) {
                        color = aVarG.f99194a;
                    } else {
                        Garb garb = toolbarRepository.f103285i;
                        color = (garb.isPure() || garb.isPrimaryOnly()) ? ContextCompat.getColor(toolbarRepository.f103282e, R.color.white) : garb.getFontColor();
                    }
                } else {
                    color = ContextCompat.getColor(toolbarRepository.f103282e, R.color.white);
                }
                aVar.f103301g.setTextColor(color);
                aVar.h.setImageTintList(ColorStateList.valueOf(color));
                aVar.f103295a.setIconTintColorWithGarb(color);
                aVar.f103299e.setImageTintList(ColorStateList.valueOf(color));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TintToolbar f103295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final View f103296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final LinearLayout f103297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final LinearLayout f103298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final ImageView f103299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final LinearLayout f103300f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final TextView f103301g;

        @NotNull
        public final ImageView h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final TextView f103302i;

        public a(@NotNull TintToolbar tintToolbar, @NotNull View view, @NotNull LinearLayout linearLayout, @NotNull LinearLayout linearLayout2, @NotNull ImageView imageView, @NotNull LinearLayout linearLayout3, @NotNull TextView textView, @NotNull ImageView imageView2, @NotNull TextView textView2) {
            this.f103295a = tintToolbar;
            this.f103296b = view;
            this.f103297c = linearLayout;
            this.f103298d = linearLayout2;
            this.f103299e = imageView;
            this.f103300f = linearLayout3;
            this.f103301g = textView;
            this.h = imageView2;
            this.f103302i = textView2;
        }
    }

    @Inject
    public ToolbarRepository(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull Flow<a> flow, @NotNull ActivityColorRepository activityColorRepository, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository, @NotNull com.bilibili.ship.theseus.keel.player.h hVar) {
        this.f103281d = coroutineScope;
        this.f103282e = context;
        this.f103283f = flow;
        this.f103284g = activityColorRepository;
        this.h = hVar;
        com.bilibili.ship.theseus.united.utils.d dVar = new com.bilibili.ship.theseus.united.utils.d();
        this.f103288l = dVar;
        this.f103289m = FlowKt.distinctUntilChanged(FlowKt.combine(dVar.f104859b, this.f129911c, new ToolbarRepository$visibleStateFlow$1(null)));
        this.f103290n = new com.bilibili.ship.theseus.united.utils.d();
        this.f103291o = new com.bilibili.ship.theseus.united.utils.d();
        this.f103294r = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        FlowKt.launchIn(FlowKt.combine(pageNestedScrollFusionRepository.f102266r, flow, new AnonymousClass2(this, null)), coroutineScope);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository r5, com.bilibili.magicasakura.widgets.TintToolbar r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$collectGarbEvent$1
            if (r0 == 0) goto L2e
            r0 = r7
            com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$collectGarbEvent$1 r0 = (com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$collectGarbEvent$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2e
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L38
        L2e:
            com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$collectGarbEvent$1 r0 = new com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$collectGarbEvent$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L38:
            r0 = r7
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L71
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L5b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5b:
            r0 = r7
            java.lang.Object r0 = r0.L$0
            com.bilibili.ship.theseus.united.page.toolbar.E r0 = (com.bilibili.ship.theseus.united.page.toolbar.E) r0
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L6d
            goto La1
        L6d:
            r6 = move-exception
            goto Lb2
        L71:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.united.page.toolbar.E r0 = new com.bilibili.ship.theseus.united.page.toolbar.E
            r1 = r0
            r2 = r6
            r3 = r5
            r1.<init>(r2, r3)
            r5 = r0
            com.bilibili.lib.ui.garb.GarbWatcher r0 = com.bilibili.lib.ui.garb.GarbWatcher.INSTANCE
            r1 = r5
            r0.subscribe(r1)
            r0 = r7
            r1 = r5
            r0.L$0 = r1     // Catch: java.lang.Throwable -> Lb1
            r0 = r7
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> Lb1
            r0 = r7
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> Lb1
            r6 = r0
            r0 = r6
            r1 = r10
            if (r0 != r1) goto L9f
            r0 = r10
            return r0
        L9f:
            r0 = r5
            r6 = r0
        La1:
            r0 = r6
            r5 = r0
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L6d
            r7 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            r0.<init>()     // Catch: java.lang.Throwable -> L6d
            r0 = r6
            r5 = r0
            r0 = r7
            throw r0     // Catch: java.lang.Throwable -> L6d
        Lb1:
            r6 = move-exception
        Lb2:
            com.bilibili.lib.ui.garb.GarbWatcher r0 = com.bilibili.lib.ui.garb.GarbWatcher.INSTANCE
            r1 = r5
            r0.unSubscribe(r1)
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository.c(com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository, com.bilibili.magicasakura.widgets.TintToolbar, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public final Object d(@NotNull List list, @NotNull SuspendLambda suspendLambda) {
        Object objCollectLatest = FlowKt.collectLatest(this.f103283f, new ToolbarRepository$insertActionViewIntoLeftArea$2(list, null), suspendLambda);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    @Nullable
    public final Object e(@NotNull List list, @NotNull SuspendLambda suspendLambda) {
        Object objCollectLatest = FlowKt.collectLatest(this.f103283f, new ToolbarRepository$insertActionViewIntoRightArea$2(list, null), suspendLambda);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0 r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$keepActionReplayVisible$1
            if (r0 == 0) goto L29
            r0 = r7
            com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$keepActionReplayVisible$1 r0 = (com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$keepActionReplayVisible$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L33
        L29:
            com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$keepActionReplayVisible$1 r0 = new com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$keepActionReplayVisible$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L33:
            r0 = r7
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L62
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L58
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L54
            goto L85
        L54:
            r6 = move-exception
            goto L8e
        L58:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L62:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            r1 = r6
            r0.f103292p = r1     // Catch: java.lang.Throwable -> L54
            r0 = r5
            com.bilibili.ship.theseus.united.utils.d r0 = r0.f103291o     // Catch: java.lang.Throwable -> L54
            r6 = r0
            r0 = r7
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L54
            r0 = r6
            r1 = r7
            java.lang.Object r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L54
            r6 = r0
            r0 = r6
            r1 = r9
            if (r0 != r1) goto L85
            r0 = r9
            return r0
        L85:
            r0 = r5
            r1 = 0
            r0.f103292p = r1
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L8e:
            r0 = r5
            r1 = 0
            r0.f103292p = r1
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository.f(kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.bilibili.lib.coroutineextension.j] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.bilibili.ship.theseus.united.page.toolbar.A] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.toolbar.A r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$keepOverflowClick$1
            if (r0 == 0) goto L26
            r0 = r7
            com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$keepOverflowClick$1 r0 = (com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$keepOverflowClick$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L26
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            goto L31
        L26:
            com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$keepOverflowClick$1 r0 = new com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$keepOverflowClick$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r9 = r0
        L31:
            r0 = r9
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L6d
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L56
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L56:
            r0 = r9
            java.lang.Object r0 = r0.L$0
            com.bilibili.lib.coroutineextension.j r0 = (com.bilibili.lib.coroutineextension.j) r0
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L69
            goto L9f
        L69:
            r7 = move-exception
            goto Lb2
        L6d:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            r1 = r6
            r0.f103293q = r1
            com.bilibili.ship.theseus.united.page.toolbar.I r0 = new com.bilibili.ship.theseus.united.page.toolbar.I
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r9
            r1 = r7
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L69
            r0 = r7
            r6 = r0
            r0 = r9
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L69
            r0 = r7
            r6 = r0
            r0 = r9
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L69
            r1 = r10
            if (r0 != r1) goto L9f
            r0 = r10
            return r0
        L9f:
            r0 = r7
            r6 = r0
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L69
            r9 = r0
            r0 = r7
            r6 = r0
            r0 = r9
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            r0 = r7
            r6 = r0
            r0 = r9
            throw r0     // Catch: java.lang.Throwable -> L69
        Lb2:
            r0 = r6
            r0.invoke()
            r0 = r7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository.g(com.bilibili.ship.theseus.united.page.toolbar.A, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public final Object h(@NotNull SuspendLambda suspendLambda) {
        Object objA = this.f103290n.a(suspendLambda);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @Nullable
    public final Object i(@NotNull SuspendLambda suspendLambda) {
        Object objA = this.f103288l.a(suspendLambda);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }
}
