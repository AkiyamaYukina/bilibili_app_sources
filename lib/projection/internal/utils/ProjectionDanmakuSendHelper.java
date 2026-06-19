package com.bilibili.lib.projection.internal.utils;

import Hr.k;
import android.app.Application;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.appcompat.widget.C3246j;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.core.app.NotificationCompat;
import bolts.Task;
import cf.c;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.blueshield.IDeviceColorModule;
import com.bilibili.api.BiliApiException;
import com.bilibili.base.BiliContext;
import com.bilibili.base.connectivity.Connectivity;
import com.bilibili.commons.RandomUtils;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.projection.internal.utils.ProjectionDanmakuSendHelper;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.h;
import qb.g;
import retrofit2.HttpException;
import retrofit2.Response;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.ui.main2.W;
import tv.danmaku.biliplayerv2.router.PlayerRouteUris;
import tv.danmaku.biliplayerv2.service.interact.biz.model.comment.CommentItem;
import tv.danmaku.biliplayerv2.service.interact.biz.model.comment.CommentParseException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/utils/ProjectionDanmakuSendHelper.class */
@Keep
public final class ProjectionDanmakuSendHelper {
    public static final int ERROR_NEED_BIND_PHONE = 61001;
    public static final int ERROR_NEED_LEGAL_PHONE = 61002;

    @NotNull
    public static final String FAKE_PREFIX = "fake-";

    @NotNull
    public static final ProjectionDanmakuSendHelper INSTANCE = new ProjectionDanmakuSendHelper();
    public static final int MAX_INPUT_LENGTH = 100;

    @NotNull
    public static final String TAG = "ProjectionDanmakuSendHelper";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/utils/ProjectionDanmakuSendHelper$DanmakuSendResponse.class */
    @Keep
    public static final class DanmakuSendResponse implements Parcelable {

        @NotNull
        public static final a CREATOR = new Object();

        @JSONField(name = "action")
        @Nullable
        private String action;

        @JSONField(name = "dmid")
        @Nullable
        private Long dmid;

        @JSONField(name = "dmid_str")
        @Nullable
        private String dmidStr;

        @JSONField(name = "visible")
        @Nullable
        private Boolean visible;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/utils/ProjectionDanmakuSendHelper$DanmakuSendResponse$a.class */
        public static final class a implements Parcelable.Creator<DanmakuSendResponse> {
            @Override // android.os.Parcelable.Creator
            public final DanmakuSendResponse createFromParcel(Parcel parcel) {
                return new DanmakuSendResponse(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final DanmakuSendResponse[] newArray(int i7) {
                return new DanmakuSendResponse[i7];
            }
        }

        public DanmakuSendResponse() {
            this(null, null, null, null, 15, null);
        }

        public DanmakuSendResponse(@NotNull Parcel parcel) {
            this(Long.valueOf(parcel.readLong()), parcel.readString(), Boolean.valueOf(parcel.readInt() != 1 ? false : true), parcel.readString());
        }

        public DanmakuSendResponse(@Nullable Long l7, @Nullable String str, @Nullable Boolean bool, @Nullable String str2) {
            this.dmid = l7;
            this.dmidStr = str;
            this.visible = bool;
            this.action = str2;
        }

        public /* synthetic */ DanmakuSendResponse(Long l7, String str, Boolean bool, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : l7, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : bool, (i7 & 8) != 0 ? null : str2);
        }

        public static /* synthetic */ DanmakuSendResponse copy$default(DanmakuSendResponse danmakuSendResponse, Long l7, String str, Boolean bool, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                l7 = danmakuSendResponse.dmid;
            }
            if ((i7 & 2) != 0) {
                str = danmakuSendResponse.dmidStr;
            }
            if ((i7 & 4) != 0) {
                bool = danmakuSendResponse.visible;
            }
            if ((i7 & 8) != 0) {
                str2 = danmakuSendResponse.action;
            }
            return danmakuSendResponse.copy(l7, str, bool, str2);
        }

        @Nullable
        public final Long component1() {
            return this.dmid;
        }

