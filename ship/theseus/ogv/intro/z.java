package com.bilibili.ship.theseus.ogv.intro;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.common.SectionData;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.google.gson.reflect.TypeToken;
import dagger.Module;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/z.class */
@StabilityInferred(parameters = 1)
@Module(includes = {nv0.t.class, nv0.c.class, nv0.j.class, nv0.r.class, nv0.e.class, nv0.w.class})
public final class z {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/z$a.class */
    public static final class a extends TypeToken<EpisodeSection> {
    }

    @NotNull
    public static Hu0.c a(@NotNull SectionData sectionData) {
        EpisodeSection episodeSection = (EpisodeSection) JsonUtilKt.parseJson(Pj0.e.a(sectionData), new a().getType());
        int i7 = 0;
        for (Object obj : episodeSection.h) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            OgvEpisode ogvEpisode = (OgvEpisode) obj;
            ogvEpisode.f93553I = i7;
            ogvEpisode.f93554J = episodeSection.f93527e;
            i7++;
        }
        return new Hu0.c(new Hu0.d(episodeSection.f93524b, episodeSection.f93523a, episodeSection.d()), episodeSection);
    }
}
