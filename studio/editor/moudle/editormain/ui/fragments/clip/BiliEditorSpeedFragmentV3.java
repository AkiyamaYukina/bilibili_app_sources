package com.bilibili.studio.editor.moudle.editormain.ui.fragments.clip;

import AC0.i;
import RT.x;
import TB0.W;
import Wh1.h;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.droid.ToastHelper;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoClip;
import com.bilibili.studio.videoeditor.help.widget.SpeedGrillViewV2;
import com.bilibili.studio.videoeditor.util.VibratorUtils;
import com.tencent.bugly.BuglyStrategy;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/clip/BiliEditorSpeedFragmentV3.class */
@AndroidEntryPoint
public final class BiliEditorSpeedFragmentV3 extends Hilt_BiliEditorSpeedFragmentV3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public W f106755g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f106756i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f106757j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f106758k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final a f106759l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/clip/BiliEditorSpeedFragmentV3$a.class */
    public static final class a implements SpeedGrillViewV2.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorSpeedFragmentV3 f106760a;

        public a(BiliEditorSpeedFragmentV3 biliEditorSpeedFragmentV3) {
            this.f106760a = biliEditorSpeedFragmentV3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bilibili.studio.videoeditor.help.widget.SpeedGrillViewV2.c
        public final void a(float f7) {
            BiliEditorSpeedFragmentV3 biliEditorSpeedFragmentV3 = this.f106760a;
            if (f7 == biliEditorSpeedFragmentV3.kf().k) {
                return;
            }
            biliEditorSpeedFragmentV3.kf().d.f19412b.j();
            BClip bClip = (BClip) biliEditorSpeedFragmentV3.kf().g.getValue();
            if (bClip == null) {
                BLog.e("BiliEditorSpeedFragmentV3", "clipSelect is null ");
                return;
            }
            if (bClip.getRoleInTheme() != 0) {
                ToastHelper.showToastShort(biliEditorSpeedFragmentV3.getApplicationContext(), 2131841808);
                W w7 = biliEditorSpeedFragmentV3.f106755g;
                if (w7 != null) {
                    w7.f23701g.setNowSelect(bClip.playRate);
                    return;
                }
                return;
            }
            if (bClip.isFakeClip()) {
                ToastHelper.showToastShort(biliEditorSpeedFragmentV3.getApplicationContext(), 2131841879);
                W w8 = biliEditorSpeedFragmentV3.f106755g;
                if (w8 != null) {
                    w8.f23701g.setNowSelect(bClip.playRate);
                    return;
                }
                return;
            }
            if (f7 % 1 == 0.0f) {
                VibratorUtils.vibrateOnAdsorb(biliEditorSpeedFragmentV3.getContext());
            }
            if (f7 > biliEditorSpeedFragmentV3.f106758k) {
                ToastHelper.showToastLong(biliEditorSpeedFragmentV3.getApplicationContext(), 2131842229);
                biliEditorSpeedFragmentV3.kf().K0(biliEditorSpeedFragmentV3.f106758k);
                W w9 = biliEditorSpeedFragmentV3.f106755g;
                if (w9 != null) {
                    w9.f23701g.setNowSelect(biliEditorSpeedFragmentV3.f106758k);
                }
            } else {
                biliEditorSpeedFragmentV3.kf().K0(f7);
            }
            if (f7 == biliEditorSpeedFragmentV3.f106756i) {
                ToastHelper.showToastLong(biliEditorSpeedFragmentV3.getApplicationContext(), 2131841987);
            }
            fy0.a aVarKf = biliEditorSpeedFragmentV3.kf();
            int i7 = biliEditorSpeedFragmentV3.kf().i;
            EditVideoClip editVideoClipJ = aVarKf.c.f19428d.j();
            BClip bClip2 = null;
            if (editVideoClipJ != null) {
                List<BClip> bClipList = editVideoClipJ.getBClipList();
                bClip2 = (bClipList != null && i7 < bClipList.size()) ? bClipList.get(i7) : null;
            }
            if (bClip2 != null) {
                biliEditorSpeedFragmentV3.kf().j = false;
                biliEditorSpeedFragmentV3.kf().d.f19412b.l(bClip2.getInPoint(), bClip2.getOutPoint());
                W w10 = biliEditorSpeedFragmentV3.f106755g;
                if (w10 != null) {
                    w10.f23700f.setText(i.b(bClip2.getDuration(true)));
                }
            }
            biliEditorSpeedFragmentV3.lf();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bilibili.studio.videoeditor.help.widget.SpeedGrillViewV2.c
        public final void b() {
            BiliEditorSpeedFragmentV3 biliEditorSpeedFragmentV3 = this.f106760a;
            biliEditorSpeedFragmentV3.kf().d.f19412b.j();
            fy0.a aVarKf = biliEditorSpeedFragmentV3.kf();
            BClip bClip = (BClip) biliEditorSpeedFragmentV3.kf().g.getValue();
            aVarKf.k = bClip != null ? bClip.playRate : 1.0f;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/clip/BiliEditorSpeedFragmentV3$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f106761a;

        public b(x xVar) {
            this.f106761a = xVar;
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
            return this.f106761a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f106761a.invoke(obj);
        }
    }

    public BiliEditorSpeedFragmentV3() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.clip.BiliEditorSpeedFragmentV3$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m9989invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.clip.BiliEditorSpeedFragmentV3$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m9990invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.h = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(fy0.a.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.clip.BiliEditorSpeedFragmentV3$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m9991invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.clip.BiliEditorSpeedFragmentV3$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m9992invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.clip.BiliEditorSpeedFragmentV3$special$$inlined$viewModels$default$4.m9992invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.clip.BiliEditorSpeedFragmentV3$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m9993invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.clip.BiliEditorSpeedFragmentV3$special$$inlined$viewModels$default$5.m9993invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f106756i = 8.0f;
        this.f106757j = BuglyStrategy.a.MAX_USERDATA_VALUE_LENGTH;
        this.f106758k = 8.0f;
        this.f106759l = new a(this);
    }

    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment, fz0.InterfaceC7206a
    public final void La(@NotNull Function1<? super Boolean, Unit> function1) {
        kf().c.i();
        function1.invoke(Boolean.TRUE);
    }

    public final fy0.a kf() {
        return (fy0.a) this.h.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void lf() {
        BClip bClip = (BClip) kf().g.getValue();
        if (bClip != null) {
            float outPoint = bClip.getOutPoint() - bClip.getInPoint();
            float f7 = this.f106757j;
            float f8 = this.f106756i;
            if (outPoint < f7 * f8) {
                this.f106758k = RangesKt.coerceAtMost(((bClip.getOutPoint() - bClip.getInPoint()) * bClip.playRate) / this.f106757j, this.f106756i);
            } else {
                this.f106758k = f8;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        W wInflate = W.inflate(layoutInflater, viewGroup, false);
        this.f106755g = wInflate;
        return wInflate != null ? wInflate.f23695a : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View$OnClickListener, java.lang.Object] */
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
        ConstraintLayout constraintLayout;
        super.onViewCreated(view, bundle);
        W w7 = this.f106755g;
        if (w7 != null) {
            w7.f23696b.setOnClickListener(new com.bilibili.bplus.followinglist.page.opus.onlyfans.a(2, this));
        }
        W w8 = this.f106755g;
        if (w8 != null && (constraintLayout = w8.f23695a) != 0) {
            constraintLayout.setOnClickListener(new Object());
        }
        W w9 = this.f106755g;
        if (w9 != null) {
            w9.f23701g.setOnSpeedListener(this.f106759l);
        }
        W w10 = this.f106755g;
        if (w10 != null) {
            w10.f23701g.post(new h(this, 1));
        }
        W w11 = this.f106755g;
        if (w11 != null) {
            w11.f23699e.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.clip.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliEditorSpeedFragmentV3 f106777a;

                {
                    this.f106777a = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BiliEditorSpeedFragmentV3 biliEditorSpeedFragmentV3 = this.f106777a;
                    fy0.a aVarKf = biliEditorSpeedFragmentV3.kf();
                    aVarKf.K0(aVarKf.h);
                    W w12 = biliEditorSpeedFragmentV3.f106755g;
                    if (w12 != null) {
                        w12.f23701g.setNowSelect(biliEditorSpeedFragmentV3.kf().h);
                    }
                    BClip bClip = (BClip) biliEditorSpeedFragmentV3.kf().g.getValue();
                    if (bClip != null) {
                        biliEditorSpeedFragmentV3.kf().j = false;
                        fy0.a aVarKf2 = biliEditorSpeedFragmentV3.kf();
                        aVarKf2.d.f19412b.l(bClip.getInPoint(), bClip.getOutPoint());
                        W w13 = biliEditorSpeedFragmentV3.f106755g;
                        if (w13 != null) {
                            w13.f23700f.setText(i.b(bClip.getDuration(true)));
                        }
                    }
                }
            });
        }
        kf().g.observe(getViewLifecycleOwner(), new b(new x(this, 3)));
        fy0.a aVarKf = kf();
        aVarKf.c.f19427c.a(aVarKf.l, "ClipSpeedUseCase");
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.CLIP;
    }
}
