package com.bilibili.upper.module.cover.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.ui.BaseFragment;
import java.io.File;
import java.util.ArrayList;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/ui/UpperCoverHomePreviewFragment.class */
@StabilityInferred(parameters = 0)
public final class UpperCoverHomePreviewFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f112717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f112718c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/ui/UpperCoverHomePreviewFragment$a.class */
    public final class a extends RecyclerView.Adapter<C1224a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public ArrayList<String> f112719a;

        /* JADX INFO: renamed from: com.bilibili.upper.module.cover.ui.UpperCoverHomePreviewFragment$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/ui/UpperCoverHomePreviewFragment$a$a.class */
        public final class C1224a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final BiliImageView f112720a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final TextView f112721b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final TextView f112722c;

            public C1224a(@NotNull View view) {
                super(view);
                this.f112720a = view.findViewById(2131308672);
                this.f112721b = (TextView) view.findViewById(2131321341);
                this.f112722c = (TextView) view.findViewById(2131321339);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            ArrayList<String> arrayList = this.f112719a;
            return arrayList != null ? arrayList.size() : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            String str;
            C1224a c1224a = (C1224a) viewHolder;
            ArrayList<String> arrayList = this.f112719a;
            if (arrayList == null || (str = arrayList.get(i7)) == null) {
                return;
            }
            String strFileToUri = BiliImageLoaderHelper.fileToUri(new File(str));
            c1224a.f112720a.setAspectRatio(1.3333334f);
            BiliImageLoader biliImageLoader = BiliImageLoader.INSTANCE;
            BiliImageView biliImageView = c1224a.f112720a;
            biliImageLoader.with(biliImageView.getContext()).disableMemoryCache().disableDiskCache().url(strFileToUri).into(biliImageView);
            bG0.g.c(c1224a.f112721b, !StringsKt.isBlank(str));
            bG0.g.c(c1224a.f112722c, !StringsKt.isBlank(str));
            c1224a.f112721b.setText(NumberFormat_androidKt.formatNumber$default(4260000, "0", 0, 4, (Object) null));
            c1224a.f112722c.setText(NumberFormat_androidKt.formatNumber$default(224000, "0", 0, 4, (Object) null));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new C1224a(p.a(viewGroup, 2131502806, viewGroup, false));
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131502803, viewGroup, false);
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
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bilibili.upper.module.cover.ui.UpperCoverHomePreviewFragment$a] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131310623);
        this.f112717b = recyclerView;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvContent");
            recyclerView2 = null;
        }
        ?? adapter = new RecyclerView.Adapter();
        adapter.f112719a = CollectionsKt.arrayListOf(new String[]{this.f112718c, "", "", ""});
        recyclerView2.setAdapter(adapter);
        RecyclerView recyclerView3 = this.f112717b;
        RecyclerView recyclerView4 = recyclerView3;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvContent");
            recyclerView4 = null;
        }
        recyclerView4.setLayoutManager(new GridLayoutManager(getContext(), 2));
        RecyclerView recyclerView5 = this.f112717b;
        if (recyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvContent");
            recyclerView5 = null;
        }
        recyclerView5.addItemDecoration(new yG0.a(2, Jf1.h.c(5), true, 0));
    }
}
