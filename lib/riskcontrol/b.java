package com.bilibili.lib.riskcontrol;

import af0.C3203b;
import af0.j;
import com.bilibili.captcha.BiliCaptchaCallback;
import com.bilibili.captcha.BiliCaptchaException;
import com.bilibili.lib.riskcontrol.RiskControlReporter;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/riskcontrol/b.class */
public final class b implements BiliCaptchaCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogShowingCallback f64343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ref.ObjectRef<String> f64344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f64346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f64347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RiskControlCallback f64348f;

    public b(DialogShowingCallback dialogShowingCallback, Ref.ObjectRef<String> objectRef, String str, String str2, String str3, RiskControlCallback riskControlCallback, C3203b c3203b) {
        this.f64343a = dialogShowingCallback;
        this.f64344b = objectRef;
        this.f64345c = str;
        this.f64346d = str2;
        this.f64347e = str3;
        this.f64348f = riskControlCallback;
    }

    public final void closeCaptchaDialog() {
        DialogShowingCallback dialogShowingCallback = this.f64343a;
        if (dialogShowingCallback != null) {
            dialogShowingCallback.onShowing(false);
        }
        RiskControlReporter.b(RiskControlReporter.EventType.CLOSE_CAPTCHA, (String) this.f64344b.element, this.f64345c, null, null, null, null, this.f64346d, 1016);
    }

    public final String getInitParams() {
        RiskControlReporter.b(RiskControlReporter.EventType.H5_REQUEST_PARAMS, (String) this.f64344b.element, this.f64345c, null, null, null, null, this.f64346d, 1016);
        return this.f64347e;
    }

    public final void onError(BiliCaptchaException biliCaptchaException) {
        RiskControlReporter.EventType eventType = RiskControlReporter.EventType.H5_CALLBACK_TOKEN;
        Ref.ObjectRef<String> objectRef = this.f64344b;
        RiskControlReporter.b(eventType, (String) objectRef.element, this.f64345c, "0", null, biliCaptchaException.getErrorCode(), biliCaptchaException.getErrorMsg(), this.f64346d, 600);
        RiskControlReporter.b(RiskControlReporter.EventType.CAPTCHA_CALLBACK_TOKEN, (String) objectRef.element, this.f64345c, "0", null, biliCaptchaException.getErrorCode(), biliCaptchaException.getErrorMsg(), this.f64346d, 600);
        int code = biliCaptchaException.getType().getCode();
        this.f64348f.onFailed(new BiliRiskException(code != 1 ? code != 2 ? ErrorType.ERROR : ErrorType.EXPIRED : ErrorType.USER_CANCEL, biliCaptchaException.getErrorCode(), biliCaptchaException.getErrorMsg()));
    }

    public final void replyWithToken(String str) {
        RiskControlReporter.EventType eventType = RiskControlReporter.EventType.H5_CALLBACK_TOKEN;
        Ref.ObjectRef<String> objectRef = this.f64344b;
        RiskControlReporter.b(eventType, (String) objectRef.element, this.f64345c, "1", str, null, null, this.f64346d, 920);
        j.c(str);
        RiskControlReporter.b(RiskControlReporter.EventType.CAPTCHA_CALLBACK_TOKEN, (String) objectRef.element, this.f64345c, "1", str, null, null, this.f64346d, 920);
        this.f64348f.onSuccess(str);
    }
}
