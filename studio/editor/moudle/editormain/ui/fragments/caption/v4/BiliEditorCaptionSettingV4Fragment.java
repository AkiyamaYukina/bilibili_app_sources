package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

import UC0.n;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import bx0.C5168a;
import bx0.C5169b;
import bx0.C5170c;
import com.bilibili.base.MainThread;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.studio.config.UpperFawkesDeviceDecision;
import com.bilibili.studio.editor.moudle.caption.setting.widget.UpperPagerSlidingTabStrip;
import com.bilibili.studio.editor.moudle.caption.setting.widget.a;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionBean;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.editor.moudle.caption.v1.net.SubtitleWithCategoryBean;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.videoeditor.bean.CaptionFontEntity;
import com.bilibili.studio.videoeditor.bean.EditorMaterialEntity;
import com.bilibili.studio.videoeditor.util.C6634g;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.studio.videoeditor.util.ScreenUtil;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import lB0.a;
import lB0.a$b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sx0.InterfaceC8632a;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/BiliEditorCaptionSettingV4Fragment.class */
@AndroidEntryPoint
public final class BiliEditorCaptionSettingV4Fragment extends Hilt_BiliEditorCaptionSettingV4Fragment implements View.OnClickListener, a.b, TextWatcher {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public InterfaceC8632a f106494A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f106495B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public String f106496C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f106497D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f106498E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public com.bilibili.studio.editor.moudle.caption.setting.widget.a f106499F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f106500G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f106501H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f106502I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f106503J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final ArrayList<String> f106504K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public a.a f106505L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f106506M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f106507N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f106508O;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ImageView f106509g;

    @Nullable
    public ImageView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public EditText f106510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public TextView f106511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public ImageView f106512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public FrameLayout f106513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public ViewPager f106514m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public TextView f106515n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public View f106516o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public View f106517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public View f106518q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public View f106519r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public View f106520s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public ax0.d f106521t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public BiliEditorCaptionTemplateV4Fragment f106522u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public BiliEditorCaptionFontV4Fragment f106523v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public BiliEditorCaptionStyleV4Fragment f106524w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public BiliEditorCaptionFlowerV4Fragment f106525x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public BiliEditorCaptionAnimationV4Fragment f106526y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Lazy f106527z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/BiliEditorCaptionSettingV4Fragment$a.class */
    public static final class a implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorCaptionSettingV4Fragment f106528a;

