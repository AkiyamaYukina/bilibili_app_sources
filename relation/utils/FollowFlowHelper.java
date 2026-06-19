package com.bilibili.relation.utils;

import UR0.D;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.droid.ActivityUtils;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.projection.internal.utils.ProjectionDanmakuSendHelper;
import com.bilibili.moduleservice.main.MainCommonService;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.relation.A;
import com.bilibili.relation.C6033z;
import com.bilibili.relation.FollowMenuContentKt;
import com.bilibili.relation.FollowStateManager;
import com.bilibili.relation.Y;
import com.bilibili.relation.api.Attention;
import com.bilibili.relation.api.RelationApiManager;
import com.bilibili.relation.c0;
import com.bilibili.relation.utils.FollowFlowHelper;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kntr.base.android.legacy.context.ContextUtilKt;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/utils/FollowFlowHelper.class */
public class FollowFlowHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f86142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f86143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f86144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f86146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f86147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f86148g;
    public HashMap<String, String> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FollowFlowCallback f86149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Hs0.e f86150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f86151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashMap<String, String> f86152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f86153m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f86154n = false;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/utils/FollowFlowHelper$AutoSyncFollowChangeCallback.class */
    public static abstract class AutoSyncFollowChangeCallback extends SimpleCallback {
        @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public void onFollowChange(boolean z6) {
            if (z6) {
                onFollowSuccess();
            } else {
                onUnFollowSuccess();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/utils/FollowFlowHelper$FollowFlowCallback.class */
    public interface FollowFlowCallback {
        boolean displayConfirmDialog(@NonNull Function0<Unit> function0);

        boolean isCancel();

        boolean isLogin();

        void onFollowChange(boolean z6);

        boolean onFollowError(Throwable th);

        void onFollowStart();

        boolean onFollowSuccess();

        void onGroupClickListener();

        boolean onInterceptBtnClick(boolean z6);

        void onSpecialStatusChange(boolean z6);

        boolean onUnFollowError(Throwable th);

        void onUnFollowStart();

        boolean onUnFollowSuccess();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/utils/FollowFlowHelper$SimpleCallback.class */
    public static abstract class SimpleCallback implements FollowFlowCallback {
        @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public boolean displayConfirmDialog(@NonNull Function0<Unit> function0) {
            return false;
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public void onFollowChange(boolean z6) {
            BLog.v("FollowFlowHelper", "onFollowChange " + z6);
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public boolean onFollowError(Throwable th) {
            return false;
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public void onFollowStart() {
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public boolean onFollowSuccess() {
            return false;
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public void onGroupClickListener() {
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public boolean onInterceptBtnClick(boolean z6) {
            return false;
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public void onSpecialStatusChange(boolean z6) {
            T9.e.a("special status change ==", "FollowFlowHelper", z6);
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public boolean onUnFollowError(Throwable th) {
            return false;
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public void onUnFollowStart() {
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public boolean onUnFollowSuccess() {
            return false;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/utils/FollowFlowHelper$a.class */
    public final class a implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FollowFlowHelper f86155a;

        public a(FollowFlowHelper followFlowHelper) {
            this.f86155a = followFlowHelper;
        }

        public final Object invoke() {
            this.f86155a.f86143b = false;
            return null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/utils/FollowFlowHelper$b.class */
    public final class b implements Function2<List<String>, List<String>, Unit> {
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/utils/FollowFlowHelper$c.class */
    public final class c implements Function0<Unit> {
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/utils/FollowFlowHelper$d.class */
    public final class d extends BiliApiDataCallback<Attention> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final jO.a f86156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f86157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final h f86158d;

        public d(jO.a aVar, Context context, h hVar) {
            this.f86156b = aVar;
            this.f86157c = context;
            this.f86158d = hVar;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(@Nullable Attention attention) {
            Attention attention2 = attention;
            if (attention2 == null) {
                onError(null);
                return;
            }
            boolean z6 = true;
            if (attention2.special != 1) {
                z6 = false;
            }
            jO.c cVar = new jO.c(this.f86157c, "setSpecial", z6 ? 2131847611 : 2131847627);
            jO.a aVar = this.f86156b;
            aVar.a(cVar);
            aVar.a(new jO.c(this.f86157c, "setGroup", 2131847624));
            aVar.a(new jO.c(this.f86157c, "unFollow", 2131847601));
            final h hVar = this.f86158d;
            final boolean z7 = z6;
            aVar.g = new kO.a(hVar, z7) { // from class: Hs0.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FollowFlowHelper.h f8766a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f8767b;

                {
                    this.f8766a = hVar;
                    this.f8767b = z7;
                }

                public final void c(jO.c cVar2) {
                    String str = cVar2.d;
                    FollowFlowHelper.h hVar2 = this.f8766a;
                    if (hVar2 != null) {
                        if ("setGroup".equals(str)) {
                            hVar2.a();
                        } else if ("unFollow".equals(str)) {
                            hVar2.b();
                        } else if ("setSpecial".equals(str)) {
                            hVar2.c(this.f8767b);
                        }
                    }
                }
            };
            aVar.c();
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            jO.c cVar = new jO.c(this.f86157c, "setSpecial", 2131847627);
            jO.a aVar = this.f86156b;
            aVar.a(cVar);
            aVar.a(new jO.c(this.f86157c, "setGroup", 2131847624));
            aVar.a(new jO.c(this.f86157c, "unFollow", 2131847601));
            aVar.g = new Hs0.g(this.f86158d);
            aVar.c();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/utils/FollowFlowHelper$e.class */
    public final class e extends BiliApiDataCallback<Void> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f86159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FollowFlowHelper f86160c;

        public e(FollowFlowHelper followFlowHelper, Context context) {
            this.f86160c = followFlowHelper;
            this.f86159b = context;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final boolean isCancel() {
            FollowFlowCallback followFlowCallback = this.f86160c.f86149i;
            return followFlowCallback == null || followFlowCallback.isCancel();
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(@Nullable Void r7) {
            MainCommonService mainCommonService;
            FollowFlowHelper followFlowHelper = this.f86160c;
            followFlowHelper.f86151k = false;
            followFlowHelper.f86143b = true;
            if (!followFlowHelper.f86149i.onFollowSuccess()) {
                ToastHelper.showToastShort(this.f86159b, 2131847602);
            }
            FollowStateManager.getInstance().notify(followFlowHelper.f86144c, true, followFlowHelper.f86150j);
            Activity wrapperActivity = ActivityUtils.getWrapperActivity(this.f86159b);
            if (wrapperActivity == null || (mainCommonService = (MainCommonService) w8.d.a(BLRouter.INSTANCE, MainCommonService.class, "default")) == null) {
                return;
            }
            mainCommonService.showNotificationSettingDialog(wrapperActivity, "7", followFlowHelper.f86146e);
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            String string;
            FollowFlowHelper followFlowHelper = this.f86160c;
            followFlowHelper.f86151k = false;
            if (followFlowHelper.f86149i.onFollowError(th)) {
                return;
            }
            if (th instanceof BiliApiException) {
                BiliApiException biliApiException = (BiliApiException) th;
                int i7 = biliApiException.mCode;
                if (i7 == 61001 || Hs0.a.a(i7)) {
                    Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(this.f86159b);
                    MainCommonService mainCommonService = (MainCommonService) BLRouter.INSTANCE.get(MainCommonService.class, "default");
                    if (mainCommonService == null || activityFindActivityOrNull == null) {
                        return;
                    }
                    mainCommonService.showAuthorityDialog(activityFindActivityOrNull, biliApiException.getMessage(), ProjectionDanmakuSendHelper.ERROR_NEED_BIND_PHONE);
                    return;
                }
                string = biliApiException.getMessage();
            } else {
                string = !ConnectivityMonitor.getInstance().isNetworkActive() ? this.f86159b.getString(2131847652) : null;
            }
            String string2 = string;
            if (TextUtils.isEmpty(string)) {
                string2 = this.f86159b.getString(2131847626);
            }
            ToastHelper.showToastShort(this.f86159b, string2);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/utils/FollowFlowHelper$f.class */
    public final class f extends BiliApiDataCallback<Void> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f86161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FollowFlowHelper f86162c;

        public f(FollowFlowHelper followFlowHelper, Context context) {
            this.f86162c = followFlowHelper;
            this.f86161b = context;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final boolean isCancel() {
            FollowFlowCallback followFlowCallback = this.f86162c.f86149i;
            return followFlowCallback == null || followFlowCallback.isCancel();
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(@Nullable Void r7) {
            FollowFlowHelper followFlowHelper = this.f86162c;
            followFlowHelper.f86151k = false;
            followFlowHelper.f86143b = false;
            if (!followFlowHelper.f86149i.onUnFollowSuccess()) {
                ToastHelper.showToastShort(this.f86161b, 2131847632);
            }
            FollowStateManager.getInstance().notify(followFlowHelper.f86144c, false, followFlowHelper.f86150j);
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            FollowFlowHelper followFlowHelper = this.f86162c;
            followFlowHelper.f86151k = false;
            if (followFlowHelper.f86149i.onUnFollowError(th)) {
                return;
            }
            String message = th instanceof BiliApiException ? ((BiliApiException) th).getMessage() : !ConnectivityMonitor.getInstance().isNetworkActive() ? this.f86161b.getString(2131847652) : null;
            String string = message;
            if (TextUtils.isEmpty(message)) {
                string = this.f86161b.getString(2131847616);
            }
            ToastHelper.showToastShort(this.f86161b, string);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/utils/FollowFlowHelper$g.class */
    public static abstract class g {
        @Nullable
        public abstract Context a();

        @CallSuper
        public void b(@NotNull Map<Long, Y> map) {
            if (a() == null) {
                return;
            }
            Iterator it = ((LinkedHashMap) map).entrySet().iterator();
            while (it.hasNext()) {
                Y y6 = (Y) ((Map.Entry) it.next()).getValue();
                if (y6 != null) {
                    int i7 = y6.f86000e;
                    if (i7 == 1) {
                        ToastHelper.showToastShort(a().getApplicationContext(), 2131847602);
                    } else if (i7 == 2) {
                        ToastHelper.showToastShort(a().getApplicationContext(), 2131847632);
                    }
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/utils/FollowFlowHelper$h.class */
    public interface h {
        void a();

        void b();

        void c(boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/utils/FollowFlowHelper$i.class */
    public static final class i extends BiliApiDataCallback<Void> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f86163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f86164c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final FollowFlowCallback f86165d;

        public i(Context context, boolean z6, FollowFlowCallback followFlowCallback) {
            this.f86163b = z6;
            this.f86164c = context;
            this.f86165d = followFlowCallback;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final boolean isCancel() {
            return this.f86164c == null;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(@Nullable Void r52) {
            Context context = this.f86164c;
            boolean z6 = this.f86163b;
            ToastHelper.showToastShort(context, z6 ? 2131847622 : 2131847625);
            FollowFlowCallback followFlowCallback = this.f86165d;
            if (followFlowCallback != null) {
                followFlowCallback.onSpecialStatusChange(!z6);
            }
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            if (th instanceof BiliApiException) {
                ToastHelper.showToastShort(this.f86164c, th.getMessage());
            } else if (ConnectivityMonitor.getInstance().isNetworkActive()) {
                ToastHelper.showToastShort(this.f86164c, 2131841734);
            } else {
                ToastHelper.showToastShort(this.f86164c, 2131847652);
            }
        }
    }

    public static void showCommonGroupMenu(Context context, @NonNull String str, h hVar) {
        RelationApiManager.getRelation(BiliAccounts.get(context).getAccessKey(), str, new d(new jO.a(context), context, hVar));
    }

    public final void a(Context context) {
        if (this.f86151k) {
            return;
        }
        this.f86151k = true;
        this.f86149i.onFollowStart();
        RelationApiManager.addAuthorAttentionV2(BiliAccounts.get(context).getAccessKey(), this.f86144c, this.f86145d, this.f86146e, this.f86147f, this.f86148g, this.h, new e(this, context));
    }

    public final void b(Context context) {
        jO.c cVar = new jO.c(context, "confirm", 2131847601);
        jO.a aVar = new jO.a(context);
        aVar.a = aVar.d.getString(2131847608);
        aVar.a(cVar);
        aVar.g = new Hs0.b(this, context);
        aVar.c();
    }

    @Deprecated
    public void bind(View view, boolean z6, long j7, boolean z7, int i7, FollowFlowCallback followFlowCallback) {
        bind(view, z6, j7, z7, i7, null, followFlowCallback);
    }

    @Deprecated
    public void bind(View view, boolean z6, long j7, boolean z7, int i7, String str, FollowFlowCallback followFlowCallback) {
        if (view == null || followFlowCallback == null) {
            return;
        }
        unRegisterFollowChangeListener();
        this.f86143b = z6;
        this.f86144c = j7;
        this.f86145d = i7;
        this.f86146e = str;
        this.f86142a = z7;
        this.f86149i = followFlowCallback;
        view.setOnClickListener(new Hs0.d(this, 0));
        registerFollowChangeListener();
    }

    public void bind(FollowHelperConfig followHelperConfig) {
        if (followHelperConfig.f86171f == null) {
            return;
        }
        long j7 = this.f86144c;
        long j8 = followHelperConfig.f86168c;
        if (j8 != j7 && this.f86149i != null) {
            unRegisterFollowChangeListener();
        }
        this.f86143b = followHelperConfig.f86167b;
        this.f86144c = j8;
        this.f86145d = followHelperConfig.f86170e;
        this.f86142a = followHelperConfig.f86169d;
        this.f86149i = followHelperConfig.f86171f;
        View view = followHelperConfig.f86166a;
        if (view != null) {
            view.setOnClickListener(new Hs0.c(this, 0));
        }
        this.f86146e = followHelperConfig.f86172g;
        this.f86147f = followHelperConfig.h;
        this.f86148g = followHelperConfig.f86173i;
        this.h = followHelperConfig.f86174j;
        registerFollowChangeListener();
    }

    public final void c(Context context) {
        if (this.f86151k) {
            return;
        }
        this.f86151k = true;
        this.f86149i.onUnFollowStart();
        RelationApiManager.deleteAuthorAttentionV2(BiliAccounts.get(context).getAccessKey(), this.f86144c, this.f86145d, this.f86146e, this.f86147f, this.f86148g, this.h, new f(this, context));
    }

    public Rect getMoreGlobalRect(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(view.getContext());
        if (activityFindActivityOrNull != null) {
            activityFindActivityOrNull.getWindow().getDecorView().getLocationOnScreen(iArr2);
        }
        int i7 = iArr[0] - iArr2[0];
        int i8 = iArr[1] - iArr2[1];
        return new Rect((view.getPaddingLeft() + i7) - DimenUtilsKt.dpToPx(4), view.getPaddingTop() + i8, (view.getWidth() + i7) - view.getPaddingRight(), (view.getHeight() + i8) - view.getPaddingBottom());
    }

    public void onButtonClick(Context context, String str) {
        FollowFlowCallback followFlowCallback = this.f86149i;
        if (followFlowCallback == null || !followFlowCallback.isLogin() || this.f86149i.onInterceptBtnClick(this.f86143b)) {
            return;
        }
        if (this.f86143b) {
            if (this.f86142a) {
                showCommonGroupMenu(context, str, new com.bilibili.relation.utils.a(this, context, str));
                return;
            } else {
                if (this.f86149i.displayConfirmDialog(new Hs0.f(0, this, context))) {
                    return;
                }
                b(context);
                return;
            }
        }
        HashMap<String, String> map = this.f86152l;
        if (map != null) {
            map.put("action_type", "interaction_follow");
            this.f86152l.put(NotificationCompat.CATEGORY_STATUS, D.c(this.f86143b, this.f86153m));
            if (!TextUtils.isEmpty(this.f86148g)) {
                this.f86152l.put("from_scmid", this.f86148g);
            }
            if (!TextUtils.isEmpty(this.f86146e)) {
                this.f86152l.put("spmid", this.f86146e);
            }
            this.f86152l.put(EditCustomizeSticker.TAG_MID, str);
            D.d(this.f86152l);
        }
        a(context);
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    public void onButtonClick(Context context, String str, Rect rect) {
        FollowFlowCallback followFlowCallback = this.f86149i;
        if (followFlowCallback == null || !followFlowCallback.isLogin() || this.f86149i.onInterceptBtnClick(this.f86143b)) {
            return;
        }
        if (!this.f86143b) {
            HashMap<String, String> map = this.f86152l;
            if (map != null) {
                map.put("action_type", "interaction_follow");
                this.f86152l.put(NotificationCompat.CATEGORY_STATUS, D.c(this.f86143b, this.f86153m));
                D.d(this.f86152l);
            }
            a(context);
            return;
        }
        if (KScreenAdjustUtilsKt.isNormal(ScreenAdjustUtilsKt.windowSize(context)) || !DeviceDecision.INSTANCE.getBoolean("dd_screen_adjust_follow_button", true)) {
            if (this.f86142a) {
                showCommonGroupMenu(context, str, new com.bilibili.relation.utils.a(this, context, str));
                return;
            } else {
                b(context);
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        HashMap<String, String> map2 = this.h;
        if (map2 != null && !map2.isEmpty()) {
            for (Map.Entry<String, String> entry : this.h.entrySet()) {
                if (entry.getValue() != null) {
                    jSONObject.put(entry.getKey(), (Object) entry.getValue());
                }
            }
        }
        FollowMenuContentKt.e(context, rect, this.f86144c, this.f86143b, this.f86153m, this.f86142a ? A.a.f85874a : A.c.f85876a, new c0(this.f86145d, this.f86146e, this.f86147f, this.f86148g, this.f86152l, jSONObject.toString()), new C6033z(new a(this), new Object(), new Object()), this.f86149i, this.f86150j);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [Hs0.e] */
    public void registerFollowChangeListener() {
        if (this.f86144c == 0 || this.f86149i == null || this.f86154n) {
            return;
        }
        if (this.f86150j == null) {
            this.f86150j = new FollowStateManager.FollowChangeListener(this) { // from class: Hs0.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FollowFlowHelper f8761a;

                {
                    this.f8761a = this;
                }

                @Override // com.bilibili.relation.FollowStateManager.FollowChangeListener
                public final void onFollowChange(boolean z6) {
                    FollowFlowHelper followFlowHelper = this.f8761a;
                    followFlowHelper.f86143b = z6;
                    followFlowHelper.f86149i.onFollowChange(z6);
                }
            };
        }
        this.f86154n = true;
        FollowStateManager.getInstance().register(this.f86144c, this.f86150j);
    }

    public void setClickReportExtras(HashMap<String, String> map) {
        this.f86152l = map;
    }

    public void setIsAttention(boolean z6) {
        this.f86143b = z6;
    }

    public void setIsGuestAttention(boolean z6) {
        this.f86153m = z6;
    }

    public void setShowMenuGroup(boolean z6) {
    }

    public void unRegisterFollowChangeListener() {
        if (this.f86144c == 0 || this.f86149i == null) {
            return;
        }
        this.f86154n = false;
        FollowStateManager.getInstance().unregister(this.f86144c, this.f86150j);
    }
}
