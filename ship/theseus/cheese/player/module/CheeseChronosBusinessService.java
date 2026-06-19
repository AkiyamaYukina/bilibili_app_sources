package com.bilibili.ship.theseus.cheese.player.module;

import android.app.Activity;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import com.bapis.bilibili.playershared.FragmentVideo;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.page.activityresult.ActivityResultRepository;
import com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService;
import com.bilibili.ship.theseus.united.page.danmaku.i;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
import com.bilibili.ship.theseus.united.page.intro.module.season.E;
import com.bilibili.ship.theseus.united.page.view.t;
import eu0.C6985d;
import eu0.C7005x;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.local.RpcInvokeObserver;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.FetchBusinessData;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.GetOnlineInfo;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.GetWorkInfo;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.InvokeCommandDetailPanel;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.OpenUrlScheme;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.ReportSubtitle;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateCurrentWork;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateFullscreenState;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdatePreference;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateShipChain;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateVideoDetailState;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.model.DanmakuFeedbackInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/module/CheeseChronosBusinessService.class */
@StabilityInferred(parameters = 0)
public final class CheeseChronosBusinessService implements RpcInvokeObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChronosBusinessService f90641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f90643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C6985d f90644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final j f90645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f90646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f90647g;

    @NotNull
    public final t h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final EpisodeExtraInfoRepository f90648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final C7893a f90649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final E f90650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Activity f90651l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lifecycle f90652m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final C7005x f90653n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ActivityResultRepository f90654o;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.module.CheeseChronosBusinessService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/module/CheeseChronosBusinessService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseChronosBusinessService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseChronosBusinessService cheeseChronosBusinessService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseChronosBusinessService;
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
                CheeseChronosBusinessService cheeseChronosBusinessService = this.this$0;
                this.label = 1;
                if (CheeseChronosBusinessService.b(cheeseChronosBusinessService, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.module.CheeseChronosBusinessService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/module/CheeseChronosBusinessService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseChronosBusinessService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CheeseChronosBusinessService cheeseChronosBusinessService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cheeseChronosBusinessService;
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
                CheeseChronosBusinessService cheeseChronosBusinessService = this.this$0;
                this.label = 1;
                if (CheeseChronosBusinessService.a(cheeseChronosBusinessService, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.module.CheeseChronosBusinessService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/module/CheeseChronosBusinessService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseChronosBusinessService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CheeseChronosBusinessService cheeseChronosBusinessService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = cheeseChronosBusinessService;
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
                CheeseChronosBusinessService cheeseChronosBusinessService = this.this$0;
                this.label = 1;
                if (CheeseChronosBusinessService.c(cheeseChronosBusinessService, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.module.CheeseChronosBusinessService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/module/CheeseChronosBusinessService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseChronosBusinessService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.module.CheeseChronosBusinessService$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/module/CheeseChronosBusinessService$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<ExtraInfo, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<Long> $currentEpisodeCid;
            Object L$0;
            int label;
            final CheeseChronosBusinessService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref.ObjectRef<Long> objectRef, CheeseChronosBusinessService cheeseChronosBusinessService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$currentEpisodeCid = objectRef;
                this.this$0 = cheeseChronosBusinessService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentEpisodeCid, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(ExtraInfo extraInfo, Continuation<? super Unit> continuation) {
                return create(extraInfo, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ExtraInfo extraInfo = (ExtraInfo) this.L$0;
                    Ref.ObjectRef<Long> objectRef = this.$currentEpisodeCid;
                    if (objectRef.element == null && extraInfo != null) {
                        C7893a.C1318a c1318aC = this.this$0.f90649j.c();
                        objectRef.element = c1318aC != null ? Boxing.boxLong(c1318aC.f123395a.f123398b) : null;
                        j jVar = this.this$0.f90645e;
                        this.label = 1;
                        if (jVar.u(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                IRemoteHandler remoteHandler = this.this$0.f90643c.getRemoteHandler();
                if (remoteHandler != null) {
                    remoteHandler.updateCurrentWorkInfo(this.this$0.d());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(CheeseChronosBusinessService cheeseChronosBusinessService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = cheeseChronosBusinessService;
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
                Ref.ObjectRef objectRefB = G0.g.b(obj);
                CheeseChronosBusinessService cheeseChronosBusinessService = this.this$0;
                StateFlow<ExtraInfo> stateFlow = cheeseChronosBusinessService.f90648i.f99566b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRefB, cheeseChronosBusinessService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
    public CheeseChronosBusinessService(@NotNull CoroutineScope coroutineScope, @NotNull ChronosBusinessService chronosBusinessService, @NotNull IInteractLayerService iInteractLayerService, @NotNull C6985d c6985d, @NotNull j jVar, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull t tVar, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull C7893a c7893a, @NotNull E e7, @NotNull Activity activity, @NotNull Lifecycle lifecycle, @NotNull C7005x c7005x, @NotNull ActivityResultRepository activityResultRepository) {
        this.f90641a = chronosBusinessService;
        this.f90642b = coroutineScope;
        this.f90643c = iInteractLayerService;
        this.f90644d = c6985d;
        this.f90645e = jVar;
        this.f90646f = dVar;
        this.f90647g = aVar;
        this.h = tVar;
        this.f90648i = episodeExtraInfoRepository;
        this.f90649j = c7893a;
        this.f90650k = e7;
        this.f90651l = activity;
        this.f90652m = lifecycle;
        this.f90653n = c7005x;
        this.f90654o = activityResultRepository;
        iInteractLayerService.enableReply(true);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.cheese.player.module.CheeseChronosBusinessService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.player.module.CheeseChronosBusinessService.a(com.bilibili.ship.theseus.cheese.player.module.CheeseChronosBusinessService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.cheese.player.module.CheeseChronosBusinessService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.player.module.CheeseChronosBusinessService.b(com.bilibili.ship.theseus.cheese.player.module.CheeseChronosBusinessService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.bilibili.ship.theseus.cheese.player.module.CheeseChronosBusinessService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws kotlin.KotlinNothingValueException {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.cheese.player.module.CheeseChronosBusinessService$collectPermissionGrantResult$1
            if (r0 == 0) goto L2a
            r0 = r6
            com.bilibili.ship.theseus.cheese.player.module.CheeseChronosBusinessService$collectPermissionGrantResult$1 r0 = (com.bilibili.ship.theseus.cheese.player.module.CheeseChronosBusinessService$collectPermissionGrantResult$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2a
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L34
        L2a:
            com.bilibili.ship.theseus.cheese.player.module.CheeseChronosBusinessService$collectPermissionGrantResult$1 r0 = new com.bilibili.ship.theseus.cheese.player.module.CheeseChronosBusinessService$collectPermissionGrantResult$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L34:
            r0 = r6
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L5e
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L56
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L56:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L97
        L5e:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            eu0.x r0 = r0.f90653n
            boolean r0 = r0.f117592a
            if (r0 != 0) goto L74
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r5 = r0
            goto L95
        L74:
            r0 = r5
            com.bilibili.ship.theseus.united.page.activityresult.ActivityResultRepository r0 = r0.f90654o
            kotlinx.coroutines.flow.SharedFlow<com.bilibili.ship.theseus.united.page.activityresult.a> r0 = r0.f98829c
            r9 = r0
            com.bilibili.ship.theseus.cheese.player.module.d<T> r0 = com.bilibili.ship.theseus.cheese.player.module.d.f90668a
            r5 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r9
            r1 = r5
            r2 = r6
            java.lang.Object r0 = r0.collect(r1, r2)
            r1 = r8
            if (r0 != r1) goto L97
            r0 = r8
            r5 = r0
        L95:
            r0 = r5
            return r0
        L97:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.player.module.CheeseChronosBusinessService.c(com.bilibili.ship.theseus.cheese.player.module.CheeseChronosBusinessService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final GetWorkInfo.Response d() {
        FragmentVideo fragmentVideo;
        GetWorkInfo.Response response = new GetWorkInfo.Response();
        C6985d c6985d = this.f90644d;
        response.setWorkId(String.valueOf(c6985d.f117510e));
        j jVar = this.f90645e;
        response.setVideoId(String.valueOf(jVar.f().getCid()));
        response.setWorkTitle(this.f90647g.f());
        response.setVideoTitle(c6985d.f117512g);
        response.setDuration(jVar.p().h());
        com.bilibili.ship.theseus.united.page.view.d dVar = this.f90646f;
        response.setUpperId(new String[]{String.valueOf(dVar.f())});
        response.setUpperAvatar(dVar.b());
        response.setUpperName(dVar.g());
        response.getControlList().put("dm_treasure_box_control", Boolean.valueOf(this.h.f104126b.f104088c));
        ExtraInfo extraInfoA = this.f90648i.a();
        response.setAttachment((extraInfoA == null || (fragmentVideo = (FragmentVideo) vv0.d.f128454b.a(extraInfoA)) == null) ? null : i.a(fragmentVideo));
        response.setEpId(String.valueOf(c6985d.f117521q));
        response.setSeasonId(String.valueOf(c6985d.f117526v));
        return response;
    }

    @Nullable
    public final FetchBusinessData.Response fetchBusinessData(@NotNull String str, @Nullable Object obj) {
        return this.f90641a.fetchBusinessData(str, obj);
    }

    @Nullable
    public final GetOnlineInfo.Response getOnlineInfo() {
        return this.f90641a.getOnlineInfo();
    }

    @Nullable
    public final int[] getPlayerComponentsHeight() {
        return this.f90641a.getPlayerComponentsHeight();
    }

    @Nullable
    public final UpdateShipChain.Response getRelationshipChain() {
        this.f90641a.getClass();
        return null;
    }

    public final void notifyDanmakuExperiment(@Nullable String str, boolean z6) {
        this.f90641a.notifyDanmakuExperiment(str, z6);
    }

    public final void notifyDanmakuSent(@Nullable String str) {
        this.f90641a.notifyDanmakuSent(str);
    }

    public final void onDanmakuReply(@NotNull String str, @NotNull String str2, long j7, @NotNull String str3) {
        this.f90641a.onDanmakuReply(str, str2, j7, str3);
    }

    public final void onInvokeDanmakuInputPanel(@Nullable InvokeCommandDetailPanel.CommandDetailParams commandDetailParams) {
        this.f90641a.onInvokeDanmakuInputPanel(commandDetailParams);
    }

    @NotNull
    public final UpdateCurrentWork.Response onRpcGetCurrentWork() {
        UpdateCurrentWork.Response response = new UpdateCurrentWork.Response();
        response.setWorkId(String.valueOf(this.f90644d.f117510e));
        response.setVideoId(String.valueOf(this.f90645e.f().getCid()));
        return response;
    }

    @NotNull
    public final GetWorkInfo.Response onRpcGetWorkInfo() {
        return d();
    }

    public final void onShowDanmakuFeedback(@NotNull DanmakuFeedbackInfo danmakuFeedbackInfo, @NotNull String str, @NotNull Map<String, String> map, @NotNull Function8<? super Boolean, ? super Boolean, ? super Boolean, ? super String, ? super String, ? super String, ? super String, ? super GeneralResponse<String>, Unit> function8) {
        this.f90641a.onShowDanmakuFeedback(danmakuFeedbackInfo, str, map, function8);
    }

    public final void onTriggerTripleLike() {
        this.f90641a.onTriggerTripleLike();
    }

    public final void onUpdateClockInState(@NotNull UpdateVideoDetailState.CheckInState checkInState) {
        this.f90641a.onUpdateClockInState(checkInState);
    }

    public final void onUpdateCoinState(boolean z6) {
        this.f90641a.onUpdateCoinState(z6);
    }

    public final boolean onUpdateCurrentWork(@Nullable UpdateCurrentWork.Request request) {
        this.f90641a.getClass();
        return false;
    }

    public final void onUpdateDislikeState(boolean z6) {
        this.f90641a.onUpdateDislikeState(z6);
    }

    public final void onUpdateFavoState(boolean z6) {
        this.f90641a.onUpdateFavoState(z6);
    }

    public final void onUpdateFollowState(boolean z6) {
        this.f90641a.onUpdateFollowState(z6);
    }

    public final void onUpdateLikeState(boolean z6) {
        this.f90641a.onUpdateLikeState(z6);
    }

    @Deprecated(message = "使用明确的行为定义，而不是使用这个聚合体")
    public final void onUpdateRelationshipChain(@Nullable UpdateShipChain.Request request) {
        this.f90641a.onUpdateRelationshipChain(request);
    }

    public final void onUpdateReserveState(@NotNull UpdateVideoDetailState.ReserveState reserveState) {
        this.f90641a.onUpdateReserveState(reserveState);
    }

    public final void onUpdateSeasonFollowState(boolean z6) {
        this.f90641a.onUpdateSeasonFollowState(z6);
    }

    public final void onUpdateStaffFollowState(@NotNull List<UpdateVideoDetailState.FollowState> list) {
        this.f90641a.onUpdateStaffFollowState(list);
    }

    public final boolean openURLSchema(@NotNull Uri uri, @Nullable OpenUrlScheme.BizParams bizParams) {
        return this.f90641a.openURLSchema(uri, bizParams);
    }

    public final boolean openURLScheme(@NotNull String str, @Nullable String str2, @Nullable Integer num, @Nullable OpenUrlScheme.BizParams bizParams, @Nullable Integer num2) {
        return this.f90641a.openURLScheme(str, str2, num, bizParams, num2);
    }

    public final void showDanmakuFeedbackWebview(@NotNull String str, @NotNull Map<String, String> map, @NotNull Function8<? super Boolean, ? super Boolean, ? super Boolean, ? super String, ? super String, ? super String, ? super String, ? super GeneralResponse<String>, Unit> function8) {
        this.f90641a.showDanmakuFeedbackWebview(str, map, function8);
    }

    public final void showPlayerNaPage(@NotNull String str) {
        this.f90641a.showPlayerNaPage(str);
    }

    public final void showPlayerWebView(@NotNull String str) {
        this.f90641a.showPlayerWebView(str);
    }

    public final boolean showSubtitleReportDialog(@Nullable ReportSubtitle.SubtitleMeta subtitleMeta, @Nullable ReportSubtitle.SubtitleMeta subtitleMeta2) {
        return this.f90641a.showSubtitleReportDialog(subtitleMeta, subtitleMeta2);
    }

    public final void updateDanmakuInputPanel(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Function2<Object, ? super Map<String, byte[]>, Unit> function2) {
        this.f90641a.updateDanmakuInputPanel(str, bool, bool2, function2);
    }

    @Nullable
    public final UpdateFullscreenState.Response updateFullscreenState(@Nullable Boolean bool, @Nullable Boolean bool2) {
        return this.f90641a.updateFullscreenState(bool, bool2);
    }

    @Nullable
    public final UpdatePreference.Response updatePreference(@NotNull String str, @Nullable String str2) {
        return this.f90641a.updatePreference(str, str2);
    }
}
