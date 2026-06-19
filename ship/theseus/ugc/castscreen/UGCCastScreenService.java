package com.bilibili.ship.theseus.ugc.castscreen;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.projection.commonburid.CastCommonParameters;
import com.bilibili.lib.projection.commonburid.CastContentType;
import com.bilibili.lib.projection.commonburid.CastEnterSource;
import com.bilibili.lib.projection.commonburid.CastEventTrackingManager;
import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription;
import com.bilibili.ship.theseus.united.page.playingarea.g;
import com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.ToolbarCastScreenRepository;
import com.bilibili.ship.theseus.united.page.toolbar.j;
import com.bilibili.ship.theseus.united.player.oldway.FullScreenThreePointEventRepository;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/castscreen/UGCCastScreenService.class */
@StabilityInferred(parameters = 0)
public final class UGCCastScreenService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h f96366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C7893a f96367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TheseusCastScreenRepository f96368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BusinessCastScreenService f96369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final g f96370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<ProjectionItemData> f96371g;

    @NotNull
    public final UGCPlaybackRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final j f96372i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ToolbarCastScreenRepository f96373j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final FullScreenThreePointEventRepository f96374k;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.castscreen.UGCCastScreenService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/castscreen/UGCCastScreenService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCCastScreenService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.castscreen.UGCCastScreenService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/castscreen/UGCCastScreenService$1$1.class */
        public static final class C08161 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final UGCCastScreenService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08161(UGCCastScreenService uGCCastScreenService, Continuation<? super C08161> continuation) {
                super(2, continuation);
                this.this$0 = uGCCastScreenService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08161(this.this$0, continuation);
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
                com.bilibili.ship.theseus.keel.player.j jVarJ = this.this$0.f96366b.j();
                this.this$0.b(jVarJ != null ? jVarJ.L() : 0L, false, true);
                CastCommonParameters castCommonParametersA = UGCCastScreenService.a(this.this$0, CastEnterSource.CastEnterSourceDetailDialogProjectionIcon);
                CastEventTrackingManager.Companion companion = CastEventTrackingManager.Companion;
                companion.instance().updateCommonParams(castCommonParametersA);
                CastEventTrackingManager.trackClick$default(companion.instance(), "main.public.screencast-entry.all.click", null, 2, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCCastScreenService uGCCastScreenService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCCastScreenService;
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
                UGCCastScreenService uGCCastScreenService = this.this$0;
                SharedFlow<Unit> sharedFlow = uGCCastScreenService.f96372i.f103408m;
                C08161 c08161 = new C08161(uGCCastScreenService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c08161, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.castscreen.UGCCastScreenService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/castscreen/UGCCastScreenService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCCastScreenService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.castscreen.UGCCastScreenService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/castscreen/UGCCastScreenService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final UGCCastScreenService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UGCCastScreenService uGCCastScreenService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = uGCCastScreenService;
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
                com.bilibili.ship.theseus.keel.player.j jVarJ = this.this$0.f96366b.j();
                this.this$0.b(jVarJ != null ? jVarJ.L() : 0L, false, true);
                CastCommonParameters castCommonParametersA = UGCCastScreenService.a(this.this$0, CastEnterSource.CastEnterSourceDetailProjectionIcon);
                CastEventTrackingManager.Companion companion = CastEventTrackingManager.Companion;
                companion.instance().updateCommonParams(castCommonParametersA);
                CastEventTrackingManager.trackClick$default(companion.instance(), "main.public.screencast-entry.all.click", null, 2, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UGCCastScreenService uGCCastScreenService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = uGCCastScreenService;
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
                UGCCastScreenService uGCCastScreenService = this.this$0;
                SharedFlow<Unit> sharedFlow = uGCCastScreenService.f96373j.f103360u;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(uGCCastScreenService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.castscreen.UGCCastScreenService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/castscreen/UGCCastScreenService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCCastScreenService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.castscreen.UGCCastScreenService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/castscreen/UGCCastScreenService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final UGCCastScreenService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UGCCastScreenService uGCCastScreenService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = uGCCastScreenService;
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
                com.bilibili.ship.theseus.keel.player.j jVarJ = this.this$0.f96366b.j();
                this.this$0.b(jVarJ != null ? jVarJ.L() : 0L, false, false);
                CastCommonParameters castCommonParametersA = UGCCastScreenService.a(this.this$0, CastEnterSource.CastEnterSourceHorizontalPlayerProjectionIcon);
                CastEventTrackingManager.Companion companion = CastEventTrackingManager.Companion;
                companion.instance().updateCommonParams(castCommonParametersA);
                CastEventTrackingManager.trackClick$default(companion.instance(), "main.public.screencast-entry.all.click", null, 2, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(UGCCastScreenService uGCCastScreenService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = uGCCastScreenService;
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
                UGCCastScreenService uGCCastScreenService = this.this$0;
                SharedFlow<Unit> sharedFlow = uGCCastScreenService.f96374k.h;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(uGCCastScreenService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.castscreen.UGCCastScreenService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/castscreen/UGCCastScreenService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCCastScreenService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.castscreen.UGCCastScreenService$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/castscreen/UGCCastScreenService$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Av0.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UGCCastScreenService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UGCCastScreenService uGCCastScreenService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = uGCCastScreenService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(Av0.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    Method dump skipped, instruction units count: 249
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.castscreen.UGCCastScreenService.AnonymousClass4.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(UGCCastScreenService uGCCastScreenService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = uGCCastScreenService;
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
                UGCCastScreenService uGCCastScreenService = this.this$0;
                UGCPlaybackRepository$special$$inlined$map$1 uGCPlaybackRepository$special$$inlined$map$1 = uGCCastScreenService.h.f98076u;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(uGCCastScreenService, null);
                this.label = 1;
                if (FlowKt.collectLatest(uGCPlaybackRepository$special$$inlined$map$1, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/castscreen/UGCCastScreenService$a.class */
    public static final class a implements BusinessCastScreenService.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f96375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<ProjectionItemData> f96376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f96377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f96378d;

        public a(int i7, List<ProjectionItemData> list, boolean z6, boolean z7) {
            this.f96375a = i7;
            this.f96376b = list;
            this.f96377c = z6;
            this.f96378d = z7;
        }

        @Override // com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService.b
        public final boolean a() {
            return this.f96378d;
        }

        @Override // com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService.b
        public final boolean b(int i7) {
            return i7 < this.f96376b.size();
        }

        @Override // com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService.b
        public final boolean c() {
            return this.f96377c;
        }

        @Override // com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService.b
        public final ProjectionItemData getItem(int i7) {
            return this.f96376b.get(i7);
        }

        @Override // com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService.b
        public final int getItemCount() {
            return this.f96376b.size();
        }

        @Override // com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService.b
        public final int getStartIndex() {
            int i7 = this.f96375a;
            if (i7 <= -1) {
                i7 = 0;
            }
            return i7;
        }
    }

    @Inject
    public UGCCastScreenService(@NotNull CoroutineScope coroutineScope, @NotNull h hVar, @NotNull C7893a c7893a, @NotNull TheseusCastScreenRepository theseusCastScreenRepository, @NotNull BusinessCastScreenService businessCastScreenService, @NotNull g gVar, @NotNull List<ProjectionItemData> list, @NotNull UGCPlaybackRepository uGCPlaybackRepository, @NotNull j jVar, @NotNull ToolbarCastScreenRepository toolbarCastScreenRepository, @NotNull FullScreenThreePointEventRepository fullScreenThreePointEventRepository) {
        this.f96365a = coroutineScope;
        this.f96366b = hVar;
        this.f96367c = c7893a;
        this.f96368d = theseusCastScreenRepository;
        this.f96369e = businessCastScreenService;
        this.f96370f = gVar;
        this.f96371g = list;
        this.h = uGCPlaybackRepository;
        this.f96372i = jVar;
        this.f96373j = toolbarCastScreenRepository;
        this.f96374k = fullScreenThreePointEventRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
    }

    public static final CastCommonParameters a(UGCCastScreenService uGCCastScreenService, CastEnterSource castEnterSource) {
        Av0.a aVarC = uGCCastScreenService.h.c();
        return aVarC == null ? new CastCommonParameters("", castEnterSource, CastContentType.CastContentTypeUnknown) : new CastCommonParameters(JsonUtilKt.toJson(MapsKt.mapOf(new Pair[]{TuplesKt.to(GameCardButton.extraAvid, String.valueOf(aVarC.f590a)), TuplesKt.to("cid", String.valueOf(aVarC.f591b))})), castEnterSource, CastContentType.CastContentTypeUGC);
    }

    public final void b(long j7, boolean z6, boolean z7) {
        if (this.f96371g.isEmpty()) {
            BLog.e("UGCCastScreenService-tryEnterCastScreen", "[theseus-ugc-UGCCastScreenService-tryEnterCastScreen] Failed to enter cast screen: item list is empty.", (Throwable) null);
            return;
        }
        PlayingAreaDescription playingAreaDescriptionA = this.f96367c.a();
        if (playingAreaDescriptionA != null && playingAreaDescriptionA.a()) {
            this.f96370f.d();
        }
        Iterator<ProjectionItemData> it = this.f96371g.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            ProjectionItemData next = it.next();
            Av0.a aVarC = this.h.c();
            if (aVarC != null && next.f63477d == aVarC.f591b) {
                break;
            } else {
                i7++;
            }
        }
        a aVar = new a(i7, CollectionsKt.toList(this.f96371g), z6, z7);
        BusinessCastScreenService.d dVar = new BusinessCastScreenService.d(j7);
        BusinessCastScreenService businessCastScreenService = this.f96369e;
        businessCastScreenService.getClass();
        businessCastScreenService.f99099p.setValue(new BusinessCastScreenService.c(aVar, dVar));
    }
}
