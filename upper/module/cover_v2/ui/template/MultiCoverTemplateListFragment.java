package com.bilibili.upper.module.cover_v2.ui.template;

import QH0.d;
import QH0.h;
import Xw0.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bF0.M3;
import com.bilibili.base.viewbinding.ViewBindingProperty;
import com.bilibili.base.viewbinding.full.CreateMethod;
import com.bilibili.base.viewbinding.full.ReflectionFragmentViewBindings;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.upper.module.cover_v2.model.template.MultiCoverTemplate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/template/MultiCoverTemplateListFragment.class */
@StabilityInferred(parameters = 0)
public final class MultiCoverTemplateListFragment extends BaseFragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public d f112984d;
    public static final KProperty<Object>[] h = {new PropertyReference1Impl(MultiCoverTemplateListFragment.class, "viewBinding", "getViewBinding()Lcom/bilibili/upper/databinding/FragmentMultiCoverTemplateListBinding;", 0)};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f112981g = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c<MultiCoverTemplate> f112982b = new c<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public List<MultiCoverTemplate> f112983c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f112985e = -10086;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ViewBindingProperty f112986f = ReflectionFragmentViewBindings.viewBindingFragment(this, M3.class, CreateMethod.INFLATE, UtilsKt.emptyVbCallback());

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/template/MultiCoverTemplateListFragment$a.class */
    public static final class a {
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return ((M3) this.f112986f.getValue(this, h[0])).f54968a;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        c<MultiCoverTemplate> cVar = this.f112982b;
        cVar.f28349a = this.f112983c;
        cVar.f28350b = 2131501562;
        cVar.f28351c = new MultiCoverTemplateListFragment$initView$1$1(this);
        cVar.f28352d = new h(this, 0);
        RecyclerView recyclerView = ((M3) this.f112986f.getValue(this, h[0])).f54969b;
        recyclerView.setAdapter(this.f112982b);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 3, 1, false));
    }
}
