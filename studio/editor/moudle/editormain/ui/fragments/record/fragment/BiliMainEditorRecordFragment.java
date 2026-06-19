package com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment;

import MQ0.B;
import Ne0.v;
import TB0.i0;
import TB0.v0;
import aC0.InterfaceC3194a;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.app.comment3.ui.widget.compose.Z;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.RecordState;
import com.bilibili.studio.editor.moudle.editormain.uistate.mainpanel.MainPanelMaterialFoldTrackUiState;
import com.bilibili.studio.videoeditor.extension.p;
import com.bilibili.studio.videoeditor.ms.record.RecordInfo;
import com.mall.ui.page.search.SearchFragmentV2;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/record/fragment/BiliMainEditorRecordFragment.class */
@AndroidEntryPoint
public final class BiliMainEditorRecordFragment extends Hilt_BiliMainEditorRecordFragment implements InterfaceC3194a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public i0 f106903g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f106904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public k f106905j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/record/fragment/BiliMainEditorRecordFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f106906a;

        static {
            int[] iArr = new int[RecordState.values().length];
            try {
                iArr[RecordState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[RecordState.RECORDING.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[RecordState.COUNT_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f106906a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/record/fragment/BiliMainEditorRecordFragment$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f106907a;

        public b(Function1 function1) {
            this.f106907a = function1;
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
            return this.f106907a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f106907a.invoke(obj);
        }
    }

    public BiliMainEditorRecordFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliMainEditorRecordFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m10056invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliMainEditorRecordFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m10057invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.h = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(sy0.a.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliMainEditorRecordFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m10058invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliMainEditorRecordFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m10059invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliMainEditorRecordFragment$special$$inlined$viewModels$default$4.m10059invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliMainEditorRecordFragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m10060invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliMainEditorRecordFragment$special$$inlined$viewModels$default$5.m10060invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
    }

    @Override // aC0.InterfaceC3194a
    public final void D6() {
    }

    @Override // aC0.InterfaceC3194a
    public final void j8() {
        kf().M0();
    }

    public final sy0.a kf() {
        return (sy0.a) this.h.getValue();
    }

    @Override // aC0.InterfaceC3194a
    public final void l4(long j7) {
    }

    public final void lf() {
        BiliImageView biliImageView;
        BiliImageView biliImageView2;
        TextView textView;
        TextView textView2;
        BiliImageView biliImageView3;
        BiliImageView biliImageView4;
        TextView textView3;
        TextView textView4;
        sy0.a aVarKf = kf();
        if (((ArrayList) aVarKf.k).isEmpty() || aVarKf.i.getValue() != RecordState.IDLE) {
            i0 i0Var = this.f106903g;
            if (i0Var != null && (textView2 = i0Var.f23824j) != null) {
                textView2.setEnabled(false);
            }
            i0 i0Var2 = this.f106903g;
            if (i0Var2 != null && (textView = i0Var2.f23824j) != null) {
                textView.setAlpha(0.3f);
            }
            i0 i0Var3 = this.f106903g;
            if (i0Var3 != null && (biliImageView2 = i0Var3.f23820e) != null) {
                biliImageView2.setEnabled(false);
            }
            i0 i0Var4 = this.f106903g;
            if (i0Var4 == null || (biliImageView = i0Var4.f23820e) == null) {
                return;
            }
            biliImageView.setAlpha(0.3f);
            return;
        }
        i0 i0Var5 = this.f106903g;
        if (i0Var5 != null && (textView4 = i0Var5.f23824j) != null) {
            textView4.setEnabled(true);
        }
        i0 i0Var6 = this.f106903g;
        if (i0Var6 != null && (textView3 = i0Var6.f23824j) != null) {
            textView3.setAlpha(1.0f);
        }
        i0 i0Var7 = this.f106903g;
        if (i0Var7 != null && (biliImageView4 = i0Var7.f23820e) != null) {
            biliImageView4.setEnabled(true);
        }
        i0 i0Var8 = this.f106903g;
        if (i0Var8 == null || (biliImageView3 = i0Var8.f23820e) == null) {
            return;
        }
        biliImageView3.setAlpha(1.0f);
    }

    public final void mf() {
        v0 v0Var;
        ImageView imageView;
        v0 v0Var2;
        ImageView imageView2;
        TextView textView;
        i0 i0Var = this.f106903g;
        p.d(i0Var != null ? i0Var.f23822g : null);
        i0 i0Var2 = this.f106903g;
        p.a(i0Var2 != null ? i0Var2.f23825k : null);
        i0 i0Var3 = this.f106903g;
        p.a(i0Var3 != null ? i0Var3.f23821f : null);
        i0 i0Var4 = this.f106903g;
        BiliImageView biliImageView = null;
        if (i0Var4 != null) {
            biliImageView = i0Var4.f23819d;
        }
        p.a(biliImageView);
        i0 i0Var5 = this.f106903g;
        if (i0Var5 != null && (textView = i0Var5.f23823i) != null) {
            textView.setText(getString(2131842042));
        }
        i0 i0Var6 = this.f106903g;
        if (i0Var6 != null && (v0Var2 = i0Var6.f23818c) != null && (imageView2 = v0Var2.f24015c) != null) {
            imageView2.setEnabled(true);
        }
        i0 i0Var7 = this.f106903g;
        if (i0Var7 == null || (v0Var = i0Var7.f23818c) == null || (imageView = v0Var.f24015c) == null) {
            return;
        }
        imageView.setAlpha(1.0f);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        i0 i0VarInflate = i0.inflate(layoutInflater, viewGroup, false);
        this.f106903g = i0VarInflate;
        return i0VarInflate != null ? i0VarInflate.f23816a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        sy0.a aVarKf = kf();
        ((ArrayList) aVarKf.k).clear();
        aVarKf.M0();
        sy0.b bVar = aVarKf.m;
        if (bVar != null) {
            bVar.cancel();
        }
    }

    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        v0 v0Var;
        v0 v0Var2;
        super.onViewCreated(view, bundle);
        Xz0.d.f28458a.getClass();
        Neurons.reportExposure$default(false, "creation.new-video-editor.recording.recording.show", Xz0.d.e(), (List) null, 8, (Object) null);
        i0 i0Var = this.f106903g;
        if (i0Var != null) {
            i0Var.h.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliMainEditorRecordFragment f106930a;

                {
                    this.f106930a = this;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    this.f106930a.kf().K0(view2.getContext());
                    return true;
                }
            });
        }
        i0 i0Var2 = this.f106903g;
        if (i0Var2 != null) {
            final int i7 = 0;
            i0Var2.h.setOnTouchListener(new View.OnTouchListener(i7, this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f106931a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final androidx_fragment_app_Fragment f106932b;

                {
                    this.f106931a = i7;
                    this.f106932b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v13, types: [com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.k, java.lang.Runnable] */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (this.f106931a) {
                        case 0:
                            BiliMainEditorRecordFragment biliMainEditorRecordFragment = (BiliMainEditorRecordFragment) this.f106932b;
                            biliMainEditorRecordFragment.getClass();
                            int action = motionEvent.getAction();
                            if (action == 0) {
                                k kVar = biliMainEditorRecordFragment.f106905j;
                                if (kVar != null) {
                                    view2.removeCallbacks(kVar);
                                }
                                ?? r02 = new Runnable(biliMainEditorRecordFragment, view2) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.k

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final BiliMainEditorRecordFragment f106934a;

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final View f106935b;

                                    {
                                        this.f106934a = biliMainEditorRecordFragment;
                                        this.f106935b = view2;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        BiliMainEditorRecordFragment biliMainEditorRecordFragment2 = this.f106934a;
                                        View view3 = this.f106935b;
                                        biliMainEditorRecordFragment2.f106904i = true;
                                        if (view3.isLongClickable()) {
                                            view3.performLongClick();
                                        }
                                    }
                                };
                                biliMainEditorRecordFragment.f106905j = r02;
                                view2.postDelayed(r02, 800L);
                                return true;
                            }
                            if (action != 1 && action != 3) {
                                return true;
                            }
                            if (biliMainEditorRecordFragment.f106904i) {
                                biliMainEditorRecordFragment.f106904i = false;
                                biliMainEditorRecordFragment.kf().K0(view2.getContext());
                            } else {
                                view2.performClick();
                            }
                            view2.removeCallbacks(biliMainEditorRecordFragment.f106905j);
                            return true;
                        default:
                            SearchFragmentV2 searchFragmentV2 = this.f106932b;
                            searchFragmentV2.getClass();
                            if (motionEvent.getAction() != 1) {
                                return false;
                            }
                            if (!TextUtils.isEmpty(searchFragmentV2.g.getText())) {
                                searchFragmentV2.h.setVisibility(0);
                            }
                            searchFragmentV2.g.requestFocus();
                            searchFragmentV2.g.setCursorVisible(true);
                            B.B(searchFragmentV2.g);
                            return false;
                    }
                }
            });
        }
        i0 i0Var3 = this.f106903g;
        if (i0Var3 != null) {
            i0Var3.h.setOnClickListener(new PN.l(this, 1));
        }
        i0 i0Var4 = this.f106903g;
        if (i0Var4 != null) {
            i0Var4.f23824j.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliMainEditorRecordFragment f106933a;

                {
                    this.f106933a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BiliMainEditorRecordFragment biliMainEditorRecordFragment = this.f106933a;
                    biliMainEditorRecordFragment.getClass();
                    Xz0.d.f28458a.getClass();
                    Xz0.d.U(3);
                    biliMainEditorRecordFragment.kf().J0();
                    biliMainEditorRecordFragment.lf();
                }
            });
        }
        i0 i0Var5 = this.f106903g;
        if (i0Var5 != null) {
            i0Var5.f23820e.setOnClickListener(new Ir0.e(this, 1));
        }
        i0 i0Var6 = this.f106903g;
        if (i0Var6 != null && (v0Var2 = i0Var6.f23818c) != null) {
            v0Var2.f24015c.setOnClickListener(new v(this, 1));
        }
        i0 i0Var7 = this.f106903g;
        if (i0Var7 != null && (v0Var = i0Var7.f23818c) != null) {
            v0Var.f24017e.setText(getString(2131841777));
        }
        mf();
        lf();
        kf().f.a(this, "EditorRecordViewModel");
        sy0.a aVarKf = kf();
        Context context = getContext();
        aVarKf.l.f109858b = aVarKf.n;
        aVarKf.d.h = new Z(2, aVarKf, context);
        kf().i.observe(getViewLifecycleOwner(), new b(new PN.i(this, 2)));
        kf().j.observe(getViewLifecycleOwner(), new b(new UD.v(this, 3)));
    }

    @Override // aC0.InterfaceC3194a
    public final void vd() {
        kf().M0();
    }

    @Override // aC0.InterfaceC3194a
    public final void w2(long j7) {
        RecordInfo recordInfo;
        TextView textView;
        if (kf().i.getValue() != RecordState.RECORDING || (recordInfo = (RecordInfo) CollectionsKt.lastOrNull(kf().k)) == null) {
            return;
        }
        long j8 = j7 - recordInfo.inPoint;
        i0 i0Var = this.f106903g;
        if (i0Var != null && (textView = i0Var.f23823i) != null) {
            textView.setText(ub1.c.a(j8 / ((long) 1000)));
        }
        recordInfo.outPoint = j7;
        recordInfo.setTrimOut(j8);
        sy0.a aVarKf = kf();
        aVarKf.getClass();
        aVarKf.e.n(null, MainPanelMaterialFoldTrackUiState.UpdateMode.UPDATE);
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.RECORD;
    }

    @Override // aC0.InterfaceC3194a
    public final void z4(long j7, long j8) {
    }
}
