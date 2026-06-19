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
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.C6557k;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.HashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/BiliEditorCaptionFlowerV4Fragment.class */
@AndroidEntryPoint
public final class BiliEditorCaptionFlowerV4Fragment extends Hilt_BiliEditorCaptionFlowerV4Fragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public C6537n f106484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public RecyclerView f106485j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f106487l;
    public final int h = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final HashSet<String> f106486k = new HashSet<>();

    public BiliEditorCaptionFlowerV4Fragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionFlowerV4Fragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m9949invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionFlowerV4Fragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m9950invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f106487l = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C6557k.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionFlowerV4Fragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m9951invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionFlowerV4Fragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m9952invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionFlowerV4Fragment$special$$inlined$viewModels$default$4.m9952invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionFlowerV4Fragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m9953invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionFlowerV4Fragment$special$$inlined$viewModels$default$5.m9953invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131502036, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ax0.c, com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.n] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.jvm.functions.Function3<? super android.view.View, ? super java.lang.Integer, ? super T, kotlin.Unit>] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        final ?? cVar = new ax0.c();
        cVar.f54262b = 2131502046;
        cVar.f54263c = new Object();
        cVar.f54264d = new Function2(cVar, this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C6537n f106625a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliEditorCaptionFlowerV4Fragment f106626b;

            {
                this.f106625a = cVar;
                this.f106626b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                CaptionListItem captionListItem = (CaptionListItem) obj2;
                Iterable<CaptionListItem> iterable = this.f106625a.f54261a;
                if (iterable != null) {
                    for (CaptionListItem captionListItem2 : iterable) {
                        captionListItem2.setSelected(Intrinsics.areEqual(captionListItem2, captionListItem));
                    }
                }
                BiliEditorCaptionFlowerV4Fragment biliEditorCaptionFlowerV4Fragment = this.f106626b;
                C6537n c6537n = biliEditorCaptionFlowerV4Fragment.f106484i;
                if (c6537n != null) {
                    c6537n.notifyDataSetChanged();
                }
                Xz0.d.t("花字", String.valueOf(captionListItem.getId()), "4");
                if (captionListItem.getId() == -1) {
                    ((C6557k) biliEditorCaptionFlowerV4Fragment.f106487l.getValue()).f106715c.k(captionListItem);
                } else {
                    BiliEditorCaptionBaseFragment.nf(captionListItem, "caption_flower");
                    C6557k c6557k = (C6557k) biliEditorCaptionFlowerV4Fragment.f106487l.getValue();
                    c6557k.f106716d.f17486a.d(captionListItem, new com.bilibili.gripper.container.crashreport.e(biliEditorCaptionFlowerV4Fragment, captionListItem));
                }
                return Unit.INSTANCE;
            }
        };
        this.f106484i = cVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131310646);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), this.h, 1, false));
        recyclerView.setAdapter(this.f106484i);
        recyclerView.addItemDecoration(new C4914a(0, this.h, 0));
        recyclerView.addOnScrollListener(new C6538o(this));
        this.f106485j = recyclerView;
    }

    public final void rf() {
        List<? extends T> list;
        CaptionListItem captionListItem;
        RecyclerView recyclerView = this.f106485j;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
            for (int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition < iFindLastVisibleItemPosition + 1; iFindFirstVisibleItemPosition++) {
                C6537n c6537n = this.f106484i;
                if (c6537n != null && (list = c6537n.f54261a) != 0 && (captionListItem = (CaptionListItem) CollectionsKt.getOrNull(list, iFindFirstVisibleItemPosition)) != null) {
                    this.f106486k.add(String.valueOf(captionListItem.getId()));
                }
            }
        }
    }
}
