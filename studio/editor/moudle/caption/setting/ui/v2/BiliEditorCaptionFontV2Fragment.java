package com.bilibili.studio.editor.moudle.caption.setting.ui.v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax0.C4914a;
import com.bilibili.ogv.kmm.operation.banner.D;
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.studio.videoeditor.util.V;
import fx0.b;
import fx0.c;
import fx0.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import lB0.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/ui/v2/BiliEditorCaptionFontV2Fragment.class */
public final class BiliEditorCaptionFontV2Fragment extends BiliEditorCaptionBaseFragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public c f105826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public RecyclerView f105827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public a.a f105828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f105829g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f105830i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f105825c = 3;

    @NotNull
    public final HashSet<String> h = new HashSet<>();

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131494045, viewGroup, false);
    }

    @Override // com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        a.a aVar = this.f105828f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        ax0.c cVar = new ax0.c();
        cVar.f54262b = 2131495059;
        cVar.f54263c = new D(1);
        cVar.f54264d = new b(cVar, this);
        this.f105826d = cVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131310646);
        int iDp2px = 0;
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), this.f105825c, 1, false));
        recyclerView.setAdapter(this.f105826d);
        if (this.f105829g) {
            iDp2px = DensityUtil.dp2px(62.0f);
        }
        recyclerView.addItemDecoration(new C4914a(DensityUtil.dp2px(12.0f), this.f105825c, iDp2px));
        recyclerView.addOnScrollListener(new e(this));
        this.f105827e = recyclerView;
        a aVarA = a.a();
        fx0.a aVar = new fx0.a(this);
        aVarA.getClass();
        this.f105828f = a.b(cx0.a.class, aVar);
    }

    public final void qf() {
        List<? extends T> list;
        CaptionListItem captionListItem;
        RecyclerView recyclerView = this.f105827e;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
            for (int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition < iFindLastVisibleItemPosition + 1; iFindFirstVisibleItemPosition++) {
                c cVar = this.f105826d;
                if (cVar != null && (list = cVar.f54261a) != 0 && (captionListItem = (CaptionListItem) CollectionsKt.getOrNull(list, iFindFirstVisibleItemPosition)) != null) {
                    this.h.add(String.valueOf(captionListItem.getId()));
                }
            }
        }
    }

    public final void rf(Integer num, c cVar, RecyclerView recyclerView) {
        int i7;
        CaptionListItem captionListItem;
        if (cVar == null || recyclerView == null || V.e(cVar.f54261a)) {
            return;
        }
        Iterable iterable = cVar.f54261a;
        CaptionListItem captionListItem2 = null;
        CaptionListItem captionListItem3 = null;
        if (iterable != null) {
            Iterator it = iterable.iterator();
            int i8 = 0;
            int i9 = 0;
            while (true) {
                captionListItem2 = captionListItem3;
                i7 = i9;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                CaptionListItem captionListItem4 = (CaptionListItem) next;
                captionListItem4.setSelected(false);
                int id = captionListItem4.getId();
                if (num != null && id == num.intValue()) {
                    captionListItem4.setSelected(true);
                    i9 = i8;
                    captionListItem3 = captionListItem4;
                }
                i8++;
            }
        } else {
            i7 = 0;
        }
        Object obj = captionListItem2;
        if (captionListItem2 == null) {
            obj = captionListItem2;
            if (cVar.f54261a != null) {
                obj = captionListItem2;
                if (!r0.isEmpty()) {
                    Object obj2 = cVar.f54261a.get(0);
                    CaptionListItem captionListItem5 = (CaptionListItem) obj2;
                    captionListItem5.setSelected(true);
                    obj = obj2;
                    if (this.f105830i) {
                        captionListItem5.setSelected(false);
                        obj = obj2;
                    }
                }
            }
        }
        if (this.f105830i && (captionListItem = (CaptionListItem) obj) != null) {
            captionListItem.setSelected(false);
        }
        cVar.notifyDataSetChanged();
        recyclerView.scrollToPosition(i7);
    }
}
