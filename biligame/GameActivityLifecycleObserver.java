package com.bilibili.biligame;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.BiliContext;
import com.bilibili.biligame.abtest.AbTestHelper;
import com.bilibili.biligame.download.GameDownloadManager;
import com.bilibili.biligame.download.tips.GameDownloadInstallTipManager;
import com.bilibili.biligame.download.tips.GameDownloadTipInterface;
import com.bilibili.biligame.helper.GameSourceFromManager;
import com.bilibili.biligame.ui.GameCenterHomeActivity;
import com.bilibili.biligame.ui.widget.GameWidgetManager;
import com.bilibili.biligame.utils.ABTestUtil;
import com.bilibili.biligame.widget.BaseTranslucentActivity;
import com.bilibili.game.DownloadHelper;
import com.bilibili.game.service.util.ABTestUtilsBase;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/GameActivityLifecycleObserver.class */
@StabilityInferred(parameters = 0)
public final class GameActivityLifecycleObserver extends BiliContext.AppActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f62114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f62115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f62116c;

    @NotNull
    public static final GameActivityLifecycleObserver INSTANCE = new GameActivityLifecycleObserver();
    public static final int $stable = 8;

    public final void checkInit() {
        if (f62114a || !ABTestUtil.INSTANCE.isGameCheckLifecycleInit()) {
            return;
        }
        init();
        f62116c = 1;
    }

    public final int getGameCenterActivityCount() {
        return f62116c;
    }

    public final boolean getHasGameCenterHomeActivity() {
        return f62115b;
    }

    public final void init() {
        f62114a = true;
        BiliContext.unregisterActivityStateCallback(this);
        BiliContext.registerActivityStateCallback(this);
    }

    public void onActivityCreated(@NotNull Activity activity) {
        if (activity instanceof BaseTranslucentActivity) {
            f62116c++;
        }
        if (activity instanceof GameCenterHomeActivity) {
            f62115b = true;
        }
    }

    public void onActivityDestroyed(@NotNull Activity activity) {
        if (activity instanceof BaseTranslucentActivity) {
            int i7 = f62116c - 1;
            f62116c = i7;
            if (i7 <= 0) {
                GameSourceFromManager.INSTANCE.clearParam();
            }
        }
        if (activity instanceof GameCenterHomeActivity) {
            f62115b = false;
        }
    }

    public void onActivityResumed(@NotNull Activity activity) {
        if (ABTestUtilsBase.isAutoResumeDownload() && DownloadHelper.isWifiAutoDownloadEnable()) {
            GameDownloadManager.INSTANCE.autoResumeDownloadTask();
        }
        CoroutineScope coroutineScope = GameDownloadInstallTipManager.a;
        if (BiliContext.isMainProcess() && ABTestUtil.INSTANCE.isShowInstallTipsDialog() && (activity instanceof GameDownloadTipInterface) && GameDownloadInstallTipManager.c) {
            GameDownloadInstallTipManager.b();
            GameDownloadInstallTipManager.c = false;
        }
    }

    public void onFirstActivityVisible() {
        GameDownloadTipInterface gameDownloadTipInterface;
        BLog.d("GameActivityLifecycleObserver", "恢复到前台");
        GameDownloadManager gameDownloadManager = GameDownloadManager.INSTANCE;
        gameDownloadManager.checkSpaceAndResumeDownloadTask();
        CoroutineScope coroutineScope = GameDownloadInstallTipManager.a;
        if (BiliContext.isMainProcess() && ABTestUtil.INSTANCE.isShowInstallTipsDialog() && (gameDownloadTipInterface = BiliContext.topActivity()) != null) {
            GameDownloadTipInterface gameDownloadTipInterface2 = gameDownloadTipInterface instanceof GameDownloadTipInterface ? gameDownloadTipInterface : null;
            if (gameDownloadTipInterface2 != null ? gameDownloadTipInterface2.showInstallTipsDialog() : false) {
                GameDownloadInstallTipManager.b();
            } else {
                GameDownloadInstallTipManager.c = true;
            }
        }
        gameDownloadManager.checkDownloadInstallStatus();
        if (ABTestUtil.INSTANCE.isABInfoRequestFrequently()) {
            AbTestHelper.getAllExpInfo$default(AbTestHelper.INSTANCE, false, null, 3, null);
        }
        GameWidgetManager.c();
    }

    public void onLastActivityInvisible() {
        BLog.d("GameActivityLifecycleObserver", "退到后台");
        GameWidgetManager.c();
    }

    public final void setHasGameCenterHomeActivity(boolean z6) {
        f62115b = z6;
    }
}
