package com.bilibili.upper.module.cover.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.ui.BaseFragment;
import java.io.File;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/ui/UpperCoverSpacePreviewFragment.class */
@StabilityInferred(parameters = 0)
public final class UpperCoverSpacePreviewFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f112747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f112748c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/ui/UpperCoverSpacePreviewFragment$a.class */
    public final class a extends RecyclerView.Adapter<C1225a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public ArrayList<String> f112749a;

        /* JADX INFO: renamed from: com.bilibili.upper.module.cover.ui.UpperCoverSpacePreviewFragment$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/ui/UpperCoverSpacePreviewFragment$a$a.class */
        public final class C1225a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final BiliImageView f112750a;

            public C1225a(@NotNull View view) {
                super(view);
                this.f112750a = view.findViewById(2131308672);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            ArrayList<String> arrayList = this.f112749a;
            return arrayList != null ? arrayList.size() : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            String str;
            C1225a c1225a = (C1225a) viewHolder;
            ArrayList<String> arrayList = this.f112749a;
            if (arrayList == null || (str = arrayList.get(i7)) == null) {
                return;
            }
            X9.n.a(c1225a.f112750a, BiliImageLoader.INSTANCE, BiliImageLoaderHelper.fileToUri(new File(str))).into(c1225a.f112750a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new C1225a(p.a(viewGroup, 2131502807, viewGroup, false));
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131502804, viewGroup, false);
        ViewGroup viewGroup2 = null;
        ViewParent parent = viewInflate != null ? viewInflate.getParent() : null;
        if (parent instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) parent;
        }
        if (viewGroup2 != null) {
            viewGroup2.removeView(viewInflate);
        }
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bilibili.upper.module.cover.ui.UpperCoverSpacePreviewFragment$a] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131310623);
        this.f112747b = recyclerView;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvContent");
            recyclerView2 = null;
        }
        ?? adapter = new RecyclerView.Adapter();
        adapter.f112749a = CollectionsKt.arrayListOf(new String[]{this.f112748c, "", "", "", ""});
        recyclerView2.setAdapter(adapter);
        RecyclerView recyclerView3 = this.f112747b;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvContent");
            recyclerView3 = null;
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
    }
}
