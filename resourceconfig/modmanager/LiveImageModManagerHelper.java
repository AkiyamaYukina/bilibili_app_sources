package com.bilibili.resourceconfig.modmanager;

import android.graphics.drawable.Drawable;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.lib.mod.ModResourceClient;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/resourceconfig/modmanager/LiveImageModManagerHelper.class */
public final class LiveImageModManagerHelper {
    public static final int CAPTAIN = 3;
    public static final int COMMAND = 2;
    public static final int DEFAULT = 0;
    public static final int GOVERNOR = 1;

    @NotNull
    public static final LiveImageModManagerHelper INSTANCE = new LiveImageModManagerHelper();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ConcurrentHashMap<String, String> f86245a = new ConcurrentHashMap<>();

    @JvmStatic
    @Nullable
    public static final Drawable getDrawable(@NotNull String str) {
        String imagePath = INSTANCE.getImagePath(str);
        return imagePath != null ? Drawable.createFromPath(imagePath) : null;
    }

    @JvmStatic
    @Nullable
    public static final Drawable getImageDrawable(@NotNull String str) {
        String imagePath = INSTANCE.getImagePath(str);
        return imagePath != null ? Drawable.createFromPath(imagePath) : null;
    }

    @JvmStatic
    @Nullable
    public static final Drawable getLiveBigREnterRoomTagToDrawable(@Nullable Integer num) {
        return (num != null && num.intValue() == 1) ? getDrawable("ic_live_big_r_super_rank.png") : (num != null && num.intValue() == 2) ? getDrawable("ic_live_big_r_guard.png") : (num != null && num.intValue() == 3) ? getDrawable("ic_live_big_r_fans_club.png") : (num != null && num.intValue() == 4) ? getDrawable("ic_live_big_r_high_active.png") : (num != null && num.intValue() == 5) ? getDrawable("ic_live_big_r_high_energy.png") : null;
    }

    @JvmStatic
    @Nullable
    public static final Drawable getLivePkAnchorDrawCardToDrawable(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? null : getDrawable("bg_live_pk_score_multiple_draw_card_3.png") : getDrawable("bg_live_pk_score_multiple_draw_card_2.png") : getDrawable("bg_live_pk_score_multiple_draw_card_1.png");
    }

    @JvmStatic
    @Nullable
    public static final Drawable getLivePkUserDrawCardToDrawable(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? null : getDrawable("bg_live_pk_score_multiple_draw_card_user_3.png") : getDrawable("bg_live_pk_score_multiple_draw_card_user_2.png") : getDrawable("bg_live_pk_score_multiple_draw_card_user_1.png");
    }

    @JvmStatic
    @Nullable
    public static final Drawable getSpenderClubWelcomeImageToDrawable() {
        return getDrawable("ic_live_spender_r_club_welcome.png");
    }

    public final void clearCache() {
        f86245a.clear();
    }

    @Nullable
    public final File getGuardIconFileInGiftPanel(int i7, boolean z6) {
        File imageFile;
        if (i7 == 1) {
            imageFile = getImageFile(z6 ? "ic_live_gift_panel_governor_lengthen.png" : "ic_live_gift_panel_governor.png");
        } else if (i7 == 2) {
            imageFile = getImageFile(z6 ? "ic_live_gift_panel_command_lengthen.png" : "ic_live_gift_panel_command.png");
        } else if (i7 != 3) {
            imageFile = null;
        } else {
            imageFile = getImageFile(z6 ? "ic_live_gift_panel_captain_lengthen.png" : "ic_live_gift_panel_captain.png");
        }
        return imageFile;
    }

    @Nullable
    public final File getImageFile(@NotNull String str) {
        ConcurrentHashMap<String, String> concurrentHashMap = f86245a;
        String str2 = concurrentHashMap.get(str);
        if (str2 != null && str2.length() != 0) {
            return new File(str2);
        }
        try {
            ModResource modResource = ModResourceClient.getInstance().get(BiliContext.application(), "live", "AndroidImage");
            if (!modResource.isAvailable()) {
                return null;
            }
            File fileRetrieveFile = modResource.retrieveFile(str);
            if (fileRetrieveFile != null) {
                String absolutePath = fileRetrieveFile.getAbsolutePath();
                String str3 = absolutePath;
                if (absolutePath == null) {
                    str3 = "";
                }
                concurrentHashMap.put(str, str3);
            }
            return fileRetrieveFile;
        } catch (Exception e7) {
            BLog.e("LiveImageModManagerHelper", e7.getMessage());
            return null;
        }
    }

    @Nullable
    public final String getImagePath(@NotNull String str) {
        File imageFile = getImageFile(str);
        return imageFile != null ? imageFile.getPath() : null;
    }
}
