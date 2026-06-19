package com.bilibili.playset.editor;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.animation.ShakeAnimator;
import com.bilibili.animation.YoYo;
import com.bilibili.api.BiliApiException;
import com.bilibili.droid.BundleUtil;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.image2.bean.RoundingParams;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.view.IGenericProperties;
import com.bilibili.lib.image2.view.legacy.StaticImageView2;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playset.api.PlaySet;
import com.bilibili.playset.api.PlaySetService;
import com.bilibili.playset.editor.Q;
import com.bilibili.playset.y0;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import kotlin.jvm.functions.Function1;
import tv.danmaku.android.util.AppResUtil;
import v1.C8774a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetEditorFragment.class */
public class PlaySetEditorFragment extends BaseFragment implements InterfaceC5935b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final b f84758A = new b(this);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final c f84759B = new c(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f84761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f84762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f84763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f84764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f84765g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ViewGroup f84766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public StaticImageView2 f84767j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f84768k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ViewGroup f84769l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RelativeLayout f84770m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public StaticImageView2 f84771n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RelativeLayout f84772o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f84773p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public EditText f84774q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public EditText f84775r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TintProgressDialog f84776s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TintProgressDialog f84777t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SwitchCompat f84778u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f84779v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f84780w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public MenuItem f84781x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public PlaySetService f84782y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Garb f84783z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetEditorFragment$a.class */
    public final class a extends BiliApiDataCallback<Integer> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PlaySetEditorFragment f84784b;

        public a(PlaySetEditorFragment playSetEditorFragment) {
            this.f84784b = playSetEditorFragment;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final boolean isCancel() {
            return this.f84784b.activityDie();
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(@Nullable Integer num) {
            Integer num2 = num;
            if (num2 == null) {
                onError(null);
                return;
            }
            PlaySetEditorFragment playSetEditorFragment = this.f84784b;
            boolean z6 = true;
            playSetEditorFragment.f84779v = true;
            if (num2.intValue() == 0) {
                z6 = false;
            }
            playSetEditorFragment.f84780w = z6;
            playSetEditorFragment.lf();
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            PlaySetEditorFragment playSetEditorFragment = this.f84784b;
            playSetEditorFragment.f84779v = true;
            playSetEditorFragment.f84769l.setVisibility(8);
            playSetEditorFragment.f84766i.setVisibility(0);
            playSetEditorFragment.f84767j.setImageResource(2131232151);
            playSetEditorFragment.f84768k.setText(2131841340);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetEditorFragment$b.class */
    public final class b extends BiliApiDataCallback<PlaySet> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PlaySetEditorFragment f84785b;

        public b(PlaySetEditorFragment playSetEditorFragment) {
            this.f84785b = playSetEditorFragment;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final boolean isCancel() {
            return this.f84785b.p3() == null;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(@Nullable PlaySet playSet) {
            Intent intent;
            PlaySet playSet2 = playSet;
            PlaySetEditorFragment playSetEditorFragment = this.f84785b;
            if (playSetEditorFragment.p3() == null) {
                return;
            }
            playSetEditorFragment.f84776s.dismiss();
            ToastHelper.showToastShort(playSetEditorFragment.p3(), 2131842633);
            if (playSet2 != null) {
                intent = new Intent();
                intent.putExtra("id", playSet2.id);
                intent.putExtra("title", playSet2.title);
                intent.putExtra("intro", playSet2.intro);
                intent.putExtra("private", !playSet2.isPublic());
            } else {
                intent = null;
            }
            playSetEditorFragment.p3().setResult(-1, intent);
            playSetEditorFragment.p3().finish();
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            PlaySetEditorFragment playSetEditorFragment = this.f84785b;
            if (playSetEditorFragment.p3() == null) {
                return;
            }
            playSetEditorFragment.f84776s.dismiss();
            PlaySetEditorFragment.jf(playSetEditorFragment, th);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetEditorFragment$c.class */
    public final class c extends BiliApiDataCallback<PlaySet> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PlaySetEditorFragment f84786b;

        public c(PlaySetEditorFragment playSetEditorFragment) {
            this.f84786b = playSetEditorFragment;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final boolean isCancel() {
            return this.f84786b.p3() == null;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(@Nullable PlaySet playSet) {
            PlaySet playSet2 = playSet;
            PlaySetEditorFragment playSetEditorFragment = this.f84786b;
            if (playSetEditorFragment.p3() == null) {
                return;
            }
            playSetEditorFragment.f84776s.dismiss();
            ToastHelper.showToastShort(playSetEditorFragment.p3(), 2131842517);
            Intent intent = new Intent();
            if (playSet2 != null) {
                intent.putExtra("id", playSet2.id);
                intent.putExtra("title", playSet2.title);
                intent.putExtra("intro", playSet2.intro);
                intent.putExtra("private", !playSet2.isPublic());
            }
            playSetEditorFragment.p3().setResult(-1, intent);
            playSetEditorFragment.p3().finish();
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            PlaySetEditorFragment playSetEditorFragment = this.f84786b;
            if (playSetEditorFragment.p3() == null) {
                return;
            }
            playSetEditorFragment.f84776s.dismiss();
            PlaySetEditorFragment.jf(playSetEditorFragment, th);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetEditorFragment$d.class */
    public final class d implements Q.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlaySetEditorFragment f84787a;

        public d(PlaySetEditorFragment playSetEditorFragment) {
            this.f84787a = playSetEditorFragment;
        }

        @Override // com.bilibili.playset.editor.Q.b
        public final void onFailure() {
            this.f84787a.f84777t.dismiss();
        }

        @Override // com.bilibili.playset.editor.Q.b
        public final void onSuccess(String str) {
            PlaySetEditorFragment playSetEditorFragment = this.f84787a;
            playSetEditorFragment.f84777t.dismiss();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            playSetEditorFragment.f84764f = str;
            playSetEditorFragment.f84765g = 0;
            playSetEditorFragment.f84771n.setVisibility(0);
            playSetEditorFragment.kf();
        }
    }

    public static void jf(PlaySetEditorFragment playSetEditorFragment, Throwable th) {
        playSetEditorFragment.getClass();
        if (!(th instanceof BiliApiException)) {
            ToastHelper.showToastShort(playSetEditorFragment.p3(), 2131841502);
            return;
        }
        int i7 = ((BiliApiException) th).mCode;
        String message = th.getMessage();
        if (y0.a(i7)) {
            y0.b(playSetEditorFragment.p3(), i7, message);
            return;
        }
        if (!TextUtils.isEmpty(message)) {
            ToastHelper.showToastShort(playSetEditorFragment.p3(), message);
            return;
        }
        ToastHelper.showToastShort(playSetEditorFragment.p3(), "[error:" + i7 + "]");
    }

    @Override // com.bilibili.playset.editor.InterfaceC5935b
    public final void P6(Bitmap bitmap) {
        if (bitmap == null || p3() == null) {
            return;
        }
        this.f84777t = TintProgressDialog.show(getContext(), null, getString(2131842491), true, false);
        Q.a(bitmap, new d(this));
    }

    public final void kf() {
        if (this.f84765g == 12) {
            this.f84771n.setThumbWidth(200.0f);
            this.f84771n.setThumbHeight(200.0f);
            this.f84771n.setThumbRatio(5);
            this.f84771n.getGenericProperties().setRoundingParams((RoundingParams) null);
            this.f84771n.getGenericProperties().setActualImageScaleType(ScaleType.CENTER_INSIDE);
        } else {
            this.f84771n.setThumbWidth(320.0f);
            this.f84771n.setThumbHeight(200.0f);
            this.f84771n.setThumbRatio(3);
            this.f84771n.setBackgroundResource(2131239812);
            IGenericProperties genericProperties = this.f84771n.getGenericProperties();
            ScaleType scaleType = ScaleType.CENTER_CROP;
            genericProperties.setActualImageScaleType(scaleType);
            this.f84771n.getGenericProperties().setRoundingParams(RoundingParams.fromCornersRadius(TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics())));
            this.f84771n.getGenericProperties().setActualImageScaleType(scaleType);
        }
        ImageExtentionKt.displayImage(this.f84771n, this.f84764f);
    }

    public final void lf() {
        this.f84769l.setVisibility(0);
        this.f84766i.setVisibility(8);
        MenuItem menuItem = this.f84781x;
        if (menuItem != null) {
            menuItem.setVisible(true);
            if (p3() instanceof BaseToolbarActivity) {
                MultipleThemeUtils.refreshMenuTitleTint(p3(), ((BaseToolbarActivity) p3()).getToolbar(), this.f84781x, this.f84783z.isPure() ? 0 : this.f84783z.getFontColor());
            }
        }
        if (this.f84780w) {
            this.f84770m.setVisibility(0);
            this.f84770m.setOnClickListener(new PT0.i(this, 3));
            if (TextUtils.isEmpty(this.f84764f)) {
                this.f84771n.setVisibility(8);
            } else {
                kf();
            }
        } else {
            this.f84770m.setVisibility(8);
        }
        int i7 = this.f84760b;
        if (i7 == 1) {
            this.f84772o.setVisibility(0);
            this.f84773p.setText(Html.fromHtml(getString(2131854862)));
            return;
        }
        if (i7 == 2) {
            this.f84772o.setVisibility(0);
            this.f84773p.setText(Html.fromHtml(getString(2131854862)));
            this.f84774q.setText(this.f84762d);
            this.f84775r.setText(this.f84763e);
            this.f84778u.setChecked(!this.h);
            return;
        }
        this.f84773p.setText(2131847666);
        this.f84774q.setEnabled(false);
        if (TextUtils.isEmpty(this.f84762d)) {
            this.f84774q.setText(2131842609);
        } else {
            this.f84774q.setText(this.f84762d);
        }
        this.f84774q.setTextColor(getResources().getColor(R$color.Ga4_u));
        this.f84778u.setChecked(!this.h);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (p3() == null) {
            return;
        }
        if (this.f84760b != 1) {
            p3().setTitle(2131842642);
        } else {
            p3().setTitle(2131842478);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f84760b = BundleUtil.getInteger(arguments, "page_type", new Integer[]{0}).intValue();
            this.f84761c = BundleUtil.getLong(arguments, "id", new long[0]);
            this.f84764f = arguments.getString("cover", "");
            this.f84765g = BundleUtil.getInteger(arguments, "cover_type", new Integer[]{0}).intValue();
            this.f84762d = arguments.getString("title");
            this.f84763e = arguments.getString("intro");
            this.h = BundleUtil.getBoolean(arguments, "private", new boolean[]{false});
        }
        setHasOptionsMenu(true);
        this.f84783z = GarbManager.getCurGarb();
        this.f84782y = (PlaySetService) ServiceGenerator.createService(PlaySetService.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(2131558433, menu);
        MenuItem menuItemFindItem = menu.findItem(2131307360);
        this.f84781x = menuItemFindItem;
        int fontColor = 0;
        menuItemFindItem.setVisible(this.f84760b == 0 || this.f84779v);
        if (p3() instanceof BaseToolbarActivity) {
            FragmentActivity fragmentActivityP3 = p3();
            Toolbar toolbar = ((BaseToolbarActivity) p3()).getToolbar();
            MenuItem menuItem = this.f84781x;
            if (!this.f84783z.isPure()) {
                fontColor = this.f84783z.getFontColor();
            }
            MultipleThemeUtils.refreshMenuTitleTint(fragmentActivityP3, toolbar, menuItem, fontColor);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131499699, viewGroup, false);
        this.f84766i = (ViewGroup) viewInflate.findViewById(2131303626);
        this.f84767j = viewInflate.findViewById(2131313340);
        this.f84768k = (TextView) viewInflate.findViewById(2131313361);
        this.f84769l = (ViewGroup) viewInflate.findViewById(2131298661);
        this.f84770m = (RelativeLayout) viewInflate.findViewById(2131299628);
        this.f84771n = viewInflate.findViewById(2131299643);
        this.f84773p = (TextView) viewInflate.findViewById(2131309145);
        this.f84774q = (EditText) viewInflate.findViewById(2131309146);
        this.f84772o = (RelativeLayout) viewInflate.findViewById(2131309140);
        this.f84775r = (EditText) viewInflate.findViewById(2131309139);
        this.f84778u = (SwitchCompat) viewInflate.findViewById(2131309152);
        FragmentActivity fragmentActivityP3 = p3();
        Drawable drawable = getResources().getDrawable(2131230826);
        Drawable drawableWrap = DrawableCompat.wrap(getResources().getDrawable(2131230825));
        Drawable drawableWrap2 = DrawableCompat.wrap(drawable);
        DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.MULTIPLY);
        DrawableCompat.setTintMode(drawableWrap2, PorterDuff.Mode.SRC_IN);
        DrawableCompat.setTintList(drawableWrap, ThemeUtils.getThemeColorStateList(fragmentActivityP3, getResources().getColorStateList(2131103614)));
        DrawableCompat.setTintList(drawableWrap2, ThemeUtils.getThemeColorStateList(fragmentActivityP3, getResources().getColorStateList(2131103615)));
        this.f84778u.setThumbDrawable(drawableWrap);
        this.f84778u.setTrackDrawable(drawableWrap2);
        this.f84778u.refreshDrawableState();
        return viewInflate;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        TintProgressDialog tintProgressDialog = this.f84776s;
        if (tintProgressDialog != null) {
            tintProgressDialog.dismiss();
        }
        TintProgressDialog tintProgressDialog2 = this.f84777t;
        if (tintProgressDialog2 != null) {
            tintProgressDialog2.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131307360) {
            String string = this.f84774q.getText() == null ? "" : this.f84774q.getText().toString();
            this.f84762d = string;
            if (TextUtils.isEmpty(string)) {
                YoYo.with(new ShakeAnimator()).duration(500L).interpolate(new C8774a()).playOn(this.f84774q);
            } else {
                this.f84763e = this.f84775r.getText() == null ? "" : this.f84775r.getText().toString();
                InputMethodManagerHelper.tryHideSoftInput(p3());
                Context context = getContext();
                if (context != null) {
                    this.f84776s = TintProgressDialog.show(context, null, getString(2131842566), true, false);
                    final String accessKey = BiliAccounts.get(context).getAccessKey();
                    int i7 = this.f84765g;
                    if (i7 == 2 || i7 == 12) {
                        this.f84764f = null;
                    }
                    if (this.f84760b != 1) {
                        final int i8 = 0;
                        com.bilibili.playset.api.t.a(new Function1(i8, this, accessKey) { // from class: com.bilibili.playset.editor.f

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final int f84810a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final Object f84811b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final Object f84812c;

                            {
                                this.f84810a = i8;
                                this.f84811b = this;
                                this.f84812c = accessKey;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final java.lang.Object invoke(java.lang.Object r11) {
                                /*
                                    Method dump skipped, instruction units count: 261
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.C5939f.invoke(java.lang.Object):java.lang.Object");
                            }
                        }, "edit_collection", this.f84759B);
                    } else {
                        com.bilibili.playset.api.t.a(new C5938e(0, this, accessKey), "create_collection", this.f84758A);
                    }
                }
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        if (this.f84760b == 0 || this.f84779v) {
            lf();
            return;
        }
        this.f84769l.setVisibility(8);
        this.f84766i.setVisibility(0);
        ImageExtentionKt.displayImage(this.f84767j, AppResUtil.getImageUrl("img_holder_loading_style1.webp"));
        this.f84768k.setText(2131841549);
        this.f84782y.isInWhiteList(BiliAccounts.get(getContext()).getAccessKey()).enqueue(new a(this));
    }
}
