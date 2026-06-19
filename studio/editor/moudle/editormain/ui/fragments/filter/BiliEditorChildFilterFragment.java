package com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter;

import F3.z6;
import Ly0.I;
import Ly0.K;
import RT.U;
import TB0.Q;
import aP.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.aphro.crop.page.n;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.videoeditor.extension.p;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/filter/BiliEditorChildFilterFragment.class */
@AndroidEntryPoint
public final class BiliEditorChildFilterFragment extends Hilt_BiliEditorChildFilterFragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Q f106781g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final hy0.e f106782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f106783j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final a f106784k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/filter/BiliEditorChildFilterFragment$a.class */
    public static final class a extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorChildFilterFragment f106785a;

        public a(BiliEditorChildFilterFragment biliEditorChildFilterFragment) {
            this.f106785a = biliEditorChildFilterFragment;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            super.onScrolled(recyclerView, i7, i8);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                ky0.g gVarLf = this.f106785a.lf();
                List list = (List) gVarLf.k.getValue();
                List listEmptyList = list;
                if (list == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                int iO0 = iFindLastVisibleItemPosition == listEmptyList.size() - 1 ? gVarLf.O0(iFindLastVisibleItemPosition) : gVarLf.O0(iFindFirstVisibleItemPosition);
                if (iO0 >= 0) {
                    MutableLiveData mutableLiveData = gVarLf.l;
                    Integer num = (Integer) mutableLiveData.getValue();
                    if (num == null || iO0 != num.intValue()) {
                        mutableLiveData.setValue(Integer.valueOf(iO0));
                    }
                }
                CollectionsKt.addAll(gVarLf.t, new IntRange(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/filter/BiliEditorChildFilterFragment$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f106786a;

        public b(Function1 function1) {
            this.f106786a = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f106786a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f106786a.invoke(obj);
        }
    }

    public BiliEditorChildFilterFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter.BiliEditorChildFilterFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m10001invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter.BiliEditorChildFilterFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m10002invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.h = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ky0.g.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter.BiliEditorChildFilterFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m10003invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter.BiliEditorChildFilterFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m10004invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter.BiliEditorChildFilterFragment$special$$inlined$viewModels$default$4.m10004invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter.BiliEditorChildFilterFragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m10005invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter.BiliEditorChildFilterFragment$special$$inlined$viewModels$default$5.m10005invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f106782i = new hy0.e();
        this.f106783j = LazyKt.lazy(new z6(9));
        this.f106784k = new a(this);
    }

    public final hy0.c kf() {
        return (hy0.c) this.f106783j.getValue();
    }

    public final ky0.g lf() {
        return (ky0.g) this.h.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Q qInflate = Q.inflate(layoutInflater, viewGroup, false);
        this.f106781g = qInflate;
        return qInflate != null ? qInflate.f23672a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ky0.g gVarLf = lf();
        gVarLf.M0();
        ConnectivityMonitor.getInstance().unregister(gVarLf.v);
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter.e] */
    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        Q q7 = this.f106781g;
        if (q7 != null) {
            final RecyclerView recyclerView = q7.f23675d;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.setAdapter(this.f106782i);
            recyclerView.addOnScrollListener(new h(this));
            final int i7 = 0;
            this.f106782i.c = new Function2(i7, this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f106807a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final androidx_fragment_app_Fragment f106808b;

                {
                    this.f106807a = i7;
                    this.f106808b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x010e  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x014b  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x0199  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15) {
                    /*
                        Method dump skipped, instruction units count: 712
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter.e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            };
            lf().j.observe(getViewLifecycleOwner(), new b(new U(2, recyclerView, this)));
            lf().l.observe(getViewLifecycleOwner(), new b(new Function1(this, recyclerView) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliEditorChildFilterFragment f106810a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final RecyclerView f106811b;

                {
                    this.f106810a = this;
                    this.f106811b = recyclerView;
                }

                public final Object invoke(Object obj) {
                    Integer num = (Integer) obj;
                    if (num != null) {
                        hy0.e eVar = this.f106810a.f106782i;
                        eVar.b = num.intValue();
                        eVar.notifyItemRangeChanged(0, eVar.getItemCount(), 1);
                        p.c(this.f106811b, num.intValue(), null);
                    }
                    return Unit.INSTANCE;
                }
            }));
        }
        Q q8 = this.f106781g;
        if (q8 != null) {
            RecyclerView recyclerView2 = q8.f23674c;
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 0, false));
            recyclerView2.setItemAnimator(null);
            recyclerView2.setAdapter(kf());
            recyclerView2.setItemAnimator(null);
            recyclerView2.addOnScrollListener(this.f106784k);
            kf().a = new I(this, 1);
            lf().k.observe(getViewLifecycleOwner(), new b(new com.bilibili.bililive.room.ui.guide.e(this, 2)));
            lf().m.observe(getViewLifecycleOwner(), new b(new com.bilibili.bililive.room.ui.guide.f(this, 2)));
            lf().n.observe(getViewLifecycleOwner(), new b(new K(recyclerView2, 2)));
            lf().o.observe(getViewLifecycleOwner(), new b(new aP.k(1, recyclerView2, this)));
            lf().p.observe(getViewLifecycleOwner(), new b(new l(1, recyclerView2, this)));
        }
        final Q q9 = this.f106781g;
        if (q9 != null) {
            q9.f23677f.setOnClickListener(new Wj.f(this, 1));
            q9.f23673b.setOnTouchListener(new View.OnTouchListener(q9) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Q f106809a;

                {
                    this.f106809a = q9;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return this.f106809a.f23676e.onTouchEvent(motionEvent);
                }
            });
            q9.f23676e.setOnSeekBarChangeListener(new i(this, q9));
            lf().q.observe(getViewLifecycleOwner(), new b(new n(2, this, q9)));
        }
        lf().I0();
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.FILTER;
    }
}
