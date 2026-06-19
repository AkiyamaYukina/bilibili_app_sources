package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.biligame.api.cloudgame.bean.BCGToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/RelateTab.class */
@StabilityInferred(parameters = 0)
public final class RelateTab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f101048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<o0> f101050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ArrayList<RunningUIComponent> f101051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f101052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f101053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f101054g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/RelateTab$RelateTabStatus.class */
    public static final class RelateTabStatus {
        private static final EnumEntries $ENTRIES;
        private static final RelateTabStatus[] $VALUES;
        public static final RelateTabStatus INIT = new RelateTabStatus("INIT", 0);
        public static final RelateTabStatus LOADING = new RelateTabStatus("LOADING", 1);
        public static final RelateTabStatus SUCCESS = new RelateTabStatus(BCGToken.SCHEDULE_STATUS_SUCCESS, 2);
        public static final RelateTabStatus ERROR = new RelateTabStatus("ERROR", 3);
        public static final RelateTabStatus EMPTY = new RelateTabStatus("EMPTY", 4);

        private static final /* synthetic */ RelateTabStatus[] $values() {
            return new RelateTabStatus[]{INIT, LOADING, SUCCESS, ERROR, EMPTY};
        }

        static {
            RelateTabStatus[] relateTabStatusArr$values = $values();
            $VALUES = relateTabStatusArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(relateTabStatusArr$values);
        }

        private RelateTabStatus(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<RelateTabStatus> getEntries() {
            return $ENTRIES;
        }

        public static RelateTabStatus valueOf(String str) {
            return (RelateTabStatus) Enum.valueOf(RelateTabStatus.class, str);
        }

        public static RelateTabStatus[] values() {
            return (RelateTabStatus[]) $VALUES.clone();
        }
    }

    public RelateTab(long j7, @NotNull String str) {
        this.f101048a = j7;
        this.f101049b = str;
        RelateTabStatus relateTabStatus = RelateTabStatus.INIT;
        this.f101050c = new ArrayList();
        this.f101051d = new ArrayList<>();
        this.f101052e = "";
    }
}