        @Nullable
        public final String component2() {
            return this.dmidStr;
        }

        @Nullable
        public final Boolean component3() {
            return this.visible;
        }

        @Nullable
        public final String component4() {
            return this.action;
        }

        @NotNull
        public final DanmakuSendResponse copy(@Nullable Long l7, @Nullable String str, @Nullable Boolean bool, @Nullable String str2) {
            return new DanmakuSendResponse(l7, str, bool, str2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DanmakuSendResponse)) {
                return false;
            }
            DanmakuSendResponse danmakuSendResponse = (DanmakuSendResponse) obj;
            return Intrinsics.areEqual(this.dmid, danmakuSendResponse.dmid) && Intrinsics.areEqual(this.dmidStr, danmakuSendResponse.dmidStr) && Intrinsics.areEqual(this.visible, danmakuSendResponse.visible) && Intrinsics.areEqual(this.action, danmakuSendResponse.action);
        }

        @Nullable
        public final String getAction() {
            return this.action;
        }

        @Nullable
        public final Long getDmid() {
            return this.dmid;
        }

        @Nullable
        public final String getDmidStr() {
            return this.dmidStr;
        }

        @Nullable
        public final Boolean getVisible() {
            return this.visible;
        }

        public int hashCode() {
            Long l7 = this.dmid;
            int iHashCode = 0;
            int iHashCode2 = l7 == null ? 0 : l7.hashCode();
            String str = this.dmidStr;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            Boolean bool = this.visible;
            int iHashCode4 = bool == null ? 0 : bool.hashCode();
            String str2 = this.action;
            if (str2 != null) {
                iHashCode = str2.hashCode();
            }
            return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
        }

        public final void setAction(@Nullable String str) {
            this.action = str;
        }

        public final void setDmid(@Nullable Long l7) {
            this.dmid = l7;
        }

        public final void setDmidStr(@Nullable String str) {
            this.dmidStr = str;
        }

        public final void setVisible(@Nullable Boolean bool) {
            this.visible = bool;
        }

