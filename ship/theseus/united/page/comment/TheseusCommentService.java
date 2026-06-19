package com.bilibili.ship.theseus.united.page.comment;

import Kj.d;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bilibili.app.comment3.CommentFloatingWebViewType;
import com.bilibili.app.comment3.data.model.Ad;
import com.bilibili.app.comment3.data.model.CommentItem;
import com.bilibili.gripper.api.ad.biz.GAdBizKt;
import com.bilibili.gripper.api.ad.biz.GAdComment;
import com.bilibili.gripper.api.ad.biz.comment.AdCommentClickParams;
import com.bilibili.gripper.api.ad.biz.comment.AdCommentData;
import com.bilibili.gripper.api.ad.biz.comment.AdCommentFrom;
import com.bilibili.gripper.api.ad.biz.comment.PageTrack;
import com.bilibili.gripper.api.ad.core.report.ExtraParams;
import com.bilibili.gripper.api.ad.core.report.UIExtraParams;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.page.ad.AdRepository;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import com.bilibili.ship.theseus.united.page.search.TheseusSearchDialogService;
import com.bilibili.ship.theseus.united.page.tab.i;
import com.bilibili.ship.theseus.united.page.tab.u;
import com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.h;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;
import uv0.C8768a;
import uv0.C8769b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService.class */
@StabilityInferred(parameters = 0)
public final class TheseusCommentService {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final TheseusSearchDialogService f99215A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final h f99216B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a> f99217C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f99218D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f99219E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f99220F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f99221G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f99222H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Boolean> f99223I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Boolean> f99224J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Boolean> f99225K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Boolean> f99226L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final boolean f99227M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f99228N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f99229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lifecycle f99230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final FragmentManager f99231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Flow<e> f99232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C8043a f99233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f99234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IRenderContainerService f99235g;

    @NotNull
    public final AdRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final d f99236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final u f99237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final TheseusCastScreenRepository f99238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f99239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final WebFloatLayerService f99240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final C8769b f99241n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final RelationRepository f99242o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final c f99244q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final b f99245r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f99246s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f99247t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final C7893a f99248u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final C7893a f99249v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final TheseusPageUIStyleRepository f99250w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f99251x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final i f99252y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final PageNestedScrollFusionRepository f99253z;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusCommentService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$1$1.class */
        public static final class C09601 extends SuspendLambda implements Function2<d.b, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TheseusCommentService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09601(TheseusCommentService theseusCommentService, Continuation<? super C09601> continuation) {
                super(2, continuation);
                this.this$0 = theseusCommentService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09601 c09601 = new C09601(this.this$0, continuation);
                c09601.L$0 = obj;
                return c09601;
            }

