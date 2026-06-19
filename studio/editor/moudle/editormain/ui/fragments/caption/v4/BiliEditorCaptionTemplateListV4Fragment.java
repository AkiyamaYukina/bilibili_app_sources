package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax0.C4914a;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.foundation.Foundation;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionTemplateV4Fragment;
import com.bilibili.studio.videoeditor.util.C6631d;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/BiliEditorCaptionTemplateListV4Fragment.class */
@AndroidEntryPoint
public final class BiliEditorCaptionTemplateListV4Fragment extends Hilt_BiliEditorCaptionTemplateListV4Fragment {
    public final int h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public T f106537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public List<? extends CaptionListItem> f106538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public RecyclerView f106539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f106540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f106541m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final HashSet<String> f106542n;

    public BiliEditorCaptionTemplateListV4Fragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionTemplateListV4Fragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m9969invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionTemplateListV4Fragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m9970invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f106541m = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.D.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionTemplateListV4Fragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m9971invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionTemplateListV4Fragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m9972invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionTemplateListV4Fragment$special$$inlined$viewModels$default$4.m9972invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionTemplateListV4Fragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m9973invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionTemplateListV4Fragment$special$$inlined$viewModels$default$5.m9973invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f106542n = new HashSet<>();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131501680, viewGroup, false);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i7, @NotNull String[] strArr, @NotNull int[] iArr) {
        Iterable<CaptionListItem> iterable;
        super.onRequestPermissionsResult(i7, strArr, iArr);
        PermissionsChecker.onPermissionResult(i7, strArr, iArr);
        if (!PermissionsChecker.checkSelfPermissions(getContext(), strArr)) {
            ToastHelper.showToast(getContext(), 2131842439, 0);
            pf();
            return;
        }
        T t7 = this.f106537i;
        if (t7 == null || (iterable = t7.f54261a) == null) {
            captionListItem = null;
        } else {
            for (CaptionListItem captionListItem : iterable) {
                if (captionListItem.isSelected()) {
                    break;
                }
            }
            captionListItem = null;
        }
        if (captionListItem != null) {
            rf().L0(this, captionListItem);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$Adapter, ax0.c, com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.T] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        final ?? cVar = new ax0.c();
        cVar.setHasStableIds(true);
        cVar.f54261a = this.f106538j;
        cVar.f54262b = 2131502047;
        cVar.f54263c = new Function3(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.P

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorCaptionTemplateListV4Fragment f106603a;

            {
                this.f106603a = this;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                View view2 = (View) obj;
                ((Integer) obj2).getClass();
                CaptionListItem captionListItem = (CaptionListItem) obj3;
                view2.setVisibility(0);
                BiliImageView biliImageViewFindViewById = view2.findViewById(2131298304);
                ImageView imageView = (ImageView) view2.findViewById(2131298303);
                ProgressBar progressBar = (ProgressBar) view2.findViewById(2131300293);
                if (captionListItem.isLocal()) {
                    BiliImageLoader.INSTANCE.with(view2.getContext()).url(BiliImageLoaderHelper.resourceToUri(bi.b.a(Foundation.Companion), captionListItem.getImageLocal())).into(biliImageViewFindViewById);
                } else if (biliImageViewFindViewById.getTag() == null || !biliImageViewFindViewById.getTag().equals(captionListItem.getImageHttp())) {
                    ConcurrentHashMap<BiliImageView, C6631d.a> concurrentHashMap = C6631d.f110226a;
                    C6631d.a(biliImageViewFindViewById, captionListItem.getImageHttp(), this.f106603a);
                    biliImageViewFindViewById.setTag(captionListItem.getImageHttp());
                }
                if (captionListItem.isDownloaded()) {
                    imageView.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                }
                if (captionListItem.isDownloading()) {
                    progressBar.setVisibility(0);
                    imageView.setVisibility(8);
                } else {
                    progressBar.setVisibility(8);
                }
                view2.setSelected(captionListItem.isSelected());
                return Unit.INSTANCE;
            }
        };
        cVar.f54264d = new Function2(cVar, this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.Q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final T f106604a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliEditorCaptionTemplateListV4Fragment f106605b;

            {
                this.f106604a = cVar;
                this.f106605b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Unit unit;
                CaptionListItem captionListItem = (CaptionListItem) obj2;
                if (com.bilibili.studio.videoeditor.util.V.c()) {
                    unit = Unit.INSTANCE;
                } else {
                    for (CaptionListItem captionListItem2 : this.f106604a.f54261a) {
                        captionListItem2.setSelected(Intrinsics.areEqual(captionListItem2, captionListItem));
                    }
                    BiliEditorCaptionTemplateListV4Fragment biliEditorCaptionTemplateListV4Fragment = this.f106605b;
                    biliEditorCaptionTemplateListV4Fragment.sf();
                    Fragment parentFragment = biliEditorCaptionTemplateListV4Fragment.getParentFragment();
                    BiliEditorCaptionTemplateV4Fragment.a aVar = (parentFragment == null || !(parentFragment instanceof BiliEditorCaptionTemplateV4Fragment)) ? null : ((BiliEditorCaptionTemplateV4Fragment) parentFragment).f106549m;
                    if (aVar != null) {
                        aVar.getClass();
                        ArrayList<CaptionListItem> arrayList = BiliEditorCaptionTemplateV4Fragment.f106543n;
                        for (CaptionListItem captionListItem3 : BiliEditorCaptionTemplateV4Fragment.f106543n) {
                            if (!Intrinsics.areEqual(captionListItem3, captionListItem)) {
                                captionListItem3.setSelected(false);
                            }
                        }
                        Iterator<T> it = aVar.f106550a.f106548l.iterator();
                        while (it.hasNext()) {
                            ((BiliEditorCaptionTemplateListV4Fragment) it.next()).sf();
                        }
                    }
                    BiliEditorCaptionBaseFragment.nf(captionListItem, "caption_template");
                    biliEditorCaptionTemplateListV4Fragment.rf().f106659d.f17486a.f(captionListItem, new bU0.e(biliEditorCaptionTemplateListV4Fragment, captionListItem));
                    Xz0.d.t(captionListItem.getCategory(), String.valueOf(captionListItem.getId()), "0");
                    Xz0.d dVar = Xz0.d.f28458a;
                    String category = captionListItem.getCategory();
                    int id = captionListItem.getId();
                    dVar.getClass();
                    Xz0.d.P(category, String.valueOf(id));
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        };
        this.f106537i = cVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131308035);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), this.h, 1, false));
        recyclerView.setAdapter(this.f106537i);
        recyclerView.addItemDecoration(new C4914a(0, this.h, this.f106540l ? DensityUtil.dp2px(62.0f) : 0));
        recyclerView.addOnScrollListener(new U(this));
        this.f106539k = recyclerView;
    }

    @Override // com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment
    public final void pf() {
        if (lf()) {
            Fragment parentFragment = getParentFragment();
            BiliEditorCaptionTemplateV4Fragment.a aVar = (parentFragment == null || !(parentFragment instanceof BiliEditorCaptionTemplateV4Fragment)) ? null : ((BiliEditorCaptionTemplateV4Fragment) parentFragment).f106549m;
            if (aVar != null) {
                aVar.getClass();
                ArrayList<CaptionListItem> arrayList = BiliEditorCaptionTemplateV4Fragment.f106543n;
                int i7 = 0;
                for (Object obj : BiliEditorCaptionTemplateV4Fragment.f106543n) {
                    if (i7 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    CaptionListItem captionListItem = (CaptionListItem) obj;
                    ArrayList<CaptionListItem> arrayList2 = BiliEditorCaptionTemplateV4Fragment.f106543n;
                    captionListItem.setSelected(i7 == BiliEditorCaptionTemplateV4Fragment.f106544o);
                    i7++;
                }
                Iterator<T> it = aVar.f106550a.f106548l.iterator();
                while (it.hasNext()) {
                    ((BiliEditorCaptionTemplateListV4Fragment) it.next()).sf();
                }
            }
        }
    }

    public final com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.D rf() {
        return (com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.D) this.f106541m.getValue();
    }

    public final void sf() {
        T t7 = this.f106537i;
        if (t7 != null) {
            t7.notifyDataSetChanged();
        }
    }
}
