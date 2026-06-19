package com.bilibili.ogv.misc.timeline;

import H60.I;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.accounts.BiliAccountsKt;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.ogv.misc.timeline.s;
import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimelineDay;
import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimelineEntity;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.xpref.Xpref;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yk0.C9061a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/OgvTimelineFragment.class */
@StabilityInferred(parameters = 0)
public final class OgvTimelineFragment extends BaseFragment implements IPvTracker {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f69436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f69437f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f69433b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f69434c = "pgc.bangumi-timeline";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f69435d = "pgc.bangumi-timeline.0.0";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C9061a f69438g = new C9061a(new OgvTimelineFragment$pageViewModel$1(this), new OgvTimelineFragment$pageViewModel$2(this), new OgvTimelineFragment$pageViewModel$3(this), new OgvTimelineFragment$pageViewModel$4(this), new OgvTimelineFragment$pageViewModel$5(this), new OgvTimelineFragment$pageViewModel$6(this), new OgvTimelineFragment$pageViewModel$7(this), new OgvTimelineFragment$pageViewModel$8(this));

    /* JADX INFO: renamed from: com.bilibili.ogv.misc.timeline.OgvTimelineFragment$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/OgvTimelineFragment$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvTimelineFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.ogv.misc.timeline.OgvTimelineFragment$onViewCreated$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/OgvTimelineFragment$onViewCreated$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvTimelineFragment f69439a;

            public a(OgvTimelineFragment ogvTimelineFragment) {
                this.f69439a = ogvTimelineFragment;
            }

            public final Object emit(Object obj, Continuation continuation) {
                if (((Boolean) obj).booleanValue()) {
                    this.f69439a.kf();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OgvTimelineFragment ogvTimelineFragment, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ogvTimelineFragment;
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
                Flow flowDrop = FlowKt.drop(FlowKt.distinctUntilChanged(FlowExtKt.flowWithLifecycle(BiliAccountsKt.a(com.bilibili.ogv.infra.account.a.f67852b), this.this$0.getLifecycle(), Lifecycle.State.RESUMED)), 1);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowDrop.collect(aVar, this) == coroutine_suspended) {
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

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return G.p.a(this.f69435d, ".pv");
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        bundle.putString("from_out_spmid", this.f69433b);
        return bundle;
    }

    public final void jf(String str) {
        Qj0.g.c(requireContext(), new RouteRequest.Builder(Uri.parse(str)).build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void kf() {
        this.f69438g.f(new BangumiTimelineEntity(), 103);
        s.f69481a.getClass();
        s sVar = s.a.f69483b;
        boolean z6 = this.f69437f;
        Single<BangumiTimelineEntity> timeline = sVar.getTimeline("0", z6 ? 1 : 0, ((Number) this.f69438g.f129727o.getValue()).intValue(), 1);
        Functions.v vVar = Functions.a;
        com.bilibili.okretro.call.rxjava.c.a(timeline.subscribe(new Consumer(this) { // from class: com.bilibili.ogv.misc.timeline.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvTimelineFragment f69472a;

            {
                this.f69472a = this;
            }

            public final void accept(Object obj) {
                BangumiTimelineEntity bangumiTimelineEntity = (BangumiTimelineEntity) obj;
                List<BangumiTimelineDay> listB = bangumiTimelineEntity.b();
                OgvTimelineFragment ogvTimelineFragment = this.f69472a;
                if (listB == null || listB.isEmpty()) {
                    ogvTimelineFragment.f69438g.f(bangumiTimelineEntity, 100);
                    return;
                }
                if (bangumiTimelineEntity.e()) {
                    BiliGlobalPreferenceHelper biliGlobalPreferenceHelper = BiliGlobalPreferenceHelper.getInstance(ogvTimelineFragment.requireContext());
                    if (!ogvTimelineFragment.f69437f) {
                        Calendar calendar = Calendar.getInstance(Locale.CHINA);
                        calendar.setTimeZone(DesugarTimeZone.getTimeZone("GMT+8"));
                        if (calendar.get(11) < 6) {
                            if (biliGlobalPreferenceHelper.optBoolean("sp_first_time_night", true)) {
                                biliGlobalPreferenceHelper.setBoolean("sp_first_time_night", false);
                                final c cVar = new c(ogvTimelineFragment.getContext());
                                cVar.f69442f = new View.OnClickListener(cVar) { // from class: com.bilibili.ogv.misc.timeline.q

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final c f69475a;

                                    {
                                        this.f69475a = cVar;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        c cVar2 = this.f69475a;
                                        a.a(view.getContext());
                                        cVar2.dismiss();
                                    }
                                };
                                cVar.f69443g = new bp.d(cVar);
                                cVar.f69441e = ogvTimelineFragment.getString(2131822166);
                                cVar.show();
                            }
                        } else if (biliGlobalPreferenceHelper.optBoolean("sp_first_time_night", true) && biliGlobalPreferenceHelper.optBoolean("sp_first_time_day", true)) {
                            biliGlobalPreferenceHelper.setBoolean("sp_first_time_day", false);
                            c cVar2 = new c(ogvTimelineFragment.getContext());
                            cVar2.f69442f = new I(cVar2, 1);
                            cVar2.f69443g = new AK.g(cVar2, 3);
                            cVar2.f69441e = ogvTimelineFragment.getString(2131822165);
                            cVar2.show();
                        }
                    }
                } else {
                    ogvTimelineFragment.getClass();
                }
                ogvTimelineFragment.f69438g.f(bangumiTimelineEntity, 102);
            }
        }, new Consumer(this) { // from class: com.bilibili.ogv.misc.timeline.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvTimelineFragment f69473a;

            {
                this.f69473a = this;
            }

            public final void accept(Object obj) {
                this.f69473a.f69438g.f(new BangumiTimelineEntity(), 101);
            }
        }), getLifecycle());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @Override // androidx.fragment.app.Fragment
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(@org.jetbrains.annotations.NotNull android.view.LayoutInflater r9, @org.jetbrains.annotations.Nullable android.view.ViewGroup r10, @org.jetbrains.annotations.Nullable android.os.Bundle r11) {
        /*
            r8 = this;
            r0 = r8
            android.os.Bundle r0 = r0.getArguments()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L16
            r0 = r9
            java.lang.String r1 = "from_spmid"
            java.lang.String r0 = r0.getString(r1)
            r10 = r0
            r0 = r10
            r9 = r0
            r0 = r10
            if (r0 != 0) goto L19
        L16:
            java.lang.String r0 = ""
            r9 = r0
        L19:
            r0 = r8
            r1 = r9
            r0.f69433b = r1
            r0 = r8
            r1 = r8
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r2 = "bili_main_settings_preferences"
            android.content.SharedPreferences r1 = com.bilibili.xpref.Xpref.getSharedPreferences(r1, r2)
            r2 = r8
            r3 = 2131833490(0x7f113292, float:1.9300064E38)
            java.lang.String r2 = r2.getString(r3)
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            r0.f69437f = r1
            androidx.compose.ui.platform.ComposeView r0 = new androidx.compose.ui.platform.ComposeView
            r1 = r0
            r2 = r8
            android.content.Context r2 = r2.requireContext()
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r9 = r0
            r0 = r9
            r1 = -262502538(0xfffffffff05a8776, float:-2.7052598E29)
            r2 = 1
            com.bilibili.ogv.misc.timeline.m r3 = new com.bilibili.ogv.misc.timeline.m
            r4 = r3
            r5 = r8
            r4.<init>(r5)
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r1, r2, r3)
            r0.setContent(r1)
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.misc.timeline.OgvTimelineFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        boolean z6 = Xpref.getSharedPreferences(getApplicationContext(), "bili_main_settings_preferences").getBoolean(getString(2131833490), false);
        if (z6 != this.f69437f) {
            this.f69437f = z6;
            kf();
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f69436e = com.bilibili.ogv.infra.util.i.b(arguments.getString("timeline_type", "0"), 0);
        }
        Garb curGarb = GarbManager.getCurGarb();
        if (curGarb.isPure()) {
            if (MultipleThemeUtils.isWhiteTheme(requireContext())) {
                StatusBarCompat.setStatusBarDarkMode(p3());
            } else {
                StatusBarCompat.setStatusBarLightMode(p3());
            }
        } else if (curGarb.isDarkMode()) {
            StatusBarCompat.setStatusBarDarkMode(p3());
        } else {
            StatusBarCompat.setStatusBarLightMode(p3());
        }
        this.f69438g.f129727o.setValue(Integer.valueOf(this.f69436e));
        kf();
        BuildersKt.launch$default(LifecycleKt.getCoroutineScope(getLifecycle()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }
}
