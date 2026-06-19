package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax0.C4914a;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.C6560n;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import lB0.a;
import lB0.a$b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/BiliEditorCaptionFontV4Fragment.class */
@AndroidEntryPoint
public final class BiliEditorCaptionFontV4Fragment extends Hilt_BiliEditorCaptionFontV4Fragment {
    public final int h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public C6541s f106488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public RecyclerView f106489j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public a.a f106490k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f106491l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f106492m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final HashSet<String> f106493n;

    public BiliEditorCaptionFontV4Fragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionFontV4Fragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m9954invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionFontV4Fragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m9955invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f106492m = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C6560n.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionFontV4Fragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m9956invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionFontV4Fragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m9957invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionFontV4Fragment$special$$inlined$viewModels$default$4.m9957invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionFontV4Fragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m9958invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionFontV4Fragment$special$$inlined$viewModels$default$5.m9958invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f106493n = new HashSet<>();
    }

    public static void sf(Integer num, C6541s c6541s, RecyclerView recyclerView) {
        int i7;
        Collection collection;
        if (num == null || c6541s == null || recyclerView == null || com.bilibili.studio.videoeditor.util.V.e(c6541s.f54261a)) {
            return;
        }
        Iterable iterable = c6541s.f54261a;
        CaptionListItem captionListItem = null;
        CaptionListItem captionListItem2 = null;
        if (iterable != null) {
            Iterator it = iterable.iterator();
            int i8 = 0;
            int i9 = 0;
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
                if (captionListItem3.getId() == num.intValue()) {
                    captionListItem3.setSelected(true);
                    i9 = i8;
                    captionListItem2 = captionListItem3;
                }
                i8++;
            }
        } else {
            i7 = 0;
        }
        if (captionListItem == null && (collection = c6541s.f54261a) != null && (!collection.isEmpty())) {
            ((CaptionListItem) c6541s.f54261a.get(0)).setSelected(true);
        }
        c6541s.notifyDataSetChanged();
        recyclerView.scrollToPosition(i7);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131502037, viewGroup, false);
    }

    @Override // com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        a.a aVar = this.f106490k;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ax0.c, com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.jvm.functions.Function3<? super android.view.View, ? super java.lang.Integer, ? super T, kotlin.Unit>] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        ?? cVar = new ax0.c();
        cVar.f54262b = 2131502048;
        cVar.f54263c = new Object();
        cVar.f54264d = new com.bilibili.ogv.bdesign.tab.l(1, cVar, this);
        this.f106488i = cVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131310646);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), this.h, 1, false));
        recyclerView.setAdapter(this.f106488i);
        recyclerView.addItemDecoration(new C4914a(0, this.h, this.f106491l ? DensityUtil.dp2px(62.0f) : 0));
        recyclerView.addOnScrollListener(new C6543u(this));
        this.f106489j = recyclerView;
        lB0.a aVarA = lB0.a.a();
        a$b a_b = new a$b(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorCaptionFontV4Fragment f106628a;

            {
                this.f106628a = this;
            }

            @Override // lB0.a$b
            public final void onBusEvent(Object obj) {
                BiliEditorCaptionFontV4Fragment biliEditorCaptionFontV4Fragment = this.f106628a;
                biliEditorCaptionFontV4Fragment.getClass();
                BiliEditorCaptionFontV4Fragment.sf(((cx0.a) obj).a, biliEditorCaptionFontV4Fragment.f106488i, biliEditorCaptionFontV4Fragment.f106489j);
            }
        };
        aVarA.getClass();
        this.f106490k = lB0.a.b(cx0.a.class, a_b);
    }

    public final void rf() {
        List<? extends T> list;
        CaptionListItem captionListItem;
        RecyclerView recyclerView = this.f106489j;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
            for (int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition < iFindLastVisibleItemPosition + 1; iFindFirstVisibleItemPosition++) {
                C6541s c6541s = this.f106488i;
                if (c6541s != null && (list = c6541s.f54261a) != 0 && (captionListItem = (CaptionListItem) CollectionsKt.getOrNull(list, iFindFirstVisibleItemPosition)) != null) {
                    this.f106493n.add(String.valueOf(captionListItem.getId()));
                }
            }
        }
    }
}
