package com.bilibili.studio.editor.moudle.caption.setting.ui.v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.activity.result.ActivityResultCaller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax0.c;
import com.bilibili.studio.editor.moudle.caption.setting.presenter.e;
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.videoeditor.util.V;
import dx0.InterfaceC6891b;
import fx0.l;
import fx0.m;
import fx0.n;
import fx0.o;
import fx0.p;
import fx0.q;
import fx0.r;
import fx0.s;
import fx0.t;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lB0.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/ui/v2/BiliEditorCaptionStyleV2Fragment.class */
public final class BiliEditorCaptionStyleV2Fragment extends BiliEditorCaptionBaseFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f105858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f105859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RecyclerView f105860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f105861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SeekBar f105862g;
    public SeekBar h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a.a f105863i;

    public static void qf(int i7, c cVar, RecyclerView recyclerView) {
        int i8;
        Collection collection;
        if (V.e(cVar.f54261a)) {
            return;
        }
        Iterable iterable = cVar.f54261a;
        CaptionListItem captionListItem = null;
        CaptionListItem captionListItem2 = null;
        if (iterable != null) {
            Iterator it = iterable.iterator();
            int i9 = 0;
            int i10 = 0;
            while (true) {
                captionListItem = captionListItem2;
                i8 = i10;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (i9 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                CaptionListItem captionListItem3 = (CaptionListItem) next;
                captionListItem3.setSelected(false);
                if (captionListItem3.getId() == i7) {
                    captionListItem3.setSelected(true);
                    i10 = i9;
                    captionListItem2 = captionListItem3;
                }
                i9++;
            }
        } else {
            i8 = 0;
        }
        if (captionListItem == null && (collection = cVar.f54261a) != null && (!collection.isEmpty())) {
            ((CaptionListItem) cVar.f54261a.get(0)).setSelected(true);
        }
        cVar.notifyDataSetChanged();
        recyclerView.scrollToPosition(i8);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131494047, viewGroup, false);
    }

    @Override // com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        a.a aVar = this.f105863i;
        a.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contract");
            aVar2 = null;
        }
        aVar2.a();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        c cVar = new c();
        e eVarV8 = v8();
        cVar.f54261a = eVarV8 != null ? eVarV8.f105798f : null;
        cVar.f54262b = 2131495055;
        cVar.f54263c = new m(this, 0);
        cVar.f54264d = new n(cVar, this);
        this.f105858c = cVar;
        c cVar2 = new c();
        e eVarV82 = v8();
        cVar2.f54261a = eVarV82 != null ? eVarV82.f105799g : null;
        cVar2.f54262b = 2131495056;
        cVar2.f54263c = new o(this, 0);
        cVar2.f54264d = new p(cVar2, this);
        this.f105859d = cVar2;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131310616);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView.Adapter adapter = this.f105858c;
        RecyclerView.Adapter adapter2 = adapter;
        if (adapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFontColorAdapter");
            adapter2 = null;
        }
        recyclerView.setAdapter(adapter2);
        this.f105860e = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(2131310715);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView.Adapter adapter3 = this.f105859d;
        RecyclerView.Adapter adapter4 = adapter3;
        if (adapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFontOutlineAdapter");
            adapter4 = null;
        }
        recyclerView2.setAdapter(adapter4);
        this.f105861f = recyclerView2;
        view.findViewById(2131318203).setVisibility(8);
        RecyclerView recyclerView3 = this.f105861f;
        RecyclerView recyclerView4 = recyclerView3;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvOutlineColor");
            recyclerView4 = null;
        }
        recyclerView4.setVisibility(8);
        SeekBar seekBar = (SeekBar) view.findViewById(2131301107);
        this.f105862g = seekBar;
        SeekBar seekBar2 = seekBar;
        if (seekBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarCaptionScale");
            seekBar2 = null;
        }
        seekBar2.setOnSeekBarChangeListener(new s(this));
        SeekBar seekBar3 = this.f105862g;
        SeekBar seekBar4 = seekBar3;
        if (seekBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarCaptionScale");
            seekBar4 = null;
        }
        seekBar4.setMax(200);
        SeekBar seekBar5 = (SeekBar) view.findViewById(2131308560);
        this.h = seekBar5;
        SeekBar seekBar6 = seekBar5;
        if (seekBar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarOutlineSize");
            seekBar6 = null;
        }
        seekBar6.setOnSeekBarChangeListener(new t(this));
        SeekBar seekBar7 = this.h;
        if (seekBar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarOutlineSize");
            seekBar7 = null;
        }
        seekBar7.setMax(25);
        a aVarA = a.a();
        l lVar = new l(this);
        aVarA.getClass();
        this.f105863i = a.b(cx0.a.class, lVar);
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
