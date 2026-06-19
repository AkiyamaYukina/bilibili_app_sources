package com.bilibili.upper.module.draft.fragment;

import QK.s;
import QK.t;
import WH0.j;
import Xz0.e;
import Xz0.g;
import Xz0.k;
import YH0.c;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bolts.Task;
import cF0.C5234a;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.upper.module.draft.bean.DraftItemBean;
import com.bilibili.upper.module.draft.vm.DraftViewModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tw0.f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/draft/fragment/DraftsFragmentV2.class */
@StabilityInferred(parameters = 0)
public final class DraftsFragmentV2 extends DraftBaseFragment implements IPvTracker {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public j f113111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f113112g;

    @Nullable
    public DraftViewModel h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Bundle f113113i = new Bundle();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Bundle f113114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public String f113115k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/draft/fragment/DraftsFragmentV2$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f113116a;

        public a(Function1 function1) {
            this.f113116a = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f113116a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113116a.invoke(obj);
        }
    }

    public DraftsFragmentV2() {
        Bundle bundle = new Bundle();
        bundle.putString("first_entrance", Xz0.j.a("first_entrance"));
        bundle.putString("matter_num", "0");
        this.f113114j = bundle;
        this.f113115k = "";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "creation.drafts.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        return this.f113114j;
    }

    public final void lf() {
        j jVar = this.f113111f;
        if (jVar != null) {
            jVar.h = false;
        }
        DraftViewModel draftViewModel = this.h;
        if (draftViewModel != null) {
            draftViewModel.J0(true);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f113108c = arguments.getInt("jump_from");
            this.f113109d = arguments.getInt("show_type");
            this.f113112g = arguments.getBoolean("is_new_ui");
            this.f113110e = arguments.getBoolean("RELATION_FROM");
        }
        List<DraftItemBean> listA = c.a(getContext() == null ? null : C5234a.f(getApplicationContext()).c());
        this.f113111f = new j(this, listA, this.f113112g);
        jf(listA);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DraftViewModel draftViewModel = this.h;
        if (draftViewModel != null) {
            draftViewModel.N0();
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        List<DraftItemBean> list;
        super.onFragmentShow(flag);
        j jVar = this.f113111f;
        int size = (jVar == null || (list = jVar.f26520a) == null) ? 0 : list.size();
        Xz0.j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        Xz0.j.c("router_topic_id", g.f28463b);
        Map mapB = Xz0.j.b(k.f28474a);
        ((HashMap) mapB).put("draft_num", String.valueOf(size));
        f.e("creation.drafts.0.0.show", mapB);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        lf();
        if (TextUtils.isEmpty(this.f113115k)) {
            return;
        }
        String str = this.f113115k;
        defpackage.a.b("BiliUperBuriedUtil setTrackId : ", str, "BiliUperBuriedUtil");
        g.f28462a = str;
        Task.callInBackground(new e(str));
        g.f28463b = "";
    }

    @Override // com.bilibili.lib.ui.BaseRecyclerViewFragment
    public final void onViewCreated(@Nullable RecyclerView recyclerView, @Nullable Bundle bundle) {
        super.onViewCreated(recyclerView, bundle);
        int iKf = kf();
        this.f113107b = iKf;
        if (1 == iKf) {
            recyclerView.setBackgroundColor(-15987700);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        j jVar = this.f113111f;
        if (jVar != null) {
            jVar.f26522c = this.f113107b;
        }
        if (recyclerView != null) {
            recyclerView.setAdapter(jVar);
        }
        j jVar2 = this.f113111f;
        if (jVar2 != null) {
            jVar2.f26525f = new XH0.a(this);
            jVar2.f26526g = new XH0.a(this);
        }
        DraftViewModel draftViewModel = new DraftViewModel();
        draftViewModel.K0(p3());
        draftViewModel.f113119b.observe(getViewLifecycleOwner(), new a(new s(this, 1)));
        draftViewModel.f113124g.observe(getViewLifecycleOwner(), new a(new t(this, 1)));
        this.h = draftViewModel;
        lf();
        this.f113115k = g.d();
    }
}
