package com.bilibili.ship.theseus.ugc.backgroundplay;

import android.app.KeyguardManager;
import android.content.SharedPreferences;
import androidx.appcompat.widget.C3259x;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.home.v1.l;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.ogv.operation2.inlinevideo.v;
import com.bilibili.playerbizcommon.features.headset.PlayerHeadsetService;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.ugc.play.schedule.PlaybackMode;
import com.bilibili.ship.theseus.ugc.play.schedule.UGCEpisodeListRepository;
import com.bilibili.ship.theseus.ugc.play.schedule.e;
import com.bilibili.ship.theseus.ugc.play.schedule.k;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import ev0.InterfaceC7008a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.ui.player.data.NotificationStyle;
import tv.danmaku.biliplayerv2.clock.PlayerProgressRangeObserver;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.service.setting.PlayerSettingChangeObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/UGCBackgroundPlayService.class */
@StabilityInferred(parameters = 0)
public final class UGCBackgroundPlayService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f96303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final UGCEpisodeListRepository f96304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final UGCPlaybackRepository f96305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final RelationRepository f96306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C8043a f96307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final rW0.a<InterfaceC7008a> f96308g;

    @NotNull
    public final IPlayerCoreService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final k f96309i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final IReporterService f96310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final PlayerHeadsetService f96311k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f96312l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final h f96313m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f96314n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final d f96315o = new d(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final c f96316p = new c(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final b f96317q = new b(this);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.backgroundplay.UGCBackgroundPlayService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/UGCBackgroundPlayService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCBackgroundPlayService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.backgroundplay.UGCBackgroundPlayService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/UGCBackgroundPlayService$1$1.class */
        public static final class C08081 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final UGCBackgroundPlayService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.backgroundplay.UGCBackgroundPlayService$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/UGCBackgroundPlayService$1$1$1.class */
            public static final class C08091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final boolean $it;
                private Object L$0;
                int label;
                final UGCBackgroundPlayService this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.backgroundplay.UGCBackgroundPlayService$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/UGCBackgroundPlayService$1$1$1$1.class */
                public static final class C08101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    int label;
                    final UGCBackgroundPlayService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C08101(UGCBackgroundPlayService uGCBackgroundPlayService, Continuation<? super C08101> continuation) {
                        super(2, continuation);
                        this.this$0 = uGCBackgroundPlayService;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C08101(this.this$0, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            UGCBackgroundPlayService uGCBackgroundPlayService = this.this$0;
                            this.label = 1;
                            Object objCollectLatest = FlowKt.collectLatest(uGCBackgroundPlayService.f96305d.f98076u, new UGCBackgroundPlayService$collectBackgroundIndex$2(uGCBackgroundPlayService, null), this);
                            if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objCollectLatest = Unit.INSTANCE;
                            }
                            if (objCollectLatest == coroutine_suspended) {
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
                public C08091(boolean z6, UGCBackgroundPlayService uGCBackgroundPlayService, Continuation<? super C08091> continuation) {
                    super(2, continuation);
                    this.$it = z6;
                    this.this$0 = uGCBackgroundPlayService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C08091 c08091 = new C08091(this.$it, this.this$0, continuation);
                    c08091.L$0 = obj;
                    return c08091;
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    GeminiCommonPlayableParams geminiCommonPlayableParamsF;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    if (this.$it) {
                        UGCBackgroundPlayService uGCBackgroundPlayService = this.this$0;
                        uGCBackgroundPlayService.getClass();
                        BLog.i("UGCBackgroundPlayService-onBackPlayStart", "[theseus-ugc-UGCBackgroundPlayService-onBackPlayStart] onBackPlayStart");
                        uGCBackgroundPlayService.f96312l.addPlayerSettingChangeObserver(uGCBackgroundPlayService.f96315o, new String[0]);
                        PageBackgroundPlayRepository pageBackgroundPlayRepository = uGCBackgroundPlayService.f96303b;
                        GeminiCommonPlayableParams geminiCommonPlayableParams = pageBackgroundPlayRepository.f99000j;
                        long cid = geminiCommonPlayableParams != null ? geminiCommonPlayableParams.getCid() : 0L;
                        if (cid != 0) {
                            defpackage.a.b("[theseus-ugc-UGCBackgroundPlayService-onBackPlayStart] ", C3751q.a(cid, "onBackPlayStart, current anchor is "), "UGCBackgroundPlayService-onBackPlayStart");
                        } else {
                            h hVar = uGCBackgroundPlayService.f96313m;
                            j jVarJ = hVar.j();
                            if (jVarJ != null && (geminiCommonPlayableParamsF = jVarJ.f()) != null) {
                                List<e> listA = uGCBackgroundPlayService.f96304c.a();
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
                                Iterator<T> it = listA.iterator();
                                while (it.hasNext()) {
                                    Av0.a aVar = ((e) it.next()).f98180a;
                                    arrayList.add(new com.bilibili.ship.theseus.united.page.background.a(12, aVar.f590a, aVar.f591b, null));
                                }
                                defpackage.a.b("[theseus-united-PageBackgroundPlayRepository-anchorEpisode] ", l.a(arrayList.size(), geminiCommonPlayableParamsF.getCid(), "anchorEpisode, ", " "), "PageBackgroundPlayRepository-anchorEpisode");
                                pageBackgroundPlayRepository.f98999i.clear();
                                pageBackgroundPlayRepository.f98999i.addAll(arrayList);
                                pageBackgroundPlayRepository.f99000j = geminiCommonPlayableParamsF;
                                pageBackgroundPlayRepository.f99005o = arrayList.size();
                                pageBackgroundPlayRepository.h = com.bilibili.ship.theseus.united.utils.e.b();
                                pageBackgroundPlayRepository.f99002l = pageBackgroundPlayRepository.c(geminiCommonPlayableParamsF.getCid());
                                j jVarJ2 = hVar.j();
                                Long lH = jVarJ2 != null ? jVarJ2.h() : null;
                                j jVarJ3 = hVar.j();
                                Long lValueOf = jVarJ3 != null ? Long.valueOf(jVarJ3.L()) : null;
                                if (lH != null && lValueOf != null) {
                                    if (lValueOf.longValue() >= lH.longValue() - v.f70979a) {
                                        pageBackgroundPlayRepository.e();
                                    } else {
                                        uGCBackgroundPlayService.h.registerPlayerProgressRangeObserver(uGCBackgroundPlayService.f96316p, lH.longValue() - v.f70979a, lH.longValue());
                                    }
                                }
                            }
                        }
                        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C08101(this.this$0, null), 3, (Object) null);
                    } else {
                        UGCBackgroundPlayService uGCBackgroundPlayService2 = this.this$0;
                        uGCBackgroundPlayService2.getClass();
                        BLog.i("UGCBackgroundPlayService-onBackPlayStop", "[theseus-ugc-UGCBackgroundPlayService-onBackPlayStop] onBackPlayStop");
                        BLog.i("UGCBackgroundPlayService-removeListener", "[theseus-ugc-UGCBackgroundPlayService-removeListener] removeListener");
                        uGCBackgroundPlayService2.f96312l.removePlayerSettingChangeObserver(uGCBackgroundPlayService2.f96315o);
                        uGCBackgroundPlayService2.h.unregisterPlayerProgressRangeObserver(uGCBackgroundPlayService2.f96316p);
                        PageBackgroundPlayRepository pageBackgroundPlayRepository2 = uGCBackgroundPlayService2.f96303b;
                        GeminiCommonPlayableParams geminiCommonPlayableParams2 = pageBackgroundPlayRepository2.f99000j;
                        if ((geminiCommonPlayableParams2 != null ? geminiCommonPlayableParams2.getCid() : 0L) != 0) {
                            if (pageBackgroundPlayRepository2.f99003m) {
                                pageBackgroundPlayRepository2.f99003m = false;
                                com.bilibili.ship.theseus.united.page.background.a aVar2 = (com.bilibili.ship.theseus.united.page.background.a) CollectionsKt.getOrNull(pageBackgroundPlayRepository2.f98999i, pageBackgroundPlayRepository2.f99002l);
                                if (aVar2 != null) {
                                    C8043a c8043a = uGCBackgroundPlayService2.f96307f;
                                    InterfaceC7008a.c((InterfaceC7008a) uGCBackgroundPlayService2.f96308g.get(), new InterfaceC7008a.C1258a(aVar2.f99036a, null, aVar2.f99037b, c8043a.a().f123879a, c8043a.a().f123881c, "", c8043a.a().f123882d, null, null, null, null, null, 0L, false, 0, false, 65410), null, null, null, false, 99, 14);
                                    BLog.i("PageBackgroundPlayRepository-resetAnchor", "[theseus-united-PageBackgroundPlayRepository-resetAnchor] resetAnchor");
                                    pageBackgroundPlayRepository2.f98998g = 1L;
                                    pageBackgroundPlayRepository2.f98999i.clear();
                                    pageBackgroundPlayRepository2.f98996e = false;
                                    pageBackgroundPlayRepository2.h = null;
                                    pageBackgroundPlayRepository2.f99000j = null;
                                }
                            } else {
                                BLog.i("PageBackgroundPlayRepository-resetAnchor", "[theseus-united-PageBackgroundPlayRepository-resetAnchor] resetAnchor");
                                pageBackgroundPlayRepository2.f98998g = 1L;
                                pageBackgroundPlayRepository2.f98999i.clear();
                                pageBackgroundPlayRepository2.f98996e = false;
                                pageBackgroundPlayRepository2.h = null;
                                pageBackgroundPlayRepository2.f99000j = null;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08081(UGCBackgroundPlayService uGCBackgroundPlayService, Continuation<? super C08081> continuation) {
                super(2, continuation);
                this.this$0 = uGCBackgroundPlayService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08081 c08081 = new C08081(this.this$0, continuation);
                c08081.Z$0 = ((Boolean) obj).booleanValue();
                return c08081;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C08091 c08091 = new C08091(this.Z$0, this.this$0, null);
                    this.label = 1;
                    if (CoroutineScopeKt.coroutineScope(c08091, this) == coroutine_suspended) {
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
        public AnonymousClass1(UGCBackgroundPlayService uGCBackgroundPlayService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCBackgroundPlayService;
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
                UGCBackgroundPlayService uGCBackgroundPlayService = this.this$0;
                StateFlow<Boolean> stateFlow = uGCBackgroundPlayService.f96303b.f99007q;
                C08081 c08081 = new C08081(uGCBackgroundPlayService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c08081, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.backgroundplay.UGCBackgroundPlayService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/UGCBackgroundPlayService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final UGCBackgroundPlayService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.backgroundplay.UGCBackgroundPlayService$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/UGCBackgroundPlayService$2$a.class */
        public static final class a implements com.bilibili.lib.coroutineextension.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1 f96321a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UGCBackgroundPlayService f96322b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Lq0.b f96323c;

            public a(UGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1 uGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1, UGCBackgroundPlayService uGCBackgroundPlayService, Lq0.b bVar) {
                this.f96321a = uGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1;
                this.f96322b = uGCBackgroundPlayService;
                this.f96323c = bVar;
            }

            public final void invoke() {
                this.f96321a.h(null);
                this.f96322b.f96311k.setMediaSessionPlayback(this.f96323c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UGCBackgroundPlayService uGCBackgroundPlayService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = uGCBackgroundPlayService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            com.bilibili.lib.coroutineextension.j aVar;
            Throwable th;
            com.bilibili.lib.coroutineextension.j jVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                UGCBackgroundPlayService uGCBackgroundPlayService = this.this$0;
                Lq0.b mediaSessionPlayback = uGCBackgroundPlayService.f96311k.getMediaSessionPlayback();
                UGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1 uGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1 = new UGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1(mediaSessionPlayback, uGCBackgroundPlayService);
                uGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1.h(uGCBackgroundPlayService.f96317q);
                uGCBackgroundPlayService.f96311k.setMediaSessionPlayback(uGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1);
                aVar = new a(uGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1, uGCBackgroundPlayService, mediaSessionPlayback);
                try {
                    this.L$0 = aVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    jVar = aVar;
                    jVar.invoke();
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bilibili.lib.coroutineextension.j jVar2 = (com.bilibili.lib.coroutineextension.j) this.L$0;
                jVar = jVar2;
                try {
                    ResultKt.throwOnFailure(obj);
                    aVar = jVar2;
                } catch (Throwable th3) {
                    th = th3;
                    jVar.invoke();
                    throw th;
                }
            }
            com.bilibili.lib.coroutineextension.j jVar3 = aVar;
            jVar = aVar;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.backgroundplay.UGCBackgroundPlayService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/UGCBackgroundPlayService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCBackgroundPlayService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.backgroundplay.UGCBackgroundPlayService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/UGCBackgroundPlayService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final UGCBackgroundPlayService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UGCBackgroundPlayService uGCBackgroundPlayService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = uGCBackgroundPlayService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                BLog.i("UGCBackgroundPlayService$3$1-invokeSuspend", "[theseus-ugc-UGCBackgroundPlayService$3$1-invokeSuspend] requestSuccessFlow");
                this.this$0.f96311k.updateMetadata();
                UGCBackgroundPlayService uGCBackgroundPlayService = this.this$0;
                PageBackgroundPlayRepository pageBackgroundPlayRepository = uGCBackgroundPlayService.f96303b;
                if (pageBackgroundPlayRepository.f99004n) {
                    pageBackgroundPlayRepository.f99004n = false;
                    uGCBackgroundPlayService.d();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(UGCBackgroundPlayService uGCBackgroundPlayService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = uGCBackgroundPlayService;
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
                UGCBackgroundPlayService uGCBackgroundPlayService = this.this$0;
                SharedFlow<Unit> sharedFlow = uGCBackgroundPlayService.f96303b.f99009s;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(uGCBackgroundPlayService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.backgroundplay.UGCBackgroundPlayService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/UGCBackgroundPlayService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final UGCBackgroundPlayService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(UGCBackgroundPlayService uGCBackgroundPlayService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = uGCBackgroundPlayService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
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
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            UGCBackgroundPlayService uGCBackgroundPlayService = this.this$0;
            uGCBackgroundPlayService.f96303b.f98997f = true;
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UGCBackgroundPlayService$4$invokeSuspend$$inlined$awaitCancel$1(null, uGCBackgroundPlayService), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/UGCBackgroundPlayService$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f96324a;

        static {
            int[] iArr = new int[PlaybackMode.values().length];
            try {
                iArr[PlaybackMode.PAUSE_WHEN_ENDED.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PlaybackMode.AUTO_CONTINUOUS.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f96324a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/UGCBackgroundPlayService$b.class */
    public static final class b extends com.bilibili.playerbizcommon.features.background.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UGCBackgroundPlayService f96325c;

        public b(UGCBackgroundPlayService uGCBackgroundPlayService) {
            this.f96325c = uGCBackgroundPlayService;
        }

        public final boolean a() {
            return BiliAccounts.get(FoundationAlias.getFapp().getApplicationContext()).isLogin();
        }

        public final boolean b() {
            return this.f96325c.f96306e.i();
        }

        @Override // com.bilibili.playerbizcommon.features.background.a
        public final boolean c() {
            return true;
        }

        @Override // com.bilibili.playerbizcommon.features.background.a
        public final boolean e() {
            return this.f96325c.f96306e.j();
        }

        @Override // com.bilibili.playerbizcommon.features.background.a
        public final NotificationStyle f() {
            UGCBackgroundPlayService uGCBackgroundPlayService = this.f96325c;
            uGCBackgroundPlayService.getClass();
            SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
            if (!(bLKVSharedPreference != null ? bLKVSharedPreference.getBoolean("pref_player_background_auto_play_ai", true) : true)) {
                return super.f();
            }
            NotificationStyle notificationStyleF = super.f();
            SharedPreferences bLKVSharedPreference2 = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
            notificationStyleF.forceShowNextAndPrev = (bLKVSharedPreference2 != null ? bLKVSharedPreference2.getBoolean("pref_player_background_auto_play_ai", true) : true) && uGCBackgroundPlayService.f96303b.d();
            return notificationStyleF;
        }

        @Override // com.bilibili.playerbizcommon.features.background.a
        public final int g() {
            UGCBackgroundPlayService uGCBackgroundPlayService = this.f96325c;
            return !uGCBackgroundPlayService.f96303b.d() ? super.g() : uGCBackgroundPlayService.f96303b.f98999i.size();
        }

        @Override // com.bilibili.playerbizcommon.features.background.a
        public final int i() {
            UGCBackgroundPlayService uGCBackgroundPlayService = this.f96325c;
            return !uGCBackgroundPlayService.f96303b.d() ? super.i() : uGCBackgroundPlayService.f96303b.f99002l;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/UGCBackgroundPlayService$c.class */
    public static final class c implements PlayerProgressRangeObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UGCBackgroundPlayService f96326a;

        public c(UGCBackgroundPlayService uGCBackgroundPlayService) {
            this.f96326a = uGCBackgroundPlayService;
        }

        public final void onRangeStateChanged(boolean z6, int i7) {
            if (z6) {
                this.f96326a.f96303b.e();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/UGCBackgroundPlayService$d.class */
    public static final class d implements PlayerSettingChangeObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UGCBackgroundPlayService f96327a;

        public d(UGCBackgroundPlayService uGCBackgroundPlayService) {
            this.f96327a = uGCBackgroundPlayService;
        }

        public final void onChange(String str) {
            if (Intrinsics.areEqual(str, com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED)) {
                BLog.i("UGCBackgroundPlayService$playerSettingChangeObserver$1-onChange", "[theseus-ugc-UGCBackgroundPlayService$playerSettingChangeObserver$1-onChange] playerSettingChangeObserver change");
                this.f96327a.f96303b.e();
            }
        }
    }

    @Inject
    public UGCBackgroundPlayService(@NotNull CoroutineScope coroutineScope, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull UGCEpisodeListRepository uGCEpisodeListRepository, @NotNull UGCPlaybackRepository uGCPlaybackRepository, @NotNull RelationRepository relationRepository, @NotNull C8043a c8043a, @NotNull rW0.a<InterfaceC7008a> aVar, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull k kVar, @NotNull IReporterService iReporterService, @NotNull PlayerHeadsetService playerHeadsetService, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull h hVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar2) {
        this.f96302a = coroutineScope;
        this.f96303b = pageBackgroundPlayRepository;
        this.f96304c = uGCEpisodeListRepository;
        this.f96305d = uGCPlaybackRepository;
        this.f96306e = relationRepository;
        this.f96307f = c8043a;
        this.f96308g = aVar;
        this.h = iPlayerCoreService;
        this.f96309i = kVar;
        this.f96310j = iReporterService;
        this.f96311k = playerHeadsetService;
        this.f96312l = iPlayerSettingService;
        this.f96313m = hVar;
        this.f96314n = aVar2;
        pageBackgroundPlayRepository.f99003m = pageBackgroundPlayRepository.d();
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
    }

    public static final void a(UGCBackgroundPlayService uGCBackgroundPlayService, String str) {
        uGCBackgroundPlayService.getClass();
        HashMap map = new HashMap();
        map.put("card_entity_id", uGCBackgroundPlayService.f96314n.b());
        Object systemService = FoundationAlias.getFapp().getApplicationContext().getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService instanceof KeyguardManager ? (KeyguardManager) systemService : null;
        map.put("card_loc", (keyguardManager == null || !keyguardManager.isKeyguardLocked()) ? "0" : "1");
        map.put("track_id", uGCBackgroundPlayService.f96307f.a().f123882d);
        map.put("click_type", str);
        uGCBackgroundPlayService.f96310j.report(new NeuronsEvents.b("player.player.interact.background.player", map));
    }

    public final int b(boolean z6) {
        PageBackgroundPlayRepository pageBackgroundPlayRepository = this.f96303b;
        int size = pageBackgroundPlayRepository.f98999i.size();
        int i7 = pageBackgroundPlayRepository.f99002l;
        if (size != 0) {
            return z6 ? (i7 + 1) % size : i7 + 1;
        }
        BLog.i("UGCBackgroundPlayService-getNextIndex", "[theseus-ugc-UGCBackgroundPlayService-getNextIndex] Illegal, playlist is empty");
        return -1;
    }

    public final void c() {
        int size;
        BLog.i("UGCBackgroundPlayService-playAIPrevious", "[theseus-ugc-UGCBackgroundPlayService-playAIPrevious] playPrevious");
        boolean z6 = IPlayerSettingService.Companion.getMMainPlayerPreference().getInt(com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0) == 4;
        PageBackgroundPlayRepository pageBackgroundPlayRepository = this.f96303b;
        if (z6) {
            int i7 = pageBackgroundPlayRepository.f99002l;
            size = i7;
            if (i7 == 0) {
                size = pageBackgroundPlayRepository.f98999i.size();
            }
        } else {
            size = pageBackgroundPlayRepository.f99002l;
        }
        int i8 = size - 1;
        com.bilibili.ship.theseus.united.page.background.a aVarB = pageBackgroundPlayRepository.b(i8, false, z6);
        if (aVarB == null) {
            return;
        }
        List<e> listA = this.f96304c.a();
        Iterator<e> it = listA.iterator();
        int i9 = 0;
        while (true) {
            if (!it.hasNext()) {
                i9 = -1;
                break;
            } else if (it.next().f98180a.f591b == aVarB.f99037b) {
                break;
            } else {
                i9++;
            }
        }
        pageBackgroundPlayRepository.f99002l = i8;
        if (i9 != i8) {
            BLog.i("UGCBackgroundPlayService-playAIPrevious", "[theseus-ugc-UGCBackgroundPlayService-playAIPrevious] play previous, switch video");
            InterfaceC7008a interfaceC7008a = (InterfaceC7008a) this.f96308g.get();
            String strF = pageBackgroundPlayRepository.f();
            String str = this.f96307f.a().f123881c;
            int i10 = 0;
            if (pageBackgroundPlayRepository.d()) {
                i10 = 99;
            }
            InterfaceC7008a.e(interfaceC7008a, aVarB.f99036a, aVarB.f99037b, null, str, strF, i10, aVarB.f99038c, false, 266);
            return;
        }
        BLog.i("UGCBackgroundPlayService-playAIPrevious", "[theseus-ugc-UGCBackgroundPlayService-playAIPrevious] " + C3259x.a(i9, "play previous, switch to video item:"));
        if (listA.size() == 1) {
            BuildersKt.launch$default(this.f96302a, (CoroutineContext) null, (CoroutineStart) null, new UGCBackgroundPlayService$playAIPrevious$1(this, null), 3, (Object) null);
        } else {
            this.f96309i.d(0);
        }
    }

    public final boolean d() {
        int i7 = 0;
        boolean z6 = IPlayerSettingService.Companion.getMMainPlayerPreference().getInt(com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0) == 4;
        int iB = b(z6);
        if (iB < 0) {
            BLog.i("UGCBackgroundPlayService-playNextInternal", "[theseus-ugc-UGCBackgroundPlayService-playNextInternal] Illegal, index");
            return false;
        }
        PageBackgroundPlayRepository pageBackgroundPlayRepository = this.f96303b;
        com.bilibili.ship.theseus.united.page.background.a aVarB = pageBackgroundPlayRepository.b(iB, true, z6);
        if (aVarB == null) {
            BLog.i("UGCBackgroundPlayService-playNextInternal", "[theseus-ugc-UGCBackgroundPlayService-playNextInternal] No more data, pause");
            this.f96313m.pause();
            return false;
        }
        List<e> listA = this.f96304c.a();
        Iterator<e> it = listA.iterator();
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (it.next().f98180a.f591b == aVarB.f99037b) {
                break;
            }
            i7++;
        }
        pageBackgroundPlayRepository.f99002l = iB;
        if (i7 != iB) {
            BLog.i("UGCBackgroundPlayService-playNextInternal", "[theseus-ugc-UGCBackgroundPlayService-playNextInternal] play next, switch video");
            pageBackgroundPlayRepository.f99002l = iB;
            InterfaceC7008a.e((InterfaceC7008a) this.f96308g.get(), aVarB.f99036a, aVarB.f99037b, null, this.f96307f.a().f123880b, pageBackgroundPlayRepository.f(), 99, aVarB.f99038c, false, 266);
            return true;
        }
        BLog.i("UGCBackgroundPlayService-playNextInternal", "[theseus-ugc-UGCBackgroundPlayService-playNextInternal] " + C3259x.a(i7, "play next, switch to video item:"));
        if (listA.size() == 1) {
            BuildersKt.launch$default(this.f96302a, (CoroutineContext) null, (CoroutineStart) null, new UGCBackgroundPlayService$playNextInternal$1(this, null), 3, (Object) null);
            return true;
        }
        this.f96309i.c(99);
        return true;
    }

    public final void e() {
        this.f96310j.report(new NeuronsEvents.NormalEvent("player.player.background.autoplay.player", new String[]{"play_type", "auto", "track_id", this.f96307f.a().f123882d}));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.backgroundplay.UGCBackgroundPlayService.f(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
