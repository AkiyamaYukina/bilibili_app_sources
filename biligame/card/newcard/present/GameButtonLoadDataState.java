package com.bilibili.biligame.card.newcard.present;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/newcard/present/GameButtonLoadDataState.class */
public abstract class GameButtonLoadDataState {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/newcard/present/GameButtonLoadDataState$Complete.class */
    public static final class Complete extends GameButtonLoadDataState {

        @NotNull
        public static final Complete INSTANCE = new Complete();

        public Complete() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/newcard/present/GameButtonLoadDataState$Idle.class */
    public static final class Idle extends GameButtonLoadDataState {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        public Idle() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/newcard/present/GameButtonLoadDataState$Loading.class */
    public static final class Loading extends GameButtonLoadDataState {

        @NotNull
        public static final Loading INSTANCE = new Loading();

        public Loading() {
            super(null);
        }
    }

    public GameButtonLoadDataState() {
    }

    public /* synthetic */ GameButtonLoadDataState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
