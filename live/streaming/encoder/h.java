package com.bilibili.live.streaming.encoder;

import com.bilibili.opd.app.bizcommon.bilicaptcha.CaptchaCallback;
import com.bilibili.opd.app.bizcommon.bilicaptcha.GeeCaptchaResult;
import hm0.C7471a;
import hm0.C7482l;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/h.class */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65278a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f65280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f65281d;

    public /* synthetic */ h(PushEncoderSink pushEncoderSink, byte[] bArr, String str) {
        this.f65280c = pushEncoderSink;
        this.f65281d = bArr;
        this.f65279b = str;
    }

    public /* synthetic */ h(C7471a c7471a, Integer num, String str) {
        this.f65280c = c7471a;
        this.f65281d = num;
        this.f65279b = str;
    }

    public final Object invoke() {
        switch (this.f65278a) {
            case 0:
                return PushEncoderSink.onAudioConfigPacket$lambda$11((PushEncoderSink) this.f65280c, (byte[]) this.f65281d, this.f65279b);
            default:
                C7471a c7471a = (C7471a) this.f65280c;
                C7482l c7482l = c7471a.f121021a;
                Integer num = (Integer) this.f65281d;
                if (c7482l != null) {
                    c7482l.b(num != null ? num.intValue() : 0);
                }
                String str = this.f65279b;
                CaptchaCallback captchaCallback = c7471a.f121022b;
                if (num != null && num.intValue() == 1) {
                    if (captchaCallback != null) {
                        captchaCallback.replyWithGeeCaptcha(GeeCaptchaResult.CAPTCHA_RESULT_SUC, str);
                    }
                } else if (num != null && num.intValue() == 0) {
                    if (captchaCallback != null) {
                        captchaCallback.replyWithGeeCaptcha(GeeCaptchaResult.CAPTCHA_RESULT_FAILED, str);
                    }
                } else if (captchaCallback != null) {
                    captchaCallback.replyWithGeeCaptcha(GeeCaptchaResult.CAPTCHA_RESULT_FAILED, str);
                }
                return Unit.INSTANCE;
        }
    }
}
