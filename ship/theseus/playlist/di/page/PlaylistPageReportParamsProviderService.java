package com.bilibili.ship.theseus.playlist.di.page;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.bilibili.lib.accounts.BiliAccountInfoKt;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import mv0.C8043a;
import mv0.C8044b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/PlaylistPageReportParamsProviderService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistPageReportParamsProviderService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageReportService f95692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f95693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f95694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f95695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C8043a f95696f;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.page.PlaylistPageReportParamsProviderService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/PlaylistPageReportParamsProviderService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistPageReportParamsProviderService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.page.PlaylistPageReportParamsProviderService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/PlaylistPageReportParamsProviderService$1$1.class */
        public static final class C07881 extends SuspendLambda implements Function2<AccountInfo, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlaylistPageReportParamsProviderService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07881(PlaylistPageReportParamsProviderService playlistPageReportParamsProviderService, Continuation<? super C07881> continuation) {
                super(2, continuation);
                this.this$0 = playlistPageReportParamsProviderService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07881 c07881 = new C07881(this.this$0, continuation);
                c07881.L$0 = obj;
                return c07881;
            }

            public final Object invoke(AccountInfo accountInfo, Continuation<? super Unit> continuation) {
                return create(accountInfo, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AccountInfo accountInfo = (AccountInfo) this.L$0;
                    VipUserInfo vipInfo = accountInfo != null ? accountInfo.getVipInfo() : null;
                    if (vipInfo != null) {
                        PageReportService pageReportService = this.this$0.f95692b;
                        Map<String, String> mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("vip_status", String.valueOf(vipInfo.getVipStatus())), TuplesKt.to("vip_type", String.valueOf(vipInfo.getVipType())), TuplesKt.to("vip_due_date", String.valueOf(vipInfo.getEndTime()))});
                        this.label = 1;
                        if (pageReportService.e(mapMapOf, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
        public AnonymousClass1(PlaylistPageReportParamsProviderService playlistPageReportParamsProviderService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistPageReportParamsProviderService;
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
                Flow flowA = BiliAccountInfoKt.a(this.this$0.f95695e);
                C07881 c07881 = new C07881(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, c07881, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.page.PlaylistPageReportParamsProviderService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/PlaylistPageReportParamsProviderService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistPageReportParamsProviderService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.page.PlaylistPageReportParamsProviderService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/PlaylistPageReportParamsProviderService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C8044b, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlaylistPageReportParamsProviderService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistPageReportParamsProviderService playlistPageReportParamsProviderService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playlistPageReportParamsProviderService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C8044b c8044b, Continuation<? super Unit> continuation) {
                return create(c8044b, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C8044b c8044b = (C8044b) this.L$0;
                    PageReportService pageReportService = this.this$0.f95692b;
                    Map<String, String> mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("from_spmid", c8044b.f123881c), TuplesKt.to("from_out_spmid", c8044b.f123883e)});
                    this.label = 1;
                    if (pageReportService.e(mapMapOf, this) == coroutine_suspended) {
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
        public AnonymousClass2(PlaylistPageReportParamsProviderService playlistPageReportParamsProviderService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playlistPageReportParamsProviderService;
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
                PlaylistPageReportParamsProviderService playlistPageReportParamsProviderService = this.this$0;
                MutableStateFlow mutableStateFlow = playlistPageReportParamsProviderService.f95696f.f123877b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistPageReportParamsProviderService, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.page.PlaylistPageReportParamsProviderService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/PlaylistPageReportParamsProviderService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistPageReportParamsProviderService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.page.PlaylistPageReportParamsProviderService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/PlaylistPageReportParamsProviderService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<com.bilibili.ship.theseus.keel.player.j, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlaylistPageReportParamsProviderService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistPageReportParamsProviderService playlistPageReportParamsProviderService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playlistPageReportParamsProviderService;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String invokeSuspend$lambda$0(com.bilibili.ship.theseus.keel.player.j jVar) {
                return String.valueOf(jVar.L() / ((long) 1000));
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(com.bilibili.ship.theseus.keel.player.j jVar, Continuation<? super Unit> continuation) {
                return create(jVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r11 = r0
                    r0 = r7
                    int r0 = r0.label
                    r9 = r0
                    r0 = r9
                    if (r0 == 0) goto L3a
                    r0 = r9
                    r1 = 1
                    if (r0 == r1) goto L29
                    r0 = r9
                    r1 = 2
                    if (r0 != r1) goto L1f
                    r0 = r8
                    kotlin.ResultKt.throwOnFailure(r0)
                    goto Lbd
                L1f:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r0
                L29:
                    r0 = r7
                    java.lang.Object r0 = r0.L$0
                    com.bilibili.ship.theseus.keel.player.j r0 = (com.bilibili.ship.theseus.keel.player.j) r0
                    r10 = r0
                    r0 = r8
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r10
                    r8 = r0
                    goto L7e
                L3a:
                    r0 = r8
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r7
                    java.lang.Object r0 = r0.L$0
                    com.bilibili.ship.theseus.keel.player.j r0 = (com.bilibili.ship.theseus.keel.player.j) r0
                    r8 = r0
                    r0 = r8
                    if (r0 == 0) goto Lbd
                    r0 = r7
                    com.bilibili.ship.theseus.playlist.di.page.PlaylistPageReportParamsProviderService r0 = r0.this$0
                    com.bilibili.ship.theseus.united.page.report.PageReportService r0 = r0.f95692b
                    r12 = r0
                    kotlin.Pair r0 = new kotlin.Pair
                    r1 = r0
                    java.lang.String r2 = "pgc_ep_progress"
                    com.bilibili.ship.theseus.playlist.di.page.U r3 = new com.bilibili.ship.theseus.playlist.di.page.U
                    r4 = r3
                    r5 = r8
                    r4.<init>(r5)
                    r1.<init>(r2, r3)
                    r10 = r0
                    r0 = r7
                    r1 = r8
                    r0.L$0 = r1
                    r0 = r7
                    r1 = 1
                    r0.label = r1
                    r0 = r12
                    r1 = r10
                    r2 = r7
                    java.lang.Object r0 = r0.b(r1, r2)
                    r1 = r11
                    if (r0 != r1) goto L7e
                    r0 = r11
                    return r0
                L7e:
                    r0 = r8
                    kotlinx.coroutines.flow.StateFlow r0 = r0.l()
                    java.lang.Object r0 = r0.getValue()
                    com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams r0 = (com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams) r0
                    r10 = r0
                    r0 = r7
                    com.bilibili.ship.theseus.playlist.di.page.PlaylistPageReportParamsProviderService r0 = r0.this$0
                    com.bilibili.ship.theseus.united.page.report.PageReportService r0 = r0.f95692b
                    r8 = r0
                    java.lang.String r0 = "cid"
                    r1 = r10
                    long r1 = r1.getCid()
                    java.lang.String r1 = java.lang.String.valueOf(r1)
                    kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
                    java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r0)
                    r10 = r0
                    r0 = r7
                    r1 = 0
                    r0.L$0 = r1
                    r0 = r7
                    r1 = 2
                    r0.label = r1
                    r0 = r8
                    r1 = r10
                    r2 = r7
                    java.lang.Object r0 = r0.e(r1, r2)
                    r1 = r11
                    if (r0 != r1) goto Lbd
                    r0 = r11
                    return r0
                Lbd:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.di.page.PlaylistPageReportParamsProviderService.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PlaylistPageReportParamsProviderService playlistPageReportParamsProviderService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = playlistPageReportParamsProviderService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowAsStateFlow = FlowKt.asStateFlow(this.this$0.f95693c.f91111e);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowAsStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.page.PlaylistPageReportParamsProviderService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/PlaylistPageReportParamsProviderService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistPageReportParamsProviderService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.page.PlaylistPageReportParamsProviderService$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/PlaylistPageReportParamsProviderService$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlaylistPageReportParamsProviderService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistPageReportParamsProviderService playlistPageReportParamsProviderService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playlistPageReportParamsProviderService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(c.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    c.a aVar = (c.a) this.L$0;
                    PageReportService pageReportService = this.this$0.f95692b;
                    Map<String, String> mapMapOf = MapsKt.mapOf(TuplesKt.to("player_status", aVar.f102988b ? "2" : "1"));
                    this.label = 1;
                    if (pageReportService.e(mapMapOf, this) == coroutine_suspended) {
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
        public AnonymousClass4(PlaylistPageReportParamsProviderService playlistPageReportParamsProviderService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = playlistPageReportParamsProviderService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowC = this.this$0.f95694d.c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowC, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.page.PlaylistPageReportParamsProviderService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/PlaylistPageReportParamsProviderService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistPageReportParamsProviderService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.page.PlaylistPageReportParamsProviderService$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/PlaylistPageReportParamsProviderService$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<AccountInfo, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlaylistPageReportParamsProviderService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistPageReportParamsProviderService playlistPageReportParamsProviderService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playlistPageReportParamsProviderService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(AccountInfo accountInfo, Continuation<? super Unit> continuation) {
                return create(accountInfo, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AccountInfo accountInfo = (AccountInfo) this.L$0;
                    VipUserInfo vipInfo = accountInfo != null ? accountInfo.getVipInfo() : null;
                    if (vipInfo != null) {
                        PageReportService pageReportService = this.this$0.f95692b;
                        Map mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("vip_status", String.valueOf(vipInfo.getVipStatus())), TuplesKt.to("vip_type", String.valueOf(vipInfo.getVipType())), TuplesKt.to("vip_due_date", String.valueOf(vipInfo.getEndTime()))});
                        this.label = 1;
                        if (pageReportService.d(mapMapOf, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
        public AnonymousClass5(PlaylistPageReportParamsProviderService playlistPageReportParamsProviderService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = playlistPageReportParamsProviderService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = BiliAccountInfoKt.a(this.this$0.f95695e);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, anonymousClass1, this) == coroutine_suspended) {
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
    public PlaylistPageReportParamsProviderService(@NotNull CoroutineScope coroutineScope, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull BiliAccounts biliAccounts, @NotNull C8043a c8043a) {
        this.f95691a = coroutineScope;
        this.f95692b = pageReportService;
        this.f95693c = hVar;
        this.f95694d = cVar;
        this.f95695e = biliAccounts;
        this.f95696f = c8043a;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
    }
}
