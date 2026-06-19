package com.bilibili.opd.app.bizcommon.bilicaptcha;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/bilicaptcha/GeeCaptchaResult.class */
public final class GeeCaptchaResult {
    private static final EnumEntries $ENTRIES;
    private static final GeeCaptchaResult[] $VALUES;
    public static final GeeCaptchaResult CAPTCHA_RESULT_SUC = new GeeCaptchaResult("CAPTCHA_RESULT_SUC", 0, 1);
    public static final GeeCaptchaResult CAPTCHA_RESULT_FAILED = new GeeCaptchaResult("CAPTCHA_RESULT_FAILED", 1, 0);

    private static final /* synthetic */ GeeCaptchaResult[] $values() {
        return new GeeCaptchaResult[]{CAPTCHA_RESULT_SUC, CAPTCHA_RESULT_FAILED};
    }

    static {
        GeeCaptchaResult[] geeCaptchaResultArr$values = $values();
        $VALUES = geeCaptchaResultArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(geeCaptchaResultArr$values);
    }

    private GeeCaptchaResult(String str, int i7, int i8) {
    }

    @NotNull
    public static EnumEntries<GeeCaptchaResult> getEntries() {
        return $ENTRIES;
    }

    public static GeeCaptchaResult valueOf(String str) {
        return (GeeCaptchaResult) Enum.valueOf(GeeCaptchaResult.class, str);
    }

    public static GeeCaptchaResult[] values() {
        return (GeeCaptchaResult[]) $VALUES.clone();
    }
}
