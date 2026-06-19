package com.bilibili.studio.editor.moudle.caption.setting.ui.v2;

import D9.c;
import UC0.n;
import Vn.A;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import ax0.d;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.fasthybrid.runtime.p0;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.studio.editor.moudle.caption.setting.ui.v3.BiliEditorCaptionAnimationFragment;
import com.bilibili.studio.editor.moudle.caption.setting.ui.v3.BiliEditorCaptionFlowerFragment;
import com.bilibili.studio.editor.moudle.caption.setting.widget.UpperPagerSlidingTabStrip;
import com.bilibili.studio.editor.moudle.caption.setting.widget.a;
import com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity;
import com.bilibili.studio.videoeditor.util.C6635h;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.studio.videoeditor.util.ScreenUtil;
import d90.l;
import dx0.InterfaceC6891b;
import fx0.f;
import fx0.h;
import fx0.i;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lB0.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import px0.e;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/ui/v2/BiliEditorCaptionSettingV2Fragment.class */
public class BiliEditorCaptionSettingV2Fragment extends BaseFragment implements View.OnClickListener, a.b, TextWatcher, InterfaceC6891b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f105831A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ImageView f105832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public EditText f105833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TextView f105834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ImageView f105835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public FrameLayout f105836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ViewPager f105837g;

    @Nullable
    public TextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public CheckBox f105838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public TextView f105839j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public View f105840k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public d f105841l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public BiliEditorCaptionTemplateV2Fragment f105842m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public BiliEditorCaptionFontV2Fragment f105843n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public BiliEditorCaptionStyleV2Fragment f105844o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public BiliEditorCaptionFlowerFragment f105845p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public BiliEditorCaptionAnimationFragment f105846q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f105848s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f105849t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public com.bilibili.studio.editor.moudle.caption.setting.widget.a f105850u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f105851v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f105852w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f105853x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public a.a f105855z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f105847r = 60;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final ArrayList<String> f105854y = new ArrayList<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/ui/v2/BiliEditorCaptionSettingV2Fragment$a.class */
    public static final class a implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorCaptionSettingV2Fragment f105856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105857b;

        public a(BiliEditorCaptionSettingV2Fragment biliEditorCaptionSettingV2Fragment, String str) {
            this.f105856a = biliEditorCaptionSettingV2Fragment;
            this.f105857b = str;
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
                Method dump skipped, instruction units count: 395
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.caption.setting.ui.v2.BiliEditorCaptionSettingV2Fragment.a.onPageSelected(int):void");
        }
    }

    public static long kf(long j7) {
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
        int length = string.length();
        ImageView imageView = this.f105835e;
        if (imageView != null) {
            imageView.setVisibility(length != 0 ? 0 : 8);
        }
        of(string);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i7, int i8, int i9) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void jf() {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.caption.setting.ui.v2.BiliEditorCaptionSettingV2Fragment.jf():void");
    }

    public final void lf() {
        Window window;
        View decorView;
        IBinder windowToken;
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 == null || (window = fragmentActivityP3.getWindow()) == null || (decorView = window.getDecorView()) == null || (windowToken = decorView.getWindowToken()) == null) {
            return;
        }
        this.f105851v = this.f105852w;
        InputMethodManager inputMethodManager = (InputMethodManager) fragmentActivityP3.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mf() {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.caption.setting.ui.v2.BiliEditorCaptionSettingV2Fragment.mf():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void nf(java.lang.CharSequence r4) {
        /*
            r3 = this;
            r0 = r3
            android.widget.EditText r0 = r0.f105833c
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L50
            r0 = r8
            android.text.Editable r0 = r0.getText()
            r5 = r0
            java.lang.String r0 = ""
            r7 = r0
            r0 = r5
            if (r0 == 0) goto L24
            r0 = r5
            java.lang.String r0 = r0.toString()
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L27
        L24:
            java.lang.String r0 = ""
            r5 = r0
        L27:
            r0 = r7
            r6 = r0
            r0 = r4
            if (r0 == 0) goto L3d
            r0 = r4
            java.lang.String r0 = r0.toString()
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L3d
            r0 = r7
            r6 = r0
            goto L3d
        L3d:
            r0 = r5
            r1 = r6
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L50
            r0 = r8
            r1 = r6
            r0.setText(r1)
            r0 = r3
            r1 = r6
            r0.of(r1)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.caption.setting.ui.v2.BiliEditorCaptionSettingV2Fragment.nf(java.lang.CharSequence):void");
    }

    public final void of(String str) {
        int length = str.length();
        TextView textView = this.f105834d;
        if (textView != null) {
            textView.setVisibility(length != 0 ? 0 : 8);
            textView.setText(length + "/" + this.f105847r);
            textView.setTextColor(length == this.f105847r ? this.f105849t : this.f105848s);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        int id = view.getId();
        boolean z6 = true;
        if (id == 2131304292) {
            lf();
            InfoEyesManager.getInstance().report2(false, "000225", new String[]{"contribute_subtitle_add_behave", "click", String.valueOf(0)});
            InfoEyesManager.getInstance().report2(false, "000225", new String[]{"contribute_subtitle_add_behave_cancel", "click", C6635h.e(), String.valueOf(1)});
            mf();
            return;
        }
        if (id == 2131304293) {
            if (DeviceDecision.INSTANCE.getBoolean("upper.caption_anim_renderer_feature_enable", true) && ex0.a.a) {
                lf();
            } else {
                jf();
            }
            mf();
            return;
        }
        if (id == 2131304132) {
            nf("");
            return;
        }
        if (id != 2131314159 && id == 2131317279) {
            CheckBox checkBox = this.f105838i;
            if (checkBox != null) {
                checkBox.setChecked(!checkBox.isChecked());
            }
            CheckBox checkBox2 = this.f105838i;
            if (checkBox2 == null || !checkBox2.isChecked()) {
                z6 = false;
            }
            ex0.a.a = z6;
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        if (context != null) {
            Point screenRealSize = ScreenUtil.getScreenRealSize(context);
            this.f105852w = DensityUtil.dp2px(303.0f);
            this.f105853x = (int) (screenRealSize.y * 0.6f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131494051, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar = this.f105850u;
        if (aVar != null) {
            aVar.a();
        }
        this.f105842m = null;
        this.f105843n = null;
        this.f105844o = null;
        this.f105846q = null;
        this.f105845p = null;
        a.a aVar2 = this.f105855z;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contract");
            aVar2 = null;
        }
        aVar2.a();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentHide(@NotNull Flag flag) {
        super.onFragmentHide(flag);
        if (isAdded() && !isDetached()) {
            ViewPager viewPager = this.f105837g;
            if (viewPager != null) {
                PagerAdapter adapter = viewPager.getAdapter();
                int count = adapter != null ? adapter.getCount() : 0;
                if (count > 0 && count > 0) {
                    viewPager.setCurrentItem(0);
                }
            }
            e.d(getContext());
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        super.onFragmentShow(flag);
        if (!isAdded() || isDetached()) {
            return;
        }
        pf();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar = this.f105850u;
        if (aVar != null) {
            aVar.f106004b = null;
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar = this.f105850u;
        if (aVar != null) {
            aVar.f106004b = this;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i7, int i8, int i9) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v65, types: [android.widget.CompoundButton$OnCheckedChangeListener, java.lang.Object] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view, bundle);
        this.f105832b = (ImageView) view.findViewById(2131304293);
        this.f105833c = (EditText) view.findViewById(2131301194);
        this.f105834d = (TextView) view.findViewById(2131315566);
        this.f105835e = (ImageView) view.findViewById(2131304132);
        this.f105836f = (FrameLayout) view.findViewById(2131301641);
        this.f105837g = (ViewPager) view.findViewById(2131316429);
        this.h = (TextView) view.findViewById(2131314159);
        this.f105840k = view.findViewById(2131317279);
        this.f105838i = (CheckBox) view.findViewById(2131317280);
        View view2 = getView();
        this.f105839j = view2 != null ? (TextView) view2.findViewById(2131317281) : null;
        TextView textView = this.h;
        if (textView != null) {
            textView.setVisibility(DeviceDecision.INSTANCE.getBoolean("upper.caption_anim_renderer_feature_enable", true) ? 8 : 0);
        }
        View view3 = this.f105840k;
        if (view3 != null) {
            int i7 = 8;
            if (DeviceDecision.INSTANCE.getBoolean("upper.caption_anim_renderer_feature_enable", true)) {
                i7 = 0;
            }
            view3.setVisibility(i7);
        }
        UpperPagerSlidingTabStrip upperPagerSlidingTabStrip = (UpperPagerSlidingTabStrip) view.findViewById(2131312846);
        ArrayList arrayList = new ArrayList();
        BiliEditorCaptionTemplateV2Fragment biliEditorCaptionTemplateV2Fragment = new BiliEditorCaptionTemplateV2Fragment();
        arrayList.add(biliEditorCaptionTemplateV2Fragment);
        this.f105842m = biliEditorCaptionTemplateV2Fragment;
        BiliEditorCaptionFontV2Fragment biliEditorCaptionFontV2Fragment = new BiliEditorCaptionFontV2Fragment();
        biliEditorCaptionFontV2Fragment.f105829g = true;
        arrayList.add(biliEditorCaptionFontV2Fragment);
        this.f105843n = biliEditorCaptionFontV2Fragment;
        BiliEditorCaptionStyleV2Fragment biliEditorCaptionStyleV2Fragment = new BiliEditorCaptionStyleV2Fragment();
        arrayList.add(biliEditorCaptionStyleV2Fragment);
        this.f105844o = biliEditorCaptionStyleV2Fragment;
        if (DeviceDecision.INSTANCE.getBoolean("upper.caption_anim_renderer_feature_enable", true)) {
            BiliEditorCaptionFlowerFragment biliEditorCaptionFlowerFragment = new BiliEditorCaptionFlowerFragment();
            arrayList.add(biliEditorCaptionFlowerFragment);
            this.f105845p = biliEditorCaptionFlowerFragment;
            BiliEditorCaptionAnimationFragment biliEditorCaptionAnimationFragment = new BiliEditorCaptionAnimationFragment();
            arrayList.add(biliEditorCaptionAnimationFragment);
            this.f105846q = biliEditorCaptionAnimationFragment;
        }
        d dVar = new d(getChildFragmentManager(), 1);
        dVar.f54266b = CollectionsKt.arrayListOf(new String[]{getString(2131842022), getString(2131841805), getString(2131841918), getString(2131841923), getString(2131842085)});
        dVar.f54267c = arrayList;
        this.f105841l = dVar;
        ViewPager viewPager = this.f105837g;
        if (viewPager != null) {
            viewPager.setOffscreenPageLimit(4);
            viewPager.setAdapter(this.f105841l);
        }
        upperPagerSlidingTabStrip.setViewPager(this.f105837g);
        upperPagerSlidingTabStrip.setOnTabClickListener(new p0(this));
        upperPagerSlidingTabStrip.setOnPageReselectedListener(new l(this));
        EditText editText = this.f105833c;
        if (editText != null) {
            editText.addTextChangedListener(this);
        }
        ImageView imageView = this.f105835e;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        view.findViewById(2131304292).setOnClickListener(this);
        ImageView imageView2 = this.f105832b;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        TextView textView2 = this.h;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        View view4 = this.f105840k;
        if (view4 != null) {
            view4.setOnClickListener(this);
        }
        FrameLayout frameLayout = this.f105836f;
        this.f105851v = (frameLayout == null || (layoutParams = frameLayout.getLayoutParams()) == null) ? this.f105852w : layoutParams.height;
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            this.f105848s = ThemeUtils.getColorById(fragmentActivityP3, 2131100371);
            this.f105849t = ThemeUtils.getColorById(fragmentActivityP3, 2131100370);
            this.f105850u = new com.bilibili.studio.editor.moudle.caption.setting.widget.a(fragmentActivityP3);
            view.post(new i(0, this));
        }
        ex0.a.a = false;
        CheckBox checkBox = this.f105838i;
        if (checkBox != null) {
            checkBox.setChecked(false);
        }
        CheckBox checkBox2 = this.f105838i;
        if (checkBox2 != 0) {
            checkBox2.setOnCheckedChangeListener(new Object());
        }
        Lazy<n> lazy = n.f24629b;
        n.a.a().d(new h(this), new RX0.h(3), new c(this));
        lB0.a aVarA = lB0.a.a();
        f fVar = new f(this);
        aVarA.getClass();
        this.f105855z = lB0.a.b(cx0.a.class, fVar);
        String str = p3() instanceof BiliEditorMainActivity ? "editor" : "cover";
        Xz0.d dVar2 = Xz0.d.f28458a;
        dVar2.getClass();
        Xz0.d.c(str);
        d dVar3 = this.f105841l;
        String string = null;
        if (dVar3 != null) {
            CharSequence pageTitle = dVar3.getPageTitle(0);
            string = null;
            if (pageTitle != null) {
                string = pageTitle.toString();
            }
        }
        if (string != null && !this.f105854y.contains(string)) {
            dVar2.getClass();
            Xz0.d.O(string);
            this.f105854y.add(string);
        }
        ViewPager viewPager2 = this.f105837g;
        if (viewPager2 != null) {
            viewPager2.addOnPageChangeListener(new a(this, str));
        }
        TextView textView3 = this.f105839j;
        if (textView3 != null) {
            textView3.setText(2131842077);
        }
    }

    @Override // com.bilibili.studio.editor.moudle.caption.setting.widget.a.b
    public final void p2(int i7, int i8) {
        ViewGroup.LayoutParams layoutParams;
        int i9 = this.f105852w;
        int i10 = (i7 >= this.f105853x || i9 / 2 > i7) ? i9 : i7;
        this.f105851v = i10;
        StringBuilder sbB = A.b(i10, i7, "onKeyboardHeightChanged...keyBoardHeight = ", ", height = ", ", mKeyboardDefHeight = ");
        sbB.append(i9);
        BLog.ifmt("BiliEditorCaptionSettingFragment", sbB.toString(), new Object[0]);
        int i11 = this.f105851v;
        if (i11 <= 0) {
            return;
        }
        FrameLayout frameLayout = this.f105836f;
        if (frameLayout != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
            layoutParams.height = i11;
            FrameLayout frameLayout2 = this.f105836f;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(layoutParams);
            }
        }
        TextView textView = this.f105839j;
        if (textView != null) {
            textView.setText(2131842077);
        }
    }

    public final void pf() {
        TextView textView;
        if (!isAdded() || isDetached() || (textView = this.h) == null) {
            return;
        }
        textView.setText(2131842002);
    }

    @Override // dx0.InterfaceC6891b
    @Nullable
    public final com.bilibili.studio.editor.moudle.caption.setting.presenter.e v8() {
        return null;
    }
}
