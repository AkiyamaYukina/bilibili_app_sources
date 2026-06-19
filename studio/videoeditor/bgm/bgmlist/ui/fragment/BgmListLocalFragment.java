package com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment;

import Sg.e;
import YC0.d;
import aD0.f;
import android.app.LoaderManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.lib.ui.PermissionRequestUtils;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.ogvvega.tunnel.i;
import com.bilibili.studio.videoeditor.bgm.BgmLocalAdapter;
import com.bilibili.studio.videoeditor.bgm.bgmlist.BgmListActivity;
import com.bilibili.studio.videoeditor.util.Y;
import eB0.r;
import java.lang.ref.WeakReference;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/ui/fragment/BgmListLocalFragment.class */
public class BgmListLocalFragment extends androidx_fragment_app_Fragment implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BgmListActivity f109007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BgmLocalAdapter f109008c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RecyclerView f109010e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f109009d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f109011f = false;

    @Override // eB0.r
    public final void l9(boolean z6) {
        this.f109011f = z6;
        RecyclerView recyclerView = this.f109010e;
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(z6);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f109007b = (BgmListActivity) p3();
        this.f109009d = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131498228, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f109009d = false;
        super.onDestroyView();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i7, @NonNull String[] strArr, @NonNull int[] iArr) {
        d dVar;
        LoaderManager loaderManager;
        super.onRequestPermissionsResult(i7, strArr, iArr);
        PermissionsChecker.onPermissionResult(i7, strArr, iArr);
        if (!PermissionsChecker.checkSelfPermissions(getContext(), strArr) || (dVar = cB0.d.a().h) == null || (loaderManager = dVar.f28639b) == null) {
            return;
        }
        loaderManager.restartLoader(dVar.f28640c, null, dVar);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (!isAdded() || this.f109008c == null || p3() == null || p3().isFinishing()) {
            return;
        }
        f.d().f("BgmListLocalFragment 1");
        this.f109008c.Q();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131310689);
        this.f109010e = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        BgmLocalAdapter bgmLocalAdapter = new BgmLocalAdapter((BgmListActivity) p3());
        this.f109008c = bgmLocalAdapter;
        bgmLocalAdapter.f108923i = new e(this);
        int i7 = this.f109007b.f108954x;
        this.f109010e.setAdapter(bgmLocalAdapter);
        this.f109010e.setNestedScrollingEnabled(this.f109011f);
        Y.a(this.f109010e);
        BgmLocalAdapter bgmLocalAdapter2 = this.f109008c;
        if (bgmLocalAdapter2 != null) {
            bgmLocalAdapter2.P(null);
        }
        cB0.d dVarA = cB0.d.a();
        dVarA.f58767i = new i(this);
        if (cB0.d.f58758l == 2) {
            BLog.e("BgmListProvider", "setLocalAudioItemLoadListener directly");
            dVarA.f58767i.a(dVarA.f58763d);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z6) {
        super.setUserVisibleHint(z6);
        if (!z6 && isAdded()) {
            f.d().a("BgmListLocalFragment setUserVisibleHint");
            BgmLocalAdapter bgmLocalAdapter = this.f109008c;
            if (bgmLocalAdapter != null) {
                bgmLocalAdapter.N();
                BgmLocalAdapter.b bVar = this.f109008c.f108921f;
                bVar.getClass();
                bVar.f108924a = new WeakReference<>(null);
                bVar.removeCallbacksAndMessages(null);
            }
        }
        if (z6 && isAdded()) {
            if (Build.VERSION.SDK_INT >= 33 && this.f109007b != null && !PermissionsChecker.checkSelfPermissions(getContext(), new String[]{"android.permission.READ_MEDIA_AUDIO"})) {
                PermissionRequestUtils.requestPermissionWithTip(this, getLifecycle(), new String[]{"android.permission.READ_MEDIA_AUDIO"}, 257, this.f109007b.getString(2131841890));
            }
            Xz0.d.f28458a.getClass();
            Xz0.d.C("本地");
        }
    }
}
