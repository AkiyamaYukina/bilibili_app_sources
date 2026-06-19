package com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment;

import Xz0.d;
import android.app.LoaderManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import bB0.C4937a;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.videoeditor.bgm.bgmlist.BgmListActivity;
import com.bilibili.studio.videoeditor.bgm.favorite.EditFavoriteBgmFragment;
import com.bilibili.studio.videoeditor.util.C6635h;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.upper.module.honour.utils.a;
import dB0.b;
import eB0.g;
import eB0.h;
import eB0.i;
import eB0.j;
import eB0.l;
import eB0.m;
import hB0.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/ui/fragment/BgmListManageSheetFragment.class */
public class BgmListManageSheetFragment extends AbstractHeaderSheetFragment {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f109012v = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f109013e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f109014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RelativeLayout f109015g;
    public LinearLayout h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f109016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f109017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public m f109018k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f109019l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f109020m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public BgmSearchContentFragment f109021n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public FrameLayout f109022o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewPager f109023p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public BgmSearchContentFragment f109024q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public EditFavoriteBgmFragment f109025r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C4937a f109026s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f109027t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f109028u;

    /* JADX WARN: Type inference failed for: r0v2, types: [hB0.f, java.lang.Object] */
    public BgmListManageSheetFragment() {
        ?? obj = new Object();
        ((f) obj).f = new ArrayList();
        this.f109019l = obj;
        this.f109020m = 0;
        this.f109027t = "0";
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractHeaderSheetFragment
    public final String getTitle() {
        return getString(2131841945);
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractHeaderSheetFragment, com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractSheetFragment
    /* JADX INFO: renamed from: if */
    public final boolean mo10409if() {
        if (this.f109020m != 4) {
            return false;
        }
        this.f109017j.performClick();
        this.f109020m = 0;
        return true;
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractHeaderSheetFragment
    public final View kf() {
        return this.f109014f;
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractHeaderSheetFragment
    public final void lf() {
        this.f108989b.finish();
    }

    public final void mf(boolean z6) {
        C4937a c4937a = this.f109026s;
        if (c4937a == null) {
            return;
        }
        if (z6) {
            c4937a.b(this.f109013e);
        } else {
            c4937a.b(-1);
        }
    }

    public final void nf(String str) {
        if (TextUtils.isEmpty(str)) {
            ToastHelper.showToastLong(getContext(), 2131842451);
            return;
        }
        if (!ConnectivityMonitor.getInstance().isNetworkActive()) {
            ToastHelper.showToastLong(getContext(), 2131842225);
            return;
        }
        qf(false);
        f fVar = this.f109019l;
        if (this.f109018k == null) {
            this.f109018k = new m(this);
        }
        m mVar = this.f109018k;
        fVar.a = str;
        fVar.c = mVar;
        fVar.b = 1;
        fVar.d = true;
        fVar.e = false;
        fVar.f.clear();
        fVar.a(str, mVar, 1);
        d.f28458a.getClass();
        HashMap map = new HashMap();
        map.put("query", str);
        Neurons.reportClick(false, "creation.music-choose.search.0.click", map);
    }

    public final BgmSearchContentFragment of() {
        if (this.f109021n == null) {
            BgmSearchContentFragment bgmSearchContentFragment = new BgmSearchContentFragment();
            this.f109021n = bgmSearchContentFragment;
            bgmSearchContentFragment.f109037q = this.f109019l;
            bgmSearchContentFragment.f109039s = new a(this);
            this.f109024q = bgmSearchContentFragment;
        }
        return this.f109021n;
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractHeaderSheetFragment, com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractSheetFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f109026s = new C4937a(context);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C4937a c4937a = this.f109026s;
        int i7 = this.f109013e;
        List<C4937a.C0299a> list = c4937a.f54469a;
        C6635h.k((list == null || i7 >= ((ArrayList) list).size()) ? "" : ((C4937a.C0299a) ((ArrayList) c4937a.f54469a).get(i7)).f54470a);
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractHeaderSheetFragment, com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        int i7;
        LoaderManager loaderManager;
        View viewInflate = LayoutInflater.from(view.getContext()).inflate(2131498229, (ViewGroup) null);
        this.f109014f = viewInflate;
        this.f109023p = (ViewPager) viewInflate.findViewById(2131308629);
        View view2 = this.f109014f;
        this.f109022o = (FrameLayout) view2.findViewById(2131297502);
        this.f109015g = (RelativeLayout) view2.findViewById(2131310428);
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(2131305713);
        this.h = linearLayout;
        linearLayout.setOnClickListener(new com.bilibili.lib.mod.b(this, 1));
        TextView textView = (TextView) view2.findViewById(2131315170);
        this.f109017j = textView;
        textView.setOnClickListener(new com.bilibili.lib.mod.d(2, this));
        ((LinearLayout) view2.findViewById(2131305716)).setOnClickListener(null);
        EditText editText = (EditText) view2.findViewById(2131301219);
        this.f109016i = editText;
        editText.setOnEditorActionListener(new g(this));
        this.f109016i.setOnFocusChangeListener(new h(this));
        this.f109016i.setOnTouchListener(new i(this));
        this.f109016i.addTextChangedListener(new l(this));
        rf(getContext(), false);
        super.onViewCreated(view, bundle);
        BgmListActivity bgmListActivity = this.f108989b;
        if (bgmListActivity != null) {
            i7 = bgmListActivity.f108954x;
            loaderManager = bgmListActivity.getLoaderManager();
        } else {
            i7 = 2;
            loaderManager = null;
        }
        cB0.d.a().d(i7, loaderManager, new j(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void pf(int r6, java.util.List<com.bilibili.studio.videoeditor.bgm.Bgm> r7) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BgmListManageSheetFragment.pf(int, java.util.List):void");
    }

    public final void qf(boolean z6) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (z6) {
            inputMethodManager.toggleSoftInput(1, 0);
        } else {
            inputMethodManager.hideSoftInputFromWindow(this.f109016i.getWindowToken(), 2);
        }
    }

    public final void rf(Context context, boolean z6) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f109015g.getLayoutParams();
        int devicesWidthPixels = DensityUtil.getDevicesWidthPixels(getContext());
        if (z6) {
            layoutParams.width = (devicesWidthPixels - V.a(2131165894, context)) - V.a(2131165806, this.f108989b);
            this.f109015g.setLayoutParams(layoutParams);
            this.f109017j.setVisibility(0);
            return;
        }
        layoutParams.width = devicesWidthPixels - V.a(2131165806, this.f108989b);
        this.f109015g.setLayoutParams(layoutParams);
        this.f109020m = 4;
        qf(false);
        this.f109016i.setText("");
        this.f109016i.setFocusable(false);
        this.f109022o.setVisibility(8);
    }
}
