package com.bilibili.topix.center;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bE0.C4943c;
import com.bilibili.app.comm.list.common.data.DataStatus;
import com.bilibili.topix.LoadListStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/E.class */
@StabilityInferred(parameters = 0)
public final class E extends ViewModel {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final KProperty<Object>[] f112360k = {new MutablePropertyReference1Impl(E.class, "hasBubbleShown", "getHasBubbleShown()Z", 0)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f112363c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f112361a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f112362b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Ih.d<List<n>>> f112364d = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<EntranceButton> f112365e = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f112366f = new MutableLiveData<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<LoadListStatus> f112367g = new MutableLiveData<>();

    @NotNull
    public final MutableSharedFlow<Boolean> h = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<C4943c> f112368i = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.comm.list.common.cache.i f112369j = com.bilibili.app.comm.list.common.cache.h.a(6, "topic_center_bubble", false);

    public static final List I0(E e7, TopixCenterData topixCenterData) {
        List<TopicItem> topicItems;
        n nVar;
        List list;
        Object obj;
        HotTopics hotTopics;
        List<TopicItem> hotItems;
        n nVar2;
        List list2;
        Object obj2;
        IpTopics ipTopics;
        List<IpTopicItem> items;
        n nVar3;
        List list3;
        Object obj3;
        e7.getClass();
        ArrayList arrayList = new ArrayList();
        MutableLiveData<Ih.d<List<n>>> mutableLiveData = e7.f112364d;
        if (topixCenterData != null && (ipTopics = topixCenterData.getIpTopics()) != null && (items = ipTopics.getItems()) != null) {
            List<IpTopicItem> list4 = items;
            if (!list4.isEmpty()) {
                Ih.d<List<n>> value = mutableLiveData.getValue();
                if (value == null || (list3 = (List) value.a) == null) {
                    nVar3 = null;
                } else {
                    Iterator it = list3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        Object next = it.next();
                        n nVar4 = (n) next;
                        if (!(nVar4 instanceof Section)) {
                            nVar4 = null;
                        }
                        Section section = (Section) nVar4;
                        if ((section != null ? section.getChildType() : null) == TopixCenterItemType.TOPIC_IP) {
                            obj3 = next;
                            break;
                        }
                    }
                    nVar3 = (n) obj3;
                }
                if (nVar3 == null) {
                    arrayList.add(new Section(TopixCenterItemType.TOPIC_IP, null, 2, null));
                }
                int i7 = 0;
                for (Object obj4 : items) {
                    if (i7 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ((IpTopicItem) obj4).setPos(i7);
                    i7++;
                }
                arrayList.addAll(list4);
            }
        }
        if (topixCenterData != null) {
            FavTopics favTopics = topixCenterData.getFavTopics();
            if (favTopics != null) {
                if (favTopics.getFavItems() == null || !(!r0.isEmpty())) {
                    favTopics = null;
                }
                if (favTopics != null) {
                    arrayList.add(favTopics);
                }
            }
        }
        if (topixCenterData != null && (hotTopics = topixCenterData.getHotTopics()) != null && (hotItems = hotTopics.getHotItems()) != null) {
            List<TopicItem> list5 = hotItems;
            if (!list5.isEmpty()) {
                Ih.d<List<n>> value2 = mutableLiveData.getValue();
                if (value2 == null || (list2 = (List) value2.a) == null) {
                    nVar2 = null;
                } else {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        Object next2 = it2.next();
                        n nVar5 = (n) next2;
                        if (!(nVar5 instanceof Section)) {
                            nVar5 = null;
                        }
                        Section section2 = (Section) nVar5;
                        if ((section2 != null ? section2.getChildType() : null) == TopixCenterItemType.TOPIC_HOT) {
                            obj2 = next2;
                            break;
                        }
                    }
                    nVar2 = (n) obj2;
                }
                if (nVar2 == null) {
                    arrayList.add(new Section(TopixCenterItemType.TOPIC_HOT, null, 2, null));
                }
                int i8 = 0;
                for (Object obj5 : hotItems) {
                    if (i8 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    TopicItem topicItem = (TopicItem) obj5;
                    topicItem.setType(TopixCenterItemType.TOPIC_HOT);
                    topicItem.setPos(i8);
                    i8++;
                }
                arrayList.addAll(list5);
            }
        }
        if (topixCenterData != null && (topicItems = topixCenterData.getTopicItems()) != null) {
            List<TopicItem> list6 = topicItems;
            if (!list6.isEmpty()) {
                Ih.d<List<n>> value3 = mutableLiveData.getValue();
                if (value3 == null || (list = (List) value3.a) == null) {
                    nVar = null;
                } else {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        Object next3 = it3.next();
                        n nVar6 = (n) next3;
                        if (!(nVar6 instanceof Section)) {
                            nVar6 = null;
                        }
                        Section section3 = (Section) nVar6;
                        if ((section3 != null ? section3.getChildType() : null) == TopixCenterItemType.TOPIC_COMMON) {
                            obj = next3;
                            break;
                        }
                    }
                    nVar = (n) obj;
                }
                if (nVar == null) {
                    arrayList.add(new Section(TopixCenterItemType.TOPIC_COMMON, null, 2, null));
                }
                int i9 = 0;
                for (Object obj6 : topicItems) {
                    if (i9 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ((TopicItem) obj6).setPos(i9);
                    i9++;
                }
                arrayList.addAll(list6);
            }
        }
        return arrayList;
    }

    public final void J0(boolean z6) {
        Ih.b bVar;
        if (z6 || this.f112362b) {
            Ih.d<List<n>> value = this.f112364d.getValue();
            if (((value == null || (bVar = value.b) == null) ? null : bVar.e) == DataStatus.LOADING) {
                return;
            }
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new TopixCenterViewModel$load$1(this, z6, null), 3, (Object) null);
        }
    }
}
