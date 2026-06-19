package com.bilibili.studio.editor.moudle.intelligence.ui;

import H60.x;
import J3.C2332d;
import UD.t1;
import Vn.A;
import Xz0.d;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import cn.com.chinatelecom.account.api.d.m;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieListener;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.lib.fasthybrid.uimodule.widget.appvideo.J;
import com.bilibili.studio.comm.ab.ABManager;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceEnterResult;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceInitData;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import tv.danmaku.android.log.BLog;
import zw0.C9269a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/ui/BiliIntelligenceDialogFragment.class */
public final class BiliIntelligenceDialogFragment extends DialogFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public com.bilibili.studio.editor.moudle.intelligence.vm.b f107566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f107567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f107568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LottieAnimationView f107569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f107570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f107571g;
    public TextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public EditVideoInfo f107572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public IntelligenceInitData f107573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public a f107574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f107575l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f107576m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f107577n = LazyKt.lazy(new C2332d(9));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/ui/BiliIntelligenceDialogFragment$a.class */
    public interface a {
        void a(@Nullable EditVideoInfo editVideoInfo, boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/ui/BiliIntelligenceDialogFragment$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f107578a;

        public b(Function1 function1) {
            this.f107578a = function1;
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
            return this.f107578a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f107578a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.intelligence.ui.BiliIntelligenceDialogFragment$onClick$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/ui/BiliIntelligenceDialogFragment$onClick$1.class */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<String, String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1, StringsKt.class, "trimStart", "trimStart(Ljava/lang/String;)Ljava/lang/String;", 1);
        }

        public final String invoke(String str) {
            return StringsKt.trimStart(str).toString();
        }
    }

    public BiliIntelligenceDialogFragment() {
        setCancelable(false);
    }

    public final void hf(int i7) throws JSONException {
        EditVideoInfo editVideoInfo;
        com.bilibili.studio.editor.moudle.intelligence.vm.b bVar = this.f107566b;
        if (bVar == null || bVar.f107585f) {
            return;
        }
        bVar.f107585f = true;
        boolean z6 = i7 == -1;
        if (i7 == 10) {
            bVar.K0();
        }
        if (bVar.f107589k == 2 && (editVideoInfo = bVar.f107582c) != null) {
            editVideoInfo.setIntelligenceState(i7 == -1 ? 1 : -1);
        }
        EditVideoInfo editVideoInfo2 = bVar.f107582c;
        dismissAllowingStateLoss();
        a aVar = this.f107574k;
        if (aVar != null) {
            aVar.a(editVideoInfo2, z6);
        }
        Unit unit = Unit.INSTANCE;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) throws JSONException {
        IntelligenceEnterResult intelligenceEnterResult;
        IntelligenceEnterResult intelligenceEnterResult2;
        com.bilibili.studio.editor.moudle.intelligence.vm.b bVar = this.f107566b;
        int i7 = (bVar == null || (intelligenceEnterResult2 = bVar.f107583d) == null) ? 0 : intelligenceEnterResult2.imageCount;
        int i8 = (bVar == null || (intelligenceEnterResult = bVar.f107583d) == null) ? 0 : intelligenceEnterResult.videoCount;
        int i9 = bVar != null ? bVar.f107593o : 2;
        ImageView imageView = this.f107567c;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvClose");
            imageView2 = null;
        }
        if (Intrinsics.areEqual(view, imageView2)) {
            com.bilibili.studio.editor.moudle.intelligence.vm.b bVar2 = this.f107566b;
            if (bVar2 != null) {
                bVar2.K0();
            }
            d dVar = d.f28458a;
            long j7 = this.f107575l;
            dVar.getClass();
            d.H(i7, i8, i9, j7);
            com.bilibili.studio.editor.moudle.intelligence.vm.b bVar3 = this.f107566b;
            if (bVar3 != null) {
                bVar3.P0("cancel", "左上角退出");
            }
            dismissAllowingStateLoss();
            a aVar = this.f107574k;
            if (aVar != null) {
                aVar.a(null, false);
            }
        } else {
            TextView textView = this.f107568d;
            TextView textView2 = textView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mButtonExit");
                textView2 = null;
            }
            if (Intrinsics.areEqual(view, textView2)) {
                com.bilibili.studio.editor.moudle.intelligence.vm.b bVar4 = this.f107566b;
                if (bVar4 != null) {
                    bVar4.K0();
                }
                d dVar2 = d.f28458a;
                long j8 = this.f107575l;
                dVar2.getClass();
                d.H(i7, i8, i9, j8);
                com.bilibili.studio.editor.moudle.intelligence.vm.b bVar5 = this.f107566b;
                if (bVar5 != null) {
                    bVar5.P0("cancel", "用户取消");
                }
                dismissAllowingStateLoss();
                a aVar2 = this.f107574k;
                if (aVar2 != null) {
                    aVar2.a(null, false);
                }
                StringBuilder sbB = A.b(i7, i8, "\n                退出智能成片 \n                picCount = ", "\n                videoCount = ", "\n                smartFrom = ");
                sbB.append(i9);
                sbB.append("\n            ");
                BLog.ifmt("~yuanpian~", "\n------------------------   \n \n%s\n\n------------------------\n  ", new Object[]{SequencesKt.e(StringsKt.lineSequence(sbB.toString()), System.lineSeparator(), (CharSequence) null, (CharSequence) null, AnonymousClass1.INSTANCE, 30)});
            }
        }
        ImageView imageView3 = this.f107567c;
        ImageView imageView4 = imageView3;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvClose");
            imageView4 = null;
        }
        if (!Intrinsics.areEqual(view, imageView4)) {
            TextView textView3 = this.f107568d;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mButtonExit");
                textView3 = null;
            }
            if (!Intrinsics.areEqual(view, textView3)) {
                return;
            }
        }
        Sz0.a.a(0L, "click_analysis_loading_cancel", "cancel", ((Boolean) this.f107577n.getValue()).booleanValue());
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, 2131888076);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131493916, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        LottieAnimationView lottieAnimationView = this.f107569e;
        LottieAnimationView lottieAnimationView2 = lottieAnimationView;
        if (lottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLavLoading");
            lottieAnimationView2 = null;
        }
        lottieAnimationView2.setRepeatCount(-1);
        LottieAnimationView lottieAnimationView3 = this.f107569e;
        if (lottieAnimationView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLavLoading");
            lottieAnimationView3 = null;
        }
        lottieAnimationView3.playAnimation();
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(5894);
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        LottieAnimationView lottieAnimationView = this.f107569e;
        LottieAnimationView lottieAnimationView2 = lottieAnimationView;
        if (lottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLavLoading");
            lottieAnimationView2 = null;
        }
        lottieAnimationView2.pauseAnimation();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        IntelligenceInitData intelligenceInitData;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<String> mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3;
        int i7;
        super.onViewCreated(view, bundle);
        this.f107566b = (com.bilibili.studio.editor.moudle.intelligence.vm.b) new ViewModelProvider(this).get(com.bilibili.studio.editor.moudle.intelligence.vm.b.class);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getInt("key_show_page_from", 1);
        }
        this.f107575l = System.currentTimeMillis();
        this.f107567c = (ImageView) view.findViewById(2131302903);
        this.f107569e = (LottieAnimationView) view.findViewById(2131303860);
        this.f107568d = (TextView) view.findViewById(2131314500);
        ImageView imageView = this.f107567c;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvClose");
            imageView2 = null;
        }
        imageView2.setOnClickListener(this);
        TextView textView = this.f107568d;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mButtonExit");
            textView2 = null;
        }
        textView2.setOnClickListener(this);
        if (((Boolean) this.f107577n.getValue()).booleanValue()) {
            ImageView imageView3 = this.f107567c;
            ImageView imageView4 = imageView3;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvClose");
                imageView4 = null;
            }
            imageView4.setVisibility(8);
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new BiliIntelligenceDialogFragment$initView$1(this, null), 3, (Object) null);
        } else {
            ImageView imageView5 = this.f107567c;
            ImageView imageView6 = imageView5;
            if (imageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvClose");
                imageView6 = null;
            }
            imageView6.setVisibility(0);
        }
        String str = C9269a.f130944e;
        if (TextUtils.isEmpty(str) || !m.b(str)) {
            LottieAnimationView lottieAnimationView = this.f107569e;
            LottieAnimationView lottieAnimationView2 = lottieAnimationView;
            if (lottieAnimationView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLavLoading");
                lottieAnimationView2 = null;
            }
            ViewGroup.LayoutParams layoutParams = lottieAnimationView2.getLayoutParams();
            layoutParams.width = ScreenUtil.dip2px(getContext(), 54.0f);
            layoutParams.height = ScreenUtil.dip2px(getContext(), 54.0f);
            LottieAnimationView lottieAnimationView3 = this.f107569e;
            LottieAnimationView lottieAnimationView4 = lottieAnimationView3;
            if (lottieAnimationView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLavLoading");
                lottieAnimationView4 = null;
            }
            lottieAnimationView4.setLayoutParams(layoutParams);
            LottieAnimationView lottieAnimationView5 = this.f107569e;
            LottieAnimationView lottieAnimationView6 = lottieAnimationView5;
            if (lottieAnimationView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLavLoading");
                lottieAnimationView6 = null;
            }
            lottieAnimationView6.setImageAssetsFolder("intelligence_loading/");
            LottieCompositionFactory.fromAsset(getContext(), "intelligence_analysis_anim.json").addListener(new LottieListener(this) { // from class: com.bilibili.studio.editor.moudle.intelligence.ui.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliIntelligenceDialogFragment f107580a;

                {
                    this.f107580a = this;
                }

                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    LottieComposition lottieComposition = (LottieComposition) obj;
                    BiliIntelligenceDialogFragment biliIntelligenceDialogFragment = this.f107580a;
                    LottieAnimationView lottieAnimationView7 = biliIntelligenceDialogFragment.f107569e;
                    LottieAnimationView lottieAnimationView8 = lottieAnimationView7;
                    if (lottieAnimationView7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mLavLoading");
                        lottieAnimationView8 = null;
                    }
                    lottieAnimationView8.setComposition(lottieComposition);
                    LottieAnimationView lottieAnimationView9 = biliIntelligenceDialogFragment.f107569e;
                    if (lottieAnimationView9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mLavLoading");
                        lottieAnimationView9 = null;
                    }
                    lottieAnimationView9.playAnimation();
                }
            });
        } else {
            LottieCompositionFactory.fromJsonInputStream(new FileInputStream(str), "intelligence_anim").addListener(new LottieListener(this) { // from class: com.bilibili.studio.editor.moudle.intelligence.ui.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliIntelligenceDialogFragment f107579a;

                {
                    this.f107579a = this;
                }

                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    LottieComposition lottieComposition = (LottieComposition) obj;
                    BiliIntelligenceDialogFragment biliIntelligenceDialogFragment = this.f107579a;
                    LottieAnimationView lottieAnimationView7 = biliIntelligenceDialogFragment.f107569e;
                    LottieAnimationView lottieAnimationView8 = lottieAnimationView7;
                    if (lottieAnimationView7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mLavLoading");
                        lottieAnimationView8 = null;
                    }
                    lottieAnimationView8.setComposition(lottieComposition);
                    LottieAnimationView lottieAnimationView9 = biliIntelligenceDialogFragment.f107569e;
                    if (lottieAnimationView9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mLavLoading");
                        lottieAnimationView9 = null;
                    }
                    lottieAnimationView9.playAnimation();
                }
            });
        }
        this.f107570f = (TextView) view.findViewById(2131311798);
        this.f107571g = (TextView) view.findViewById(2131314803);
        TextView textView3 = (TextView) view.findViewById(2131314227);
        this.h = textView3;
        TextView textView4 = textView3;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvBottomTip");
            textView4 = null;
        }
        ViewGroup.LayoutParams layoutParams2 = textView4.getLayoutParams();
        if ((layoutParams2 instanceof ConstraintLayout.LayoutParams) && (i7 = this.f107576m) > 0) {
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams2)).bottomMargin = DensityUtil.dp2px(16.0f) + i7;
            TextView textView5 = this.h;
            TextView textView6 = textView5;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvBottomTip");
                textView6 = null;
            }
            textView6.setLayoutParams(layoutParams2);
        }
        com.bilibili.studio.editor.moudle.intelligence.vm.b bVar = this.f107566b;
        if (bVar != null && (mutableLiveData3 = bVar.f107595q) != null) {
            mutableLiveData3.observe(this, new b(new t1(this, 2)));
        }
        com.bilibili.studio.editor.moudle.intelligence.vm.b bVar2 = this.f107566b;
        if (bVar2 != null && (mutableLiveData2 = bVar2.f107596r) != null) {
            mutableLiveData2.observe(this, new b(new J(this, 2)));
        }
        com.bilibili.studio.editor.moudle.intelligence.vm.b bVar3 = this.f107566b;
        if (bVar3 != null && (mutableLiveData = bVar3.f107584e) != null) {
            mutableLiveData.observe(this, new b(new x(this, 4)));
        }
        BLog.e("intelligence_tag", "startIntelligence ！！！！！不可能调用多次吧");
        com.bilibili.studio.editor.moudle.templatev2.vm.a.f108156d.set(true);
        Map<String, String> map = ABManager.f105341a;
        com.bilibili.studio.comm.ab.a[] aVarArr = {(com.bilibili.studio.comm.ab.a) com.bilibili.studio.comm.ab.d.f105371w.getValue()};
        List list = (List) com.bilibili.studio.editor.moudle.templatev2.vm.a.f108155c.getValue();
        ABManager.b(aVarArr);
        ABManager.c(aVarArr, list);
        com.bilibili.studio.editor.moudle.intelligence.vm.b bVar4 = this.f107566b;
        if (bVar4 != null) {
            bVar4.N0();
        }
        if (this.f107572i == null || p3() == null || (intelligenceInitData = this.f107573j) == null) {
            dismissAllowingStateLoss();
            a aVar = this.f107574k;
            if (aVar != null) {
                aVar.a(null, false);
                return;
            }
            return;
        }
        com.bilibili.studio.editor.moudle.intelligence.vm.b bVar5 = this.f107566b;
        if (bVar5 != null) {
            IntelligenceEnterResult intelligenceEnterResult = new IntelligenceEnterResult();
            bVar5.f107583d = intelligenceEnterResult;
            bVar5.h = intelligenceInitData.templateId;
            int i8 = intelligenceInitData.intelligenceFrom;
            bVar5.f107593o = i8;
            bVar5.f107587i = intelligenceInitData.templateIsConfig;
            bVar5.f107588j = intelligenceInitData.templateIsServer;
            intelligenceEnterResult.videoCount = intelligenceInitData.videoCount;
            intelligenceEnterResult.imageCount = intelligenceInitData.imageCount;
            intelligenceEnterResult.videoDuration = intelligenceInitData.videoDuration;
            intelligenceEnterResult.intelligenceFrom = i8;
            intelligenceEnterResult.isNewEditor = intelligenceInitData.isNewEditor;
            bVar5.f107589k = intelligenceInitData.pageFrom;
        }
        com.bilibili.studio.editor.moudle.intelligence.vm.b bVar6 = this.f107566b;
        if (bVar6 != null) {
            bVar6.L0(this.f107572i, requireActivity());
        }
    }
}
