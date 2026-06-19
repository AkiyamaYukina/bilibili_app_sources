package com.bilibili.ship.theseus.united.page.background;

import M3.V;
import Vn.A;
import androidx.appcompat.widget.C3259x;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.playerbizcommon.features.background.BackgroundPlayService;
import com.bilibili.playerbizcommon.features.background.g;
import com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.keel.player.j;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.k;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPlayRepository.class */
@StabilityInferred(parameters = 0)
public final class PageBackgroundPlayRepository {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final Lazy<Boolean> f98991v = LazyKt.lazy(new As0.b(7));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BackgroundPlayService f98993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final h f98994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final k f98995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f98996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f98997f;

    @Nullable
    public String h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public GeminiCommonPlayableParams f99000j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f99002l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f99003m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f99004n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f99005o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f99006p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f99007q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f99008r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f99009s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final a f99010t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Lazy f99011u;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f98998g = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ArrayList<com.bilibili.ship.theseus.united.page.background.a> f98999i = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final tv.danmaku.bili.widget.preference.a f99001k = new tv.danmaku.bili.widget.preference.a(0);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPlayRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PageBackgroundPlayRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPlayRepository$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PageBackgroundPlayRepository f99012a;

            public a(PageBackgroundPlayRepository pageBackgroundPlayRepository) {
                this.f99012a = pageBackgroundPlayRepository;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Unit unit;
                j jVar = (j) obj;
                if (jVar == null) {
                    unit = Unit.INSTANCE;
                } else {
                    PageBackgroundPlayRepository pageBackgroundPlayRepository = this.f99012a;
                    if (pageBackgroundPlayRepository.d() && pageBackgroundPlayRepository.a()) {
                        pageBackgroundPlayRepository.f99002l = pageBackgroundPlayRepository.c(jVar.f().getCid());
                        pageBackgroundPlayRepository.e();
                    }
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PageBackgroundPlayRepository pageBackgroundPlayRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = pageBackgroundPlayRepository;
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
                StateFlow stateFlowAsStateFlow = FlowKt.asStateFlow(this.this$0.f98994c.f91111e);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (stateFlowAsStateFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPlayRepository$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PageBackgroundPlayRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PageBackgroundPlayRepository pageBackgroundPlayRepository, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = pageBackgroundPlayRepository;
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
                    PageBackgroundPlayRepository pageBackgroundPlayRepository = this.this$0;
                    pageBackgroundPlayRepository.f98993b.addBackgroundPlayEventObserver(pageBackgroundPlayRepository.f99010t);
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
                PageBackgroundPlayRepository pageBackgroundPlayRepository2 = this.this$0;
                pageBackgroundPlayRepository2.f98993b.removeBackgroundPlayEventObserver(pageBackgroundPlayRepository2.f99010t);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPlayRepository$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PageBackgroundPlayRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPlayRepository$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PageBackgroundPlayRepository f99013a;

            public a(PageBackgroundPlayRepository pageBackgroundPlayRepository) {
                this.f99013a = pageBackgroundPlayRepository;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
                /*
                    Method dump skipped, instruction units count: 237
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository.AnonymousClass3.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PageBackgroundPlayRepository pageBackgroundPlayRepository, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = pageBackgroundPlayRepository;
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
                PageBackgroundPlayRepository pageBackgroundPlayRepository = this.this$0;
                MutableStateFlow<PlayerAvailability> mutableStateFlow = pageBackgroundPlayRepository.f98994c.f91107a.f79286c;
                a aVar = new a(pageBackgroundPlayRepository);
                this.label = 1;
                if (mutableStateFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPlayRepository$a.class */
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PageBackgroundPlayRepository f99014a;

        public a(PageBackgroundPlayRepository pageBackgroundPlayRepository) {
            this.f99014a = pageBackgroundPlayRepository;
        }

        @Override // com.bilibili.playerbizcommon.features.background.g
        public final void a() {
            BLog.i("PageBackgroundPlayRepository$backgroundPlayEventObserver$1-onBackPlayStart", "[theseus-united-PageBackgroundPlayRepository$backgroundPlayEventObserver$1-onBackPlayStart] onBackPlayStart");
            this.f99014a.f99006p.setValue(Boolean.TRUE);
        }

        @Override // com.bilibili.playerbizcommon.features.background.g
        public final void b() {
            BLog.i("PageBackgroundPlayRepository$backgroundPlayEventObserver$1-onBackPlayStop", "[theseus-united-PageBackgroundPlayRepository$backgroundPlayEventObserver$1-onBackPlayStop] onBackPlayStop");
            this.f99014a.f99006p.setValue(Boolean.FALSE);
        }
    }

    @Inject
    public PageBackgroundPlayRepository(@NotNull CoroutineScope coroutineScope, @NotNull BackgroundPlayService backgroundPlayService, @NotNull h hVar, @NotNull k kVar) {
        this.f98992a = coroutineScope;
        this.f98993b = backgroundPlayService;
        this.f98994c = hVar;
        this.f98995d = kVar;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f99006p = MutableStateFlow;
        this.f99007q = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_LATEST, 1, (Object) null);
        this.f99008r = mutableSharedFlowMutableSharedFlow$default;
        this.f99009s = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.f99010t = new a(this);
        this.f99011u = LazyKt.lazy(new V(6));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        if (((Boolean) f98991v.getValue()).booleanValue()) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r4 = this;
            r0 = r4
            boolean r0 = r0.f98997f
            if (r0 == 0) goto L20
            r0 = r4
            tv.danmaku.bili.widget.preference.a r0 = r0.f99001k
            android.content.SharedPreferences r0 = r0.a
            r6 = r0
            r0 = 1
            r5 = r0
            r0 = r6
            java.lang.String r1 = "pref_player_background_auto_play_ai"
            r2 = 1
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L20
            goto L22
        L20:
            r0 = 0
            r5 = r0
        L22:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository.a():boolean");
    }

    @Nullable
    public final com.bilibili.ship.theseus.united.page.background.a b(int i7, boolean z6, boolean z7) {
        if (!((Boolean) this.f99011u.getValue()).booleanValue() || !d()) {
            return (com.bilibili.ship.theseus.united.page.background.a) CollectionsKt.getOrNull(this.f98999i, i7);
        }
        if (this.f98999i.isEmpty()) {
            return null;
        }
        if (i7 < 0 && !z7 && !z6) {
            return null;
        }
        if (i7 >= this.f98999i.size() && !z7 && z6) {
            return null;
        }
        int i8 = z6 ? 1 : -1;
        if (i7 < 0) {
            i7 = z6 ? 0 : this.f98999i.size() - 1;
        } else if (i7 < 0 || i7 >= this.f98999i.size()) {
            i7 %= this.f98999i.size();
        }
        int size = this.f98999i.size();
        int i9 = 0;
        while (i9 < size) {
            com.bilibili.ship.theseus.united.page.background.a aVar = (com.bilibili.ship.theseus.united.page.background.a) CollectionsKt.getOrNull(this.f98999i, i7);
            if (aVar != null && aVar.f99039d) {
                return (com.bilibili.ship.theseus.united.page.background.a) CollectionsKt.getOrNull(this.f98999i, i7);
            }
            int i10 = i7 + i8;
            int i11 = i9 + 1;
            if (z7) {
                if (i10 >= size) {
                    i7 = 0;
                    i9 = i11;
                } else {
                    i9 = i11;
                    i7 = i10;
                    if (i10 < 0) {
                        i7 = size - 1;
                        i9 = i11;
                    }
                }
            } else {
                if (i10 < 0 || i10 >= this.f98999i.size()) {
                    return null;
                }
                i9 = i11;
                i7 = i10;
            }
        }
        return null;
    }

    public final int c(long j7) {
        Iterator<com.bilibili.ship.theseus.united.page.background.a> it = this.f98999i.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (it.next().f99037b == j7) {
                break;
            }
            i7++;
        }
        return i7;
    }

    public final boolean d() {
        return ((Boolean) this.f99007q.getValue()).booleanValue();
    }

    public final boolean e() {
        if (this.f98996e) {
            BLog.i("PageBackgroundPlayRepository-loadAIRelatesIfNeeded", "[theseus-united-PageBackgroundPlayRepository-loadAIRelatesIfNeeded] background ai is loading");
            return false;
        }
        if (!a()) {
            BLog.i("PageBackgroundPlayRepository-loadAIRelatesIfNeeded", "[theseus-united-PageBackgroundPlayRepository-loadAIRelatesIfNeeded] background ai disable");
            return false;
        }
        int i7 = IPlayerSettingService.Companion.getMMainPlayerPreference().getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
        if (i7 == 4) {
            defpackage.a.b("[theseus-united-PageBackgroundPlayRepository-loadAIRelatesIfNeeded] ", C3259x.a(i7, "No need load ai, complete action:"), "PageBackgroundPlayRepository-loadAIRelatesIfNeeded");
            return false;
        }
        if (this.f99002l < this.f98999i.size() - 2) {
            int i8 = this.f99002l;
            int i9 = this.f99005o;
            int size = this.f98999i.size();
            StringBuilder sbB = A.b(i8, i9, "No need load ai, current:", ", locat:", " total:");
            sbB.append(size);
            defpackage.a.b("[theseus-united-PageBackgroundPlayRepository-loadAIRelatesIfNeeded] ", sbB.toString(), "PageBackgroundPlayRepository-loadAIRelatesIfNeeded");
            return false;
        }
        GeminiCommonPlayableParams geminiCommonPlayableParams = this.f99000j;
        if (geminiCommonPlayableParams == null) {
            return false;
        }
        this.f98996e = true;
        BuildersKt.launch$default(this.f98992a, (CoroutineContext) null, (CoroutineStart) null, new PageBackgroundPlayRepository$loadAIRelatesIfNeeded$1(geminiCommonPlayableParams, this, null), 3, (Object) null);
        return true;
    }

    @NotNull
    public final String f() {
        return d() ? "background" : "";
    }

    @NotNull
    public final String g() {
        return d() ? "8" : "1";
    }
}
