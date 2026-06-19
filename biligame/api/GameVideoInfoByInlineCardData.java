package com.bilibili.biligame.api;

import androidx.annotation.Keep;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/GameVideoInfoByInlineCardData.class */
@StabilityInferred(parameters = 0)
@Keep
public class GameVideoInfoByInlineCardData extends GameVideoInfo implements IInlineCardData {
    public static final int $stable = 8;

    @NotNull
    private final transient IInlinePlayItem inlinePlayItem = new b(this);

    @NotNull
    private final transient c inlineProperty = new DefaultInlineProperty();

    @NotNull
    private final transient IInlineBehavior inlineBehavior = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/GameVideoInfoByInlineCardData$a.class */
    public static final class a implements IInlineBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GameVideoInfoByInlineCardData f62148a;

        public a(GameVideoInfoByInlineCardData gameVideoInfoByInlineCardData) {
            this.f62148a = gameVideoInfoByInlineCardData;
        }

        public final long getCardAutoPlayDelay() {
            return 0L;
        }

        public final boolean getCardPlayable(boolean z6) {
            return z6 && this.f62148a.isValid();
        }

        public final boolean getReleaseOnEnd() {
            return false;
        }

        public final int getRepeatCount() {
            return -1;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/GameVideoInfoByInlineCardData$b.class */
    public static final class b implements IInlinePlayItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GameVideoInfoByInlineCardData f62149a;

        public b(GameVideoInfoByInlineCardData gameVideoInfoByInlineCardData) {
            this.f62149a = gameVideoInfoByInlineCardData;
        }

        public final CharSequence getInlineLogDescription() {
            return "GameInlineVideo";
        }

        public final Video.PlayableParams getInlinePlayableParams() {
            GamePlayableParams gamePlayableParams = new GamePlayableParams("type_book_version");
            GameVideoInfoByInlineCardData gameVideoInfoByInlineCardData = this.f62149a;
            gamePlayableParams.setAvId(NumUtils.parseLong(gameVideoInfoByInlineCardData.getAvId()));
            String bvId = gameVideoInfoByInlineCardData.getBvId();
            String str = bvId;
            if (bvId == null) {
                str = "";
            }
            gamePlayableParams.setBvId(str);
            gamePlayableParams.setCid(NumUtils.parseLong(gameVideoInfoByInlineCardData.getCid()));
            gamePlayableParams.setPlayStartPosition(gameVideoInfoByInlineCardData.getPlayStartPosition() * 1000);
            gamePlayableParams.setSpmid(gameVideoInfoByInlineCardData.getSpMid());
            gamePlayableParams.setEnablePreload(true);
            return gamePlayableParams;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/GameVideoInfoByInlineCardData$c.class */
    public static final class c extends DefaultInlineProperty {
        public final Priority getPriority() {
            return Priority.NORMAL;
        }
    }

    @NotNull
    public IInlineProperty getCardPlayProperty() {
        return this.inlineProperty;
    }

    @NotNull
    public IInlineBehavior getInlineBehavior() {
        return this.inlineBehavior;
    }

    @NotNull
    public IInlinePlayItem getInlinePlayerItem() {
        return this.inlinePlayItem;
    }

    @Nullable
    public InlineReportParam getInlineReportParams() {
        return null;
    }

    @NotNull
    public String getSpMid() {
        return "game-ball.game-update.0.0";
    }
}
