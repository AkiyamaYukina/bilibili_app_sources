package com.bilibili.studio.editor.moudle.caption.setting.ui.v3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax0.C4914a;
import ax0.c;
import com.bilibili.studio.editor.moudle.caption.setting.presenter.e;
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.studio.videoeditor.util.V;
import dx0.InterfaceC6891b;
import gx0.g;
import gx0.h;
import gx0.i;
import gx0.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/ui/v3/BiliEditorCaptionFlowerFragment.class */
public final class BiliEditorCaptionFlowerFragment extends BiliEditorCaptionBaseFragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public i f105891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public RecyclerView f105892e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f105894g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f105890c = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final HashSet<String> f105893f = new HashSet<>();

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131501050, viewGroup, false);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        c cVar = new c();
        cVar.f54262b = 2131501054;
        cVar.f54263c = new g(this);
        cVar.f54264d = new h(cVar, this);
        this.f105891d = cVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131310646);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), this.f105890c, 1, false));
        recyclerView.setAdapter(this.f105891d);
        recyclerView.addItemDecoration(new C4914a(DensityUtil.dp2px(12.0f), this.f105890c, 0));
        recyclerView.addOnScrollListener(new k(this));
        this.f105892e = recyclerView;
    }

    public final void qf() {
        List<? extends T> list;
        CaptionListItem captionListItem;
        RecyclerView recyclerView = this.f105892e;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
            for (int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition < iFindLastVisibleItemPosition + 1; iFindFirstVisibleItemPosition++) {
                i iVar = this.f105891d;
                if (iVar != null && (list = iVar.f54261a) != 0 && (captionListItem = (CaptionListItem) CollectionsKt.getOrNull(list, iFindFirstVisibleItemPosition)) != null) {
                    this.f105893f.add(String.valueOf(captionListItem.getId()));
                }
            }
        }
    }

    public final void rf(@NotNull ArrayList<CaptionListItem> arrayList) {
        i iVar = this.f105891d;
        if (iVar != null) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            CaptionListItem captionListItem = new CaptionListItem();
            captionListItem.setId(-1);
            captionListItem.setSelected(true);
            Unit unit = Unit.INSTANCE;
            arrayList2.add(0, captionListItem);
            iVar.f54261a = arrayList2;
            i iVar2 = this.f105891d;
            if (iVar2 != null) {
                iVar2.notifyDataSetChanged();
            }
        }
    }

    public final void sf(int i7) {
        CaptionListItem captionListItem;
        int i8;
        Object obj;
        CaptionListItem captionListItem2;
        Collection collection;
        i iVar = this.f105891d;
        RecyclerView recyclerView = this.f105892e;
        if (iVar == null || recyclerView == null || V.e(iVar.f54261a)) {
            return;
        }
        Iterable iterable = iVar.f54261a;
        if (iterable != null) {
            Iterator it = iterable.iterator();
            CaptionListItem captionListItem3 = null;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                captionListItem = captionListItem3;
                i8 = i10;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (i9 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                CaptionListItem captionListItem4 = (CaptionListItem) next;
                captionListItem4.setSelected(false);
                if (captionListItem4.getId() == i7) {
                    captionListItem4.setSelected(true);
                    i10 = i9;
                    captionListItem3 = captionListItem4;
                }
                i9++;
            }
        } else {
            captionListItem = null;
            i8 = 0;
        }
        if (captionListItem == null && (collection = iVar.f54261a) != null && (!collection.isEmpty())) {
            obj = iVar.f54261a.get(0);
            ((CaptionListItem) obj).setSelected(true);
            if (this.f105894g) {
                obj = null;
            }
        } else {
            obj = captionListItem;
        }
        if (this.f105894g && (captionListItem2 = (CaptionListItem) obj) != null) {
            captionListItem2.setSelected(false);
        }
        iVar.notifyDataSetChanged();
        recyclerView.scrollToPosition(i8);
    }

    @Nullable
    public final e v8() {
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment == null || !(parentFragment instanceof InterfaceC6891b)) {
            return null;
        }
        return ((InterfaceC6891b) parentFragment).v8();
    }
}
