package com.bilibili.ship.theseus.united.page.ad;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.bilibili.adcommon.utils.d;
import javax.inject.Inject;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/PageAdRepository.class */
@StabilityInferred(parameters = 0)
public final class PageAdRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f98939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C7893a f98940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C8043a f98941d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public String f98946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f98947k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<i> f98949m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final StateFlow<i> f98950n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f98942e = new a(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f98943f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f98944g = "";

    @NotNull
    public String h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public String f98945i = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public Bundle f98948l = new Bundle();

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.PageAdRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/PageAdRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PageAdRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PageAdRepository pageAdRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = pageAdRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            FragmentActivity fragmentActivityRequireFragmentActivity;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                new ViewModelProvider(this.this$0.f98939b).get(com.bilibili.adcommon.utils.d.class);
                FragmentActivity fragmentActivity = this.this$0.f98939b;
                com.bilibili.adcommon.utils.d dVar = (fragmentActivity == null || (fragmentActivityRequireFragmentActivity = ContextUtilKt.requireFragmentActivity(fragmentActivity)) == null) ? null : (com.bilibili.adcommon.utils.d) new ViewModelProvider(fragmentActivityRequireFragmentActivity).get(com.bilibili.adcommon.utils.d.class);
                if (dVar != null) {
                    dVar.a = this.this$0.f98942e;
                }
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
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/PageAdRepository$a.class */
    public static final class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PageAdRepository f98951a;

        public a(PageAdRepository pageAdRepository) {
            this.f98951a = pageAdRepository;
        }

        public final Bundle a() {
            return this.f98951a.f98948l;
        }

        public final String getAvatar() {
            return this.f98951a.h;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String getAvid() {
            /*
                r3 = this;
                r0 = r3
                com.bilibili.ship.theseus.united.page.ad.PageAdRepository r0 = r0.f98951a
                lv0.a r0 = r0.f98940c
                lv0.a$a r0 = r0.c()
                r4 = r0
                r0 = r4
                if (r0 == 0) goto L20
                r0 = r4
                lv0.a$a$a r0 = r0.f123395a
                long r0 = r0.f123397a
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r5 = r0
                r0 = r5
                r4 = r0
                r0 = r5
                if (r0 != 0) goto L23
            L20:
                java.lang.String r0 = ""
                r4 = r0
            L23:
                r0 = r4
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.ad.PageAdRepository.a.getAvid():java.lang.String");
        }

        public final String getCid() {
            C7893a.C1318a c1318aC = this.f98951a.f98940c.c();
            return c1318aC != null ? String.valueOf(c1318aC.f123395a.f123398b) : null;
        }

        public final String getFromSpmid() {
            return this.f98951a.f98941d.a().f123881c;
        }

        public final String getSpmid() {
            return this.f98951a.f98941d.a().f123880b;
        }

        public final String getTrackId() {
            return this.f98951a.f98941d.a().f123882d;
        }

        public final Long getUpMid() {
            PageAdRepository pageAdRepository = this.f98951a;
            C7893a.C1318a c1318aC = pageAdRepository.f98940c.c();
            Long lValueOf = c1318aC != null ? Long.valueOf(c1318aC.f123395a.f123397a) : null;
            i iVar = (i) pageAdRepository.f98950n.getValue();
            long j7 = (lValueOf == null || lValueOf.longValue() <= 0 || iVar.f98966b != lValueOf.longValue()) ? 0L : iVar.f98965a;
            Long lValueOf2 = null;
            if (j7 > 0) {
                lValueOf2 = Long.valueOf(j7);
            }
            return lValueOf2;
        }
    }

    @Inject
    public PageAdRepository(@NotNull CoroutineScope coroutineScope, @NotNull FragmentActivity fragmentActivity, @NotNull C7893a c7893a, @NotNull C8043a c8043a) {
        this.f98938a = coroutineScope;
        this.f98939b = fragmentActivity;
        this.f98940c = c7893a;
        this.f98941d = c8043a;
        MutableStateFlow<i> MutableStateFlow = StateFlowKt.MutableStateFlow(new i(0));
        this.f98949m = MutableStateFlow;
        this.f98950n = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
