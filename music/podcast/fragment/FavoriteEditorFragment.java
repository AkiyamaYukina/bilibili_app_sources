package com.bilibili.music.podcast.fragment;

import Da.e;
import FZ0.d;
import android.content.Intent;
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
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.FragmentActivity;
import com.bapis.bilibili.app.listener.v1.FavFolderCreateReq;
import com.bapis.bilibili.app.listener.v1.FavFolderCreateResp;
import com.bapis.bilibili.app.listener.v1.ListenerMoss;
import com.bilibili.animation.ShakeAnimator;
import com.bilibili.animation.YoYo;
import com.bilibili.api.BiliApiException;
import com.bilibili.droid.BundleUtil;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.bean.RoundingParams;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.ThumbnailUrlTransformStrategy;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.image2.view.IGenericProperties;
import com.bilibili.lib.image2.view.InnerInsulateImageView;
import com.bilibili.lib.image2.view.legacy.StaticImageView2;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.playset.api.PlaySetService;
import com.bilibili.playset.editor.InterfaceC5935b;
import com.bilibili.playset.editor.Q;
import com.bilibili.playset.y0;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.util.AppResUtil;
import v1.C8774a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/FavoriteEditorFragment.class */
public final class FavoriteEditorFragment extends BaseFragment implements InterfaceC5935b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f66560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f66561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f66562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f66563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f66564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f66565g;

    @Nullable
    public MenuItem h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ViewGroup f66568k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public StaticImageView2 f66569l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f66570m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ViewGroup f66571n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RelativeLayout f66572o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public StaticImageView2 f66573p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RelativeLayout f66574q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f66575r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public EditText f66576s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EditText f66577t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SwitchCompat f66578u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public TintProgressDialog f66579v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public TintProgressDialog f66580w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f66581x;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f66566i = LazyKt.lazy(new e(9));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f66567j = LazyKt.lazy(new d(9));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final a f66582y = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/FavoriteEditorFragment$a.class */
    public static final class a extends com.bilibili.music.podcast.moss.a<FavFolderCreateResp, FavFolderCreateResp> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FavoriteEditorFragment f66583b;

        public a(FavoriteEditorFragment favoriteEditorFragment) {
            this.f66583b = favoriteEditorFragment;
        }

        @Override // com.bilibili.music.podcast.moss.a
        public final FavFolderCreateResp d(FavFolderCreateResp favFolderCreateResp) {
            return favFolderCreateResp;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final boolean isCancel() {
            return this.f66583b.p3() == null;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(Object obj) {
            FavFolderCreateResp favFolderCreateResp = (FavFolderCreateResp) obj;
            FavoriteEditorFragment favoriteEditorFragment = this.f66583b;
            if (favoriteEditorFragment.p3() == null) {
                return;
            }
            TintProgressDialog tintProgressDialog = favoriteEditorFragment.f66579v;
            if (tintProgressDialog != null) {
                tintProgressDialog.dismiss();
            }
            ToastHelper.showToastShort(favoriteEditorFragment.p3(), 2131842633);
            Intent intent = null;
            if (favFolderCreateResp != null) {
                Intent intent2 = new Intent();
                intent2.putExtra("id", favFolderCreateResp.getFid());
                String str = favoriteEditorFragment.f66561c;
                String str2 = str;
                if (str == null) {
                    str2 = "";
                }
                intent2.putExtra("title", str2);
                String str3 = favoriteEditorFragment.f66562d;
                if (str3 == null) {
                    str3 = "";
                }
                intent2.putExtra("intro", str3);
                SwitchCompat switchCompat = favoriteEditorFragment.f66578u;
                if (switchCompat == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPublicSwitch");
                    switchCompat = null;
                }
                intent2.putExtra("private", !switchCompat.isChecked());
                intent = intent2;
            }
            favoriteEditorFragment.requireActivity().setResult(-1, intent);
            favoriteEditorFragment.requireActivity().finish();
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            FavoriteEditorFragment favoriteEditorFragment = this.f66583b;
            if (favoriteEditorFragment.p3() == null) {
                return;
            }
            TintProgressDialog tintProgressDialog = favoriteEditorFragment.f66579v;
            if (tintProgressDialog != null) {
                tintProgressDialog.dismiss();
            }
            favoriteEditorFragment.getClass();
            if (!(th instanceof BiliApiException)) {
                ToastHelper.showToastShort(favoriteEditorFragment.p3(), 2131841502);
                return;
            }
            BiliApiException biliApiException = (BiliApiException) th;
            int i7 = biliApiException.mCode;
            String message = biliApiException.getMessage();
            if (y0.a(i7)) {
                y0.b(favoriteEditorFragment.requireActivity(), i7, message);
                return;
            }
            if (!TextUtils.isEmpty(message)) {
                ToastHelper.showToastShort(favoriteEditorFragment.p3(), message);
                return;
            }
            ToastHelper.showToastShort(favoriteEditorFragment.p3(), "[error:" + i7 + "]");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/FavoriteEditorFragment$b.class */
    public static final class b implements Q.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FavoriteEditorFragment f66584a;

        public b(FavoriteEditorFragment favoriteEditorFragment) {
            this.f66584a = favoriteEditorFragment;
        }

        @Override // com.bilibili.playset.editor.Q.b
        public final void onFailure() {
            TintProgressDialog tintProgressDialog = this.f66584a.f66580w;
            if (tintProgressDialog != null) {
                tintProgressDialog.dismiss();
            }
        }

        @Override // com.bilibili.playset.editor.Q.b
        public final void onSuccess(String str) {
            FavoriteEditorFragment favoriteEditorFragment = this.f66584a;
            TintProgressDialog tintProgressDialog = favoriteEditorFragment.f66580w;
            if (tintProgressDialog != null) {
                tintProgressDialog.dismiss();
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            favoriteEditorFragment.f66563e = str;
            favoriteEditorFragment.f66564f = 0;
            InnerInsulateImageView innerInsulateImageView = favoriteEditorFragment.f66573p;
            InnerInsulateImageView innerInsulateImageView2 = innerInsulateImageView;
            if (innerInsulateImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCoverPreview");
                innerInsulateImageView2 = null;
            }
            innerInsulateImageView2.setVisibility(0);
            if (favoriteEditorFragment.f66564f == 12) {
                StaticImageView2 staticImageView2 = favoriteEditorFragment.f66573p;
                StaticImageView2 staticImageView22 = staticImageView2;
                if (staticImageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCoverPreview");
                    staticImageView22 = null;
                }
                staticImageView22.setThumbWidth(200.0f);
                StaticImageView2 staticImageView23 = favoriteEditorFragment.f66573p;
                StaticImageView2 staticImageView24 = staticImageView23;
                if (staticImageView23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCoverPreview");
                    staticImageView24 = null;
                }
                staticImageView24.setThumbHeight(200.0f);
                StaticImageView2 staticImageView25 = favoriteEditorFragment.f66573p;
                StaticImageView2 staticImageView26 = staticImageView25;
                if (staticImageView25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCoverPreview");
                    staticImageView26 = null;
                }
                staticImageView26.setThumbRatio(5);
                BiliImageView biliImageView = favoriteEditorFragment.f66573p;
                BiliImageView biliImageView2 = biliImageView;
                if (biliImageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCoverPreview");
                    biliImageView2 = null;
                }
                biliImageView2.getGenericProperties().setRoundingParams((RoundingParams) null);
                BiliImageView biliImageView3 = favoriteEditorFragment.f66573p;
                BiliImageView biliImageView4 = biliImageView3;
                if (biliImageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCoverPreview");
                    biliImageView4 = null;
                }
                biliImageView4.getGenericProperties().setActualImageScaleType(ScaleType.CENTER_INSIDE);
            } else {
                StaticImageView2 staticImageView27 = favoriteEditorFragment.f66573p;
                StaticImageView2 staticImageView28 = staticImageView27;
                if (staticImageView27 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCoverPreview");
                    staticImageView28 = null;
                }
                staticImageView28.setThumbWidth(320.0f);
                StaticImageView2 staticImageView29 = favoriteEditorFragment.f66573p;
                StaticImageView2 staticImageView210 = staticImageView29;
                if (staticImageView29 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCoverPreview");
                    staticImageView210 = null;
                }
                staticImageView210.setThumbHeight(200.0f);
                StaticImageView2 staticImageView211 = favoriteEditorFragment.f66573p;
                StaticImageView2 staticImageView212 = staticImageView211;
                if (staticImageView211 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCoverPreview");
                    staticImageView212 = null;
                }
                staticImageView212.setThumbRatio(3);
                ImageView imageView = favoriteEditorFragment.f66573p;
                ImageView imageView2 = imageView;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCoverPreview");
                    imageView2 = null;
                }
                imageView2.setBackgroundResource(2131239812);
                BiliImageView biliImageView5 = favoriteEditorFragment.f66573p;
                BiliImageView biliImageView6 = biliImageView5;
                if (biliImageView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCoverPreview");
                    biliImageView6 = null;
                }
                IGenericProperties genericProperties = biliImageView6.getGenericProperties();
                ScaleType scaleType = ScaleType.CENTER_CROP;
                genericProperties.setActualImageScaleType(scaleType);
                float fApplyDimension = TypedValue.applyDimension(1, 2.0f, favoriteEditorFragment.getResources().getDisplayMetrics());
                BiliImageView biliImageView7 = favoriteEditorFragment.f66573p;
                BiliImageView biliImageView8 = biliImageView7;
                if (biliImageView7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCoverPreview");
                    biliImageView8 = null;
                }
                biliImageView8.getGenericProperties().setRoundingParams(RoundingParams.Companion.fromCornersRadius(fApplyDimension));
                BiliImageView biliImageView9 = favoriteEditorFragment.f66573p;
                BiliImageView biliImageView10 = biliImageView9;
                if (biliImageView9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCoverPreview");
                    biliImageView10 = null;
                }
                biliImageView10.getGenericProperties().setActualImageScaleType(scaleType);
            }
            BiliImageView biliImageView11 = favoriteEditorFragment.f66573p;
            if (biliImageView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCoverPreview");
                biliImageView11 = null;
            }
            ImageExtentionKt.displayImage$default(biliImageView11, favoriteEditorFragment.f66563e, (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, (ScaleType) null, (BitmapTransformation) null, false, 1022, (Object) null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/FavoriteEditorFragment$c.class */
    public static final class c extends BiliApiDataCallback<Integer> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FavoriteEditorFragment f66585b;

        public c(FavoriteEditorFragment favoriteEditorFragment) {
            this.f66585b = favoriteEditorFragment;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final boolean isCancel() {
            return this.f66585b.activityDie();
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(Integer num) {
            if (num == null) {
                onError(null);
            }
            FavoriteEditorFragment favoriteEditorFragment = this.f66585b;
            favoriteEditorFragment.f66581x = true;
            favoriteEditorFragment.jf();
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            FavoriteEditorFragment favoriteEditorFragment = this.f66585b;
            favoriteEditorFragment.f66581x = true;
            ViewGroup viewGroup = favoriteEditorFragment.f66571n;
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentView");
                viewGroup2 = null;
            }
            viewGroup2.setVisibility(8);
            ViewGroup viewGroup3 = favoriteEditorFragment.f66568k;
            ViewGroup viewGroup4 = viewGroup3;
            if (viewGroup3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
                viewGroup4 = null;
            }
            viewGroup4.setVisibility(0);
            BiliImageView biliImageView = favoriteEditorFragment.f66569l;
            BiliImageView biliImageView2 = biliImageView;
            if (biliImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingImage");
                biliImageView2 = null;
            }
            biliImageView2.setImageResource(2131232151);
            TextView textView = favoriteEditorFragment.f66570m;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingText");
                textView = null;
            }
            textView.setText(2131841340);
        }
    }

    @Override // com.bilibili.playset.editor.InterfaceC5935b
    public final void P6(@Nullable Bitmap bitmap) {
        if (bitmap == null || p3() == null) {
            return;
        }
        this.f66580w = TintProgressDialog.show(getContext(), null, getString(2131842491), true, false);
        Q.a(bitmap, new b(this));
    }

    public final void jf() {
        ViewGroup viewGroup = this.f66571n;
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContentView");
            viewGroup2 = null;
        }
        viewGroup2.setVisibility(0);
        ViewGroup viewGroup3 = this.f66568k;
        ViewGroup viewGroup4 = viewGroup3;
        if (viewGroup3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
            viewGroup4 = null;
        }
        viewGroup4.setVisibility(8);
        MenuItem menuItem = this.h;
        if (menuItem != null) {
            menuItem.setVisible(true);
            if (p3() instanceof BaseToolbarActivity) {
                MultipleThemeUtils.refreshMenuTitleTint(requireActivity(), ((BaseToolbarActivity) p3()).getToolbar(), this.h, ((Garb) this.f66566i.getValue()).isPure() ? 0 : ((Garb) this.f66566i.getValue()).getFontColor());
            }
        }
        RelativeLayout relativeLayout = this.f66572o;
        RelativeLayout relativeLayout2 = relativeLayout;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoverLayout");
            relativeLayout2 = null;
        }
        relativeLayout2.setVisibility(8);
        int i7 = this.f66560b;
        if (i7 == 1) {
            RelativeLayout relativeLayout3 = this.f66574q;
            RelativeLayout relativeLayout4 = relativeLayout3;
            if (relativeLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIntroLayout");
                relativeLayout4 = null;
            }
            relativeLayout4.setVisibility(0);
            TextView textView = this.f66575r;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNameTextView");
                textView = null;
            }
            textView.setText(Html.fromHtml(getString(2131854862)));
            return;
        }
        if (i7 == 2) {
            RelativeLayout relativeLayout5 = this.f66574q;
            RelativeLayout relativeLayout6 = relativeLayout5;
            if (relativeLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIntroLayout");
                relativeLayout6 = null;
            }
            relativeLayout6.setVisibility(0);
            TextView textView2 = this.f66575r;
            TextView textView3 = textView2;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNameTextView");
                textView3 = null;
            }
            textView3.setText(Html.fromHtml(getString(2131854862)));
            EditText editText = this.f66576s;
            EditText editText2 = editText;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNameEditor");
                editText2 = null;
            }
            editText2.setText(this.f66561c);
            EditText editText3 = this.f66577t;
            EditText editText4 = editText3;
            if (editText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIntroEditor");
                editText4 = null;
            }
            editText4.setText(this.f66562d);
            SwitchCompat switchCompat = this.f66578u;
            if (switchCompat == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPublicSwitch");
                switchCompat = null;
            }
            switchCompat.setChecked(!this.f66565g);
            return;
        }
        TextView textView4 = this.f66575r;
        TextView textView5 = textView4;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNameTextView");
            textView5 = null;
        }
        textView5.setText(2131847666);
        EditText editText5 = this.f66576s;
        EditText editText6 = editText5;
        if (editText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNameEditor");
            editText6 = null;
        }
        editText6.setEnabled(false);
        if (TextUtils.isEmpty(this.f66561c)) {
            EditText editText7 = this.f66576s;
            EditText editText8 = editText7;
            if (editText7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNameEditor");
                editText8 = null;
            }
            editText8.setText(2131842609);
        } else {
            EditText editText9 = this.f66576s;
            EditText editText10 = editText9;
            if (editText9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNameEditor");
                editText10 = null;
            }
            editText10.setText(this.f66561c);
        }
        EditText editText11 = this.f66576s;
        EditText editText12 = editText11;
        if (editText11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNameEditor");
            editText12 = null;
        }
        editText12.setTextColor(getResources().getColor(R$color.Ga4_u));
        SwitchCompat switchCompat2 = this.f66578u;
        if (switchCompat2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPublicSwitch");
            switchCompat2 = null;
        }
        switchCompat2.setChecked(!this.f66565g);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        if (p3() == null) {
            return;
        }
        int i7 = this.f66560b;
        if (i7 == 1) {
            requireActivity().setTitle(2131842478);
        } else if (i7 != 2) {
            requireActivity().setTitle(2131842642);
        } else {
            requireActivity().setTitle(2131842642);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f66560b = BundleUtil.getInteger(arguments, "page_type", new Integer[]{0}).intValue();
            BundleUtil.getLong(arguments, "id", new long[0]);
            this.f66563e = arguments.getString("cover", "");
            this.f66564f = BundleUtil.getInteger(arguments, "cover_type", new Integer[]{0}).intValue();
            this.f66561c = arguments.getString("title");
            this.f66562d = arguments.getString("intro");
            this.f66565g = BundleUtil.getBoolean(arguments, "private", new boolean[]{false});
        }
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(@NotNull Menu menu, @NotNull MenuInflater menuInflater) {
        menuInflater.inflate(2131558433, menu);
        MenuItem menuItemFindItem = menu.findItem(2131307360);
        this.h = menuItemFindItem;
        int fontColor = 0;
        menuItemFindItem.setVisible(this.f66560b == 0 || this.f66581x);
        if (p3() instanceof BaseToolbarActivity) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Toolbar toolbar = ((BaseToolbarActivity) p3()).getToolbar();
            MenuItem menuItem = this.h;
            if (!((Garb) this.f66566i.getValue()).isPure()) {
                fontColor = ((Garb) this.f66566i.getValue()).getFontColor();
            }
            MultipleThemeUtils.refreshMenuTitleTint(fragmentActivityRequireActivity, toolbar, menuItem, fontColor);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131499699, viewGroup, false);
        this.f66568k = (ViewGroup) viewInflate.findViewById(2131303626);
        this.f66569l = viewInflate.findViewById(2131313340);
        this.f66570m = (TextView) viewInflate.findViewById(2131313361);
        this.f66571n = (ViewGroup) viewInflate.findViewById(2131298661);
        this.f66572o = (RelativeLayout) viewInflate.findViewById(2131299628);
        this.f66573p = viewInflate.findViewById(2131299643);
        this.f66575r = (TextView) viewInflate.findViewById(2131309145);
        this.f66576s = (EditText) viewInflate.findViewById(2131309146);
        this.f66574q = (RelativeLayout) viewInflate.findViewById(2131309140);
        this.f66577t = (EditText) viewInflate.findViewById(2131309139);
        this.f66578u = (SwitchCompat) viewInflate.findViewById(2131309152);
        FragmentActivity fragmentActivityP3 = p3();
        Drawable drawable = getResources().getDrawable(2131230826);
        Drawable drawableWrap = DrawableCompat.wrap(getResources().getDrawable(2131230825));
        Drawable drawableWrap2 = DrawableCompat.wrap(drawable);
        DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.MULTIPLY);
        DrawableCompat.setTintMode(drawableWrap2, PorterDuff.Mode.SRC_IN);
        DrawableCompat.setTintList(drawableWrap, ThemeUtils.getThemeColorStateList(fragmentActivityP3, getResources().getColorStateList(2131103614)));
        DrawableCompat.setTintList(drawableWrap2, ThemeUtils.getThemeColorStateList(fragmentActivityP3, getResources().getColorStateList(2131103615)));
        SwitchCompat switchCompat = this.f66578u;
        SwitchCompat switchCompat2 = switchCompat;
        if (switchCompat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPublicSwitch");
            switchCompat2 = null;
        }
        switchCompat2.setThumbDrawable(drawableWrap);
        SwitchCompat switchCompat3 = this.f66578u;
        SwitchCompat switchCompat4 = switchCompat3;
        if (switchCompat3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPublicSwitch");
            switchCompat4 = null;
        }
        switchCompat4.setTrackDrawable(drawableWrap2);
        SwitchCompat switchCompat5 = this.f66578u;
        if (switchCompat5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPublicSwitch");
            switchCompat5 = null;
        }
        switchCompat5.refreshDrawableState();
        return viewInflate;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        TintProgressDialog tintProgressDialog = this.f66579v;
        if (tintProgressDialog != null) {
            tintProgressDialog.dismiss();
        }
        TintProgressDialog tintProgressDialog2 = this.f66580w;
        if (tintProgressDialog2 != null) {
            tintProgressDialog2.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
        String string;
        String string2;
        if (menuItem.getItemId() == 2131307360) {
            EditText editText = this.f66576s;
            SwitchCompat switchCompat = null;
            EditText editText2 = editText;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNameEditor");
                editText2 = null;
            }
            if (editText2.getText() == null) {
                string = "";
            } else {
                EditText editText3 = this.f66576s;
                EditText editText4 = editText3;
                if (editText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mNameEditor");
                    editText4 = null;
                }
                string = editText4.getText().toString();
            }
            this.f66561c = string;
            if (TextUtils.isEmpty(string)) {
                YoYo.AnimationComposer animationComposerInterpolate = YoYo.with(new ShakeAnimator()).duration(500L).interpolate(new C8774a());
                EditText editText5 = this.f66576s;
                if (editText5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mNameEditor");
                    editText5 = null;
                }
                animationComposerInterpolate.playOn(editText5);
            } else {
                EditText editText6 = this.f66577t;
                EditText editText7 = editText6;
                if (editText6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mIntroEditor");
                    editText7 = null;
                }
                if (editText7.getText() == null) {
                    string2 = "";
                } else {
                    EditText editText8 = this.f66577t;
                    EditText editText9 = editText8;
                    if (editText8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mIntroEditor");
                        editText9 = null;
                    }
                    string2 = editText9.getText().toString();
                }
                this.f66562d = string2;
                InputMethodManagerHelper.tryHideSoftInput(p3());
                this.f66579v = TintProgressDialog.show(getContext(), null, getString(2131842566), true, false);
                int i7 = this.f66564f;
                if (i7 == 2 || i7 == 12) {
                    this.f66563e = null;
                }
                if (this.f66560b == 1) {
                    String str = this.f66561c;
                    String str2 = str;
                    if (str == null) {
                        str2 = "";
                    }
                    String str3 = this.f66562d;
                    String str4 = str3 != null ? str3 : "";
                    SwitchCompat switchCompat2 = this.f66578u;
                    if (switchCompat2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPublicSwitch");
                    } else {
                        switchCompat = switchCompat2;
                    }
                    boolean zIsChecked = switchCompat.isChecked();
                    a aVar = this.f66582y;
                    new ListenerMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).favFolderCreate(FavFolderCreateReq.newBuilder().setName(str2).setDesc(str4).setPublic(!zIsChecked ? 1 : 0).build(), new com.bilibili.music.podcast.moss.d(aVar, aVar));
                }
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f66560b == 0 || this.f66581x) {
            jf();
            return;
        }
        ViewGroup viewGroup = this.f66571n;
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContentView");
            viewGroup2 = null;
        }
        viewGroup2.setVisibility(8);
        ViewGroup viewGroup3 = this.f66568k;
        ViewGroup viewGroup4 = viewGroup3;
        if (viewGroup3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
            viewGroup4 = null;
        }
        viewGroup4.setVisibility(0);
        BiliImageView biliImageView = this.f66569l;
        if (biliImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingImage");
            biliImageView = null;
        }
        ImageExtentionKt.displayImage$default(biliImageView, AppResUtil.getImageUrl("img_holder_loading_style1.webp"), (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, (ScaleType) null, (BitmapTransformation) null, false, 1022, (Object) null);
        TextView textView = this.f66570m;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingText");
            textView = null;
        }
        textView.setText(2131841549);
        ((PlaySetService) this.f66567j.getValue()).isInWhiteList(BiliAccounts.get(getContext()).getAccessKey()).enqueue(new c(this));
    }
}
