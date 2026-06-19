package com.bilibili.ship.theseus.ogv.media;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alipay.sdk.app.PayTask;
import javax.inject.Inject;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/OgvEpStartToastService.class */
@StabilityInferred(parameters = 0)
public final class OgvEpStartToastService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IToastService f93982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IReporterService f93983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.bridge.b f93984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f93985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f93986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f93987f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/OgvEpStartToastService$ActionType.class */
    public static final class ActionType {
        private static final EnumEntries $ENTRIES;
        private static final ActionType[] $VALUES;
        public static final ActionType SEEK = new ActionType("SEEK", 0);
        public static final ActionType SWITCH = new ActionType("SWITCH", 1);

        private static final /* synthetic */ ActionType[] $values() {
            return new ActionType[]{SEEK, SWITCH};
        }

        static {
            ActionType[] actionTypeArr$values = $values();
            $VALUES = actionTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(actionTypeArr$values);
        }

        private ActionType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<ActionType> getEntries() {
            return $ENTRIES;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/OgvEpStartToastService$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final uk.b f93988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ActionType f93989b;

        public a(@Nullable uk.b bVar, @NotNull ActionType actionType) {
            this.f93988a = bVar;
            this.f93989b = actionType;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f93988a, aVar.f93988a) && this.f93989b == aVar.f93989b;
        }

        public final int hashCode() {
            uk.b bVar = this.f93988a;
            return this.f93989b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
        }

        @NotNull
        public final String toString() {
            return "HistoryBizParams(historyInfo=" + this.f93988a + ", actionType=" + this.f93989b + ")";
        }
    }

    @Inject
    public OgvEpStartToastService(@NotNull IToastService iToastService, @NotNull IReporterService iReporterService, @NotNull com.bilibili.ship.theseus.ogv.bridge.b bVar, @NotNull Context context, boolean z6, @NotNull CoroutineScope coroutineScope) {
        this.f93982a = iToastService;
        this.f93983b = iReporterService;
        this.f93984c = bVar;
        this.f93985d = context;
        this.f93986e = z6;
        this.f93987f = coroutineScope;
    }

    public static PlayerToast a(String str) {
        return new PlayerToast.Builder().toastItemType(17).location(32).setExtraString("extra_title", str).duration(PayTask.f60018j).build();
    }
}
