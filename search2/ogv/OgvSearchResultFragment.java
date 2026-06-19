package com.bilibili.search2.ogv;

import Bl.i;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.droid.BundleUtil;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.search2.result.all.p;
import com.bilibili.search2.result.base.BaseSearchResultFragment;
import com.bilibili.search2.result.base.BaseSearchResultViewModel;
import com.bilibili.search2.result.base.SearchState;
import com.bilibili.search2.result.base.q;
import com.bilibili.search2.result.base.u;
import com.bilibili.search2.result.base.w;
import com.bilibili.search2.result.base.x;
import com.bilibili.search2.result.widget.m;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/ogv/OgvSearchResultFragment.class */
@StabilityInferred(parameters = 0)
public final class OgvSearchResultFragment extends BaseSearchResultFragment<d> {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final String f86940u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public i f86941v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f86942w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public String f86943x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public e f86944y;

    /* JADX INFO: renamed from: com.bilibili.search2.ogv.OgvSearchResultFragment$loadData$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/ogv/OgvSearchResultFragment$loadData$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final boolean $reset;
        int label;
        final OgvSearchResultFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvSearchResultFragment ogvSearchResultFragment, boolean z6, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvSearchResultFragment;
            this.$reset = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$reset, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvSearchResultFragment ogvSearchResultFragment = this.this$0;
                MutableSharedFlow<u> mutableSharedFlow = ogvSearchResultFragment.f87474d;
                String next = ((SearchState) ogvSearchResultFragment.rf().f87499f.getValue()).getNext();
                OgvSearchResultFragment ogvSearchResultFragment2 = this.this$0;
                u.k kVar = new u.k(new x.d(next, ogvSearchResultFragment2.f86943x, ogvSearchResultFragment2.f86942w, this.$reset, ogvSearchResultFragment2.rf().f87498e.incrementAndGet()));
                this.label = 1;
                if (mutableSharedFlow.emit(kVar, this) == coroutine_suspended) {
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

    public OgvSearchResultFragment() {
        super(false);
        this.f86940u = "OgvSearchResultFragment";
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void Jf() {
        Bundle bundleMf = Mf();
        if (bundleMf != null) {
            PageViewTracker.getInstance().setExtra(this, getPvEventId(), bundleMf);
        }
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final BaseSearchResultViewModel Kf() {
        d dVar;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int iIntValue = BundleUtil.getInteger(arguments, "type", new Integer[]{0}).intValue();
            this.f86942w = iIntValue;
            dVar = iIntValue == 7 ? (d) new ViewModelProvider(this).get(a.class) : (d) new ViewModelProvider(this).get(b.class);
        } else {
            dVar = (d) new ViewModelProvider(this).get(b.class);
        }
        return dVar;
    }

    public final Bundle Mf() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        try {
            if (this.f86944y == null) {
                return null;
            }
            Bundle arguments = getArguments();
            String string = (arguments == null || (bundle = arguments.getBundle("default_extra_bundle")) == null) ? "" : bundle.getString("keyword");
            String str = string;
            if (string == null) {
                str = "";
            }
            bundle2.putString("query", str);
            String trackId = rf().getTrackId();
            if (trackId == null) {
                trackId = "";
            }
            bundle2.putString("trackid", trackId);
            bundle2.putString("is_recall", Intrinsics.areEqual(rf().M0(), Boolean.TRUE) ? "0" : "1");
        } catch (Throwable th) {
        }
        return bundle2;
    }

    public final void Nf() {
        Bundle arguments;
        if (this.f86943x != null || (arguments = getArguments()) == null) {
            return;
        }
        this.f86942w = BundleUtil.getInteger(arguments, "type", new Integer[]{0}).intValue();
        Bundle bundle = arguments.getBundle("default_extra_bundle");
        if (bundle != null) {
            this.f86943x = bundle.getString("keyword");
        }
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        Nf();
        return this.f86942w == 7 ? "pgc.bangumi-search.0.0.pv" : "pgc.cinema-search.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final Bundle getPvExtra() {
        return Mf();
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void loadData(boolean z6) {
        if (z6 || !rf().Q0()) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, z6, null), 3, (Object) null);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Nf();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        i iVarInflate = i.inflate(layoutInflater);
        this.f86941v = iVarInflate;
        return iVarInflate.a;
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f86941v = null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        e eVar = this.f86944y;
        if (eVar != null) {
            eVar.a0(true);
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        e eVar = this.f86944y;
        if (eVar != null) {
            eVar.a0(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bilibili.search2.ogv.e, com.bilibili.search2.result.all.p, com.bilibili.search2.result.base.w<?>] */
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
    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        i iVar = this.f86941v;
        if (iVar != null) {
            this.f87475e = iVar.b;
            this.f87477g = iVar.d;
            RecyclerView recyclerView = iVar.c;
            this.h = recyclerView;
            int iBf = BaseSearchResultFragment.Bf(this);
            Context contextRequireContext = requireContext();
            recyclerView.addItemDecoration(new m(ListExtentionsKt.toPx(com.bilibili.search2.component.e.c(contextRequireContext)), ListExtentionsKt.toPx(com.bilibili.search2.component.e.g(contextRequireContext) ? 8 : 0), 0, 35, com.bilibili.search2.component.e.j(contextRequireContext)));
            ?? pVar = new p(this, new OgvSearchResultFragment$onViewCreated$1$adapter$1(this), 4);
            this.f87478i = pVar;
            this.f86944y = pVar;
            recyclerView.setAdapter(pVar);
            BaseSearchResultFragment.Af(this, iBf);
        }
        super.onViewCreated(view, bundle);
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment, com.bilibili.lib.ui.BaseFragment
    public final void setUserVisibleCompat(boolean z6) {
        super.setUserVisibleCompat(z6);
        if (z6) {
            xf(this);
            if (rf().N0() == 0 && mf().f87275a.size() == 0 && !Intrinsics.areEqual(rf().R0(), Boolean.TRUE)) {
                w<?> wVarMf = this.f87478i != null ? mf() : null;
                if (wVarMf != null) {
                    wVarMf.f87275a.clear();
                    wVarMf.notifyDataSetChanged();
                    wVarMf.f87670d = false;
                }
                loadData(true);
            }
        }
        e eVar = this.f86944y;
        if (eVar != null) {
            eVar.a0(z6);
        }
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final boolean sf(@NotNull q.a aVar) {
        BLog.v(this.f86940u, "showEvent " + aVar);
        return false;
    }
}
