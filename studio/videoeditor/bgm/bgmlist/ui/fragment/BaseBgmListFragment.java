package com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cB0.b;
import cB0.d;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.bgm.bgmlist.BgmListActivity;
import com.bilibili.studio.videoeditor.bgm.e;
import com.bilibili.studio.videoeditor.bgm.favorite.EditFavoriteBgmFragment;
import com.bilibili.studio.videoeditor.util.L;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.studio.videoeditor.util.Y;
import eB0.a;
import eB0.r;
import fB0.f;
import iB0.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/ui/fragment/BaseBgmListFragment.class */
public class BaseBgmListFragment extends androidx_fragment_app_Fragment implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f108990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f108991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BgmListActivity f108992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f108993e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f108995g;
    public ImageView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f108996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f108997j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public String f108999l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f108994f = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f108998k = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f109000m = false;

    public String hf() {
        return "";
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public boolean mo10410if() {
        return this.f108994f;
    }

    public final void jf() {
        this.f108990b.setVisibility(8);
        LinearLayout linearLayout = this.f108995g;
        ImageView imageView = this.h;
        TextView textView = this.f108996i;
        String string = getString(2131841340);
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        if (imageView != null) {
            imageView.setImageResource(2131235615);
            imageView.setVisibility(0);
        }
        if (textView != null) {
            if (TextUtils.isEmpty(string)) {
                textView.setVisibility(8);
            } else {
                textView.setText(string);
                textView.setVisibility(0);
            }
        }
    }

    public final void kf(@Nullable List<Bgm> list) {
        if (V.e(list)) {
            RecyclerView recyclerView = this.f108990b;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            nf();
            return;
        }
        LinearLayout linearLayout = this.f108995g;
        ImageView imageView = this.h;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof AnimationDrawable) {
                ((AnimationDrawable) drawable).stop();
            }
            imageView.setVisibility(8);
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        RecyclerView recyclerView2 = this.f108990b;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
            if (!V.e(list)) {
                long j7 = this.f108992d.f108955y;
                if (j7 != -1) {
                    for (Bgm bgm : list) {
                        if (bgm.sid == j7) {
                            String[] strArr = bgm.tags;
                            if (strArr == null) {
                                bgm.tags = new String[]{getString(2131841818)};
                            } else {
                                String[] strArr2 = new String[strArr.length + 1];
                                strArr2[0] = getString(2131841818);
                                String[] strArr3 = bgm.tags;
                                System.arraycopy(strArr3, 0, strArr2, 1, strArr3.length);
                                bgm.tags = strArr2;
                            }
                        }
                    }
                }
            }
            e eVar = this.f108991c;
            eVar.N();
            b bVar = eVar.f109054a;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                bVar.getClass();
                bVar.f58752a = new ArrayList<>(arrayList);
                bVar.c();
                bVar.b();
            } else {
                bVar.getClass();
                bVar.f58752a = new ArrayList<>(list);
                bVar.c();
                bVar.b();
            }
            eVar.notifyDataSetChanged();
        }
    }

    @Override // eB0.r
    public final void l9(boolean z6) {
        mf(z6);
        RecyclerView recyclerView = this.f108990b;
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(z6);
        }
    }

    public final void lf() {
        e eVar;
        int i7;
        if (isAdded() && (eVar = this.f108991c) != null && (i7 = eVar.f109055b) > -1 && i7 < eVar.getItemCount() && p3() != null) {
            f childAt = this.f108990b.getChildAt(this.f108991c.f109055b);
            if (childAt instanceof f) {
                f fVar = childAt;
                fVar.g.a((f.c) null);
                fVar.g.removeCallbacksAndMessages(null);
            }
        }
        e eVar2 = this.f108991c;
        if (eVar2 != null) {
            eVar2.N();
            eVar2.notifyDataSetChanged();
        }
    }

    public void mf(boolean z6) {
        this.f108994f = z6;
    }

    public void nf() {
        L.a(this.f108995g, this.h, this.f108996i, getString(2131841736));
    }

    public void of() {
        if (isAdded()) {
            d.a().getClass();
            boolean z6 = false;
            if (d.f58757k == 1) {
                LinearLayout linearLayout = this.f108995g;
                ImageView imageView = this.h;
                TextView textView = this.f108996i;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                if (imageView != null) {
                    imageView.setImageResource(2131241260);
                    imageView.setVisibility(0);
                    Drawable drawable = imageView.getDrawable();
                    if (drawable instanceof AnimationDrawable) {
                        ((AnimationDrawable) drawable).start();
                    }
                }
                if (textView != null) {
                    if (TextUtils.isEmpty(null)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText((CharSequence) null);
                        textView.setVisibility(0);
                    }
                }
            }
            if (this.f108992d.f108954x == 1) {
                z6 = true;
            }
            this.f108991c.f109059f = z6;
            this.f108991c.f109062j = new a(new c(this.f108993e, (EditFavoriteBgmFragment) null));
            int i7 = this.f108992d.f108954x;
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f109000m = true;
        this.f108992d = (BgmListActivity) p3();
        this.f108993e = context.getApplicationContext();
        e eVar = new e();
        this.f108991c = eVar;
        eVar.f109063k = hf();
        e eVar2 = this.f108991c;
        eVar2.f109061i = 4096;
        eVar2.f109060g = new eB0.b(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131498224, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f109000m = false;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStop() {
        e eVar;
        int i7;
        super.onStop();
        if (!isAdded() || (eVar = this.f108991c) == null || (i7 = eVar.f109055b) <= -1 || i7 >= eVar.getItemCount() || p3() == null || p3().isFinishing()) {
            return;
        }
        aD0.f.d().f("BaseBgmListFragment 3");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131308108);
        this.f108990b = recyclerView;
        recyclerView.setNestedScrollingEnabled(mo10410if());
        this.f108990b.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        this.f108990b.setAdapter(this.f108991c);
        Y.a(this.f108990b);
        this.f108995g = (LinearLayout) view.findViewById(2131303626);
        this.h = (ImageView) view.findViewById(2131305829);
        this.f108996i = (TextView) view.findViewById(2131305845);
        of();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z6) {
        e eVar;
        if (z6 || !isAdded() || (eVar = this.f108991c) == null) {
            return;
        }
        eVar.N();
        eVar.notifyDataSetChanged();
        aD0.f.d().a("BaseBgmListFragment setUserVisibleHint");
    }
}
