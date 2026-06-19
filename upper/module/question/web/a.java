package com.bilibili.upper.module.question.web;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.app.comm.IJsBridgeBehavior;
import com.bilibili.app.comm.bhwebview.api.IPerformanceReporter;
import com.bilibili.common.webview.js.JsBridgeCallHandlerFactoryV2;
import com.bilibili.common.webview.js.JsBridgeCallHandlerV2;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.jsbridge.common.BaseJsBridgeCallHandlerV2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/question/web/a.class */
@StabilityInferred(parameters = 0)
public final class a extends BaseJsBridgeCallHandlerV2<EI0.a> {

    /* JADX INFO: renamed from: com.bilibili.upper.module.question.web.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/question/web/a$a.class */
    @StabilityInferred(parameters = 0)
    public static final class C1233a implements JsBridgeCallHandlerFactoryV2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final PlusQuestionActivity f113941a;

        public C1233a(@NotNull PlusQuestionActivity plusQuestionActivity) {
            this.f113941a = plusQuestionActivity;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [EI0.a, com.bilibili.app.comm.IJsBridgeBehavior, java.lang.Object] */
        @NotNull
        public final JsBridgeCallHandlerV2 create() {
            ?? obj = new Object();
            obj.f4136a = this.f113941a;
            return new BaseJsBridgeCallHandlerV2((IJsBridgeBehavior) obj);
        }
    }

    @NotNull
    public final String[] getSupportFunctions() {
        return new String[]{"closeWindow", "toast"};
    }

    @NotNull
    public final String getTag() {
        return "live_location_half";
    }

    public final void invokeNative(@NotNull String str, @Nullable JSONObject jSONObject, @Nullable String str2) {
        EI0.a aVar;
        String string;
        IPerformanceReporter iPerformanceReporter;
        IPerformanceReporter iPerformanceReporter2;
        if (Intrinsics.areEqual(str, "closeWindow")) {
            EI0.a aVar2 = (EI0.a) getJBBehavior();
            if (aVar2 == null || (iPerformanceReporter2 = aVar2.f4136a) == null) {
                return;
            }
            iPerformanceReporter2.finish();
            return;
        }
        if (!Intrinsics.areEqual(str, "toast") || (aVar = (EI0.a) getJBBehavior()) == null || jSONObject == null || jSONObject.isEmpty() || (string = jSONObject.getString(NotificationCompat.CATEGORY_MESSAGE)) == null || string.length() == 0 || (iPerformanceReporter = aVar.f4136a) == null) {
            return;
        }
        ToastHelper.showToastShort(iPerformanceReporter, string);
    }
}
