package com.bilibili.playerbizcommonv2.widget.setting;

import com.bapis.bilibili.playershared.Badge;
import com.bapis.bilibili.playershared.SettingBase;
import com.bapis.bilibili.playershared.SettingJumpType;
import com.bapis.bilibili.playershared.SettingMore;
import com.bapis.bilibili.playershared.SettingVertical;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/Y.class */
public final class Y {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/Y$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f83175a;

        static {
            int[] iArr = new int[SettingJumpType.values().length];
            try {
                iArr[SettingJumpType.SETTING_JUMP_TYPE_HALF_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[SettingJumpType.SETTING_JUMP_TYPE_OPEN_URL_BY_OUTER_BROWSER.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f83175a = iArr;
        }
    }

    public static final Jr0.f a(Badge badge) {
        return new Jr0.f(badge.getBgStyle(), 0, badge.getText(), badge.getTextColor(), badge.getTextColorNight(), badge.getBgColor(), badge.getBgColorNight(), badge.getBorderColor(), badge.getBorderColorNight(), "");
    }

    @NotNull
    public static final X b(@NotNull SettingBase settingBase) {
        String leftIcon = settingBase.getLeftIcon();
        String leftTitle = settingBase.getLeftTitle();
        boolean disabled = settingBase.getControl().getDisabled();
        String disabledReason = settingBase.getControl().getDisabledReason();
        boolean z6 = settingBase.hasControl() && !settingBase.getControl().getDisableGray();
        String str = (String) settingBase.getReportMap().get("report_show");
        boolean z7 = false;
        if (str != null) {
            z7 = false;
            if (str.equals("1")) {
                z7 = true;
            }
        }
        Map reportMap = settingBase.getReportMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : reportMap.entrySet()) {
            if (!StringsKt.n((CharSequence) entry.getKey(), "report_show")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new X(leftIcon, leftTitle, disabled, disabledReason, z6, z7, linkedHashMap, null);
    }

    @NotNull
    public static final Z c(@NotNull SettingMore settingMore) {
        String url = settingMore.getUrl();
        String rightTitle = settingMore.getRightTitle();
        String rightIcon = settingMore.getRightIcon();
        boolean needLogin = settingMore.getNeedLogin();
        SettingJumpType jumpType = settingMore.getJumpType();
        int i7 = jumpType == null ? -1 : a.f83175a[jumpType.ordinal()];
        return new Z(url, rightTitle, rightIcon, needLogin, i7 != 1 ? i7 != 2 ? VideoSettingJumpType.WEB_IN_APP : VideoSettingJumpType.WEB_IN_BROWSER : VideoSettingJumpType.WEB_IN_HALF, settingMore.hasBadge() ? a(settingMore.getBadge()) : null);
    }

    @NotNull
    public static final b0 d(@NotNull SettingVertical settingVertical) {
        String url = settingVertical.getUrl();
        boolean needLogin = settingVertical.getNeedLogin();
        SettingJumpType jumpType = settingVertical.getJumpType();
        int i7 = jumpType == null ? -1 : a.f83175a[jumpType.ordinal()];
        return new b0(url, needLogin, i7 != 1 ? i7 != 2 ? VideoSettingJumpType.WEB_IN_APP : VideoSettingJumpType.WEB_IN_BROWSER : VideoSettingJumpType.WEB_IN_HALF, a(settingVertical.getBadge()));
    }
}
