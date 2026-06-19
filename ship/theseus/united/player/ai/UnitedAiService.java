package com.bilibili.ship.theseus.united.player.ai;

import F3.F;
import F3.G;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.media.resource.LanguageItem;
import com.bilibili.lib.media.resource.Languages;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.player.tangram.playercore.u;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.page.popupwindow.PopupWindowRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.player.ai.d;
import d3.C6781b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kntr.base.localization.Locale;
import kntr.base.localization.Localization;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.android.util.AppBuildConfig;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.service.setting.Scope;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/UnitedAiService.class */
@StabilityInferred(parameters = 0)
public final class UnitedAiService {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final Lazy<List<String>> f104337o = LazyKt.lazy(new G(13));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f104339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f104340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommonv2.service.ai.a f104341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f104342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IToastService f104343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f104344g;

    @Nullable
    public final f h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Flow<d.a> f104345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f104346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final PageReportService f104347k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final C7893a f104348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f104349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f104350n = LazyKt.lazy(new F(12));

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.ai.UnitedAiService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/UnitedAiService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UnitedAiService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.ai.UnitedAiService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/UnitedAiService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<LanguageItem, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UnitedAiService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UnitedAiService unitedAiService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = unitedAiService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(LanguageItem languageItem, Continuation<? super Unit> continuation) {
                return create(languageItem, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r9 = r0
                    r0 = r5
                    int r0 = r0.label
                    r7 = r0
                    r0 = r7
                    if (r0 == 0) goto L24
                    r0 = r7
                    r1 = 1
                    if (r0 != r1) goto L1a
                    r0 = r6
                    kotlin.ResultKt.throwOnFailure(r0)
                    goto L84
                L1a:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r0
                L24:
                    r0 = r6
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r5
                    java.lang.Object r0 = r0.L$0
                    com.bilibili.lib.media.resource.LanguageItem r0 = (com.bilibili.lib.media.resource.LanguageItem) r0
                    r10 = r0
                    r0 = r5
                    com.bilibili.ship.theseus.united.player.ai.UnitedAiService r0 = r0.this$0
                    com.bilibili.ship.theseus.keel.player.h r0 = r0.f104344g
                    com.bilibili.ship.theseus.keel.player.j r0 = r0.j()
                    r6 = r0
                    r0 = r6
                    boolean r0 = r0 instanceof com.bilibili.player.tangram.basic.i
                    if (r0 == 0) goto L84
                    r0 = r6
                    com.bilibili.player.tangram.basic.i r0 = (com.bilibili.player.tangram.basic.i) r0
                    r11 = r0
                    r0 = r10
                    if (r0 == 0) goto L5a
                    r0 = r10
                    java.lang.String r0 = r0.c()
                    r8 = r0
                    r0 = r8
                    r6 = r0
                    r0 = r8
                    if (r0 != 0) goto L5d
                L5a:
                    java.lang.String r0 = ""
                    r6 = r0
                L5d:
                    r0 = r10
                    if (r0 == 0) goto L6b
                    r0 = r10
                    int r0 = r0.h()
                    r7 = r0
                    goto L6d
                L6b:
                    r0 = 0
                    r7 = r0
                L6d:
                    r0 = r5
                    r1 = 1
                    r0.label = r1
                    r0 = r11
                    r1 = r6
                    r2 = r7
                    r3 = r5
                    java.lang.Object r0 = r0.A(r1, r2, r3)
                    r1 = r9
                    if (r0 != r1) goto L84
                    r0 = r9
                    return r0
                L84:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.ai.UnitedAiService.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UnitedAiService unitedAiService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = unitedAiService;
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
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    UnitedAiService unitedAiService = this.this$0;
                    unitedAiService.f104341d.i0(new AnonymousClass1(unitedAiService, null));
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.this$0.f104341d.i0(null);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.ai.UnitedAiService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/UnitedAiService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UnitedAiService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.ai.UnitedAiService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/UnitedAiService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7893a.C1318a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UnitedAiService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.ai.UnitedAiService$3$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/UnitedAiService$3$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final UnitedAiService f104351a;

                public a(UnitedAiService unitedAiService) {
                    this.f104351a = unitedAiService;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    UnitedAiService unitedAiService = this.f104351a;
                    LanguageItem languageItemN0 = unitedAiService.f104341d.n0();
                    Integer numBoxInt = null;
                    String strC = languageItemN0 != null ? languageItemN0.c() : null;
                    LanguageItem languageItemN02 = unitedAiService.f104341d.n0();
                    if (languageItemN02 != null) {
                        numBoxInt = Boxing.boxInt(languageItemN02.h());
                    }
                    BLog.i("recv startWithLanguageFlow");
                    if (strC != null && !Intrinsics.areEqual(strC, ((Locale) Localization.INSTANCE.getLocaleFlow().getValue()).getLanguage())) {
                        String strA = (numBoxInt != null && numBoxInt.intValue() == 1) ? C6781b.a(unitedAiService.f104339b.getString(2131857401), "[", strC, "]") : C6781b.a(unitedAiService.f104339b.getString(2131857400), "[", strC, "]");
                        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("text", strA));
                        unitedAiService.f104343f.showToast(new PlayerToast.Builder().level(2).location(32).toastItemType(18).setExtraString("extra_title", strA).setExtraBoolean("extra_need_close", false).setExtraString("extra_action_text", unitedAiService.f104339b.getString(2131857402)).messageClickListener(new g(unitedAiService, mapMapOf)).duration(5000L).build());
                        PageReportService.i(unitedAiService.f104347k, "player.player.toast-ai-up-dub.show.player", mapMapOf, 4);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UnitedAiService unitedAiService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = unitedAiService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C7893a.C1318a c1318a, Continuation<? super Unit> continuation) {
                return create(c1318a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (((C7893a.C1318a) this.L$0) == null) {
                        return Unit.INSTANCE;
                    }
                    Flow<Unit> flowS = this.this$0.f104341d.S();
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (flowS.collect(aVar, this) == coroutine_suspended) {
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
        public AnonymousClass3(UnitedAiService unitedAiService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = unitedAiService;
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
                UnitedAiService unitedAiService = this.this$0;
                StateFlow<C7893a.C1318a> stateFlow = unitedAiService.f104348l.f123393f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(unitedAiService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.ai.UnitedAiService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/UnitedAiService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UnitedAiService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.ai.UnitedAiService$4$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/UnitedAiService$4$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<c.a, j, Continuation<? super Pair<? extends c.a, ? extends j>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(c.a aVar, j jVar, Continuation<? super Pair<c.a, ? extends j>> continuation) {
                return AnonymousClass4.invokeSuspend$lambda$0(aVar, jVar, continuation);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.ai.UnitedAiService$4$4, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/UnitedAiService$4$4.class */
        public static final class C11604 extends SuspendLambda implements Function2<Pair<? extends c.a, ? extends j>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UnitedAiService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.ai.UnitedAiService$4$4$1, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/UnitedAiService$4$4$1.class */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<u, Continuation<? super Boolean>, Object> {
                Object L$0;
                int label;

                public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
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
                    u uVar = (u) this.L$0;
                    boolean z6 = false;
                    if (uVar != null) {
                        MediaResource mediaResource = uVar.f79460c;
                        z6 = false;
                        if (mediaResource != null) {
                            Languages language = mediaResource.getLanguage();
                            z6 = false;
                            if (language != null) {
                                List listH = language.h();
                                z6 = false;
                                if (listH != null) {
                                    List list = listH;
                                    if ((list instanceof Collection) && list.isEmpty()) {
                                        z6 = false;
                                    } else {
                                        Iterator it = list.iterator();
                                        while (true) {
                                            z6 = false;
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            if (((LanguageItem) it.next()).h() == 2) {
                                                z6 = false;
                                                if (language.n()) {
                                                    z6 = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return Boxing.boxBoolean(z6);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11604(UnitedAiService unitedAiService, Continuation<? super C11604> continuation) {
                super(2, continuation);
                this.this$0 = unitedAiService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11604 c11604 = new C11604(this.this$0, continuation);
                c11604.L$0 = obj;
                return c11604;
            }

            public final Object invoke(Pair<c.a, ? extends j> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object objFirst;
                j jVar;
                MediaResource mediaResource;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.L$0;
                    c.a aVar = (c.a) pair.component1();
                    j jVar2 = (j) pair.component2();
                    if (!aVar.f102988b && jVar2 != null) {
                        Flow<u> flowB = jVar2.b();
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                        this.L$0 = jVar2;
                        this.label = 1;
                        objFirst = FlowKt.first(flowB, anonymousClass1, this);
                        if (objFirst == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        jVar = jVar2;
                    }
                    return Unit.INSTANCE;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                jVar = (j) this.L$0;
                ResultKt.throwOnFailure(obj);
                objFirst = obj;
                if (((u) objFirst) == null) {
                    return Unit.INSTANCE;
                }
                u uVarO = jVar.o();
                String currentLanguage = (uVarO == null || (mediaResource = uVarO.f79460c) == null) ? null : mediaResource.getCurrentLanguage();
                if (currentLanguage == null || currentLanguage.length() == 0) {
                    UnitedAiService unitedAiService = this.this$0;
                    this.L$0 = null;
                    this.label = 2;
                    if (UnitedAiService.a(unitedAiService, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(UnitedAiService unitedAiService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = unitedAiService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(c.a aVar, j jVar, Continuation continuation) {
            return new Pair(aVar, jVar);
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
                this.label = 1;
                if (YieldKt.yield(this) == coroutine_suspended) {
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
            Flow flowCombine = FlowKt.combine(this.this$0.f104340c.c(), FlowKt.asStateFlow(this.this$0.f104344g.f91111e), AnonymousClass3.INSTANCE);
            C11604 c11604 = new C11604(this.this$0, null);
            this.label = 2;
            if (FlowKt.collectLatest(flowCombine, c11604, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/UnitedAiService$a.class */
    public static final class a {
    }

    @Inject
    public UnitedAiService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull com.bilibili.playerbizcommonv2.service.ai.a aVar, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull IToastService iToastService, @NotNull h hVar, @Nullable f fVar, @NotNull Flow<d.a> flow, @NotNull PopupWindowRepository popupWindowRepository, @NotNull IControlContainerService iControlContainerService, @NotNull PageReportService pageReportService, @NotNull C7893a c7893a, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar3) {
        this.f104338a = coroutineScope;
        this.f104339b = context;
        this.f104340c = cVar;
        this.f104341d = aVar;
        this.f104342e = iPlayerSettingService;
        this.f104343f = iToastService;
        this.f104344g = hVar;
        this.h = fVar;
        this.f104345i = flow;
        this.f104346j = iControlContainerService;
        this.f104347k = pageReportService;
        this.f104348l = c7893a;
        this.f104349m = aVar3;
        d dVar = new d(coroutineScope, context, flow, popupWindowRepository, cVar, iControlContainerService, hVar, aVar, iPlayerSettingService, aVar2);
        HashMap map = new HashMap();
        map.put(Scope.VideoItem, CollectionsKt.listOf("key_ai_guide_shown_this_video"));
        iPlayerSettingService.putKeysScope(map);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        if (AppBuildConfig.Companion.isHDApp()) {
            return;
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MultilangAudioBubbleGuide$startFlow$1(dVar, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.united.player.ai.UnitedAiService r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.ai.UnitedAiService.a(com.bilibili.ship.theseus.united.player.ai.UnitedAiService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
