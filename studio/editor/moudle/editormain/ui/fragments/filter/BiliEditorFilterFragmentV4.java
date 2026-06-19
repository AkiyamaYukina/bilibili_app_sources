package com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter;

import Ky0.a0;
import TB0.T;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.editor.moudle.editormain.uistate.bottomfragment.FragmentContainerModal;
import com.bilibili.studio.editor.moudle.editormain.usecase.middlemodule.MiddleControlUseCase;
import com.bilibili.studio.videoeditor.widgets.BiliEditorConfirmDialogV2;
import com.google.android.material.tabs.TabLayout;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/filter/BiliEditorFilterFragmentV4.class */
@AndroidEntryPoint
public final class BiliEditorFilterFragmentV4 extends Hilt_BiliEditorFilterFragmentV4 implements View.OnClickListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public T f106787g;

    @Nullable
    public jy0.d h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f106788i;

    @Inject
    public BiliEditorFilterFragmentV4() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter.BiliEditorFilterFragmentV4$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m10006invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter.BiliEditorFilterFragmentV4$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m10007invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f106788i = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ky0.j.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter.BiliEditorFilterFragmentV4$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m10008invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter.BiliEditorFilterFragmentV4$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m10009invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter.BiliEditorFilterFragmentV4$special$$inlined$viewModels$default$4.m10009invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter.BiliEditorFilterFragmentV4$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m10010invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter.BiliEditorFilterFragmentV4$special$$inlined$viewModels$default$5.m10010invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [com.bilibili.studio.videoeditor.widgets.BiliEditorConfirmDialogV2$a, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2131319221) {
            ((ky0.j) this.f106788i.getValue()).c.a();
            ?? obj = new Object();
            obj.f110280a = 2131842048;
            obj.f110282c = 2131842224;
            obj.f110281b = 2131841846;
            obj.f110283d = new D60.c(6);
            obj.f110284e = new com.bilibili.bililive.room.ui.guide.bubble.b(this, 1);
            BiliEditorConfirmDialogV2 biliEditorConfirmDialogV2 = new BiliEditorConfirmDialogV2(obj);
            if (getParentFragmentManager().isStateSaved() || getParentFragmentManager().isDestroyed()) {
                return;
            }
            biliEditorConfirmDialogV2.show(getParentFragmentManager(), "ResetAdjustDialog");
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 2131319216) {
            Ry0.g gVar = ((ky0.j) this.f106788i.getValue()).d;
            Wy.a aVar = gVar.h;
            if (aVar != null) {
                aVar.invoke();
            }
            gVar.f21015a.a();
            final a0 a0Var = gVar.f21016b;
            final Ry0.f fVar = new Ry0.f(gVar, 0);
            if (a0Var.f13079f.f4806b == null) {
                return;
            }
            a0Var.f13079f.a();
            a0Var.t();
            ez0.a aVar2 = a0Var.f13074a;
            Runnable runnable = new Runnable(a0Var, fVar) { // from class: Ky0.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final a0 f13162a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Ry0.f f13163b;

                {
                    this.f13162a = a0Var;
                    this.f13163b = fVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    a0 a0Var2 = this.f13162a;
                    Ry0.f fVar2 = this.f13163b;
                    a0Var2.f13081i.o(true);
                    MiddleControlUseCase middleControlUseCase = a0Var2.f13081i;
                    MutableLiveData mutableLiveData = middleControlUseCase.f107186d.l;
                    mutableLiveData.setValue(new Gy0.e(false, null));
                    middleControlUseCase.j(true);
                    a0Var2.f13083k.p(true);
                    a0Var2.f13084l.j();
                    Sy0.a.J(a0Var2.f13082j);
                    fVar2.run();
                }
            };
            MutableLiveData mutableLiveData = aVar2.l;
            Dy0.j jVar = (Dy0.j) mutableLiveData.getValue();
            Dy0.j jVar2 = jVar;
            if (jVar == null) {
                jVar2 = new Dy0.j(false, 0, 0L, null, FragmentContainerModal.MODAL_HALF);
            }
            mutableLiveData.setValue(Dy0.j.a(jVar2, false, 0, 0L, runnable, 22));
            a0Var.p();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        T tInflate = T.inflate(layoutInflater, viewGroup, false);
        this.f106787g = tInflate;
        return tInflate != null ? tInflate.f23681a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        jy0.d dVar = this.h;
        if (dVar != null) {
            T t7 = this.f106787g;
            TabLayout tabLayout = t7 != null ? t7.f23684d : null;
            if (dVar.b || tabLayout == null) {
                return;
            }
            tabLayout.postDelayed(new jy0.a(tabLayout, dVar), 500L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r7, @org.jetbrains.annotations.Nullable android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter.BiliEditorFilterFragmentV4.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.FILTER;
    }
}
