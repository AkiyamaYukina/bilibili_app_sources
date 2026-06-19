package com.bilibili.topix.center;

import ES0.q1;
import PD0.C2771m;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.foundation.text.C3697l0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.exoplayer.analytics.S;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.compose.color.IThemeColors;
import com.bilibili.compose.theme.GarbInfo;
import com.bilibili.compose.theme.ThemeDayNight;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseToolbarFragment;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.magicasakura.widgets.TintToolbar;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.topix.LoadListStatus;
import com.mall.data.page.create.presale.CouponCode;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/TopixCenterFragment.class */
@StabilityInferred(parameters = 0)
public final class TopixCenterFragment extends BaseToolbarFragment implements IPvTracker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f112371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public C2771m f112372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f112373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f112374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public bY.c<RecyclerView> f112375f;

    public TopixCenterFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.topix.center.TopixCenterFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m10611invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.topix.center.TopixCenterFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m10612invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f112371b = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(E.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.topix.center.TopixCenterFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m10613invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.topix.center.TopixCenterFragment$special$$inlined$viewModels$default$4
            final Function0 $extrasProducer;
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function02;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m10614invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.jvm.functions.Function0 r0 = r0.$extrasProducer
                    r3 = r0
                    r0 = r3
                    if (r0 == 0) goto L19
                    r0 = r3
                    java.lang.Object r0 = r0.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L44
                L19:
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L30
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L32
                L30:
                    r0 = 0
                    r3 = r0
                L32:
                    r0 = r3
                    if (r0 == 0) goto L40
                    r0 = r3
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                    goto L44
                L40:
                    androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
                    r3 = r0
                L44:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.center.TopixCenterFragment$special$$inlined$viewModels$default$4.m10614invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.topix.center.TopixCenterFragment$special$$inlined$viewModels$default$5
            final Lazy $owner$delegate;
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.ViewModelProvider.Factory m10615invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L17
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L19
                L17:
                    r0 = 0
                    r3 = r0
                L19:
                    r0 = r3
                    if (r0 == 0) goto L2a
                    r0 = r3
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L32
                L2a:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_viewModels
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r3 = r0
                L32:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.center.TopixCenterFragment$special$$inlined$viewModels$default$5.m10615invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f112373d = LazyKt.lazy(new WC.a(this, 3));
        this.f112374e = LazyKt.lazy(new Ys0.a(this, 3));
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "dt.new-topic-center.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final /* bridge */ /* synthetic */ Bundle getPvExtra() {
        return null;
    }

    public final E mf() {
        return (E) this.f112371b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v56, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [dY.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [cY.c, java.lang.Object] */
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
    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C2771m c2771mInflate = C2771m.inflate(layoutInflater);
        this.f112372c = c2771mInflate;
        E eMf = mf();
        Bundle arguments = getArguments();
        eMf.f112363c = arguments != null ? arguments.getString("scene") : null;
        C2771m c2771m = this.f112372c;
        if (c2771m != null) {
            c2771m.f18768e.setOnClickListener(new com.bilibili.biligame.ui.pointmall.record.B(this, 1));
            o oVar = new o(getResources().getColor(R$color.Line_regular), getResources().getColor(R$color.Bg3));
            RecyclerView recyclerView = c2771m.f18767d;
            recyclerView.addItemDecoration(oVar);
            recyclerView.setAdapter(new ConcatAdapter((C6667e) this.f112373d.getValue(), (ND0.a) this.f112374e.getValue()));
            ListExtentionsKt.onReachBottom(recyclerView, 3, new q1(this, 4));
            bY.d dVar = new bY.d(new eY.c(recyclerView));
            bY.a aVar = dVar.b;
            aVar.e = true;
            aVar.h = new Object();
            aVar.g = new Object();
            this.f112375f = dVar.a();
            c2771m.f18771i.setOnClickListener(new Of.b(this, 1));
            c2771m.f18765b.setOnClickListener(new com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark.c(this, 1));
            c2771m.f18769f.setOnClickListener(new Object());
        }
        mf().f112365e.observe(getViewLifecycleOwner(), new k(new XK0.f(c2771mInflate, 2)));
        mf().f112366f.observe(getViewLifecycleOwner(), new k(new Sy0.l(c2771mInflate, 2)));
        final int i7 = 0;
        mf().f112367g.observe(getViewLifecycleOwner(), new k(new Function1(this, i7) { // from class: com.bilibili.topix.center.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f112420a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f112421b;

            {
                this.f112420a = i7;
                this.f112421b = this;
            }

            public final Object invoke(Object obj) {
                String string;
                String string2;
                String string3;
                String string4;
                String string5;
                String string6;
                String string7;
                String string8;
                String string9;
                String string10;
                String string11;
                String string12;
                String string13;
                String string14;
                switch (this.f112420a) {
                    case 0:
                        ND0.a aVar2 = (ND0.a) ((TopixCenterFragment) this.f112421b).f112374e.getValue();
                        aVar2.f16990b = (LoadListStatus) obj;
                        aVar2.notifyItemChanged(0);
                        break;
                    case 1:
                        MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                        JSONObject jSONObject = (JSONObject) this.f112421b;
                        if (jSONObject != null && (string14 = jSONObject.getString("isAgreePub")) != null) {
                            mutableBundleLike.put("isAgreePub", string14);
                        }
                        if (jSONObject != null && (string13 = jSONObject.getString("enablePub")) != null) {
                            mutableBundleLike.put("enablePub", string13);
                        }
                        if (jSONObject != null && (string12 = jSONObject.getString("subjectName")) != null) {
                            mutableBundleLike.put("subjectName", string12);
                        }
                        if (jSONObject != null && (string11 = jSONObject.getString("subjectId")) != null) {
                            mutableBundleLike.put("subjectId", string11);
                        }
                        if (jSONObject != null && (string10 = jSONObject.getString("shopId")) != null) {
                            mutableBundleLike.put("shopId", string10);
                        }
                        if (jSONObject != null && (string9 = jSONObject.getString("subjectType")) != null) {
                            mutableBundleLike.put("subjectType", string9);
                        }
                        if (jSONObject != null && (string8 = jSONObject.getString("subjectUrl")) != null) {
                            mutableBundleLike.put("subjectUrl", string8);
                        }
                        if (jSONObject != null && (string7 = jSONObject.getString("activityCheck")) != null) {
                            mutableBundleLike.put("activityCheck", string7);
                        }
                        if (jSONObject != null && (string6 = jSONObject.getString("activityShortName")) != null) {
                            mutableBundleLike.put("activityShortName", string6);
                        }
                        if (jSONObject != null && (string5 = jSONObject.getString("activityId")) != null) {
                            mutableBundleLike.put("activityId", string5);
                        }
                        if (jSONObject != null && (string4 = jSONObject.getString("activityTopic")) != null) {
                            mutableBundleLike.put("activityTopic", string4);
                        }
                        if (jSONObject != null && (string3 = jSONObject.getString("rewardText")) != null) {
                            mutableBundleLike.put("rewardText", string3);
                        }
                        if (jSONObject != null && (string2 = jSONObject.getString("scene")) != null) {
                            mutableBundleLike.put("scene", string2);
                        }
                        if (jSONObject != null && (string = jSONObject.getString("titleText")) != null) {
                            mutableBundleLike.put("titleText", string);
                        }
                        break;
                    default:
                        S.a((TextView) obj, "有效期：", gQ0.o.h(((CouponCode) this.f112421b).expireDate));
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        mf().f112364d.observe(getViewLifecycleOwner(), new k(new i(this, 0)));
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new TopixCenterFragment$onCreateView$1$5(this, null), 3, (Object) null);
        mf().J0(true);
        return c2771mInflate.f18764a;
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f112372c = null;
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        TintToolbar mToolbar = getMToolbar();
        if (mToolbar != null) {
            mToolbar.setNavigationIcon(ResourcesCompat.getDrawable(getResources(), 2131241102, null));
        }
        mf().f112368i.observe(getViewLifecycleOwner(), new k(new C3697l0(this, 2)));
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment
    public final void setToolbarStyle(@NotNull Garb garb) {
        super.setToolbarStyle(garb);
        ThemeStrategy themeStrategy = ThemeStrategy.FollowApp;
        GarbInfo garbInfoA = UW.b.a(garb);
        IThemeColors iThemeColorsB = UW.g.b(garbInfoA, UW.g.c(garbInfoA) ? ThemeDayNight.Night : ThemeDayNight.Day, themeStrategy);
        C2771m c2771m = this.f112372c;
        if (c2771m != null) {
            c2771m.f18772j.setTextColor(ColorKt.m2683toArgb8_81llA(iThemeColorsB.getTextTitle-0d7_KjU()));
        }
        C2771m c2771m2 = this.f112372c;
        if (c2771m2 != null) {
            c2771m2.f18765b.setTextColor(ColorKt.m2683toArgb8_81llA(iThemeColorsB.getTextOther-0d7_KjU()));
        }
    }
}
