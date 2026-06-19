package com.bilibili.upper.module.cover.ui;

import OS0.Z;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.z;
import com.bilibili.adcommon.utils.ext.StringExtKt;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.upper.module.cover_v2.draft.MultiCoverDraft;
import com.bilibili.upper.module.cover_v2.model.MultiCoverConfig;
import j4.o;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/ui/UpperCoverSettingActivity.class */
@StabilityInferred(parameters = 0)
public final class UpperCoverSettingActivity extends BaseAppCompatActivity {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f112730R = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final String f112731B = "UpperCoverSettingActivity";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f112732C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public TextView f112733D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ImageView f112734E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public BiliImageView f112735F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public BiliImageView f112736G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public TextView f112737H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public TextView f112738I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public String f112739J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @Nullable
    public String f112740K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Nullable
    public String f112741L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public String f112742M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f112743N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f112744O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f112745P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f112746Q;

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P6(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            r8 = r0
            r0 = r5
            if (r0 == 0) goto L12
            r0 = r5
            r7 = r0
            r0 = r5
            int r0 = r0.length()
            if (r0 != 0) goto L14
        L12:
            r0 = 0
            r7 = r0
        L14:
            r0 = r7
            if (r0 == 0) goto L4f
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            java.lang.String r0 = com.bilibili.lib.image2.BiliImageLoaderHelper.fileToUri(r0)
            r5 = r0
            com.bilibili.lib.image2.BiliImageLoader r0 = com.bilibili.lib.image2.BiliImageLoader.INSTANCE
            r1 = r4
            com.bilibili.lib.image2.ImageRequestBuilder r0 = r0.with(r1)
            r1 = r5
            com.bilibili.lib.image2.ImageRequestBuilder r0 = r0.url(r1)
            com.bilibili.lib.image2.ImageRequestBuilder r0 = r0.disableMemoryCache()
            com.bilibili.lib.image2.ImageRequestBuilder r0 = r0.disableDiskCache()
            r9 = r0
            r0 = r4
            com.bilibili.lib.image2.view.BiliImageView r0 = r0.f112735F
            r7 = r0
            r0 = r7
            r5 = r0
            r0 = r7
            if (r0 != 0) goto L49
            java.lang.String r0 = "mImvMainCover"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r5 = r0
        L49:
            r0 = r9
            r1 = r5
            r0.into(r1)
        L4f:
            r0 = r6
            if (r0 == 0) goto L5e
            r0 = r6
            r5 = r0
            r0 = r6
            int r0 = r0.length()
            if (r0 != 0) goto L60
        L5e:
            r0 = 0
            r5 = r0
        L60:
            r0 = r5
            if (r0 == 0) goto L9b
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            java.lang.String r0 = com.bilibili.lib.image2.BiliImageLoaderHelper.fileToUri(r0)
            r5 = r0
            com.bilibili.lib.image2.BiliImageLoader r0 = com.bilibili.lib.image2.BiliImageLoader.INSTANCE
            r1 = r4
            com.bilibili.lib.image2.ImageRequestBuilder r0 = r0.with(r1)
            com.bilibili.lib.image2.ImageRequestBuilder r0 = r0.disableMemoryCache()
            com.bilibili.lib.image2.ImageRequestBuilder r0 = r0.disableDiskCache()
            r1 = r5
            com.bilibili.lib.image2.ImageRequestBuilder r0 = r0.url(r1)
            r6 = r0
            r0 = r4
            com.bilibili.lib.image2.view.BiliImageView r0 = r0.f112736G
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L96
            java.lang.String r0 = "mImvSubCover"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = r8
            r5 = r0
            goto L96
        L96:
            r0 = r6
            r1 = r5
            r0.into(r1)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.cover.ui.UpperCoverSettingActivity.P6(java.lang.String, java.lang.String):void");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i8 == -1 && i7 == 2233) {
            this.f112741L = intent != null ? intent.getStringExtra("output_image_path") : null;
            String stringExtra = null;
            if (intent != null) {
                stringExtra = intent.getStringExtra("output_image_sub_path");
            }
            this.f112742M = stringExtra;
            this.f112743N = intent != null ? intent.getLongExtra("key_cover_pos", 0L) : 0L;
            long longExtra = 0;
            if (intent != null) {
                longExtra = intent.getLongExtra("key_sub_cover_pos", 0L);
            }
            this.f112744O = longExtra;
            boolean booleanExtra = false;
            if (intent != null) {
                booleanExtra = intent.getBooleanExtra("is_cover_changed", false);
            }
            this.f112745P = booleanExtra;
            P6(this.f112741L, this.f112742M);
            BLog.i(this.f112731B, z.a("onActivityResult , mEditMainCoverPath =", this.f112739J, " , mEditSubCoverPath = ", this.f112742M));
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        String str;
        String str2 = this.f112741L;
        if (((str2 == null || str2.length() == 0) && ((str = this.f112742M) == null || str.length() == 0)) || (TextUtils.equals(this.f112739J, this.f112741L) && TextUtils.equals(this.f112740K, this.f112742M))) {
            super.onBackPressed();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("output_image_path", this.f112741L);
        intent.putExtra("output_image_sub_path", this.f112742M);
        intent.putExtra("is_cover_changed", this.f112745P);
        setResult(-1, intent);
        finish();
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        MultiCoverConfig config;
        MultiCoverConfig config2;
        MultiCoverConfig config3;
        super.onCreate(bundle);
        setContentView(2131502801);
        Bundle bundleExtra = getIntent().getBundleExtra("param_control");
        if (bundleExtra != null) {
            this.f112746Q = bundleExtra.getInt("cover_from_where", 0);
            String string = bundleExtra.getString("key_main_cover_path");
            this.f112739J = string;
            this.f112740K = bundleExtra.getString("key_sub_cover_path", string);
            this.f112743N = bundleExtra.getLong("key_cover_pos", 0L);
            this.f112744O = bundleExtra.getLong("key_sub_cover_pos", 0L);
            String strA = z.a("step one data , mOriginalMainCoverPath =", this.f112739J, " , mOriginalSubCoverPath = ", this.f112740K);
            String str = this.f112731B;
            BLog.i(str, strA);
            if (TextUtils.isEmpty(this.f112739J)) {
                String string2 = bundleExtra.getString("input_cover_key");
                SharedPreferencesHelper sharedPreferencesHelper = JH0.a.f11357a;
                MultiCoverDraft multiCoverDraftE = JH0.a.e(string2);
                MultiCoverDraft multiCoverDraftE2 = JH0.a.e((multiCoverDraftE == null || (config3 = multiCoverDraftE.getConfig()) == null) ? null : config3.getSubCoverKey());
                this.f112739J = StringExtKt.orIfBlank(multiCoverDraftE != null ? multiCoverDraftE.getCoverPath() : null, this.f112739J);
                this.f112740K = StringExtKt.orIfBlank(multiCoverDraftE2 != null ? multiCoverDraftE2.getCoverPath() : null, this.f112740K);
                this.f112743N = (multiCoverDraftE == null || (config2 = multiCoverDraftE.getConfig()) == null) ? this.f112743N : config2.getCurrentSeekTime();
                this.f112744O = (multiCoverDraftE2 == null || (config = multiCoverDraftE2.getConfig()) == null) ? this.f112743N : config.getCurrentSeekTime();
                o.a("step two data , mOriginalMainCoverPath =", this.f112739J, " , mOriginalSubCoverPath = ", this.f112740K, str);
            }
            String strOrIfBlank = StringExtKt.orIfBlank(this.f112739J, bundleExtra.getString("input_image_path"));
            this.f112739J = strOrIfBlank;
            String strOrIfBlank2 = StringExtKt.orIfBlank(this.f112740K, strOrIfBlank);
            this.f112740K = strOrIfBlank2;
            o.a("step three data , mOriginalMainCoverPath =", this.f112739J, " , mOriginalSubCoverPath = ", strOrIfBlank2, str);
            this.f112741L = this.f112739J;
            this.f112742M = this.f112740K;
        }
        this.f112732C = (TextView) findViewById(2131321342);
        this.f112733D = (TextView) findViewById(2131319888);
        this.f112734E = (ImageView) findViewById(2131321319);
        this.f112735F = findViewById(2131321317);
        this.f112736G = findViewById(2131321318);
        this.f112737H = (TextView) findViewById(2131314472);
        TextView textView = (TextView) findViewById(2131315382);
        this.f112738I = textView;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvTip");
            textView2 = null;
        }
        textView2.setText(getString(2131858211));
        int color = ContextCompat.getColor(this, 2131104258);
        String string3 = getString(2131858208);
        String string4 = getString(2131858207);
        TextView textView3 = (TextView) findViewById(2131321875);
        SpannableString spannableString = new SpannableString(string3);
        int iA = StringsKt.A(string3, string4, 0, false, 6);
        if (iA >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(color), iA, string4.length() + iA, 33);
        }
        textView3.setText(spannableString);
        String string5 = getString(2131858210);
        String string6 = getString(2131858209);
        TextView textView4 = (TextView) findViewById(2131321876);
        SpannableString spannableString2 = new SpannableString(string5);
        int iA2 = StringsKt.A(string5, string6, 0, false, 6);
        if (iA2 >= 0) {
            spannableString2.setSpan(new ForegroundColorSpan(color), iA2, string6.length() + iA2, 33);
        }
        textView4.setText(spannableString2);
        boolean z6 = this.f112746Q == 1;
        String strM = z6 ? zw0.b.m("edit_qa_url", "https://www.bilibili.com/blackboard/era/PrY0YJ2aOsOZODSl.html") : zw0.b.m("publish_qa_url", "https://www.bilibili.com/blackboard/era/FYdzH0syeShX017i.html");
        if (strM.length() != 0) {
            int i7 = z6 ? 2131858367 : 2131858366;
            String string7 = getString(2131858211);
            String strA2 = B0.a.a(string7, " ", getString(i7));
            SpannableString spannableString3 = new SpannableString(strA2);
            spannableString3.setSpan(new n(strM, this, ContextCompat.getColor(this, R$color.Text_link)), string7.length() + 1, strA2.length(), 33);
            TextView textView5 = this.f112738I;
            TextView textView6 = textView5;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTip");
                textView6 = null;
            }
            textView6.setText(spannableString3);
            TextView textView7 = this.f112738I;
            TextView textView8 = textView7;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTip");
                textView8 = null;
            }
            textView8.setMovementMethod(LinkMovementMethod.getInstance());
            TextView textView9 = this.f112738I;
            TextView textView10 = textView9;
            if (textView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTip");
                textView10 = null;
            }
            textView10.setHighlightColor(0);
        }
        TextView textView11 = this.f112732C;
        TextView textView12 = textView11;
        if (textView11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvPreview");
            textView12 = null;
        }
        textView12.setOnClickListener(new com.bilibili.bplus.following.home.ui.z(this, 1));
        TextView textView13 = this.f112733D;
        TextView textView14 = textView13;
        if (textView13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvDone");
            textView14 = null;
        }
        textView14.setOnClickListener(new Z(this, 1));
        TextView textView15 = this.f112737H;
        if (textView15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvEdit");
            textView15 = null;
        }
        textView15.setOnClickListener(new com.bilibili.teenagersmode.ui.h(1, this));
        P6(this.f112739J, this.f112740K);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        Garb curGarb = GarbManager.getCurGarb();
        if (curGarb.isPure() || curGarb.isPrimaryOnly()) {
            StatusBarCompat.tintStatusBar(this, ThemeUtils.getThemeAttrColor(this, 2130968986));
        } else {
            StatusBarCompat.tintStatusBar(this, curGarb.getSecondaryPageColor(), curGarb.isDarkMode() ? 1 : 2);
        }
        ImageView imageView = this.f112734E;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imvTipsIcon");
            imageView2 = null;
        }
        imageView2.setColorFilter(ContextCompat.getColor(this, R$color.Ga7));
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        Neurons.reportExposure$default(false, "creation.new-publish.cover-set.0.show", new LinkedHashMap(), (List) null, 8, (Object) null);
    }
}