        public a(BiliEditorCaptionSettingV4Fragment biliEditorCaptionSettingV4Fragment) {
            this.f106528a = biliEditorCaptionSettingV4Fragment;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i7) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i7, float f7, int i8) {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onPageSelected(int r8) {
            /*
                Method dump skipped, instruction units count: 337
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionSettingV4Fragment.a.onPageSelected(int):void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/BiliEditorCaptionSettingV4Fragment$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f106529a;

        public b(Function1 function1) {
            this.f106529a = function1;
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
            return this.f106529a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f106529a.invoke(obj);
        }
    }

    public BiliEditorCaptionSettingV4Fragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionSettingV4Fragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m9959invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionSettingV4Fragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m9960invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f106527z = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.u.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionSettingV4Fragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m9961invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionSettingV4Fragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m9962invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionSettingV4Fragment$special$$inlined$viewModels$default$4.m9962invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionSettingV4Fragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m9963invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionSettingV4Fragment$special$$inlined$viewModels$default$5.m9963invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f106495B = 60;
        this.f106504K = new ArrayList<>();
        this.f106507N = true;
    }

    public static long lf(long j7) {
        if (j7 == 0) {
            return 3000000L;
        }
        return j7 < 1000 ? 1000000L : j7 * 1000;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
        String string;
        if (editable == null || (string = editable.toString()) == null) {
            return;
        }
        if (!Intrinsics.areEqual(string, this.f106496C)) {
            wf();
        }
        int length = string.length();
        ImageView imageView = this.f106512k;
        if (imageView != null) {
            imageView.setVisibility(length != 0 ? 0 : 8);
        }
        xf(string);
        InterfaceC8632a interfaceC8632a = this.f106494A;
        if (interfaceC8632a != null) {
            String string2 = editable.toString();
            String strA = string2;
            if (string2.length() == 0) {
                strA = Zw0.a.a();
            }
            interfaceC8632a.a(strA, Intrinsics.areEqual(strA, Zw0.a.a()), this.f106503J, Boolean.valueOf(!this.f106508O));
            this.f106508O = false;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i7, int i8, int i9) {
    }

    public final void kf(String str) {
        if (TextUtils.isEmpty(str)) {
            Ny0.g gVar = mf().f106732f;
            long jZ = gVar.f17501d.z();
            CaptionInfo captionInfo = gVar.f17502e.f17480f;
            if (captionInfo != null && Math.abs(jZ - captionInfo.inPoint) <= 50000) {
                uf(false);
                vf(false);
                return;
            }
        }
        uf(true);
        vf(true);
    }

    public final com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.u mf() {
        return (com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.u) this.f106527z.getValue();
    }

    public final void nf() {
        Window window;
        View decorView;
        IBinder windowToken;
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 == null || (window = fragmentActivityP3.getWindow()) == null || (decorView = window.getDecorView()) == null || (windowToken = decorView.getWindowToken()) == null) {
            return;
        }
        this.f106500G = this.f106501H;
        InputMethodManager inputMethodManager = (InputMethodManager) fragmentActivityP3.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
    }

    public final void of() {
        Editable editableText;
        final String string;
        EditText editText = this.f106510i;
        if (editText == null || (editableText = editText.getEditableText()) == null || (string = editableText.toString()) == null) {
            return;
        }
        EditText editText2 = this.f106510i;
        final int selectionStart = editText2 != null ? editText2.getSelectionStart() : 0;
        MainThread.postOnMainThread(new Function0(this, string, selectionStart) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.w

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorCaptionSettingV4Fragment f106632a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f106633b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f106634c;

            {
                this.f106632a = this;
                this.f106633b = string;
                this.f106634c = selectionStart;
            }

            public final Object invoke() {
                EditText editText3;
                Editable text;
                BiliEditorCaptionSettingV4Fragment biliEditorCaptionSettingV4Fragment = this.f106632a;
                EditText editText4 = biliEditorCaptionSettingV4Fragment.f106510i;
                if (editText4 != null) {
                    editText4.setText(this.f106633b);
                }
                EditText editText5 = biliEditorCaptionSettingV4Fragment.f106510i;
                int length = (editText5 == null || (text = editText5.getText()) == null) ? 0 : text.length();
                int i7 = this.f106634c;
                if (i7 <= length && (editText3 = biliEditorCaptionSettingV4Fragment.f106510i) != null) {
                    editText3.setSelection(i7);
                }
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02bd  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(@org.jetbrains.annotations.Nullable android.view.View r9) {
        /*
            Method dump skipped, instruction units count: 2455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionSettingV4Fragment.onClick(android.view.View):void");
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        if (context != null) {
            Point screenRealSize = ScreenUtil.getScreenRealSize(context);
            this.f106501H = DensityUtil.dp2px(309.0f);
            this.f106502I = (int) (screenRealSize.y * 0.6f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131501682, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar = this.f106499F;
        if (aVar != null) {
            aVar.a();
        }
        a.a aVar2 = null;
        this.f106522u = null;
        this.f106523v = null;
        this.f106524w = null;
        this.f106526y = null;
        this.f106525x = null;
        a.a aVar3 = this.f106505L;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contract");
        } else {
            aVar2 = aVar3;
        }
        aVar2.a();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentHide(@NotNull Flag flag) {
        super.onFragmentHide(flag);
        if (isAdded() && !isDetached()) {
            tf(0);
            px0.e.d(getContext());
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        super.onFragmentShow(flag);
        if (!isAdded() || isDetached()) {
            return;
        }
        yf();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar = this.f106499F;
        if (aVar != null) {
            aVar.f106004b = this;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i7, int i8, int i9) {
    }

    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view, bundle);
        this.f106509g = (ImageView) view.findViewById(2131304293);
        this.h = (ImageView) view.findViewById(2131318549);
        this.f106510i = (EditText) view.findViewById(2131301194);
        this.f106511j = (TextView) view.findViewById(2131315566);
        this.f106512k = (ImageView) view.findViewById(2131304132);
        this.f106513l = (FrameLayout) view.findViewById(2131301641);
        this.f106514m = (ViewPager) view.findViewById(2131316429);
        this.f106515n = (TextView) view.findViewById(2131314159);
        View view2 = getView();
        this.f106520s = view2 != null ? view2.findViewById(2131318566) : null;
        View view3 = getView();
        this.f106516o = view3 != null ? view3.findViewById(2131318562) : null;
        View view4 = getView();
        this.f106517p = view4 != null ? view4.findViewById(2131318561) : null;
        View view5 = getView();
        this.f106518q = view5 != null ? view5.findViewById(2131318563) : null;
        View view6 = getView();
        this.f106519r = view6 != null ? view6.findViewById(2131319363) : null;
        TextView textView = this.f106515n;
        if (textView != null) {
            textView.setVisibility(0);
        }
        UpperPagerSlidingTabStrip upperPagerSlidingTabStrip = (UpperPagerSlidingTabStrip) view.findViewById(2131312846);
        upperPagerSlidingTabStrip.setAllCaps(false);
        ArrayList arrayList = new ArrayList();
        BiliEditorCaptionTemplateV4Fragment biliEditorCaptionTemplateV4Fragment = new BiliEditorCaptionTemplateV4Fragment();
        arrayList.add(biliEditorCaptionTemplateV4Fragment);
        this.f106522u = biliEditorCaptionTemplateV4Fragment;
        BiliEditorCaptionFontV4Fragment biliEditorCaptionFontV4Fragment = new BiliEditorCaptionFontV4Fragment();
        biliEditorCaptionFontV4Fragment.f106491l = true;
        arrayList.add(biliEditorCaptionFontV4Fragment);
        this.f106523v = biliEditorCaptionFontV4Fragment;
        BiliEditorCaptionStyleV4Fragment biliEditorCaptionStyleV4Fragment = new BiliEditorCaptionStyleV4Fragment();
        arrayList.add(biliEditorCaptionStyleV4Fragment);
        this.f106524w = biliEditorCaptionStyleV4Fragment;
        if (DeviceDecision.INSTANCE.getBoolean("upper.caption_anim_renderer_feature_enable", true)) {
            BiliEditorCaptionFlowerV4Fragment biliEditorCaptionFlowerV4Fragment = new BiliEditorCaptionFlowerV4Fragment();
            arrayList.add(biliEditorCaptionFlowerV4Fragment);
            this.f106525x = biliEditorCaptionFlowerV4Fragment;
            BiliEditorCaptionAnimationV4Fragment biliEditorCaptionAnimationV4Fragment = new BiliEditorCaptionAnimationV4Fragment();
            arrayList.add(biliEditorCaptionAnimationV4Fragment);
            this.f106526y = biliEditorCaptionAnimationV4Fragment;
        }
        ax0.d dVar = new ax0.d(getChildFragmentManager(), 1);
        dVar.f54266b = CollectionsKt.arrayListOf(new String[]{getString(2131842022), getString(2131841805), getString(2131841918), getString(2131841923), getString(2131842085)});
        dVar.f54267c = arrayList;
        this.f106521t = dVar;
        ViewPager viewPager = this.f106514m;
        if (viewPager != null) {
            viewPager.setOffscreenPageLimit(4);
            viewPager.setAdapter(this.f106521t);
        }
        upperPagerSlidingTabStrip.setIndicatorColorResource(2131104720);
        upperPagerSlidingTabStrip.setViewPager(this.f106514m);
        upperPagerSlidingTabStrip.setOnTabClickListener(new UpperPagerSlidingTabStrip.e(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.E

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorCaptionSettingV4Fragment f106555a;

            {
                this.f106555a = this;
            }

            @Override // com.bilibili.studio.editor.moudle.caption.setting.widget.UpperPagerSlidingTabStrip.e
            public final void onTabClick() {
                this.f106555a.nf();
            }
        });
        upperPagerSlidingTabStrip.setOnPageReselectedListener(new YO.e(this));
        EditText editText = this.f106510i;
        if (editText != null) {
            editText.addTextChangedListener(this);
        }
        ImageView imageView = this.f106512k;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        ImageView imageView2 = this.f106509g;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        ImageView imageView3 = this.h;
        if (imageView3 != null) {
            imageView3.setOnClickListener(this);
        }
        TextView textView2 = this.f106515n;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        View view7 = this.f106517p;
        if (view7 != null) {
            view7.setOnClickListener(this);
        }
        View view8 = this.f106519r;
        if (view8 != null) {
            view8.setOnClickListener(this);
        }
        view.findViewById(2131318563).setOnClickListener(this);
        FrameLayout frameLayout = this.f106513l;
        this.f106500G = (frameLayout == null || (layoutParams = frameLayout.getLayoutParams()) == null) ? this.f106501H : layoutParams.height;
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            this.f106497D = ThemeUtils.getColorById(fragmentActivityP3, 2131100371);
            this.f106498E = ThemeUtils.getColorById(fragmentActivityP3, 2131100370);
            this.f106499F = new com.bilibili.studio.editor.moudle.caption.setting.widget.a(fragmentActivityP3);
            view.post(new Lk0.f(this, 1));
        }
        ex0.a.a = false;
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            Serializable serializable = arguments != null ? arguments.getSerializable("args_caption") : null;
            CaptionInfo captionInfo = serializable instanceof CaptionInfo ? (CaptionInfo) serializable : null;
            Bundle arguments2 = getArguments();
            int i7 = arguments2 != null ? arguments2.getInt("args_tab_index", 0) : 0;
            Bundle arguments3 = getArguments();
            boolean z6 = arguments3 != null ? arguments3.getBoolean("args_need_keyboard", false) : false;
            if (captionInfo != null) {
                qf(captionInfo, captionInfo.text.length());
            }
            if (z6) {
                sf();
            }
            tf(i7);
        }
        mf().f106734i.observe(getViewLifecycleOwner(), new b(new U60.M(this, 4)));
        mf().f106735j.observe(getViewLifecycleOwner(), new b(new U60.N(this, 3)));
        mf().f106736k.observe(getViewLifecycleOwner(), new b(new Zx0.d(this, 2)));
        mf().f106737l.observe(getViewLifecycleOwner(), new b(new Ln.b(this, 1)));
        mf().f106738m.observe(getViewLifecycleOwner(), new b(new com.bilibili.pegasus.components.interest.ui.v37.page.c(this, 1)));
        mf().f106739n.observe(getViewLifecycleOwner(), new b(new com.bilibili.bplus.followinglist.page.opus.articellist.o(this, 2)));
        mf().f106740o.observe(getViewLifecycleOwner(), new b(new com.bilibili.lib.fasthybrid.playlet.native.viewmodel.q(this, 1)));
        mf().f106742q.observe(getViewLifecycleOwner(), new b(new Cw0.f(this, 1)));
        mf().f106743r.observe(getViewLifecycleOwner(), new b(new Cw0.g(this, 2)));
        mf().f106741p.observe(getViewLifecycleOwner(), new b(new com.bilibili.lib.fasthybrid.playlet.native.viewmodel.t(this, 1)));
        EditorMaterialEntity editorMaterialEntity = mf().f106730d.r().f57122a;
        if (editorMaterialEntity != null) {
            pf(editorMaterialEntity);
        } else {
            Lazy<UC0.n> lazy = UC0.n.f24629b;
            n.a.a().d(new U70.b(this, 4), new A00.g(1), new Cw0.m(this, 4));
        }
        lB0.a aVarA = lB0.a.a();
        a$b a_b = new a$b(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.D

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorCaptionSettingV4Fragment f106554a;

            {
                this.f106554a = this;
            }

            @Override // lB0.a$b
            public final void onBusEvent(Object obj) {
                BiliEditorCaptionSettingV4Fragment biliEditorCaptionSettingV4Fragment = this.f106554a;
                biliEditorCaptionSettingV4Fragment.getClass();
                String str = ((cx0.a) obj).f;
                if (str != null) {
                    biliEditorCaptionSettingV4Fragment.rf(str);
                }
            }
        };
        aVarA.getClass();
        this.f106505L = lB0.a.b(cx0.a.class, a_b);
        Xz0.d dVar2 = Xz0.d.f28458a;
        dVar2.getClass();
        Xz0.d.c("editor");
        ax0.d dVar3 = this.f106521t;
        String string = null;
        if (dVar3 != null) {
            CharSequence pageTitle = dVar3.getPageTitle(0);
            string = null;
            if (pageTitle != null) {
                string = pageTitle.toString();
            }
        }
        if (string != null && !this.f106504K.contains(string)) {
            dVar2.getClass();
            Xz0.d.O(string);
            this.f106504K.add(string);
        }
        ViewPager viewPager2 = this.f106514m;
        if (viewPager2 != null) {
            viewPager2.addOnPageChangeListener(new a(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x021d  */
    @Override // com.bilibili.studio.editor.moudle.caption.setting.widget.a.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p2(int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionSettingV4Fragment.p2(int, int):void");
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.Comparator] */
    public final void pf(EditorMaterialEntity editorMaterialEntity) {
        List<SubtitleWithCategoryBean> list = editorMaterialEntity.subtitleWithCategoryBeanList;
        List<CaptionBean.SubtitleBean> list2 = editorMaterialEntity.subtitle;
        List<SubtitleWithCategoryBean> arrayList = list;
        if (list == null) {
            arrayList = new ArrayList();
        }
        if (arrayList.size() == 0) {
            SubtitleWithCategoryBean subtitleWithCategoryBean = new SubtitleWithCategoryBean();
            subtitleWithCategoryBean.subTitleList = list2;
            arrayList.add(subtitleWithCategoryBean);
        }
        if (getContext() != null) {
            List listC = OC0.h.C();
            Map<String, CaptionListItem> mapH = OC0.h.H();
            ArrayList arrayList2 = new ArrayList();
            int i7 = 0;
            for (Object obj : arrayList) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                SubtitleWithCategoryBean subtitleWithCategoryBean2 = (SubtitleWithCategoryBean) obj;
                if (com.bilibili.studio.videoeditor.util.V.d(subtitleWithCategoryBean2.subTitleList)) {
                    ArrayList arrayList3 = new ArrayList();
                    if (i7 == 0) {
                        arrayList3.addAll(listC);
                        Iterator it = ((ArrayList) listC).iterator();
                        while (it.hasNext()) {
                            ((CaptionListItem) it.next()).setCategory(subtitleWithCategoryBean2.name);
                        }
                    }
                    for (CaptionBean.SubtitleBean subtitleBean : subtitleWithCategoryBean2.subTitleList) {
                        String str = subtitleBean.downloadUrlAurora;
                        String strQ = OC0.h.q(OC0.h.o(str));
                        String str2 = subtitleBean.cover;
                        int i8 = subtitleBean.rank;
                        if (!TextUtils.isEmpty(str)) {
                            CaptionListItem captionListItem = new CaptionListItem();
                            captionListItem.setId(subtitleBean.id);
                            captionListItem.setCategory(subtitleWithCategoryBean2.name);
                            captionListItem.setMax(subtitleBean.max);
                            captionListItem.setLocal(false);
                            captionListItem.setUrl(str);
                            captionListItem.setImageHttp(str2);
                            captionListItem.setIndex(i8);
                            captionListItem.setTmpName(subtitleBean.name);
                            captionListItem.setDuration(lf(subtitleBean.duration));
                            captionListItem.setTempType(subtitleBean.textAttr);
                            captionListItem.setTempFormat(subtitleBean.textFmt);
                            captionListItem.setFontId(subtitleBean.fontId);
                            captionListItem.setFontScale(subtitleBean.fontScale);
                            captionListItem.setFontColor(C6634g.b(subtitleBean.fontColor));
                            captionListItem.setOutlineColor(C6634g.b(subtitleBean.outlineColor));
                            captionListItem.setOutlineWidth(subtitleBean.outlineWidth);
                            if (UpperFawkesDeviceDecision.b()) {
                                captionListItem.setInAnimId(subtitleBean.inAnimId);
                                captionListItem.setOutAnimId(subtitleBean.outAnimId);
                                if (captionListItem.getInAnimId() <= 0 && captionListItem.getOutAnimId() <= 0) {
                                    captionListItem.setCircleAnimId(subtitleBean.circleAnimId);
                                }
                            }
                            HashMap map = (HashMap) mapH;
                            CaptionListItem captionListItem2 = map.containsKey(strQ) ? (CaptionListItem) map.get(strQ) : map.containsKey(String.valueOf(subtitleBean.id)) ? (CaptionListItem) map.get(String.valueOf(subtitleBean.id)) : null;
                            if (captionListItem2 != null) {
                                captionListItem.setDownloaded(true);
                                captionListItem.captionAssetBean = captionListItem2.captionAssetBean;
                            } else {
                                captionListItem.setDownloaded(false);
                            }
                            arrayList3.add(captionListItem);
                        }
                    }
                    String str3 = subtitleWithCategoryBean2.name;
                    String str4 = str3;
                    if (str3 == null) {
                        str4 = "";
                    }
                    arrayList2.add(new C5170c(str4, arrayList3));
                }
                i7++;
            }
            BiliEditorCaptionTemplateV4Fragment biliEditorCaptionTemplateV4Fragment = this.f106522u;
            if (biliEditorCaptionTemplateV4Fragment != null) {
                biliEditorCaptionTemplateV4Fragment.jf(new YN0.O(1, this, arrayList2));
            }
        }
        List<SubtitleWithCategoryBean> list3 = editorMaterialEntity.flowerWithCategoryBeanList;
        List<SubtitleWithCategoryBean> arrayList4 = list3;
        if (list3 == null) {
            arrayList4 = new ArrayList();
        }
        Map<String, CaptionListItem> mapE = OC0.h.E();
        ArrayList arrayList5 = new ArrayList();
        int i9 = 0;
        for (Object obj2 : arrayList4) {
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            SubtitleWithCategoryBean subtitleWithCategoryBean3 = (SubtitleWithCategoryBean) obj2;
            if (com.bilibili.studio.videoeditor.util.V.d(subtitleWithCategoryBean3.subTitleList)) {
                ArrayList arrayList6 = new ArrayList();
                for (CaptionBean.SubtitleBean subtitleBean2 : subtitleWithCategoryBean3.subTitleList) {
                    String str5 = subtitleBean2.downloadUrlAurora;
                    String strQ2 = OC0.h.q(OC0.h.o(str5));
                    String str6 = subtitleBean2.cover;
                    int i10 = subtitleBean2.rank;
                    if (!TextUtils.isEmpty(str5)) {
                        CaptionListItem captionListItem3 = new CaptionListItem();
                        captionListItem3.setId(subtitleBean2.id);
                        captionListItem3.setCategory(subtitleWithCategoryBean3.name);
                        captionListItem3.setMax(subtitleBean2.max);
                        captionListItem3.setLocal(false);
                        captionListItem3.setUrl(str5);
                        captionListItem3.setImageHttp(str6);
                        captionListItem3.setIndex(i10);
                        captionListItem3.setTmpName(subtitleBean2.name);
                        captionListItem3.setDuration(lf(subtitleBean2.duration));
                        captionListItem3.setTempType(subtitleBean2.textAttr);
                        captionListItem3.setTempFormat(subtitleBean2.textFmt);
                        captionListItem3.setFontId(subtitleBean2.fontId);
                        captionListItem3.setFontScale(subtitleBean2.fontScale);
                        captionListItem3.setFontColor(C6634g.b(subtitleBean2.fontColor));
                        captionListItem3.setOutlineColor(C6634g.b(subtitleBean2.outlineColor));
                        captionListItem3.setOutlineWidth(subtitleBean2.outlineWidth);
                        HashMap map2 = (HashMap) mapE;
                        CaptionListItem captionListItem4 = map2.containsKey(strQ2) ? (CaptionListItem) map2.get(strQ2) : map2.containsKey(String.valueOf(subtitleBean2.id)) ? (CaptionListItem) map2.get(String.valueOf(subtitleBean2.id)) : null;
                        if (captionListItem4 != null) {
                            captionListItem3.setDownloaded(true);
                            captionListItem3.captionAssetBean = captionListItem4.captionAssetBean;
                        } else {
                            captionListItem3.setDownloaded(false);
                        }
                        arrayList6.add(captionListItem3);
                    }
                }
                String str7 = subtitleWithCategoryBean3.name;
                String str8 = str7;
                if (str7 == null) {
                    str8 = "";
                }
                arrayList5.add(new C5169b(str8, arrayList6));
            }
            i9++;
        }
        BiliEditorCaptionFlowerV4Fragment biliEditorCaptionFlowerV4Fragment = this.f106525x;
        if (biliEditorCaptionFlowerV4Fragment != null) {
            biliEditorCaptionFlowerV4Fragment.jf(new bT0.k(this, arrayList5, 1));
        }
        List<SubtitleWithCategoryBean> list4 = editorMaterialEntity.motionWithCategoryBeanList;
        List<SubtitleWithCategoryBean> arrayList7 = list4;
        if (list4 == null) {
            arrayList7 = new ArrayList();
        }
        Map<String, CaptionListItem> mapB = OC0.h.B();
        final ArrayList arrayList8 = new ArrayList();
        int i11 = 0;
        for (Object obj3 : arrayList7) {
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            SubtitleWithCategoryBean subtitleWithCategoryBean4 = (SubtitleWithCategoryBean) obj3;
            if (com.bilibili.studio.videoeditor.util.V.d(subtitleWithCategoryBean4.subTitleList)) {
                ArrayList arrayList9 = new ArrayList();
                for (CaptionBean.SubtitleBean subtitleBean3 : subtitleWithCategoryBean4.subTitleList) {
                    String str9 = subtitleBean3.downloadUrlAurora;
                    String strQ3 = OC0.h.q(OC0.h.o(str9));
                    String str10 = subtitleBean3.cover;
                    int i12 = subtitleBean3.rank;
                    if (!TextUtils.isEmpty(str9)) {
                        CaptionListItem captionListItem5 = new CaptionListItem();
                        captionListItem5.setId(subtitleBean3.id);
                        captionListItem5.setCategory(subtitleWithCategoryBean4.name);
                        captionListItem5.setMax(subtitleBean3.max);
                        captionListItem5.setLocal(false);
                        captionListItem5.setUrl(str9);
                        captionListItem5.setImageHttp(str10);
                        captionListItem5.setIndex(i12);
                        captionListItem5.setTmpName(subtitleBean3.name);
                        captionListItem5.setDuration(lf(subtitleBean3.duration));
                        captionListItem5.setTempType(subtitleBean3.textAttr);
                        captionListItem5.setTempFormat(subtitleBean3.textFmt);
                        captionListItem5.setAnimId(Integer.valueOf(subtitleBean3.id));
                        captionListItem5.setFontId(subtitleBean3.fontId);
                        captionListItem5.setFontScale(subtitleBean3.fontScale);
                        captionListItem5.setFontColor(C6634g.b(subtitleBean3.fontColor));
                        captionListItem5.setOutlineColor(C6634g.b(subtitleBean3.outlineColor));
                        captionListItem5.setOutlineWidth(subtitleBean3.outlineWidth);
                        HashMap map3 = (HashMap) mapB;
                        CaptionListItem captionListItem6 = map3.containsKey(strQ3) ? (CaptionListItem) map3.get(strQ3) : map3.containsKey(String.valueOf(subtitleBean3.id)) ? (CaptionListItem) map3.get(String.valueOf(subtitleBean3.id)) : null;
                        if (captionListItem6 != null) {
                            captionListItem5.setDownloaded(true);
                            captionListItem5.captionAssetBean = captionListItem6.captionAssetBean;
                        } else {
                            captionListItem5.setDownloaded(false);
                        }
                        arrayList9.add(captionListItem5);
                    }
                }
                String str11 = subtitleWithCategoryBean4.name;
                String str12 = str11;
                if (str11 == null) {
                    str12 = "";
                }
                arrayList8.add(new C5168a(arrayList9, i11, str12));
            }
            i11++;
        }
        mf().f106731e.f17488c = arrayList8;
        BiliEditorCaptionAnimationV4Fragment biliEditorCaptionAnimationV4Fragment = this.f106526y;
        if (biliEditorCaptionAnimationV4Fragment != null) {
            biliEditorCaptionAnimationV4Fragment.jf(new Runnable(this, arrayList8) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.y

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliEditorCaptionSettingV4Fragment f106638a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ArrayList f106639b;

                {
                    this.f106638a = this;
                    this.f106639b = arrayList8;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BiliEditorCaptionSettingV4Fragment biliEditorCaptionSettingV4Fragment = this.f106638a;
                    ArrayList arrayList10 = this.f106639b;
                    BiliEditorCaptionAnimationV4Fragment biliEditorCaptionAnimationV4Fragment2 = biliEditorCaptionSettingV4Fragment.f106526y;
                    if (biliEditorCaptionAnimationV4Fragment2 != null) {
                        biliEditorCaptionAnimationV4Fragment2.f106481p.clear();
                        ArrayList arrayList11 = new ArrayList();
                        for (Object obj4 : arrayList10) {
                            if (!((C5168a) obj4).f57117c.isEmpty()) {
                                arrayList11.add(obj4);
                            }
                        }
                        biliEditorCaptionAnimationV4Fragment2.f106480o = new ArrayList<>(arrayList11);
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = new ArrayList();
                        ArrayList<C5168a> arrayList14 = biliEditorCaptionAnimationV4Fragment2.f106480o;
                        if (arrayList14 != null) {
                            int i13 = 0;
                            for (C5168a c5168a : arrayList14) {
                                if (i13 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                C5168a c5168a2 = c5168a;
                                arrayList12.add(c5168a2.f57115a);
                                BiliEditorCaptionAnimationListV4Fragment biliEditorCaptionAnimationListV4Fragment = new BiliEditorCaptionAnimationListV4Fragment();
                                biliEditorCaptionAnimationListV4Fragment.f106469n = true;
                                biliEditorCaptionAnimationV4Fragment2.f106481p.add(biliEditorCaptionAnimationListV4Fragment);
                                BiliEditorCaptionAnimationV4Fragment.f106473r.addAll(c5168a2.f57117c);
                                biliEditorCaptionAnimationListV4Fragment.tf(i13, c5168a2.f57117c);
                                arrayList13.add(biliEditorCaptionAnimationListV4Fragment);
                                i13++;
                            }
                        }
                        ax0.d dVar = biliEditorCaptionAnimationV4Fragment2.h;
                        ax0.d dVar2 = dVar;
                        if (dVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("pageAdapter");
                            dVar2 = null;
                        }
                        dVar2.f54266b = arrayList12;
                        dVar2.f54267c = arrayList13;
                        dVar2.notifyDataSetChanged();
                        PagerSlidingTabStrip pagerSlidingTabStrip = biliEditorCaptionAnimationV4Fragment2.f106474i;
                        if (pagerSlidingTabStrip == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("tabStrip");
                            pagerSlidingTabStrip = null;
                        }
                        pagerSlidingTabStrip.notifyDataSetChanged();
                        View view = biliEditorCaptionAnimationV4Fragment2.getView();
                        if (view != null) {
                            view.post(new Runnable(biliEditorCaptionAnimationV4Fragment2) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.i

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final BiliEditorCaptionAnimationV4Fragment f106623a;

                                {
                                    this.f106623a = biliEditorCaptionAnimationV4Fragment2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    BiliEditorCaptionAnimationV4Fragment biliEditorCaptionAnimationV4Fragment3 = this.f106623a;
                                    ArrayList<C5168a> arrayList15 = biliEditorCaptionAnimationV4Fragment3.f106480o;
                                    if (arrayList15 != null) {
                                        Iterator<C5168a> it2 = arrayList15.iterator();
                                        while (it2.hasNext()) {
                                            biliEditorCaptionAnimationV4Fragment3.yf(it2.next().f57116b);
                                        }
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }
        ArrayList<CaptionFontEntity> arrayList10 = editorMaterialEntity.font;
        if (arrayList10 != null) {
            ArrayList arrayList11 = new ArrayList();
            CaptionListItem captionListItem7 = new CaptionListItem();
            captionListItem7.setId(0);
            captionListItem7.setDownloaded(true);
            captionListItem7.setLocal(true);
            captionListItem7.setImageLocal(2131234894);
            arrayList11.add(0, captionListItem7);
            List<CaptionListItem> listF = OC0.h.F();
            ArrayList arrayList12 = new ArrayList();
            for (CaptionFontEntity captionFontEntity : arrayList10) {
                String str13 = captionFontEntity.download_url;
                String strO = OC0.h.o(str13);
                if (StringsKt.z(strO, '.', 0, 6) >= 0) {
                    String strSubstring = strO.substring(0, StringsKt.z(strO, '.', 0, 6));
                    String str14 = captionFontEntity.cover;
                    int i13 = captionFontEntity.rank;
                    if (str13 != null && str13.length() != 0 && str14 != null && str14.length() != 0) {
                        Iterator it2 = arrayList12.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                CaptionListItem captionListItem8 = (CaptionListItem) it2.next();
                                if (captionListItem8.getUrl() == null || !Intrinsics.areEqual(captionListItem8.getUrl(), str13)) {
                                }
                            } else {
                                CaptionListItem captionListItem9 = new CaptionListItem();
                                captionListItem9.setId(captionFontEntity.id);
                                captionListItem9.setLocal(false);
                                captionListItem9.setUrl(str13);
                                captionListItem9.setImageHttp(str14);
                                captionListItem9.setIndex(i13);
                                captionListItem9.setFontName(captionFontEntity.name);
                                for (CaptionListItem captionListItem10 : (ArrayList) listF) {
                                    if (captionListItem10 != null && !TextUtils.isEmpty(captionListItem10.getAssetPath()) && StringsKt.n(captionListItem10.getAssetPath(), strSubstring)) {
                                        captionListItem9.setDownloaded(true);
                                        captionListItem9.setAssetPath(captionListItem10.getAssetPath());
                                    }
                                }
                                arrayList12.add(captionListItem9);
                            }
                        }
                    }
                }
            }
            if (!arrayList12.isEmpty()) {
                Collections.sort(arrayList12, new Object());
                arrayList11.addAll(arrayList12);
            }
            mf().f106731e.f17487b = arrayList11;
            BiliEditorCaptionFontV4Fragment biliEditorCaptionFontV4Fragment = this.f106523v;
            if (biliEditorCaptionFontV4Fragment != null) {
                biliEditorCaptionFontV4Fragment.jf(new bT0.l(this, arrayList11, 1));
            }
        }
        yf();
    }

    public final void qf(CaptionInfo captionInfo, int i7) {
        EditText editText;
        if (captionInfo == null || (editText = this.f106510i) == null) {
            return;
        }
        if (captionInfo.isTemp && Intrinsics.areEqual(Zw0.a.a(), captionInfo.textOrigin)) {
            rf("");
        } else {
            String str = captionInfo.textOrigin;
            int i8 = captionInfo.txtMax;
            EditText editText2 = this.f106510i;
            String strSubstring = null;
            if (editText2 == null) {
                this.f106496C = str;
                this.f106495B = i8;
                if (str != null) {
                    strSubstring = str.length() <= i8 ? str : str.substring(0, i8);
                }
            } else if (i8 >= 0) {
                this.f106495B = i8;
                editText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i8)});
                if (TextUtils.isEmpty(str)) {
                    this.f106496C = "";
                    strSubstring = "";
                } else if (str != null) {
                    if (str.length() <= i8) {
                        this.f106496C = str;
                        xf(str);
                        strSubstring = str;
                    } else {
                        strSubstring = str.substring(0, i8);
                        this.f106496C = strSubstring;
                        rf(strSubstring);
                    }
                }
            }
            rf(strSubstring);
        }
        Editable text = editText.getText();
        String string = "";
        if (text != null) {
            string = text.toString();
            if (string == null) {
                string = "";
            }
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        int length = string.length();
        if (i7 < 0 || i7 >= length) {
            i7 = length;
        }
        editText.setSelection(i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void rf(java.lang.CharSequence r4) {
        /*
            r3 = this;
            r0 = r3
            android.widget.EditText r0 = r0.f106510i
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L57
            r0 = r8
            android.text.Editable r0 = r0.getText()
            r5 = r0
            java.lang.String r0 = ""
            r7 = r0
            r0 = r5
            if (r0 == 0) goto L25
            r0 = r5
            java.lang.String r0 = r0.toString()
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L29
        L25:
            java.lang.String r0 = ""
            r5 = r0
        L29:
            r0 = r7
            r6 = r0
            r0 = r4
            if (r0 == 0) goto L3f
            r0 = r4
            java.lang.String r0 = r0.toString()
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L3f
            r0 = r7
            r6 = r0
            goto L3f
        L3f:
            r0 = r5
            r1 = r6
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L52
            r0 = r8
            r1 = r6
            r0.setText(r1)
            r0 = r3
            r1 = r6
            r0.xf(r1)
        L52:
            r0 = r3
            r1 = r6
            r0.kf(r1)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionSettingV4Fragment.rf(java.lang.CharSequence):void");
    }

    public final void sf() {
        Context context;
        InputMethodManager inputMethodManager;
        EditText editText = this.f106510i;
        if (editText == null || (context = editText.getContext()) == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return;
        }
        editText.requestFocus();
        inputMethodManager.showSoftInput(editText, 0);
    }

    public final void tf(int i7) {
        ViewPager viewPager = this.f106514m;
        if (viewPager != null) {
            PagerAdapter adapter = viewPager.getAdapter();
            int count = adapter != null ? adapter.getCount() : 0;
            if (count <= 0 || i7 < 0 || i7 >= count) {
                return;
            }
            viewPager.setCurrentItem(i7);
        }
    }

    public final void uf(boolean z6) {
        View view = this.f106517p;
        if (view == null || view.isEnabled() != z6) {
            if (z6) {
                View view2 = this.f106517p;
                if (view2 != null) {
                    view2.setEnabled(true);
                }
                View view3 = this.f106517p;
                if (view3 != null) {
                    view3.setAlpha(1.0f);
                    return;
                }
                return;
            }
            View view4 = this.f106517p;
            if (view4 != null) {
                view4.setEnabled(false);
            }
            View view5 = this.f106517p;
            if (view5 != null) {
                view5.setAlpha(0.3f);
            }
        }
    }

    public final void vf(boolean z6) {
        View view = this.f106518q;
        if (view == null || view.isEnabled() != z6) {
            if (z6) {
                View view2 = this.f106518q;
                if (view2 != null) {
                    view2.setEnabled(true);
                }
                View view3 = this.f106518q;
                if (view3 != null) {
                    view3.setAlpha(1.0f);
                    return;
                }
                return;
            }
            View view4 = this.f106518q;
            if (view4 != null) {
                view4.setEnabled(false);
            }
            View view5 = this.f106518q;
            if (view5 != null) {
                view5.setAlpha(0.3f);
            }
        }
    }

    public final void wf() {
        int length;
        EditText editText = this.f106510i;
        Integer numValueOf = editText != null ? Integer.valueOf(editText.getSelectionStart()) : null;
        if (numValueOf == null || numValueOf.intValue() < 0) {
            EditText editText2 = this.f106510i;
            length = editText2 != null ? editText2.length() : 0;
        } else {
            length = numValueOf.intValue();
        }
        this.f106503J = length;
    }

    public final void xf(String str) {
        int i7 = 0;
        int length = str != null ? str.length() : 0;
        TextView textView = this.f106511j;
        if (textView != null) {
            if (length == 0) {
                i7 = 8;
            }
            textView.setVisibility(i7);
            textView.setText(length + "/" + this.f106495B);
            textView.setTextColor(length >= this.f106495B ? this.f106498E : this.f106497D);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void yf() {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionSettingV4Fragment.yf():void");
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.CAPTION;
    }
}
