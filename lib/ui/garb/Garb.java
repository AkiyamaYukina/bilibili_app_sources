package com.bilibili.lib.ui.garb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.util.AppBuildConfig;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/garb/Garb.class */
@Keep
public final class Garb {

    @NotNull
    public static final a Companion = new Object();
    private int btnBgEndColor;
    private int btnBgStartColor;
    private int btnIconColor;

    @ColorInt
    private int fontColor;
    private boolean hasAnimate;
    private long id;
    private boolean isAnimateLoop;
    private boolean isForce;
    private boolean isLoadAllFile;
    private boolean isMineAnimateLoop;
    private boolean isOp;
    private boolean isPrimaryOnly;
    private boolean isTailColorModel;

    @ColorInt
    private int mainFontColor;

    @ColorInt
    private int secondaryPageColor;

    @ColorInt
    private int sideBgColor;
    private int sideLineColor;
    private int tailColor;
    private int tailIconColor;
    private int tailIconColorNight;
    private int tailIconColorSelected;
    private int tailIconColorSelectedNight;
    private int tailSelectedColor;
    private long ver;

    @Nullable
    private String name = "";

    @Nullable
    private String colorName = "";

    @Nullable
    private String headBgPath = "";

    @Nullable
    private String headTabBgPath = "";

    @Nullable
    private String sideBgPath = "";

    @Nullable
    private String sideBottomBgPath = "";

    @Nullable
    private String tailBgPath = "";

    @Nullable
    private String headMineBgPath = "";

    @Nullable
    private String headMineSquaredBgPath = "";

    @Nullable
    private String headMineBgAnimatorPath = "";

    @NotNull
    private List<String> tailIconPath = new ArrayList();

    @NotNull
    private List<String> tailIconSelectedPath = new ArrayList();
    private boolean isDarkMode = true;
    private boolean isMainDarkMode = true;
    private boolean changeable = true;

    @Nullable
    private String btnIconPath = "";

    @Nullable
    private String btnIconSelectedPath = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/garb/Garb$a.class */
    public static final class a {
        @NotNull
        public static Garb a() {
            Garb garb = new Garb();
            garb.setId(8L);
            garb.setColorName("white");
            return garb;
        }
    }

