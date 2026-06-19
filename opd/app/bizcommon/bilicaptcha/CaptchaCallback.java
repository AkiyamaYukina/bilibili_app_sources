package com.bilibili.opd.app.bizcommon.bilicaptcha;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/bilicaptcha/CaptchaCallback.class */
public interface CaptchaCallback {
    void replyWithGeeCaptcha(@NotNull GeeCaptchaResult geeCaptchaResult, @Nullable String str);
}