        @NotNull
        public String toString() {
            Long l7 = this.dmid;
            String str = this.dmidStr;
            Boolean bool = this.visible;
            String str2 = this.action;
            StringBuilder sbA = c.a("DanmakuSendResponse(dmid=", ", dmidStr=", str, l7, ", visible=");
            sbA.append(bool);
            sbA.append(", action=");
            sbA.append(str2);
            sbA.append(")");
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i7) {
            Long l7 = this.dmid;
            parcel.writeLong(l7 != null ? l7.longValue() : 0L);
            parcel.writeString(this.dmidStr);
            parcel.writeInt(Intrinsics.areEqual(this.visible, Boolean.TRUE) ? 1 : 0);
            parcel.writeString(this.action);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/utils/ProjectionDanmakuSendHelper$a.class */
    public static final class a extends BiliApiDataCallback<DanmakuSendResponse> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CommentItem f63843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f63844c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Ie0.c f63845d;

        public a(CommentItem commentItem, Context context, Ie0.c cVar) {
            this.f63843b = commentItem;
            this.f63844c = context;
            this.f63845d = cVar;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(DanmakuSendResponse danmakuSendResponse) {
            DanmakuSendResponse danmakuSendResponse2 = danmakuSendResponse;
            CommentItem commentItem = this.f63843b;
            if (commentItem != null) {
                commentItem.mRemoteDmId = danmakuSendResponse2 != null ? danmakuSendResponse2.getDmidStr() : null;
            }
            if (commentItem != null) {
                String action = null;
                if (danmakuSendResponse2 != null) {
                    action = danmakuSendResponse2.getAction();
                }
                commentItem.action = action;
            }
            if (!(danmakuSendResponse2 != null ? Intrinsics.areEqual(danmakuSendResponse2.getVisible(), Boolean.TRUE) : false)) {
                BLog.w(ProjectionDanmakuSendHelper.TAG, "danmaku send success, but server say that it is not visible");
                return;
            }
            ProjectionDanmakuSendHelper projectionDanmakuSendHelper = ProjectionDanmakuSendHelper.INSTANCE;
            Context context = this.f63844c;
            String dmidStr = danmakuSendResponse2.getDmidStr();
            String str = dmidStr;
            if (dmidStr == null) {
                str = "";
            }
            String action2 = danmakuSendResponse2.getAction();
            projectionDanmakuSendHelper.onSendDanmakuSuccess(context, str, action2 != null ? action2 : "", this.f63845d);
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            String string = this.f63844c.getString(2131846941);
            HttpException httpException = th instanceof HttpException ? (HttpException) th : null;
            String string2 = string;
            if (httpException != null) {
                Response response = httpException.response();
                string2 = string;
                if (response != null) {
                    string2 = string;
                    if (response.code() == 500) {
                        string2 = "";
                    }
                }
            }
            if (th instanceof SocketTimeoutException) {
                string2 = this.f63844c.getString(2131845753);
            }
            String string3 = string2;
            if (th instanceof BiliApiException) {
                int i7 = ((BiliApiException) th).mCode;
                String message = th.getMessage();
                if (message != null) {
                    string2 = message;
                }
                switch (i7) {
                    case ProjectionDanmakuSendHelper.ERROR_NEED_BIND_PHONE /* 61001 */:
                    case ProjectionDanmakuSendHelper.ERROR_NEED_LEGAL_PHONE /* 61002 */:
                        PlayerRouteUris.Routers.INSTANCE.gotoAuthority(this.f63844c, i7, string2);
                        ProjectionDanmakuSendHelper.INSTANCE.onSendDanmakuFailed(this.f63844c, string2);
                        return;
                    default:
                        if (i7 == -101 || i7 == -2) {
                            ProjectionDanmakuSendHelper.INSTANCE.signOut(this.f63844c);
                            string3 = this.f63844c.getString(2131847429);
                        } else {
                            string3 = string2;
                        }
                        break;
                }
            }
            ProjectionDanmakuSendHelper.INSTANCE.onSendDanmakuFailed(this.f63844c, string3);
        }
    }

    private ProjectionDanmakuSendHelper() {
    }

    private final void onSend(Context context, String str, int i7, int i8, int i9, long j7, String str2, String str3, String str4, String str5, Ie0.c cVar) {
        if ((context != null ? context.getApplicationContext() : null) == null) {
            onSendDanmakuFailed(context, null);
            return;
        }
        CommentItem commentItemObtainDanmakuItem = obtainDanmakuItem(i7, str, j7, i8, i9);
        if (commentItemObtainDanmakuItem != null) {
            commentItemObtainDanmakuItem.mSentFromMe = true;
        }
        String strValueOf = String.valueOf(RandomUtils.nextInt());
        HashMap mapA = W.a("type", "1", "oid", str2);
        mapA.put("color", h.a(i9, j7, NotificationCompat.CATEGORY_PROGRESS, mapA));
        P4.a.a(i8, NotificationCompat.CATEGORY_MESSAGE, str, "fontsize", mapA);
        k.a(i7, IDeviceColorModule.EDGE_MODE_KEY, "pool", "0", mapA);
        mapA.put("plat", "2");
        String strCurrentPolarisActionId = PageViewTracker.getInstance().currentPolarisActionId();
        if (strCurrentPolarisActionId != null) {
            mapA.put("action_id", strCurrentPolarisActionId);
        }
        if (!TextUtils.isEmpty(strValueOf)) {
            mapA.put("rnd", strValueOf);
        }
        if (commentItemObtainDanmakuItem != null) {
            commentItemObtainDanmakuItem.mRemoteDmId = C3751q.a(System.currentTimeMillis(), FAKE_PREFIX);
        }
        ((com.bilibili.lib.projection.internal.utils.a) ServiceGenerator.createService(com.bilibili.lib.projection.internal.utils.a.class)).sendDanmaku((!BiliAccounts.get(context).isLogin() || TextUtils.isEmpty(BiliAccounts.get(context).getAccessKey()) || BiliAccounts.get(context).mid() == 0) ? "" : BiliAccounts.get(context).getAccessKey(), str3, str2, str4, str5, mapA).enqueue(new a(commentItemObtainDanmakuItem, context, cVar));
    }

    public static /* synthetic */ boolean sendDanmaku$default(ProjectionDanmakuSendHelper projectionDanmakuSendHelper, Context context, long j7, long j8, String str, String str2, long j9, String str3, int i7, int i8, int i9, Ie0.c cVar, int i10, Object obj) {
        if ((i10 & 128) != 0) {
            i7 = 1;
        }
        if ((i10 & 256) != 0) {
            i8 = 25;
        }
        if ((i10 & 512) != 0) {
            i9 = 16777215;
        }
        return projectionDanmakuSendHelper.sendDanmaku(context, j7, j8, str, str2, j9, str3, i7, i8, i9, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Task<Void> signOut(final Context context) {
        return Task.callInBackground(new Callable(context) { // from class: Ie0.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Context f10270a;

            {
                this.f10270a = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ProjectionDanmakuSendHelper.signOut$lambda$0(this.f10270a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void signOut$lambda$0(Context context) {
        BiliAccounts.get(context).logout("ProjectionDanmakuSendHelper_signOut");
        return null;
    }

    @NotNull
    public final String getModeForReport(int i7) {
        return i7 != 1 ? i7 != 4 ? i7 != 5 ? i7 != 6 ? CaptureSchema.OLD_INVALID_ID_STRING : "3" : "2" : "4" : "3";
    }

    @Nullable
    public final CommentItem obtainDanmakuItem(int i7, @NotNull String str, long j7, int i8, int i9) {
        CommentItem commentItem;
        CommentItem commentItemA = yi1.c.a(i7);
        try {
            commentItemA.setTimeInMilliSeconds(j7);
            commentItemA.setBody(str);
            commentItemA.setSize(i8);
            commentItemA.setTextColor(i9);
            commentItem = commentItemA;
        } catch (CommentParseException e7) {
            C3246j.b("Comment parse error:", e7.getMessage(), TAG);
            commentItem = null;
        }
        return commentItem;
    }

    public final void onSendDanmakuFailed(@Nullable Context context, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        toast(context, str);
    }

    public final void onSendDanmakuSuccess(@Nullable Context context, @NotNull String str, @NotNull String str2, @NotNull Ie0.c cVar) {
        cVar.onSuccess(str, str2);
    }

    public final boolean sendDanmaku(@Nullable Context context, long j7, long j8, @NotNull String str, @NotNull String str2, long j9, @Nullable String str3, int i7, int i8, int i9, @NotNull Ie0.c cVar) {
        String strL;
        String strL2 = (str3 == null || (strL = StringsKt.L(str3, "\r", "")) == null) ? null : StringsKt.L(strL, "\n", "");
        if (TextUtils.isEmpty(strL2)) {
            Application application = BiliContext.application();
            String string = null;
            if (context != null) {
                string = context.getString(2131847073);
            }
            toast(application, string);
            return false;
        }
        if ((strL2 != null ? strL2.length() : 0) > 100) {
            String string2 = null;
            if (context != null) {
                string2 = context.getString(2131847316);
            }
            toast(context, string2);
            return false;
        }
        if (j9 < 0) {
            onSendDanmakuFailed(context, null);
            return true;
        }
        if (Connectivity.isConnected(Connectivity.getActiveNetworkInfo(context != null ? context.getApplicationContext() : null))) {
            onSend(context, strL2, i7, i8, i9, j9, String.valueOf(j8), String.valueOf(j7), str, str2, cVar);
            return true;
        }
        String string3 = null;
        if (context != null) {
            string3 = context.getString(2131841508);
        }
        toast(context, string3);
        return false;
    }

    public final void toast(@Nullable Context context, @Nullable String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        g.a(32, 17, "extra_title", str).duration(5000L).build();
        ToastHelper.showToast(context, str, 0);
    }
}
