package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.studio.editor.moudle.caption.setting.widget.FontColorView;
import com.bilibili.studio.editor.moudle.caption.setting.widget.OutlineColorView;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import lB0.a;
import lB0.a$b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/BiliEditorCaptionStyleV4Fragment.class */
@AndroidEntryPoint
public final class BiliEditorCaptionStyleV4Fragment extends Hilt_BiliEditorCaptionStyleV4Fragment {
    public K h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public L f106530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView f106531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RecyclerView f106532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SeekBar f106533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SeekBar f106534m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a.a f106535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f106536o;

    public BiliEditorCaptionStyleV4Fragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionStyleV4Fragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m9964invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionStyleV4Fragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m9965invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f106536o = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.x.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionStyleV4Fragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m9966invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionStyleV4Fragment$special$$inlined$viewModels$default$4
            final Function0 $extrasProducer;
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function02;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m9967invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.jvm.functions.Function0 r0 = r0.$extrasProducer
                    r3 = r0
                    r0 = r3
                    if (r0 == 0) goto L19
                    r0 = r3
                    java.lang.Object r0 = r0.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L44
                L19:
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L30
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L32
                L30:
                    r0 = 0
                    r3 = r0
                L32:
                    r0 = r3
                    if (r0 == 0) goto L40
                    r0 = r3
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                    goto L44
                L40:
                    androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
                    r3 = r0
                L44:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionStyleV4Fragment$special$$inlined$viewModels$default$4.m9967invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionStyleV4Fragment$special$$inlined$viewModels$default$5
            final Lazy $owner$delegate;
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.ViewModelProvider.Factory m9968invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L17
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L19
                L17:
                    r0 = 0
                    r3 = r0
                L19:
                    r0 = r3
                    if (r0 == 0) goto L2a
                    r0 = r3
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L32
                L2a:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_viewModels
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r3 = r0
                L32:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionStyleV4Fragment$special$$inlined$viewModels$default$5.m9968invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
    }

    public static void uf(int i7, ax0.c cVar, RecyclerView recyclerView) {
        int i8;
        Collection collection;
        if (com.bilibili.studio.videoeditor.util.V.e(cVar.f54261a)) {
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
        a.a aVar = this.f106535n;
        a.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contract");
            aVar2 = null;
        }
        aVar2.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ax0.c, com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.K] */
    /* JADX WARN: Type inference failed for: r0v7, types: [ax0.c, com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.L, java.lang.Object] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        final ?? cVar = new ax0.c();
        cVar.f54261a = (List) rf().f106747d.f17489d.getValue();
        cVar.f54262b = 2131495055;
        cVar.f54263c = new Function3(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.H

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorCaptionStyleV4Fragment f106557a;

            {
                this.f106557a = this;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ((Integer) obj2).intValue();
                CaptionListItem captionListItem = (CaptionListItem) obj3;
                FontColorView fontColorView = (FontColorView) ((View) obj).findViewById(2131301894);
                fontColorView.setVisibility(0);
                fontColorView.setColor(captionListItem.getFontColor().intValue());
                fontColorView.setIsSelectView(captionListItem.isSelected());
                Context context = this.f106557a.getContext();
                if (context != null) {
                    Integer fontColor = captionListItem.getFontColor();
                    int color = ContextCompat.getColor(context, 2131104215);
                    if (fontColor != null && fontColor.intValue() == color) {
                        fontColorView.setMiddleCircleColor(ContextCompat.getColor(context, 2131104216));
                    } else {
                        fontColorView.setMiddleCircleColor(ContextCompat.getColor(context, 2131104222));
                    }
                }
                return Unit.INSTANCE;
            }
        };
        cVar.f54264d = new Function2(cVar, this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.I

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final K f106598a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliEditorCaptionStyleV4Fragment f106599b;

            {
                this.f106598a = cVar;
                this.f106599b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                CaptionListItem captionListItem = (CaptionListItem) obj2;
                K k7 = this.f106598a;
                for (CaptionListItem captionListItem2 : k7.f54261a) {
                    captionListItem2.setSelected(Intrinsics.areEqual(captionListItem2, captionListItem));
                }
                com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.x xVarRf = this.f106599b.rf();
                xVarRf.getClass();
                xVarRf.f106746c.m(captionListItem.getFontColor(), true, captionListItem.getId());
                k7.notifyDataSetChanged();
                return Unit.INSTANCE;
            }
        };
        this.h = cVar;
        ?? cVar2 = new ax0.c();
        cVar2.f54261a = (List) rf().f106747d.f17490e.getValue();
        cVar2.f54262b = 2131495056;
        cVar2.f54263c = new Function3(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.J

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorCaptionStyleV4Fragment f106600a;

            {
                this.f106600a = this;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                View view2 = (View) obj;
                ((Integer) obj2).intValue();
                CaptionListItem captionListItem = (CaptionListItem) obj3;
                OutlineColorView outlineColorView = (OutlineColorView) view2.findViewById(2131308559);
                ImageView imageView = (ImageView) view2.findViewById(2131302766);
                outlineColorView.setVisibility(0);
                outlineColorView.setColor(captionListItem.getFontColor().intValue());
                outlineColorView.setIsSelectView(captionListItem.isSelected());
                imageView.setVisibility(8);
                Integer fontColor = captionListItem.getFontColor();
                if (fontColor != null && fontColor.intValue() == 17) {
                    imageView.setVisibility(0);
                    Context context = this.f106600a.getContext();
                    if (context != null) {
                        if (captionListItem.isSelected()) {
                            outlineColorView.setColor(ContextCompat.getColor(context, 2131102728));
                        } else {
                            outlineColorView.setColor(ContextCompat.getColor(context, 2131104281));
                        }
                    }
                    outlineColorView.setIsSelectView(captionListItem.isSelected());
                }
                return Unit.INSTANCE;
            }
        };
        cVar2.f54264d = new RR.d(2, (Object) cVar2, this);
        this.f106530i = cVar2;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131310616);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        K k7 = this.h;
        K k8 = k7;
        if (k7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFontColorAdapter");
            k8 = null;
        }
        recyclerView.setAdapter(k8);
        this.f106531j = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(2131310715);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        L l7 = this.f106530i;
        L l8 = l7;
        if (l7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFontOutlineAdapter");
            l8 = null;
        }
        recyclerView2.setAdapter(l8);
        this.f106532k = recyclerView2;
        view.findViewById(2131318203).setVisibility(8);
        RecyclerView recyclerView3 = this.f106532k;
        RecyclerView recyclerView4 = recyclerView3;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvOutlineColor");
            recyclerView4 = null;
        }
        recyclerView4.setVisibility(8);
        SeekBar seekBar = (SeekBar) view.findViewById(2131301107);
        this.f106533l = seekBar;
        SeekBar seekBar2 = seekBar;
        if (seekBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarCaptionScale");
            seekBar2 = null;
        }
        seekBar2.setOnSeekBarChangeListener(new M(this));
        Lazy lazy = zw0.b.f130950a;
        float f7 = DeviceDecision.INSTANCE.getBoolean("uper.enable_new_editor_caption_scale", true) ? 10.0f : 2.5f;
        SeekBar seekBar3 = this.f106533l;
        SeekBar seekBar4 = seekBar3;
        if (seekBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarCaptionScale");
            seekBar4 = null;
        }
        seekBar4.setMax((int) ((f7 - 0.5f) * 100));
        SeekBar seekBar5 = (SeekBar) view.findViewById(2131308560);
        this.f106534m = seekBar5;
        SeekBar seekBar6 = seekBar5;
        if (seekBar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarOutlineSize");
            seekBar6 = null;
        }
        seekBar6.setOnSeekBarChangeListener(new N(this));
        SeekBar seekBar7 = this.f106534m;
        if (seekBar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarOutlineSize");
            seekBar7 = null;
        }
        seekBar7.setMax(25);
        lB0.a aVarA = lB0.a.a();
        a$b a_b = new a$b(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.G

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorCaptionStyleV4Fragment f106556a;

            {
                this.f106556a = this;
            }

            @Override // lB0.a$b
            public final void onBusEvent(Object obj) {
                cx0.a aVar = (cx0.a) obj;
                BiliEditorCaptionStyleV4Fragment biliEditorCaptionStyleV4Fragment = this.f106556a;
                biliEditorCaptionStyleV4Fragment.getClass();
                Integer num = aVar.b;
                if (num != null) {
                    int iIntValue = num.intValue();
                    K k9 = biliEditorCaptionStyleV4Fragment.h;
                    K k10 = k9;
                    if (k9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mFontColorAdapter");
                        k10 = null;
                    }
                    RecyclerView recyclerView5 = biliEditorCaptionStyleV4Fragment.f106531j;
                    RecyclerView recyclerView6 = recyclerView5;
                    if (recyclerView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mRvFontColor");
                        recyclerView6 = null;
                    }
                    BiliEditorCaptionStyleV4Fragment.uf(iIntValue, k10, recyclerView6);
                }
                Float f8 = aVar.c;
                if (f8 != null) {
                    biliEditorCaptionStyleV4Fragment.sf(f8.floatValue());
                }
                Integer num2 = aVar.d;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    L l9 = biliEditorCaptionStyleV4Fragment.f106530i;
                    L l10 = l9;
                    if (l9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mFontOutlineAdapter");
                        l10 = null;
                    }
                    RecyclerView recyclerView7 = biliEditorCaptionStyleV4Fragment.f106532k;
                    if (recyclerView7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mRvOutlineColor");
                        recyclerView7 = null;
                    }
                    BiliEditorCaptionStyleV4Fragment.uf(iIntValue2, l10, recyclerView7);
                }
                Integer num3 = aVar.e;
                if (num3 != null) {
                    biliEditorCaptionStyleV4Fragment.tf(num3.intValue());
                }
            }
        };
        aVarA.getClass();
        this.f106535n = lB0.a.b(cx0.a.class, a_b);
    }

    public final com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.x rf() {
        return (com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.x) this.f106536o.getValue();
    }

    public final void sf(float f7) {
        if (isAdded() && !isDetached()) {
            SeekBar seekBar = this.f106533l;
            SeekBar seekBar2 = seekBar;
            if (seekBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSeekBarCaptionScale");
                seekBar2 = null;
            }
            seekBar2.setProgress((int) ((f7 - 0.5f) * 100));
        }
    }

    public final void tf(int i7) {
        L l7 = this.f106530i;
        L l8 = l7;
        if (l7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFontOutlineAdapter");
            l8 = null;
        }
        if (!com.bilibili.studio.videoeditor.util.V.e(l8.f54261a)) {
            L l9 = this.f106530i;
            L l10 = l9;
            if (l9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFontOutlineAdapter");
                l10 = null;
            }
            if (!((CaptionListItem) l10.f54261a.get(0)).isSelected()) {
                SeekBar seekBar = this.f106534m;
                SeekBar seekBar2 = seekBar;
                if (seekBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSeekBarOutlineSize");
                    seekBar2 = null;
                }
                seekBar2.setEnabled(true);
                SeekBar seekBar3 = this.f106534m;
                SeekBar seekBar4 = seekBar3;
                if (seekBar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSeekBarOutlineSize");
                    seekBar4 = null;
                }
                seekBar4.setProgress(i7);
                SeekBar seekBar5 = this.f106534m;
                if (seekBar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSeekBarOutlineSize");
                    seekBar5 = null;
                }
                seekBar5.setAlpha(1.0f);
                return;
            }
        }
        SeekBar seekBar6 = this.f106534m;
        SeekBar seekBar7 = seekBar6;
        if (seekBar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarOutlineSize");
            seekBar7 = null;
        }
        seekBar7.setProgress(0);
        SeekBar seekBar8 = this.f106534m;
        SeekBar seekBar9 = seekBar8;
        if (seekBar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarOutlineSize");
            seekBar9 = null;
        }
        seekBar9.setEnabled(false);
        SeekBar seekBar10 = this.f106534m;
        if (seekBar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarOutlineSize");
            seekBar10 = null;
        }
        seekBar10.setAlpha(0.5f);
    }
}
