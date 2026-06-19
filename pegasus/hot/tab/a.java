package com.bilibili.pegasus.hot.tab;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.lib.sharewrapper.util.SessionManager;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.downloadeshare.DownloadShare;
import tv.danmaku.bili.downloadeshare.DownloadShareParameter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/hot/tab/a.class */
@StabilityInferred(parameters = 1)
public final class a implements tv.danmaku.bili.hottopic.shareUtils.a {
    public final void a(long j7, long j8, @Nullable FragmentActivity fragmentActivity) {
        SessionManager.INSTANCE.generateSessionId();
        DownloadShare downloadShareWith = DownloadShare.Companion.with();
        DownloadShareParameter.Builder builder = new DownloadShareParameter.Builder();
        builder.setAvid(j7).setCid(j8).setSpmid("creation.hot-tab.0.0").setShareId("creation.hot-tab.0.more.click").setShareOrigin("ugc");
        DownloadShare.startDownloadShare$default(downloadShareWith, fragmentActivity, builder.build(), 0, 4, (Object) null);
    }
}
