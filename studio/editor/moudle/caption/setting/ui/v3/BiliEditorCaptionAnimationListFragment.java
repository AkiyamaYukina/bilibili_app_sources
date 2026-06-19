package com.bilibili.studio.editor.moudle.caption.setting.ui.v3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax0.C4914a;
import ax0.c;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment;
import com.bilibili.studio.editor.moudle.caption.setting.ui.v2.BiliEditorCaptionSettingV2Fragment;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import gx0.d;
import gx0.e;
import gx0.f;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/ui/v3/BiliEditorCaptionAnimationListFragment.class */
public final class BiliEditorCaptionAnimationListFragment extends BiliEditorCaptionBaseFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f105884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ArrayList<CaptionListItem> f105885d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public e f105887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public RecyclerView f105888g;
    public boolean h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f105886e = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final HashSet<String> f105889i = new HashSet<>();

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131501049, viewGroup, false);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        super.onFragmentShow(flag);
        v8();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.jvm.functions.Function3<? super android.view.View, ? super java.lang.Integer, ? super T, kotlin.Unit>] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        v8();
        c cVar = new c();
        cVar.f54262b = 2131501053;
        cVar.f54263c = new Object();
        cVar.f54264d = new d(this, cVar);
        this.f105887f = cVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131310646);
        int iDp2px = 0;
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), this.f105886e, 1, false));
        recyclerView.setAdapter(this.f105887f);
        if (this.h) {
            iDp2px = DensityUtil.dp2px(62.0f);
        }
        recyclerView.addItemDecoration(new C4914a(DensityUtil.dp2px(12.0f), this.f105886e, iDp2px));
        recyclerView.addOnScrollListener(new f(this));
        this.f105888g = recyclerView;
        ArrayList<CaptionListItem> arrayList = this.f105885d;
        if (arrayList != null) {
            rf(this.f105884c, arrayList);
        }
        v8();
    }

    public final void qf() {
        CaptionListItem captionListItem;
        Integer animId;
        RecyclerView recyclerView = this.f105888g;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
            for (int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition < iFindLastVisibleItemPosition + 1; iFindFirstVisibleItemPosition++) {
                ArrayList<CaptionListItem> arrayList = this.f105885d;
                if (arrayList != null && (captionListItem = (CaptionListItem) CollectionsKt.getOrNull(arrayList, iFindFirstVisibleItemPosition)) != null && (animId = captionListItem.getAnimId()) != null) {
                    this.f105889i.add(String.valueOf(animId.intValue()));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void rf(int r5, @org.jetbrains.annotations.NotNull java.util.ArrayList<com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem> r6) {
        /*
            r4 = this;
            r0 = r4
            r1 = r5
            r0.f105884c = r1
            r0 = r4
            r1 = r6
            r0.f105885d = r1
            r0 = r4
            gx0.e r0 = r0.f105887f
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L6f
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r6 = r0
            com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem r0 = new com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setAnimId(r1)
            r0 = r4
            int r0 = r0.f105884c
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L48
            r0 = 1
            r7 = r0
            r0 = r5
            r1 = 1
            if (r0 == r1) goto L48
            r0 = r5
            r1 = 2
            if (r0 == r1) goto L48
            goto L4a
        L48:
            r0 = 0
            r7 = r0
        L4a:
            r0 = r9
            r1 = r7
            r0.setSelected(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r10 = r0
            r0 = r6
            r1 = 0
            r2 = r9
            r0.add(r1, r2)
            r0 = r8
            r1 = r6
            r0.f54261a = r1
            r0 = r4
            gx0.e r0 = r0.f105887f
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L6f
            r0 = r6
            r0.notifyDataSetChanged()
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.caption.setting.ui.v3.BiliEditorCaptionAnimationListFragment.rf(int, java.util.ArrayList):void");
    }

    @Nullable
    public final com.bilibili.studio.editor.moudle.caption.setting.presenter.e v8() {
        Fragment parentFragment;
        Fragment parentFragment2 = getParentFragment();
        if (parentFragment2 == null || (parentFragment = parentFragment2.getParentFragment()) == null || !(parentFragment instanceof BiliEditorCaptionSettingV2Fragment)) {
            return null;
        }
        return null;
    }
}
