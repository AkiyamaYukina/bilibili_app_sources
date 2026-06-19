package com.bilibili.music.podcast.view;

import com.google.android.material.appbar.AppBarLayout;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicAppBarStateChangeListener.class */
public abstract class MusicAppBarStateChangeListener implements AppBarLayout.OnOffsetChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public State f67053a = State.IDLE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicAppBarStateChangeListener$State.class */
    public static final class State {
        private static final EnumEntries $ENTRIES;
        private static final State[] $VALUES;
        public static final State EXPANDED = new State("EXPANDED", 0);
        public static final State COLLAPSED = new State("COLLAPSED", 1);
        public static final State IDLE = new State("IDLE", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{EXPANDED, COLLAPSED, IDLE};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(stateArr$values);
        }

        private State(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public abstract void a(@Nullable State state);

    public void onOffsetChanged(@Nullable AppBarLayout appBarLayout, int i7) {
        if (i7 == 0) {
            State state = this.f67053a;
            State state2 = State.EXPANDED;
            if (state != state2) {
                a(state2);
            }
            this.f67053a = state2;
            return;
        }
        if (Math.abs(i7) >= (appBarLayout != null ? appBarLayout.getTotalScrollRange() : 0)) {
            State state3 = this.f67053a;
            State state4 = State.COLLAPSED;
            if (state3 != state4) {
                a(state4);
            }
            this.f67053a = state4;
            return;
        }
        State state5 = this.f67053a;
        State state6 = State.IDLE;
        if (state5 != state6) {
            a(state6);
        }
        this.f67053a = state6;
    }
}
