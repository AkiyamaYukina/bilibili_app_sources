package com.bilibili.ogv.operation2.inlinevideo;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.inline.card.CardPlayState;
import com.bilibili.inline.card.IInlineProperty;
import com.bilibili.inline.card.PlayReason;
import com.bilibili.inline.card.Priority;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/BangumiInlineProperty.class */
@StabilityInferred(parameters = 0)
@Keep
public class BangumiInlineProperty implements IInlineProperty {
    public static final int $stable = 8;

    @NotNull
    private CardPlayState state = CardPlayState.IDLE;

    @NotNull
    private PlayReason playReason = PlayReason.INLINE_AUTO_PLAY;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/BangumiInlineProperty$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f70865a;

        static {
            int[] iArr = new int[PlayReason.values().length];
            try {
                iArr[PlayReason.INLINE_AUTO_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PlayReason.INLINE_MANUAL_PLAY.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[PlayReason.INLINE_SCROLL_TO_PLAY.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f70865a = iArr;
        }
    }

    @NotNull
    public PlayReason getPlayReason() {
        return this.playReason;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public Priority getPriority() throws NoWhenBranchMatchedException {
        Priority priority;
        if (getState() != CardPlayState.PLAYING) {
            return Priority.NORMAL;
        }
        int i7 = a.f70865a[getPlayReason().ordinal()];
        if (i7 == 1) {
            priority = Priority.NORMAL;
        } else if (i7 == 2) {
            priority = Priority.MANUAL_PLAYING;
        } else {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            priority = Priority.NORMAL;
        }
        return priority;
    }

    @NotNull
    public CardPlayState getState() {
        return this.state;
    }

    public void resetInlineProperty() {
        setState(CardPlayState.IDLE);
        setPlayReason(PlayReason.INLINE_AUTO_PLAY);
    }

    public void setPlayReason(@NotNull PlayReason playReason) {
        this.playReason = playReason;
    }

    public void setState(@NotNull CardPlayState cardPlayState) {
        this.state = cardPlayState;
    }
}
