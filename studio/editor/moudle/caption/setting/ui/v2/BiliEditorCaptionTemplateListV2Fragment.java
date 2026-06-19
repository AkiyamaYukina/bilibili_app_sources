package com.bilibili.studio.editor.moudle.caption.setting.ui.v2;

import Wq.d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax0.C4914a;
import ax0.c;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.studio.editor.moudle.caption.setting.presenter.e;
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment;
import com.bilibili.studio.editor.moudle.caption.setting.ui.v2.BiliEditorCaptionTemplateV2Fragment;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.mall.ui.page.home.view.S1;
import dx0.InterfaceC6891b;
import fx0.v;
import fx0.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/ui/v2/BiliEditorCaptionTemplateListV2Fragment.class */
public final class BiliEditorCaptionTemplateListV2Fragment extends BiliEditorCaptionBaseFragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public v f105865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public List<? extends CaptionListItem> f105866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f105867f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f105864c = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final HashSet<String> f105868g = new HashSet<>();

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131494049, viewGroup, false);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i7, @NotNull String[] strArr, @NotNull int[] iArr) {
        e eVarQf;
        Iterable<CaptionListItem> iterable;
        super.onRequestPermissionsResult(i7, strArr, iArr);
        PermissionsChecker.onPermissionResult(i7, strArr, iArr);
        if (!PermissionsChecker.checkSelfPermissions(getContext(), strArr)) {
            ToastHelper.showToast(getContext(), 2131842439, 0);
            pf();
            return;
        }
        v vVar = this.f105865d;
        if (vVar == null || (iterable = vVar.f54261a) == null) {
            captionListItem = null;
        } else {
            for (CaptionListItem captionListItem : iterable) {
                if (captionListItem.isSelected()) {
                    break;
                }
            }
            captionListItem = null;
        }
        if (captionListItem == null || (eVarQf = qf()) == null) {
            return;
        }
        eVarQf.g(this, captionListItem);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (qf() == null) {
            return;
        }
        c cVar = new c();
        cVar.setHasStableIds(true);
        cVar.f54261a = this.f105866e;
        cVar.f54262b = 2131495057;
        cVar.f54263c = new d(1);
        cVar.f54264d = new S1(1, cVar, this);
        this.f105865d = cVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131308035);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), this.f105864c, 1, false));
        recyclerView.setAdapter(this.f105865d);
        recyclerView.addItemDecoration(new C4914a(0, this.f105864c, this.f105867f ? DensityUtil.dp2px(62.0f) : 0));
        recyclerView.addOnScrollListener(new w(this));
    }

    @Override // com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment
    public final void pf() {
        Fragment parentFragment = getParentFragment();
        BiliEditorCaptionTemplateV2Fragment.a aVar = (parentFragment == null || !(parentFragment instanceof BiliEditorCaptionTemplateV2Fragment)) ? null : ((BiliEditorCaptionTemplateV2Fragment) parentFragment).h;
        if (aVar != null) {
            aVar.getClass();
            ArrayList<CaptionListItem> arrayList = BiliEditorCaptionTemplateV2Fragment.f105869i;
            int i7 = 0;
            for (Object obj : BiliEditorCaptionTemplateV2Fragment.f105869i) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                CaptionListItem captionListItem = (CaptionListItem) obj;
                ArrayList<CaptionListItem> arrayList2 = BiliEditorCaptionTemplateV2Fragment.f105869i;
                captionListItem.setSelected(i7 == BiliEditorCaptionTemplateV2Fragment.f105870j);
                i7++;
            }
            Iterator<T> it = aVar.f105876a.f105875g.iterator();
            while (it.hasNext()) {
                ((BiliEditorCaptionTemplateListV2Fragment) it.next()).rf();
            }
        }
    }

    public final e qf() {
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment == null || !(parentFragment instanceof InterfaceC6891b)) {
            return null;
        }
        return ((InterfaceC6891b) parentFragment).v8();
    }

    public final void rf() {
        v vVar = this.f105865d;
        if (vVar != null) {
            vVar.notifyDataSetChanged();
        }
    }
}
