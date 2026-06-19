package com.bilibili.socialize.share.core;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bilibili.lib.ui.PermissionsChecker;
import com.tencent.connect.common.Constants;
import java.io.File;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/BiliShareConfiguration.class */
public class BiliShareConfiguration implements Parcelable {
    public static final Parcelable.Creator<BiliShareConfiguration> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f104968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f104969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f104971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f104972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public SharePlatformConfig f104973f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/BiliShareConfiguration$a.class */
    public final class a implements Parcelable.Creator<BiliShareConfiguration> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.socialize.share.core.BiliShareConfiguration, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final BiliShareConfiguration createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f104970c = 0;
            obj.f104971d = false;
            obj.f104972e = true;
            try {
                obj.f104968a = parcel.readString();
                obj.f104969b = parcel.readInt();
                obj.f104970c = parcel.readInt();
                obj.f104971d = parcel.readByte() != 0;
                boolean z6 = false;
                if (parcel.readByte() != 0) {
                    z6 = true;
                }
                obj.f104972e = z6;
                obj.f104973f = (SharePlatformConfig) parcel.readParcelable(SharePlatformConfig.class.getClassLoader());
            } catch (Exception e7) {
                Pv0.b.a("BiliShareConfiguration", "BiliShareConfiguration read error");
            }
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final BiliShareConfiguration[] newArray(int i7) {
            return new BiliShareConfiguration[i7];
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/BiliShareConfiguration$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f104974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f104975b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f104976c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f104977d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f104978e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SharePlatformConfig f104979f = new SharePlatformConfig();

        public b(Context context) {
            context.getApplicationContext();
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.bilibili.socialize.share.core.BiliShareConfiguration, java.lang.Object] */
        public final BiliShareConfiguration a() {
            if (!TextUtils.isEmpty(this.f104974a)) {
                File file = new File(this.f104974a);
                if (file.isDirectory() && !file.exists()) {
                    file.mkdirs();
                }
            }
            if (this.f104975b == -1) {
                this.f104975b = 2131234122;
            }
            ?? obj = new Object();
            obj.f104968a = this.f104974a;
            obj.f104969b = this.f104975b;
            obj.f104973f = this.f104979f;
            obj.f104970c = this.f104976c;
            obj.f104971d = this.f104977d;
            obj.f104972e = this.f104978e;
            return obj;
        }

        public final void b(String str) {
            this.f104979f.a(SocializeMedia.QQ, "app_id", str);
        }

        public final void c(String str, @Nullable String str2, @Nullable String str3) {
            String str4 = str2;
            if (TextUtils.isEmpty(str2)) {
                str4 = "https://api.weibo.com/oauth2/default.html";
            }
            String str5 = str3;
            if (TextUtils.isEmpty(str3)) {
                str5 = "email,direct_messages_read,direct_messages_write,friendships_groups_read,friendships_groups_write,statuses_to_me_read,follow_app_official_microblog,invitation_write";
            }
            this.f104979f.a(SocializeMedia.SINA, "app_key", str, "redirect_url", str4, Constants.PARAM_SCOPE, str5);
        }

        public final void d(String str) {
            this.f104979f.a(SocializeMedia.WEIXIN, "app_id", str);
        }
    }

    public final String a(Context context) {
        if (!PermissionsChecker.checkSelfPermissions(context, PermissionsChecker.STORAGE_PERMISSIONS)) {
            return context.getApplicationContext().getExternalFilesDir(null).getAbsolutePath();
        }
        if (TextUtils.isEmpty(this.f104968a)) {
            this.f104968a = context.getApplicationContext().getExternalFilesDir(null).getAbsolutePath();
        }
        return this.f104968a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        try {
            parcel.writeString(this.f104968a);
            parcel.writeInt(this.f104969b);
            parcel.writeInt(this.f104970c);
            parcel.writeByte(this.f104971d ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f104972e ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.f104973f, 0);
        } catch (Exception e7) {
            Pv0.b.a("BiliShareConfiguration", "BiliShareConfiguration write error");
        }
    }
}
