package com.bilibili.ship.theseus.ogv.media;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.pgcanymodel.PGCAnyModel;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.pgc.gateway.player.v2.InlineType;
import com.bilibili.lib.moss.util.any.AnyKt;
import com.bilibili.ship.theseus.united.player.mediaplay.SinglePlayViewDriver;
import com.google.protobuf.Any;
import java.util.Map;
import javax.inject.Inject;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/g.class */
@StabilityInferred(parameters = 0)
public final class g implements com.bilibili.ship.theseus.united.player.mediaplay.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f94015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f94016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.pub.season.a f94017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final yW0.b f94018d;

    @Inject
    public g(long j7, long j8, @NotNull com.bilibili.ogv.pub.season.a aVar, @NotNull yW0.b bVar) {
        this.f94015a = j7;
        this.f94016b = j8;
        this.f94017c = aVar;
        this.f94018d = bVar;
    }

    @Override // com.bilibili.ship.theseus.united.player.mediaplay.a
    @NotNull
    public final Map<String, String> a() {
        PlayViewUniteReply playViewUniteReply = (PlayViewUniteReply) ((SinglePlayViewDriver) this.f94018d.get()).f104510e.getValue();
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("epid", String.valueOf(this.f94015a));
        mapCreateMapBuilder.put("season_id", String.valueOf(this.f94016b));
        mapCreateMapBuilder.put("season_type", String.valueOf(this.f94017c.f71782a));
        if (playViewUniteReply != null) {
            Any supplement = playViewUniteReply.getSupplement();
            PGCAnyModel defaultInstance = !StringsKt.w(supplement.getTypeUrl(), "bilibili.app.playerunite.pgcanymodel.PGCAnyModel") ? PGCAnyModel.getDefaultInstance() : AnyKt.unpackSansTypeUrl(supplement, PGCAnyModel.class);
            boolean isDrm = defaultInstance.getBusiness().getIsDrm();
            if (defaultInstance.getBusiness().getInlineType() == InlineType.TYPE_WHOLE && isDrm) {
                mapCreateMapBuilder.put("force_report", "1");
                mapCreateMapBuilder.put("is_drm_resource", "1");
            }
        }
        return MapsKt.build(mapCreateMapBuilder);
    }
}
