package com.bilibili.relation.blacklist;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.api.BiliApiException;
import com.bilibili.droid.ToastHelper;
import com.bilibili.relation.api.RelationApiCallback;
import com.bilibili.relation.api.RelationApiManager;
import com.bilibili.relation.api.ResponseChangeRelation;
import com.bilibili.relation.blacklist.BlackListManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.dialog.BiliCommonDialog;
import tv.danmaku.bili.widget.dialog.CustomButtonInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/blacklist/BlackListManager.class */
@StabilityInferred(parameters = 1)
public final class BlackListManager {
    public static final int $stable = 0;

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/blacklist/BlackListManager$Callback.class */
    public interface Callback {
        void onConfirm();

        void onFailed();

        void onSuccess();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/blacklist/BlackListManager$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BlackListManager newInstance() {
            return new BlackListManager();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/blacklist/BlackListManager$a.class */
    public static final class a implements RelationApiCallback<ResponseChangeRelation> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Callback f86039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Activity f86040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f86041c;

        public a(Callback callback, Activity activity, boolean z6) {
            this.f86039a = callback;
            this.f86040b = activity;
            this.f86041c = z6;
        }

        @Override // com.bilibili.relation.api.RelationApiCallback
        public final boolean isCancel() {
            return this.f86040b.isFinishing();
        }

        @Override // com.bilibili.relation.api.RelationApiCallback
        public final void onDataSuccess(ResponseChangeRelation responseChangeRelation) {
            Callback callback = this.f86039a;
            if (callback != null) {
                callback.onSuccess();
            }
        }

        @Override // com.bilibili.relation.api.RelationApiCallback
        public final void onError(Throwable th) {
            String message = th instanceof BiliApiException ? ((BiliApiException) th).getMessage() : null;
            boolean zIsEmpty = TextUtils.isEmpty(message);
            Activity activity = this.f86040b;
            if (zIsEmpty) {
                ToastHelper.showToastShort(activity.getApplicationContext(), this.f86041c ? 2131847677 : 2131847615);
            } else {
                ToastHelper.showToastShort(activity.getApplicationContext(), message);
            }
            Callback callback = this.f86039a;
            if (callback != null) {
                callback.onFailed();
            }
        }
    }

    public static /* synthetic */ void addBlacklist$default(BlackListManager blackListManager, FragmentActivity fragmentActivity, long j7, int i7, String str, String str2, String str3, String str4, Callback callback, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            str = null;
        }
        if ((i8 & 16) != 0) {
            str2 = null;
        }
        if ((i8 & 32) != 0) {
            str3 = null;
        }
        if ((i8 & 64) != 0) {
            str4 = null;
        }
        if ((i8 & 128) != 0) {
            callback = null;
        }
        blackListManager.addBlacklist(fragmentActivity, j7, i7, str, str2, str3, str4, callback);
    }

    public static /* synthetic */ void delBlacklist$default(BlackListManager blackListManager, Activity activity, long j7, int i7, String str, String str2, String str3, String str4, Callback callback, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            str = null;
        }
        if ((i8 & 16) != 0) {
            str2 = null;
        }
        if ((i8 & 32) != 0) {
            str3 = null;
        }
        if ((i8 & 64) != 0) {
            str4 = null;
        }
        if ((i8 & 128) != 0) {
            callback = null;
        }
        blackListManager.delBlacklist(activity, j7, i7, str, str2, str3, str4, callback);
    }

    public static /* synthetic */ void tryModifyBlacklist$default(BlackListManager blackListManager, Activity activity, boolean z6, long j7, int i7, String str, String str2, String str3, String str4, Callback callback, int i8, Object obj) {
        if ((i8 & 256) != 0) {
            callback = null;
        }
        blackListManager.tryModifyBlacklist(activity, z6, j7, i7, str, str2, str3, str4, callback);
    }

    public final void addBlacklist(@Nullable final FragmentActivity fragmentActivity, final long j7, final int i7, @Nullable final String str, @Nullable final String str2, @Nullable final String str3, @Nullable final String str4, @Nullable final Callback callback) {
        if (fragmentActivity == null) {
            return;
        }
        BiliCommonDialog.Builder.setPositiveButton$default(BiliCommonDialog.Builder.setNegativeButton$default(new BiliCommonDialog.Builder(fragmentActivity).setCanceledOnTouchOutside(false).setButtonStyle(1).setTitle(fragmentActivity.getString(2131847633)).setContentText(fragmentActivity.getString(2131847673)), fragmentActivity.getString(2131841494), (BiliCommonDialog.OnDialogTextClickListener) null, true, (CustomButtonInfo) null, 8, (Object) null), fragmentActivity.getString(2131841445), new BiliCommonDialog.OnDialogTextClickListener(callback, this, fragmentActivity, j7, i7, str, str2, str3, str4) { // from class: Fs0.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BlackListManager.Callback f6439a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BlackListManager f6440b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final FragmentActivity f6441c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final long f6442d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f6443e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final String f6444f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final String f6445g;
            public final String h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final String f6446i;

            {
                this.f6439a = callback;
                this.f6440b = this;
                this.f6441c = fragmentActivity;
                this.f6442d = j7;
                this.f6443e = i7;
                this.f6444f = str;
                this.f6445g = str2;
                this.h = str3;
                this.f6446i = str4;
            }

            public final void onDialogTextClicked(View view, BiliCommonDialog biliCommonDialog) {
                BlackListManager.Companion companion = BlackListManager.Companion;
                BlackListManager.Callback callback2 = this.f6439a;
                if (callback2 != null) {
                    callback2.onConfirm();
                }
                String str5 = this.f6444f;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = this.f6445g;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = this.h;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = this.f6446i;
                if (str8 == null) {
                    str8 = "";
                }
                this.f6440b.tryModifyBlacklist(this.f6441c, true, this.f6442d, this.f6443e, str5, str6, str7, str8, callback2);
            }
        }, true, (CustomButtonInfo) null, 8, (Object) null).build().show(fragmentActivity.getSupportFragmentManager(), "add-black-list-dialog-confirm");
    }

    public final void delBlacklist(@Nullable Activity activity, long j7, int i7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Callback callback) {
        if (activity == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        tryModifyBlacklist(activity, false, j7, i7, str, str2, str3, str4, callback);
    }

    public final void tryModifyBlacklist(@NotNull Activity activity, boolean z6, long j7, int i7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable Callback callback) {
        RelationApiManager.modifyRelation(j7, z6 ? 5 : 6, i7, str, str2, str3, str4, new a(callback, activity, z6));
    }
}
