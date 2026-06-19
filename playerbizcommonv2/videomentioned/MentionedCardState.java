package com.bilibili.playerbizcommonv2.videomentioned;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/MentionedCardState.class */
@StabilityInferred(parameters = 1)
public abstract class MentionedCardState {
    public static final int $stable = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/MentionedCardState$HIDDEN.class */
    @StabilityInferred(parameters = 1)
    public static final class HIDDEN extends MentionedCardState {
        public static final int $stable = 0;

        @NotNull
        public static final HIDDEN INSTANCE = new HIDDEN();

        public HIDDEN() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/MentionedCardState$IDLE.class */
    @StabilityInferred(parameters = 1)
    public static final class IDLE extends MentionedCardState {
        public static final int $stable = 0;

        @NotNull
        public static final IDLE INSTANCE = new IDLE();

        public IDLE() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/MentionedCardState$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a extends MentionedCardState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f81993a;

        public a(boolean z6) {
            super(null);
            this.f81993a = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f81993a == ((a) obj).f81993a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f81993a);
        }

        @NotNull
        public final String toString() {
            return androidx.appcompat.app.i.a(new StringBuilder("SELECTED(didHidden="), this.f81993a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/MentionedCardState$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b extends MentionedCardState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f81994a;

        public b(boolean z6) {
            super(null);
            this.f81994a = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f81994a == ((b) obj).f81994a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f81994a);
        }

        @NotNull
        public final String toString() {
            return androidx.appcompat.app.i.a(new StringBuilder("UNSELECTED(didHidden="), this.f81994a, ")");
        }
    }

    public MentionedCardState() {
    }

    public /* synthetic */ MentionedCardState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
