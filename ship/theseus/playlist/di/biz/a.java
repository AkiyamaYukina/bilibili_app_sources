package com.bilibili.ship.theseus.playlist.di.biz;

import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.projection.commonburid.CastContentType;
import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.api.OgvInfo;
import com.bilibili.ship.theseus.playlist.api.PugvInfo;
import com.bilibili.ship.theseus.playlist.util.f;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mv0.C8043a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/a.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata({"com.bilibili.ship.theseus.united.page.castscreen.CastScreenItems"})
public final class a implements Factory<List<ProjectionItemData>> {
    public static List<ProjectionItemData> a(PlaylistRepository playlistRepository) {
        playlistRepository.getClass();
        ArrayList arrayList = new ArrayList();
        if (!playlistRepository.f95092O) {
            Iterator it = playlistRepository.d().iterator();
            while (it.hasNext()) {
                MultiTypeMedia multiTypeMedia = (MultiTypeMedia) it.next();
                BiliAccounts biliAccounts = f.f96126a;
                Iterator it2 = it;
                if (f.a.a(multiTypeMedia, null) instanceof PlaylistRepository.d.i) {
                    boolean zBooleanValue = ((Boolean) com.bilibili.ship.theseus.united.page.castscreen.e.f99147a.getValue()).booleanValue();
                    int i7 = playlistRepository.f95087J;
                    long j7 = multiTypeMedia.f95235i;
                    PlaylistRepository.a aVar = playlistRepository.f95097d;
                    C8043a c8043a = playlistRepository.f95095b;
                    String str = multiTypeMedia.f95237k;
                    String str2 = multiTypeMedia.f95247u;
                    if (!zBooleanValue) {
                        Iterator it3 = it;
                        if (multiTypeMedia.t()) {
                            OgvInfo ogvInfoJ = multiTypeMedia.j();
                            long j8 = ogvInfoJ != null ? ogvInfoJ.f95254a : 0L;
                            String strF = multiTypeMedia.f();
                            OgvInfo ogvInfoJ2 = multiTypeMedia.j();
                            long j9 = ogvInfoJ2 != null ? ogvInfoJ2.f95255b : 0L;
                            OgvInfo ogvInfoJ3 = multiTypeMedia.j();
                            long j10 = ogvInfoJ3 != null ? ogvInfoJ3.f95257d : 0L;
                            OgvInfo ogvInfoJ4 = multiTypeMedia.j();
                            arrayList.add(new ProjectionItemData(5, j8, strF, j9, j10, ogvInfoJ4 != null ? ogvInfoJ4.f95256c : 0L, 0L, c8043a.a().f123881c, c8043a.a().f123880b, B0.a.a(str2, "-", str), playlistRepository.h(i7, 24, j7), 1, playlistRepository.f95087J, playlistRepository.f95085H, multiTypeMedia.f95235i, PlaylistRepository.g(playlistRepository.f(), aVar.f95124f), 1, 24, null, CastContentType.CastContentTypePGC));
                            it = it3;
                        } else if (multiTypeMedia.u()) {
                            long jD = multiTypeMedia.d();
                            String strF2 = multiTypeMedia.f();
                            PugvInfo pugvInfoM = multiTypeMedia.m();
                            long j11 = pugvInfoM != null ? pugvInfoM.f95291b : 0L;
                            PugvInfo pugvInfoM2 = multiTypeMedia.m();
                            long j12 = pugvInfoM2 != null ? pugvInfoM2.f95293d : 0L;
                            PugvInfo pugvInfoM3 = multiTypeMedia.m();
                            arrayList.add(new ProjectionItemData(5, jD, strF2, j11, j12, pugvInfoM3 != null ? pugvInfoM3.f95292c : 0L, 0L, c8043a.a().f123881c, c8043a.a().f123880b, multiTypeMedia.f95247u, playlistRepository.h(i7, 2, j7), 1, playlistRepository.f95087J, playlistRepository.f95085H, multiTypeMedia.f95235i, PlaylistRepository.g(playlistRepository.f(), aVar.f95124f), 1, 3, null, CastContentType.CastContentTypePGC));
                            it = it3;
                        } else {
                            Iterator<T> it4 = multiTypeMedia.f95225M.iterator();
                            while (true) {
                                it = it3;
                                if (it4.hasNext()) {
                                    Ou0.c cVar = (Ou0.c) it4.next();
                                    arrayList.add(new ProjectionItemData(5, multiTypeMedia.d(), multiTypeMedia.f(), cVar.f18089b, 0L, 0L, 0L, c8043a.a().f123881c, c8043a.a().f123880b, multiTypeMedia.f95225M.size() == 1 ? str2 : cVar.f18096j, playlistRepository.h(i7, 2, j7), 1, playlistRepository.f95087J, playlistRepository.f95085H, multiTypeMedia.f95235i, PlaylistRepository.g(playlistRepository.f(), aVar.f95124f), 1, 2, null, CastContentType.CastContentTypeUGC));
                                }
                            }
                        }
                    } else if (!multiTypeMedia.t()) {
                        if (!multiTypeMedia.u()) {
                            Iterator<T> it5 = multiTypeMedia.f95225M.iterator();
                            while (true) {
                                it2 = it;
                                if (!it5.hasNext()) {
                                    break;
                                }
                                Ou0.c cVar2 = (Ou0.c) it5.next();
                                arrayList.add(new ProjectionItemData(5, multiTypeMedia.d(), multiTypeMedia.f(), cVar2.f18089b, 0L, 0L, 0L, c8043a.a().f123881c, c8043a.a().f123880b, multiTypeMedia.f95225M.size() == 1 ? str2 : cVar2.f18096j, playlistRepository.h(i7, 2, j7), 1, playlistRepository.f95087J, playlistRepository.f95085H, multiTypeMedia.f95235i, PlaylistRepository.g(playlistRepository.f(), aVar.f95124f), 1, 2, null, CastContentType.CastContentTypeUGC));
                            }
                        } else {
                            long jD2 = multiTypeMedia.d();
                            String strF3 = multiTypeMedia.f();
                            PugvInfo pugvInfoM4 = multiTypeMedia.m();
                            long j13 = pugvInfoM4 != null ? pugvInfoM4.f95291b : 0L;
                            PugvInfo pugvInfoM5 = multiTypeMedia.m();
                            long j14 = pugvInfoM5 != null ? pugvInfoM5.f95293d : 0L;
                            PugvInfo pugvInfoM6 = multiTypeMedia.m();
                            arrayList.add(new ProjectionItemData(5, jD2, strF3, j13, j14, pugvInfoM6 != null ? pugvInfoM6.f95292c : 0L, 0L, c8043a.a().f123881c, c8043a.a().f123880b, multiTypeMedia.f95247u, playlistRepository.h(i7, 2, j7), 1, playlistRepository.f95087J, playlistRepository.f95085H, multiTypeMedia.f95235i, PlaylistRepository.g(playlistRepository.f(), aVar.f95124f), 1, 3, null, CastContentType.CastContentTypePGC));
                            it2 = it;
                        }
                    } else {
                        OgvInfo ogvInfoJ5 = multiTypeMedia.j();
                        long j15 = ogvInfoJ5 != null ? ogvInfoJ5.f95254a : 0L;
                        String strF4 = multiTypeMedia.f();
                        OgvInfo ogvInfoJ6 = multiTypeMedia.j();
                        long j16 = ogvInfoJ6 != null ? ogvInfoJ6.f95255b : 0L;
                        OgvInfo ogvInfoJ7 = multiTypeMedia.j();
                        long j17 = ogvInfoJ7 != null ? ogvInfoJ7.f95257d : 0L;
                        OgvInfo ogvInfoJ8 = multiTypeMedia.j();
                        arrayList.add(new ProjectionItemData(5, j15, strF4, j16, j17, ogvInfoJ8 != null ? ogvInfoJ8.f95256c : 0L, 0L, c8043a.a().f123881c, c8043a.a().f123880b, B0.a.a(str2, "-", str), playlistRepository.h(i7, 24, j7), 1, playlistRepository.f95087J, playlistRepository.f95085H, multiTypeMedia.f95235i, PlaylistRepository.g(playlistRepository.f(), aVar.f95124f), 1, 24, null, CastContentType.CastContentTypePGC));
                        it2 = it;
                    }
                }
                it = it2;
            }
        }
        return (List) Preconditions.checkNotNullFromProvides(arrayList);
    }
}
