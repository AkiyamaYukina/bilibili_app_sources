package com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment;

import X60.h;
import XC0.e;
import XC0.f;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.ui.PermissionRequestUtils;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.montage.export.ExportEngine;
import com.bilibili.studio.config.UpperFawkesDeviceDecision;
import com.bilibili.studio.videoeditor.bgm.bgmlist.BgmListActivity;
import com.bilibili.studio.videoeditor.picker.bean.StorageBean;
import com.bilibili.studio.videoeditor.picker.event.EventAudioChoose;
import com.bilibili.studio.videoeditor.util.Q;
import eB0.r;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import lB0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/ui/fragment/BgmListLocalDetailSheetFragment.class */
public class BgmListLocalDetailSheetFragment extends AbstractHeaderSheetFragment implements r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f109002j = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f109003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f109004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f109005g;

    @Nullable
    public f h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public a.a f109006i;

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractHeaderSheetFragment
    public final String getTitle() {
        return getString(2131842404);
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractHeaderSheetFragment, com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractSheetFragment
    /* JADX INFO: renamed from: if */
    public final boolean mo10409if() {
        aD0.f.d().f("BgmListLocalDetailSheetFragment 3");
        f fVar = this.h;
        if (fVar == null) {
            return true;
        }
        if (fVar.f27987j == 0) {
            lf();
            return true;
        }
        fVar.N();
        return true;
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractHeaderSheetFragment
    public final String jf() {
        return getString(2131841414);
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractHeaderSheetFragment
    public final View kf() {
        return this.f109003e;
    }

    @Override // eB0.r
    public final void l9(boolean z6) {
        this.f109005g.setNestedScrollingEnabled(z6);
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractHeaderSheetFragment
    public final void lf() {
        BgmListActivity bgmListActivity = this.f108989b;
        if (bgmListActivity.f108948H) {
            bgmListActivity.finish();
            return;
        }
        bgmListActivity.Q6().mf(true);
        bgmListActivity.f108956z.startAnimation(bgmListActivity.f108943C);
        bgmListActivity.f108956z.setVisibility(8);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        a.a aVar;
        f.c cVar;
        f fVar = this.h;
        if (fVar != null && (cVar = fVar.f27986i) != null) {
            cVar.f27996c = false;
            cVar.f27994a.clear();
            Iterator<Runnable> it = cVar.f27995b.iterator();
            while (it.hasNext()) {
                HandlerThreads.remove(3, it.next());
            }
            cVar.f27995b.clear();
        }
        if (EntryPointKt.getMemleakOptEnable() && (aVar = this.f109006i) != null) {
            aVar.a();
            this.f109006i = null;
        }
        super.onDestroyView();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i7, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (i7 == 1001) {
            if (iArr.length > 0 && iArr[0] == 0) {
                f fVar = this.h;
                if (fVar != null) {
                    fVar.notifyDataSetChanged();
                    return;
                }
                return;
            }
            BgmListActivity bgmListActivity = this.f108989b;
            if (bgmListActivity == null || PermissionsChecker.shouldShowRequestPermissionRationale(bgmListActivity, new String[]{"android.permission.READ_MEDIA_AUDIO"})) {
                return;
            }
            BgmListActivity bgmListActivity2 = this.f108989b;
            PermissionsChecker.showPermissionSettingAlert(bgmListActivity2, null, bgmListActivity2.getString(2131841890), null);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStop() {
        List<f.d> list;
        aD0.f.d().f("BgmListLocalDetailSheetFragment 1");
        f fVar = this.h;
        if (fVar != null && (list = fVar.f27979a) != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f.d dVar = (f.d) it.next();
                if (dVar.f28000d) {
                    dVar.f27997a = false;
                    break;
                }
            }
        }
        if (p3() != null && !p3().isFinishing()) {
            aD0.f.d().f("BgmListLocalDetailSheetFragment 2");
            List<f.d> list2 = this.h.f27979a;
            if (list2 != null) {
                Iterator it2 = ((ArrayList) list2).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    f.d dVar2 = (f.d) it2.next();
                    if (dVar2.f28000d) {
                        dVar2.f27997a = false;
                        break;
                    }
                }
            }
        }
        super.onStop();
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [XC0.f, androidx.recyclerview.widget.RecyclerView$Adapter] */
    /* JADX WARN: Type inference failed for: r0v27, types: [XC0.f$c, java.lang.Object] */
    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractHeaderSheetFragment, com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        View viewInflate = LayoutInflater.from(view.getContext()).inflate(2131498227, (ViewGroup) null);
        this.f109003e = viewInflate;
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(2131296853);
        this.f109004f = linearLayout;
        linearLayout.setOnClickListener(new h(this, 2));
        RecyclerView recyclerView = (RecyclerView) this.f109003e.findViewById(2131305122);
        this.f109005g = recyclerView;
        FragmentActivity fragmentActivityP3 = p3();
        ?? adapter = new RecyclerView.Adapter();
        adapter.f27979a = new ArrayList();
        new SimpleDateFormat("yyyy年MM月dd日 HH:mm", Locale.CHINA);
        adapter.f27980b = new String[]{"mp3", "flac", ExportEngine.COMPILE_AUDIO_ENCODER_NAME_AAC, "m4a"};
        adapter.f27981c = new SparseArray<>();
        adapter.f27982d = 0;
        adapter.f27983e = 0;
        adapter.f27987j = 0;
        adapter.f27992o = new Handler();
        adapter.f27985g = fragmentActivityP3;
        ?? obj = new Object();
        obj.f27994a = new ConcurrentHashMap<>();
        obj.f27995b = new ConcurrentLinkedQueue<>();
        obj.f27996c = true;
        adapter.f27986i = obj;
        recyclerView.addOnScrollListener(new e(adapter, recyclerView));
        this.h = adapter;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(this.h);
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        super.onViewCreated(view, bundle);
        if (((Boolean) UpperFawkesDeviceDecision.f105489h0.getValue()).booleanValue() && Build.VERSION.SDK_INT >= 33 && this.f108989b != null && !PermissionsChecker.checkSelfPermissions(getContext(), new String[]{"android.permission.READ_MEDIA_AUDIO"})) {
            PermissionRequestUtils.requestPermissionWithTip(this, getLifecycle(), new String[]{"android.permission.READ_MEDIA_AUDIO"}, 1001, this.f108989b.getString(2131841890));
        }
        List<StorageBean> listA = Q.a(this.f108989b.getApplicationContext());
        ArrayList arrayList = new ArrayList();
        for (StorageBean storageBean : listA) {
            if (storageBean.mounted.equals("mounted")) {
                f.d dVar = new f.d();
                dVar.f27998b = !storageBean.removable;
                dVar.f27999c = new File(storageBean.path);
                arrayList.add(dVar);
            }
        }
        f fVar = this.h;
        if (fVar != null) {
            fVar.f27987j = 0;
            fVar.f27988k = arrayList;
            fVar.f27979a = arrayList;
            fVar.notifyDataSetChanged();
            this.h.f27990m = new X60.f(this);
            int i7 = this.f108989b.f108954x;
        }
        a aVarA = a.a();
        eB0.f fVar2 = new eB0.f(this);
        aVarA.getClass();
        a.a aVarB = a.b(EventAudioChoose.class, fVar2);
        if (EntryPointKt.getMemleakOptEnable()) {
            this.f109006i = aVarB;
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z6) {
        f fVar;
        if (z6 || !isAdded() || (fVar = this.h) == null) {
            return;
        }
        fVar.h = "";
        fVar.f27982d = 0;
        aD0.f.d().a("BgmListLocalDetailSheetFragment setUserVisibleHint");
    }
}
