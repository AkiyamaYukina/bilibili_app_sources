package com.bilibili.ogvcommon.play.resolver;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.k;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.media.resolver.exception.ResolveException;
import com.bilibili.lib.media.resolver2.IMediaResolverV2;
import com.bilibili.lib.media.resolver2.IResolveParams;
import com.bilibili.lib.media.resource.DashMediaIndex;
import com.bilibili.lib.media.resource.DashResource;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.lib.media.resource.VodIndex;
import com.bilibili.studio.material.util.UtilsKt;
import di0.InterfaceC6815b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.video.resolver.OGVResolverParams;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/OgvResolver.class */
@StabilityInferred(parameters = 1)
@Keep
public final class OgvResolver implements IMediaResolverV2 {
    public static final int $stable = 0;

    @NotNull
    public static final a Companion = new Object();
    public static final int DOWNLOAD_TYPE_DASH = 2;
    public static final int DOWNLOAD_TYPE_UNDOWNLOAD = 0;
    public static final int FORCE_HOST_VALUE_HTTPS = 2;
    public static final int FORCE_HOST_VALUE_NO = 0;
    public static final int TEENAGER_MODE_OFF = 0;
    public static final int TEENAGER_MODE_ON = 1;

    @NotNull
    public static final String TYPE_TAG_BD_POSTFIX = "bd";

    @NotNull
    private final String resolveType = "bangumi";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/OgvResolver$a.class */
    public static final class a {
    }

