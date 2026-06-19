package com.bilibili.biligame.api.bean.discover;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.utils.NumUtils;
import com.bilibili.biligame.video.GamePlayableParams;
import com.bilibili.inline.card.DefaultInlineProperty;
import com.bilibili.inline.card.IInlineBehavior;
import com.bilibili.inline.card.IInlineCardData;
import com.bilibili.inline.card.IInlinePlayItem;
import com.bilibili.inline.card.IInlineProperty;
import com.bilibili.inline.card.Priority;
import com.bilibili.inline.utils.InlineReportParam;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/discover/TopicVpItem.class */
@StabilityInferred(parameters = 0)
public final class TopicVpItem implements IInlineCardData {
    public static final int $stable = 8;

    @Nullable
    private List<ScreenShot> screenShots;

    @Nullable
    private String tabName;
    private int type;

    @Nullable
    private GameTopicVideo videoInfo;

    @NotNull
    private final transient TopicVpItem$inlineProperty$1 inlineProperty = new DefaultInlineProperty() { // from class: com.bilibili.biligame.api.bean.discover.TopicVpItem$inlineProperty$1
        public Priority getPriority() {
            return Priority.NORMAL;
        }
    };

    @NotNull
    private final transient IInlinePlayItem inlinePlayItem = new IInlinePlayItem(this) { // from class: com.bilibili.biligame.api.bean.discover.TopicVpItem$inlinePlayItem$1
        final TopicVpItem this$0;

        {
            this.this$0 = this;
        }

        public CharSequence getInlineLogDescription() {
            return "GameInlineVideo";
        }

        public Video.PlayableParams getInlinePlayableParams() {
            if (this.this$0.getVideoInfo() == null) {
                return null;
            }
            GamePlayableParams gamePlayableParams = new GamePlayableParams("type_topic");
            GameTopicVideo videoInfo = this.this$0.getVideoInfo();
            gamePlayableParams.setAvId(NumUtils.parseLong(videoInfo != null ? videoInfo.getAvId() : null, 0L));
            GameTopicVideo videoInfo2 = this.this$0.getVideoInfo();
            String bvId = videoInfo2 != null ? videoInfo2.getBvId() : null;
            String str = bvId;
            if (bvId == null) {
                str = "";
            }
            gamePlayableParams.setBvId(str);
            GameTopicVideo videoInfo3 = this.this$0.getVideoInfo();
            String cid = null;
            if (videoInfo3 != null) {
                cid = videoInfo3.getCid();
            }
            gamePlayableParams.setCid(NumUtils.parseLong(cid, 0L));
            GameTopicVideo videoInfo4 = this.this$0.getVideoInfo();
            gamePlayableParams.setPlayStartPosition((videoInfo4 != null ? videoInfo4.getStartPlayPosition() : 0) * 1000);
            gamePlayableParams.setSpmid("game-ball.game-theme-page.0.0");
            gamePlayableParams.setEnablePreload(true);
            return gamePlayableParams;
        }
    };

    @NotNull
    private final transient IInlineBehavior mInlineBehavior = new IInlineBehavior(this) { // from class: com.bilibili.biligame.api.bean.discover.TopicVpItem$mInlineBehavior$1
        final TopicVpItem this$0;

        {
            this.this$0 = this;
        }

        public long getCardAutoPlayDelay() {
            return 0L;
        }

        public boolean getCardPlayable(boolean z6) {
            return this.this$0.getVideoInfo() != null && z6;
        }

        public boolean getReleaseOnEnd() {
            return false;
        }

        public int getRepeatCount() {
            return -1;
        }
    };

    @NotNull
    public IInlineProperty getCardPlayProperty() {
        return this.inlineProperty;
    }

    @NotNull
    public IInlineBehavior getInlineBehavior() {
        return this.mInlineBehavior;
    }

    @NotNull
    public IInlinePlayItem getInlinePlayerItem() {
        return this.inlinePlayItem;
    }

    @Nullable
    public InlineReportParam getInlineReportParams() {
        return null;
    }

    @Nullable
    public final List<ScreenShot> getScreenShots() {
        return this.screenShots;
    }

    @Nullable
    public final String getTabName() {
        return this.tabName;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final GameTopicVideo getVideoInfo() {
        return this.videoInfo;
    }

    public final void setScreenShots(@Nullable List<ScreenShot> list) {
        this.screenShots = list;
    }

    public final void setTabName(@Nullable String str) {
        this.tabName = str;
    }

    public final void setType(int i7) {
        this.type = i7;
    }

    public final void setVideoInfo(@Nullable GameTopicVideo gameTopicVideo) {
        this.videoInfo = gameTopicVideo;
    }
}
