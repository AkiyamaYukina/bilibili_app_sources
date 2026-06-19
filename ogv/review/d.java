package com.bilibili.ogv.review;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.lib.sharewrapper.ShareHelper;
import com.bilibili.lib.sharewrapper.ShareResult;
import com.bilibili.lib.sharewrapper.SocializeMedia;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.ogv.pub.review.bean.ReviewMediaBase;
import com.bilibili.ogv.review.data.ReviewLongDetail;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/d.class */
@StabilityInferred(parameters = 0)
public final class d extends ShareHelper.SimpleCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f72212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final ReviewLongDetail f72213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f72214c;

    public d(@NotNull Context context, @Nullable ReviewLongDetail reviewLongDetail, @Nullable String str) {
        this.f72212a = context;
        this.f72213b = reviewLongDetail;
        this.f72214c = str;
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper.Callback
    @Nullable
    public final Bundle getShareContent(@NotNull String str) {
        String str2;
        File diskCacheFile$default;
        ReviewMediaBase reviewMediaBase;
        ReviewLongDetail reviewLongDetail = this.f72213b;
        if (!(((reviewLongDetail != null ? reviewLongDetail.f72217c : null) == null || reviewLongDetail.f72219e == null || reviewLongDetail.f72218d == null) ? false : true)) {
            return null;
        }
        String str3 = (reviewLongDetail != null ? reviewLongDetail.f72217c : null) == null ? "" : reviewLongDetail.f72217c.f71699b;
        String str4 = (reviewLongDetail != null ? reviewLongDetail.f72219e : null) == null ? "" : reviewLongDetail.f72219e.f71704b;
        int i7 = (reviewLongDetail != null ? reviewLongDetail.f72218d : null) == null ? 0 : reviewLongDetail.f72218d.f71756a / 2;
        String str5 = (reviewLongDetail == null || (reviewMediaBase = reviewLongDetail.f72219e) == null) ? null : reviewMediaBase.f71705c;
        String string = this.f72212a.getString(2131857169, str3, str4, String.valueOf(i7));
        int iHashCode = str.hashCode();
        String str6 = this.f72214c;
        if (iHashCode == 2074485) {
            str2 = !str.equals(SocializeMedia.COPY) ? string : str6 == null ? "" : str6;
        } else if (iHashCode != 2545289) {
            str2 = (iHashCode == 1120828781 && str.equals(SocializeMedia.WEIXIN_MONMENT)) ? " " : string;
        } else if (str.equals(SocializeMedia.SINA)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str2 = String.format("%s\n#bilibili# ", Arrays.copyOf(new Object[]{string}, 1));
            str5 = null;
        } else {
            str2 = string;
        }
        if (str5 == null || str5.length() == 0) {
            diskCacheFile$default = null;
        } else {
            try {
                diskCacheFile$default = BiliImageLoaderHelper.getDiskCacheFile$default(str5, false, 2, (Object) null);
            } catch (Exception e7) {
                diskCacheFile$default = null;
            }
        }
        ThirdPartyExtraBuilder thirdPartyExtraBuilderImageUrl = new ThirdPartyExtraBuilder().title(reviewLongDetail != null ? reviewLongDetail.f72216b : null).content(str2).targetUrl(str6).imageUrl(str5);
        String absolutePath = null;
        if (diskCacheFile$default != null) {
            absolutePath = !diskCacheFile$default.exists() ? null : diskCacheFile$default.getAbsolutePath();
        }
        return thirdPartyExtraBuilderImageUrl.imagePath(absolutePath).shareType(ThirdPartyExtraBuilder.PARAMS_TYPE_WEB).build();
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper.SimpleCallback, com.bilibili.lib.sharewrapper.ShareHelper.Callback
    public final void onShareFail(@Nullable String str, @Nullable ShareResult shareResult) {
        super.onShareFail(str, shareResult);
        ToastHelper.showToastLong(this.f72212a, 2131857121);
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper.SimpleCallback, com.bilibili.lib.sharewrapper.ShareHelper.Callback
    public final void onShareSuccess(@Nullable String str, @Nullable ShareResult shareResult) {
        super.onShareSuccess(str, shareResult);
        ToastHelper.showToastLong(this.f72212a, 2131857149);
    }
}