            public final Object invoke(d.b bVar, Continuation<? super Unit> continuation) {
                return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    d.b bVar = (d.b) this.L$0;
                    TheseusCommentService theseusCommentService = this.this$0;
                    this.label = 1;
                    if (TheseusCommentService.b(theseusCommentService, bVar, this) == coroutine_suspended) {
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
        public AnonymousClass1(TheseusCommentService theseusCommentService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusCommentService;
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
                Flow<d.b> flowA = this.this$0.f99236i.a();
                C09601 c09601 = new C09601(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, c09601, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusCommentService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function3<C7893a.C1318a, C7893a.C1318a, Continuation<? super C7893a.C1318a>, Object> {
            Object L$0;
            Object L$1;
            int label;
            final TheseusCommentService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TheseusCommentService theseusCommentService, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.this$0 = theseusCommentService;
            }

            public final Object invoke(C7893a.C1318a c1318a, C7893a.C1318a c1318a2, Continuation<? super C7893a.C1318a> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = c1318a;
                anonymousClass1.L$1 = c1318a2;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C7893a.C1318a c1318a = (C7893a.C1318a) this.L$0;
                C7893a.C1318a c1318a2 = (C7893a.C1318a) this.L$1;
                Long lBoxLong = null;
                Long lBoxLong2 = c1318a != null ? Boxing.boxLong(c1318a.f123395a.f123398b) : null;
                if (c1318a2 != null) {
                    lBoxLong = Boxing.boxLong(c1318a2.f123395a.f123398b);
                }
                if (Intrinsics.areEqual(lBoxLong2, lBoxLong)) {
                    return c1318a2;
                }
                this.this$0.f99226L.tryEmit(Boxing.boxBoolean(true));
                return c1318a2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TheseusCommentService theseusCommentService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = theseusCommentService;
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
                TheseusCommentService theseusCommentService = this.this$0;
                StateFlow<C7893a.C1318a> stateFlow = theseusCommentService.f99249v.f123393f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(theseusCommentService, null);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$TheseusCommentExternalHandler.class */
    public final class TheseusCommentExternalHandler implements Kj.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final d.b f99254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TheseusCommentService f99255c;

        public TheseusCommentExternalHandler(@NotNull TheseusCommentService theseusCommentService, d.b bVar) {
            this.f99255c = theseusCommentService;
            this.f99254b = bVar;
        }

        @Nullable
        public final d.b b(long j7) {
            TheseusCommentService theseusCommentService = this.f99255c;
            if (theseusCommentService.f99234f.j() == null || theseusCommentService.f99234f.f91107a.k() == PlayerAvailability.FORBIDDEN) {
                return new d.b(Boxing.boxBoolean(false));
            }
            BuildersKt.launch$default(theseusCommentService.f99243p, (CoroutineContext) null, (CoroutineStart) null, new TheseusCommentService$TheseusCommentExternalHandler$seek$2(theseusCommentService, j7, null), 3, (Object) null);
            return new d.b(Boxing.boxBoolean(true));
        }

        @Nullable
        public final d.b c(@NotNull String str) {
            this.f99255c.f99241n.f127996a.tryEmit(str);
            return new d.b(Boxing.boxBoolean(true));
        }

        @Nullable
        public final d.b d(@NotNull String str) {
            return new d.b(Boxing.boxBoolean(this.f99255c.f99215A.a(str)));
        }

        @Nullable
        public final d.b e(@NotNull String str) {
            C8769b c8769b = this.f99255c.f99241n;
            c8769b.f127998c.tryEmit(new C8768a(str));
            return new d.b(Boxing.boxBoolean(true));
        }

        @Nullable
        public final d.b f(@NotNull List list, @NotNull CommentItem commentItem, @NotNull PageTrack pageTrack) {
            BuildersKt.launch$default(this.f99255c.f99243p, Dispatchers.getDefault(), (CoroutineStart) null, new TheseusCommentService$TheseusCommentExternalHandler$handleAdReportShow$2(list, this.f99255c, pageTrack, commentItem, this, null), 2, (Object) null);
            return new d.b(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object g(boolean r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super Kj.d.b<kotlin.Pair<java.lang.Integer, java.lang.String>>> r7) {
            /*
                r5 = this;
                r0 = r7
                boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$TheseusCommentExternalHandler$snapshot$1
                if (r0 == 0) goto L29
                r0 = r7
                com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$TheseusCommentExternalHandler$snapshot$1 r0 = (com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$TheseusCommentExternalHandler$snapshot$1) r0
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
                com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$TheseusCommentExternalHandler$snapshot$1 r0 = new com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$TheseusCommentExternalHandler$snapshot$1
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r2, r3)
                r7 = r0
            L33:
                r0 = r7
                java.lang.Object r0 = r0.result
                r9 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r10 = r0
                r0 = r7
                int r0 = r0.label
                r8 = r0
                r0 = r8
                if (r0 == 0) goto L61
                r0 = r8
                r1 = 1
                if (r0 != r1) goto L57
                r0 = r9
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r9
                r7 = r0
                goto L83
            L57:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L61:
                r0 = r9
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r7
                r1 = 1
                r0.label = r1
                r0 = r5
                com.bilibili.ship.theseus.united.page.comment.TheseusCommentService r0 = r0.f99255c
                r1 = r6
                r2 = r7
                java.lang.Object r0 = com.bilibili.ship.theseus.united.page.comment.TheseusCommentService.a(r0, r1, r2)
                r9 = r0
                r0 = r9
                r7 = r0
                r0 = r9
                r1 = r10
                if (r0 != r1) goto L83
                r0 = r10
                return r0
            L83:
                Kj.d$b r0 = new Kj.d$b
                r1 = r0
                r2 = r7
                r1.<init>(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService.TheseusCommentExternalHandler.g(boolean, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Nullable
        public final d.b h(@NotNull String str, @NotNull CommentFloatingWebViewType commentFloatingWebViewType) {
            defpackage.a.b("[theseus-united-TheseusCommentService$TheseusCommentExternalHandler-showFloatingWebView] ", "showFloatingWebView type=" + commentFloatingWebViewType + " " + str, "TheseusCommentService$TheseusCommentExternalHandler-showFloatingWebView");
            TheseusCommentService theseusCommentService = this.f99255c;
            BuildersKt.launch$default(theseusCommentService.f99243p, (CoroutineContext) null, (CoroutineStart) null, new TheseusCommentService$TheseusCommentExternalHandler$showFloatingWebView$2(commentFloatingWebViewType, theseusCommentService, str, null), 3, (Object) null);
            return new d.b(Boxing.boxBoolean(true));
        }

        @Nullable
        public final d.b i() {
            C7893a.C1318a c1318aC = this.f99255c.f99248u.c();
            Long lBoxLong = c1318aC != null ? Boxing.boxLong(c1318aC.f123395a.f123398b) : null;
            BLog.i("TheseusCommentService$TheseusCommentExternalHandler-obtainPlayingCid", "[theseus-united-TheseusCommentService$TheseusCommentExternalHandler-obtainPlayingCid] " + com.bilibili.app.comment3.ui.i.a(lBoxLong, "obtainPlayingCid current cid: "));
            return new d.b(lBoxLong);
        }

        @Nullable
        public final Object j(@NotNull View view, @NotNull SuspendLambda suspendLambda) {
            Object objCollectLatest = FlowKt.collectLatest(this.f99255c.f99232d, new TheseusCommentService$TheseusCommentExternalHandler$keepPinInputBar$2(view, null), suspendLambda);
            return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
        }

        @Nullable
        public final d.b k(@NotNull Ad ad, @NotNull CommentItem commentItem, @NotNull Map map) {
            GAdComment gAdComment = GAdBizKt.getGAdComment();
            final TheseusCommentService theseusCommentService = this.f99255c;
            Context context = theseusCommentService.f99229a;
            AdCommentData adCommentDataC = ad.c();
            boolean z6 = ad.k == Ad.ShowType.HALF_SCREEN;
            long j7 = commentItem.b;
            long j8 = commentItem.h.a.a;
            com.bilibili.ship.theseus.keel.player.h hVar = theseusCommentService.f99234f;
            j jVarJ = hVar.j();
            int iL = jVarJ != null ? (int) jVarJ.L() : 0;
            d.b bVar = this.f99254b;
            AdCommentClickParams adCommentClickParams = new AdCommentClickParams(adCommentDataC, map, false, z6, j7, commentItem.a, j8, iL, ((int) bVar.f99279d) * 1000, AdCommentFrom.UNIT_DETAIL);
            UIExtraParams uiExtraParams = adCommentClickParams.getUiExtraParams();
            j jVarJ2 = hVar.j();
            uiExtraParams.ACTION_PROGRESS_TIME(jVarJ2 != null ? (int) jVarJ2.L() : 0);
            long j9 = bVar.f99279d;
            uiExtraParams.VIDEO_DURATION_TIME(((int) j9) * 1000);
            long j10 = bVar.f99276a;
            uiExtraParams.PLAYING_AV_ID(j10);
            C7893a c7893a = theseusCommentService.f99248u;
            C7893a.C1318a c1318aC = c7893a.c();
            uiExtraParams.PLAYING_CID(c1318aC != null ? c1318aC.f123395a.f123398b : 0L);
            uiExtraParams.COMMENT_SCENE("video_detail");
            ExtraParams extraParams = adCommentClickParams.getExtraParams();
            j jVarJ3 = hVar.j();
            extraParams.ACTION_PROGRESS_TIME(jVarJ3 != null ? (int) jVarJ3.L() : 0);
            extraParams.VIDEO_DURATION_TIME(((int) j9) * 1000);
            extraParams.PLAYING_AID(String.valueOf(j10));
            C7893a.C1318a c1318aC2 = c7893a.c();
            long j11 = 0;
            if (c1318aC2 != null) {
                j11 = c1318aC2.f123395a.f123398b;
            }
            extraParams.PLAYING_CID(j11);
            extraParams.COMMENT_SCENE("video_detail");
            Unit unit = Unit.INSTANCE;
            return new d.b(Boxing.boxBoolean(gAdComment.handleAdCommentClickForUgc(context, adCommentClickParams, new Function1(theseusCommentService) { // from class: com.bilibili.ship.theseus.united.page.comment.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TheseusCommentService f99293a;

                {
                    this.f99293a = theseusCommentService;
                }

                public final Object invoke(Object obj) {
                    TheseusCommentService theseusCommentService2 = this.f99293a;
                    BuildersKt.launch$default(theseusCommentService2.f99243p, (CoroutineContext) null, (CoroutineStart) null, new TheseusCommentService$TheseusCommentExternalHandler$handleAdClickIntercept$isSuccess$2$1(theseusCommentService2, (Pair) obj, null), 3, (Object) null);
                    return Unit.INSTANCE;
                }
            })));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$a.class */
    @StabilityInferred(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$a$a.class */
        @StabilityInferred(parameters = 0)
        public static final class C0961a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final Fragment f99257a;

            public C0961a(@NotNull Fragment fragment) {
                this.f99257a = fragment;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f99258a = new a();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$a$c.class */
        @StabilityInferred(parameters = 1)
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f99259a = new a();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final CommentStyleType f99260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f99261b;

        public b(@NotNull CommentStyleType commentStyleType, @NotNull String str) {
            this.f99260a = commentStyleType;
            this.f99261b = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f99260a == bVar.f99260a && Intrinsics.areEqual(this.f99261b, bVar.f99261b);
        }

        public final int hashCode() {
            return this.f99261b.hashCode() + (this.f99260a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "CommentStyle(style=" + this.f99260a + ", badgeText=" + this.f99261b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Long f99262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Long f99263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f99264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f99265d;

        public c(@Nullable String str, @Nullable String str2, @Nullable Long l7, @Nullable Long l8) {
            this.f99262a = l7;
            this.f99263b = l8;
            this.f99264c = str;
            this.f99265d = str2;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$d.class */
    public interface d {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$d$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f99275a;

            public a(long j7) {
                this.f99275a = j7;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f99275a == ((a) obj).f99275a;
            }

            public final int hashCode() {
                return Long.hashCode(this.f99275a);
            }

            @NotNull
            public final String toString() {
                return android.support.v4.media.session.a.a(new StringBuilder("CheeseCommentParams(epId="), this.f99275a, ")");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$d$b.class */
        @StabilityInferred(parameters = 0)
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f99276a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final Map<String, String> f99277b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final Flow<Boolean> f99278c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final long f99279d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final boolean f99280e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final boolean f99281f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @Nullable
            public final c f99282g;

            @Nullable
            public final a h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final boolean f99283i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final boolean f99284j;

            public b() {
                throw null;
            }

            public b(long j7, Map map, Flow flow, long j8, boolean z6, boolean z7, c cVar, a aVar, int i7) {
                boolean z8 = false;
                z6 = (i7 & 16) != 0 ? false : z6;
                z7 = (i7 & 32) != 0 ? false : z7;
                cVar = (i7 & 64) != 0 ? null : cVar;
                aVar = (i7 & 128) != 0 ? null : aVar;
                boolean z9 = (i7 & 256) != 0;
                z8 = (i7 & 512) != 0 ? true : z8;
                this.f99276a = j7;
                this.f99277b = map;
                this.f99278c = flow;
                this.f99279d = j8;
                this.f99280e = z6;
                this.f99281f = z7;
                this.f99282g = cVar;
                this.h = aVar;
                this.f99283i = z9;
                this.f99284j = z8;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$d$c.class */
        @StabilityInferred(parameters = 0)
        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f99285a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final com.bilibili.ogv.pub.season.a f99286b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f99287c;

            public c(long j7, @NotNull com.bilibili.ogv.pub.season.a aVar, long j8) {
                this.f99285a = j7;
                this.f99286b = aVar;
                this.f99287c = j8;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f99285a == cVar.f99285a && Intrinsics.areEqual(this.f99286b, cVar.f99286b) && this.f99287c == cVar.f99287c;
            }

            public final int hashCode() {
                return Long.hashCode(this.f99287c) + I.a(this.f99286b.f71782a, Long.hashCode(this.f99285a) * 31, 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("OgvCommentParams(seasonId=");
                sb.append(this.f99285a);
                sb.append(", seasonType=");
                sb.append(this.f99286b);
                sb.append(", epId=");
                return android.support.v4.media.session.a.a(sb, this.f99287c, ")");
            }
        }

        @NotNull
        Flow<b> a();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$e.class */
    @StabilityInferred(parameters = 0)
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ViewGroup f99288a;

        public e(@NotNull ViewGroup viewGroup) {
            this.f99288a = viewGroup;
        }
    }

    @Inject
    public TheseusCommentService(@NotNull Context context, @NotNull Lifecycle lifecycle, @NotNull FragmentManager fragmentManager, @NotNull Flow<e> flow, @NotNull C8043a c8043a, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull IRenderContainerService iRenderContainerService, @NotNull AdRepository adRepository, @NotNull d dVar, @NotNull u uVar, @NotNull TheseusCastScreenRepository theseusCastScreenRepository, @NotNull BackActionRepository backActionRepository, @NotNull WebFloatLayerService webFloatLayerService, @NotNull C8769b c8769b, @NotNull RelationRepository relationRepository, @NotNull CoroutineScope coroutineScope, @NotNull c cVar, @Nullable b bVar, @NotNull BiliAccounts biliAccounts, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull C7893a c7893a, @NotNull C7893a c7893a2, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar, @NotNull i iVar, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository, @NotNull TheseusSearchDialogService theseusSearchDialogService, @NotNull h hVar2) {
        this.f99229a = context;
        this.f99230b = lifecycle;
        this.f99231c = fragmentManager;
        this.f99232d = flow;
        this.f99233e = c8043a;
        this.f99234f = hVar;
        this.f99235g = iRenderContainerService;
        this.h = adRepository;
        this.f99236i = dVar;
        this.f99237j = uVar;
        this.f99238k = theseusCastScreenRepository;
        this.f99239l = backActionRepository;
        this.f99240m = webFloatLayerService;
        this.f99241n = c8769b;
        this.f99242o = relationRepository;
        this.f99243p = coroutineScope;
        this.f99244q = cVar;
        this.f99245r = bVar;
        this.f99246s = biliAccounts;
        this.f99247t = gVar;
        this.f99248u = c7893a;
        this.f99249v = c7893a2;
        this.f99250w = theseusPageUIStyleRepository;
        this.f99251x = aVar;
        this.f99252y = iVar;
        this.f99253z = pageNestedScrollFusionRepository;
        this.f99215A = theseusSearchDialogService;
        this.f99216B = hVar2;
        MutableStateFlow<a> MutableStateFlow = StateFlowKt.MutableStateFlow(a.b.f99258a);
        this.f99217C = MutableStateFlow;
        this.f99218D = MutableStateFlow;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.f99219E = MutableStateFlow2;
        this.f99220F = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.f99221G = MutableStateFlow3;
        this.f99222H = FlowKt.asStateFlow(MutableStateFlow3);
        BufferOverflow bufferOverflow = BufferOverflow.DROP_LATEST;
        this.f99223I = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f99224J = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f99225K = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f99226L = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f99227M = ((Boolean) o51.a.c.getValue()).booleanValue();
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.united.page.comment.TheseusCommentService r9, boolean r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService.a(com.bilibili.ship.theseus.united.page.comment.TheseusCommentService, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05b3  */
    /* JADX WARN: Type inference failed for: r0v201, types: [com.bilibili.ship.theseus.united.page.comment.a] */
    /* JADX WARN: Type inference failed for: r0v203, types: [com.bilibili.ship.theseus.united.page.comment.b] */
    /* JADX WARN: Type inference failed for: r2v36, types: [com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$adInterceptor$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(final com.bilibili.ship.theseus.united.page.comment.TheseusCommentService r13, final com.bilibili.ship.theseus.united.page.comment.TheseusCommentService.d.b r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 1510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService.b(com.bilibili.ship.theseus.united.page.comment.TheseusCommentService, com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$d$b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c() {
        /*
            r3 = this;
            r0 = 0
            r5 = r0
            r0 = r3
            com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$b r0 = r0.f99245r
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L13
            r0 = r6
            com.bilibili.ship.theseus.united.page.comment.CommentStyleType r0 = r0.f99260a
            r4 = r0
            goto L15
        L13:
            r0 = 0
            r4 = r0
        L15:
            r0 = r4
            com.bilibili.ship.theseus.united.page.comment.CommentStyleType r1 = com.bilibili.ship.theseus.united.page.comment.CommentStyleType.SCROLL_ANIMATION
            if (r0 == r1) goto L38
            r0 = r5
            r4 = r0
            r0 = r6
            if (r0 == 0) goto L27
            r0 = r6
            com.bilibili.ship.theseus.united.page.comment.CommentStyleType r0 = r0.f99260a
            r4 = r0
        L27:
            r0 = r4
            com.bilibili.ship.theseus.united.page.comment.CommentStyleType r1 = com.bilibili.ship.theseus.united.page.comment.CommentStyleType.CAROUSEL_TEXT
            if (r0 != r1) goto L31
            goto L38
        L31:
            java.lang.String r0 = "0"
            r4 = r0
            goto L3c
        L38:
            java.lang.String r0 = "1"
            r4 = r0
        L3c:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService.c():java.lang.String");
    }
}
