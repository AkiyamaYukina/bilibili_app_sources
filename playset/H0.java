package com.bilibili.playset;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.comm.list.common.utils.share.ListShareHelper;
import com.bilibili.app.comm.supermenu.share.pic.IPosterShareListener;
import com.bilibili.app.comm.supermenu.share.pic.PosterShareParam;
import com.bilibili.app.comm.supermenu.share.pic.PosterShareTask;
import com.bilibili.app.comm.supermenu.share.v2.SharePanelWrapper;
import com.bilibili.lib.sharewrapper.online.ShareOnlineParams;
import com.bilibili.lib.tf.TfCode;
import com.bilibili.playset.api.MultitypeMedia;
import com.bilibili.playset.collection.enums.CollectionTypeEnum;
import java.util.ArrayList;
import kntr.common.share.domain.model.b;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.compose.resources.DrawableResource;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/H0.class */
@StabilityInferred(parameters = 1)
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f83870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f83871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f83872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f83873d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/H0$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f83874a;

        static {
            int[] iArr = new int[CollectionTypeEnum.values().length];
            try {
                iArr[CollectionTypeEnum.UGC.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[CollectionTypeEnum.OGV.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[CollectionTypeEnum.OGV_V2.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f83874a = iArr;
        }
    }

    public H0(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.f83870a = str;
        this.f83871b = str2;
        this.f83872c = str3;
        this.f83873d = str4;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.bilibili.app.comm.supermenu.share.pic.IPosterShareListener, java.lang.Object] */
    public static final void a(FragmentActivity fragmentActivity, H0 h02, MultitypeMedia multitypeMedia) {
        h02.getClass();
        long avId = multitypeMedia.getAvId();
        String str = multitypeMedia.bvid;
        long shareSid = multitypeMedia.getShareSid();
        PosterShareTask.Companion.with(fragmentActivity).posterParams(new PosterShareParam(h02.f83870a, h02.f83871b, String.valueOf(avId), String.valueOf(shareSid), str, h02.f83873d, "", multitypeMedia.title, multitypeMedia.getAuthor(), 0, (String) null, (String) null, (String) null, 7680, (DefaultConstructorMarker) null)).shareCallback((IPosterShareListener) new Object()).show();
    }

    public static ImageBitmap c(FragmentActivity fragmentActivity, int i7) {
        ImageBitmap imageBitmapAsImageBitmap;
        try {
            Drawable drawable = ContextCompat.getDrawable(fragmentActivity, i7);
            if (drawable == null) {
                return null;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            imageBitmapAsImageBitmap = AndroidImageBitmap_androidKt.asImageBitmap(bitmapCreateBitmap);
        } catch (Exception e7) {
            imageBitmapAsImageBitmap = null;
        }
        return imageBitmapAsImageBitmap;
    }

    public static int e(MultitypeMedia multitypeMedia) {
        int i7 = a.f83874a[multitypeMedia.getCardType().ordinal()];
        return (i7 == 1 || i7 == 2) ? 0 : i7 != 3 ? -1 : 4;
    }

    public static boolean f(MultitypeMedia multitypeMedia) {
        return multitypeMedia.getCardType() == CollectionTypeEnum.OGV || multitypeMedia.getCardType() == CollectionTypeEnum.OGV_V2;
    }

    public final kntr.common.share.domain.model.e b(FragmentActivity fragmentActivity, MultitypeMedia multitypeMedia) {
        ListShareHelper listShareHelper = ListShareHelper.INSTANCE;
        int iE = e(multitypeMedia);
        int i7 = multitypeMedia.totalPage;
        long shareSid = multitypeMedia.getShareSid();
        boolean zF = f(multitypeMedia);
        MultitypeMedia.OGV ogv = multitypeMedia.ogv;
        return ListShareHelper.getKShareContent$default(listShareHelper, fragmentActivity, multitypeMedia, this.f83872c, iE, (String) null, Integer.valueOf(i7), Long.valueOf(shareSid), true, false, zF, ogv != null ? ogv.seasonType : 0, false, (String) null, (String) null, 14608, (Object) null);
    }

    public final ShareOnlineParams d(MultitypeMedia multitypeMedia) {
        ListShareHelper listShareHelper = ListShareHelper.INSTANCE;
        long avId = multitypeMedia.getAvId();
        long shareSid = multitypeMedia.getShareSid();
        return ListShareHelper.getShareOnlineParams$default(listShareHelper, this.f83870a, this.f83871b, String.valueOf(avId), String.valueOf(shareSid), false, true, (Integer) null, (Integer) null, e(multitypeMedia), this.f83872c, this.f83873d, f(multitypeMedia), false, (String) null, 12496, (Object) null);
    }

    public final void g(@NotNull FragmentActivity fragmentActivity, @NotNull MultitypeMedia multitypeMedia, @NotNull Function1<? super String, Boolean> function1) {
        if (((Boolean) com.bilibili.playset.utils.b.f85652b.getValue()).booleanValue()) {
            i(fragmentActivity, multitypeMedia, CollectionsKt.listOf(new b.a("delete_favorite", fragmentActivity.getString(2131842571), c(fragmentActivity, 2131238503), (String) null, (DrawableResource) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, TfCode.UNICOM_CDN_RTMP_URL_EMPTY_VALUE)), function1);
        } else {
            SharePanelWrapper.Companion.with(fragmentActivity).shareOnlineParams(d(multitypeMedia)).shareCallback(com.bilibili.app.comm.list.widget.utils.s.e(new J0(fragmentActivity), fragmentActivity)).shareContentProvider(new K0(fragmentActivity, this, multitypeMedia)).reportExtra(MapsKt.hashMapOf(new Pair[]{TuplesKt.to("spm_id", "main.my-favorite.option-more.0")})).menuItemHandler(com.bilibili.app.comm.list.widget.utils.s.d(new L0(function1, multitypeMedia, this, fragmentActivity), fragmentActivity)).show();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r16, @org.jetbrains.annotations.NotNull com.bilibili.playset.api.MultitypeMedia r17, @org.jetbrains.annotations.NotNull java.util.List<com.bilibili.app.comm.supermenu.core.MenuItemImpl> r18, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> r19) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.H0.h(androidx.fragment.app.FragmentActivity, com.bilibili.playset.api.MultitypeMedia, java.util.List, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(final androidx.fragment.app.FragmentActivity r12, final com.bilibili.playset.api.MultitypeMedia r13, java.util.List<kntr.common.share.domain.model.b.a> r14, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.H0.i(androidx.fragment.app.FragmentActivity, com.bilibili.playset.api.MultitypeMedia, java.util.List, kotlin.jvm.functions.Function1):void");
    }
}
