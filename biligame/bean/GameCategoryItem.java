package com.bilibili.biligame.bean;

import G0.b;
import G0.d;
import androidx.annotation.Keep;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.util.C4638g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/GameCategoryItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameCategoryItem {
    public static final int $stable = 8;
    private boolean allChoice;
    private boolean choice;
    private long id;
    private boolean multiChoice;

    @Nullable
    private String name;
    private boolean smallGame;

    @Nullable
    private String title;

    @Nullable
    private String type;

    public GameCategoryItem() {
        this(null, null, 0L, null, false, false, false, false, 255, null);
    }

    public GameCategoryItem(@Nullable String str, @Nullable String str2, long j7, @Nullable String str3, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.type = str;
        this.title = str2;
        this.id = j7;
        this.name = str3;
        this.choice = z6;
        this.multiChoice = z7;
        this.allChoice = z8;
        this.smallGame = z9;
    }

    public /* synthetic */ GameCategoryItem(String str, String str2, long j7, String str3, boolean z6, boolean z7, boolean z8, boolean z9, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? 0L : j7, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? false : z6, (i7 & 32) != 0 ? false : z7, (i7 & 64) != 0 ? false : z8, (i7 & 128) != 0 ? false : z9);
    }

    public static /* synthetic */ GameCategoryItem copy$default(GameCategoryItem gameCategoryItem, String str, String str2, long j7, String str3, boolean z6, boolean z7, boolean z8, boolean z9, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = gameCategoryItem.type;
        }
        if ((i7 & 2) != 0) {
            str2 = gameCategoryItem.title;
        }
        if ((i7 & 4) != 0) {
            j7 = gameCategoryItem.id;
        }
        if ((i7 & 8) != 0) {
            str3 = gameCategoryItem.name;
        }
        if ((i7 & 16) != 0) {
            z6 = gameCategoryItem.choice;
        }
        if ((i7 & 32) != 0) {
            z7 = gameCategoryItem.multiChoice;
        }
        if ((i7 & 64) != 0) {
            z8 = gameCategoryItem.allChoice;
        }
        if ((i7 & 128) != 0) {
            z9 = gameCategoryItem.smallGame;
        }
        return gameCategoryItem.copy(str, str2, j7, str3, z6, z7, z8, z9);
    }

    @Nullable
    public final String component1() {
        return this.type;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    public final long component3() {
        return this.id;
    }

    @Nullable
    public final String component4() {
        return this.name;
    }

    public final boolean component5() {
        return this.choice;
    }

    public final boolean component6() {
        return this.multiChoice;
    }

    public final boolean component7() {
        return this.allChoice;
    }

    public final boolean component8() {
        return this.smallGame;
    }

    @NotNull
    public final GameCategoryItem copy(@Nullable String str, @Nullable String str2, long j7, @Nullable String str3, boolean z6, boolean z7, boolean z8, boolean z9) {
        return new GameCategoryItem(str, str2, j7, str3, z6, z7, z8, z9);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameCategoryItem)) {
            return false;
        }
        GameCategoryItem gameCategoryItem = (GameCategoryItem) obj;
        return Intrinsics.areEqual(this.type, gameCategoryItem.type) && Intrinsics.areEqual(this.title, gameCategoryItem.title) && this.id == gameCategoryItem.id && Intrinsics.areEqual(this.name, gameCategoryItem.name) && this.choice == gameCategoryItem.choice && this.multiChoice == gameCategoryItem.multiChoice && this.allChoice == gameCategoryItem.allChoice && this.smallGame == gameCategoryItem.smallGame;
    }

    public final boolean getAllChoice() {
        return this.allChoice;
    }

    public final boolean getChoice() {
        return this.choice;
    }

    public final long getId() {
        return this.id;
    }

    public final boolean getMultiChoice() {
        return this.multiChoice;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final boolean getSmallGame() {
        return this.smallGame;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        int iA = C3554n0.a(((iHashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.id);
        String str3 = this.name;
        return Boolean.hashCode(this.smallGame) + z.a(z.a(z.a((iA + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.choice), 31, this.multiChoice), 31, this.allChoice);
    }

    public final void setAllChoice(boolean z6) {
        this.allChoice = z6;
    }

    public final void setChoice(boolean z6) {
        this.choice = z6;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setMultiChoice(boolean z6) {
        this.multiChoice = z6;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSmallGame(boolean z6) {
        this.smallGame = z6;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.title;
        long j7 = this.id;
        String str3 = this.name;
        boolean z6 = this.choice;
        boolean z7 = this.multiChoice;
        boolean z8 = this.allChoice;
        boolean z9 = this.smallGame;
        StringBuilder sbA = b.a("GameCategoryItem(type=", str, ", title=", str2, ", id=");
        d.a(j7, ", name=", str3, sbA);
        C4638g.b(", choice=", ", multiChoice=", sbA, z6, z7);
        C4638g.b(", allChoice=", ", smallGame=", sbA, z8, z9);
        sbA.append(")");
        return sbA.toString();
    }
}
