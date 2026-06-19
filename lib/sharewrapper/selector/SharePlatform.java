package com.bilibili.lib.sharewrapper.selector;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import com.bilibili.lib.sharewrapper.SocializeMedia;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/selector/SharePlatform.class */
public final class SharePlatform implements Parcelable {
    public static final Parcelable.Creator<SharePlatform> CREATOR = new Object();
    public static final int REQ_LOGIN = 1002;

    @DrawableRes
    public int iconId;
    public String media;

    @StringRes
    public int titleId;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/selector/SharePlatform$a.class */
    public final class a implements Parcelable.Creator<SharePlatform> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.lib.sharewrapper.selector.SharePlatform, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final SharePlatform createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.titleId = parcel.readInt();
            obj.iconId = parcel.readInt();
            obj.media = parcel.readString();
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final SharePlatform[] newArray(int i7) {
            return new SharePlatform[i7];
        }
    }

    public SharePlatform(String str, @StringRes int i7, @DrawableRes int i8) {
        this.media = str;
        this.titleId = i7;
        this.iconId = i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (kotlin.text.StringsKt.n(r0, r5) == true) goto L24;
     */
    @kotlin.jvm.JvmStatic
    @com.bilibili.lib.ghost.api.Invocation(category = com.bilibili.lib.ghost.api.InvocationCategory.INVOKE_NONE_STATIC, name = "getPackageInfo", owner = {"android.content.pm.PackageManager"})
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.pm.PackageInfo a(@org.jetbrains.annotations.NotNull android.content.pm.PackageManager r4, @org.jetbrains.annotations.NotNull java.lang.String r5) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            com.bilibili.lib.blconfig.ConfigManager$Companion r0 = com.bilibili.lib.blconfig.ConfigManager.Companion     // Catch: java.lang.Exception -> L12
            com.bilibili.lib.blconfig.FeatureFlagContract r0 = r0.ab2()     // Catch: java.lang.Exception -> L12
            java.lang.String r1 = "ff.privacy.hook.agree.get_package_info"
            r2 = 1
            boolean r0 = r0.getWithDefault(r1, r2)     // Catch: java.lang.Exception -> L12
            r6 = r0
            goto L16
        L12:
            r8 = move-exception
            r0 = 1
            r6 = r0
        L16:
            com.bilibili.privacy.PrivacyHelper r0 = com.bilibili.privacy.PrivacyHelper.INSTANCE
            java.lang.String r1 = "pm_get_package_info"
            boolean r0 = r0.checkPrivacy$privacy_release(r1)
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L2a
            r0 = r6
            if (r0 != 0) goto L7e
        L2a:
            com.bilibili.lib.blconfig.ConfigManager$Companion r0 = com.bilibili.lib.blconfig.ConfigManager.Companion     // Catch: java.lang.Exception -> L90
            com.bilibili.lib.blconfig.Contract r0 = r0.config()     // Catch: java.lang.Exception -> L90
            java.lang.String r1 = "privacy.pkg_info_whitelist"
            r2 = 0
            java.lang.Object r0 = r0.get(r1, r2)     // Catch: java.lang.Exception -> L90
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L90
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L51
            r0 = r9
            r1 = r5
            boolean r0 = kotlin.text.StringsKt.n(r0, r1)     // Catch: java.lang.Exception -> L90
            r6 = r0
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L51
            goto L7e
        L51:
            r0 = r5
            boolean r0 = V0.f.c(r0)
            if (r0 == 0) goto L75
            r0 = r4
            r1 = 0
            android.content.pm.PackageInfo r0 = V0.e.a(r0, r1)
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L73
            android.content.pm.PackageInfo r0 = new android.content.pm.PackageInfo
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = 2233(0x8b9, float:3.129E-42)
            r0.versionCode = r1
        L73:
            r0 = r4
            return r0
        L75:
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
        L7e:
            r0 = r4
            r1 = r5
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)
            r5 = r0
            r0 = r8
            r4 = r0
            r0 = r5
            if (r0 == 0) goto L8e
            r0 = r5
            r4 = r0
        L8e:
            r0 = r4
            return r0
        L90:
            r9 = move-exception
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.sharewrapper.selector.SharePlatform.a(android.content.pm.PackageManager, java.lang.String):android.content.pm.PackageInfo");
    }

    public static List<SharePlatform> allPlatforms() {
        List<SharePlatform> listDefaultPlatforms = defaultPlatforms();
        listDefaultPlatforms.add(0, new SharePlatform(SocializeMedia.BILI_DYNAMIC, 2131822704, 2131232666));
        listDefaultPlatforms.add(1, new SharePlatform(SocializeMedia.BILI_IM, 2131822702, 2131232669));
        return listDefaultPlatforms;
    }

    public static JSONArray availableChannels(Context context) {
        JSONArray jSONArray = new JSONArray();
        if (isQQInstalled(context)) {
            jSONArray.put("QQ");
            jSONArray.put(SocializeMedia.QZONE);
        }
        if (isWxInstalled(context)) {
            jSONArray.put(SocializeMedia.WEIXIN);
            jSONArray.put(SocializeMedia.WEIXIN_MONMENT);
        }
        if (isSinaInstalled(context)) {
            jSONArray.put(SocializeMedia.SINA);
        }
        return jSONArray;
    }

    public static List<SharePlatform> availableSocialPlatforms(Context context) {
        ArrayList arrayList = new ArrayList();
        if (isWxInstalled(context)) {
            arrayList.add(defaultPlatform(SocializeMedia.WEIXIN));
            arrayList.add(defaultPlatform(SocializeMedia.WEIXIN_MONMENT));
        }
        if (isQQInstalled(context)) {
            arrayList.add(defaultPlatform("QQ"));
        }
        arrayList.add(defaultPlatform(SocializeMedia.SINA));
        if (isQQInstalled(context)) {
            arrayList.add(defaultPlatform(SocializeMedia.QZONE));
        }
        return arrayList;
    }

    public static boolean checkAppInstalled(@NonNull Context context, String str) {
        PackageManager packageManager;
        boolean z6 = false;
        if (TextUtils.isEmpty(str) || (packageManager = context.getPackageManager()) == null) {
            return false;
        }
        try {
            if (a(packageManager, str) != null) {
                z6 = true;
            }
        } catch (PackageManager.NameNotFoundException | NullPointerException e7) {
        }
        return z6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bilibili.lib.sharewrapper.selector.SharePlatform defaultPlatform(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.sharewrapper.selector.SharePlatform.defaultPlatform(java.lang.String):com.bilibili.lib.sharewrapper.selector.SharePlatform");
    }

    public static List<SharePlatform> defaultPlatforms() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(defaultPlatform(SocializeMedia.SINA));
        arrayList.add(defaultPlatform(SocializeMedia.WEIXIN));
        arrayList.add(defaultPlatform(SocializeMedia.WEIXIN_MONMENT));
        arrayList.add(defaultPlatform("QQ"));
        arrayList.add(defaultPlatform(SocializeMedia.QZONE));
        arrayList.add(defaultPlatform(SocializeMedia.COPY));
        arrayList.add(defaultPlatform(SocializeMedia.GENERIC));
        return arrayList;
    }

    public static boolean isFaceBookInstalled(Context context) {
        return checkAppInstalled(context, "com.facebook.katana");
    }

    public static boolean isHuaweiChanglianInstalled(Context context) {
        return checkAppInstalled(context, "com.huawei.meetime");
    }

    public static boolean isLineInstalled(Context context) {
        return checkAppInstalled(context, "jp.naver.line.android");
    }

    public static boolean isMessengerInstalled(Context context) {
        return checkAppInstalled(context, "com.facebook.orca");
    }

    public static boolean isQQInstalled(Context context) {
        return checkAppInstalled(context, "com.tencent.mobileqq") || checkAppInstalled(context, Constants.PACKAGE_QQ_SPEED);
    }

    public static boolean isSinaInstalled(Context context) {
        return checkAppInstalled(context, "com.sina.weibo");
    }

    public static boolean isTwitterInstalled(Context context) {
        return checkAppInstalled(context, "com.twitter.android");
    }

    public static boolean isWhatsAppInstalled(Context context) {
        return checkAppInstalled(context, "com.whatsapp");
    }

    public static boolean isWxInstalled(Context context) {
        return checkAppInstalled(context, "com.tencent.mm");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.titleId);
        parcel.writeInt(this.iconId);
        parcel.writeString(this.media);
    }
}
