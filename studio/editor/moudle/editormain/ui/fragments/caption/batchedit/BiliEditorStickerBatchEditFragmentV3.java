package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit;

import TB0.C2873e;
import TB0.C2874f;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.base.MainThread;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.caption.setting.widget.a;
import com.bilibili.studio.editor.moudle.caption.ui.CaptionEditText;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.M;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.videoeditor.editor.editdata.EditFxClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.extension.FragmentExtKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/BiliEditorStickerBatchEditFragmentV3.class */
@AndroidEntryPoint
public final class BiliEditorStickerBatchEditFragmentV3 extends Hilt_BiliEditorStickerBatchEditFragmentV3 implements Mw0.e, a.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final ArrayList<Pair<Integer, Long>> f106345A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final ArrayList<Pair<Integer, Long>> f106346B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public a f106347C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public ValueAnimator f106348D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f106349E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f106350F;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C2874f f106351g;
    public View h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Xw0.c<b> f106352i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public ArrayList<CaptionInfo> f106353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f106354k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ArrayList<BiliEditorStickerInfo> f106355l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ArrayList<b> f106356m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public com.bilibili.studio.editor.moudle.caption.setting.widget.a f106357n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f106358o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public Triple<Integer, Long, Long> f106359p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f106360q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f106361r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public b f106362s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public CaptionEditText f106363t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f106364u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f106365v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f106366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public View f106367x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final ArrayList<Long> f106368y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final ArrayList<Long> f106369z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/BiliEditorStickerBatchEditFragmentV3$a.class */
    public interface a {
        void a(@NotNull CaptionInfo captionInfo, @NotNull String str);

        void b(int i7, @NotNull String str, @NotNull String str2);

        void c(@Nullable EditFxClip editFxClip);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/BiliEditorStickerBatchEditFragmentV3$b.class */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final CaptionInfo f106370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final BiliEditorStickerInfo f106371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public String f106372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Long f106373d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Long f106374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f106375f;

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(@org.jetbrains.annotations.Nullable com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo r4, @org.jetbrains.annotations.Nullable com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo r5) {
            /*
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.f106370a = r1
                r0 = r3
                r1 = r5
                r0.f106371b = r1
                r0 = r4
                if (r0 == 0) goto L1d
                r0 = r4
                java.lang.String r0 = r0.text
                r6 = r0
                r0 = r6
                r5 = r0
                r0 = r6
                if (r0 != 0) goto L20
            L1d:
                java.lang.String r0 = ""
                r5 = r0
            L20:
                r0 = r3
                r1 = r5
                r0.f106372c = r1
                r0 = 0
                r6 = r0
                r0 = r4
                if (r0 == 0) goto L36
                r0 = r4
                long r0 = r0.outPoint
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r5 = r0
                goto L38
            L36:
                r0 = 0
                r5 = r0
            L38:
                r0 = r3
                r1 = r5
                r0.f106373d = r1
                r0 = r6
                r5 = r0
                r0 = r4
                if (r0 == 0) goto L4b
                r0 = r4
                long r0 = r0.inPoint
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r5 = r0
            L4b:
                r0 = r3
                r1 = r5
                r0.f106374e = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorStickerBatchEditFragmentV3.b.<init>(com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo, com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo):void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/BiliEditorStickerBatchEditFragmentV3$c.class */
    public static final /* synthetic */ class c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f106376a;

        public c(Function1 function1) {
            this.f106376a = function1;
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
            return this.f106376a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f106376a.invoke(obj);
        }
    }

    public BiliEditorStickerBatchEditFragmentV3() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorStickerBatchEditFragmentV3$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m9931invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorStickerBatchEditFragmentV3$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m9932invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f106354k = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(M.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorStickerBatchEditFragmentV3$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m9933invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorStickerBatchEditFragmentV3$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m9934invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorStickerBatchEditFragmentV3$special$$inlined$viewModels$default$4.m9934invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorStickerBatchEditFragmentV3$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m9935invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorStickerBatchEditFragmentV3$special$$inlined$viewModels$default$5.m9935invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f106356m = new ArrayList<>();
        this.f106359p = new Triple<>(-1, -1L, -1L);
        this.f106360q = -1;
        this.f106366w = DimenUtilsKt.dpToPx(220);
        this.f106368y = new ArrayList<>();
        this.f106369z = new ArrayList<>();
        this.f106345A = new ArrayList<>();
        this.f106346B = new ArrayList<>();
        this.f106349E = Color.parseColor("#9499A0");
    }

    public static final void nf(int i7, C2873e c2873e, View view, CaptionEditText captionEditText, b bVar, BiliEditorStickerBatchEditFragmentV3 biliEditorStickerBatchEditFragmentV3) {
        Editable text = captionEditText.getText();
        String string = text != null ? text.toString() : null;
        String str = string;
        if (string == null) {
            str = "";
        }
        bVar.f106372c = str;
        if (captionEditText.hasFocus() && bVar.f106372c.length() > 0) {
            biliEditorStickerBatchEditFragmentV3.kf(view, bVar, i7, true);
            return;
        }
        if (captionEditText.hasFocus()) {
            return;
        }
        boolean z6 = biliEditorStickerBatchEditFragmentV3.f106358o;
        CaptionEditText captionEditText2 = c2873e.f23764c;
        if (z6) {
            view.setSelected(false);
            c2873e.f23763b.setVisibility(8);
            c2873e.f23765d.setVisibility(0);
            captionEditText2.setTextColor(biliEditorStickerBatchEditFragmentV3.f106349E);
            return;
        }
        view.setSelected(true);
        c2873e.f23763b.setVisibility(0);
        c2873e.f23765d.setVisibility(8);
        captionEditText2.setTextColor(-1);
    }

    public final void kf(View view, b bVar, int i7, boolean z6) {
        if (FragmentExtKt.isFragmentActive(this)) {
            C2873e c2873eBind = C2873e.bind(view);
            CaptionEditText captionEditText = c2873eBind.f23764c;
            if (z6) {
                captionEditText.setFocusedTextColor(-1);
            }
            this.f106362s = bVar;
            this.f106363t = captionEditText;
            this.f106364u = i7;
            this.f106360q = i7;
            if (i7 >= this.f106356m.size()) {
                return;
            }
            long j7 = 0;
            if (this.f106350F == 1) {
                if (this.f106356m.get(this.f106364u).f106370a == null) {
                    M mLf = lf();
                    BiliEditorStickerInfo biliEditorStickerInfo = this.f106356m.get(this.f106364u).f106371b;
                    if (biliEditorStickerInfo != null) {
                        j7 = biliEditorStickerInfo.inPoint;
                    }
                    mLf.f106679d.o(j7);
                    lf().f106681f.m(null, true);
                } else {
                    CaptionInfo captionInfo = this.f106356m.get(this.f106364u).f106370a;
                    long j8 = captionInfo != null ? captionInfo.inPoint : 0L;
                    BiliEditorStickerInfo biliEditorStickerInfo2 = this.f106356m.get(this.f106364u).f106371b;
                    if (biliEditorStickerInfo2 != null) {
                        j7 = biliEditorStickerInfo2.inPoint;
                    }
                    M mLf2 = lf();
                    if (j8 > j7) {
                        j7 = j8;
                    }
                    mLf2.f106679d.o(j7);
                    M mLf3 = lf();
                    CaptionInfo captionInfo2 = this.f106356m.get(this.f106364u).f106370a;
                    mLf3.f106682g.F(captionInfo2);
                    mLf3.f106683i.h.j(captionInfo2);
                    lf().f106682g.B();
                }
            } else if (this.f106356m.get(this.f106364u).f106371b == null) {
                M mLf4 = lf();
                CaptionInfo captionInfo3 = this.f106356m.get(this.f106364u).f106370a;
                if (captionInfo3 != null) {
                    j7 = captionInfo3.inPoint;
                }
                mLf4.L0(j7);
                lf().f106681f.m(null, true);
            } else {
                CaptionInfo captionInfo4 = this.f106356m.get(this.f106364u).f106370a;
                long j9 = captionInfo4 != null ? captionInfo4.inPoint : 0L;
                BiliEditorStickerInfo biliEditorStickerInfo3 = this.f106356m.get(this.f106364u).f106371b;
                if (biliEditorStickerInfo3 != null) {
                    j7 = biliEditorStickerInfo3.inPoint;
                }
                M mLf5 = lf();
                if (j9 > j7) {
                    j7 = j9;
                }
                mLf5.L0(j7);
                lf().K0(this.f106356m.get(this.f106364u).f106371b);
            }
            this.f106365v = captionEditText.getSelectionStart();
            captionEditText.getSelectionEnd();
            c2873eBind.f23763b.setVisibility(0);
            c2873eBind.f23765d.setVisibility(8);
            view.setSelected(true);
            if (z6 || bVar.f106370a != null) {
                Long l7 = bVar.f106374e;
                if (l7 != null) {
                    long jLongValue = l7.longValue();
                    Long l8 = bVar.f106373d;
                    if (l8 != null) {
                        long jLongValue2 = l8.longValue();
                        if (FragmentExtKt.isFragmentActive(this)) {
                            lf().f106683i.f16527b.p(jLongValue, jLongValue2);
                        }
                    }
                }
            } else {
                BiliEditorStickerInfo biliEditorStickerInfo4 = bVar.f106371b;
                if (biliEditorStickerInfo4 != null) {
                    long j10 = biliEditorStickerInfo4.inPoint;
                    long j11 = biliEditorStickerInfo4.outPoint;
                    if (FragmentExtKt.isFragmentActive(this)) {
                        lf().f106683i.f16527b.p(j10, j11);
                    }
                }
            }
            if (Intrinsics.areEqual(this.f106367x, view)) {
                return;
            }
            View view2 = this.f106367x;
            if (view2 != null) {
                C2873e c2873eBind2 = C2873e.bind(view2);
                c2873eBind2.f23762a.setSelected(false);
                c2873eBind2.f23763b.setVisibility(8);
                c2873eBind2.f23765d.setVisibility(0);
                int i8 = z6 ? -1 : this.f106349E;
                CaptionEditText captionEditText2 = c2873eBind2.f23764c;
                captionEditText2.setFocusedTextColor(i8);
                captionEditText2.setTextColor(this.f106349E);
            }
            this.f106367x = view;
        }
    }

    public final M lf() {
        return (M) this.f106354k.getValue();
    }

    public final boolean mf(int i7) {
        com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar;
        return i7 == 0 || ((aVar = this.f106357n) != null && i7 == aVar.f106008f);
    }

    public final void of(int i7) {
        boolean z6 = true;
        if (this.f106350F != 1) {
            z6 = false;
        }
        int size = this.f106356m.size();
        int i8 = this.f106364u;
        EditFxClip editFxClip = (i8 < 0 || i8 >= size) ? null : z6 ? this.f106356m.get(i8).f106370a : this.f106356m.get(i8).f106371b;
        a aVar = this.f106347C;
        if (aVar != null) {
            aVar.c(editFxClip);
        }
        lf().J0(BackUpTag.CAPTION_EDIT);
        EditVideoInfo editVideoInfo = lf().f106683i.f16526a.f4806b;
        if (editVideoInfo == null) {
            return;
        }
        String reportData = editVideoInfo.getReportData("ai_play_id");
        String reportData2 = editVideoInfo.getReportData("ai_play_name");
        if (z6) {
            Xz0.d.f28458a.getClass();
            HashMap map = new HashMap();
            map.put("play_id", reportData);
            map.put("play_name", reportData2);
            Neurons.reportClick(false, "creation.video-editor.words-set-panel.multi-edit-confirm.click", map);
            return;
        }
        Xz0.d.f28458a.getClass();
        HashMap map2 = new HashMap();
        map2.put("play_id", reportData);
        map2.put("play_name", reportData2);
        Neurons.reportClick(false, "creation.video-editor.sticker-panel.multi-edit-confirm.click", map2);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C2874f c2874fInflate = C2874f.inflate(layoutInflater, viewGroup, false);
        this.f106351g = c2874fInflate;
        C2874f c2874f = c2874fInflate;
        if (c2874fInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2874f = null;
        }
        return c2874f.f23774a;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar = this.f106357n;
        if (aVar != null) {
            aVar.a();
        }
        ValueAnimator valueAnimator = this.f106348D;
        if (valueAnimator != null) {
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f106348D = null;
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar = this.f106357n;
        if (aVar != null) {
            aVar.f106004b = null;
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar = this.f106357n;
        if (aVar != null) {
            aVar.f106004b = this;
        }
        if (this.f106358o) {
            final C2873e c2873eBind = C2873e.bind(this.f106367x);
            c2873eBind.f23764c.requestFocus();
            MainThread.postOnMainThreadDelayed(new Runnable(this, c2873eBind) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliEditorStickerBatchEditFragmentV3 f106425a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final C2873e f106426b;

                {
                    this.f106425a = this;
                    this.f106426b = c2873eBind;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Window window;
                    View decorView;
                    InputMethodManager inputMethodManager;
                    BiliEditorStickerBatchEditFragmentV3 biliEditorStickerBatchEditFragmentV3 = this.f106425a;
                    C2873e c2873e = this.f106426b;
                    FragmentActivity fragmentActivityP3 = biliEditorStickerBatchEditFragmentV3.p3();
                    if (fragmentActivityP3 == null || (window = fragmentActivityP3.getWindow()) == null || (decorView = window.getDecorView()) == null || decorView.getWindowToken() == null || (inputMethodManager = (InputMethodManager) fragmentActivityP3.getSystemService("input_method")) == null) {
                        return;
                    }
                    inputMethodManager.showSoftInput(c2873e.f23764c, 1);
                }
            }, 500L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04bf A[EDGE_INSN: B:165:0x04bf->B:136:0x04bf BREAK  A[LOOP:1: B:114:0x043f->B:135:0x04b9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0344  */
    /* JADX WARN: Type inference failed for: r1v97, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v99, types: [java.lang.Object, java.util.Comparator] */
    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r10, @org.jetbrains.annotations.Nullable android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorStickerBatchEditFragmentV3.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.editor.moudle.caption.setting.widget.a.b
    public final void p2(int i7, int i8) {
        if (FragmentExtKt.isFragmentActive(this)) {
            boolean zMf = mf(i7);
            if (!zMf || this.f106358o) {
                if (zMf) {
                    this.f106358o = false;
                } else {
                    lf().f106679d.j();
                    this.f106358o = true;
                }
                com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar = this.f106357n;
                int i9 = this.f106358o ? i7 - (aVar != null ? aVar.f106008f : 0) : 0;
                int iDpToPx = !mf(i7) ? this.f106366w : DimenUtilsKt.dpToPx(294);
                boolean z6 = this.f106358o;
                C2874f c2874f = this.f106351g;
                C2874f c2874f2 = c2874f;
                if (c2874f == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c2874f2 = null;
                }
                ViewGroup.LayoutParams layoutParams = c2874f2.f23777d.getLayoutParams();
                layoutParams.height = i9;
                C2874f c2874f3 = this.f106351g;
                C2874f c2874f4 = c2874f3;
                if (c2874f3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c2874f4 = null;
                }
                c2874f4.f23777d.setLayoutParams(layoutParams);
                View view = this.h;
                View view2 = view;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rootView");
                    view2 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                marginLayoutParams.height = iDpToPx + i9;
                View view3 = this.h;
                View view4 = view3;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rootView");
                    view4 = null;
                }
                view4.setLayoutParams(marginLayoutParams);
                int i10 = marginLayoutParams.height;
                Sy0.a aVar2 = lf().f106683i.f16530e;
                if (z6) {
                    MutableLiveData mutableLiveData = aVar2.f23139c.a;
                    mutableLiveData.setValue(new Fy0.p(i10));
                } else {
                    aVar2.getClass();
                    int i11 = Mx0.f.f16479i;
                    MutableLiveData mutableLiveData2 = aVar2.f23139c.a;
                    mutableLiveData2.setValue(new Fy0.p(i11));
                }
                MainThread.postOnMainThreadDelayed(new Zr.a(this, 1), 30L);
                C2874f c2874f5 = this.f106351g;
                C2874f c2874f6 = c2874f5;
                if (c2874f5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c2874f6 = null;
                }
                c2874f6.f23776c.scrollToPosition(this.f106364u);
                if (mf(i7)) {
                    C2874f c2874f7 = this.f106351g;
                    C2874f c2874f8 = c2874f7;
                    if (c2874f7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c2874f8 = null;
                    }
                    c2874f8.f23775b.setVisibility(8);
                    C2874f c2874f9 = this.f106351g;
                    if (c2874f9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c2874f9 = null;
                    }
                    c2874f9.f23778e.setVisibility(8);
                    lf().f106683i.f16527b.n();
                } else {
                    C2874f c2874f10 = this.f106351g;
                    C2874f c2874f11 = c2874f10;
                    if (c2874f10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c2874f11 = null;
                    }
                    c2874f11.f23775b.setVisibility(0);
                    C2874f c2874f12 = this.f106351g;
                    if (c2874f12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c2874f12 = null;
                    }
                    c2874f12.f23778e.setVisibility(0);
                }
                if (this.f106363t != null && mf(i7)) {
                    View view5 = this.f106367x;
                    if (view5 != null) {
                        view5.setSelected(true);
                    }
                    CaptionEditText captionEditText = this.f106363t;
                    if (captionEditText != null) {
                        captionEditText.clearFocus();
                    }
                }
                if (this.f106358o) {
                    return;
                }
                lf().J0(BackUpTag.CAPTION_ADD);
            }
        }
    }

    public final void pf() {
        View decorView;
        IBinder windowToken;
        InputMethodManager inputMethodManager;
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            Window window = fragmentActivityP3.getWindow();
            if (window != null && (decorView = window.getDecorView()) != null && (windowToken = decorView.getWindowToken()) != null && (inputMethodManager = (InputMethodManager) fragmentActivityP3.getSystemService("input_method")) != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
            C2874f c2874f = this.f106351g;
            C2874f c2874f2 = c2874f;
            if (c2874f == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c2874f2 = null;
            }
            c2874f2.f23778e.setVisibility(8);
        }
    }

    public final void qf() {
        if (FragmentExtKt.isFragmentActive(this)) {
            b bVar = this.f106362s;
            if (bVar == null) {
                lf().f106681f.m(null, true);
                return;
            }
            int i7 = this.f106350F;
            if (i7 != 1) {
                if (i7 == 2) {
                    if (bVar.f106371b == null) {
                        lf().f106681f.m(null, true);
                        return;
                    } else {
                        lf().K0(this.f106362s.f106371b);
                        return;
                    }
                }
                return;
            }
            if (bVar.f106370a == null) {
                lf().f106681f.m(null, true);
                return;
            }
            M mLf = lf();
            CaptionInfo captionInfo = this.f106362s.f106370a;
            mLf.f106682g.F(captionInfo);
            mLf.f106683i.h.j(captionInfo);
            lf().f106682g.B();
        }
    }

    public final void rf() {
        this.f106359p = new Triple<>(-1, -1L, -1L);
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.STICKER;
    }
}
