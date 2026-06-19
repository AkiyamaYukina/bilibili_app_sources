package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit;

import TB0.C2872d;
import TB0.C2883o;
import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.common.PlaybackException;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.base.MainThread;
import com.bilibili.bililive.infra.roomtab.view.OnCloseClickListener;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.caption.setting.widget.a;
import com.bilibili.studio.editor.moudle.caption.ui.CaptionEditText;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.editor.moudle.editormain.track.beans.BiliEditorMaterialMultiInfo;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorCaptionEditFragmentV3;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.C6554h;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.RunnableC6553g;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.studio.videoeditor.widgets.confirmdialog.BiliEditorConfirmDialog;
import com.bilibili.upper.module.archivetask.service.ArchiveUploadService;
import dagger.hilt.android.AndroidEntryPoint;
import i80.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.sms.SmsLoginDialogActivityV3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/BiliEditorCaptionEditFragmentV3.class */
@AndroidEntryPoint
public final class BiliEditorCaptionEditFragmentV3 extends Hilt_BiliEditorCaptionEditFragmentV3 implements a.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public View f106311A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f106312B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final List<Long> f106313C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final List<Long> f106314D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public a f106315E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public ValueAnimator f106316F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f106317G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final String f106318H;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C2883o f106319g;
    public View h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f106320i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Xw0.c<b> f106321j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ArrayList<b> f106322k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ArrayList<CaptionInfo> f106323l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public com.bilibili.studio.editor.moudle.caption.setting.widget.a f106324m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f106325n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public Triple<Integer, Long, Long> f106326o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f106327p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f106328q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public b f106329r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public CaptionEditText f106330s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f106331t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f106332u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f106333v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f106334w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f106335x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public BiliEditorConfirmDialog f106336y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f106337z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/BiliEditorCaptionEditFragmentV3$a.class */
    public interface a {
        void a(int i7, boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/BiliEditorCaptionEditFragmentV3$b.class */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final CaptionInfo f106338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public String f106339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f106340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f106341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f106342e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final BiliEditorCaptionEditFragmentV3 f106343f;

        public b(@NotNull BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV3, CaptionInfo captionInfo) {
            this.f106343f = biliEditorCaptionEditFragmentV3;
            this.f106338a = captionInfo;
            String str = captionInfo.text;
            this.f106339b = str == null ? "" : str;
            long j7 = captionInfo.inPoint;
            biliEditorCaptionEditFragmentV3.getClass();
            long j8 = j7 / ((long) PlaybackException.CUSTOM_ERROR_CODE_BASE);
            long j9 = 60;
            this.f106340c = B0.a.a(StringsKt.padStart(String.valueOf(j8 / j9), 2, '0'), ": ", StringsKt.padStart(String.valueOf(j8 % j9), 2, '0'));
            this.f106341d = captionInfo.outPoint;
            this.f106342e = captionInfo.inPoint;
        }

        @NotNull
        public final b a(@NotNull b bVar, boolean z6, int i7, boolean z7) {
            int length = bVar.f106339b.length();
            CaptionInfo captionInfo = bVar.f106338a;
            BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV3 = this.f106343f;
            if (length == 0) {
                biliEditorCaptionEditFragmentV3.mf(captionInfo);
                String str = this.f106339b;
                CaptionInfo captionInfo2 = this.f106338a;
                captionInfo2.text = str;
                return new b(biliEditorCaptionEditFragmentV3, captionInfo2);
            }
            int length2 = this.f106339b.length();
            CaptionInfo captionInfo3 = this.f106338a;
            if (length2 == 0) {
                biliEditorCaptionEditFragmentV3.mf(captionInfo3);
                String str2 = bVar.f106339b;
                CaptionInfo captionInfo4 = bVar.f106338a;
                captionInfo4.text = str2;
                return new b(biliEditorCaptionEditFragmentV3, captionInfo4);
            }
            String strA = G.p.a(this.f106339b, bVar.f106339b);
            String strSubstring = strA;
            if (z6) {
                strSubstring = strA;
                if (strA.length() > i7) {
                    strSubstring = strA.substring(0, i7);
                }
            }
            biliEditorCaptionEditFragmentV3.mf(captionInfo3);
            biliEditorCaptionEditFragmentV3.mf(captionInfo);
            long jMax = Math.max(captionInfo.outPoint, captionInfo3.outPoint);
            C6554h c6554hOf = biliEditorCaptionEditFragmentV3.of();
            int i8 = biliEditorCaptionEditFragmentV3.f106337z;
            if (z7) {
                captionInfo = captionInfo3;
            }
            CaptionInfo captionInfoJ0 = C6554h.J0(c6554hOf, this.f106342e, jMax, strSubstring, i8, captionInfo, captionInfo3.trackLevelIndex);
            return captionInfoJ0 == null ? new b(biliEditorCaptionEditFragmentV3, this.f106338a) : new b(biliEditorCaptionEditFragmentV3, captionInfoJ0);
        }
    }

    public BiliEditorCaptionEditFragmentV3() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorCaptionEditFragmentV3$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m9926invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorCaptionEditFragmentV3$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m9927invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f106320i = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C6554h.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorCaptionEditFragmentV3$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m9928invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorCaptionEditFragmentV3$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m9929invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorCaptionEditFragmentV3$special$$inlined$viewModels$default$4.m9929invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorCaptionEditFragmentV3$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m9930invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorCaptionEditFragmentV3$special$$inlined$viewModels$default$5.m9930invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f106322k = new ArrayList<>();
        this.f106326o = new Triple<>(-1, -1L, -1L);
        this.f106327p = -1;
        this.f106334w = TransitionInfo.DEFAULT_DURATION * 0.033333335f;
        this.f106335x = DensityUtil.dp2px(220.0f);
        this.f106313C = new ArrayList();
        this.f106314D = new ArrayList();
        this.f106317G = Color.parseColor("#9499A0");
        this.f106318H = "merge_confirm";
    }

    public static long lf(double d7, long j7, long j8) {
        return j7 > j8 ? lf(d7, j8, j7) : j7 + ((long) (RangesKt.coerceIn(d7, 0.0d, 1.0d) * (j8 - j7)));
    }

    public static final void qf(int i7, C2872d c2872d, View view, CaptionEditText captionEditText, b bVar, BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV3) {
        Editable text = captionEditText.getText();
        String string = text != null ? text.toString() : null;
        String str = string;
        if (string == null) {
            str = "";
        }
        bVar.f106339b = str;
        if (!captionEditText.hasFocus() || bVar.f106339b.length() <= 0 || i7 < 0 || i7 >= biliEditorCaptionEditFragmentV3.f106322k.size()) {
            if (captionEditText.hasFocus()) {
                return;
            }
            view.setSelected(false);
            c2872d.f23752b.setVisibility(0);
            c2872d.f23755e.setVisibility(0);
            c2872d.f23753c.setTextColor(-1);
            biliEditorCaptionEditFragmentV3.of().K0(BackUpTag.CAPTION_EDIT);
            return;
        }
        biliEditorCaptionEditFragmentV3.f106329r = bVar;
        biliEditorCaptionEditFragmentV3.f106330s = captionEditText;
        biliEditorCaptionEditFragmentV3.f106331t = i7;
        biliEditorCaptionEditFragmentV3.f106327p = i7;
        C6554h c6554hOf = biliEditorCaptionEditFragmentV3.of();
        CaptionInfo captionInfo = biliEditorCaptionEditFragmentV3.f106322k.get(biliEditorCaptionEditFragmentV3.f106331t).f106338a;
        Ly0.t tVar = c6554hOf.f106710e;
        tVar.F(captionInfo);
        tVar.I(captionInfo);
        Oy0.d dVar = c6554hOf.f106709d.f16511g;
        BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfoB = dVar.b(captionInfo);
        if (biliEditorMaterialMultiInfoB != null) {
            dVar.f18125b.K(biliEditorMaterialMultiInfoB);
        }
        biliEditorCaptionEditFragmentV3.of().f106710e.B();
        biliEditorCaptionEditFragmentV3.f106332u = captionEditText.getSelectionStart();
        biliEditorCaptionEditFragmentV3.f106333v = captionEditText.getSelectionEnd();
        c2872d.f23752b.setVisibility(0);
        c2872d.f23755e.setVisibility(8);
        view.setSelected(true);
        biliEditorCaptionEditFragmentV3.of().f106709d.f16506b.p(bVar.f106342e, bVar.f106341d);
        if (!Intrinsics.areEqual(biliEditorCaptionEditFragmentV3.f106311A, view)) {
            View view2 = biliEditorCaptionEditFragmentV3.f106311A;
            if (view2 != null) {
                C2872d c2872dBind = C2872d.bind(view2);
                c2872dBind.f23751a.setSelected(false);
                c2872dBind.f23752b.setVisibility(4);
                c2872dBind.f23753c.setTextColor(biliEditorCaptionEditFragmentV3.f106317G);
            }
            biliEditorCaptionEditFragmentV3.f106311A = view;
        }
        biliEditorCaptionEditFragmentV3.wf(bVar.f106339b.length());
    }

    /* JADX WARN: Type inference failed for: r0v67, types: [com.bilibili.studio.videoeditor.widgets.confirmdialog.BiliEditorConfirmDialog$a, java.lang.Object] */
    public final void kf(boolean z6) {
        if (this.f106329r == null) {
            return;
        }
        if (z6) {
            if (this.f106331t <= 0) {
                return;
            }
        } else if (this.f106331t >= this.f106322k.size() - 1) {
            return;
        }
        if (this.f106331t < this.f106322k.size() && Intrinsics.areEqual(this.f106322k.get(this.f106331t), this.f106329r)) {
            CaptionInfo captionInfo = this.f106322k.get(this.f106331t).f106338a;
            ArrayList<b> arrayList = this.f106322k;
            int i7 = this.f106331t;
            CaptionInfo captionInfo2 = arrayList.get(z6 ? i7 - 1 : i7 + 1).f106338a;
            int length = (captionInfo.text + captionInfo2.text).length();
            int i8 = captionInfo2.txtMax;
            if (length > i8) {
                Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(this.f106318H);
                if (fragmentFindFragmentByTag != null && fragmentFindFragmentByTag.isVisible()) {
                    return;
                }
                int i9 = captionInfo2.txtMax;
                C6523g c6523g = new C6523g(z6, this, captionInfo2);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(requireContext().getString(2131842163), Arrays.copyOf(new Object[]{Integer.valueOf(i9)}, 1));
                ?? obj = new Object();
                obj.f110436d = 2131841776;
                obj.f110437e = 2131842224;
                obj.f110434b = str;
                obj.h = new m(c6523g);
                obj.f110441j = new n(c6523g);
                BiliEditorConfirmDialog biliEditorConfirmDialog = new BiliEditorConfirmDialog(obj);
                this.f106336y = biliEditorConfirmDialog;
                biliEditorConfirmDialog.setCancelable(false);
                BiliEditorConfirmDialog biliEditorConfirmDialog2 = this.f106336y;
                if (biliEditorConfirmDialog2 != null) {
                    biliEditorConfirmDialog2.show(getChildFragmentManager(), this.f106318H);
                }
            } else if (z6) {
                uf(i8, false);
            } else {
                tf(i8, false);
            }
            b bVar = this.f106329r;
            int length2 = 0;
            if (bVar != null) {
                String str2 = bVar.f106339b;
                length2 = 0;
                if (str2 != null) {
                    length2 = str2.length();
                }
            }
            wf(length2);
        }
    }

    public final void mf(CaptionInfo captionInfo) {
        of().f106709d.f16510f.o(captionInfo.timelineCaption);
    }

    public final void nf() {
        int i7;
        of().f106710e.f14981b.j();
        Xz0.d dVar = Xz0.d.f28458a;
        boolean z6 = this.f106328q;
        dVar.getClass();
        Xz0.d.n("delete", z6);
        if (this.f106329r != null && (i7 = this.f106331t) >= 0 && i7 < this.f106322k.size() && Intrinsics.areEqual(this.f106322k.get(this.f106331t), this.f106329r)) {
            this.f106312B = true;
            ((ArrayList) this.f106314D).add(Long.valueOf(this.f106329r.f106338a.id));
            mf(this.f106329r.f106338a);
            of().K0(BackUpTag.CAPTION_DEL);
            this.f106322k.remove(this.f106331t);
            if (this.f106322k.isEmpty()) {
                this.f106329r = null;
                this.f106331t = 0;
                this.f106332u = 0;
                this.f106333v = 0;
                sf();
            } else if (this.f106331t < this.f106322k.size()) {
                b bVar = this.f106322k.get(this.f106331t);
                this.f106329r = bVar;
                this.f106332u = bVar.f106339b.length();
                this.f106333v = this.f106329r.f106339b.length();
            } else {
                int i8 = this.f106331t - 1;
                this.f106331t = i8;
                b bVar2 = this.f106322k.get(i8);
                this.f106329r = bVar2;
                this.f106332u = bVar2.f106339b.length();
                this.f106333v = this.f106329r.f106339b.length();
            }
            b bVar3 = this.f106329r;
            if (bVar3 != null) {
                C6554h c6554hOf = of();
                CaptionInfo captionInfo = bVar3.f106338a;
                Ly0.t tVar = c6554hOf.f106710e;
                tVar.F(captionInfo);
                tVar.I(captionInfo);
                Oy0.d dVar2 = c6554hOf.f106709d.f16511g;
                BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfoB = dVar2.b(captionInfo);
                if (biliEditorMaterialMultiInfoB != null) {
                    dVar2.f18125b.K(biliEditorMaterialMultiInfoB);
                }
            }
            vf();
            Xw0.c<b> cVar = this.f106321j;
            Xw0.c<b> cVar2 = cVar;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("editionsAdapter");
                cVar2 = null;
            }
            cVar2.f28349a = this.f106322k;
            Xw0.c<b> cVar3 = this.f106321j;
            if (cVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("editionsAdapter");
                cVar3 = null;
            }
            cVar3.notifyDataSetChanged();
            if (this.f106329r != null) {
                of().L0();
            }
            this.f106327p = this.f106331t;
        }
    }

    public final C6554h of() {
        return (C6554h) this.f106320i.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C2883o c2883oInflate = C2883o.inflate(layoutInflater, viewGroup, false);
        this.f106319g = c2883oInflate;
        C2883o c2883o = c2883oInflate;
        if (c2883oInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2883o = null;
        }
        return c2883o.f23885a;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        of().f106709d.f16506b.n();
        com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar = this.f106324m;
        if (aVar != null) {
            aVar.a();
        }
        ValueAnimator valueAnimator = this.f106316F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f106316F = null;
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar = this.f106324m;
        if (aVar != null) {
            aVar.f106004b = null;
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar = this.f106324m;
        if (aVar != null) {
            aVar.f106004b = this;
        }
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.Comparator] */
    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        C2883o c2883o = this.f106319g;
        C2883o c2883o2 = c2883o;
        if (c2883o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2883o2 = null;
        }
        final int i7 = 0;
        c2883o2.f23894k.setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f106390a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f106391b;

            {
                this.f106390a = i7;
                this.f106391b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (this.f106390a) {
                    case 0:
                        BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV3 = (BiliEditorCaptionEditFragmentV3) this.f106391b;
                        biliEditorCaptionEditFragmentV3.sf();
                        biliEditorCaptionEditFragmentV3.rf(1);
                        break;
                    case 1:
                        OnCloseClickListener onCloseClickListener = ((com.bilibili.bililive.infra.roomtab.view.a) this.f106391b).h;
                        if (onCloseClickListener != null) {
                            onCloseClickListener.onCloseClick();
                        }
                        break;
                    default:
                        SmsLoginDialogActivityV3 smsLoginDialogActivityV3 = (SmsLoginDialogActivityV3) this.f106391b;
                        CheckBox checkBox = smsLoginDialogActivityV3.r0;
                        if (checkBox != null && Rd1.e.a(checkBox)) {
                            checkBox.setChecked(true);
                        }
                        Rd1.e.g("app.sms-login2.provision.0.click", smsLoginDialogActivityV3.r0);
                        break;
                }
            }
        });
        C2883o c2883o3 = this.f106319g;
        C2883o c2883o4 = c2883o3;
        if (c2883o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2883o4 = null;
        }
        c2883o4.f23895l.setText(2131841789);
        C2883o c2883o5 = this.f106319g;
        C2883o c2883o6 = c2883o5;
        if (c2883o5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2883o6 = null;
        }
        this.h = c2883o6.f23885a;
        Xw0.c<b> cVar = new Xw0.c<>();
        cVar.f28350b = 2131501044;
        cVar.f28351c = new BiliEditorCaptionEditFragmentV3$initView$2$1(this);
        cVar.f28349a = this.f106322k;
        this.f106321j = cVar;
        C2883o c2883o7 = this.f106319g;
        C2883o c2883o8 = c2883o7;
        if (c2883o7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2883o8 = null;
        }
        RecyclerView recyclerView = c2883o8.f23890f;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        Xw0.c<b> cVar2 = this.f106321j;
        Xw0.c<b> cVar3 = cVar2;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editionsAdapter");
            cVar3 = null;
        }
        recyclerView.setAdapter(cVar3);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            this.f106324m = new com.bilibili.studio.editor.moudle.caption.setting.widget.a(fragmentActivityP3);
            View view2 = this.h;
            View view3 = view2;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
                view3 = null;
            }
            final int i8 = 1;
            view3.post(new Runnable(this, i8) { // from class: RF0.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f20765a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f20766b;

                {
                    this.f20765a = i8;
                    this.f20766b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f20765a) {
                        case 0:
                            d dVar = (d) this.f20766b;
                            dVar.getClass();
                            d.b("stopServiceImpl");
                            int i9 = ArchiveUploadService.h;
                            Application fapp = FoundationAlias.getFapp();
                            fapp.stopService(new Intent(fapp, (Class<?>) ArchiveUploadService.class));
                            dVar.f20768b.set(false);
                            break;
                        case 1:
                            com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar = ((BiliEditorCaptionEditFragmentV3) this.f20766b).f106324m;
                            if (aVar != null) {
                                aVar.c();
                            }
                            break;
                        default:
                            ((g) this.f20766b).invoke();
                            break;
                    }
                }
            });
        }
        C2883o c2883o9 = this.f106319g;
        C2883o c2883o10 = c2883o9;
        if (c2883o9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2883o10 = null;
        }
        c2883o10.f23893j.setVisibility(8);
        C2883o c2883o11 = this.f106319g;
        C2883o c2883o12 = c2883o11;
        if (c2883o11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2883o12 = null;
        }
        c2883o12.f23893j.setFlingAction(new l(this));
        C2883o c2883o13 = this.f106319g;
        C2883o c2883o14 = c2883o13;
        if (c2883o13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2883o14 = null;
        }
        c2883o14.h.setOnClickListener(new IR.g(this, 2));
        C2883o c2883o15 = this.f106319g;
        C2883o c2883o16 = c2883o15;
        if (c2883o15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2883o16 = null;
        }
        c2883o16.f23887c.setOnClickListener(new IR.j(this, 1));
        C2883o c2883o17 = this.f106319g;
        C2883o c2883o18 = c2883o17;
        if (c2883o17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2883o18 = null;
        }
        final int i9 = 0;
        c2883o18.f23891g.setOnClickListener(new View.OnClickListener(this, i9) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f106407a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f106408b;

            {
                this.f106407a = i9;
                this.f106408b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:55:0x023b  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r11) {
                /*
                    Method dump skipped, instruction units count: 914
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.ViewOnClickListenerC6521e.onClick(android.view.View):void");
            }
        });
        C2883o c2883o19 = this.f106319g;
        C2883o c2883o20 = c2883o19;
        if (c2883o19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2883o20 = null;
        }
        c2883o20.f23889e.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorCaptionEditFragmentV3 f106409a;

            {
                this.f106409a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV3 = this.f106409a;
                biliEditorCaptionEditFragmentV3.sf();
                Xz0.d dVar = Xz0.d.f28458a;
                boolean z6 = biliEditorCaptionEditFragmentV3.f106328q;
                dVar.getClass();
                Xz0.d.n("keyboard", z6);
            }
        });
        C2883o c2883o21 = this.f106319g;
        C2883o c2883o22 = c2883o21;
        if (c2883o21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2883o22 = null;
        }
        c2883o22.f23888d.setOnClickListener(new RI.a(2, this));
        C2883o c2883o23 = this.f106319g;
        C2883o c2883o24 = c2883o23;
        if (c2883o23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2883o24 = null;
        }
        c2883o24.f23890f.addOnScrollListener(new k(this));
        this.f106323l = of().f106708c.a().f3278b;
        ArrayList<b> arrayList = this.f106322k;
        ArrayList arrayList2 = new ArrayList();
        ArrayList<CaptionInfo> arrayList3 = this.f106323l;
        if (arrayList3 != null) {
            Iterator<T> it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(new b(this, (CaptionInfo) it.next()));
            }
        }
        arrayList2.size();
        CollectionsKt.addAll(arrayList, CollectionsKt.sortedWith(arrayList2, (Comparator) new Object()));
        Xw0.c<b> cVar4 = this.f106321j;
        Xw0.c<b> cVar5 = cVar4;
        if (cVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editionsAdapter");
            cVar5 = null;
        }
        cVar5.notifyDataSetChanged();
        Bundle arguments = getArguments();
        this.f106337z = arguments != null ? arguments.getInt("item_asr_type") : 0;
        Bundle arguments2 = getArguments();
        int i10 = 0;
        if (arguments2 != null) {
            i10 = arguments2.getInt("item_init_index");
        }
        this.f106327p = i10;
        C2883o c2883o25 = this.f106319g;
        C2883o c2883o26 = c2883o25;
        if (c2883o25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2883o26 = null;
        }
        c2883o26.f23890f.scrollToPosition(this.f106327p);
        this.f106329r = this.f106322k.get(this.f106327p);
        Xw0.c<b> cVar6 = this.f106321j;
        Xw0.c<b> cVar7 = cVar6;
        if (cVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editionsAdapter");
            cVar7 = null;
        }
        cVar7.notifyItemChanged(this.f106327p);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new BiliEditorCaptionEditFragmentV3$initEvent$1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.editor.moudle.caption.setting.widget.a.b
    public final void p2(int i7, int i8) {
        if (!pf(i7) || this.f106325n) {
            if (!pf(i7)) {
                of().f106710e.f14981b.j();
                this.f106325n = true;
            }
            com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar = this.f106324m;
            int i9 = this.f106325n ? i7 - (aVar != null ? aVar.f106008f : 0) : 0;
            int iDp2px = !pf(i7) ? this.f106335x : DensityUtil.dp2px(294.0f);
            boolean z6 = this.f106325n;
            C2883o c2883o = this.f106319g;
            C2883o c2883o2 = c2883o;
            if (c2883o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c2883o2 = null;
            }
            ViewGroup.LayoutParams layoutParams = c2883o2.f23892i.getLayoutParams();
            layoutParams.height = i9;
            C2883o c2883o3 = this.f106319g;
            C2883o c2883o4 = c2883o3;
            if (c2883o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c2883o4 = null;
            }
            c2883o4.f23892i.setLayoutParams(layoutParams);
            View view = this.h;
            View view2 = view;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
                view2 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            marginLayoutParams.height = iDp2px + i9;
            View view3 = this.h;
            View view4 = view3;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
                view4 = null;
            }
            view4.setLayoutParams(marginLayoutParams);
            int i10 = marginLayoutParams.height;
            if (z6) {
                C6554h c6554hOf = of();
                MutableLiveData mutableLiveData = c6554hOf.f106709d.f16509e.f23139c.a;
                mutableLiveData.setValue(new Fy0.p(i10));
                MainThread.postOnMainThreadDelayed(new RunnableC6553g(c6554hOf, 0), 30L);
            } else {
                C6554h c6554hOf2 = of();
                Sy0.a aVar2 = c6554hOf2.f106709d.f16509e;
                aVar2.getClass();
                int i11 = Mx0.f.f16479i;
                MutableLiveData mutableLiveData2 = aVar2.f23139c.a;
                mutableLiveData2.setValue(new Fy0.p(i11));
                MainThread.postOnMainThreadDelayed(new RunnableC6553g(c6554hOf2, 0), 30L);
            }
            C2883o c2883o5 = this.f106319g;
            C2883o c2883o6 = c2883o5;
            if (c2883o5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c2883o6 = null;
            }
            c2883o6.f23890f.scrollToPosition(this.f106331t);
            if (pf(i7)) {
                C2883o c2883o7 = this.f106319g;
                C2883o c2883o8 = c2883o7;
                if (c2883o7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c2883o8 = null;
                }
                c2883o8.f23886b.setVisibility(8);
                C2883o c2883o9 = this.f106319g;
                C2883o c2883o10 = c2883o9;
                if (c2883o9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c2883o10 = null;
                }
                c2883o10.f23889e.setVisibility(8);
                C2883o c2883o11 = this.f106319g;
                if (c2883o11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c2883o11 = null;
                }
                c2883o11.f23893j.setVisibility(8);
                this.f106325n = false;
                of().f106709d.f16506b.n();
            } else {
                C2883o c2883o12 = this.f106319g;
                C2883o c2883o13 = c2883o12;
                if (c2883o12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c2883o13 = null;
                }
                c2883o13.f23886b.setVisibility(0);
                C2883o c2883o14 = this.f106319g;
                C2883o c2883o15 = c2883o14;
                if (c2883o14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c2883o15 = null;
                }
                c2883o15.f23889e.setVisibility(0);
                C2883o c2883o16 = this.f106319g;
                if (c2883o16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c2883o16 = null;
                }
                c2883o16.f23893j.setVisibility(0);
            }
            if (this.f106330s != null && pf(i7)) {
                CaptionEditText captionEditText = this.f106330s;
                if (captionEditText != null) {
                    captionEditText.clearFocus();
                }
                View view5 = this.f106311A;
                if (view5 != null) {
                    view5.setSelected(false);
                }
            }
            if (this.f106325n) {
                return;
            }
            of().K0(BackUpTag.CAPTION_ADD);
        }
    }

    public final boolean pf(int i7) {
        com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar;
        return i7 == 0 || ((aVar = this.f106324m) != null && i7 == aVar.f106008f);
    }

    public final void rf(int i7) {
        a aVar = this.f106315E;
        if (aVar != null) {
            aVar.a(i7, this.f106312B);
        }
        of().K0(BackUpTag.CAPTION_EDIT);
        Xz0.d dVar = Xz0.d.f28458a;
        String str = this.f106312B ? "1" : "0";
        dVar.getClass();
        HashMap map = new HashMap();
        map.put("is_edit", str);
        Neurons.reportClick(false, "creation.new-video-editor.subtitle.multi-edit-confirm.click", map);
    }

    public final void sf() {
        View decorView;
        IBinder windowToken;
        InputMethodManager inputMethodManager;
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            Window window = fragmentActivityP3.getWindow();
            if (window != null && (decorView = window.getDecorView()) != null && (windowToken = decorView.getWindowToken()) != null && (inputMethodManager = (InputMethodManager) fragmentActivityP3.getSystemService("input_method")) != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
            C2883o c2883o = this.f106319g;
            C2883o c2883o2 = c2883o;
            if (c2883o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c2883o2 = null;
            }
            c2883o2.f23893j.setVisibility(8);
        }
    }

    public final void tf(int i7, boolean z6) {
        int i8 = this.f106331t + 1;
        b bVar = (b) CollectionsKt.getOrNull(this.f106322k, i8);
        if (bVar == null) {
            return;
        }
        C6554h c6554hOf = of();
        BackUpTag backUpTag = BackUpTag.CAPTION_EDIT;
        c6554hOf.K0(backUpTag);
        b bVarA = this.f106329r.a(bVar, z6, i7, false);
        of().K0(backUpTag);
        ((ArrayList) this.f106314D).add(Long.valueOf(bVar.f106338a.id));
        ((ArrayList) this.f106314D).add(Long.valueOf(this.f106329r.f106338a.id));
        ((ArrayList) this.f106313C).add(Long.valueOf(bVarA.f106338a.id));
        this.f106322k.set(this.f106331t, bVarA);
        this.f106322k.remove(i8);
        this.f106329r = bVarA;
        vf();
        Xw0.c<b> cVar = this.f106321j;
        Xw0.c<b> cVar2 = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editionsAdapter");
            cVar2 = null;
        }
        cVar2.f28349a = this.f106322k;
        Xw0.c<b> cVar3 = this.f106321j;
        Xw0.c<b> cVar4 = cVar3;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editionsAdapter");
            cVar4 = null;
        }
        cVar4.notifyDataSetChanged();
        C2883o c2883o = this.f106319g;
        if (c2883o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2883o = null;
        }
        c2883o.f23890f.scrollToPosition(this.f106331t);
        of().L0();
        this.f106327p = this.f106331t;
    }

    public final void uf(int i7, boolean z6) {
        int i8 = this.f106331t;
        int i9 = i8 - 1;
        b bVar = (b) CollectionsKt.getOrNull(this.f106322k, i9);
        if (bVar == null) {
            return;
        }
        C6554h c6554hOf = of();
        BackUpTag backUpTag = BackUpTag.CAPTION_EDIT;
        c6554hOf.K0(backUpTag);
        b bVarA = bVar.a(this.f106329r, z6, i7, true);
        of().K0(backUpTag);
        ((ArrayList) this.f106314D).add(Long.valueOf(bVar.f106338a.id));
        ((ArrayList) this.f106314D).add(Long.valueOf(this.f106329r.f106338a.id));
        ((ArrayList) this.f106313C).add(Long.valueOf(bVarA.f106338a.id));
        this.f106322k.set(i9, bVarA);
        this.f106322k.remove(i8);
        this.f106329r = bVarA;
        this.f106331t = i9;
        this.f106332u = bVar.f106339b.length() + this.f106332u;
        int length = bVar.f106339b.length() + this.f106333v;
        this.f106333v = length;
        if (this.f106332u > i7) {
            this.f106332u = i7;
        }
        if (length > i7) {
            this.f106333v = i7;
        }
        vf();
        Xw0.c<b> cVar = this.f106321j;
        Xw0.c<b> cVar2 = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editionsAdapter");
            cVar2 = null;
        }
        cVar2.f28349a = this.f106322k;
        Xw0.c<b> cVar3 = this.f106321j;
        Xw0.c<b> cVar4 = cVar3;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editionsAdapter");
            cVar4 = null;
        }
        cVar4.notifyDataSetChanged();
        C2883o c2883o = this.f106319g;
        if (c2883o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2883o = null;
        }
        c2883o.f23890f.scrollToPosition(this.f106331t);
        of().L0();
        this.f106327p = this.f106331t;
    }

    public final void vf() {
        this.f106326o = new Triple<>(-1, -1L, -1L);
    }

    public final void wf(int i7) {
        int color = Color.parseColor("#CCFFFFFF");
        int color2 = Color.parseColor("#66FFFFFF");
        if (this.f106331t != 0) {
            C2883o c2883o = this.f106319g;
            C2883o c2883o2 = c2883o;
            if (c2883o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c2883o2 = null;
            }
            c2883o2.h.setEnabled(true);
            C2883o c2883o3 = this.f106319g;
            C2883o c2883o4 = c2883o3;
            if (c2883o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c2883o4 = null;
            }
            c2883o4.h.setTextColor(color);
        } else {
            C2883o c2883o5 = this.f106319g;
            C2883o c2883o6 = c2883o5;
            if (c2883o5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c2883o6 = null;
            }
            c2883o6.h.setEnabled(false);
            C2883o c2883o7 = this.f106319g;
            C2883o c2883o8 = c2883o7;
            if (c2883o7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c2883o8 = null;
            }
            c2883o8.h.setTextColor(color2);
        }
        if (this.f106331t < this.f106322k.size() - 1) {
            C2883o c2883o9 = this.f106319g;
            C2883o c2883o10 = c2883o9;
            if (c2883o9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c2883o10 = null;
            }
            c2883o10.f23887c.setEnabled(true);
            C2883o c2883o11 = this.f106319g;
            C2883o c2883o12 = c2883o11;
            if (c2883o11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c2883o12 = null;
            }
            c2883o12.f23887c.setTextColor(color);
        } else {
            C2883o c2883o13 = this.f106319g;
            C2883o c2883o14 = c2883o13;
            if (c2883o13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c2883o14 = null;
            }
            c2883o14.f23887c.setEnabled(false);
            C2883o c2883o15 = this.f106319g;
            C2883o c2883o16 = c2883o15;
            if (c2883o15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c2883o16 = null;
            }
            c2883o16.f23887c.setTextColor(color2);
        }
        int i8 = this.f106332u;
        if (i8 == 0 || i8 == i7) {
            C2883o c2883o17 = this.f106319g;
            C2883o c2883o18 = c2883o17;
            if (c2883o17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c2883o18 = null;
            }
            c2883o18.f23891g.setEnabled(false);
            C2883o c2883o19 = this.f106319g;
            if (c2883o19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c2883o19 = null;
            }
            c2883o19.f23891g.setTextColor(color2);
        } else {
            C2883o c2883o20 = this.f106319g;
            C2883o c2883o21 = c2883o20;
            if (c2883o20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c2883o21 = null;
            }
            c2883o21.f23891g.setEnabled(true);
            C2883o c2883o22 = this.f106319g;
            if (c2883o22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c2883o22 = null;
            }
            c2883o22.f23891g.setTextColor(color);
        }
        this.f106322k.get(this.f106331t).getClass();
        of().L0();
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.CAPTION;
    }
}
