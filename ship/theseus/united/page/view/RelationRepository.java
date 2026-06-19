package com.bilibili.ship.theseus.united.page.view;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.v1.Button;
import com.bapis.bilibili.app.viewunite.v1.OldFan;
import com.bapis.bilibili.app.viewunite.v1.ReqUser;
import com.bapis.bilibili.app.viewunite.v1.ReqUserExtra;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import com.bilibili.bus.Violet;
import com.bilibili.community.like.LikeRepository;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.google.gson.reflect.TypeToken;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/RelationRepository.class */
@StabilityInferred(parameters = 0)
public final class RelationRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f103993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f103995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C8043a f103996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BusinessType f103997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f103998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f103999g;

    @NotNull
    public final MutableStateFlow<Boolean> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f104000i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f104001j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f104002k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<StatData> f104003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final StateFlow<StatData> f104004m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f104005n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f104006o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f104007p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f104008q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<g> f104009r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final StateFlow<g> f104010s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f104011t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f104012u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f104013v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f104014w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final ReqUserExtra f104015x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public final j f104016y;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.view.RelationRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/RelationRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final RelationRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.view.RelationRepository$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/RelationRepository$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RelationRepository f104017a;

            public a(RelationRepository relationRepository) {
                this.f104017a = relationRepository;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Object value;
                StatData statData;
                long jLongValue = ((Number) obj).longValue();
                MutableStateFlow<StatData> mutableStateFlow = this.f104017a.f104003l;
                do {
                    value = mutableStateFlow.getValue();
                    statData = (StatData) value;
                } while (!mutableStateFlow.compareAndSet(value, statData != null ? StatData.a(statData, 0L, 0L, jLongValue, 0L, 0L, 247) : null));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RelationRepository relationRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = relationRepository;
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
                Flow flowTransformLatest = FlowKt.transformLatest(this.this$0.f103995c.f104038c, new RelationRepository$1$invokeSuspend$$inlined$flatMapLatest$1(null));
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowTransformLatest.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/RelationRepository$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f104018a;

        static {
            int[] iArr = new int[BusinessType.values().length];
            try {
                iArr[BusinessType.UGC.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BusinessType.OGV.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BusinessType.CHEESE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f104018a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/RelationRepository$b.class */
    public static final class b extends TypeToken<StatData> {
    }

    @Inject
    public RelationRepository(@NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull ViewReply viewReply, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull C8043a c8043a, @NotNull BusinessType businessType) {
        this.f103993a = context;
        this.f103994b = coroutineScope;
        this.f103995c = aVar;
        this.f103996d = c8043a;
        this.f103997e = businessType;
        Flow flowTransformLatest = FlowKt.transformLatest(aVar.f104038c, new RelationRepository$special$$inlined$flatMapLatest$1(null));
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharingStarted eagerly = companion.getEagerly();
        Boolean bool = Boolean.FALSE;
        this.f103998f = FlowKt.stateIn(flowTransformLatest, coroutineScope, eagerly, bool);
        this.f103999g = FlowKt.stateIn(FlowKt.transformLatest(aVar.f104038c, new RelationRepository$special$$inlined$flatMapLatest$2(null)), coroutineScope, companion.getEagerly(), bool);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.h = MutableStateFlow;
        this.f104000i = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.f104001j = MutableStateFlow2;
        this.f104002k = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<StatData> MutableStateFlow3 = StateFlowKt.MutableStateFlow((Object) null);
        this.f104003l = MutableStateFlow3;
        this.f104004m = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool);
        this.f104005n = MutableStateFlow4;
        this.f104006o = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(bool);
        this.f104007p = MutableStateFlow5;
        this.f104008q = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<g> MutableStateFlow6 = StateFlowKt.MutableStateFlow((Object) null);
        this.f104009r = MutableStateFlow6;
        this.f104010s = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<Boolean> MutableStateFlow7 = StateFlowKt.MutableStateFlow(bool);
        this.f104011t = MutableStateFlow7;
        this.f104012u = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<Boolean> MutableStateFlow8 = StateFlowKt.MutableStateFlow(bool);
        this.f104013v = MutableStateFlow8;
        this.f104014w = FlowKt.asStateFlow(MutableStateFlow8);
        if (viewReply.hasReqUser()) {
            ReqUser reqUser = viewReply.getReqUser();
            w(reqUser.getFavorite() == 1);
            y(reqUser.getLike() == 1);
            MutableStateFlow.setValue(Boolean.valueOf(reqUser.getDislike() == 1));
            MutableStateFlow2.setValue(Boolean.valueOf(reqUser.getCoin() == 1));
            MutableStateFlow5.setValue(Boolean.valueOf(reqUser.getFollow() == 1));
            if (reqUser.hasElecPlusBtn()) {
                Button elecPlusBtn = reqUser.getElecPlusBtn();
                MutableStateFlow6.setValue(new g(elecPlusBtn.getTitle(), elecPlusBtn.getUri(), elecPlusBtn.getIcon(), elecPlusBtn.getTextColor(), elecPlusBtn.getBgColor(), elecPlusBtn.getBorderColor(), elecPlusBtn.getReportMap()));
                MutableStateFlow7.setValue(Boolean.valueOf(!StringsKt.isBlank(r0)));
                MutableStateFlow8.setValue(Boolean.valueOf(!StringsKt.isBlank(r0)));
            } else {
                MutableStateFlow6.setValue((Object) null);
                MutableStateFlow7.setValue(bool);
            }
            if (reqUser.hasExtra()) {
                this.f104015x = reqUser.getExtra();
            }
            if (reqUser.hasOldFan()) {
                OldFan oldFan = reqUser.getOldFan();
                this.f104016y = new j(oldFan.getIsFollowDisplay() == 1, oldFan.getWingPic());
            }
        }
        if (viewReply.hasArc()) {
            A((StatData) JsonUtilKt.parseJson(Pj0.e.a(viewReply.getArc().getStat()), new b().getType()));
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public final void A(@Nullable StatData statData) {
        if (statData != null) {
            long jA = this.f103995c.a();
            LikeRepository.a.getClass();
            LikeRepository.e(jA, statData.f104022d);
        }
        this.f104003l.setValue(statData);
    }

    public final long a() {
        StatData statData = (StatData) this.f104003l.getValue();
        return statData != null ? statData.f104019a : 0L;
    }

    public final long b() {
        StatData statData = (StatData) this.f104003l.getValue();
        return statData != null ? statData.f104023e : 0L;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(boolean r15, kotlin.coroutines.jvm.internal.ContinuationImpl r16) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.view.RelationRepository.c(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.view.RelationRepository.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(int r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.view.RelationRepository.e(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final long f() {
        StatData statData = (StatData) this.f104003l.getValue();
        return statData != null ? statData.f104021c : 0L;
    }

    public final boolean g() {
        return ((Boolean) this.f104001j.getValue()).booleanValue();
    }

    public final boolean h() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    public final boolean i() {
        long jA = this.f103995c.a();
        com.bilibili.community.favorite.d dVar = com.bilibili.community.favorite.d.a;
        Boolean bool = (Boolean) com.bilibili.community.favorite.d.c.c(com.bilibili.community.b.a(jA));
        return bool != null ? bool.booleanValue() : false;
    }

    public final boolean j() {
        long jA = this.f103995c.a();
        LikeRepository.a.getClass();
        Boolean bool = (Boolean) LikeRepository.c.c(com.bilibili.community.b.a(jA));
        return bool != null ? bool.booleanValue() : false;
    }

    public final void k() {
        BuildersKt.launch$default(this.f103994b, (CoroutineContext) null, (CoroutineStart) null, new RelationRepository$likeVideo$1(this, null), 3, (Object) null);
    }

    public final long l() {
        long jA = this.f103995c.a();
        LikeRepository.a.getClass();
        return LikeRepository.g(jA);
    }

    public final void m(int i7) {
        long jA = a() + ((long) i7);
        this.f104001j.setValue(Boolean.TRUE);
        t(jA);
        int i8 = (int) jA;
        Violet.INSTANCE.sendMsg(new Mq0.a(i8, this.f103995c.a(), l(), true, false, j()));
    }

    public final void n(boolean z6) {
        if (i() == z6) {
            return;
        }
        if (z6) {
            x(f() + 1);
        } else {
            x(f() - 1);
        }
        w(z6);
        Violet.INSTANCE.sendMsg(new Mq0.d((String) null, this.f103995c.a(), (int) f(), i(), 24));
    }

    public final void o(boolean z6) {
        long jL;
        if (j() == z6) {
            return;
        }
        if (z6) {
            long jL2 = l() + 1;
            jL = jL2;
            if (h()) {
                v(false);
                jL = jL2;
            }
        } else {
            jL = l() - 1;
        }
        com.bilibili.ship.theseus.united.page.view.a aVar = this.f103995c;
        long jA = aVar.a();
        LikeRepository.a.getClass();
        LikeRepository.e(jA, jL);
        y(z6);
        Violet.INSTANCE.sendMsg(new Mq0.e(aVar.a(), jL, j()));
    }

    public final void p() {
        z(q() + 1);
    }

    public final long q() {
        StatData statData = (StatData) this.f104003l.getValue();
        return statData != null ? statData.f104024f : 0L;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(boolean r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws kotlin.NoWhenBranchMatchedException {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.view.RelationRepository$suspendFavorVideo$1
            if (r0 == 0) goto L2b
            r0 = r7
            com.bilibili.ship.theseus.united.page.view.RelationRepository$suspendFavorVideo$1 r0 = (com.bilibili.ship.theseus.united.page.view.RelationRepository$suspendFavorVideo$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2b
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L35
        L2b:
            com.bilibili.ship.theseus.united.page.view.RelationRepository$suspendFavorVideo$1 r0 = new com.bilibili.ship.theseus.united.page.view.RelationRepository$suspendFavorVideo$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L35:
            r0 = r7
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L6f
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L64
            r0 = r7
            boolean r0 = r0.Z$0
            r6 = r0
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r9
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.unbox-impl()
            r7 = r0
            goto L93
        L64:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6f:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            r1 = r6
            r0.Z$0 = r1
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.c(r1, r2)
            r9 = r0
            r0 = r9
            r7 = r0
            r0 = r9
            r1 = r10
            if (r0 != r1) goto L93
            r0 = r10
            return r0
        L93:
            r0 = r7
            boolean r0 = kotlin.Result.isSuccess-impl(r0)
            if (r0 == 0) goto La5
            r0 = r7
            kotlin.Unit r0 = (kotlin.Unit) r0
            r9 = r0
            r0 = r5
            r1 = r6
            r0.n(r1)
        La5:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.view.RelationRepository.r(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(boolean r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.view.RelationRepository.s(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void t(long j7) {
        MutableStateFlow<StatData> mutableStateFlow = this.f104003l;
        StatData statData = (StatData) mutableStateFlow.getValue();
        if (statData == null) {
            return;
        }
        if (j7 <= 0) {
            mutableStateFlow.setValue(StatData.a(statData, 0L, 0L, 0L, 0L, 0L, 254));
        } else {
            mutableStateFlow.setValue(StatData.a(statData, j7, 0L, 0L, 0L, 0L, 254));
        }
    }

    public final void u(long j7) {
        MutableStateFlow<StatData> mutableStateFlow = this.f104003l;
        StatData statData = (StatData) mutableStateFlow.getValue();
        if (statData == null) {
            return;
        }
        if (j7 <= 0) {
            mutableStateFlow.setValue(StatData.a(statData, 0L, 0L, 0L, 0L, 0L, 239));
        } else {
            mutableStateFlow.setValue(StatData.a(statData, 0L, 0L, 0L, j7, 0L, 239));
        }
    }

    public final void v(boolean z6) {
        this.h.setValue(Boolean.valueOf(z6));
    }

    public final void w(boolean z6) {
        long jA = this.f103995c.a();
        com.bilibili.community.favorite.d dVar = com.bilibili.community.favorite.d.a;
        com.bilibili.community.favorite.d.b(jA, z6);
    }

    public final void x(long j7) {
        MutableStateFlow<StatData> mutableStateFlow = this.f104003l;
        StatData statData = (StatData) mutableStateFlow.getValue();
        if (statData == null) {
            return;
        }
        if (j7 <= 0) {
            mutableStateFlow.setValue(StatData.a(statData, 0L, 0L, 0L, 0L, 0L, 251));
        } else {
            mutableStateFlow.setValue(StatData.a(statData, 0L, j7, 0L, 0L, 0L, 251));
        }
    }

    public final void y(boolean z6) {
        long jA = this.f103995c.a();
        LikeRepository.a.getClass();
        LikeRepository.d(jA, z6);
        if (z6) {
            v(false);
        }
    }

    public final void z(long j7) {
        MutableStateFlow<StatData> mutableStateFlow = this.f104003l;
        StatData statData = (StatData) mutableStateFlow.getValue();
        if (statData == null) {
            return;
        }
        if (j7 <= 0) {
            mutableStateFlow.setValue(StatData.a(statData, 0L, 0L, 0L, 0L, 0L, 223));
        } else {
            mutableStateFlow.setValue(StatData.a(statData, 0L, 0L, 0L, 0L, j7, 223));
        }
    }
}
