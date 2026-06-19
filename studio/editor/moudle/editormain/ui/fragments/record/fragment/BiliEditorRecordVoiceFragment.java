package com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment;

import D60.B;
import TB0.j0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.bean.RecordVoiceCategory;
import com.bilibili.studio.videoeditor.extension.p;
import com.bilibili.studio.videoeditor.ms.record.RecordInfo;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/record/fragment/BiliEditorRecordVoiceFragment.class */
@AndroidEntryPoint
public final class BiliEditorRecordVoiceFragment extends Hilt_BiliEditorRecordVoiceFragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public j0 f106887g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ry0.a f106888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public m f106889j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public o f106890k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f106891l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Iq.i f106892m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final PN.a f106893n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final b f106894o;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/record/fragment/BiliEditorRecordVoiceFragment$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final B f106895a;

        public a(B b7) {
            this.f106895a = b7;
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
            return this.f106895a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f106895a.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/record/fragment/BiliEditorRecordVoiceFragment$b.class */
    public static final class b implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorRecordVoiceFragment f106896a;

        public b(BiliEditorRecordVoiceFragment biliEditorRecordVoiceFragment) {
            this.f106896a = biliEditorRecordVoiceFragment;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
            BiliEditorRecordVoiceFragment biliEditorRecordVoiceFragment = this.f106896a;
            if (biliEditorRecordVoiceFragment.f106888i != null) {
                ry0.a.b(i7, biliEditorRecordVoiceFragment.f106887g);
            }
            BiliEditorRecordVoiceFragment biliEditorRecordVoiceFragment2 = this.f106896a;
            if (biliEditorRecordVoiceFragment2.f106888i != null) {
                ry0.a.c(i7, biliEditorRecordVoiceFragment2.f106887g);
            }
            Xy0.f fVar = this.f106896a.kf().f;
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
            Xy0.f fVar = this.f106896a.kf().f;
            RecordInfo recordInfoK = fVar.k();
            if (recordInfoK != null) {
                Ex0.n nVar = fVar.f28427d;
                nVar.j();
                nVar.l(recordInfoK.inPoint, recordInfoK.outPoint);
            }
        }
    }

    public BiliEditorRecordVoiceFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliEditorRecordVoiceFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m10045invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliEditorRecordVoiceFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m10046invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.h = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(sy0.e.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliEditorRecordVoiceFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m10047invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliEditorRecordVoiceFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m10048invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliEditorRecordVoiceFragment$special$$inlined$viewModels$default$4.m10048invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliEditorRecordVoiceFragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m10049invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliEditorRecordVoiceFragment$special$$inlined$viewModels$default$5.m10049invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f106892m = new Iq.i(this, 2);
        this.f106893n = new PN.a(this, 1);
        this.f106894o = new b(this);
    }

    public final sy0.e kf() {
        return (sy0.e) this.h.getValue();
    }

    public final void lf(RecordVoiceCategory recordVoiceCategory, String str) {
        List<RecordVoiceCategory> list;
        int i7;
        RecyclerView recyclerView;
        if (recordVoiceCategory == null) {
            return;
        }
        this.f106891l = false;
        o oVar = this.f106890k;
        if (oVar == null || (list = oVar.f106947b) == null) {
            return;
        }
        int size = 0;
        for (RecordVoiceCategory recordVoiceCategory2 : list) {
            if (Intrinsics.areEqual(recordVoiceCategory2, recordVoiceCategory)) {
                List<RecordVoiceCategory.FxData> children = recordVoiceCategory2.getChildren();
                if (children != null) {
                    Iterator<RecordVoiceCategory.FxData> it = children.iterator();
                    i7 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i7 = -1;
                            break;
                        } else if (Intrinsics.areEqual(it.next().getId(), str)) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                } else {
                    i7 = 0;
                }
                int i8 = size;
                if (i7 > 0) {
                    i8 = size + i7;
                }
                j0 j0Var = this.f106887g;
                RecyclerView.LayoutManager layoutManager = (j0Var == null || (recyclerView = j0Var.f23839i) == null) ? null : recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                size = i8;
                if (linearLayoutManager != null) {
                    linearLayoutManager.scrollToPositionWithOffset(i8, 0);
                    size = i8;
                }
            } else {
                List<RecordVoiceCategory.FxData> children2 = recordVoiceCategory2.getChildren();
                size += children2 != null ? children2.size() : 0;
            }
        }
    }

    public final void mf(String str, boolean z6) {
        RecordVoiceCategory.FxData fxData;
        Object next;
        List list = (List) kf().h.getValue();
        if (list != null) {
            Iterator it = list.iterator();
            int i7 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i7 = -1;
                    break;
                }
                List<RecordVoiceCategory.FxData> children = ((RecordVoiceCategory) it.next()).getChildren();
                if (children != null) {
                    Iterator<T> it2 = children.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                            if (Intrinsics.areEqual(((RecordVoiceCategory.FxData) next).getId(), str)) {
                                break;
                            }
                        }
                    }
                    fxData = (RecordVoiceCategory.FxData) next;
                } else {
                    fxData = null;
                }
                if (fxData != null) {
                    break;
                } else {
                    i7++;
                }
            }
            Integer numValueOf = Integer.valueOf(i7);
            if (i7 <= -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                o oVar = this.f106890k;
                int i8 = oVar != null ? oVar.f106948c : 0;
                if (oVar != null) {
                    oVar.f106948c = iIntValue;
                }
                if (oVar != null) {
                    oVar.notifyItemChanged(i8);
                }
                o oVar2 = this.f106890k;
                if (oVar2 != null) {
                    oVar2.notifyItemChanged(iIntValue);
                }
                j0 j0Var = this.f106887g;
                RecyclerView.LayoutManager layoutManager = j0Var != null ? j0Var.h.getLayoutManager() : null;
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.scrollToPositionWithOffset(iIntValue, 0);
                }
                if (z6) {
                    o oVar3 = this.f106890k;
                    RecordVoiceCategory recordVoiceCategory = null;
                    if (oVar3 != null) {
                        List<RecordVoiceCategory> list2 = oVar3.f106947b;
                        recordVoiceCategory = null;
                        if (list2 != null) {
                            recordVoiceCategory = (RecordVoiceCategory) CollectionsKt.getOrNull(list2, oVar3.f106948c);
                        }
                    }
                    lf(recordVoiceCategory, str);
                }
            }
        }
    }

    public final void nf(int i7) {
        if (i7 == 1) {
            j0 j0Var = this.f106887g;
            p.d(j0Var != null ? j0Var.f23833b : null);
            j0 j0Var2 = this.f106887g;
            p.a(j0Var2 != null ? j0Var2.f23834c : null);
            j0 j0Var3 = this.f106887g;
            RelativeLayout relativeLayout = null;
            if (j0Var3 != null) {
                relativeLayout = j0Var3.f23838g;
            }
            p.a(relativeLayout);
            return;
        }
        if (i7 != 2) {
            j0 j0Var4 = this.f106887g;
            p.a(j0Var4 != null ? j0Var4.f23833b : null);
            j0 j0Var5 = this.f106887g;
            p.a(j0Var5 != null ? j0Var5.f23834c : null);
            j0 j0Var6 = this.f106887g;
            RelativeLayout relativeLayout2 = null;
            if (j0Var6 != null) {
                relativeLayout2 = j0Var6.f23838g;
            }
            p.d(relativeLayout2);
            return;
        }
        j0 j0Var7 = this.f106887g;
        p.a(j0Var7 != null ? j0Var7.f23833b : null);
        j0 j0Var8 = this.f106887g;
        p.d(j0Var8 != null ? j0Var8.f23834c : null);
        j0 j0Var9 = this.f106887g;
        RelativeLayout relativeLayout3 = null;
        if (j0Var9 != null) {
            relativeLayout3 = j0Var9.f23838g;
        }
        p.a(relativeLayout3);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        j0 j0VarInflate = j0.inflate(layoutInflater, viewGroup, false);
        this.f106887g = j0VarInflate;
        return j0VarInflate != null ? j0VarInflate.f23832a : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ry0.a] */
    /* JADX WARN: Type inference failed for: r0v73, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.m] */
    /* JADX WARN: Type inference failed for: r0v90, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.o] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        RecyclerView.ItemAnimator itemAnimator;
        RecyclerView.ItemAnimator itemAnimator2;
        super.onViewCreated(view, bundle);
        ?? obj = new Object();
        ry0.a.a(this.f106887g, requireContext(), this.f106893n, this.f106892m, this.f106894o);
        this.f106888i = obj;
        RecordInfo recordInfoK = kf().f.k();
        int i7 = (int) ((recordInfoK != null ? recordInfoK.volumn : 1.0f) * 100.0f);
        if (this.f106888i != null) {
            ry0.a.b(i7, this.f106887g);
        }
        if (this.f106888i != null) {
            ry0.a.c(i7, Boolean.FALSE);
        }
        j0 j0Var = this.f106887g;
        if (j0Var != null) {
            j0Var.h.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        }
        j0 j0Var2 = this.f106887g;
        if (j0Var2 != null) {
            RecyclerView recyclerView = j0Var2.h;
            BiliEditorRecordVoiceFragment$initCategoryRecycleView$1 biliEditorRecordVoiceFragment$initCategoryRecycleView$1 = new BiliEditorRecordVoiceFragment$initCategoryRecycleView$1(this);
            ?? adapter = new RecyclerView.Adapter();
            adapter.f106946a = biliEditorRecordVoiceFragment$initCategoryRecycleView$1;
            adapter.f106949d = new LinkedHashSet();
            this.f106890k = adapter;
            recyclerView.setAdapter(adapter);
        }
        j0 j0Var3 = this.f106887g;
        if (j0Var3 != null && (itemAnimator2 = j0Var3.h.getItemAnimator()) != null) {
            itemAnimator2.setChangeDuration(0L);
        }
        j0 j0Var4 = this.f106887g;
        if (j0Var4 != null) {
            j0Var4.h.addItemDecoration(new com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.a(this));
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 0, false);
        j0 j0Var5 = this.f106887g;
        if (j0Var5 != null) {
            j0Var5.f23839i.setLayoutManager(linearLayoutManager);
        }
        j0 j0Var6 = this.f106887g;
        if (j0Var6 != null) {
            RecyclerView recyclerView2 = j0Var6.f23839i;
            BiliEditorRecordVoiceFragment$initVoiceItemRecycleView$1 biliEditorRecordVoiceFragment$initVoiceItemRecycleView$1 = new BiliEditorRecordVoiceFragment$initVoiceItemRecycleView$1(this);
            ?? adapter2 = new RecyclerView.Adapter();
            adapter2.f106936a = biliEditorRecordVoiceFragment$initVoiceItemRecycleView$1;
            adapter2.f106939d = new LinkedHashSet();
            this.f106889j = adapter2;
            recyclerView2.setAdapter(adapter2);
        }
        j0 j0Var7 = this.f106887g;
        if (j0Var7 != null && (itemAnimator = j0Var7.f23839i.getItemAnimator()) != null) {
            itemAnimator.setChangeDuration(0L);
        }
        j0 j0Var8 = this.f106887g;
        if (j0Var8 != null) {
            j0Var8.f23839i.addItemDecoration(new com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.b(this));
        }
        j0 j0Var9 = this.f106887g;
        if (j0Var9 != null) {
            j0Var9.f23839i.addOnScrollListener(new c(this, linearLayoutManager));
        }
        j0 j0Var10 = this.f106887g;
        if (j0Var10 != null) {
            j0Var10.f23841k.setOnClickListener(new PN.b(this, 2));
        }
        kf().K0();
        m mVar = this.f106889j;
        if (mVar != null) {
            mVar.notifyDataSetChanged();
        }
        nf(1);
        kf().h.observe(getViewLifecycleOwner(), new a(new B(this, 2)));
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.RECORD_FX;
    }
}
