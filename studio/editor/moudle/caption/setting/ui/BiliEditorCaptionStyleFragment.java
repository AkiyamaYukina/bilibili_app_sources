package com.bilibili.studio.editor.moudle.caption.setting.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax0.c;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.studio.editor.moudle.caption.setting.presenter.e;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.video.story.action.widget.P;
import ex0.d;
import ex0.f;
import ex0.h;
import ex0.i;
import ex0.j;
import ex0.k;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lB0.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zw0.b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/ui/BiliEditorCaptionStyleFragment.class */
public final class BiliEditorCaptionStyleFragment extends BiliEditorCaptionBaseFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f105801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f105802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f105803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f105804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f105805g;
    public RecyclerView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SeekBar f105806i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SeekBar f105807j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a.a f105808k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public e f105809l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f105810m = true;

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131494046, viewGroup, false);
    }

    @Override // com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        a.a aVar = this.f105808k;
        a.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contract");
            aVar2 = null;
        }
        aVar2.a();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.jvm.functions.Function3<? super android.view.View, ? super java.lang.Integer, ? super T, kotlin.Unit>] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f105809l = com.bilibili.studio.editor.moudle.caption.setting.presenter.a.f105787b.f105788a;
        c cVar = new c();
        cVar.f54262b = 2131495058;
        cVar.f54263c = new Object();
        cVar.f54264d = new d(cVar, this);
        this.f105801c = cVar;
        c cVar2 = new c();
        e eVar = this.f105809l;
        cVar2.f54261a = eVar != null ? eVar.f105798f : null;
        cVar2.f54262b = 2131495055;
        cVar2.f54263c = new com.bilibili.bililive.room.ui.roomv3.settinginteractionpanel.service.h(this, 2);
        cVar2.f54264d = new ex0.e(cVar2, this);
        this.f105802d = cVar2;
        c cVar3 = new c();
        e eVar2 = this.f105809l;
        cVar3.f54261a = eVar2 != null ? eVar2.f105799g : null;
        cVar3.f54262b = 2131495056;
        cVar3.f54263c = new com.bilibili.bililive.room.ui.roomv3.settinginteractionpanel.service.f(this, 2);
        cVar3.f54264d = new P(1, cVar3, this);
        this.f105803e = cVar3;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131310646);
        int i7 = 0;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView.Adapter adapter = this.f105801c;
        RecyclerView.Adapter adapter2 = adapter;
        if (adapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFontAdapter");
            adapter2 = null;
        }
        recyclerView.setAdapter(adapter2);
        this.f105804f = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(2131310616);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView.Adapter adapter3 = this.f105802d;
        RecyclerView.Adapter adapter4 = adapter3;
        if (adapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFontColorAdapter");
            adapter4 = null;
        }
        recyclerView2.setAdapter(adapter4);
        this.f105805g = recyclerView2;
        RecyclerView recyclerView3 = (RecyclerView) view.findViewById(2131310715);
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView.Adapter adapter5 = this.f105803e;
        RecyclerView.Adapter adapter6 = adapter5;
        if (adapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFontOutlineAdapter");
            adapter6 = null;
        }
        recyclerView3.setAdapter(adapter6);
        this.h = recyclerView3;
        view.findViewById(2131318203).setVisibility(8);
        RecyclerView recyclerView4 = this.h;
        RecyclerView recyclerView5 = recyclerView4;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvOutlineColor");
            recyclerView5 = null;
        }
        recyclerView5.setVisibility(8);
        SeekBar seekBar = (SeekBar) view.findViewById(2131301107);
        this.f105806i = seekBar;
        SeekBar seekBar2 = seekBar;
        if (seekBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarCaptionScale");
            seekBar2 = null;
        }
        seekBar2.setOnSeekBarChangeListener(new j(this));
        Lazy lazy = b.f130950a;
        float f7 = DeviceDecision.INSTANCE.getBoolean("uper.enable_cover_editor_caption_scale", true) ? 10.0f : 2.5f;
        SeekBar seekBar3 = this.f105806i;
        SeekBar seekBar4 = seekBar3;
        if (seekBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarCaptionScale");
            seekBar4 = null;
        }
        seekBar4.setMax((int) ((f7 - 0.5f) * 100));
        SeekBar seekBar5 = (SeekBar) view.findViewById(2131308560);
        this.f105807j = seekBar5;
        SeekBar seekBar6 = seekBar5;
        if (seekBar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarOutlineSize");
            seekBar6 = null;
        }
        seekBar6.setOnSeekBarChangeListener(new k(this));
        SeekBar seekBar7 = this.f105807j;
        SeekBar seekBar8 = seekBar7;
        if (seekBar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarOutlineSize");
            seekBar8 = null;
        }
        seekBar8.setMax(25);
        RecyclerView recyclerView6 = this.f105804f;
        if (recyclerView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvFont");
            recyclerView6 = null;
        }
        if (!this.f105810m) {
            i7 = 8;
        }
        recyclerView6.setVisibility(i7);
        a aVarA = a.a();
        ex0.b bVar = new ex0.b(this);
        aVarA.getClass();
        this.f105808k = a.b(cx0.a.class, bVar);
    }

    public final void qf(cx0.a aVar) {
        Integer num = aVar.a;
        c cVar = this.f105801c;
        c cVar2 = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFontAdapter");
            cVar2 = null;
        }
        RecyclerView recyclerView = this.f105804f;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvFont");
            recyclerView2 = null;
        }
        tf(num, cVar2, recyclerView2);
        Integer num2 = aVar.b;
        c cVar3 = this.f105802d;
        c cVar4 = cVar3;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFontColorAdapter");
            cVar4 = null;
        }
        RecyclerView recyclerView3 = this.f105805g;
        RecyclerView recyclerView4 = recyclerView3;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvFontColor");
            recyclerView4 = null;
        }
        tf(num2, cVar4, recyclerView4);
        rf(aVar.c);
        Integer num3 = aVar.d;
        c cVar5 = this.f105803e;
        c cVar6 = cVar5;
        if (cVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFontOutlineAdapter");
            cVar6 = null;
        }
        RecyclerView recyclerView5 = this.h;
        if (recyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvOutlineColor");
            recyclerView5 = null;
        }
        tf(num3, cVar6, recyclerView5);
        sf(aVar.e);
    }

    public final void rf(@Nullable Float f7) {
        if (isAdded() && !isDetached()) {
            if (f7 == null) {
                SeekBar seekBar = this.f105806i;
                if (seekBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSeekBarCaptionScale");
                    seekBar = null;
                }
                seekBar.setProgress(0);
                return;
            }
            SeekBar seekBar2 = this.f105806i;
            if (seekBar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSeekBarCaptionScale");
                seekBar2 = null;
            }
            seekBar2.setProgress((int) ((f7.floatValue() - 0.5f) * 100));
        }
    }

    public final void sf(@Nullable Integer num) {
        if (num != null) {
            c cVar = this.f105803e;
            c cVar2 = cVar;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFontOutlineAdapter");
                cVar2 = null;
            }
            if (!V.e(cVar2.f54261a)) {
                c cVar3 = this.f105803e;
                c cVar4 = cVar3;
                if (cVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFontOutlineAdapter");
                    cVar4 = null;
                }
                if (!((CaptionListItem) cVar4.f54261a.get(0)).isSelected()) {
                    SeekBar seekBar = this.f105807j;
                    SeekBar seekBar2 = seekBar;
                    if (seekBar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSeekBarOutlineSize");
                        seekBar2 = null;
                    }
                    seekBar2.setEnabled(true);
                    SeekBar seekBar3 = this.f105807j;
                    SeekBar seekBar4 = seekBar3;
                    if (seekBar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSeekBarOutlineSize");
                        seekBar4 = null;
                    }
                    seekBar4.setProgress(num.intValue());
                    SeekBar seekBar5 = this.f105807j;
                    if (seekBar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSeekBarOutlineSize");
                        seekBar5 = null;
                    }
                    seekBar5.setAlpha(1.0f);
                    return;
                }
            }
        }
        SeekBar seekBar6 = this.f105807j;
        SeekBar seekBar7 = seekBar6;
        if (seekBar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarOutlineSize");
            seekBar7 = null;
        }
        seekBar7.setProgress(0);
        SeekBar seekBar8 = this.f105807j;
        SeekBar seekBar9 = seekBar8;
        if (seekBar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarOutlineSize");
            seekBar9 = null;
        }
        seekBar9.setEnabled(false);
        SeekBar seekBar10 = this.f105807j;
        if (seekBar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarOutlineSize");
            seekBar10 = null;
        }
        seekBar10.setAlpha(0.5f);
    }

    public final void tf(Integer num, c<CaptionListItem> cVar, RecyclerView recyclerView) {
        int i7;
        CaptionListItem captionListItem;
        List<? extends CaptionListItem> list;
        c cVar2 = this.f105803e;
        c cVar3 = cVar2;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFontOutlineAdapter");
            cVar3 = null;
        }
        if (V.e(cVar3.f54261a)) {
            return;
        }
        List<? extends CaptionListItem> list2 = cVar.f54261a;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            int i8 = 0;
            int i9 = 0;
            CaptionListItem captionListItem2 = null;
            while (true) {
                captionListItem = captionListItem2;
                i7 = i9;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                CaptionListItem captionListItem3 = (CaptionListItem) next;
                captionListItem3.setSelected(false);
                int id = captionListItem3.getId();
                if (num != null && id == num.intValue()) {
                    captionListItem3.setSelected(true);
                    i9 = i8;
                    captionListItem2 = captionListItem3;
                }
                i8++;
            }
        } else {
            i7 = 0;
            captionListItem = null;
        }
        if (num != null && captionListItem == null && (list = cVar.f54261a) != null && (!list.isEmpty())) {
            cVar.f54261a.get(0).setSelected(true);
        }
        cVar.notifyDataSetChanged();
        recyclerView.scrollToPosition(i7);
    }
}