    @NotNull
    public String getResolveType() {
        return this.resolveType;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.lib.media.resolver.exception.ResolveException */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, java.util.Comparator] */
    @Nullable
    public MediaResource resolveMediaResource(@NotNull Context context, @NotNull IResolveParams iResolveParams) throws Throwable {
        MediaResource mediaResourceC;
        ArrayList arrayList;
        PlayIndex playIndex;
        int i7;
        List<DashMediaIndex> listD;
        List<DashMediaIndex> listD2;
        Object next;
        VodIndex vodIndex;
        ArrayList arrayList2;
        PlayIndex playIndex2;
        PlayIndex playIndex3;
        ArrayList arrayList3;
        int i8;
        Object next2;
        PlayIndex playIndex4;
        if (!(iResolveParams instanceof OGVResolverParams)) {
            throw new ResolveException("Unrecognized param " + iResolveParams + UtilsKt.DOT);
        }
        OGVResolverParams oGVResolverParams = (OGVResolverParams) iResolveParams;
        if (oGVResolverParams.f <= 0) {
            throw new ResolveException(k.a(oGVResolverParams.f, "Invalid cid ", UtilsKt.DOT));
        }
        if (oGVResolverParams.v) {
            InterfaceC6815b interfaceC6815b = (InterfaceC6815b) com.bilibili.ad.adview.story.c.a(BLRouter.INSTANCE, InterfaceC6815b.class, (String) null, 1, (Object) null);
            Object objC = interfaceC6815b != null ? InterfaceC6815b.c(interfaceC6815b, context, oGVResolverParams.n, Long.valueOf(oGVResolverParams.f), Integer.valueOf(oGVResolverParams.u), Long.valueOf(oGVResolverParams.d), String.valueOf(oGVResolverParams.e), "bangumi", 128) : null;
            MediaResource mediaResource = objC instanceof MediaResource ? (MediaResource) objC : null;
            MediaResource mediaResourceC2 = OgvResolveImpl.c(oGVResolverParams);
            MediaResource mediaResource2 = mediaResource;
            if (mediaResourceC2 != null) {
                int i9 = oGVResolverParams.c;
                int i10 = 0;
                if ((mediaResource == null || (playIndex4 = mediaResource.getPlayIndex()) == null || playIndex4.mQuality != i9) && i9 != -1) {
                    int resolvedIndex = mediaResourceC2.getResolvedIndex();
                    ArrayList arrayList4 = mediaResourceC2.mVodIndex.mVodList;
                    Integer numValueOf = (arrayList4 == null || (playIndex2 = (PlayIndex) CollectionsKt.getOrNull(arrayList4, resolvedIndex)) == null) ? null : Integer.valueOf(playIndex2.mQuality);
                    PlayIndex playIndex5 = (mediaResource == null || (vodIndex = mediaResource.mVodIndex) == null || (arrayList2 = vodIndex.mVodList) == null) ? null : (PlayIndex) CollectionsKt.getOrNull(arrayList2, mediaResource != null ? mediaResource.getResolvedIndex() : 0);
                    ArrayList arrayList5 = mediaResourceC2.mVodIndex.mVodList;
                    if (arrayList5 != null) {
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it = arrayList5.iterator();
                        while (true) {
                            arrayList = arrayList6;
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next3 = it.next();
                            PlayIndex playIndex6 = (PlayIndex) next3;
                            if (playIndex5 == null || playIndex6.mQuality != playIndex5.mQuality) {
                                arrayList6.add(next3);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    ArrayList arrayList7 = mediaResourceC2.mVodIndex.mVodList;
                    if (arrayList7 != null) {
                        Iterator it2 = arrayList7.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            PlayIndex playIndex7 = (PlayIndex) next;
                            if (playIndex5 != null && playIndex7.mQuality == playIndex5.mQuality) {
                                break;
                            }
                        }
                        playIndex = (PlayIndex) next;
                    } else {
                        playIndex = null;
                    }
                    String str = playIndex5 != null ? playIndex5.mDescription : null;
                    if ((str == null || str.length() == 0) && playIndex5 != null) {
                        playIndex5.mDescription = playIndex != null ? playIndex.mDescription : null;
                    }
                    if (arrayList != null) {
                        arrayList.add(playIndex5);
                        if (arrayList.size() > 1) {
                            CollectionsKt.sortWith(arrayList, (Comparator) new Object());
                        }
                        ArrayList arrayList8 = mediaResourceC2.mVodIndex.mVodList;
                        if (arrayList8 != null) {
                            arrayList8.clear();
                        }
                        ArrayList arrayList9 = mediaResourceC2.mVodIndex.mVodList;
                        if (arrayList9 != null) {
                            arrayList9.addAll(arrayList);
                        }
                    }
                    DashResource dashResource = mediaResourceC2.getDashResource();
                    if (dashResource != null) {
                        DashResource dashResource2 = mediaResource != null ? mediaResource.getDashResource() : null;
                        if (dashResource2 != null) {
                            List list = dashResource.a;
                            if (list != null && (listD2 = OgvResolveImpl.d(list, dashResource2.a)) != null) {
                                dashResource.a = CollectionsKt.toMutableList(listD2);
                            }
                            List list2 = dashResource.b;
                            if (list2 != null && (listD = OgvResolveImpl.d(list2, dashResource2.b)) != null) {
                                dashResource.b = CollectionsKt.toMutableList(listD);
                            }
                        }
                    }
                    ArrayList arrayList10 = mediaResourceC2.mVodIndex.mVodList;
                    Integer numValueOf2 = null;
                    if (arrayList10 != null) {
                        Iterator it3 = arrayList10.iterator();
                        int i11 = 0;
                        while (true) {
                            i7 = -1;
                            if (!it3.hasNext()) {
                                break;
                            }
                            int i12 = ((PlayIndex) it3.next()).mQuality;
                            if (numValueOf != null && i12 == numValueOf.intValue()) {
                                i7 = i11;
                                break;
                            }
                            i11++;
                        }
                        numValueOf2 = null;
                        if (i7 >= 0) {
                            numValueOf2 = Integer.valueOf(i7);
                        }
                    }
                    if (numValueOf2 != null) {
                        mediaResourceC2.setResolvedIndex(numValueOf2.intValue());
                    }
                    mediaResource2 = mediaResourceC2;
                } else {
                    mediaResource2 = mediaResource;
                    if (mediaResource != null) {
                        int resolvedIndex2 = mediaResource.getResolvedIndex();
                        ArrayList arrayList11 = mediaResource.mVodIndex.mVodList;
                        PlayIndex playIndex8 = arrayList11 != null ? (PlayIndex) CollectionsKt.getOrNull(arrayList11, resolvedIndex2) : null;
                        Integer numValueOf3 = playIndex8 != null ? Integer.valueOf(playIndex8.mQuality) : null;
                        ArrayList arrayList12 = mediaResourceC2.mVodIndex.mVodList;
                        if (arrayList12 != null) {
                            Iterator it4 = arrayList12.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it4.next();
                                int i13 = ((PlayIndex) next2).mQuality;
                                if (numValueOf3 != null && i13 == numValueOf3.intValue()) {
                                    break;
                                }
                            }
                            playIndex3 = (PlayIndex) next2;
                        } else {
                            playIndex3 = null;
                        }
                        String str2 = playIndex8 != null ? playIndex8.mDescription : null;
                        if ((str2 == null || str2.length() == 0) && playIndex8 != null) {
                            playIndex8.mDescription = playIndex3 != null ? playIndex3.mDescription : null;
                        }
                        mediaResource.setExtraInfo(mediaResourceC2.getExtraInfo());
                        if (mediaResource.getPlayConfig() == null) {
                            mediaResource.setPlayConfig(mediaResourceC2.getPlayConfig());
                        }
                        ArrayList arrayList13 = mediaResourceC2.mVodIndex.mVodList;
                        if (arrayList13 != null) {
                            ArrayList arrayList14 = new ArrayList();
                            Iterator it5 = arrayList13.iterator();
                            while (true) {
                                arrayList3 = arrayList14;
                                if (!it5.hasNext()) {
                                    break;
                                }
                                Object next4 = it5.next();
                                int i14 = ((PlayIndex) next4).mQuality;
                                if (numValueOf3 == null || i14 != numValueOf3.intValue()) {
                                    arrayList14.add(next4);
                                }
                            }
                        } else {
                            arrayList3 = null;
                        }
                        if (arrayList3 != null) {
                            ArrayList arrayList15 = mediaResource.mVodIndex.mVodList;
                            if (arrayList15 != null) {
                                arrayList15.addAll(arrayList3);
                            }
                            ArrayList arrayList16 = mediaResource.mVodIndex.mVodList;
                            if (arrayList16 != null && arrayList16.size() > 1) {
                                CollectionsKt.sortWith(arrayList16, (Comparator) new Object());
                            }
                        }
                        ArrayList arrayList17 = mediaResource.mVodIndex.mVodList;
                        Integer numValueOf4 = null;
                        if (arrayList17 != null) {
                            Iterator it6 = arrayList17.iterator();
                            while (true) {
                                i8 = -1;
                                if (!it6.hasNext()) {
                                    break;
                                }
                                int i15 = ((PlayIndex) it6.next()).mQuality;
                                if (numValueOf3 != null && i15 == numValueOf3.intValue()) {
                                    i8 = i10;
                                    break;
                                }
                                i10++;
                            }
                            numValueOf4 = Integer.valueOf(i8);
                        }
                        mediaResource2 = mediaResource;
                        if (numValueOf4 != null) {
                            mediaResource.setResolvedIndex(numValueOf4.intValue());
                            mediaResource2 = mediaResource;
                        }
                    }
                }
            }
            mediaResourceC = mediaResource2;
            if (mediaResource2 != null) {
                mediaResource2.sourceForm(3);
                mediaResourceC = mediaResource2;
            }
        } else {
            mediaResourceC = OgvResolveImpl.c(oGVResolverParams);
        }
        return mediaResourceC;
    }
}
