package com.bilibili.ship.theseus.cheese.player.castscreen;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.projection.commonburid.CastCommonParameters;
import com.bilibili.lib.projection.commonburid.CastContentType;
import com.bilibili.lib.projection.commonburid.CastEnterSource;
import com.bilibili.lib.projection.commonburid.CastEventTrackingManager;
import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription;
import com.bilibili.ship.theseus.united.page.playingarea.g;
import com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.ToolbarCastScreenRepository;
import com.bilibili.ship.theseus.united.page.toolbar.j;
import com.bilibili.ship.theseus.united.player.oldway.FullScreenThreePointEventRepository;
import eu0.C6985d;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/castscreen/CheeseCastScreenService.class */
@StabilityInferred(parameters = 0)
public final class CheeseCastScreenService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h f90556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C7893a f90557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TheseusCastScreenRepository f90558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BusinessCastScreenService f90559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final g f90560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f90561g;

    @NotNull
    public final j h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ToolbarCastScreenRepository f90562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final FullScreenThreePointEventRepository f90563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final List<ProjectionItemData> f90564k;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.castscreen.CheeseCastScreenService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/castscreen/CheeseCastScreenService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseCastScreenService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.castscreen.CheeseCastScreenService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/castscreen/CheeseCastScreenService$1$1.class */
        public static final class C06591 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final CheeseCastScreenService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06591(CheeseCastScreenService cheeseCastScreenService, Continuation<? super C06591> continuation) {
                super(2, continuation);
                this.this$0 = cheeseCastScreenService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06591(this.this$0, continuation);
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
                com.bilibili.ship.theseus.keel.player.j jVarJ = this.this$0.f90556b.j();
                this.this$0.b(jVarJ != null ? jVarJ.L() : 0L, false, true);
                CastCommonParameters castCommonParametersA = CheeseCastScreenService.a(this.this$0, CastEnterSource.CastEnterSourceDetailDialogProjectionIcon);
                CastEventTrackingManager.Companion companion = CastEventTrackingManager.Companion;
                companion.instance().updateCommonParams(castCommonParametersA);
                CastEventTrackingManager.trackClick$default(companion.instance(), "main.public.screencast-entry.all.click", null, 2, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseCastScreenService cheeseCastScreenService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseCastScreenService;
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
                CheeseCastScreenService cheeseCastScreenService = this.this$0;
                SharedFlow<Unit> sharedFlow = cheeseCastScreenService.h.f103408m;
                C06591 c06591 = new C06591(cheeseCastScreenService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c06591, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.castscreen.CheeseCastScreenService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/castscreen/CheeseCastScreenService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseCastScreenService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.castscreen.CheeseCastScreenService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/castscreen/CheeseCastScreenService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final CheeseCastScreenService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CheeseCastScreenService cheeseCastScreenService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cheeseCastScreenService;
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
                com.bilibili.ship.theseus.keel.player.j jVarJ = this.this$0.f90556b.j();
                this.this$0.b(jVarJ != null ? jVarJ.L() : 0L, false, true);
                CastCommonParameters castCommonParametersA = CheeseCastScreenService.a(this.this$0, CastEnterSource.CastEnterSourceDetailProjectionIcon);
                CastEventTrackingManager.Companion companion = CastEventTrackingManager.Companion;
                companion.instance().updateCommonParams(castCommonParametersA);
                CastEventTrackingManager.trackClick$default(companion.instance(), "main.public.screencast-entry.all.click", null, 2, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CheeseCastScreenService cheeseCastScreenService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cheeseCastScreenService;
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
                CheeseCastScreenService cheeseCastScreenService = this.this$0;
                SharedFlow<Unit> sharedFlow = cheeseCastScreenService.f90562i.f103360u;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheeseCastScreenService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.castscreen.CheeseCastScreenService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/castscreen/CheeseCastScreenService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseCastScreenService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.castscreen.CheeseCastScreenService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/castscreen/CheeseCastScreenService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final CheeseCastScreenService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CheeseCastScreenService cheeseCastScreenService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cheeseCastScreenService;
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
                com.bilibili.ship.theseus.keel.player.j jVarJ = this.this$0.f90556b.j();
                this.this$0.b(jVarJ != null ? jVarJ.L() : 0L, false, false);
                CastCommonParameters castCommonParametersA = CheeseCastScreenService.a(this.this$0, CastEnterSource.CastEnterSourceHorizontalPlayerProjectionIcon);
                CastEventTrackingManager.Companion companion = CastEventTrackingManager.Companion;
                companion.instance().updateCommonParams(castCommonParametersA);
                CastEventTrackingManager.trackClick$default(companion.instance(), "main.public.screencast-entry.all.click", null, 2, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CheeseCastScreenService cheeseCastScreenService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = cheeseCastScreenService;
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
                CheeseCastScreenService cheeseCastScreenService = this.this$0;
                SharedFlow<Unit> sharedFlow = cheeseCastScreenService.f90563j.h;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheeseCastScreenService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.castscreen.CheeseCastScreenService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/castscreen/CheeseCastScreenService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseCastScreenService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.castscreen.CheeseCastScreenService$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/castscreen/CheeseCastScreenService$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C6985d, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheeseCastScreenService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CheeseCastScreenService cheeseCastScreenService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cheeseCastScreenService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C6985d c6985d, Continuation<? super Unit> continuation) {
                return create(c6985d, continuation).invokeSuspend(Unit.INSTANCE);
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.player.castscreen.CheeseCastScreenService.AnonymousClass4.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(CheeseCastScreenService cheeseCastScreenService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = cheeseCastScreenService;
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
                CheeseCastScreenService cheeseCastScreenService = this.this$0;
                CheesePlayRepository$special$$inlined$map$1 cheesePlayRepository$special$$inlined$map$1 = cheeseCastScreenService.f90561g.f90695y;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheeseCastScreenService, null);
                this.label = 1;
                if (FlowKt.collectLatest(cheesePlayRepository$special$$inlined$map$1, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/castscreen/CheeseCastScreenService$a.class */
    public static final class a implements BusinessCastScreenService.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f90565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<ProjectionItemData> f90566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f90567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f90568d;

        public a(int i7, List<ProjectionItemData> list, boolean z6, boolean z7) {
            this.f90565a = i7;
            this.f90566b = list;
            this.f90567c = z6;
            this.f90568d = z7;
        }

        @Override // com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService.b
        public final boolean a() {
            return this.f90568d;
        }

        @Override // com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService.b
        public final boolean b(int i7) {
            return i7 < this.f90566b.size();
        }

        @Override // com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService.b
        public final boolean c() {
            return this.f90567c;
        }

        @Override // com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService.b
        public final ProjectionItemData getItem(int i7) {
            return this.f90566b.get(i7);
        }

        @Override // com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService.b
        public final int getItemCount() {
            return this.f90566b.size();
        }

        @Override // com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService.b
        public final int getStartIndex() {
            int i7 = this.f90565a;
            if (i7 <= -1) {
                i7 = 0;
            }
            return i7;
        }
    }

    @Inject
    public CheeseCastScreenService(@NotNull CoroutineScope coroutineScope, @NotNull h hVar, @NotNull C7893a c7893a, @NotNull TheseusCastScreenRepository theseusCastScreenRepository, @NotNull BusinessCastScreenService businessCastScreenService, @NotNull g gVar, @NotNull CheesePlayRepository cheesePlayRepository, @NotNull j jVar, @NotNull ToolbarCastScreenRepository toolbarCastScreenRepository, @NotNull FullScreenThreePointEventRepository fullScreenThreePointEventRepository, @NotNull List<ProjectionItemData> list) {
        this.f90555a = coroutineScope;
        this.f90556b = hVar;
        this.f90557c = c7893a;
        this.f90558d = theseusCastScreenRepository;
        this.f90559e = businessCastScreenService;
        this.f90560f = gVar;
        this.f90561g = cheesePlayRepository;
        this.h = jVar;
        this.f90562i = toolbarCastScreenRepository;
        this.f90563j = fullScreenThreePointEventRepository;
        this.f90564k = list;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
    }

    public static final CastCommonParameters a(CheeseCastScreenService cheeseCastScreenService, CastEnterSource castEnterSource) {
        C6985d c6985dA = cheeseCastScreenService.f90561g.a();
        return c6985dA == null ? new CastCommonParameters("", castEnterSource, CastContentType.CastContentTypeUnknown) : new CastCommonParameters(JsonUtilKt.toJson(MapsKt.mapOf(new Pair[]{TuplesKt.to(GameCardButton.extraAvid, String.valueOf(c6985dA.f117510e)), TuplesKt.to("cid", String.valueOf(c6985dA.f117511f))})), castEnterSource, CastContentType.CastContentTypeEDU);
    }

    public final void b(long j7, boolean z6, boolean z7) {
        if (this.f90564k.isEmpty()) {
            BLog.e("CheeseCastScreenService-tryEnterCastScreen", "[theseus-cheese-CheeseCastScreenService-tryEnterCastScreen] Failed to enter cast screen: item list is empty.", (Throwable) null);
            return;
        }
        PlayingAreaDescription playingAreaDescriptionA = this.f90557c.a();
        if (playingAreaDescriptionA != null && playingAreaDescriptionA.a()) {
            this.f90560f.d();
        }
        Iterator<ProjectionItemData> it = this.f90564k.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            ProjectionItemData next = it.next();
            C6985d c6985dA = this.f90561g.a();
            if (c6985dA != null && next.f63477d == c6985dA.f117511f) {
                break;
            } else {
                i7++;
            }
        }
        a aVar = new a(i7, CollectionsKt.toList(this.f90564k), z6, z7);
        BusinessCastScreenService.d dVar = new BusinessCastScreenService.d(j7);
        BusinessCastScreenService businessCastScreenService = this.f90559e;
        businessCastScreenService.getClass();
        businessCastScreenService.f99099p.setValue(new BusinessCastScreenService.c(aVar, dVar));
    }
}
