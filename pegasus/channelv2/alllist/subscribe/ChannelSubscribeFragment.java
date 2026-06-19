package com.bilibili.pegasus.channelv2.alllist.subscribe;

import Fi.d;
import Kr0.b;
import Sn0.e;
import Tn0.c;
import Vn0.f;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.lib.ui.mixin.IFragmentShowHide;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.pegasus.channelv2.alllist.subscribe.ChannelSubscribeFragment;
import com.bilibili.pegasus.channelv2.base.BaseButtonSwipeRefreshFragment;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.pvtracker.PageViewTracker;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import po0.C8336a;
import ro0.p;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/alllist/subscribe/ChannelSubscribeFragment.class */
@StabilityInferred(parameters = 0)
public final class ChannelSubscribeFragment extends BaseButtonSwipeRefreshFragment implements PassportObserver, IFragmentShowHide, IPvTracker {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public String f74963j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public f f74964k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public e f74965l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public List<? extends C8336a<? extends Object>> f74966m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f74969p;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f74967n = BiliAccounts.get(getContext()).isLogin();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final c f74968o = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final b f74970q = new b(this, 1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Sn0.a f74971r = new Observer(this) { // from class: Sn0.a

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelSubscribeFragment f23031a;

        {
            this.f23031a = this;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            final Un0.a aVar = (Un0.a) obj;
            if (aVar != null) {
                final ChannelSubscribeFragment channelSubscribeFragment = this.f23031a;
                boolean z6 = channelSubscribeFragment.f74967n;
                String str = aVar.f24781b;
                String str2 = aVar.f24780a;
                if (z6) {
                    channelSubscribeFragment.lf(str2, str, 2131235613);
                } else {
                    channelSubscribeFragment.lf(str2, str, 2131236957);
                }
                TextView textView = channelSubscribeFragment.f74978g;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("errorButton");
                    textView = null;
                }
                textView.setOnClickListener(new View.OnClickListener(channelSubscribeFragment, aVar) { // from class: Sn0.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ChannelSubscribeFragment f23032a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Un0.a f23033b;

                    {
                        this.f23032a = channelSubscribeFragment;
                        this.f23033b = aVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Qp0.c.e(this.f23032a.getContext(), this.f23033b.f24782c, null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE, "traffic.my-channel.0.0");
                    }
                });
            }
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/alllist/subscribe/ChannelSubscribeFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f74972a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Status.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f74972a = iArr;
        }
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return Op0.b.b("traffic.discovery-channel-tab.0.0");
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        bundle.putString("tab_name", this.f74963j);
        return bundle;
    }

    public final void mf(boolean z6) {
        MutableLiveData<Resource<List<C8336a<? extends Object>>>> mutableLiveData;
        MutableLiveData<Resource<List<C8336a<? extends Object>>>> mutableLiveData2;
        if (z6) {
            f fVar = this.f74964k;
            if (fVar == null || (mutableLiveData2 = fVar.f25612b) == null) {
                return;
            }
            mutableLiveData2.observe(this, this.f74970q);
            return;
        }
        f fVar2 = this.f74964k;
        if (fVar2 == null || (mutableLiveData = fVar2.f25612b) == null) {
            return;
        }
        mutableLiveData.removeObserver(this.f74970q);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onAttach(@NotNull Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("key_channel_id") : null;
        if (string != null) {
            StringsKt.toLongOrNull(string);
        }
        Bundle arguments2 = getArguments();
        String string2 = null;
        if (arguments2 != null) {
            string2 = arguments2.getString("key_channel_name");
        }
        this.f74963j = string2;
    }

    public final void onChange(@Nullable Topic topic) {
        onRefresh();
        this.f74969p = false;
    }

    @Override // com.bilibili.pegasus.channelv2.base.BaseLifecycleFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        Resource<List<C8336a<? extends Object>>> value;
        p<Un0.a> pVar;
        MutableLiveData<Resource<List<C8336a<? extends Object>>>> mutableLiveData;
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        BiliAccounts.get(getContext()).subscribe(this, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            f fVar = (f) new ViewModelProvider(fragmentActivityP3, ViewModelProvider.AndroidViewModelFactory.Companion.getInstance(fragmentActivityP3.getApplication())).get(f.class);
            this.f74964k = fVar;
            if (fVar != null && (mutableLiveData = fVar.f25612b) != null) {
                mutableLiveData.observe(this, this.f74970q);
            }
            f fVar2 = this.f74964k;
            if (fVar2 != null && (pVar = fVar2.f25613c) != null) {
                pVar.observe(this, this.f74971r);
            }
            f fVar3 = this.f74964k;
            if (fVar3 != null) {
                fVar3.f25622m = this.f74963j;
            }
        }
        f fVar4 = this.f74964k;
        if (fVar4 != null) {
            MutableLiveData<Resource<List<C8336a<? extends Object>>>> mutableLiveData2 = fVar4.f25612b;
            this.f74966m = (mutableLiveData2 == null || (value = mutableLiveData2.getValue()) == null) ? null : (List) value.getData();
        }
    }

    @Override // com.bilibili.pegasus.channelv2.base.BaseButtonSwipeRefreshFragment, com.bilibili.pegasus.channelv2.base.BaseLifecycleFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        BiliAccounts.get(getContext()).unsubscribe(this, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentHide(@NotNull Flag flag) {
        super.onFragmentHide(flag);
        PageViewTracker.getInstance().setFragmentVisibility(this, false);
        mf(false);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        super.onFragmentShow(flag);
        PageViewTracker.getInstance().setFragmentVisibility(this, true);
        mf(true);
        onRefresh();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void onRefresh() {
        if (!this.f74969p) {
            this.f74969p = true;
            return;
        }
        f fVar = this.f74964k;
        if (fVar != null) {
            fVar.refresh();
        }
    }

    @Override // com.bilibili.pegasus.channelv2.base.BaseLifecycleFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (isHidden()) {
            return;
        }
        onRefresh();
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [Fi.c, java.lang.Object] */
    @Override // com.bilibili.pegasus.channelv2.base.BaseButtonSwipeRefreshFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Context context;
        Resources resources;
        e eVar;
        super.onViewCreated(view, bundle);
        if (this.f74965l == null) {
            this.f74965l = new e(this);
        }
        List<? extends C8336a<? extends Object>> list = this.f74966m;
        if (list != null && (eVar = this.f74965l) != null) {
            eVar.N(list);
        }
        getRecyclerView().setLayoutManager(new LinearLayoutManager(getContext()));
        getRecyclerView().setAdapter(this.f74965l);
        getRecyclerView().setBackgroundColor(getResources().getColor(R$color.f64616Wh0));
        View view2 = getView();
        int dimensionPixelOffset = (view2 == null || (context = view2.getContext()) == null || (resources = context.getResources()) == null) ? 0 : resources.getDimensionPixelOffset(2131166074);
        getRecyclerView().setPadding(0, dimensionPixelOffset, 0, dimensionPixelOffset);
        getRecyclerView().setClipChildren(false);
        getRecyclerView().setClipToPadding(false);
        RecyclerView recyclerView = getRecyclerView();
        d dVar = new d();
        dVar.setAddDuration(50L);
        dVar.setRemoveDuration(50L);
        dVar.setMoveDuration(200L);
        dVar.setChangeDuration(200L);
        dVar.a((Fi.c) new Object());
        recyclerView.setItemAnimator(dVar);
        onRefresh();
    }
}
