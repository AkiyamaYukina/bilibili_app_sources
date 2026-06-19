package com.bilibili.studio.editor.moudle.aistory.step;

import android.content.Context;
import com.bilibili.live.streaming.LiveConstants;
import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryBean;
import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryTtsBean;
import com.bilibili.studio.editor.moudle.aistory.match.AIStoryMatchPolicy;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.StringTokenizer;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/step/i.class */
public final class i extends m {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/step/i$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f105763a;

        static {
            int[] iArr = new int[AIStoryMatchPolicy.values().length];
            try {
                iArr[AIStoryMatchPolicy.Image.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[AIStoryMatchPolicy.Video.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f105763a = iArr;
        }
    }

    @Override // com.bilibili.studio.editor.moudle.aistory.step.n
    public final int a() {
        return 5;
    }

    /* JADX WARN: Type inference failed for: r1v191, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v231, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v263, types: [java.lang.Object, java.util.Comparator] */
    @Override // com.bilibili.studio.editor.moudle.aistory.step.n
    @Nullable
    public final Object b(@NotNull Context context, @NotNull AIStoryBean aIStoryBean, @NotNull com.bilibili.studio.editor.moudle.aistory.a aVar, @NotNull Continuation continuation) {
        ArrayList arrayList;
        String filePath;
        Object next;
        List<Qw0.a> list;
        String filePath2;
        int i7;
        Qw0.a aVar2;
        Object next2;
        long j7;
        long j8;
        long j9;
        long j10;
        Qw0.a aVar3;
        Long lValueOf;
        Long lValueOf2;
        String filePath3;
        String filePath4;
        Qw0.a aVar4;
        String filterKeyword;
        Object objEmptyList;
        String keyword;
        List<AIStoryTtsBean> ttsPathList = aIStoryBean.getTtsPathList();
        if (ttsPathList != null) {
            List<AIStoryTtsBean> list2 = ttsPathList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (true) {
                arrayList = arrayList2;
                if (!it.hasNext()) {
                    break;
                }
                AIStoryTtsBean aIStoryTtsBean = (AIStoryTtsBean) it.next();
                Qw0.b bVar = new Qw0.b();
                String sentence = aIStoryTtsBean.getSentence();
                String str = sentence;
                if (sentence == null) {
                    str = "";
                }
                bVar.f20226b = str;
                bVar.f20227c = aIStoryTtsBean.getDuration();
                arrayList2.add(bVar);
            }
        } else {
            arrayList = null;
        }
        List<Qw0.a> videoMaterial = aIStoryBean.getVideoMaterial();
        if (((videoMaterial != null && !videoMaterial.isEmpty()) || aIStoryBean.getBackupMaterial() != null) && arrayList != null && !arrayList.isEmpty()) {
            List<Qw0.a> materials = aIStoryBean.getMaterials();
            if ((materials == null || materials.isEmpty()) && aIStoryBean.getBackupMaterial() != null) {
                List<Qw0.a> materials2 = aIStoryBean.getMaterials();
                List<Qw0.a> listEmptyList = materials2;
                if (materials2 == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                aIStoryBean.setMaterials(CollectionsKt.plus(listEmptyList, aIStoryBean.getBackupMaterial()));
            }
            List<Qw0.a> materials3 = aIStoryBean.getMaterials();
            if (materials3 != null) {
                List<Qw0.a> list3 = materials3;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : list3) {
                    Qw0.a aVar5 = (Qw0.a) obj;
                    if (aVar5.isImage() && (keyword = aVar5.getKeyword()) != null && keyword.length() != 0) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (true) {
                    objEmptyList = arrayList4;
                    if (!it2.hasNext()) {
                        break;
                    }
                    String keyword2 = ((Qw0.a) it2.next()).getKeyword();
                    if (keyword2 != null) {
                        arrayList4.add(keyword2);
                    }
                }
            } else {
                objEmptyList = CollectionsKt.emptyList();
            }
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((Qw0.b) it3.next()).f20226b);
            }
            ArrayList arrayList6 = new ArrayList();
            List<Qw0.a> videoMaterial2 = aIStoryBean.getVideoMaterial();
            if (videoMaterial2 != null) {
                for (Qw0.a aVar6 : videoMaterial2) {
                    String keyword3 = aVar6.getKeyword();
                    if (keyword3 != null && keyword3.length() != 0) {
                        String keyword4 = aVar6.getKeyword();
                        if (objEmptyList != null) {
                            Iterable iterable = (Iterable) objEmptyList;
                            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                Iterator it4 = iterable.iterator();
                                while (it4.hasNext()) {
                                    if (Intrinsics.areEqual((String) it4.next(), keyword4)) {
                                        break;
                                    }
                                }
                            }
                        }
                        String keyword5 = aVar6.getKeyword();
                        if (!arrayList5.isEmpty()) {
                            Iterator it5 = arrayList5.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    break;
                                }
                                if (StringsKt.n((String) it5.next(), keyword5)) {
                                    arrayList6.add(aVar6.m636clone());
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (!arrayList6.isEmpty()) {
                List<Qw0.a> materials4 = aIStoryBean.getMaterials();
                List<Qw0.a> listEmptyList2 = materials4;
                if (materials4 == null) {
                    listEmptyList2 = CollectionsKt.emptyList();
                }
                aIStoryBean.setMaterials(CollectionsKt.plus(listEmptyList2, arrayList6));
            }
        }
        List<Qw0.a> materials5 = aIStoryBean.getMaterials();
        if (materials5 != null) {
            for (Qw0.a aVar7 : materials5) {
                String keyword6 = aVar7.getKeyword();
                String str2 = keyword6;
                if (keyword6 == null) {
                    str2 = "";
                }
                StringTokenizer stringTokenizer = new StringTokenizer(str2, ",，、");
                while (true) {
                    if (stringTokenizer.hasMoreElements()) {
                        Object objNextElement = stringTokenizer.nextElement();
                        String str3 = objNextElement instanceof String ? (String) objNextElement : null;
                        String str4 = str3;
                        if (str3 == null) {
                            str4 = "";
                        }
                        if (str4.length() > 0) {
                            aVar7.setFilterKeyword(str4);
                            break;
                        }
                    }
                }
            }
        }
        List<Qw0.a> materials6 = aIStoryBean.getMaterials();
        List<Qw0.a> listEmptyList3 = materials6;
        if (materials6 == null) {
            listEmptyList3 = CollectionsKt.emptyList();
        }
        List<Qw0.b> listEmptyList4 = arrayList;
        if (arrayList == null) {
            listEmptyList4 = CollectionsKt.emptyList();
        }
        ArrayList<String> arrayList7 = new ArrayList();
        Iterator<T> it6 = listEmptyList3.iterator();
        while (it6.hasNext()) {
            String filterKeyword2 = ((Qw0.a) it6.next()).getFilterKeyword();
            if (filterKeyword2 != null) {
                arrayList7.add(filterKeyword2);
            }
        }
        for (Qw0.b bVar2 : listEmptyList4) {
            String str5 = bVar2.f20226b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str6 : arrayList7) {
                int iA = StringsKt.A(str5, str6, 0, false, 6);
                if (iA >= 0 && iA < ((Number) linkedHashMap.getOrDefault(str6, Integer.MAX_VALUE)).intValue()) {
                    linkedHashMap.put(str6, Integer.valueOf(iA));
                }
            }
            SortedMap sortedMap = MapsKt.toSortedMap(linkedHashMap, new j(linkedHashMap));
            ArrayList arrayList8 = new ArrayList(sortedMap.size());
            Iterator it7 = sortedMap.entrySet().iterator();
            while (it7.hasNext()) {
                arrayList8.add((String) ((Map.Entry) it7.next()).getKey());
            }
            bVar2.f20225a = arrayList8;
        }
        long j11 = 0;
        for (Qw0.b bVar3 : listEmptyList4) {
            bVar3.f20228d = j11;
            j11 += bVar3.f20227c;
            bVar3.f20229e = j11;
        }
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = false;
        for (Qw0.a aVar8 : listEmptyList3) {
            if (aVar8.isVideoMaterial()) {
                z8 = true;
            } else if (aVar8.isImage()) {
                z7 = false;
            } else {
                z6 = false;
            }
        }
        int i8 = a.f105763a[(z6 ? AIStoryMatchPolicy.Image : (!z7 || z8) ? AIStoryMatchPolicy.Mix : AIStoryMatchPolicy.Video).ordinal()];
        if (i8 == 1) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            List<Qw0.a> list4 = listEmptyList3;
            ArrayList arrayList9 = new ArrayList();
            for (Object obj2 : list4) {
                if (!((Qw0.a) obj2).isVideoMaterial()) {
                    arrayList9.add(obj2);
                }
            }
            List<Qw0.a> mutableList = CollectionsKt.toMutableList(arrayList9);
            ArrayList arrayList10 = new ArrayList();
            for (Qw0.a aVar9 : listEmptyList3) {
                String filterKeyword3 = aVar9.getFilterKeyword();
                if (filterKeyword3 != null && filterKeyword3.length() != 0) {
                    List list5 = (List) linkedHashMap2.get(aVar9.getFilterKeyword());
                    if (list5 == null) {
                        linkedHashMap2.put(aVar9.getFilterKeyword(), CollectionsKt.mutableListOf(new Qw0.a[]{aVar9}));
                    } else {
                        list5.add(aVar9);
                    }
                } else if (!aVar9.isVideoMaterial()) {
                    arrayList10.add(aVar9);
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Qw0.b bVar4 : listEmptyList4) {
                List<String> list6 = bVar4.f20225a;
                if (list6 != null && !list6.isEmpty()) {
                    Iterator it8 = ((ArrayList) bVar4.f20225a).iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            List list7 = (List) linkedHashMap2.get((String) it8.next());
                            if (list7 != null) {
                                Iterator it9 = list7.iterator();
                                while (true) {
                                    if (!it9.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it9.next();
                                    if (!((Qw0.a) next2).getMatched()) {
                                        break;
                                    }
                                }
                                aVar2 = (Qw0.a) next2;
                            } else {
                                aVar2 = null;
                            }
                            if (aVar2 != null) {
                                aVar2.setMatched(true);
                                bVar4.f20230f = true;
                                bVar4.f20231g = aVar2;
                                linkedHashMap3.put(bVar4, aVar2);
                                mutableList.remove(aVar2);
                                break;
                            }
                        } else if (!mutableList.isEmpty()) {
                            Qw0.a aVar10 = (Qw0.a) CollectionsKt.first(mutableList);
                            aVar10.setMatched(true);
                            bVar4.f20230f = true;
                            bVar4.f20231g = aVar10;
                            linkedHashMap3.put(bVar4, aVar10);
                            mutableList.remove(aVar10);
                        }
                    }
                }
            }
            ArrayList arrayList11 = new ArrayList();
            for (Object obj3 : list4) {
                if (!((Qw0.a) obj3).isVideoMaterial()) {
                    arrayList11.add(obj3);
                }
            }
            if (!arrayList11.isEmpty()) {
                int size = listEmptyList4.size();
                for (int i9 = 0; i9 < size; i9++) {
                    Qw0.b bVar5 = (Qw0.b) listEmptyList4.get(i9);
                    if (!bVar5.f20230f) {
                        if (mutableList.isEmpty()) {
                            int i10 = i9 - 1;
                            Qw0.a aVar11 = null;
                            for (int i11 = 0; aVar11 == null && i11 < listEmptyList4.size() + 1; i11++) {
                                int size2 = i10;
                                if (i10 < 0) {
                                    size2 = listEmptyList4.size() - 1;
                                }
                                Qw0.b bVar6 = (Qw0.b) listEmptyList4.get(size2);
                                if (bVar6.f20230f) {
                                    aVar11 = bVar6.f20231g;
                                    i7 = size2;
                                } else {
                                    i7 = size2 - 1;
                                }
                                i10 = i7;
                            }
                            if (aVar11 != null) {
                                int iIndexOf = arrayList11.indexOf(aVar11) + 1;
                                int i12 = iIndexOf;
                                if (iIndexOf >= arrayList11.size()) {
                                    i12 = 0;
                                }
                                Qw0.a aVarM636clone = ((Qw0.a) arrayList11.get(i12)).m636clone();
                                aVarM636clone.setMatched(true);
                                bVar5.f20231g = aVarM636clone;
                                bVar5.f20230f = true;
                                linkedHashMap3.put(bVar5, aVarM636clone);
                            }
                        } else if (arrayList10.isEmpty()) {
                            Qw0.a aVar12 = (Qw0.a) CollectionsKt.first(mutableList);
                            aVar12.setMatched(true);
                            bVar5.f20230f = true;
                            linkedHashMap3.put(bVar5, aVar12);
                            bVar5.f20231g = aVar12;
                            mutableList.remove(aVar12);
                        } else {
                            Qw0.a aVar13 = (Qw0.a) CollectionsKt.first(arrayList10);
                            aVar13.setMatched(true);
                            bVar5.f20230f = true;
                            linkedHashMap3.put(bVar5, aVar13);
                            bVar5.f20231g = aVar13;
                            mutableList.remove(aVar13);
                            arrayList10.remove(aVar13);
                        }
                    }
                }
            }
            ArrayList arrayList12 = new ArrayList();
            List list8 = mutableList;
            if (list8.isEmpty()) {
                List<Qw0.b> list9 = listEmptyList4;
                for (Qw0.b bVar7 : list9) {
                    if (linkedHashMap3.get(bVar7) == null) {
                        List<String> list10 = bVar7.f20225a;
                        List list11 = (List) linkedHashMap2.get(list10 != null ? (String) CollectionsKt.firstOrNull(list10) : null);
                        if (list11 != null) {
                            Iterator it10 = list11.iterator();
                            while (true) {
                                if (!it10.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it10.next();
                                if (!((Qw0.a) next).getMatched()) {
                                    break;
                                }
                            }
                            Qw0.a aVar14 = (Qw0.a) next;
                            if (aVar14 != null) {
                                aVar14.m636clone();
                                aVar14.setMatched(true);
                                linkedHashMap3.put(bVar7, aVar14);
                                bVar7.f20231g = aVar14;
                                bVar7.f20230f = true;
                            }
                        }
                    }
                }
                long j12 = 0;
                for (Qw0.b bVar8 : list9) {
                    Qw0.a aVar15 = (Qw0.a) linkedHashMap3.get(bVar8);
                    if (aVar15 != null) {
                        Qw0.a aVarM636clone2 = aVar15.m636clone();
                        Long lValueOf3 = (!aVarM636clone2.isVideoMaterial() || !aVarM636clone2.isVideo() || (filePath = aVarM636clone2.getFilePath()) == null || filePath.length() == 0) ? null : Long.valueOf(aVarM636clone2.getDuration() + bVar8.f20228d + j12);
                        aVarM636clone2.setInPoint(bVar8.f20228d + j12);
                        aVarM636clone2.setOutPoint(lValueOf3 != null ? lValueOf3.longValue() : bVar8.f20229e + j12);
                        aVarM636clone2.setTrimIn(0L);
                        aVarM636clone2.setTrimOut(aVarM636clone2.getOutPoint() - aVarM636clone2.getInPoint());
                        long duration = j12;
                        if (aVarM636clone2.isVideoMaterial()) {
                            duration = j12;
                            if (aVarM636clone2.isVideo()) {
                                String filePath5 = aVarM636clone2.getFilePath();
                                duration = j12;
                                if (filePath5 != null) {
                                    duration = filePath5.length() == 0 ? j12 : j12 + (aVarM636clone2.getDuration() - bVar8.f20227c);
                                }
                            }
                        }
                        arrayList12.add(aVarM636clone2);
                        j12 = duration;
                    }
                }
            } else {
                long j13 = 0;
                for (Qw0.b bVar9 : listEmptyList4) {
                    Qw0.a aVar16 = (Qw0.a) linkedHashMap3.get(bVar9);
                    if (aVar16 != null) {
                        Long lValueOf4 = (!aVar16.isVideoMaterial() || !aVar16.isVideo() || (filePath2 = aVar16.getFilePath()) == null || filePath2.length() == 0) ? null : Long.valueOf(aVar16.getDuration() + bVar9.f20228d + j13);
                        aVar16.setInPoint(bVar9.f20228d + j13);
                        aVar16.setOutPoint(lValueOf4 != null ? lValueOf4.longValue() : bVar9.f20229e + j13);
                        aVar16.setTrimIn(0L);
                        aVar16.setTrimOut(aVar16.getOutPoint() - aVar16.getInPoint());
                        long duration2 = j13;
                        if (aVar16.isVideoMaterial()) {
                            duration2 = j13;
                            if (aVar16.isVideo()) {
                                String filePath6 = aVar16.getFilePath();
                                duration2 = j13;
                                if (filePath6 != null) {
                                    duration2 = filePath6.length() == 0 ? j13 : j13 + (aVar16.getDuration() - bVar9.f20227c);
                                }
                            }
                        }
                        arrayList12.add(aVar16);
                        j13 = duration2;
                    }
                }
                long outPoint = ((Qw0.a) CollectionsKt.last(arrayList12)).getOutPoint();
                for (Qw0.a aVar17 : mutableList) {
                    aVar17.setInPoint(outPoint);
                    aVar17.setOutPoint(aVar17.getInPoint() + ((long) LiveConstants.VIDEO_BITRATE_3000));
                    aVar17.setTrimIn(0L);
                    aVar17.setTrimOut(aVar17.getOutPoint() - aVar17.getInPoint());
                    outPoint = aVar17.getOutPoint();
                }
                arrayList12.addAll(list8);
            }
            list = arrayList12;
        } else if (i8 != 2) {
            ArrayList<Qw0.a> arrayList13 = new ArrayList();
            ArrayList<Qw0.a> arrayList14 = new ArrayList();
            ArrayList<Qw0.a> arrayList15 = new ArrayList();
            for (Qw0.a aVar18 : listEmptyList3) {
                if (aVar18.isVideoMaterial()) {
                    arrayList14.add(aVar18);
                } else if (aVar18.isVideo()) {
                    arrayList15.add(aVar18);
                } else {
                    arrayList14.add(aVar18);
                }
            }
            Iterator it11 = listEmptyList4.iterator();
            long j14 = 0;
            while (true) {
                j9 = j14;
                if (!it11.hasNext()) {
                    break;
                }
                Qw0.b bVar10 = (Qw0.b) it11.next();
                List<String> list12 = bVar10.f20225a;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (int size3 = arrayList14.size() - 1; -1 < size3; size3--) {
                    Qw0.a aVar19 = (Qw0.a) arrayList14.get(size3);
                    if (!aVar19.getMatched() && (filterKeyword = aVar19.getFilterKeyword()) != null && filterKeyword.length() != 0) {
                        linkedHashMap4.put(aVar19.getFilterKeyword(), aVar19);
                    }
                }
                if (list12 != null) {
                    for (String str7 : list12) {
                        if (linkedHashMap4.containsKey(str7) && (aVar4 = (Qw0.a) linkedHashMap4.get(str7)) != null && !aVar4.getMatched()) {
                            aVar3 = (Qw0.a) linkedHashMap4.get(str7);
                            break;
                        }
                    }
                    aVar3 = null;
                } else {
                    aVar3 = null;
                }
                if (aVar3 != null && !aVar3.getMatched()) {
                    if (!aVar3.isVideoMaterial() || !aVar3.isVideo() || (filePath4 = aVar3.getFilePath()) == null || filePath4.length() == 0) {
                        lValueOf = null;
                        lValueOf2 = null;
                    } else {
                        lValueOf2 = Long.valueOf(aVar3.getDuration());
                        lValueOf = Long.valueOf(aVar3.getDuration() + bVar10.f20228d);
                    }
                    aVar3.setInPoint(bVar10.f20228d);
                    aVar3.setOutPoint(lValueOf != null ? lValueOf.longValue() : bVar10.f20229e);
                    aVar3.setDuration(lValueOf2 != null ? lValueOf2.longValue() : bVar10.f20227c);
                    aVar3.setTrimOut(aVar3.getOutPoint() - aVar3.getInPoint());
                    if (aVar3.isVideoMaterial() && aVar3.isVideo() && (filePath3 = aVar3.getFilePath()) != null && filePath3.length() != 0) {
                        aVar3.getDuration();
                    }
                    aVar3.setMatched(true);
                    bVar10.f20230f = true;
                    arrayList13.add(aVar3);
                }
                j14 = j9 + bVar10.f20227c;
            }
            ArrayList arrayList16 = new ArrayList();
            for (Qw0.a aVar20 : arrayList14) {
                if (!aVar20.getMatched() && !aVar20.isVideoMaterial()) {
                    arrayList16.add(aVar20);
                }
            }
            for (Qw0.b bVar11 : listEmptyList4) {
                if (!bVar11.f20230f) {
                    Iterator it12 = arrayList16.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            Qw0.a aVar21 = (Qw0.a) it12.next();
                            if (!aVar21.getMatched()) {
                                aVar21.setInPoint(bVar11.f20228d);
                                aVar21.setOutPoint(bVar11.f20229e);
                                aVar21.setDuration(bVar11.f20227c);
                                aVar21.setTrimIn(0L);
                                aVar21.setTrimOut(aVar21.getOutPoint() - aVar21.getInPoint());
                                aVar21.setMatched(true);
                                bVar11.f20230f = true;
                                arrayList13.add(aVar21);
                                break;
                            }
                        }
                    }
                }
            }
            if (arrayList13.size() > 1) {
                CollectionsKt.sortWith(arrayList13, (Comparator) new Object());
            }
            List list13 = CollectionsKt.toList(arrayList13);
            for (Qw0.a aVar22 : arrayList15) {
                int size4 = list13.size();
                boolean z9 = true;
                long j15 = 0;
                int i13 = 0;
                while (true) {
                    if (i13 >= size4) {
                        break;
                    }
                    Qw0.a aVar23 = (Qw0.a) list13.get(i13);
                    Qw0.a aVar24 = i13 > 0 ? (Qw0.a) list13.get(i13 - 1) : null;
                    if (aVar23.getInPoint() > (aVar24 != null ? aVar24.getOutPoint() : 0L)) {
                        long inPoint = aVar23.getInPoint() - (aVar24 != null ? aVar24.getOutPoint() : 0L);
                        if (inPoint >= TransitionInfo.DEFAULT_DURATION) {
                            Qw0.a aVarM636clone3 = aVar22.m636clone();
                            if (aVarM636clone3.getDuration() - j15 < TransitionInfo.DEFAULT_DURATION) {
                                z9 = false;
                                break;
                            }
                            long duration3 = inPoint;
                            if (aVarM636clone3.getDuration() - j15 < inPoint) {
                                duration3 = aVarM636clone3.getDuration() - j15;
                            }
                            aVarM636clone3.setInPoint(aVar24 != null ? aVar24.getOutPoint() : 0L);
                            aVarM636clone3.setOutPoint(aVarM636clone3.getInPoint() + duration3);
                            aVarM636clone3.setTrimIn(j15);
                            j15 += duration3;
                            aVarM636clone3.setTrimOut(j15);
                            arrayList13.add(aVarM636clone3);
                        } else {
                            Qw0.a aVar25 = new Qw0.a();
                            aVar25.setInPoint(aVar24 != null ? aVar24.getOutPoint() : 0L);
                            aVar25.setOutPoint(aVar25.getInPoint() + inPoint);
                            aVar25.setDuration(inPoint);
                            aVar25.setTrimIn(0L);
                            aVar25.setTrimOut(aVar25.getOutPoint() - aVar25.getInPoint());
                            aVar25.setFilePath(Uw0.b.a());
                            arrayList13.add(aVar25);
                        }
                        z9 = false;
                    }
                    i13++;
                }
                if (arrayList13.size() > 1) {
                    CollectionsKt.sortWith(arrayList13, (Comparator) new Object());
                }
                list13 = CollectionsKt.toList(arrayList13);
                if (z9) {
                    Qw0.a aVar26 = (Qw0.a) CollectionsKt.lastOrNull(arrayList13);
                    aVar22.setInPoint(aVar26 != null ? aVar26.getOutPoint() : 0L);
                    aVar22.setOutPoint(aVar22.getDuration() + aVar22.getInPoint());
                    aVar22.setTrimIn(0L);
                    aVar22.setTrimOut(aVar22.getOutPoint() - aVar22.getInPoint());
                    arrayList13.add(aVar22);
                } else if (aVar22.getDuration() - j15 >= TransitionInfo.DEFAULT_DURATION) {
                    long duration4 = aVar22.getDuration() - j15;
                    Qw0.a aVarM636clone4 = aVar22.m636clone();
                    Qw0.a aVar27 = (Qw0.a) CollectionsKt.lastOrNull(arrayList13);
                    aVarM636clone4.setInPoint(aVar27 != null ? aVar27.getOutPoint() : 0L);
                    aVarM636clone4.setOutPoint(aVarM636clone4.getInPoint() + duration4);
                    aVarM636clone4.setTrimIn(j15);
                    aVarM636clone4.setTrimOut(j15 + duration4);
                    arrayList13.add(aVarM636clone4);
                }
            }
            if (arrayList13.size() > 1) {
                CollectionsKt.sortWith(arrayList13, new Sw0.c(0));
            }
            Iterator it13 = arrayList13.iterator();
            long outPoint2 = 0;
            while (true) {
                j10 = outPoint2;
                if (!it13.hasNext()) {
                    break;
                }
                Qw0.a aVar28 = (Qw0.a) it13.next();
                outPoint2 = j10 + (aVar28.getOutPoint() - aVar28.getInPoint());
            }
            long j16 = j9 - j10;
            if (1 > j16 || j16 >= TransitionInfo.DEFAULT_DURATION) {
                long outPoint3 = 0;
                for (Qw0.a aVar29 : arrayList13) {
                    if (aVar29.isVideo()) {
                        outPoint3 = aVar29.getOutPoint();
                    }
                }
                int i14 = 0;
                long j17 = j16;
                while (j17 > 0 && !arrayList15.isEmpty()) {
                    int i15 = i14;
                    if (i14 > arrayList15.size() - 1) {
                        i15 = 0;
                    }
                    Qw0.a aVar30 = (Qw0.a) arrayList15.get(i15);
                    long duration5 = aVar30.getDuration();
                    if (duration5 == 0) {
                        break;
                    }
                    Qw0.a aVarM636clone5 = aVar30.m636clone();
                    if (duration5 <= j17) {
                        aVarM636clone5.setInPoint(outPoint3);
                        aVarM636clone5.setOutPoint(outPoint3 + duration5);
                        aVarM636clone5.setTrimIn(0L);
                        aVarM636clone5.setTrimOut(aVarM636clone5.getOutPoint() - aVarM636clone5.getInPoint());
                        outPoint3 = aVarM636clone5.getOutPoint();
                    } else {
                        if (j17 < TransitionInfo.DEFAULT_DURATION) {
                            aVarM636clone5 = new Qw0.a();
                            aVarM636clone5.setFilePath(Uw0.b.a());
                        }
                        aVarM636clone5.setInPoint(outPoint3);
                        aVarM636clone5.setTrimOut(j17);
                        aVarM636clone5.setOutPoint(outPoint3 + j17);
                        duration5 = j17;
                    }
                    arrayList13.add(aVarM636clone5);
                    j17 -= duration5;
                    i14 = i15 + 1;
                }
            } else {
                Qw0.a aVar31 = new Qw0.a();
                aVar31.setInPoint(j10);
                aVar31.setOutPoint(aVar31.getInPoint() + j16);
                aVar31.setTrimIn(0L);
                aVar31.setTrimOut(aVar31.getOutPoint() - aVar31.getInPoint());
                aVar31.setDuration(j16);
                aVar31.setFilePath(Uw0.b.a());
                arrayList13.add(aVar31);
            }
            list = arrayList13;
            if (arrayList13.size() > 1) {
                CollectionsKt.sortWith(arrayList13, (Comparator) new Object());
                list = arrayList13;
            }
        } else {
            if (!listEmptyList3.isEmpty()) {
                Iterator<T> it14 = listEmptyList3.iterator();
                long outPoint4 = 0;
                while (true) {
                    long j18 = outPoint4;
                    if (!it14.hasNext()) {
                        break;
                    }
                    Qw0.a aVar32 = (Qw0.a) it14.next();
                    aVar32.setInPoint(j18);
                    aVar32.setOutPoint(aVar32.getDuration() + aVar32.getInPoint());
                    aVar32.setTrimOut(aVar32.getOutPoint() - aVar32.getInPoint());
                    outPoint4 = aVar32.getOutPoint() + 1;
                }
                Iterator<Qw0.a> it15 = listEmptyList3.iterator();
                long duration6 = 0;
                while (true) {
                    j7 = duration6;
                    if (!it15.hasNext()) {
                        break;
                    }
                    duration6 = j7 + it15.next().getDuration();
                }
                Iterator it16 = listEmptyList4.iterator();
                long j19 = 0;
                while (true) {
                    j8 = j19;
                    if (!it16.hasNext()) {
                        break;
                    }
                    j19 = j8 + ((Qw0.b) it16.next()).f20227c;
                }
                if (j7 < j8) {
                    List<Qw0.a> mutableList2 = CollectionsKt.toMutableList(listEmptyList3);
                    long j20 = j8 - j7;
                    long outPoint5 = ((Qw0.a) CollectionsKt.last(listEmptyList3)).getOutPoint();
                    int i16 = 0;
                    while (true) {
                        int i17 = i16;
                        if (j20 <= 0) {
                            break;
                        }
                        int i18 = i17;
                        if (i17 > listEmptyList3.size() - 1) {
                            i18 = 0;
                        }
                        Qw0.a aVar33 = listEmptyList3.get(i18);
                        long outPoint6 = aVar33.getOutPoint() - aVar33.getInPoint();
                        Qw0.a aVar34 = new Qw0.a();
                        aVar34.setFilePath(aVar33.getFilePath());
                        aVar34.setInPoint(outPoint5);
                        if (j20 < TransitionInfo.DEFAULT_DURATION) {
                            aVar34.setFilePath(Uw0.b.a());
                            aVar34.setOutPoint(outPoint5 + j20);
                            aVar34.setTrimOut(j20);
                        } else if (outPoint6 <= j20) {
                            aVar34.setOutPoint(outPoint5 + outPoint6);
                            aVar34.setTrimOut(outPoint6);
                            outPoint5 = aVar34.getOutPoint();
                        } else {
                            aVar34.setOutPoint(outPoint5 + j20);
                            aVar34.setTrimOut(j20);
                        }
                        mutableList2.add(aVar34);
                        j20 -= outPoint6;
                        i16 = i18 + 1;
                    }
                    listEmptyList3 = mutableList2;
                }
            }
            list = listEmptyList3;
        }
        aIStoryBean.setMatchedMaterials(list);
        aVar.invoke(Result.box-impl(Result.constructor-impl(aIStoryBean)));
        return Unit.INSTANCE;
    }
}
