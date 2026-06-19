package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption;

import TB0.P;
import TB0.w0;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bL.f;
import com.bilibili.ad.adview.search.inline.card155.q;
import com.bilibili.ad.adview.search.inline.card155.r;
import com.bilibili.app.comm.comment2.comments.view.p;
import com.bilibili.bplus.followinglist.page.opus.D;
import com.bilibili.studio.editor.moudle.caption.tts.bean.TtsServerEntity;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.BiliEditorCaptionTtsViewModel;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.editor.timeline.i;
import com.bilibili.studio.template.widget.EditorDownloadProgressDialog;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import dagger.hilt.android.AndroidEntryPoint;
import hx0.d;
import jx0.c;
import jx0.e;
import jx0.h;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/BiliEditorTtsFragmentV2.class */
@AndroidEntryPoint
public final class BiliEditorTtsFragmentV2 extends Hilt_BiliEditorTtsFragmentV2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public P f106298g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public h f106299i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/BiliEditorTtsFragmentV2$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f106300a;

        public a(Function1 function1) {
            this.f106300a = function1;
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
            return this.f106300a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f106300a.invoke(obj);
        }
    }

    public BiliEditorTtsFragmentV2() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.BiliEditorTtsFragmentV2$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m9920invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.BiliEditorTtsFragmentV2$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m9921invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.h = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BiliEditorCaptionTtsViewModel.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.BiliEditorTtsFragmentV2$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m9922invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.BiliEditorTtsFragmentV2$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m9923invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.BiliEditorTtsFragmentV2$special$$inlined$viewModels$default$4.m9923invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.BiliEditorTtsFragmentV2$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m9924invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.BiliEditorTtsFragmentV2$special$$inlined$viewModels$default$5.m9924invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void kf(float r7, boolean r8, com.bilibili.studio.editor.moudle.caption.tts.bean.TtsServerEntity.TtsServerBean r9) throws java.lang.CloneNotSupportedException {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.BiliEditorTtsFragmentV2.kf(float, boolean, com.bilibili.studio.editor.moudle.caption.tts.bean.TtsServerEntity$TtsServerBean):void");
    }

    public final void lf() {
        h hVar = this.f106299i;
        BackUpTag backUpTag = (hVar == null || !hVar.a.f23668i.isSelected()) ? BackUpTag.CAPTION_TTS : BackUpTag.CAPTION_ALL_TTS;
        EditVideoInfo editVideoInfo = mf().f106647e.f4806b;
        i iVar = mf().f106646d.f4833c;
        if (iVar != null) {
            iVar.a(editVideoInfo, backUpTag);
        }
    }

    public final BiliEditorCaptionTtsViewModel mf() {
        return (BiliEditorCaptionTtsViewModel) this.h.getValue();
    }

    public final void nf(float f7, boolean z6, TtsServerEntity.TtsServerBean ttsServerBean) {
        h hVar = this.f106299i;
        if (hVar != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            EditorDownloadProgressDialog editorDownloadProgressDialog = hVar.h;
            if (editorDownloadProgressDialog == null || !editorDownloadProgressDialog.isAdded()) {
                EditorDownloadProgressDialog editorDownloadProgressDialog2 = new EditorDownloadProgressDialog();
                editorDownloadProgressDialog2.f108659g = 2131842146;
                editorDownloadProgressDialog2.h = 2131104206;
                editorDownloadProgressDialog2.f108660i = true;
                editorDownloadProgressDialog2.f108656d = new e(hVar);
                editorDownloadProgressDialog2.setCancelable(false);
                hVar.h = editorDownloadProgressDialog2;
                childFragmentManager.beginTransaction().add(hVar.h, "LoadingProgressDialog").commitNowAllowingStateLoss();
            }
        }
        mf().N0();
        mf().f106649g.observe(this, new a(new bL.h(this, 2)));
        of(f7, Boolean.valueOf(z6), ttsServerBean);
        mf().T0(requireContext(), f7, z6, ttsServerBean);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void of(float r5, java.lang.Boolean r6, com.bilibili.studio.editor.moudle.caption.tts.bean.TtsServerEntity.TtsServerBean r7) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.BiliEditorTtsFragmentV2.of(float, java.lang.Boolean, com.bilibili.studio.editor.moudle.caption.tts.bean.TtsServerEntity$TtsServerBean):void");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f106298g = P.inflate(layoutInflater, viewGroup, false);
        if (getContext() != null) {
            P p7 = this.f106298g;
            Context contextRequireContext = requireContext();
            View.OnClickListener hVar = new h(p7, contextRequireContext, this);
            this.f106299i = hVar;
            p7.f23664d.f24037d.setText(2131842216);
            w0 w0Var = p7.f23664d;
            w0Var.f24035b.setVisibility(8);
            w0Var.f24036c.setOnClickListener(hVar);
            p7.h.setOnClickListener(hVar);
            p7.f23668i.setOnClickListener(hVar);
            p7.f23670k.setOnSeekBarChangeListener(new c(hVar));
            RecyclerView.Adapter adapter = new RecyclerView.Adapter();
            ((d) adapter).c = new jx0.a(hVar);
            ((h) hVar).d = adapter;
            ((h) hVar).f = new LinearLayoutManager(contextRequireContext, 0, false);
            RecyclerView.Adapter adapter2 = ((h) hVar).d;
            RecyclerView recyclerView = p7.f23666f;
            recyclerView.setAdapter(adapter2);
            recyclerView.setLayoutManager(((h) hVar).f);
            recyclerView.addOnScrollListener(new jx0.b(hVar));
            RecyclerView.Adapter adapter3 = new RecyclerView.Adapter();
            ((hx0.a) adapter3).b = new p(hVar, 1);
            ((h) hVar).e = adapter3;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(contextRequireContext, 0, false);
            ((h) hVar).g = linearLayoutManager;
            RecyclerView recyclerView2 = p7.f23667g;
            recyclerView2.setLayoutManager(linearLayoutManager);
            recyclerView2.setAdapter(((h) hVar).e);
            recyclerView2.removeOnScrollListener(((h) hVar).m);
            recyclerView2.addOnScrollListener(((h) hVar).m);
        }
        BLog.i("BiliEditorTtsFragmentV2", "initObservers");
        mf().f106648f.c.observe(getViewLifecycleOwner(), new a(new NJ.c(1, this)));
        mf().f106648f.e.observe(getViewLifecycleOwner(), new a(new q(this, 3)));
        mf().f106648f.g.observe(getViewLifecycleOwner(), new a(new r(this, 4)));
        mf().f106648f.h.observe(getViewLifecycleOwner(), new a(new D(this, 1)));
        mf().f106648f.d.observe(getViewLifecycleOwner(), new a(new f(this, 2)));
        mf().f106648f.f.observe(getViewLifecycleOwner(), new a(new IP0.a(this, 3)));
        P p8 = this.f106298g;
        return p8 != null ? p8.f23661a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        mf().Q0();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        mf().V0();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.bilibili.bililive.infra.hierarchy.d, java.lang.Object] */
    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        TextView textView;
        TextView textView2;
        super.onViewCreated(view, bundle);
        mf().f106648f.c.postValue(2);
        mf().S0();
        BiliEditorCaptionTtsViewModel biliEditorCaptionTtsViewModelMf = mf();
        biliEditorCaptionTtsViewModelMf.getClass();
        ?? obj = new Object();
        Log.i("TtsAudioPlayer", "Audio Player init!");
        biliEditorCaptionTtsViewModelMf.f106652k = obj;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = DensityUtil.dp2px(294.0f);
        view.setLayoutParams(layoutParams);
        boolean z6 = mf().f106645c.f14907g;
        h hVar = this.f106299i;
        if (hVar != null) {
            hVar.a.f23668i.setSelected(!z6);
            hVar.c();
        }
        if (mf().f106645c.n()) {
            P p7 = this.f106298g;
            if (p7 == null || (textView2 = p7.f23668i) == null) {
                return;
            }
            textView2.setText(2131841785);
            return;
        }
        P p8 = this.f106298g;
        if (p8 == null || (textView = p8.f23668i) == null) {
            return;
        }
        textView.setText(2131842009);
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.CAPTION;
    }
}
