package com.bilibili.studio.editor.moudle.caption.setting.ui;

import C80.l;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax0.c;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.studio.editor.moudle.caption.setting.presenter.a;
import com.bilibili.studio.editor.moudle.caption.setting.presenter.e;
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionTemplateFragment;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import ex0.n;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/ui/BiliEditorCaptionTemplateListFragment.class */
public final class BiliEditorCaptionTemplateListFragment extends BiliEditorCaptionBaseFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public n f105820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public List<? extends CaptionListItem> f105821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public BiliEditorCaptionTemplateFragment.a f105822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public RecyclerView f105823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public e f105824g;

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131494049, viewGroup, false);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i7, @NotNull String[] strArr, @NotNull int[] iArr) {
        e eVar;
        Iterable<CaptionListItem> iterable;
        super.onRequestPermissionsResult(i7, strArr, iArr);
        PermissionsChecker.onPermissionResult(i7, strArr, iArr);
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (!PermissionsChecker.checkSelfPermissions(context, strArr)) {
            ToastHelper.showToast(context, 2131842439, 0);
            pf();
            return;
        }
        n nVar = this.f105820c;
        if (nVar == null || (iterable = nVar.f54261a) == null) {
            captionListItem = null;
        } else {
            for (CaptionListItem captionListItem : iterable) {
                if (captionListItem.isSelected()) {
                    break;
                }
            }
            captionListItem = null;
        }
        if (captionListItem == null || (eVar = this.f105824g) == null) {
            return;
        }
        eVar.g(this, captionListItem);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        e eVar = a.f105787b.f105788a;
        if (eVar == null) {
            return;
        }
        this.f105824g = eVar;
        c cVar = new c();
        cVar.setHasStableIds(true);
        cVar.f54261a = this.f105821d;
        cVar.f54262b = 2131495057;
        cVar.f54263c = new com.bilibili.emoticon.impl.c(1);
        cVar.f54264d = new l(1, cVar, this);
        this.f105820c = cVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131308035);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 4, 1, false));
        recyclerView.setAdapter(this.f105820c);
        this.f105823f = recyclerView;
    }

    @Override // com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment
    public final void pf() {
        BiliEditorCaptionTemplateFragment.a aVar = this.f105822e;
        if (aVar != null) {
            int i7 = 0;
            for (CaptionListItem captionListItem : BiliEditorCaptionTemplateFragment.f105811j) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                captionListItem.setSelected(i7 == BiliEditorCaptionTemplateFragment.f105812k);
                i7++;
            }
            Iterator<BiliEditorCaptionTemplateListFragment> it = aVar.f105819a.f105817g.iterator();
            while (it.hasNext()) {
                it.next().qf();
            }
        }
    }

    public final void qf() {
        n nVar = this.f105820c;
        if (nVar != null) {
            nVar.notifyDataSetChanged();
        }
    }
}
