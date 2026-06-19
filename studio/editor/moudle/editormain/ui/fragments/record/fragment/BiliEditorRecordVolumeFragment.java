package com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment;

import Dy0.y;
import Ky0.a0;
import TB0.k0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.droid.ToastHelper;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.editor.moudle.editormain.track.cover.enums.BiliEditorTrackMode;
import com.bilibili.studio.editor.moudle.editormain.track.manager.EditorTrackLocationMode;
import com.bilibili.studio.editor.moudle.editormain.uistate.bottomfragment.FragmentContainerModal;
import com.bilibili.studio.editor.moudle.editormain.usecase.middlemodule.MiddleControlUseCase;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.videoeditor.ms.record.RecordInfo;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/record/fragment/BiliEditorRecordVolumeFragment.class */
@AndroidEntryPoint
public final class BiliEditorRecordVolumeFragment extends Hilt_BiliEditorRecordVolumeFragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public k0 f106897g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ry0.a f106898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final e f106899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final f f106900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final a f106901l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/record/fragment/BiliEditorRecordVolumeFragment$a.class */
    public static final class a implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorRecordVolumeFragment f106902a;

        public a(BiliEditorRecordVolumeFragment biliEditorRecordVolumeFragment) {
            this.f106902a = biliEditorRecordVolumeFragment;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
            BiliEditorRecordVolumeFragment biliEditorRecordVolumeFragment = this.f106902a;
            if (biliEditorRecordVolumeFragment.f106898i != null) {
                ry0.a.b(i7, biliEditorRecordVolumeFragment.f106897g);
            }
            BiliEditorRecordVolumeFragment biliEditorRecordVolumeFragment2 = this.f106902a;
            if (biliEditorRecordVolumeFragment2.f106898i != null) {
                ry0.a.c(i7, biliEditorRecordVolumeFragment2.f106897g);
            }
            Xy0.f fVar = ((sy0.h) this.f106902a.h.getValue()).c;
            float f7 = i7 / 100.0f;
            RecordInfo recordInfoK = fVar.k();
            if (recordInfoK == null) {
                return;
            }
            UC0.a aVarL = fVar.l(recordInfoK);
            if (aVarL != null) {
                aVarL.B(f7, f7);
            }
            recordInfoK.volumn = f7;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            Xy0.f fVar = ((sy0.h) this.f106902a.h.getValue()).c;
            RecordInfo recordInfoK = fVar.k();
            if (recordInfoK != null) {
                Ex0.n nVar = fVar.f28427d;
                nVar.j();
                nVar.l(recordInfoK.inPoint, recordInfoK.outPoint);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.e] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.f] */
    public BiliEditorRecordVolumeFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliEditorRecordVolumeFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m10050invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliEditorRecordVolumeFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m10051invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.h = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(sy0.h.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliEditorRecordVolumeFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m10052invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliEditorRecordVolumeFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m10053invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliEditorRecordVolumeFragment$special$$inlined$viewModels$default$4.m10053invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliEditorRecordVolumeFragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m10054invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliEditorRecordVolumeFragment$special$$inlined$viewModels$default$5.m10054invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f106899j = new View.OnClickListener(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorRecordVolumeFragment f106927a;

            {
                this.f106927a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BiliEditorRecordVolumeFragment biliEditorRecordVolumeFragment = this.f106927a;
                sy0.h hVar = (sy0.h) biliEditorRecordVolumeFragment.h.getValue();
                k0 k0Var = biliEditorRecordVolumeFragment.f106897g;
                hVar.c.i(k0Var != null ? k0Var.f23855e.getProgress() : 0);
                com.bilibili.studio.editor.timeline.i iVar = hVar.f.f4833c;
                if (iVar != null) {
                    iVar.a(hVar.e.f4806b, BackUpTag.RECORD_ALL_VOLUME);
                }
                ToastHelper.showToast(biliEditorRecordVolumeFragment.requireContext(), biliEditorRecordVolumeFragment.getString(2131842135), 0);
            }
        };
        final int i7 = 0;
        this.f106900k = new View.OnClickListener(this, i7) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f106928a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f106929b;

            {
                this.f106928a = i7;
                this.f106929b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f106928a) {
                    case 0:
                        sy0.h hVar = (sy0.h) ((BiliEditorRecordVolumeFragment) this.f106929b).h.getValue();
                        Xy0.f fVar = hVar.c;
                        Xy0.f.p(fVar, fVar.k());
                        a0 a0Var = hVar.d;
                        a0Var.f13078e.j();
                        a0Var.f13077d.e(true);
                        Sy0.a.H(a0Var.f13082j, EditorTrackLocationMode.LOCATION_TOP, BiliEditorTrackMode.TRACK_MODE_EASY_EDIT, null, false, 12);
                        Runnable runnable = new Runnable(a0Var, 0) { // from class: Ky0.J

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final int f13039a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final Object f13040b;

                            {
                                this.f13039a = i;
                                this.f13040b = a0Var;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (this.f13039a) {
                                    case 0:
                                        a0 a0Var2 = (a0) this.f13040b;
                                        MiddleControlUseCase middleControlUseCase = a0Var2.f13081i;
                                        Boolean bool = Boolean.TRUE;
                                        middleControlUseCase.l(bool, bool);
                                        MiddleControlUseCase middleControlUseCase2 = a0Var2.f13081i;
                                        middleControlUseCase2.o(true);
                                        middleControlUseCase2.j(true);
                                        break;
                                    default:
                                        ((com.bilibili.ad.core.report.fee_mma.h) this.f13040b).h(2);
                                        break;
                                }
                            }
                        };
                        ez0.a aVar = a0Var.f13074a;
                        y yVar = (y) aVar.u.getValue();
                        y yVar2 = yVar;
                        if (yVar == null) {
                            yVar2 = new y(false, null, FragmentContainerModal.MODAL_HALF_LESS);
                        }
                        aVar.u.setValue(new y(false, runnable, yVar2.f3362c));
                        a0Var.p();
                        com.bilibili.studio.editor.timeline.i iVar = hVar.f.f4833c;
                        if (iVar != null) {
                            iVar.a(hVar.e.f4806b, BackUpTag.RECORD_VOLUME);
                        }
                        break;
                    default:
                        ((AlertDialog) this.f106929b).dismiss();
                        break;
                }
            }
        };
        this.f106901l = new a(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        k0 k0VarInflate = k0.inflate(layoutInflater, viewGroup, false);
        this.f106897g = k0VarInflate;
        return k0VarInflate != null ? k0VarInflate.f23851a : null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ry0.a] */
    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f106898i = new Object();
        ry0.a.a(this.f106897g, requireContext(), this.f106900k, this.f106899j, this.f106901l);
        RecordInfo recordInfoK = ((sy0.h) this.h.getValue()).c.k();
        int i7 = (int) ((recordInfoK != null ? recordInfoK.volumn : 1.0f) * 100.0f);
        if (this.f106898i != null) {
            ry0.a.b(i7, this.f106897g);
        }
        if (this.f106898i != null) {
            ry0.a.c(i7, Boolean.FALSE);
        }
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.RECORD_FX;
    }
}