    private final boolean isEmptyList(List<String> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.isEmpty(it.next())) {
                return true;
            }
        }
        return false;
    }

    public final int getBtnBgEndColor() {
        return this.btnBgEndColor;
    }

    public final int getBtnBgStartColor() {
        return this.btnBgStartColor;
    }

    public final int getBtnIconColor() {
        return this.btnIconColor;
    }

    @Nullable
    public final String getBtnIconPath() {
        return this.btnIconPath;
    }

    @Nullable
    public final String getBtnIconSelectedPath() {
        return this.btnIconSelectedPath;
    }

    public final boolean getChangeable() {
        return this.changeable;
    }

    @Nullable
    public final String getColorName() {
        return this.colorName;
    }

    public final int getFontColor() {
        return this.fontColor;
    }

    public final boolean getHasAnimate() {
        return this.hasAnimate;
    }

    @Nullable
    public final String getHeadBgPath() {
        return this.headBgPath;
    }

    @Nullable
    public final String getHeadMineBgAnimatorPath() {
        return this.headMineBgAnimatorPath;
    }

    @Nullable
    public final String getHeadMineBgPath() {
        return this.headMineBgPath;
    }

    @Nullable
    public final String getHeadMineSquaredBgPath() {
        return this.headMineSquaredBgPath;
    }

    @Nullable
    public final String getHeadTabBgPath() {
        return this.headTabBgPath;
    }

    public final long getId() {
        return this.id;
    }

    public final int getMainFontColor() {
        return this.mainFontColor;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getSecondaryPageColor() {
        return this.secondaryPageColor;
    }

    public final int getSideBgColor() {
        return this.sideBgColor;
    }

    @Nullable
    public final String getSideBgPath() {
        return this.sideBgPath;
    }

    @Nullable
    public final String getSideBottomBgPath() {
        return this.sideBottomBgPath;
    }

    public final int getSideLineColor() {
        return this.sideLineColor;
    }

    @Nullable
    public final String getTailBgPath() {
        return this.tailBgPath;
    }

    public final int getTailColor() {
        return this.tailColor;
    }

    public final int getTailIconColor() {
        return this.tailIconColor;
    }

    public final int getTailIconColorNight() {
        return this.tailIconColorNight;
    }

    public final int getTailIconColorSelected() {
        return this.tailIconColorSelected;
    }

    public final int getTailIconColorSelectedNight() {
        return this.tailIconColorSelectedNight;
    }

    @NotNull
    public final List<String> getTailIconPath() {
        return this.tailIconPath;
    }

    @NotNull
    public final List<String> getTailIconSelectedPath() {
        return this.tailIconSelectedPath;
    }

    public final int getTailSelectedColor() {
        return this.tailSelectedColor;
    }

    public final long getVer() {
        return this.ver;
    }

    public final boolean isAnimateLoop() {
        return this.isAnimateLoop;
    }

    public final boolean isBottomIconsEmpty() {
        return isEmptyList(this.tailIconPath) || isEmptyList(this.tailIconSelectedPath);
    }

    public final boolean isDarkMode() {
        return this.isDarkMode;
    }

    public final boolean isForce() {
        return this.isForce;
    }

    public final boolean isLoadAllFile() {
        return this.isLoadAllFile;
    }

    public final boolean isMainDarkMode() {
        return this.isMainDarkMode;
    }

    public final boolean isMineAnimateLoop() {
        return this.isMineAnimateLoop;
    }

    @JSONField(deserialize = false, serialize = false)
    public final boolean isNight() {
        if (TextUtils.isEmpty(this.colorName)) {
            return false;
        }
        return Intrinsics.areEqual(this.colorName, "black");
    }

    public final boolean isNightTheme(@NotNull Context context) {
        boolean z6 = true;
        if (BiliGlobalPreferenceHelper.getBLKVSharedPreference(context).getInt(MultipleThemeUtils.PREFERENCE_KEY, 2) != 1) {
            z6 = false;
        }
        return z6;
    }

    public final boolean isOp() {
        return this.isOp;
    }

    @JSONField(deserialize = false, serialize = false)
    public final boolean isPink() {
        if (TextUtils.isEmpty(this.colorName)) {
            return false;
        }
        return Intrinsics.areEqual(this.colorName, "pink");
    }

    public final boolean isPrimaryOnly() {
        return this.isPrimaryOnly;
    }

    @JSONField(deserialize = false, serialize = false)
    public final boolean isPure() {
        Application application = BiliContext.application();
        if (application != null && AppBuildConfig.Companion.isHDApp(application) && (TextUtils.isEmpty(this.colorName) || Intrinsics.areEqual(this.colorName, "pink"))) {
            if (isNightTheme(application)) {
                this.colorName = "black";
            } else {
                this.colorName = "white";
            }
            this.fontColor = 0;
        }
        if (TextUtils.isEmpty(this.colorName)) {
            return false;
        }
        return GarbManager.INSTANCE.isPure$widget_release(this.colorName);
    }

    public final boolean isTailColorModel() {
        return this.isTailColorModel;
    }

    @JSONField(deserialize = false, serialize = false)
    public final boolean isWhite() {
        if (TextUtils.isEmpty(this.colorName)) {
            return false;
        }
        return Intrinsics.areEqual(this.colorName, "white");
    }

    public final void setAnimateLoop(boolean z6) {
        this.isAnimateLoop = z6;
    }

    public final void setBtnBgEndColor(int i7) {
        this.btnBgEndColor = i7;
    }

    public final void setBtnBgStartColor(int i7) {
        this.btnBgStartColor = i7;
    }

    public final void setBtnIconColor(int i7) {
        this.btnIconColor = i7;
    }

    public final void setBtnIconPath(@Nullable String str) {
        this.btnIconPath = str;
    }

    public final void setBtnIconSelectedPath(@Nullable String str) {
        this.btnIconSelectedPath = str;
    }

    public final void setChangeable(boolean z6) {
        this.changeable = z6;
    }

    public final void setColorName(@Nullable String str) {
        this.colorName = str;
    }

    public final void setDarkMode(boolean z6) {
        this.isDarkMode = z6;
    }

    public final void setFontColor(int i7) {
        this.fontColor = i7;
    }

    public final void setForce(boolean z6) {
        this.isForce = z6;
    }

    public final void setHasAnimate(boolean z6) {
        this.hasAnimate = z6;
    }

    public final void setHeadBgPath(@Nullable String str) {
        this.headBgPath = str;
    }

    public final void setHeadMineBgAnimatorPath(@Nullable String str) {
        this.headMineBgAnimatorPath = str;
    }

    public final void setHeadMineBgPath(@Nullable String str) {
        this.headMineBgPath = str;
    }

    public final void setHeadMineSquaredBgPath(@Nullable String str) {
        this.headMineSquaredBgPath = str;
    }

    public final void setHeadTabBgPath(@Nullable String str) {
        this.headTabBgPath = str;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setLoadAllFile(boolean z6) {
        this.isLoadAllFile = z6;
    }

    public final void setMainDarkMode(boolean z6) {
        this.isMainDarkMode = z6;
    }

    public final void setMainFontColor(int i7) {
        this.mainFontColor = i7;
    }

    public final void setMineAnimateLoop(boolean z6) {
        this.isMineAnimateLoop = z6;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOp(boolean z6) {
        this.isOp = z6;
    }

    public final void setPrimaryOnly(boolean z6) {
        this.isPrimaryOnly = z6;
    }

    public final void setSecondaryPageColor(int i7) {
        this.secondaryPageColor = i7;
    }

    public final void setSideBgColor(int i7) {
        this.sideBgColor = i7;
    }

    public final void setSideBgPath(@Nullable String str) {
        this.sideBgPath = str;
    }

    public final void setSideBottomBgPath(@Nullable String str) {
        this.sideBottomBgPath = str;
    }

    public final void setSideLineColor(int i7) {
        this.sideLineColor = i7;
    }

    public final void setTailBgPath(@Nullable String str) {
        this.tailBgPath = str;
    }

    public final void setTailColor(int i7) {
        this.tailColor = i7;
    }

    public final void setTailColorModel(boolean z6) {
        this.isTailColorModel = z6;
    }

    public final void setTailIconColor(int i7) {
        this.tailIconColor = i7;
    }

    public final void setTailIconColorNight(int i7) {
        this.tailIconColorNight = i7;
    }

    public final void setTailIconColorSelected(int i7) {
        this.tailIconColorSelected = i7;
    }

    public final void setTailIconColorSelectedNight(int i7) {
        this.tailIconColorSelectedNight = i7;
    }

    public final void setTailIconPath(@NotNull List<String> list) {
        this.tailIconPath = list;
    }

    public final void setTailIconSelectedPath(@NotNull List<String> list) {
        this.tailIconSelectedPath = list;
    }

    public final void setTailSelectedColor(int i7) {
        this.tailSelectedColor = i7;
    }

    public final void setVer(long j7) {
        this.ver = j7;
    }
}
