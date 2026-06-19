package com.bilibili.ship.theseus.ogv.report;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.framework.exposure.core.ExposureLayoutInfoReceiver;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/report/ExposureEntryRecordService.class */
@StabilityInferred(parameters = 0)
public final class ExposureEntryRecordService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<OgvEpisode, a> f94390b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<OgvEpisode, a> f94391c = new HashMap();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/report/ExposureEntryRecordService$EpisodePageFrom.class */
    public static final class EpisodePageFrom {
        private static final EnumEntries $ENTRIES;
        private static final EpisodePageFrom[] $VALUES;
        public static final EpisodePageFrom MODULE_EPISODE = new EpisodePageFrom("MODULE_EPISODE", 0);
        public static final EpisodePageFrom FLOAT_EPISODE = new EpisodePageFrom("FLOAT_EPISODE", 1);

        private static final /* synthetic */ EpisodePageFrom[] $values() {
            return new EpisodePageFrom[]{MODULE_EPISODE, FLOAT_EPISODE};
        }

        static {
            EpisodePageFrom[] episodePageFromArr$values = $values();
            $VALUES = episodePageFromArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(episodePageFromArr$values);
        }

        private EpisodePageFrom(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<EpisodePageFrom> getEntries() {
            return $ENTRIES;
        }

        public static EpisodePageFrom valueOf(String str) {
            return (EpisodePageFrom) Enum.valueOf(EpisodePageFrom.class, str);
        }

        public static EpisodePageFrom[] values() {
            return (EpisodePageFrom[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/report/ExposureEntryRecordService$a.class */
    public interface a extends ExposureLayoutInfoReceiver {
        @Nullable
        Object a(@NotNull ContinuationImpl continuationImpl);
    }

    @Inject
    public ExposureEntryRecordService(@NotNull CoroutineScope coroutineScope) {
        this.f94389a = coroutineScope;
    }

    @NotNull
    public final a a(@NotNull EpisodePageFrom episodePageFrom, @NotNull OgvEpisode ogvEpisode, @NotNull com.bilibili.ship.theseus.ogv.report.a aVar) {
        a aVar2;
        EpisodePageFrom episodePageFrom2 = EpisodePageFrom.MODULE_EPISODE;
        Map<OgvEpisode, a> map = episodePageFrom == episodePageFrom2 ? this.f94390b : this.f94391c;
        a aVar3 = map.get(ogvEpisode);
        if (aVar3 == null) {
            map.put(ogvEpisode, aVar);
            aVar2 = aVar;
        } else {
            aVar2 = aVar3;
        }
        a aVar4 = aVar2;
        a aVar5 = episodePageFrom == episodePageFrom2 ? (a) ((HashMap) this.f94391c).get(ogvEpisode) : (a) ((HashMap) this.f94390b).get(ogvEpisode);
        if (aVar5 != null) {
            BuildersKt.launch$default(this.f94389a, (CoroutineContext) null, (CoroutineStart) null, new ExposureEntryRecordService$getOrPutEpisodeExposureEntry$1(aVar4, aVar5, null), 3, (Object) null);
        } else {
            BuildersKt.launch$default(this.f94389a, (CoroutineContext) null, (CoroutineStart) null, new ExposureEntryRecordService$getOrPutEpisodeExposureEntry$2(aVar4, null), 3, (Object) null);
        }
        return aVar4;
    }
}
